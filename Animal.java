import java.util.Scanner; 
class Animal{
	String[] allowedTypes = {"ave", "mamifero", "reptil"};
	String[] allowedActions = {"Volvar", "Amamantar", "Mudar Piel"};
	String animalType, noise, name, action;
	float weigth;

	public Animal(Scanner scanner, float _weight, int type){
		weigth = _weight;
		animalType = allowedTypes[type];
		action = allowedActions[type];
		name = askName(scanner, animalType);
		noise = askNoise(scanner, animalType);
	}
	public void doAction(){
		System.out.println("Acciones");
		System.out.println("El " + animalType + " " + action + "\n");
		System.out.println("Sonido de " + name + " " + noise + "\n");
	}

	public void printWeights(){
		float gr = weigth * 500f;
		System.out.println("El " + name + " tiene los pesos\n");
		System.out.println((gr) + " grs\n");
		System.out.println((weigth / 2f) + " kgs\n");
		System.out.println((gr/453.59f)+ " lb\n");
		System.out.println((gr/28.35)+ " oz\n");
	}

	private static String askName(Scanner scanner, String type){
		System.out.println("Ingrese el nombre del " + type);
		return scanner.nextLine();
	}
	private static String askNoise(Scanner scanner, String type){
		System.out.println("Ingrese el sonido del " + type);
		return scanner.nextLine();
	}
}