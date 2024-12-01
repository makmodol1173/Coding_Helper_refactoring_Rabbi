package huffman;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Compress {

	private String sourceFilePath;
	private String targetFilePath;

	
	public Compress(String sourceFilePath, String targetFilePath) {
		this.sourceFilePath = sourceFilePath;
		this.targetFilePath = targetFilePath;
	}

	
	public void compressFile() {
		
		
		Map<Character, Integer> map = Huffman.createMapFromFile(this.sourceFilePath);
		
		Node rootNode = Huffman.huffman(map);
		
		ArrayList<HuffmanTuple> encodings = Huffman.canonizeHuffmanTree(rootNode);

		Huffman.writeEncodedFile(this.sourceFilePath, this.targetFilePath, encodings);
		
	}
              
   
}
