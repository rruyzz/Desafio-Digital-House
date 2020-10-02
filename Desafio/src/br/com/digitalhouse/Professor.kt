package br.com.digitalhouse

abstract class Professor(var nomeProfessor: String,
                         var sobrenomeProfessor: String,
                         var codigoProfessor: Int,
                         var tempoDeCasa: Int) {

    override fun equals(other: Any?): Boolean {
        other as Professor
        return this.codigoProfessor == other.codigoProfessor
    }
}