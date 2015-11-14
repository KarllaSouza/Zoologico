class Passaro extends Animal {
	Passaro(String nome, int idade, boolean corre, boolean voa){
		super(nome, idade, corre, voa);
		corre=false;
		voa=true;
	}
}
