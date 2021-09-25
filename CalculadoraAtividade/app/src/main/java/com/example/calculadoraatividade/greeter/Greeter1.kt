package com.example.calculadoraatividade.greeter

class GreeterTipo1(val cumprimento: String) {

    fun greet(nome: String): String{
        return "$cumprimento $nome"
    }
}