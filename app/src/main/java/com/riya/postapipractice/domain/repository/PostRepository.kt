package com.riya.postapipractice.domain.repository

import com.riya.postapipractice.data.model.Post

interface PostRepository {
    suspend fun getPosts(): List<Post>
}