package InheritenceXML;

public class SimpleElement extends Element{
	private String value;
	
	public SimpleElement(String tag, String value) {
		super(tag);
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public String toString() {
		return "<" + super.getTag() + ">" + "<" + this.getValue() + ">" + "<\\" + super.getTag() + ">\n\t";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleElement se1 = new SimpleElement("name", "Abdulla");
		SimpleElement se2 = new SimpleElement("age", "24");
		SimpleElement se3 = new SimpleElement("gender", "Male");
		
		System.out.println(se1.toString() + se2.toString() + se3.toString());
		

	}

}
