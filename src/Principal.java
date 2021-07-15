
public class Principal {
	public static void main(String[]args) {
		
		Animal animal=new Animal();
		
		Perro canelo=new Perro();
		System.out.println(canelo.ladrar());
		System.out.println(canelo.comer());
		
		Gato pulgas=new Gato();
		System.out.println(pulgas.comer());
		
		
	}
}
