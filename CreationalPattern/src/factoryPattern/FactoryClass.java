package factoryPattern;

public class FactoryClass {
	
	public Shapes getShape(String type) {
		switch(type) {
		case "triangle": return new Triangle();
		case "rectangle": return new Rectangle();
		default: return null;
		}
	}

}
