package com.example.gammanews.presentation

import com.example.gammanews.domain.model.Article

data class HomeStateHolder(
    val isLoading:Boolean = false,
    val data : List<Article>? = null,
    val error : String = ""

)
