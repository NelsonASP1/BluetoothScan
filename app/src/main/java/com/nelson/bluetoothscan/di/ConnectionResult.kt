package com.nelson.bluetoothscan.di


sealed interface ConnectionResult {
    object ConnectionSuccesful: ConnectionResult
    data class TransferSucceeded(val message: UserMessage): ConnectionResult
    data class Error(
        val message: String
    ): ConnectionResult
}