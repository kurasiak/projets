package Hotel;

import java.util.Scanner;

public class reception {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	hotel newHotel = new hotel("game hotel", 15, 15, 6, 4); // creation hotel

	newHotel.menuHotel(); // affiche menu hotel

//	newHotel.creationChambre(); // creation du numero de chambre

	sc.close();
    }
}
