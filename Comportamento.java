class Comportamento extends Zoologico{
	
	private static Object[] jaula;

	Comportamento(String nome, int idade, boolean corre, boolean voa) {
		super(nome, idade, corre, voa);
	}
	static boolean comportamento=false;

	protected static boolean getComportamentoDoAnimal(boolean corre, boolean voa){
		if(Animal.corre=true){
			corre=true;
			comportamento = corre;
			Comportamento.comportamentoDoAnimal_corre();
		} else if(Animal.voa=true){
			voa=true;
			comportamento = voa;
			Comportamento.comportamentoDoAnimal_voa();
		}
		return comportamento;
	}
	
	protected static void comportamentoDoAnimal_corre(){
		System.out.print("\n    - Corre");
	}

	protected static void comportamentoDoAnimal_voa(){
		System.out.print("\n    - Voa");
	}
}
