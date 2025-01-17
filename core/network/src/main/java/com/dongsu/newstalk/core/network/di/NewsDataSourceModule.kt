package com.dongsu.newstalk.core.network.di

import com.dongsu.newstalk.core.network.datasource.NewsDataSource
import com.dongsu.newstalk.core.network.datasource.NewsDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NewsDataSourceModule {
    @Binds
    @Singleton
    abstract fun provideNewsDataSource(
        newsDataSourceImpl: NewsDataSourceImpl
    ): NewsDataSource
}
