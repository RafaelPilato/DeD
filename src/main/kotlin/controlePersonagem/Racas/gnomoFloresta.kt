package org.example.controlePersonagem.Racas

import org.example.controlePersonagem.personagem

class gnomoFloresta (override val aparenciaGeral: String = "Aparencia de um gnomo da floresta",
             override var deslocamento: Double = 0.0,
             override var idiomas: Array<String> = arrayOf("")) : org.example.controlePersonagem.Racas.raca {
    override fun aplicarBonus(personagem: personagem) : personagem{
        personagem.destreza += 1

        return personagem
    }
}