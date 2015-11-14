import java.util.Scanner;

class Veterinario{
	static Scanner in = new Scanner(System.in);
	
	static protected void examinarCachorro(){
		EmiteSom.somDoAnimal_cachorro();
	}
	static protected void examinarCavalo(){
		EmiteSom.somDoAnimal_cavalo();
	}
	static protected void examinarPassaro(){
		EmiteSom.somDoAnimal_passaro();
	}
	
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("dog", 3, true, false);
		Cavalo cavalo = new Cavalo ("horse", 7, true, false);
		Passaro passaro = new Passaro ("bird", 5, false, true);
		
		System.out.println("Qual animal será examinado?\n  1- cachorro\n  2- cavalo\n  3-pássaro");
		int animalExaminar=in.nextInt();
		switch(animalExaminar){
			case 1:
				examinarCachorro();
				System.out.println("\n\nEste animal foi examinado.");
				break;
			case 2:
				examinarCavalo();
				System.out.println("\n\nEste animal foi examinado.");
				break;
			case 3:
				examinarPassaro();
				System.out.println("\n\nEste animal foi examinado.");
				break;
			default:
				System.out.println("Opção Inválida! Exame cancelado.");
		}
	}
}
