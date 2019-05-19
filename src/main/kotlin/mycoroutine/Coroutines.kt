package main.mycoroutine

import okhttp3.ResponseBody
import retrofit2.Retrofit
import retrofit2.converter.gson.*
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.Executors
import kotlin.coroutines.*

val dateFormat = SimpleDateFormat("HH:mm:ss:SSS")

val now = {
    dateFormat.format(Date(System.currentTimeMillis()))
}

fun log(msg: String) = println("${now()} [${Thread.currentThread().name}] $msg")

interface Service{
    @retrofit2.http.GET
    fun getLogo(@retrofit2.http.Url fileUrl: String): retrofit2.Call<ResponseBody>
}

object HttpService{
    val service by lazy{
        val retrofit = Retrofit.Builder()
            .baseUrl("http://www.imooc.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(Service::class.java)
    }
}

data class HttpException(val code: Int): Exception()

class BaseContinuation:Continuation<Unit>{
    override val context: CoroutineContext
        get() = EmptyCoroutineContext

    override fun resumeWith(result: Result<Unit>) {

    }
}

fun myStartCoroutine(block:suspend ()->Unit){
    block.startCoroutine(BaseContinuation())
}

suspend fun myloadpicturesfun(url:String) = suspendCoroutine<ByteArray> {
    continuation ->
    log("异步之前")
    AsyncTask{
        try {
            log("耗时操作，下载图片")
            val responseBody = HttpService.service.getLogo(url).execute()
            if (responseBody.isSuccessful) {
                responseBody.body()?.byteStream()?.readBytes()?.let(continuation::resume)
            } else {
                continuation.resumeWithException(HttpException(responseBody.code()))
            }
        }catch (e:Exception){
            continuation.resumeWithException(e)
        }
    }.excute()
}

private val pool by lazy {
    Executors.newCachedThreadPool()
}

class AsyncTask(val block:()->Unit){
    fun excute() = pool.execute(block)
}
