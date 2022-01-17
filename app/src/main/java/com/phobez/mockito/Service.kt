package com.phobez.mockito

class Service(private val database: Database) {

    fun query(query: String): Boolean {
        return database.isAvailable()
    }

    override fun toString(): String {
        return "Using database with id: ${database.getUniqueId()}"
    }
}