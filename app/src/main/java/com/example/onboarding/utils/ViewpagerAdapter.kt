package com.example.onboarding.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.onboarding.MainActivity
import com.example.onboarding.fragments.chooseFragment.chooseFramgment
import com.example.onboarding.fragments.findFragment.findFragment
import com.example.onboarding.fragments.registerFragment.registerFragment

private const val FRAGMENT_COUNT=3

class ViewpagerAdapter(activity: AppCompatActivity)  :FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = FRAGMENT_COUNT

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->chooseFramgment()
            1->findFragment()
            else -> registerFragment()
        }

    }
}