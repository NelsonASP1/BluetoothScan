package com.nelson.bluetoothscan.di

import android.bluetooth.BluetoothDevice

typealias BluetoothDeviceDomain = com.nelson.bluetoothscan.di.BluetoothDevice

data class BluetoothDevice (
    val name: String?,
    val address: String
)