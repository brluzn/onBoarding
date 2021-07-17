package com.example.onboarding.fragments.splash

import android.animation.Animator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.navigation.fragment.findNavController
import com.airbnb.lottie.LottieAnimationView
import com.example.onboarding.R
import com.example.onboarding.base.BaseFragment

class splashFragment : BaseFragment() {

    lateinit var lottieView : LottieAnimationView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.splash_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lottieView=view.findViewById(R.id.animation_view)
        lottieView.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(animation: Animator?) {
                //
            }

            override fun onAnimationEnd(animation: Animator?) {
                //
               //findNavController().navigate(R.id.action_splashFragment_to_viewpagerFragment2)
                findNavController().navigate(R.id.action_splashFragment_to_viewpagerFragment2)
            }

            override fun onAnimationCancel(animation: Animator?) {
                //
            }

            override fun onAnimationRepeat(animation: Animator?) {
                //
            }

        })

    }

}