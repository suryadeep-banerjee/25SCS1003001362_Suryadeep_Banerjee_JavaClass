class Payment {

	void makePayment() {
		System.out.println("Processing payment");
	}
}

class CreditCardPayment extends Payment {

	void makePayment() {
		System.out.println("Credit card payment successful.");
	}
}

class UPIPayment extends Payment {

	void makePayment() {
		System.out.println("UPI payment successful.");
	}
}

class CashPayment extends Payment {

	void makePayment() {
		System.out.println("Cash payment successful.");
	}
}

public class PaymentSystem {

	public static void main(String[] args) {
		Payment p;
		p = new CreditCardPayment();
		p.makePayment();
		p = new UPIPayment();
		p.makePayment();
		p = new CashPayment();
		p.makePayment();
	}
}
