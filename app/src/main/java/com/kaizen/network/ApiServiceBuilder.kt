package com.kaizen.network

import android.content.Context
import com.google.gson.GsonBuilder
import com.kaizen.network.interceptor.ApiPrefixInterceptor
import com.kaizen.network.interceptor.AuthInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiServiceBuilder {
    fun <T> buildApiService(apiService: Class<T>, context: Context): T {
        val client = OkHttpClient.Builder()
            .addInterceptor(ApiPrefixInterceptor())
            .addInterceptor(AuthInterceptor(context))
            .build()

        val gson = GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
            .setLenient()
            .create()

        val retrofit = Retrofit.Builder()
            .baseUrl("https://example.com/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build()

        return retrofit.create(apiService)
    }
}
