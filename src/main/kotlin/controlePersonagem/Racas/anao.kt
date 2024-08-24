package org.example.controlePersonagem.Racas

import org.example.controlePersonagem.personagem

class anao(override val aparenciaGeral: String = "Homem pequeno",
    override var deslocamento: Double = 0.0,
    override var idiomas: Array<String> = arrayOf("anao")
    ): org.example.controlePersonagem.Racas.raca {

    override fun aplicarBonus(personagem: personagem) : personagem{
        personagem.constituicao += 2
        return  personagem
    }

}