import java.util.Scanner;
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        int soma;
        int soma2;
        int media = 6;

        Alunos aluno1 = new Alunos();

        System.out.println("Ola, vou precisar das seguintes informaçoes");
        System.out.println("Informe o nome do aluno:");

        aluno1.nomeAluno = scan.nextLine();

        System.out.println("Insira o sobre nome do aluno:");
        aluno1.sobreNomeAluno =scan.nextLine();

        System.out.println("Informe por gentileza a nota referente  primeira prova");
        nota1 = scan.nextDouble();


        System.out.println("Informe por gentileza a nota referente  segunda prova");
        nota2 = scan.nextDouble();


        System.out.println("Informe por gentileza a nota referente  terceira prova");
        nota3 = scan.nextDouble();

        sum(nota1, nota2, nota3);

        System.out.println("Informe a soma dos valores:");
        soma = (int) scan.nextDouble();
        div(soma);

        System.out.println("Informe a Divisão da nota :");
        soma2 = (int) scan.nextDouble();
       
        if(soma2 >= media){
            System.out.println("Parabens aluno está aprovado");
        }else if(soma2 == 5){
            System.out.println("Aluno em questão está em recuperação:");
        }else{
            System.out.println("Aluno está reprovado, por gentileza procurar a Diretoria:");
        }

        System.out.print(aluno1.nomeAluno);
        System.out.println(aluno1.sobreNomeAluno);
        System.out.println(" Boa sorte.");

    }
    static void sum(double x, double y,double i){
        System.out.println(  x + y + i);
    }
    static void div ( int y){
        System.out.println(y/3);
    }
}
