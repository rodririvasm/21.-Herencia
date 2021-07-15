import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Perro extends Animal{
	
	String raza="";
	String color="";
	float peso=0;
	
	public String ladrar() {
		return "guaf";
	}
	
	@Override
	public String comer() {
		return "comiendo croquetas";
	}
	
}
