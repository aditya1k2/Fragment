package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val Tag: String = "Main"
    }

    private val fragmentManager = supportFragmentManager
    private var fragmentTransaction = fragmentManager.beginTransaction()

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(Companion.Tag, "onCreate Called MainActivity")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentCountTextView.text = fragmentManager.backStackEntryCount.toString()
        fragmentManager.addOnBackStackChangedListener {
            fragmentCountTextView.text = fragmentManager.backStackEntryCount.toString()
        }

        //addFragment()
        addFragmentButton.setOnClickListener {
            addFragment()
        }

        pop.setOnClickListener {
            fragmentManager.popBackStack()
        }

        remove.setOnClickListener {
            onBackPressed()
        }

    }

    override fun onBackPressed() {
        if (fragmentManager.findFragmentById(R.id.frame_layout_container) != null) {
            fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.remove(fragmentManager.findFragmentById(R.id.frame_layout_container)!!)
            fragmentTransaction.commit()

        } else {
            Toast.makeText(this, "no fragment to remove", Toast.LENGTH_SHORT).show()
            // super.onBackPressed()

        }

    }

    private fun addFragment() {
        var fragment: Fragment = when (fragmentManager.backStackEntryCount) {
            0 -> {
                FragmentSample()
            }
            1 -> {
                FragmentSample2()
            }
            2 -> {
                FragmentSample3()
            }
            else -> {
                FragmentSample()
            }
        }
        fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout_container, fragment, "demo")
        fragmentTransaction.addToBackStack(null)

        fragmentTransaction.commit()

        Log.d(Companion.Tag, "addFragment Called MainActivity")

    }

    override fun onStart() {
        Log.d(Companion.Tag, "onStart Called MainActivity")
        super.onStart()
    }

    override fun onResume() {
        Log.d(Companion.Tag, "onResume Called MainActivity")

        super.onResume()
    }

    override fun onPause() {
        Log.d(Companion.Tag, "onPause Called MainActivity")

        super.onPause()
    }

    override fun onStop() {
        Log.d(Companion.Tag, "onStop Called MainActivity")

        super.onStop()
    }

    override fun onDestroy() {
        Log.d(Companion.Tag, "onDestroy Called MainActivity")

        super.onDestroy()
    }

    override fun onRestart() {
        Log.d(Companion.Tag, "onRestart Called")

        super.onRestart()
    }


}