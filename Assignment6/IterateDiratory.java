package Assignment6;

import java.io.File;

public class IterateDiratory {
	int count = 0;

	public static void main(String[] args) {
		IterateDiratory id = new IterateDiratory();
		File f = new File("/Users/workspace/JavaTest/src/Assignment6");
		System.out.println(id.iterateAndCountFiles(f));
	}

	public int iterateAndCountFiles(File dir) {
		if (dir.isDirectory()) {
			File files[] = dir.listFiles();
			for (int i = 0; i < files.length; i++) {
				if (files[i].isDirectory()) {
					iterateAndCountFiles(files[i]);
				} else {
					count += countFile(files[i]);
				}
			}
		}
		count += countFile(dir);
		return count;
	}

	public int countFile(File file) {
		int count = 0;
		String name = file.getAbsolutePath();
		if (name.endsWith(".txt")) {
			count++;
		}
		return count;
	}
}
