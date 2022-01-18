package com.phobez.mockito.kotlin

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Before
import org.junit.Test

class LendBookManagerTest {

    private lateinit var mockBookService: BookService

    @Before
    fun setUp() {
        mockBookService = mock()
    }

    @Test
    fun `should lend book if book is in stock`() {
        whenever(mockBookService.inStock(100)).thenReturn(true)

        val manager = LendBookManager(mockBookService)

        manager.checkout(100, 1)

        verify(mockBookService).lend(100, 1)
    }

    @Test(expected = IllegalStateException::class)
    fun `should throw illegal state exception if book is not in stock`() {
        whenever(mockBookService.inStock(100)).thenReturn(false)

        val manager = LendBookManager(mockBookService)

        manager.checkout(100, 1)
    }
}