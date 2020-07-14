package com.towhid.dagger.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.towhid.dagger.model.BangladeshCricketTeam
import com.towhid.dagger.model.Player
import com.towhid.dagger.R
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //field injection 4
    @Inject
    lateinit var bangladeshCricketTeam: BangladeshCricketTeam


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*        var player = Player()
        var bangladeshCricketTeam =
            BangladeshCricketTeam(player)*/

        button.setOnClickListener {
            text.text = bangladeshCricketTeam.getMyBestEleven()
        }
    }

}
