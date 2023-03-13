package com.example.gammanews.data.network

import com.example.gammanews.data.model.NewsDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
   // https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=459a05b0fe9643418ae85cdbfcc33456

    @GET("top_headline")
    suspend fun getNewsArticles(
        @Query("country")country:String = "us",
        @Query("category")category: String = "business",
        @Query("apiKey") apiKey:String = "459a05b0fe9643418ae85cdbfcc33456"

    ):Response<NewsDTO>

}