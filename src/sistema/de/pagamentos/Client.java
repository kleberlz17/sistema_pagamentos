package sistema.de.pagamentos;

import java.util.Scanner;

import sistema.de.pagamentos.factory.DinamicFactoryPaySystem;
import sistema.de.pagamentos.factory.PaymentMethodFactory;
import sistema.de.pagamentos.model.PaymentMethod;

public class Client {

	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha o metodo de pagamento: (1: Boleto, 2: CreditCard, 3: PayPal): ");
		int factoryEscolhida = scanner.nextInt();
		scanner.nextLine();
		
		PaymentMethodFactory paymentFactory = DinamicFactoryPaySystem.getTypeFactory(factoryEscolhida);
		
		if(paymentFactory == null) {
			System.out.println("Opção inválida, selecione um dos metodos disponíveis");
		} else  {
			String emailBoleto = "";
			String cartaoNumero = "";
			String qrCode = "";
			
			// Diferente comportamento conforme o método de pagamento escolhido.
			if(factoryEscolhida == 1) { // Boleto
				System.out.println("Digite seu email para envio do boleto: ");
				emailBoleto = scanner.nextLine();
			} else if(factoryEscolhida == 2) { // Cartão de crédito
				System.out.println("Digite o número do seu cartão de crédito: ");
				cartaoNumero = scanner.nextLine();
			} else if(factoryEscolhida == 3) { // PayPal
				qrCode = "" + Math.random();
				System.out.println("Seu código QR para pagamento via PayPal: " + qrCode);
			}
			
			PaymentMethod payment = paymentFactory.createPaymentMethod(emailBoleto, cartaoNumero, qrCode);
			payment.processPayment();
		}
		
		scanner.close();
	}
}
