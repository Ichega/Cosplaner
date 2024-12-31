package ru.yatsevyukcompany.testrecycle.ui.craft

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

import ru.yatsevyukcompany.testrecycle.databinding.FragmentCraftBinding


class CraftFragment : Fragment() {
    private var _binding: FragmentCraftBinding?= null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       val CraftViewModel = ViewModelProvider(this).get(CraftViewModel::class.java)
        _binding = FragmentCraftBinding.inflate(inflater, container,false)
        val root: View = binding.root
             return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}