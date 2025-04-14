package com.nelson.bluetoothscan.data.receiver

import com.nelson.bluetoothscan.di.UserMessage

fun String.toBluetoothMessage(isFromLocalUser: Boolean): UserMessage {
    val name = substringBeforeLast("#")
    val message = substringAfter("#")
    return UserMessage(
        message = message,
        senderName = name,
        isFromLocalUser = isFromLocalUser
    )
}

fun UserMessage.toByteArray(): ByteArray {
    return "$senderName#$message".encodeToByteArray()
}