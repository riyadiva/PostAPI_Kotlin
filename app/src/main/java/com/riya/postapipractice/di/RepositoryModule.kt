package com.riya.postapipractice.di

import com.riya.postapipractice.data.repository.PostRepositoryImpl
import com.riya.postapipractice.domain.repository.PostRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun providePostRepository(
        postRepositoryImpl: PostRepositoryImpl
    ): PostRepository = postRepositoryImpl
}