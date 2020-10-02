package br.com.digitalhouse

class ProfessorAdjunto(nomeProfessor: String,
                       sobrenomeProfessor: String,
                       codigoProfessor: Int,
                       tempoDeCasa: Int,
                       val quantidadeHoras: Int) : Professor(nomeProfessor,sobrenomeProfessor, tempoDeCasa, codigoProfessor) {
}