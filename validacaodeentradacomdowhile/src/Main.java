import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        Scanner sca = new Scanner ( System.in );

        //Declaracao de variáveis
        String senha;
        String senhacorreta = "Java21" ;

       do{
           System.out.print ( "Por favor coloque sua senha: ");
            senha = sca.nextLine();

            if (!senhacorreta.equalsIgnoreCase (senha)){
                System.out.println ( "Senha incorreta! Tente novamente!" );
            }

       } while (!senhacorreta.equalsIgnoreCase (senha));

        System.out.println ("Senha correta!");

        sca.close();
    }
}