package com.example.dz_month.ui.adapter

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.dz_month.OnBoard
import com.example.dz_month.ui.onBoard.OnBoardingPageFragment

class OnBoardingAdapter(fm :FragmentManager):FragmentStatePagerAdapter(fm) {

    private val arrayListBoarding = arrayListOf(
        OnBoard("https://ru.wikipedia.org/wiki/Ford_Focus#/media/%D0%A4%D0%B0%D0%B9%D0%BB:Ford_Focus_Mk_IV_Facelift_Auto_Zuerich_2021_IMG_0406.jpg",
        "Ford","Focus", false
        ),
        OnBoard("https://ru.wikipedia.org/wiki/Opel_Astra#/media/%D0%A4%D0%B0%D0%B9%D0%BB:Opel_Astra_J_1.4_ecoFLEX_Edition_front_20100725.jpg",
        "Opel","Astra",false
        ),
        OnBoard("https://ru.wikipedia.org/wiki/Kia_Rio#/media/%D0%A4%D0%B0%D0%B9%D0%BB:Berline_Kia_Rio_2018_au_SIAM_2018",
        "Kia","Rio",true
        ),
        OnBoard("https://ru.wikipedia.org/wiki/Honda_Pilot#/media/%D0%A4%D0%B0%D0%B9%D0%BB:2016_Honda_Pilot.jpg",
        "Honda","Pilot"),
        OnBoard("https://ru.wikipedia.org/wiki/Nissan_Patrol#/media/%D0%A4%D0%B0%D0%B9%D0%BB:Safari(sdfPatrol).jpg",
        "Nissan","Patrol"),
        OnBoard("https://ru.wikipedia.org/wiki/Subaru_Tribeca#/media/%D0%A4%D0%B0%D0%B9%D0%BB:2008_Subaru_Tribeca.jpg",
        "Subaru","Tribeca")


    )
    override fun getCount(): Int = arrayListBoarding.size

    override fun getItem(position: Int): Fragment {
        val data = bundleOf(OnBoardingPageFragment.KEY_FOR_BOARD to arrayListBoarding[position])
        val fragment= OnBoardingPageFragment()
        fragment.arguments=data
        return fragment
    }


}
