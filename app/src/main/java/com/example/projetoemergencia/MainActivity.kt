package com.example.projetoemergencia

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val policeButton = findViewById<View>(R.id.policeButton)
        val ambulanceButton = findViewById<View>(R.id.ambulanceButton)
        val bombeirosButton = findViewById<View>(R.id.bombeiroButton)
        val defesacvButton = findViewById<View>(R.id.defesacvButton)
        val policiarfButton = findViewById<View>(R.id.policiarfButton)
        val policiareButton = findViewById<View>(R.id.policiareButton)
        val direitoshumButton = findViewById<View>(R.id.direitoshumButton)

        policeButton.setOnClickListener {
            dialPhoneNumber("190")
        }

        ambulanceButton.setOnClickListener {
            dialPhoneNumber("192")
        }

        bombeirosButton.setOnClickListener {
            dialPhoneNumber("193")
        }

        defesacvButton.setOnClickListener {
            dialPhoneNumber("199")
        }

        policiarfButton.setOnClickListener {
            dialPhoneNumber("191")
        }

        policiareButton.setOnClickListener {
            dialPhoneNumber("198")
        }

        direitoshumButton.setOnClickListener {
            dialPhoneNumber("100")
        }

        defesacvButton.setOnClickListener {
            dialPhoneNumber("199")
        }

    }

    private fun dialPhoneNumber(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:$phoneNumber")
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}
