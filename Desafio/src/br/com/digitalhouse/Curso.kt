package br.com.digitalhouse

class Curso (var nome: String,
             var codigoCurso: Int,
             var qtdMax: Int){

    var professorAdjunto: ProfessorAdjunto? = null
    var professorTitular: ProfessorTitular? = null
    var listaAlunoMatriculado: MutableList<Aluno> = mutableListOf()

    override fun equals(other: Any?): Boolean {
        other as Curso
        return this.codigoCurso == other.codigoCurso
    }

    fun adicionarUmAluno(umAluno: Aluno) {
        if((listaAlunoMatriculado.size < qtdMax)&&(!listaAlunoMatriculado.contains(umAluno))){
            true
        } else false

    }
    fun excluirAluno(umAluno: Aluno){
        if(listaAlunoMatriculado.contains(umAluno) ){
            listaAlunoMatriculado.remove(umAluno)
        }
    }
}