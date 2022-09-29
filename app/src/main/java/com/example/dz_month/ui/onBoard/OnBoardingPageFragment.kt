package com.example.dz_month.ui.onBoard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.example.dz_month.databinding.FragmentOnBoardingPageBinding
import com.example.dz_month.OnBoard
import com.example.dz_month.R
import com.example.dz_month.ui.loadImage


class OnBoardingPageFragment : Fragment() {

private lateinit var binding: FragmentOnBoardingPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardingPageBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val data = it.getSerializable(KEY_FOR_BOARD) as OnBoard
            binding.tvTitle.text =data.title
            binding.tvDescription.text = data.description
            binding.imagePager.loadImage(data.image)
            binding.btnStart.isVisible = data.isLast==true
            binding.skip.isVisible = data.isLast == false

        }
        binding.btnStart.setOnClickListener{
            findNavController().navigate(R.id.navigation_home)
        }
        binding.skip.setOnClickListener{
            findNavController().navigate(R.id.navigation_home)
        }
    }
companion object{
    const val KEY_FOR_BOARD = "board.item"

}

}