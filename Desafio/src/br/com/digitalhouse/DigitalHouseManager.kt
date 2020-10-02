package br.com.digitalhouse

import java.util.*

class DigitalHouseManager() {

    var listaDeAluno: MutableList<Aluno> = mutableListOf<Aluno>()
    var listaDeProfessores: MutableList<Professor> = mutableListOf<Professor>()
    var listaDeCurso: MutableList<Curso> = mutableListOf<Curso>()
    var listaDeMatricula: MutableList<Matricula> = mutableListOf<Matricula>()

    //REGISTRAR CURSO
    fun registrarCurso(nome: String, codigoCurso: Int, qtdMax: Int) {
        val curso = Curso(nome, codigoCurso, qtdMax)
        if (!listaDeCurso.contains(curso)) {
            listaDeCurso.add(curso)
            println("Curso ${curso.nome} registrado com sucesso")
        } else println("Curso ${curso.nome} ja foi registrado anteriormente")
    }

    //EXCLUIR CURSO
    fun excluirCurso(codigoCurso: Int) {
        for (curso in listaDeCurso) {
            if (curso.codigoCurso == codigoCurso) {
                listaDeCurso.remove(curso)
                println("Curso ${curso.nome} excluido com sucesso")
            } else{
                println("Código $codigoCurso nao valido")
                break
            }
        }
    }


    //REGISTRAR PROFESSOR TITULAR
    fun registrarProfessorTitular(nomeProfessor: String,
                                  sobrenomeProfessor: String,
                                  codigoProfessor: Int,
                                  especialidade: String) {
        var tempoDeCasa = 0
        var novoProfTitular = ProfessorTitular(nomeProfessor, sobrenomeProfessor, tempoDeCasa, codigoProfessor, especialidade)
        if (!listaDeProfessores.contains(novoProfTitular)) {
            listaDeProfessores.add(novoProfTitular)
            println("Professor Titular ${novoProfTitular.nomeProfessor} registrado com sucesso")
        } else println("Professor Titular ${novoProfTitular.nomeProfessor} ja foi registrado anteriormente")
    }

    //REGISTRAR PROFESSOR ADJUNTO
    fun registrarProfessorAdjunto(nomeProfessor: String,
                                  sobrenomeProfessor: String,
                                  codigoProfessor: Int,
                                  quantidadeDeHoras: Int) {
        var tempoInicial = 0
        var novoProfAdjunto = ProfessorAdjunto(nomeProfessor, sobrenomeProfessor, tempoInicial, codigoProfessor, quantidadeDeHoras)
        if (!listaDeProfessores.contains(novoProfAdjunto)) {
            listaDeProfessores.add(novoProfAdjunto)
            println("Professor Adjunto ${novoProfAdjunto.nomeProfessor} registrado com sucesso")
        } else println("Professor Adjunto ${novoProfAdjunto.nomeProfessor} ja foi registrado anteriormente")
    }

    //EXCLUIR PROFESSOR
    fun excluirProfessor(codigo: Int) {
        for (professor in listaDeProfessores) {
            if (professor.codigoProfessor == codigo) {
                listaDeProfessores.remove(professor)
                println("Professor ${professor.nomeProfessor} excluido com sucesso")
            } else println("Professor ${professor.nomeProfessor} não encontrado")
        }
    }
    //ALOCAR PROFESSOR
    fun alocarProfessor(codigoCurso: Int, codigoProfTitular: Int, codigoProfAdj: Int) {

        for (curso in listaDeCurso) {
            if (curso.codigoCurso == codigoCurso) {
                for (prof in listaDeProfessores) {
                    if (prof.codigoProfessor == codigoProfTitular) {
                        curso.professorTitular == prof
                        println("Professor Titular ${prof.nomeProfessor} alocado com sucesso")
                    }
                }

                for (prof in listaDeProfessores) {
                    if (prof.codigoProfessor == codigoProfAdj) {
                        curso.professorAdjunto == prof
                        println("Professor Adjunto ${prof.nomeProfessor} registrado com sucesso")
                    }
                }
            }
        }
    }

    //MATRICULAR ALUNO
    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        var novoAluno = Aluno(nome, sobrenome, codigoAluno)
        if (!listaDeAluno.contains(novoAluno)) {
            listaDeAluno.add(novoAluno)
            println("Novo aluno ${novoAluno.nome} registrado com sucesso")
        } else println("Aluno ${novoAluno.nome} ja foi matriculado anteriormente")
    }

    //MATRICULAR ALUNO EM CURSO
    fun matricularAlunoCurso(codigoAluno: Int, codigoCurso: Int) {
        var data = Date()
        for (curso in listaDeCurso) {
            if (curso.codigoCurso == codigoCurso) {
                for (alu in listaDeAluno) {
                    if (alu.codigoDeAluno == codigoAluno) {
                        if (curso.qtdMax > listaDeMatricula.size) {
                            var curso = curso
                            var novoAluno = alu
                            var novaMatricula = Matricula(novoAluno, curso, data)
                            println("${novoAluno.nome} matriculado no curso ${curso.nome}")
                        } else println("Curso não possui mais vagas")
                    }
                }
            }
        }

    }
    fun mostrarAlunos() {
        for (alunos in listaDeAluno) {
            println("Aluno: ${alunos.nome} ${alunos.sobrenome}")
            println("Código do Aluno ${alunos.nome}: ${alunos.codigoDeAluno}")
        }
    }

    fun mostrarCursos() {
        for (cursos in listaDeCurso) {
            println("${cursos.nome}")
            println("Codigo do Curso:${cursos.codigoCurso}")
            println("Quantidade máxima de alunos no curso ${cursos.nome} ${cursos.qtdMax}")
        }
    }

    fun mostrarProf() {
        for (professor in listaDeProfessores) {
            println("Nome do Professor: ${professor.nomeProfessor} ${professor.sobrenomeProfessor}")
            println("Codigo do Professor ${professor.nomeProfessor}:  ${professor.codigoProfessor}")
        }
    }




}

