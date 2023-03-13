package com.example.gammanews.domain.di

import com.example.gammanews.data.network.ApiService
import com.example.gammanews.data.repository.GetNewsArticleRepoImpl
import com.example.gammanews.domain.repository.GetNewsArticleRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@InstallIn(SingletonComponent::class)
@Module
object DomainModule {


    @Provides
    fun provideGetNewsRepo(apiService: ApiService):GetNewsArticleRepo{
        return GetNewsArticleRepoImpl(apiService = apiService)

    }
}