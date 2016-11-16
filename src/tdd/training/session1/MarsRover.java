package tdd.training.session1;

public class MarsRover {

	private Object planet[][];
	private int xRover = 0;
	private int yRover = 0;
	private char facing = 'N';

	public MarsRover(int x, int y, String obstacles) {

		/*
		 * x and y represent the size of the grid. Obstacles is a String
		 * formatted as follows: ?(o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y)? with no
		 * white spaces.
		 * 
		 * Example use: MarsRover rover = new MarsRover(100,100,"?(5,5)(7,8)?")
		 * //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		 */
		
		
		// Crea il pianeta
		planet = new Object[x][y];
		// Rimuovi dalla stringa tutti i caratteri che non sono numeri
		obstacles = obstacles.replaceAll("\\D+", "");
		// System.out.println(obstacles);

		// Inserisci ostacoli sul pianeta
		int i = 0;
		while (i < obstacles.length()) {

			int xOb = Character.getNumericValue(obstacles.charAt(i));
			i++;
			int yOb = Character.getNumericValue(obstacles.charAt(i));

			Obstacle obstacle = new Obstacle(xOb, yOb);
			planet[xOb][yOb] = obstacle;
			// System.out.println(xOb+" "+yOb);
			i++;
		}

		// System.out.println(planet[1][2]);

	}

	public String executeCommand(String command) {

		/*
		 * The command string is composed of "f" (forward), "b" (backward), "l"
		 * (left) and "r" (right) Example: The rover is on a 100x100 grid at
		 * location (0, 0) and facing NORTH. The rover is given the commands
		 * "ffrff" and should end up at (2, 2) facing East.
		 * 
		 * The return string is in the format:
		 * ?(x,y,facing)(o1_x,o1_y)(o2_x,o2_y)?..(on_x,on_y)? Where x and y are
		 * the final coordinates, facing is the current direction the rover is
		 * pointing to (N,S,W,E). The return string should also contain a list
		 * of coordinates of the encountered obstacles. No white spaces.
		 */

		return null;
	}

	public static void main(String[] args) {

		MarsRover rover = new MarsRover(3, 3, "(2,1)(1,2)");

	}

}
