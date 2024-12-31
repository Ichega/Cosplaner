package ru.yatsevyukcompany.testrecycle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import ru.yatsevyukcompany.testrecycle.Adapter.OngoingAdapter
import ru.yatsevyukcompany.testrecycle.ViewModel.MainViewModel
import ru.yatsevyukcompany.testrecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
             setContentView(binding.root)

val nextScr = findViewById<FloatingActionButton>(R.id.addBtn)
        nextScr.setOnClickListener{
            val intent = Intent(this, PersonCardActivity::class.java)
            startActivity(intent)
        }


        binding.apply {
            val ongoingAdapter by lazy{ OngoingAdapter(mainViewModel.loadData())}

            viewOngoing.apply{
             adapter = ongoingAdapter
             layoutManager = GridLayoutManager(this@MainActivity, 1)
            }
        }
    }
}