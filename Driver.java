import java.util.Scanner; 
import java.util.Arrays;
class Driver{
	public static void main(String[] args){
		Boolean on = true;
		String[] principalMenu = {"Ingresar un ave", "Ingresar un mamifero", "Ingresar un reptil", "Cerrar programa"};
		Scanner myScan = new Scanner(System.in);
		float birdsMin = floatInput(myScan, "Ingrese un valor valido para el ave", "Ingrese el valor minimo del ave", 0f);
		float mammalMin = floatInput(myScan, "Ingrese un valor valido para el mamifero", "Ingrese el valor minimo del mamifero", 0f);
		float reptileMin = floatInput(myScan, "Ingrese un valor valido para el reptil", "Ingrese el valor minimo del reptil", 0f);
		while (on)
		{
			String choosen = selectOptions(myScan, principalMenu);
			if (choosen.equalsIgnoreCase(principalMenu[0])) {
				Animal myBird = new Animal(myScan, floatInput(myScan, "Ingrese un valor valido para el ave", "Ingrese el peso del Ave", birdsMin), 0);
				myBird.doAction();
				myBird.printWeights();
			}else if (choosen.equalsIgnoreCase(principalMenu[1])){
				Animal myMammal = new Animal(myScan, floatInput(myScan, "Ingrese un valor valido para el mamifero", "Ingrese el peso del mamifero", mammalMin), 1);
				myMammal.doAction();
				myMammal.printWeights();
			}else if (choosen.equalsIgnoreCase(principalMenu[2])){
				Animal myReptile = new Animal(myScan, floatInput(myScan, "Ingrese un valor valido para el reptil", "Ingrese el peso del reptil", mammalMin), 2);
				myReptile.doAction();
				myReptile.printWeights();
			}else if (choosen.equalsIgnoreCase(principalMenu[3])){
				System.out.println("Gracias por usar el programa");
				on = !on;
			}
		}
	}

	private static float floatInput(Scanner scanner, String text, String text2, Float minimum){
		Boolean valid = true;
		float value = 0f;
		while (valid)
		{
			System.out.println(text2);
			String valueString = scanner.nextLine();
			try{
				value = Float.parseFloat(valueString);
				valid = value <= 0f || value < minimum;
				if (valid == true) {
					System.out.println(text);
				}
			}
			catch (Exception e) {
				System.out.println("Ingrese un valor float");
			}
		}
		return value;
	} 
	private static String selectOptions(Scanner scanner, String[] texts){
		Boolean valid = true;
		String value = "";
		while (valid == true)
		{
			System.out.println("Ingrese una opcion valida:\n");
			for (int i = 0; i < texts.length; i++) { 
	            String x = texts[i]; 
	            System.out.print((i+1) + ". " + x + "\n"); 
        	}
			value = scanner.nextLine();
			valid = !Arrays.asList(texts).contains(value);
			if (valid == true) {
				System.out.println("Ingreso una opcion invalida.\n");
			}
		}
		return value;
	} 

}