package InheritenceXML;
import java.util.*;
public class compositeElement extends Element {
	
	private List<Element> list;
	
	public compositeElement(String tag) {
		super(tag);
		this.list = new ArrayList<>();
	}
	
	public void addElement(Element e) {
		this.list.add(e);
	}
	
	public String toString() {
		String s = "<" + super.getTag() + "\\>\n";
		for(Element elem: list) {
			s += elem.toString();
		}
		s += "<\\" + super.getTag() + ">\n";
		return s;
	}

	public static void main(String[] args) {
		
		compositeElement ce1 = new compositeElement("student");
		
		SimpleElement se1 = new SimpleElement("name", "Abdulla");
		SimpleElement se2 = new SimpleElement("age", "24");
		SimpleElement se3 = new SimpleElement("gender", "Male");
		
		ce1.addElement(se1);
		ce1.addElement(se2);
		ce1.addElement(se3);
		
		System.out.println(ce1.toString());
		// TODO Auto-generated method stub

	}

}
