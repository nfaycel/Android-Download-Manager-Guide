package com.example.downloadmanagerguide

interface Downloader {
    fun downloadFile(url: String): Long
}