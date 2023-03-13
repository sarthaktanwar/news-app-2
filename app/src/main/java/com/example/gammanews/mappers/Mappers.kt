package com.example.gammanews.mappers

import com.example.gammanews.data.model.ArticleDTO
import com.example.gammanews.domain.model.Article

fun List<ArticleDTO>.toDomain():List<Article>{
    return map{
        Article(
            content = it.content?:"" ,
            description = it.description?:"",
            title = it.title?:"",
            urlToImage = it.title?:""
        )
    }
}