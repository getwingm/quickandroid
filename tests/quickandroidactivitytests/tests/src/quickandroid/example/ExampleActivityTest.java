package quickandroid.example;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class quickandroid.example.ExampleActivityTest \
 * quickandroid.example.tests/android.test.InstrumentationTestRunner
 */
public class ExampleActivityTest extends ActivityInstrumentationTestCase2<ExampleActivity> {

    private static TAG = "ExampleActivityTest"

    public ExampleActivityTest() {
        super("quickandroid.example", ExampleActivity.class);
    }

    public void testHello() {
        Log.d(TAG,"Hello");
        assertTrue(true);
    }

}
