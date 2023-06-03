package hust.soict.dsai.store;

public class Store {
   
	private DVD[] itemsInStore;

	public static void main(String[] args) {
	
Store store = new Store();
        
        
        String string = "DVD1";
		DVD dvd1 = new DVD(string);
        DVD dvd2 = new DVD("DVD2");
        DVD dvd3 = new DVD("DVD3");
        
     
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        

        System.out.println("list dvd in store :");
        for (DVD dvd : store.itemsInStore) {
            System.out.println(dvd.getTitle());
        }
        
	}

	private void addDVD(DVD dvd1) {
		// TODO Auto-generated method stub
		
	}

}
