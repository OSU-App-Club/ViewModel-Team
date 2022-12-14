package com.example.navigationandmvvm.ViewsAndViewModels.devicesEditor

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.navigationandmvvm.databinding.FragmentDevicesEditorBinding

class DevicesEditorFragment : AppCompatActivity() {

    private lateinit var _binding: FragmentDevicesEditorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = FragmentDevicesEditorBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        val devicesEditorViewModel = ViewModelProvider(this).get(DevicesEditorViewModel::class.java)
        lifecycle.addObserver(devicesEditorViewModel)

        val textView: TextView = _binding.devicesEditorTextHeader

        devicesEditorViewModel.text.observe(this) {
            textView.text = it
        }
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}