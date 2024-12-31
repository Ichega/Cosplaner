package ru.yatsevyukcompany.testrecycle


import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity

import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity

import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

import ru.yatsevyukcompany.testrecycle.databinding.ActivityPersonCardBinding


class PersonCardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPersonCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPersonCardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_money, R.id.navigation_tasks, R.id.navigation_photo, R.id.navigation_process
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        binding.fab.setOnClickListener { showBottomDialog() }
    }



    private fun showBottomDialog() {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.bottomsheetlayout)

        val videoLayout = dialog.findViewById<LinearLayout>(R.id.layoutVideo)
        val shortsLayout = dialog.findViewById<LinearLayout>(R.id.layoutShorts)
        val liveLayout = dialog.findViewById<LinearLayout>(R.id.layoutLive)
        val cancelButton = dialog.findViewById<ImageView>(R.id.cancelButton)

        videoLayout?.setOnClickListener {
            dialog.dismiss()
            Toast.makeText(this, "Upload a Video is clicked", Toast.LENGTH_SHORT).show()
        }

        shortsLayout?.setOnClickListener {
            dialog.dismiss()
            Toast.makeText(this, "Create a short is Clicked", Toast.LENGTH_SHORT).show()
        }

        liveLayout?.setOnClickListener {
            dialog.dismiss()
            Toast.makeText(this, "Go live is Clicked", Toast.LENGTH_SHORT).show()
        }

        cancelButton?.setOnClickListener { dialog.dismiss() }

        dialog.show()
        dialog.window?.apply {
            setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            attributes.windowAnimations = R.style.DialogAnimation
            setGravity(Gravity.BOTTOM)
        }
    }
}
