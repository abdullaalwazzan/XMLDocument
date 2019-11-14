package interfaceXML;

public class AtomicItem implements Item {
	
	private String tag;
	private String description;

	public AtomicItem(String tag, String description) {
		this.tag = tag;
		this.description = description;
	}
	
	public String getTag() {
		return this.tag;
		
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String toString() {
		String s = "<" + this.getTag() + "\\" + ">" + this.getDescription() + "<\\" + this.getTag() + ">";
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AtomicItem at1 = new AtomicItem("name", "Abdulla");
		AtomicItem at2 = new AtomicItem("age", "24");
		AtomicItem at3 = new AtomicItem("gender", "male");
		
		System.out.println(at1.toString() + at2.toString() + at3.toString());

	}

}
