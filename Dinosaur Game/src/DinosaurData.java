import java.util.ArrayList;

public class DinosaurData
	{
		public static ArrayList<Dinosaur>dinoArray = new ArrayList<Dinosaur>();
		
		public static void fillArray()
		{
				dinoArray.add(new Dinosaur("1)    Tyrannosaurs Rex", 9, 4, 10, 4, "Bite"));
				dinoArray.add(new Dinosaur("2)    Brachiosaurus", 3, 9, 10, 2, "Trample"));
				dinoArray.add(new Dinosaur("3)    Triceratops", 8, 5, 10, 6, "Stab"));
				dinoArray.add(new Dinosaur("4)    Velociraptor", 7, 4, 10, 10, "Speed Bite"));
				dinoArray.add(new Dinosaur("5)    Stegosaurus", 7, 8, 8, 2, "Tail Spike Attack (attack your enemy with the spines on your tail and stab"));
				dinoArray.add(new Dinosaur("6)    Ankylosaurus", 6, 9, 10, 6, "Tail Wack Attack (swing your tall like a wrecking ball into your enemy)"));
				dinoArray.add(new Dinosaur("7)    Utahraptor", 7, 6, 10, 8, "Scratch and Claw"));
		}
			

	}
