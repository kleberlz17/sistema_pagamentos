package sistema.de.pagamentos.model;

public class CreditCardPayment extends PaymentMethod {

	@SuppressWarnings("unused")
	private String method;
	
	public CreditCardPayment(String method) {
		this.method = method;
	}

	// Aqui não achei válido repetir o número do cartão por questões de segurança.
	@Override
	public void processPayment() {
		System.out.println("Processando o pagamento... Pagamento efetuado ");
		
	}
}
