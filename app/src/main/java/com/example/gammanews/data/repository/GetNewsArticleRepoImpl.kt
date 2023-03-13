package com.example.gammanews.data.repository

import com.example.gammanews.data.network.ApiService
import com.example.gammanews.domain.model.Article
import com.example.gammanews.domain.repository.GetNewsArticleRepo
import com.example.gammanews.mappers.toDomain
import com.example.gammanews.utils.SafeApiRequest
import javax.inject.Inject

class GetNewsArticleRepoImpl @Inject constructor(private val apiService: ApiService) :GetNewsArticleRepo, SafeApiRequest(){
    override suspend fun getNewsArticle(): List<Article> {

        val response = safeApiRequest { apiService.getNewsArticles() }
        return response?.articles?.toDomain()!!

    }

}