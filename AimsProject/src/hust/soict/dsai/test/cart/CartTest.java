package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King","Animation","Roger Allers",87,19.95f);
		cart.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("naruto");
		cart.addDigitalVideoDisc(dvd4,dvd2,dvd3);
		cart.removeDigitalVideoDisc(dvd4);
		
		cart.search(2);
		cart.search("Aladin");
		cart.search("naruto");
		cart.print();
	}
}
