import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        ArrayList<Conta> contas = new ArrayList<>();




        Scanner scan = new Scanner(System.in);
        int option = -1;
        Usuario user01 = new Usuario();
        Usuario user02 = new Usuario();
        user01.setName("Gabriel Messias");
        user01.getContaObj().setTipo("Conta Corrente");
        user01.getContaObj().setSaldo(1500);
        user02.setName("Larissa Batista");
        user02.getContaObj().setTipo("Conta Poupança");
        user02.getContaObj().setSaldo(2000);


        for (int i = 0; option !=4; i++) {
            System.out.println("""
                ************************************************************************************
                Menu
                1- Consultar saldos
                2- Realizar transferências
                3- Realizar depósito
                4- Sair
                ************************************************************************************
                """);
            option = scan.nextInt();
            scan.nextLine();
            switch (option){
                case 1:
                    System.out.println( "Usuário: "+user01.name);
                    System.out.println("Saldo R$:" + user01.getContaObj().getSaldo());
                    System.out.println( "Tipo de conta: " + user01.getContaObj().getTipo()) ;
                    System.out.println("************************************************************************************");
                    System.out.println( "Usuário: "+user02.name);
                    System.out.println("Saldo R$:" + user02.getContaObj().getSaldo());
                    System.out.println( "Tipo de conta: " + user02.getContaObj().getTipo()) ;
                    break;

                case 2:
                    {

                        System.out.println("Insira o nome do usuario da conta para qual deseja transferir: ");
                        String name = scan.nextLine();
                        System.out.println("Insira o valor da transferência: ");
                        double valorTransf = scan.nextDouble();
                        if(name.equals("Gabriel Messias")){

                            user02.getContaObj().transfer ("Larissa Batista",valorTransf, user01);
                        }else if (name.equals("Larissa Batista") ){
                            user01.getContaObj().transfer ("Gabriel Messias",valorTransf, user02);
                        }
                    }

                    break;

                case 3:
                    System.out.println("Insira o nome do usuario da conta que deseja depositar: ");
                    String name = scan.nextLine();

                    System.out.println("Insira o valor do depósito: ");
                    double valorDep = scan.nextDouble();
                    if(name.equals("Gabriel Messias")){

                    user01.getContaObj().setSaldo (valorDep);
                    }else if (name.equals("Larissa Batista") ){
                        user02.getContaObj().setSaldo (valorDep);
                    }


                    break;

                case 4:

                    break;


                default:
                    System.out.println("Opção incorreta");
                    break;
            }
        }


    }

}
