import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner (System.in);

        int anos, meses, dias;
        int idadeEmDias;

        System.out.println("Digite a idade em anos:");
        anos = leitor.nextInt();
        System.out.println("Digite a idade em meses:");
        meses = leitor.nextInt();
        System.out.println("Digite a idade em dias:");
        dias = leitor.nextInt();

        idadeEmDias = anos * 365 + meses * 30 + dias;

        System.out.println("Idade em dias: " + idadeEmDias);
    }
}
