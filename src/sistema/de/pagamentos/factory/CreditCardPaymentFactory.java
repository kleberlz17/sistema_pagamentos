package sistema.de.pagamentos.factory;

import sistema.de.pagamentos.model.CreditCardPayment;
import sistema.de.pagamentos.model.PaymentMethod;

public class CreditCardPaymentFactory extends PaymentMethodFactory {

	@Override
	public PaymentMethod createPaymentMethod(String metodoCriado, String metodoCriado2, String metodoCriado3) {
		return new CreditCardPayment(metodoCriado2);
	}

}
