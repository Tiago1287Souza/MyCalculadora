/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import controller.operacao;
import model.Calculadora;

/**
 *
 * @author PC
 */
public class main {

    public static void main(String[] args) throws Exception {

        operacao Operacao = new operacao();
        Calculadora calculadora = new Calculadora();

        Operacao.coletor();// Coleta a operação do usuário
        Operacao.coletarValores();  // Coleta os valores do usuário
        String resultado = Operacao.selecionarOperacao();
        //String resultado = Operacao.selecionarOperacao(calculadora);
        System.out.println(resultado); // Exibe o resultado
    }
}
