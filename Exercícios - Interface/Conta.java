package um;

class Conta {
	
	 Cliente cliente;
	 int numero;
	 double saldo;
	
	  public Conta(Cliente cliente, int numero, double saldo) {
	        this.cliente = cliente;
	        this.numero = numero;
	        this.saldo = saldo;
	    }

	    public void mostrarDados() {

	        System.out.println("Cliente: " + cliente.nome);

	        System.out.println("CPF: " + cliente.cpf);

	        System.out.println("Número da conta: " + numero);

	        System.out.println("Saldo: " + saldo);
	    }
	}