package org.example.controlePersonagem.Racas

import org.example.controlePersonagem.personagem

class gnomo (override val aparenciaGeral: String = "Aparencia de um gnomo",
             override var deslocamento: Double = 0.0,
             override var idiomas: Array<String> = arrayOf("")) : org.example.controlePersonagem.Racas.raca {

    override fun aplicarBonus(personagem: personagem) : personagem{
        personagem.inteligencia += 2

        return personagem
    }
}