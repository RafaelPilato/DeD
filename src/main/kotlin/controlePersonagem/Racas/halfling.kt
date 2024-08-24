package org.example.controlePersonagem.Racas

import org.example.controlePersonagem.personagem

class halfling (override val aparenciaGeral: String = "Aparencia de um halfling",
                override var deslocamento: Double = 0.0,
                override var idiomas: Array<String> = arrayOf("")) : org.example.controlePersonagem.Racas.raca {
    override fun aplicarBonus(personagem: personagem) : personagem {
        personagem.destreza += 2

        return personagem
    }
}