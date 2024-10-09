package tp_3;

public class testEntier {
	public static void main(String[] args) {
		System.out.println(entier.facto(5));
		System.out.println(entier.absolu(-10));
		entier.comparer(3, 7);
		if (entier.premier(7))
			System.out.println("cette entier est premier");
		else
			System.out.println("cette entier n'est pas premier");
		entier.valeur+=10;
		System.out.println("la valeur aprés l'incrémentation "+entier.valeur);
	}
}
