package org.example.controlePersonagem.Racas
import org.example.controlePersonagem.personagem

interface raca {

    val aparenciaGeral: String
    val deslocamento: Double
    val idiomas: Array<String>

    fun aplicarBonus(personagem: personagem): personagem {
        return personagem
    }


}