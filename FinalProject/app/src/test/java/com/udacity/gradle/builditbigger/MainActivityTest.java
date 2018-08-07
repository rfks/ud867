package com.udacity.gradle.builditbigger;

import junit.framework.TestCase;

public class MainActivityTest extends TestCase {

    public void testReturnValue() {
        assertNotNull(MainActivity.jokeFromAPI);
    }
}