package ru.yatsevyukcompany.testrecycle.ViewModel

import androidx.lifecycle.ViewModel
import ru.yatsevyukcompany.testrecycle.Repository.MainRepository

class MainViewModel(val repository: MainRepository): ViewModel() {
    constructor():this(MainRepository())
    fun loadData() = repository.items
}