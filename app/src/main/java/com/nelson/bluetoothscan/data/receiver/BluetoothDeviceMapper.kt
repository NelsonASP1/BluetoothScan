package com.nelson.bluetoothscan.data.receiver

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.nelson.bluetoothscan.di.BluetoothDeviceDomain


@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain():BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}