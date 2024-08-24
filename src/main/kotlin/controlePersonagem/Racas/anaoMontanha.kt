package org.example.controlePersonagem.Racas

import org.example.controlePersonagem.personagem

class anaoMontanha (override val aparenciaGeral: String = "Homem da montanha pequeno",
                    override var deslocamento: Double = 7.5,
                    override var idiomas: Array<String> = arrayOf("Comum", "Anão")) :
    org.example.controlePersonagem.Racas.raca {
    override fun aplicarBonus(personagem: personagem) : personagem{
        personagem.forca += 2

        return personagem
    }
}