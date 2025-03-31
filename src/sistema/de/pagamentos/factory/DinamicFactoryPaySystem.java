package sistema.de.pagamentos.factory;

import java.util.HashMap;
import java.util.Map;


public class DinamicFactoryPaySystem {

	private static final Map<Integer, PaymentMethodFactory> payments = new HashMap<>();
	
	static {
		payments.put(1, new BoletoPaymentFactory());
		payments.put(2, new CreditCardPaymentFactory());
		payments.put(3, new PayPalPaymentFactory());
	}
	
	public static PaymentMethodFactory getTypeFactory(int factoryEscolhida) {
		return payments.get(factoryEscolhida);
	}
}
