package org.example.controlePersonagem

import org.example.controlePersonagem.Racas.*

fun construirPersonagem(): personagem {

    println("----- Construindo Personagem------\n")
    print("Insira o nome do personagem: ")
    val nome = readLine()?: ""

    println("\n----- Raças -----")
    println("1 - Alto Elfo")
    println("2 - Anão")
    println("3 - Anão da Colina")
    println("4 - Anão da montanha")
    println("5 - Draconato")
    println("6 - Drow")
    println("7 - Elfo")
    println("8 - Elfo da Floresta")
    println("9 - Gnomo")
    println("10 - Gnomo das Rochas")
    println("11 - Halfling")
    println("12 - Halfling Pés-Leves")
    println("13 - Halfling Robusto")
    println("14 - Humano")
    println("15 - Meio Helfo")
    println("16 - Meio Orc")
    println("17 - Tiefling")
    println("-----------------")

    print("Insira o índice da raça desejada: ")
    val indiceRaca = readLine()?.toIntOrNull()?:0

    var Raca : raca
    Raca = humano()

    when(indiceRaca){
        1 ->Raca = altoElfo()
        2 ->Raca = anao()
        3 ->Raca = anaoColina()
        4 ->Raca = anaoMontanha()
        5 ->Raca = draconato()
        6 ->Raca = drow()
        7 ->Raca = elfo()
        8 ->Raca = elfoFloresta()
        9 ->Raca = gnomo()
        10 ->Raca = gnomoRochas()
        11 ->Raca = halfling()
        12  ->Raca = halflingPesLeves()
        13 ->Raca = halflingRobusto()
        14 ->Raca = humano()
        15 ->Raca = meioElfo()
        16 ->Raca = meioOrc()
        17 ->Raca = tiefling()
    }

    println("\nAplicando pontos de habilidade")
    var pontos : Int = 27

    var forca: Int = 8
    var destreza: Int = 8
    var constituicao: Int = 8
    var inteligencia: Int = 8
    var sabedoria: Int = 8
    var carisma: Int = 8

    do {
        println("--- Habilidades ---")
        println("1 - Força")
        println("2 - Destreza")
        println("3 - Constituição")
        println("4 - Inteligência")
        println("5 - Sabedoria")
        println("6 - Carisma")
        println("7 - Finalizar habilidades")
        println("--------------------")

        println("Você possui " + pontos + " pontos")

        print("Qual habilidade deseja melhorar? ")
        var indiceHabilidade = readLine()?.toIntOrNull()?: 0

        if(indiceHabilidade < 1 || indiceHabilidade > 7) {
            println("\nCódigo de habilidade inválido!")
        }
        else{
            if(indiceHabilidade != 7) {

                println("\nVocê pode upar os valores para 9, 10, 11, 12, 13, 14 e 15")
                print("\nPara qual valor deseja upar? ")
                var valorHabilidade = readLine()?.toIntOrNull()?:0

                var custo: Int = 0

                if(valorHabilidade < 9 || valorHabilidade > 15){
                    println("Insira um valor válido!")
                }
                else{
                    when(valorHabilidade){
                        9 -> custo = 1
                        10 -> custo = 2
                        11 -> custo = 3
                        12 -> custo = 4
                        13 -> custo = 5
                        14 -> custo = 7
                        15 -> custo = 9
                    }

                    if(custo > pontos){
                        println("Você não possui os pontos necessários!")
                    }
                    else{
                        when(indiceHabilidade) {
                            1 -> forca = valorHabilidade
                            2 -> destreza = valorHabilidade
                            3 -> constituicao = valorHabilidade
                            4 -> inteligencia = valorHabilidade
                            5 -> sabedoria = valorHabilidade
                            6 -> carisma = valorHabilidade
                        }
                        pontos = pontos - custo
                    }
                }
            }
        }
    } while(pontos > 0 && indiceHabilidade != 7)


    var Personagem = personagem(nome, Raca, 1, 0.0, forca, destreza, constituicao, inteligencia, sabedoria, carisma, 10)

    Personagem.valorBonus()

    var modificador : Int = 0

    when(Personagem.constituicao){
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

    Personagem.vida += modificador

    return Personagem
}