package tech.elecholic.rocker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import tech.elecholic.mecanum.RockerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rockerView.setOnAngleChangedListener(object: RockerView.OnAngleChangedListener {
            override fun onAngleChanged(ang: Float) {
                angleView.text = ang.toString()
            }
        })
    }
}
