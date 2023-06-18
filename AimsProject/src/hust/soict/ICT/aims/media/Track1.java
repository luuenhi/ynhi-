package hust.soict.ICT.aims.media;

public class Track1  implements Playable{
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	
    public Track1(String title, int length) {
    	this.title = title;
        this.length = length;
    }
		
	
    public void Track(String title2, int length2) {
		// TODO Auto-generated constructor stub
	}

	public String setTitle() {
    	return title;
	
    }
    
    public int getLength() {
	return length;
    }
    
    @Override
    public void play() {
    
    	 System.out.println("Playing DVD: " + this.getTitle());
         System.out.println("DVD length: " + this.getLength());
    }

	@Override
	public boolean equals(Object obj) {
        if(obj instanceof Track1) return title.equals(((Track1) obj).getTitle()) && length == ((Track1) obj).getLength();
        else return false;
    }
}
	