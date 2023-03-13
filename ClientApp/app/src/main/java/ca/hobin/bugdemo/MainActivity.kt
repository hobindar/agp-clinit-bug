package ca.hobin.bugdemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import ca.hobin.bugdemo.helperlibrary.RadioManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("AgpBugDemo", String.format("Radio version is %s", RadioManager().getRadioVersion()))
    }
}
