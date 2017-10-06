import java.util.ArrayList;

public class DinosaurData
	{
		static ArrayList<Dinosaur>dinoArray = new ArrayList<Dinosaur>();
		
		public static void fillArray()
		{
				dinoArray.add(new Dinosaur("Tyrannosaurs Rex", 9, 4, 10, 4, "Bite"));
				dinoArray.add(new Dinosaur("Brachiosaurus", 3, 9, 10, 2, "Trample"));
				dinoArray.add(new Dinosaur("Triceratops", 8, 5, 10, 6, "Stab"));
				dinoArray.add(new Dinosaur("Velociraptor", 6, 4, 10, 10, "Speed Bite"));
				dinoArray.add(new Dinosaur("Stegosaurus", 5, 8, 8, 2, "Tail Spike Attack (attack your enemy with the spines on your tail and stab"));
				dinoArray.add(new Dinosaur("Ankylosaurus", 6, 9, 10, 6, "Tail Wack Attack (swing your tall like a wrecking ball into your enemy)"));
				dinoArray.add(new Dinosaur("Utahraptor", 7, 6, 10, 8, "Scratch and Claw"));
		}
			

	}
