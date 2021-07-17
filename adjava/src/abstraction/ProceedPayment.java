package abstraction;

public class ProceedPayment {
	public static Zomato getObject() {
		Zomato zomato=new ImplementZomato();
		return zomato;
	}

}
