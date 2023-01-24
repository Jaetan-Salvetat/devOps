package com.nanaka.jetpackcompose

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals("4 & 2 + 2 no be equals", 4, 2 + 2)
    }
    @Test
    fun testShouldThrowError() {
        assertTrue("this test should throw an error", false)
    }
}