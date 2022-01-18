package com.phobez.mockito.kotlin

class LendBookManager(private val bookService: BookService) {

    fun checkout(bookId: Int, memberId: Int) {
        if (bookService.inStock(bookId)) {
            bookService.lend(bookId, memberId)
        } else {
            throw IllegalStateException("Book is not available")
        }
    }
}