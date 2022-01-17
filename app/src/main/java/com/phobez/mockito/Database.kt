package com.phobez.mockito

class Database {

    fun isAvailable(): Boolean {
        return false
    }

    fun getUniqueId(): Int {
        return 42
    }
}