package com.mmsoft.knowme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.mmsoft.knowme.ui.mainknowme.MainKnowMeFragment


class MainActivity : AppCompatActivity() {

    private var categoryRecyclerView: RecyclerView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // create fragment instance
        val fragment : MainKnowMeFragment = MainKnowMeFragment.newInstance()

        // check is important to prevent activity from attaching the fragment if already its attached
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        }

    }


}
