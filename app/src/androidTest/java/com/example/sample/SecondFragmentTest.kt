package com.example.sample

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SecondFragmentTest {
    private lateinit var underTest: SecondFragment

    private fun launchFragment() {
        launchFragmentInContainer<SecondFragment>().onFragment{
            underTest = it
        }
    }

    @Test
    fun verifyTextOnScreen() {
        launchFragment()
        onView(withText("Hello second fragment"))
    }
}