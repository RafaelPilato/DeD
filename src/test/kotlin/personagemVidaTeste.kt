package org.example.controlePersonagem

import org.junit.Test
import junit.framework.TestCase.assertEquals
import org.example.controlePersonagem.Racas.*

class personagemVidaTeste {




    var playerTeste = personagem("Nome", humano(), 1, 0.0, 8, 8, 8, 8, 8, 8 ,10)

    @Test
    fun testeVida(){
        assertEquals(10, playerTeste.vida)
    }
}