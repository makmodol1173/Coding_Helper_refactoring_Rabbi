package huffman;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public abstract class FileWriteHelper implements FileContentReader {
	private File file;
	protected FileOutputStream fileOutputStream;
	final String byteBuffer;
	public static final int NUM_OF_BITS_TO_WRITE = 8;

	
	protected FileWriteHelper(String path) {
		this.file = new File(path);
		this.byteBuffer = "";
		this.initFile();
	}

	private void initFile() {
		try {
			this.fileOutputStream = new FileOutputStream(this.file);
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public abstract void writeToFile();
}
