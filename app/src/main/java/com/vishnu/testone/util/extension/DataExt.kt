package com.vishnu.testone.util.extension

fun Boolean?.orDefault(default: Boolean = false): Boolean {
    return this ?: default
}
