package src;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTasks {
	public static String getCombinedRelativePaths(String path1, String path2) {
		if (path1.isEmpty()) {
			path1 = (new File("").getAbsolutePath());
		}
		System.out.println("path1 : " + path1);
		System.out.println("path2 : " + path2);

		Path newPath = Paths.get(path1, path2).normalize();
		System.out.println("Combined path is " + newPath.toString());

		return newPath.toString();
	}
}
