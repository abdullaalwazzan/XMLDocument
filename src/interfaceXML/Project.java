package interfaceXML;

import java.util.*;

public class Project implements Item{

	private List<Item> list;
	
	public Project() {
	 this.list = new ArrayList<>();
	}
	
	public void addItem(Item aT) {
		list.add(aT);
	}
	
	public String toString() {
		String s = "<todo>\n";
		for(Item item: list) {
			s += "\t" + item.toString();
		}
		s += "<\\todo>\n";
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Project ce1 = new Project();
		Project ce2 = new Project();
		AtomicItem at1 = new AtomicItem("name", "Abdulla");
		ce2.addItem(at1);
		ce1.addItem(ce2);
		
		System.out.println(ce1.toString());

	}

}
