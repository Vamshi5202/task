package useabstraction;
import abstraction.*;
public class User {
	public static void main(String[] args) {
		Zomato zomato=ProceedPayment.getObject();
		zomato.payment();
	}

}
