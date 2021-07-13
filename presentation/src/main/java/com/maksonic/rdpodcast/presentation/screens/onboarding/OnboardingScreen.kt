package com.maksonic.rdpodcast.presentation.screens.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.maksonic.rdpodcast.presentation.base.BaseFragment
import com.maksonic.rdpodcast.presentation.databinding.ScreenOnboardingBinding

/**
 * @Author: maksonic on 13.07.2021
 */
class OnboardingScreen : BaseFragment<ScreenOnboardingBinding>() {

    override val bindLayout: (LayoutInflater, ViewGroup?, Boolean) -> ScreenOnboardingBinding
        get() = ScreenOnboardingBinding::inflate

    override fun prepareView(savedInstanceState: Bundle?) {

    }
}