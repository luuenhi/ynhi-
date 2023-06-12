package AimsProject.src.hust.dsai.aims.media;

import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Printable;

public class DigitalVideoDisc extends Disc implements Pageable {
	public DigitalVideoDisc(String title) {
        super(title);
        
    }
	 public DigitalVideoDisc(String title, String category, float cost) {
	        super(title, category, cost);
	    }
	 
	 public DigitalVideoDisc(String title, String category, String director, float cost) {
	        super(title, category, director, cost);
	        
	    }
	 public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
	        super(title, category, director, length, cost);
	    }
	 
	 public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
	        super(id, title, category, director, length, cost);
	    }

	 public String toString() {
	        return "DVD: " +getTitle() + "-" + getCategory() + "-" +getDirector() + "-" + getLength() + "-" + getCost();
	    }
	 
	 
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		
	}
	@Override
	public int getNumberOfPages() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public PageFormat getPageFormat(int pageIndex) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Printable getPrintable(int pageIndex) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}
	 
	 

}
