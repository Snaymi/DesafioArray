import java.util.Scanner;

public class DesafioArray {
    public static void main (String [] args) {

        int [][] matriz;
        String mes;
        Scanner scan = new Scanner (System.in);
        int dia;
        int hora;

        System.out.print("Vamos armazenar os compromissos de qual mês?");
        mes = scan.next();

            if (mes.equals("Janeiro")||mes.equals("janeiro")) {

                System.out.print("Janeiro tem 31 dias, qual é dia que sera agendado o primeiro compromisso? ");

                dia = scan.nextInt();

                    if (dia>0 && dia<32){
                        System.out.print("O dia tem 24 horas, qual horário é o primeiro compromisso?");
                        hora = scan.nextInt();
                            if(hora>0 && hora<25) {
                                
                                System.out.print("Compromisso marcado para " +hora+" horas do dia " +dia+" de "+ mes);
                                }else{
                                    System.out.print("hora inválida");}

                        }else {
                        System.out.print("Dia inválido\n");
                         }

            }else {System.out.print("erro");}
    }
}
