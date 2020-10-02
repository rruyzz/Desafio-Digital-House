package br.com.digitalhouse

fun main() {
    var gerente = DigitalHouseManager()

    //REGISTRAR CURSO
    println("REGISTRANDO CURSO")
    gerente.registrarCurso("Full Stack", 20001, 3)
    gerente.registrarCurso("Android", 20002, 2)

    println("-----------------------------------------------------------------------")
    println("MOSTRANDO CURSOS REGISTRADOS")
    gerente.mostrarCursos()

    println("-----------------------------------------------------------------------")

    //REGISTRAR PROFESSOR TITULAR
    println("REGISTRANDO PROFESSOR TITULAR")
    gerente.registrarProfessorTitular("Vitor", "Leone", 1001, "Android")
    gerente.registrarProfessorTitular("Marina", "Clembo", 1002, "Web")

    println("-----------------------------------------------------------------------")

    //REGISTRAR PROFESSOR ADJUNTO
    println("REGISTRANDO PROFESSOR ADJUNTO")
    gerente.registrarProfessorAdjunto("Dilermando", "Queiroz", 1003, 0)
    gerente.registrarProfessorAdjunto("Natália", "Soares", 1004, 0)

    println("-----------------------------------------------------------------------")
    println("MOSTRANDO PROFESSORES REGISTRADOS")
    gerente.mostrarProf()

    println("-----------------------------------------------------------------------")

    //ALOCAR PROFESSORES NOS CURSOS
    println("ALOCOANDO PROFESSORES NO CURSO")

    gerente.alocarProfessor(20001,1001,1003)
    gerente.alocarProfessor(20002,1002,1004)


    println("-----------------------------------------------------------------------")

    //MATRICULAR ALUNOS EM CURSOS
    println("MATRICULANDO ALUNOS EM CURSOS")
        //REGISTRAR ALUNOS
        println("REGISTRANDO ALUNOS")
        gerente.matricularAluno("Mirian", "Soares", 101)
        gerente.matricularAluno("Paula", "Queiroz", 102)
        gerente.matricularAluno("Manoel", "Araujo", 103)
        gerente.matricularAluno("Thiago", "Santos", 104)
        gerente.matricularAluno("Ronaldinho","Gaucho", 105)
    println("MOSTRANDO ALUNOS")
    gerente.mostrarAlunos()


    println("-----------------------------------------------------------------------")


    //MATRICULAR ALUNOS EM FULL STACK
    println("MATRICULANDO ALUNOS EM FULL STACK")
    gerente.matricularAlunoCurso(101,20001)
    gerente.matricularAlunoCurso(102,20001)

    println("-----------------------------------------------------------------------")


    //MATRICULAR ALUNOS EM ANDROID
    println("MATRICULANDO ALUNOS EM ANDROID")
    gerente.matricularAlunoCurso(103, 20002)
    gerente.matricularAlunoCurso(104,20002)
    gerente.matricularAlunoCurso(105,20002)

    //TESTES

    println("TESTES")


    //Tentativa de registrar um curso já registrado
    gerente.registrarCurso("Full Stack", 20001, 3)

    //Excluindo Curso
    gerente.excluirCurso(20001)
    gerente.mostrarCursos()

    //Adicionando curso excluido
    gerente.registrarCurso("Full Stack", 20001, 3)
    gerente.mostrarCursos()

    //Exclindo curso nao existente
    gerente.excluirCurso(10)

    //Registrar Professor ja Registrado
    gerente.registrarProfessorTitular("Vi", "Leone", 1001, "Android")



}