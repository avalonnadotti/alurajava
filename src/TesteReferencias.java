
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		//Conta segundaConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo da segunda conta "+segundaConta.saldo);
		
		segundaConta.saldo+=100;
		
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		
		System.out.println(primeiraConta.saldo);
		
	}
	
	
}