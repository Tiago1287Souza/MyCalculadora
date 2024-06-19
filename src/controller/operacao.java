/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import model.Calculadora;

/**
 *
 * @author PC
 */
public class operacao {

    Calculadora cal = new Calculadora();

    Scanner coletor = new Scanner(System.in);

    public void coletor() throws Exception {
        

        System.out.println("=========== CALCULADORA ===========");
        System.out.println("");
        System.out.println("1---SOMA");
        System.out.println("");
        System.out.println("2---SUBTRACAO");
        System.out.println("");
        System.out.println("3---MULTIPLICACAO");
        System.out.println("");
        System.out.println("4---DIVISAO");
        System.out.println("================================");
        System.out.println("");

        System.out.println("DIGITE A OPERACAO!!!");

        int Operacao = coletor.nextInt();

        switch (Operacao) {
            case 1 ->
                cal.setOperacao("SOMA");
            case 2 ->
                cal.setOperacao("SUBTRAÇÃO");
            case 3 ->
                cal.setOperacao("MULTIPLICACAO");
            case 4 ->
                cal.setOperacao("DIVISÃO");

            default ->
                throw new Exception("Opcao Invalida!!");

        }

    }

    public void coletarValores() {

        System.out.println("=====================");
        System.out.println("");
        System.out.println("PRIMEIRO VALOR");
        cal.setValor1(coletor.nextDouble());
        System.out.println("=====================");
        
        System.out.println("OPERACAO SELECIONADA:" + cal.getOperacao());

        System.out.println("=====================");
        System.out.println("");
        System.out.println("SEGUNDO VALOR");
        cal.setValor2(coletor.nextDouble());

    }

    public String selecionarOperacao() {
        return switch (cal.getOperacao()) {
            case "SOMA" ->
                soma(cal);
            case "SUBTRAÇÃO" ->
                subtracao(cal);
            case "MULTIPLICACAO" ->
                multiplicacao(cal);
            case "DIVISÃO" ->
                divisao(cal);
            default ->
                "Operacao invalida!";
        };
    }

//    public String selecionarOperacao(Calculadora objeto){
//     String mensagemRetorno;
//    mensagemRetorno = switch (objeto.getOperacao()) {
//        case "soma" ->
//                soma(objeto);
//         case "subtracao" ->
//                subtracao(objeto);
//                case "multiplicacao" ->
//                multiplicacao(objeto);
//                
//                default ->
//                divisao(objeto);
//    };
//    return mensagemRetorno;
//    }
    public String soma(Calculadora objeto) {

        double resultado = objeto.getValor1() + objeto.getValor2();
        System.out.println("");
        String mensagemRetorno = "O RESULTADO DA SOMA FOI DE " + resultado;
        return mensagemRetorno;

    }

    public String subtracao(Calculadora objeto) {

        double resultado = objeto.getValor1() - objeto.getValor2();
        System.out.println("");
        String mensagemRetorno = "O RESULTADO DA SUBRTRACAO FOI DE " + resultado;
        return mensagemRetorno;

    }

    public String multiplicacao(Calculadora objeto) {

        double resultado = objeto.getValor1() * objeto.getValor2();
        System.out.println("");
        String mensagemRetorno = "O RESULTADO DA MULTIPLICACAO FOI DE " + resultado;
        return mensagemRetorno;

    }

    public String divisao(Calculadora objeto) {

        double resultado = objeto.getValor1() / objeto.getValor2();
        System.out.println("");
        String mensagemRetorno = "O RESULTADO DA DIVISAO FOI De " + resultado;
        return mensagemRetorno;

    }

}
