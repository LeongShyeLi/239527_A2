//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment2
//Matrik: #239527
//Name: #LeongShyeLi

package com.uum._a2;


import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

class FindDirectory {

    static ArrayList<String> files = new ArrayList<>();
    static String path, directory, fileName, excelFile;
    static FindDirectory fd = new FindDirectory();

    public static ArrayList<String> getFiles() {
        return files;
    }

    public static String getPath() {
        return path;
    }

    public static void setFiles(ArrayList<String> files) {
        Path currentPath = Paths.get("");
        directory = fd.getClass().getPackage().getName();
        directory = directory.replace(".", "\\");
        path = currentPath.toAbsolutePath().toString() + "\\src\\main\\java\\" + directory;
        File f = new File(path);
        try {
            for (File file : f.listFiles()) {
                String name = file.getName();
                if (name.endsWith(".java") && (!"FindDirectory.java".equals(name)) && (!"ReadAndWriteFile.java".equals(name)) & (!"Info.java".equals(name))) {
                    fileName = file.getCanonicalPath();
                    files.add(fileName);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        FindDirectory.files = files;
    }

    public static String getExcelFile() {
        Path currentPath = Paths.get("");
        directory = fd.getClass().getPackage().getName();
        directory = directory.replace(".", "\\");
        path = currentPath.toAbsolutePath().toString() + "\\src\\main\\java\\"+ directory;
        File f = new File(path);
        try {
            for (File file : f.listFiles()) {
                String name = file.getName();
                if (name.endsWith(".xls")) {
                    excelFile = file.getCanonicalPath();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return excelFile;
    }

    public static void setExcelFile(String excelFile) {

        FindDirectory.excelFile = excelFile;
    }

}//end class


