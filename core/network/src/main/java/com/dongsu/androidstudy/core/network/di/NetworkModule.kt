package com.dongsu.androidstudy.core.network.di

import com.dongsu.androidstudy.core.network.api.NEWS_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun providesHttpLoggingInterceptor() = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BASIC
    }

    @Singleton
    @Provides
    fun provideAuthInterceptor (

    ): Interceptor = Interceptor { chain ->
        val requestBuilder = chain.request().newBuilder()
            /*.addHeader(

            )*/
        chain.proceed(requestBuilder.build())
    }


    @Singleton
    @Provides
    fun providesAuthOkHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor,
        interceptor: Interceptor
    ): OkHttpClient =
        OkHttpClient
            .Builder()
            .addInterceptor(httpLoggingInterceptor)
            .addInterceptor(interceptor)
            .build()

    @Singleton
    @Provides
    fun provideTMapRetrofit(
        okHttpClient: OkHttpClient
    ): Retrofit =
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(NEWS_URL)
            .client(okHttpClient)
            .build()

}
