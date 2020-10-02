package br.com.digitalhouse

open class Aluno (val nome: String, //trailing comma
             val sobrenome: String,
             val codigoDeAluno: Int) {

    override fun equals(other: Any?): Boolean {
        other as Aluno
        return this.codigoDeAluno == other.codigoDeAluno
    }
}
