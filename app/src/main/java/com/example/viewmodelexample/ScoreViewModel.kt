package com.example.viewmodelexample

import androidx.lifecycle.ViewModel


class ScoreViewModel : ViewModel() {
    private var scoreTeamA : Int = 0
    private var scoreTeamB : Int = 0


    fun getScoreTeamA() : Int {
        return scoreTeamA
    }

    fun getScoreTeamB() : Int {
        return scoreTeamB
    }

    fun addScoreTeamA(score : Int) {
        scoreTeamA += score
    }

    fun addScoreTeamB(score : Int) {
        scoreTeamB += score
    }

    fun resetScore() {
        scoreTeamA = 0
        scoreTeamB = 0
    }
}