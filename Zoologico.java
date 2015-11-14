public class Zoologico extends Animal{
	Zoologico(String nome, int idade, boolean corre, boolean voa){
		super(nome, idade, corre, voa);
	}
	
	static void imprimirNome(String nome){
		System.out.println("Nome: "+Animal.nome);
	}
	
	public static void main(String[] args) {
		Cachorro dog1 = new Cachorro("fila-Rufos", 2, true, false);		
		Cavalo horse1 = new Cavalo("andaluz-Duque", 2, true, false);
		Passaro bird1 = new Passaro("arara-Faísca", 2, false, true);	
		Cachorro dog2 = new Cachorro("dalmata-Rufos", 4, true, false);
		Cavalo horse2 = new Cavalo("arabe-Duque", 5, true, false);
		Passaro bird2 = new Passaro("gaivota-Faísca", 4, false, true);
		Cachorro dog3 = new Cachorro("pastorAlemao-Rufos", 3, true, false);
		Cavalo horse3 = new Cavalo("mustang-Duque", 2, true, false);
		Passaro bird3 = new Passaro("tucano-Faísca", 1, false, true);
		Cachorro dog4 = new Cachorro("beagle-Rufos", 1, true, false);
		
		Animal[] jaula = {dog1, horse1, bird1, dog2, horse2, bird2, dog3, horse3, bird3, dog4};
		
		for(int i=0;i<10;i++){
			//System.out.println("\n\nNome: "+jaula[i].nome+"    Idade: "+jaula[i].idade);
			System.out.println("\n");
			if(jaula[i] == dog1 || jaula[i] == dog2 || jaula[i] == dog3 || jaula[i] == dog4){
				corre=true;
				voa=false;
				System.out.println("• Cachorro: ");
				EmiteSom.somDoAnimal_cachorro();
				Comportamento.getComportamentoDoAnimal(jaula[i].corre, jaula[i].voa);
			}
			else if(jaula[i] == bird1 || jaula[i] == bird2 || jaula[i] == bird3){
				System.out.println("• Passaro: ");
				EmiteSom.somDoAnimal_passaro();
				//Comportamento.getComportamentoDoAnimal(jaula[i].corre, jaula[i].voa);
				Comportamento.comportamentoDoAnimal_voa();
			}
			else if(jaula[i] == horse1 || jaula[i] == horse2 || jaula[i] == horse3){
				corre=true;
				voa=false;
				System.out.println("• Cavalo: ");
				EmiteSom.somDoAnimal_cavalo();
				Comportamento.getComportamentoDoAnimal(jaula[i].corre, jaula[i].voa);
			}
		}
		
		System.out.println("\n\n          Visitando o Veterinário...\n");
		
		for(int exame=0;exame<10;exame++){
			System.out.println("\n"+(exame+1)+"º exame...");
			Veterinario.main(args);
		}
		System.out.println("\n...Fim da visita do veterinario...");
	}
}
