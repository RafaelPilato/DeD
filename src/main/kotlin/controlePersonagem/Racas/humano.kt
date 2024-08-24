package org.example.controlePersonagem.Racas

import org.example.controlePersonagem.personagem

class humano (override val aparenciaGeral: String = "Aparencia de um humano",
              override var deslocamento: Double = 0.0,
              override var idiomas: Array<String> = arrayOf("")) : org.example.controlePersonagem.Racas.raca {

    override fun aplicarBonus(personagem: personagem) : personagem{
        personagem.forca += 1
        personagem.destreza += 1
        personagem.constituicao += 1
        personagem.inteligencia += 1
        personagem.sabedoria += 1
        personagem.carisma += 1

        return personagem
    }

}