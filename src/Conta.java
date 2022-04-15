public class Conta {
	double saldo;
	double limite;
	int agencia;
	int numero;
	String titular;
	
	
	public void deposita (double deposito) {
		this.saldo +=deposito;
	}
	
	public boolean saque (double saque) {
		if(this.saldo>=saque) {
			this.saldo -=saque;
			return true;
		}else {
			return false;
		}
	
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo>=valor) {
			this.saldo-=valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}