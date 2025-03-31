package sistema.de.pagamentos.factory;

import sistema.de.pagamentos.model.PaymentMethod;

public abstract class PaymentMethodFactory {

	public abstract PaymentMethod createPaymentMethod(String metodoCriado, String metodoCriado2, String metodoCriado3);
}
