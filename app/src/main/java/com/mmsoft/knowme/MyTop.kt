package com.mmsoft.knowme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mmsoft.knowme.ui.mytop.MyTopFragment

class MyTop : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_top_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MyTopFragment.newInstance())
                .commitNow()
        }
    }
}
