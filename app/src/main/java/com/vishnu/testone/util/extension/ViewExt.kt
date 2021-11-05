package com.vishnu.testone.util.extension

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.vishnu.testone.util.INT_ZERO

fun View?.hideKeyboard(): Boolean {
    return (this?.context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?)
        ?.hideSoftInputFromWindow(this?.windowToken, INT_ZERO)
        .orDefault()
}
