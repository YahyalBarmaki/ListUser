import com.example.android.marsphotos.UsersItem
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

 const val BASE_URL =
    "https://api.github.com"
 val retrofit = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()
interface MarsApiService {
    @GET("/users")
    suspend fun getPhotos(): Call<List<UsersItem>>
}
object MarsApi{
    val retrofitService : MarsApiService by lazy { retrofit.create(MarsApiService::class.java) }
}
