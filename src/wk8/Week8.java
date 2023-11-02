import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class Week8{

    static Path rootPath = Paths.get("src");

    public static void main(String[] args) {
        //example1();
        try{
            example7();
        }
        catch (Exception e){
            System.err.println(e);
        }


    }
    static void example1(){
        /*
        File Manipulation
            working with files and directories

            save data to disk
                retrieve data later on
                network
                    mysql, mssql
                file system
                    mysqlite
                    files and folders

        Java's implementation
            package
                java.io.*
                java.nio.*
        classes
            Paths
                class file static method
                create/save a file location path
                    address
            Files:
                class file static method
                operator on ONE specific file or folder
                Files.createNewDirectory()
                Files.writeString()

            Path
                saving the path (address) of a location
            File
                targeting one specific file or folder
                of a given path.
                Operate/execute operation(s) on specificed
                file or folder
         */

        Path mySrcDir  = Paths.get("src");
        //Path p1 = Path.of("src");
        File mySrcFile = mySrcDir.toFile();
        System.out.println("is this a directory? " + mySrcFile.isDirectory());

    }

    static void example2() throws IOException {
        /*
                CRUD
                Create, Read/Write, Update, Delete

                when working with FM, attempt to process. catch any errors
         */

        //create a directory
        Path p1 = Paths.get(rootPath + "/myDir/d1/d2/d3");
        //System.out.println(p1.toFile().exists());
       //Files.createDirectory(p1);
        Files.createDirectories(p1);


    }

    static void example3() throws IOException{
        //Path p1 = Paths.get(rootPath + "/myDir/d1/second");
        Path p1 = rootPath
                .resolve("myDir")
                .resolve("d1")
                .resolve("third.text");
        Files.createFile(p1);
    }

    static void example4() throws IOException{
        Path p1 = rootPath.resolve("myDir/d1/d2");
        Path p2 = rootPath.resolve("newD2");
        //Files.move(p1, p2);

        Path p3 = rootPath.resolve("myDir/d1");
        Path p4 = rootPath.resolve("copyD1");
        Files.copy(p3, p4);

    }

    static void example5() throws IOException{
        Path p1 = rootPath.resolve("myDir/second.txt");
        Path p2 = rootPath.resolve("copySecond.txt");

//        Files.move(p1, p2)
        Files.copy(p1, p2);
    }

    //get all files and folders of a direct
    static void example6() throws IOException{
        Path p1 = rootPath.resolve("test");
        for(File current : Objects.requireNonNull(p1.toFile().listFiles())){
            System.out.println(current.getName());
            System.out.println(current.length());
        }


    }
    static void example7() throws IOException{

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file or folder name");
        String userInput = input.nextLine();

        Path userRoot = rootPath.resolve("userData");

        if(!Files.exists(userRoot)){
            Files.createDirectory(userRoot);
        }

        if(userInput.contains(".")){
            Files.createFile(userRoot.resolve(userInput));
        }
        else{
            Files.createDirectory(userRoot.resolve(userInput));
        }

    }
}
