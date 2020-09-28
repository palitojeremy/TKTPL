package id.ac.ui.cs.mobileprogramming.lab_2;

import android.app.Activity;
import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

//    @Rule
//    public ActivityTestRule<> activityRule = new ActivityTestRule<>(
//            NextActivity.class,
//            true,     // initialTouchMode
//            false);   // launchActivity. False to customize the intent

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("id.ac.ui.cs.mobileprogramming.lab_2", appContext.getPackageName());
    }

    @Test
    public void testTextVisibleonButtonClick(){
        onView(withId(R.id.button)).perform(click());

        onView(withId(R.id.button)).check(matches(isDisplayed()));
    }
}