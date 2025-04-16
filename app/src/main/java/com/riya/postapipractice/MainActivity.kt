package com.riya.postapipractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.riya.postapipractice.databinding.ActivityMainBinding
import com.riya.postapipractice.presentation.screens.postlist.PostAdapter
import com.riya.postapipractice.presentation.screens.postlist.PostListFragment
import com.riya.postapipractice.presentation.screens.postlist.PostViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val transaction = supportFragmentManager.beginTransaction()

        transaction.add(R.id.fragmentContainer, PostListFragment())
        transaction.commit()
    }
}