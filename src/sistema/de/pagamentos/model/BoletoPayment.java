package sistema.de.pagamentos.model;

public class BoletoPayment extends PaymentMethod {

	private String method;
	
	public BoletoPayment (String method) {
		this.method = method;
	}

	@Override
	public void processPayment() {
		System.out.println("Boleto gerado e enviado ao seu email: " + method);
		
	}
	
}
