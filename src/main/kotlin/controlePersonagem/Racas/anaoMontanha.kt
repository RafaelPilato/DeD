package org.example.controlePersonagem.Racas

class anaoMontanha (override val aparenciaGeral: String = "Homem da montanha pequeno",
                    override var deslocamento: Double = 7.5,
                    override var idiomas: Array<String> = arrayOf("Comum", "Anão")) :
    org.example.controlePersonagem.Racas.raca {

}