package br.com.digitalhouse

class ProfessorTitular(nomeProfessor: String,
                       sobrenomeProfessor: String,
                       codigoProfessor: Int,
                       tempoDeCasa: Int,
                       var especialidade: String) : Professor(nomeProfessor, sobrenomeProfessor, tempoDeCasa, codigoProfessor) {
}