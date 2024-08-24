package org.example
import org.example.controlePersonagem.*

fun main() {
    var player1 = construirPersonagem()

    println("Nome: " + player1.nome)
    println("Raca: " + player1.racaPersonagem)
    println("Nivel: " + player1.nivel)
    println("XP: " + player1.xp)
    println("Forca: " + player1.forca)
    println("Destreza: " + player1.destreza)
    println("Constituicao: " + player1.constituicao)
    println("Inteligencia: " + player1.inteligencia)
    println("Sabedoria: " + player1.sabedoria)
    println("Carisma: " + player1.carisma)
    println("Vida: " + player1.vida)
}