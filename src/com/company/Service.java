package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.Usuario.*;


public class Service {

    public static void main(String[] args) {
         mensagemPrincipal();
       LOL:
        while(true){
            Scanner login = new Scanner(System.in);
            System.out.println("Digite seu nome de usuario");
            nome = "Bruna";
            System.out.println("Digite sua senha");
            Usuario.cpf = "1234";


            List<String> usuarioList = new ArrayList<>();
            usuarioList.add(nome);
            usuarioList.add(Usuario.cpf);

            if(false){
                System.out.println("Voce tem duas tentativas");
                continue LOL;
        }else if(false){
                System.out.println("Você tem uma tentativa");
                continue LOL;
            }else if(false){
                System.out.println("Sistema encerrado");
                break;
            }
            Scanner achar = new Scanner(System.in);
        int opcaoEscolhida = achar.nextInt();

        if (opcaoEscolhida == 0) {
            System.out.println("Sistema Encerrado");
        }
        else if (opcaoEscolhida == 1){
            Scanner usuarioNovo = new Scanner(System.in);
            System.out.println("Digite seu nome de usuario");
            nome = usuarioNovo.nextLine();
            System.out.println("Digite seu cpf");
            Usuario.cpf = usuarioNovo.nextLine();
        }
        else if(opcaoEscolhida == 2){
            System.out.println(usuarioList);

        }
        else if(opcaoEscolhida == 3) {
            Scanner atualizacao = new Scanner(System.in);
//            for (int i = 0; i < usuariosList; i++) {
//                System.out.println("");
//            }
        }
            else if(opcaoEscolhida == 4){
//            for(int i = 0; i < usuarioList; i++) {
//                }
            }
            else if (opcaoEscolhida == 5){
                Scanner usuarioNovo = new Scanner(System.in);
                nome = usuarioNovo.nextLine();
                cpf = usuarioNovo.nextLine();
            }
        else if(opcaoEscolhida == 6) {
            Scanner scannear = new Scanner(System.in);
            System.out.println("Digite seu id");
            Produto.id = scannear.nextInt();
            System.out.println("Digite nome do produto");
            Produto.nomeProduto = scannear.nextLine();
            System.out.println("Digite quantidade");
            Produto.quantidadeProduto = scannear.nextInt();
            System.out.println("Informe o preço do produto");
            Produto.precoIndividual = scannear.nextDouble();
            System.out.println(precoFinal);

            if (precoFinal > 1000){
                Double desconto = 7.33;
                precoFinal = precoFinal % desconto;
                System.out.println("Preço final" + precoFinal);
            }
            else if(precoFinal < 1000){
                Double acrescimo = 3.33;
                precoFinal = precoFinal % acrescimo;
                System.out.println("Preço final" +precoFinal);

            }

        }

        }
    }

    public static void mensagemPrincipal() {
        Scanner Digite = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("Digite 0, para encerrar sistema");
        System.out.println("Digite 1,para criar um novo usuario ");
        System.out.println("Digite 2, para mostrar lista");
        System.out.println("Digite 3, para atualizar o usuario ");
        System.out.println("Digite 4, para deletar usuario da lista");
        System.out.println("Digite 5, para adicionar um novo usuario");
        System.out.println("Digite 6, para criar lista produto");
        System.out.println("=========================================");

    }


    }



