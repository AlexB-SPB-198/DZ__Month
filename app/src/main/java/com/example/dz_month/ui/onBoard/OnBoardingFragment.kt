package com.example.dz_month.ui.onBoard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.dz_month.databinding.FragmentOnBoardingBinding
import com.example.dz_month.ui.adapter.OnBoardingAdapter


class OnBoardingFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     binding = FragmentOnBoardingBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter =  OnBoardingAdapter(childFragmentManager)
        binding.onBoarding.adapter = adapter
            binding.indicator.setViewPager(binding.onBoarding)
        adapter.registerDataSetObserver(binding.indicator.dataSetObserver)
    }

    private fun  OnBoardigAdapter(childFragmentManager: FragmentManager): Any {
        TODO("Not yet implemented")
    }


}
