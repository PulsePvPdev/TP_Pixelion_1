
import java.util.Scanner;

class tp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double number_toconvert=0;
    double number_converted;
    char choix = ' ';
    char reponse = ' ';
    boolean run = true;
   while(run) { 
	while (number_toconvert == 0){
		number_toconvert = 0;
		System.out.println("Température à convertir (chiffres uniquement):");
	    number_toconvert = sc.nextDouble();
  }
	while (choix != '1' && choix != '2'){
	choix = ' ';
    System.out.println("Saisissez puis validez votre choix: ");
    System.out.println("1 : De Fahreneit vers Celsius");
    System.out.println("2 : De Celsius vers Fahreneit");
    String line = sc.nextLine();
    if(line.length() > 0)
    	choix = line.charAt(0);
  }
    if(choix == '1'){
  	  number_converted = ((9.0/5.0) * number_toconvert) + 32.0;
  	System.out.print(number_toconvert + " °F = "+Math.round(number_converted*100)/100+" °C");
    }
    else if(choix == '2'){
  	  number_converted = ((number_toconvert - 32) * 5) / 9;
      System.out.print(number_toconvert + " °C = "+Math.round(number_converted*100)/100+" °F");
    }
    while(reponse == ' ') {
    	reponse = ' ';
    	System.out.println("\n");
        System.out.println("Saisissez puis validez votre choix: ");
        System.out.println("1 : Convertir une autre température");
        System.out.println("2 : Quitter");
        String line = sc.nextLine();
        if(line.length() > 0)
        	reponse = line.charAt(0);
    }
    if(reponse == '2'){
    	run = false;
      }
  }
   System.out.println("Bonne continuation...");
   sc.close();
}
}