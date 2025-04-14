package com.nelson.bluetoothscan.ui

import com.nelson.bluetoothscan.di.BluetoothDevice
import com.nelson.bluetoothscan.di.UserMessage

data class BluetoothState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),

    val isConnected: Boolean = false,
    val isConnecting: Boolean = false,

    val errorMessage: String? = null,
    val messages: List<UserMessage> = emptyList()
)