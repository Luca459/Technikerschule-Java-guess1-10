import java.util.*;

class ratespiel{
	public static void main(String args[]){
	int versuch,i = 1;
	
	System.out.println("Ich denke an eine Zahl von 1 bis 10");
	Scanner input = new Scanner(System.in);
	int random = (int)(Math.random()*10+1);
	
	System.out.println("Sie haben drei versuche diese Zahl zu erraten.");
	System.out.println("Raten Sie!");
	
	while(i <= 3){
		
		System.out.println("Versuche: " + i);
		versuch = input.nextInt();
		if (versuch == random){
			System.out.println("RICHTIG!");
			System.out.println("Sie haben das Spiel gewonnen");
			break;
		} else {
			System.out.println("Falsch");
		}
		i++;
		if(i > 3){
	System.out.println("Sie haben das Spiel verloren");
	System.out.println(random);
		break;
			}

	}
	

	
	}
}