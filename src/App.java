import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de estudantes que vão alugar os quartos");
        int n = sc.nextInt();
        Estudante [] estudantes = new Estudante[10];
        for (int i = 0; i<n; i++){
            System.out.println("digite o nome");
            sc.next();
            String nome = sc.nextLine();
            System.out.println("digite o email");
            String email = sc.nextLine();
            System.out.println("digite o numero do quarto");
            int numeroQuarto = sc.nextInt();
            //e se eu quisesse criar um método em estudantes que faz isso pra mim??
            boolean disponivel = true;
            //erro!!!!
            //checar se o quarto ta disponível
            for(int x = 0; x<estudantes.length; x++){
                if(numeroQuarto==estudantes[x].getNumeroQuarto()){
                    disponivel = false;
                }
            }
            if(disponivel==false){
                System.out.println("Quarto não disponível");
            }
            else{
                estudantes[numeroQuarto] = new Estudante(nome, email, numeroQuarto);
                System.out.println("estudante cadastrado");
            }
        } 
            sc.close();
    }
}
       


