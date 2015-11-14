class Cachorro extends Animal{
	Cachorro(String nome, int idade, boolean corre, boolean voa){
		super(nome, idade, corre, voa);
		corre=true;
		voa=false;
	}
}
