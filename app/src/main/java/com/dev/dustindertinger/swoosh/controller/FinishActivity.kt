package com.dev.dustindertinger.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dev.dustindertinger.swoosh.R
import com.dev.dustindertinger.swoosh.model.Player
import com.dev.dustindertinger.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
