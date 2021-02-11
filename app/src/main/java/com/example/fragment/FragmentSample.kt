package com.example.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentSample : Fragment() {
    val taag: String = "Main1"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(taag, "onCreateView Called Fragment")
        return inflater.inflate(R.layout.fragment_sample, container, false)
    }

    override fun onAttach(context: Context) {
        Log.d(taag, "onAttach Called Fragment")

        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(taag, "onCreate Called Fragment")

        super.onCreate(savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d(taag, "onActivity Created Called Fragment")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onResume() {
        Log.d(taag, "onResume Called Fragment")
        super.onResume()
    }

    override fun onStart() {
        Log.d(taag, "onStart Called Fragment")
        super.onStart()
    }

    override fun onStop() {
        Log.d(taag, "onStop Called Fragment")

        super.onStop()
    }

    override fun onPause() {
        Log.d(taag, "onPause Called Fragment")

        super.onPause()
    }

    override fun onDestroyView() {
        Log.d(taag, "onDestroyView Called Fragment")

        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(taag, "onDestroy Called Fragment")

        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(taag, "onDetach Called Fragment")

        super.onDetach()
    }
}