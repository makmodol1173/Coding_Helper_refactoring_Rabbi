package huffman;


public class HuffmanTuple {
	final char letter;
	final String representation;

	
	public HuffmanTuple(char letter, String representation) {
		this.letter = letter;
		this.representation = representation;
	}

	
	@Override
	public String toString() {
		return this.letter + " => " + this.representation;
	}
}
