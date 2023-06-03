package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle", null, 0);
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("cinderella", null, 0);
        
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title : " + cinderellaDVD.getTitle());
        
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title : " + jungleDVD.getTitle());
        
	}

	
	private static void swap(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
		
	}


private static void changeTitle(DigitalVideoDisc dvd, String title) {
	
	// TODO Auto-generated method stub
	String oldTitle = dvd.getTitle();
	dvd.setTitle(title);
	dvd = new DigitalVideoDisc(oldTitle, oldTitle, 0);
	
	
}
}

