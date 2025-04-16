package com.riya.postapipractice.data.repository

import com.riya.postapipractice.data.api.PostApi
import com.riya.postapipractice.data.model.Post
import com.riya.postapipractice.domain.repository.PostRepository
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor(
    private val postApi: PostApi
) : PostRepository {
    override suspend fun getPosts(): List<Post> {
        return postApi.getPosts()
    }
}