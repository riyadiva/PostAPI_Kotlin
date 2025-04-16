package com.riya.postapipractice.data.api

import com.riya.postapipractice.data.model.Post
import retrofit2.http.GET


interface PostApi {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}
