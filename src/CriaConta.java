
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta  = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo +=100;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Saldo da primeira conta ? " + primeiraConta.saldo);
		
		System.out.println("Saldo da segunda cointa ? " +segundaConta.saldo);
		
		
		System.out.println(primeiraConta.titular);
	}
}