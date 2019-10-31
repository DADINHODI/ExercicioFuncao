import java.util.Scanner;
public class ExercicioFunção {
	public static void main(String [] args) {
		Scanner ler= new Scanner(System.in);
		int f,n,t,m,o;
		do {
		System.out.println("Digite o número do Exercício: ");
		System.out.println("1 = Fatorial");
		System.out.println("2 = Tabuada");
		System.out.println("3 = Aposentadoria");
		System.out.println("4 = Potência");
		m = ler.nextInt();
		
		switch(m) {
			case 1:
				{
					System.out.println("digite o numero a ser fatorado:");
					f=ler.nextInt();
					System.out.println(fatorial(f));
					break;
				}
			case 2:
				{
					System.out.println("digite o numero a ser tabuado:");
					t=ler.nextInt();
					tabuada(t);
					break;
				}
			case 3:
			{
				System.out.println("digite o seu sexo:");
				String sexo;
				int idade;
				sexo = ler.next();
				System.out.println("Digite a sua idade:");
				idade = ler.nextInt();
				sexo(idade,sexo);
				break;
			}
			case 4:
			{
			potência();
			}
		}
		System.out.println("Deseja continuar?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		o= ler.nextInt();
		}while(o==1);
		
		
		
		
	}
	public static int fatorial (int f) {
		int h=f;
		 for(int i=1;i<h;i++){
				f=f*i;  
			}
		return f;
	}
	public static void tabuada (int n) {
		int r=n;
		for(int i=0;i<11;i++) {
		r = n*i;
		System.out.println(n+" X "+i+" = "+r);
		}
	}
	public static void sexo(int idade, String sexo) {
		switch(sexo) {
			case "feminino":
			{
				if (idade >=55) {
					System.out.println("Aposentada");
				}else {
					System.out.println("Você não está aposentada");
				}
				break;
			}
			case "masculino":
			{
				if (idade >=60) {
					System.out.println("Aposentado");
				}else {
					System.out.println("Você não está aposentado");
				}
				break;
			}
			default:
			{
				System.out.println("Sexo negado");
				break;
			}
		}
	}
	public static void potência () {
		Scanner ler= new Scanner(System.in);
		System.out.println("digite a base:");
		int b= ler.nextInt();
		System.out.println("digite o expoente:");
		int e = ler.nextInt();
		int r=0;
		for(int i=0; i<e; i++ ){			
            r=b*b;
        }
        System.out.println(r);
	}
}
