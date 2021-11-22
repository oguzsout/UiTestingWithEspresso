package com.oguzdogdu.uitestingwithespresso

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    //this variable will global for all fun that we will create
    @get:Rule
    var activityScenarioRule = androidx.test.ext.junit.rules.activityScenarioRule<MainActivity>()

    //first let's check(test) if our main activity layout is displayed or is visible to

    @Test
    fun checkActivityVisibility() {

        onView(withId(R.id.layout_mainActivity))
            .check(
                matches(isDisplayed())
            )
    }
    //checking if text "Main Activity" is visible as we want

    @Test
    fun checkingTextVisibility() {

        onView(withId(R.id.tvMain)).check(matches(isDisplayed()))

        //checking if out button is visible

        onView(withId(R.id.btnMain))
            .check(
                matches(isDisplayed())
            )
    }
    //checking if text in our View is the right one

    @Test
    fun testTextIsMainActivity() {
        onView(withId(R.id.tvMain))
            .check(
                matches(
                    withText(R.string.main_activity)
                )
            )
    }

    //testing click in button(Main Activity) if after a click we will navigate to second Activity
    //and test if our view(second activity will be displayed)

    @Test
    fun navigate2ndActivity() {
        onView(withId(R.id.btnMain))
            .perform(click())

        //with click everything is alright
        //now we will check if our second activity is visible to the user

        onView(withId(R.id.layout_secondActivity))
            .check(matches(isDisplayed()))
    }
    //testing backPress to mainActivity

    @Test
    fun backPressToMainActivity() {

        onView(withId(R.id.btnMain))
            .perform(click())

        onView(withId(R.id.layout_secondActivity))
            .check(matches(isDisplayed()))

        //here we will check onBackPress
        //when the user is on the second activity
        Espresso.pressBack()

        //after clicking on button to back
        //main Activity must be visible
        //we will check it

        onView(withId(R.id.layout_mainActivity))
            .check(matches(isDisplayed()))
    }
}