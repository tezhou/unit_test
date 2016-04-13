package com.example.tezhou.testproject.tests;
import android.test.*;
import android.widget.TextView;

import com.example.tezhou.testproject.MainActivity;
import com.example.tezhou.testproject.R;

/**
 * Created by tezhou on 4/13/2016.
 */
public class JUnit_test  extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test() {

        super((MainActivity.class));
    }

    public void test_first(){

        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);
    }
}
