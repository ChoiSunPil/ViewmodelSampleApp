package com.example.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var scoreViewModel: ScoreViewModel
    //val scoreViewModel: ScoreViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        scoreViewModel = ViewModelProvider(this)[ScoreViewModel::class.java]
        displayForTeamA(scoreViewModel.getScoreTeamA())
        displayForTeamB(scoreViewModel.getScoreTeamB())
    }

    fun addOneForTeamA(view: View) {
        scoreViewModel.addScoreTeamA(1)
        displayForTeamA(scoreViewModel.getScoreTeamA())
    }

    fun addTwoForTeamA(view: View) {
        scoreViewModel.addScoreTeamA(2)
        displayForTeamA(scoreViewModel.getScoreTeamA())
    }

    fun addThreeForTeamA(view: View) {
        scoreViewModel.addScoreTeamA(3)
        displayForTeamA(scoreViewModel.getScoreTeamA())
    }

    fun addThreeForTeamB(view: View) {
        scoreViewModel.addScoreTeamB(3)
        displayForTeamB(scoreViewModel.getScoreTeamB())
    }

    fun addTwoForTeamB(view: View) {
        scoreViewModel.addScoreTeamB(2)
        displayForTeamB(scoreViewModel.getScoreTeamB())
    }

    fun addOneForTeamB(view: View) {
        scoreViewModel.addScoreTeamB(1)
        displayForTeamB(scoreViewModel.getScoreTeamB())
    }

    fun resetScore(view: View) {
        scoreViewModel.resetScore()
        displayForTeamA(scoreViewModel.getScoreTeamA())
        displayForTeamB(scoreViewModel.getScoreTeamB())
    }

    private fun displayForTeamA(scoreTeamA: Int) {
        team_a_score.text = scoreTeamA.toString()
    }

    private fun displayForTeamB(scoreTeamB: Int) {
        team_b_score.text = scoreTeamB.toString()
    }
}
