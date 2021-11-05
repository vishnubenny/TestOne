package com.vishnu.testone.webbrowser

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.vishnu.testone.base.BaseFragment
import com.vishnu.testone.databinding.FragmentBrowserBinding

class BrowserFragment : BaseFragment<FragmentBrowserBinding>() {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentBrowserBinding.inflate(inflater, container, false)

    @SuppressLint("SetJavaScriptEnabled")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding()?.wbVwBrowser?.apply {
            loadUrl("https://www.google.co.in/")
            webViewClient = object : WebViewClient() {
                override fun shouldOverrideUrlLoading(
                    view: WebView?,
                    request: WebResourceRequest?
                ): Boolean {
                    request?.url?.toString()?.let { url -> view?.loadUrl(url) }
                    return true
                }
            }
            webChromeClient = object : WebChromeClient() {

            }
            settings.apply {
                javaScriptEnabled = true
            }
        }
    }
}
