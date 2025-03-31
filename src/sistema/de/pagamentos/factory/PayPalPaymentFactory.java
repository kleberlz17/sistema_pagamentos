package sistema.de.pagamentos.factory;

import sistema.de.pagamentos.model.PayPalPayment;
import sistema.de.pagamentos.model.PaymentMethod;

public class PayPalPaymentFactory extends PaymentMethodFactory {

	
	public PaymentMethod createPaymentMethod(String metodoCriado, String metodoCriado2, String metodoCriado3) {
		return new PayPalPayment(metodoCriado3);
	}

}
