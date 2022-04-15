
public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.titular = "Espanca";
		
		
		System.out.println(conta.titular+" quer comprar um jogo de 250 reais, mas só tem " + conta.saldo +"R$");
		
		
		double deposito = 150;
		
		System.out.println(conta.titular+" então faz um deposito de " + deposito+"R$");
		conta.deposita(100);
		
		System.out.println("Agora "+conta.titular+" tem " +conta.saldo + "R$");
		
		boolean sucesso = conta.saque(250);
		
		if (sucesso) {
			System.out.println("Agora "+conta.titular+"comprou e jogo e tem "+conta.saldo+"R$");
							
		} else {
			System.out.println("Agora "+conta.titular+" ta sem joguinho e ainda tem "+conta.saldo+"R$");
	
		}
		
		Conta bonus = new Conta();
		bonus.deposita(1000);
		bonus.titular="Bonus";
		
		
		if (bonus.transfere(50, conta)) {
			
			System.out.println("Saldo com o bonus "+conta.saldo+"R$");
		}else
		{
			System.out.println("Nem com o bonus de "+conta.saldo+"R$");
		}
		System.out.println(conta.titular+" Sendo que o Saldo é "+conta.saldo+" e o "+bonus.titular+" "+bonus.saldo);
		
	}
	
}
