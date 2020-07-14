package com.towhid.dagger.model

import com.towhid.dagger.model.Player
import javax.inject.Inject
//constractor Injection 2
class BangladeshCricketTeam @Inject constructor(var player: Player) {
    fun getMyBestEleven():String=player.getPlayersName()
}