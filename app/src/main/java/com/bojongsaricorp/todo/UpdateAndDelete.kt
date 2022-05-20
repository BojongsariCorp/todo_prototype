package com.bojongsaricorp.todo

interface UpdateAndDelete {

    fun modifyitem(itemUID: String, isDone: Boolean)
    fun onItemDelete(itemUID: String)
}