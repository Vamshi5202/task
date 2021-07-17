package abstraction;
import abstraction.ProceedPayment;
import abstraction.*;

public class MainClass {
	public static void main(String[] args) {
		ProceedPayment pay=new ProceedPayment();
		Zomato zomato=pay.getObject();
		zomato.payment();
	}

}
