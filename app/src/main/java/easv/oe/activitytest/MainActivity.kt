package easv.oe.activitytest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

/**
 * Showcase the lifecycle of an Activity. Look in the log when running
 * to see order of execution for life-cycle related functions.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        log("onCreate")
    }

    override fun onSaveInstanceState(state: Bundle) {
        super.onSaveInstanceState(state)
        log("onSaveInstanceState")
    }

    override fun onRestoreInstanceState(state: Bundle) {
        super.onSaveInstanceState(state)
        log("onRestoreInstanceState")
    }

    override fun onStart() {
        super.onStart()
        log("OnStart")
    }

    override fun onRestart() {
        super.onRestart()
        log("OnRestart")
    }

    override fun onResume() {
        super.onResume()
        log("OnResume")
    }

    override fun onPause() {
        super.onPause()
        // set music/video on pause
        log("OnPause")
    }

    override fun onStop() {
        super.onStop()
        log("OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("OnDestroy")
    }

    private fun log(message: String) {
        Log.d("xyz", message)
    }

}