package com.br.monitoria.iap;



import java.util.Scanner;

public class Sistema { 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String produto1="", produto2="", produto3="";
        int opcao, controle1=0,controle2=0,controle3=0, controle4=0, controle5=0
                , quantidadeProduto1=0, quantidadeProduto2=0, quantidadeProduto3=0;
        double preco1=0.0, preco2=0.0, preco3=0.0, precoTotal=0, opcaoPag;
        
        do{
            
            System.out.println("1- Cadastro de produto: ");
            System.out.println("2- Cadastro dos preços: ");
            System.out.println("3- Compra dos produtos: ");
            System.out.println("4- Fechar Compra: ");
            System.out.println("5- Listar produtos e preços");
            System.out.println("9- --Encerrar Programa-- ");
            opcao = scan.nextInt();
            
            switch(opcao){
                case 1:
                    if(controle1>0){
                        System.out.println("Operação já foi realizada");
                    }else{
                        System.out.println("Cadastre o primeiro produto:");
                        produto1 = scan.next();
                        System.out.println("Cadastre o segundo produto:");
                        produto2 = scan.next();
                        System.out.println("Cadastre o terceiro produto:");
                        produto3 = scan.next();
                        controle1++;
                    }
                break;
                    
                case 2:
                    if(controle2>0){
                        System.out.println("Operação já realizada");
                    }else if(controle1==0){
                        System.out.println("Não realizou umas das operações acima");
                    }else{
                        System.out.println("Cadastre o preço da "+produto1);
                        preco1 = scan.nextDouble();
                        System.out.println("Cadastre o preço da "+produto2);
                        preco2 = scan.nextDouble();
                        System.out.println("Cadastre o preço da "+ produto3);
                        preco3 = scan.nextDouble();
                        controle2++;
                    }
                break;
                    
                case 3:
                    if(controle3>0){
                        System.out.println("Operação ja realizada");
                    }else if(controle1==0 || controle2==0){
                        System.out.println("Não realizou uma das operações acima");
                    }else{
                        
                        char resp='s';
                        while(resp == 's'){
                            System.out.println("Deseja comprar "+ produto1+" ?"+" Preço="+preco1+" (s ou n)");
                            resp = scan.next().charAt(0);
                            quantidadeProduto1++;
                        }
                        
                        resp='s';
                        while(resp == 's'){
                            System.out.println("Deseja comprar "+ produto2+" ?"+" Preço="+preco2+" (s ou n)");
                            resp = scan.next().charAt(0);
                            quantidadeProduto2++;
                        }
                        
                        resp='s';
                        while(resp == 's'){
                            System.out.println("Deseja comprar "+ produto3+" ?"+" Preço="+preco3+" (s ou n)");
                            resp = scan.next().charAt(0);
                            quantidadeProduto3++;
                        }
                      
                        precoTotal = (preco1*quantidadeProduto1)+(preco2*quantidadeProduto2)+(preco3*quantidadeProduto3);
                        controle3++;
                    }
                                     
                break;
                    
                case 4:
                    if(controle4>0){
                        System.out.println("Operação já realizada");
                    }else if(controle1==0 || controle2==0 || controle3==0){
                        System.out.println("Não realizou uma das operações acima");
                    }else{
                        System.out.println("Total de compras de"+produto1+": "+quantidadeProduto1+"."
                                + "\nPreço unitário:"+ preco1);
                        System.out.println("Total de compras de"+produto2+": "+quantidadeProduto2+"."
                                + "\nPreço unitário:"+ preco2);
                        System.out.println("Total de compras de"+produto3+": "+quantidadeProduto3+"."
                                + "\nPreço unitário:"+ preco3);
                        
                        System.out.println("Preco Total das compras: "+precoTotal);
                        
                        System.out.println("Escolha forma de pagamento:"
                                + "\n1- Dinheiro\n2- Cheque\n3- Cartão");
                        opcao = scan.nextInt();
                        
                        
                        switch(opcao){
                            case 1:
                                
                                System.out.println("Insira seu valor em Dinheiro: ");
                                opcaoPag = scan.nextDouble();
                                if(precoTotal>opcaoPag){
                                    System.out.println("Dinheiro inserido não suficiente para compra");
                                }else{
                                    System.out.println("Seu troco: "+ (precoTotal-opcaoPag));
                                }
                            break;
                                
                            case 2:
                                System.out.println("Valor a ser pago no cheque: "+precoTotal);
                            break;
                            case 3:
                                System.out.println("Transação feita com sucesso");
                        }
                        
                        controle4++;
                    }
                    
                break;
                    
                case 5:
                    if(controle1==0 || controle2==0 || controle3==0 || controle4==0){
                        System.out.println("Não realizou uma das operações acima");
                        
                    }else{
                        System.out.println(produto1+" preço:"+preco1);
                        System.out.println(produto2+" preço:"+preco2);
                        System.out.println(produto3+" preço:"+preco3);
                    }
                break;
            }
            
        }while(opcao != 9);
        System.out.println("--PROGRAMA FINALIZADO--");
        
    }  
}
