package org.example.controlePersonagem.Racas

import org.example.controlePersonagem.personagem

class anaoColina (override val aparenciaGeral: String = "Aparencia de um anão da colina",
             override var deslocamento: Double = 0.0,
             override var idiomas: Array<String> = arrayOf("")) : org.example.controlePersonagem.Racas.raca {

    override fun aplicarBonus(personagem: personagem) : personagem{
        personagem.sabedoria += 1

        return personagem
    }
}