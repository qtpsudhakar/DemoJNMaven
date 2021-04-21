package com.crun;

import com.tests.Suite1;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class CustomRunner {
    public static void main(String[] args) {
        Result res1 = JUnitCore.runClasses(Suite1.class);
        System.out.println(res1.getRunCount());

    }
}
