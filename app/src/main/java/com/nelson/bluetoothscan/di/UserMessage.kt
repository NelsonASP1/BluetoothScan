package com.nelson.bluetoothscan.di

data class UserMessage(
    val message: String,
    val senderName: String,
    val isFromLocalUser: Boolean
)