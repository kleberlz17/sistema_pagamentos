package sistema.de.pagamentos.factory;

import sistema.de.pagamentos.model.BoletoPayment;
import sistema.de.pagamentos.model.PaymentMethod;

public class BoletoPaymentFactory extends PaymentMethodFactory {
	

	@Override
	public PaymentMethod createPaymentMethod(String metodoCriado, String metodoCriado2, String metodoCriado3) {
		return new BoletoPayment (metodoCriado);
	
		
	}

}
