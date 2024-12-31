package ru.yatsevyukcompany.testrecycle.ui.money

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ru.yatsevyukcompany.testrecycle.databinding.FragmentMoneyBinding


class MoneyFragment : Fragment() {
    private var _binding: FragmentMoneyBinding?= null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val MoneyViewModel = ViewModelProvider(this).get(MoneyViewModel::class.java)

        _binding = FragmentMoneyBinding.inflate(inflater, container,false)
        val root: View = binding.root
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
