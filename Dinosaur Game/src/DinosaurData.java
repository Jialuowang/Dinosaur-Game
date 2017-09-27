import java.util.ArrayList;

public class DinosaurData
	{
//		private String type;
//		private int attackDamage;
//		private int defenseAbilities;
//		private int health;
//		private int speed;
//		private String attackType;
		
		public static void main(String[] args)
			{
				ArrayList<Dinosaur>dinoArray = new ArrayList<Dinosaur>();
				dinoArray.add(new Dinosaur ("Tyrannosaurs Rex", 9, 4, 10, 4, "Bite"));
				dinoArray.add(new Dinosaur("Brachiosaurus", 3, 9, 10, 2, "Trample"));
				dinoArray.add(new Dinosaur("Triceratop", 8, 5, 10, 6, "Stab"));
				dinoArray.add(new Dinosaur("Velociraptor", 7, 4, 10, 10, "Speed Bite"));
				dinoArray.add(new Dinosaur("Stegosaurus", 8, 8, 10, 2, "Ram"));
				
			}

	}
