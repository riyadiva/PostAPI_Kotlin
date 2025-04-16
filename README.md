# 📮 PostAPI Practice App

A simple Android app that fetches and displays a list of posts from a REST API using **MVVM Clean Architecture**, **Hilt for Dependency Injection**, **Retrofit** for network calls, and **Kotlin Coroutines** for asynchronous data handling.

## 🧠 Tech Stack

- **Kotlin**
- **MVVM Architecture**
- **Clean Architecture Principles**
- **Hilt** for Dependency Injection
- **Retrofit** for networking
- **Kotlin Coroutines** for async programming
- **StateFlow** & **LiveData** for state management
- **RecyclerView** for list display
- **ViewBinding** for type-safe view access
- **Material Design Components**

## 🧱 Project Structure

com.riya.postapipractice ├── data # Retrofit API, Repository Implementation │ └── api │ └── repository ├── domain # Repository Interface, Model (Post) ├── di # Hilt Modules (NetworkModule, RepositoryModule) ├── presentation │ └── screens │ └── postlist # Fragment, Adapter, ViewModel ├── util # Constants and helpers

## ✨ Features

- 🔄 Fetch posts from API on fragment load
- 🔧 MVVM pattern with Clean separation of concerns
- 🧩 Hilt-powered DI for ViewModel and Repository
- ⚡ Smooth performance using Kotlin Coroutines and Flow
- ✅ Lifecycle-aware components
- 📦 Modular and testable architecture
