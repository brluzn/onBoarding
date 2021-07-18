package com.example.onboarding.fragments.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.onboarding.MainActivity
import com.example.onboarding.R
import com.example.onboarding.base.BaseFragment
import com.example.onboarding.utils.ViewpagerAdapter
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator


class viewpagerFragment : BaseFragment() {

    lateinit var viewPager : ViewPager2
    lateinit var wormDotsIndicator:WormDotsIndicator
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.viewpager_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
        indicator(view)
    }

    private fun indicator(view:View) {


        val adapter= ViewpagerAdapter(requireActivity() as MainActivity)
        viewPager.adapter=adapter
        wormDotsIndicator.setViewPager2(viewPager)
    }

    private fun initViews(view: View) {
        viewPager=view.findViewById(R.id.viewPager)
        wormDotsIndicator =view.findViewById<WormDotsIndicator>(R.id.worm_dots_indicator)


    }
}