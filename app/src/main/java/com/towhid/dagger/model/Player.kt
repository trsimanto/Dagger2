package com.towhid.dagger.model

import javax.inject.Inject

//constractor Injection 1
class Player @Inject constructor(){
    fun getPlayersName():String{
        return "tamim, sakim , masrafi, musfiq, rafiq,naim,mahamullua,nasir,rubel,mustafiz"
    }
}