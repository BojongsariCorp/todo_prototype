package com.bojongsaricorp.todo

class Model {

    companion object factory{
        fun createList():Model= Model()
    }
    var UID: String? = null
    var itemDataText: String? = null
    var done: Boolean = false

}