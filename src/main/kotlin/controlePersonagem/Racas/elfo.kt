package org.example.controlePersonagem.Racas

import org.example.controlePersonagem.personagem

class elfo (override val aparenciaGeral: String = "Pequeno com os olhos grandes e orelhas pontiagudas",
            override var deslocamento: Double = 0.0,
            override var idiomas: Array<String> = arrayOf("")) : org.example.controlePersonagem.Racas.raca {
    override fun aplicarBonus(personagem: personagem) : personagem{
        personagem.destreza += 2

        return personagem
    }
}