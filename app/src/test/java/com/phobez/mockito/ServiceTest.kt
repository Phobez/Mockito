package com.phobez.mockito

import junit.framework.TestCase.assertNotNull
import junit.framework.TestCase.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ServiceTest {

    @Mock
    private lateinit var databaseMock: Database

    @Test
    fun testQuery() {
        assertNotNull(databaseMock)
        `when`(databaseMock.isAvailable()).thenReturn(true)

        val t = Service(databaseMock)

        val check = t.query("* from t")

        assertTrue(check)
    }
}