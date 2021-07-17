package SolucionesFactibles.ProjectSolucionesFactibles;

public class Atm {
	
	//The main method used for the execution of the program
    public static void main(String[] args) {
    	//Instructions to print the result in console
    	System.out.printf("1234  --> ");
		System.out.println(validarPin("1234"));
        System.out.printf("12345  --> ");
        System.out.println(validarPin("12345"));
        System.out.printf("a234  --> ");
        System.out.println(validarPin("a234"));
    }
    
    //Class to validate if the value is true or false
    public static boolean validarPin(String pin){
    	//length() method of String returns the length of a String pin.
        int size = pin.length();
        if (size!= 4 && size!= 6) return false;
        for (int i = 0; i < size; i++) {
            int character=pin.charAt(i);
            if(character <48 || 58<character) return false;
        }
        return true;
    }
}