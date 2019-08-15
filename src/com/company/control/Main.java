package com.company.control;

import com.company.model.Carro;
import com.company.model.Conta;
import com.company.model.Funcionario;
import com.company.model.Produto;

public class main {

    public static void main(String[] args){

        Produto produto = new Produto();
            System.out.println(produto);
        System.out.println(produto.getValor());

        Carro carro = new Carro();
            System.out.println(carro.getMarca());

        Funcionario funcionario = new Funcionario();
            System.out.println(funcionario.getSalario());

         Conta conta = new conta();
            System.out.println(conta.getSaldo());


    }

}


