package id.micro.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val myText = findViewById<TextView>(R.id.mytext)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            timesClicked += 1

            myText.text = timesClicked.toString()

            Toast.makeText(this, "Hi im a toast!", Toast.LENGTH_SHORT).show()
        }
    }
}