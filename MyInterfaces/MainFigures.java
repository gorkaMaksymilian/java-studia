package zajecia;

import java.util.Arrays;

public class MainFigures {
	public static void main (String[] args) {
		Block[] blocks = new Block[4];
		blocks[0] = new Ball(3);
		blocks[1] = new Ball(4);
		blocks[2] = new Cube(3);
		blocks[3] = new Cube(1.5);
		
		for(Block b: blocks) {
			System.out.println(b.getKind()+": "+b.getSurface());
		}
		
		Arrays.sort(blocks);
		
		System.out.println("\nSorted table (by surface):");
		for(Block b: blocks) {
			System.out.println(b.getKind()+": "+b.getSurface());
		}
		
		
	}
}