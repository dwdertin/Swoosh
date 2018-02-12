package com.dev.dustindertinger.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.dev.dustindertinger.swoosh.utilities.EXTRA_LEAGUE
import com.dev.dustindertinger.swoosh.R
import com.dev.dustindertinger.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBallerClick(view: View){
        beginnerSkillButton.isChecked = false
        skill = "baller"
    }

    fun onBeginnerClick(view: View){
        ballerSkillButton.isChecked = false
        skill = "beginner"
    }


    fun onSkillFinishClicked(view: View){
        if (skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }

    }


}