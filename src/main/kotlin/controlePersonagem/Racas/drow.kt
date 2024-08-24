package org.example.controlePersonagem.Racas

import org.example.controlePersonagem.personagem

class drow (override val aparenciaGeral: String = "Aparencia de um drow",
             override var deslocamento: Double = 0.0,
             override var idiomas: Array<String> = arrayOf("")) : org.example.controlePersonagem.Racas.raca {

    override fun aplicarBonus(personagem: personagem) : personagem{
        personagem.carisma += 1

        return personagem
    }
}