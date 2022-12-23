package com.example.sample

import org.json.JSONObject
import org.junit.Assert.*
import org.junit.Test


class NumberUtilsTest {

    @Test
    fun `given even number, then verify`() {
        // when
        val result = NumberUtils().isEvenNumber(2)

        // then
        assertTrue(result)
    }

    @Test
    fun `given odd number, then verify`() {
        // when
        val result = NumberUtils().isOdd(2)

        // then
        assertFalse(result)
    }

    @Test
    fun `given json object, then verify`() {
        // when
        val jsonObject = JSONObject("{\"id\": 123}")

        println("json-test: $jsonObject")

        // then
        assertEquals("123", jsonObject.optString("id"))
    }
}