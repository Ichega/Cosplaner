package ru.yatsevyukcompany.testrecycle.ui.photo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ru.yatsevyukcompany.testrecycle.databinding.FragmentPhotoBinding


class PhotoFragment : Fragment() {

    private var _binding: FragmentPhotoBinding? = null


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val photoViewModel =
            ViewModelProvider(this).get(PhotoViewModel::class.java)

        _binding = FragmentPhotoBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}