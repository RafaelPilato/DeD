package org.example.controlePersonagem.Racas

import org.example.controlePersonagem.personagem

class tiefling (override val aparenciaGeral: String = "Aparencia de um tiefling",
                override var deslocamento: Double = 0.0,
                override var idiomas: Array<String> = arrayOf("")) : org.example.controlePersonagem.Racas.raca {

    override fun aplicarBonus(personagem: personagem): personagem {
        personagem.inteligencia += 1
        personagem.carisma += 2

        return personagem
    }
}