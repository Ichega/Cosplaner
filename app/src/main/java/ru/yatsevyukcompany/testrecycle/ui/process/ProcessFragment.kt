package ru.yatsevyukcompany.testrecycle.ui.process

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

import ru.yatsevyukcompany.testrecycle.databinding.FragmentProcessBinding


class ProcessFragment: Fragment() {

    private var _binding: FragmentProcessBinding? = null


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val ProcessViewModel =
            ViewModelProvider(this).get(ProcessViewModel::class.java)

        _binding = FragmentProcessBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}