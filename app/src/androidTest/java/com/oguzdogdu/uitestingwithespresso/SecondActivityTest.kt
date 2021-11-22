package com.oguzdogdu.uitestingwithespresso

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class SecondActivityTest {

    @get:Rule
    var activityScenarioRule = androidx.test.ext.junit.rules.activityScenarioRule<SecondActivity>()

    @Test
    fun checkingActivity() {
        onView(withId(R.id.layout_secondActivity))
            .check(matches(isDisplayed()))
    }
    @Test
    fun testVisibilityOfTextviewAndButton() {
        onView(withId(R.id.tvSecond))
            .check(matches(isDisplayed()))

        //checking button visibility
        onView(withId(R.id.btnSecond))
            .check(matches(isDisplayed()))
    }
    //check if the text in the second is the one that we expected(Second Activity)
    @Test
    fun textVisibilityTextview() {
        onView(withId(R.id.tvSecond))
            .check(matches(withText(R.string.second_activity)))
    }
}