package com.example.android.marsphotos.network

import com.example.android.marsphotos.UsersItem
import retrofit2.Call
import retrofit2.http.GET

interface UserService {

        @GET("/users")
         fun getUsers(): Call<List<UsersItem>>

}