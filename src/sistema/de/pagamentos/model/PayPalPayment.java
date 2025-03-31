package sistema.de.pagamentos.model;

public class PayPalPayment extends PaymentMethod {
	
	@SuppressWarnings("unused")
	private String method;
	
	public PayPalPayment (String method) {
		this.method = method;
	}

	// Aqui não achei válido repetir o código QR.
	@Override
	public void processPayment() {
		System.out.println("180 segundos para expirar");
		
	}

}
