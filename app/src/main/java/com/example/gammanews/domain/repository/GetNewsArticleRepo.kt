package com.example.gammanews.domain.repository

import com.example.gammanews.domain.model.Article

interface GetNewsArticleRepo {

    suspend fun getNewsArticle():List<Article>
}