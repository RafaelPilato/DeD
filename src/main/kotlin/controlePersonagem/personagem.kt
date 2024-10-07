package org.example.controlePersonagem
import org.example.controlePersonagem.Racas.*

class personagem (
    var nome: String,
    var racaPersonagem: org.example.controlePersonagem.Racas.raca,
    //val classe: Classe,
    var nivel: Int = 1,
    var xp: Double = 0.0,
    var forca: Int = 8,
    var destreza: Int = 8,
    var constituicao: Int = 8,
    var inteligencia: Int = 8,
    var sabedoria: Int = 8,
    var carisma: Int = 8,
    var vida: Int = 10,
    var pontos: Int = 27
){
    fun valorBonus(){
        this.racaPersonagem.aplicarBonus(this)
    }

    //Recebe o número da habilidade inserida e valida
    fun validacaoValorHabilidade(valorHabilidade: Int): Boolean {
        if(valorHabilidade < 8 || valorHabilidade > 15){
            return true
        }
        return false
    }

    fun descontarValorHabilidade(valorHabilidade: Int, indiceHabilidade: Int): Boolean{
        var custo: Int = 0

        when(valorHabilidade){
            9 -> custo = 1
            10 -> custo = 2
            11 -> custo = 3
            12 -> custo = 4
            13 -> custo = 5
            14 -> custo = 7
            15 -> custo = 9
        }

        if(custo > this.pontos){
            return true
        }
        this.pontos -= custo

        //Setar habilidade
        when(indiceHabilidade) {
            1 -> this.forca = valorHabilidade
            2 -> this.destreza = valorHabilidade
            3 -> this.constituicao = valorHabilidade
            4 -> this.inteligencia = valorHabilidade
            5 -> this.sabedoria = valorHabilidade
            6 -> this.carisma = valorHabilidade
        }

        return false
    }

    fun modificarVida(){
        var modificador: Int = 0

        when(this.constituicao){
            1 -> modificador = -5
            2, 3 -> modificador = -4
            4, 5  -> modificador = -3
            6, 7  -> modificador = -2
            8, 9  -> modificador = -1
            10, 11  -> modificador = 0
            12, 13 -> modificador = 1
            14, 15 -> modificador = 2
            16, 17 -> modificador = 3
            18, 19 -> modificador = 4
            20, 21 -> modificador = 5
            22, 23 -> modificador = 6
            24, 25 -> modificador = 7
            26, 27 -> modificador = 8
            28, 29 -> modificador = 9
            30 -> modificador = 10
        }

        this.vida += modificador
    }
}