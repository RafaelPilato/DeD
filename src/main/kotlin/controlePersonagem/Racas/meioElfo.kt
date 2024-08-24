package org.example.controlePersonagem.Racas

import org.example.controlePersonagem.personagem

class meioElfo (override val aparenciaGeral: String = "Aparencia de um meio elfo",
                override var deslocamento: Double = 0.0,
                override var idiomas: Array<String> = arrayOf("")) : org.example.controlePersonagem.Racas.raca {

    override fun aplicarBonus(personagem: personagem) : personagem {
        personagem.carisma += 2

        return personagem
    }
}