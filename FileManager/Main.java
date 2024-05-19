package FileManager;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        FileManager.RenanmeAllFilesInDir(args[0]);
    }

}

class FileManager {

    static void listFilesInDir(String dir) {
        var directory = new File(dir);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName() + "  true");

            }
        }

    }

    static void RenanmeAllFilesInDir(String dir) {

        var pattern = Pattern.compile("^MySQL_Tutorial_for_Beginners_\\d+_-(.*?)\\(0\\)\\.mp4$");
        var directory = new File(dir);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                String fileName = file.getName();

                if (MyUtils.compareStringWithPattern(fileName, pattern)) {
                    renameFile(dir, fileName, MyUtils.newFileName(fileName));

                } else {
                    System.out.println(file.getName() + "  false");

                }
            }
        }

    }

    static void renameFile(String directoryPath, String oldFileName, String newFileName) {
        File directory = new File(directoryPath);
        File oldFile = new File(directory, oldFileName);
        File newFile = new File(directory, newFileName);

        if (oldFile.exists()) {
            try {
                if (oldFile.renameTo(newFile))
                    System.out.println("File renamed: " + oldFileName + " to " + newFileName);

            } catch (Exception err) {
                System.err.println("Error renaming file: " + oldFileName);

            }
        } else
            System.err.println("File not found: " + oldFileName);

    }

}

class MyUtils {

    static boolean compareStringWithPattern(String filename, Pattern pattern) {
        Matcher matcher = pattern.matcher(filename);
        return matcher.matches();
    }

    static String newFileName(String filename) {
        String epsNum = filename.substring(29, 31);
        String[] titleArr = filename.substring(34).split("\\(0\\)");
        String title = titleArr[0] + titleArr[1];
        return epsNum + "_" + title;
    }
}