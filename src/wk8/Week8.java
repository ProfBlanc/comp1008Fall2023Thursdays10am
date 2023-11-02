import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Objects;
import java.util.Scanner;

public class Week8{

    static Path rootPath = Paths.get("src");

    public static void main(String[] args) {
        //example1();
        try{
            example11();
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

    static void example8() throws IOException{
        //delete
        Files.delete(Paths.get("test/dir1"));
    }
    static void example9() throws IOException{

        //writing
        String content = "my cool text\n";
        Path p1 = rootPath.resolve("test")
                .resolve("f3.txt");
        Files.writeString(p1, content, StandardOpenOption.APPEND);

    }
    static void example10() throws IOException{

        String content = Files
                .readString(rootPath.resolve("test/f3.txt"));
        System.out.println(content);
    }

    static void example11() throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Student Timetable program");
        System.out.println("Enter the year");
        String year = input.nextLine();
        System.out.println("Enter the term");
        String term = input.nextLine();
        System.out.println("Thank you for completing the first step");
        System.out.printf("You will not be inputting your timetable " +
                "for year %s, term %s%n", year, term);
        System.out.println("Enter a day of the week");
        String dayOfWeek = input.nextLine();
        System.out.printf("You will now be entering courses on %s's " +
                "for the %s semester of %s%n",
                dayOfWeek, term, year);

        Path rootTimeTablePath = rootPath.resolve("timetable");
        if(!Files.exists(rootTimeTablePath)){
            Files.createDirectory(rootTimeTablePath);
        }

        Path semesterPath = rootTimeTablePath.resolve(year).resolve(term);
        if(!Files.exists(semesterPath)){
            Files.createDirectories(semesterPath);
        }
        Path dayOfWeekPath = semesterPath.resolve(dayOfWeek + ".txt");

        if(!Files.exists(semesterPath.resolve(dayOfWeekPath))){
            Files.createFile(dayOfWeekPath);
        }

        while(true) {
            System.out.printf("Enter a time of your %s class%n", dayOfWeek);
            String time = input.nextLine();
            System.out.printf("Enter course code " +
                    "for you %s class on %s%n", time, dayOfWeek);
            String courseCode = input.nextLine();

            if(time.length() == 0 || courseCode.length() == 0 ||
            time.toLowerCase().charAt(0) == 'q' ||
            courseCode.toLowerCase().charAt(0) == 'q'
            ){
                break;
            }

            String content = String.format("%s:%s%n", time, courseCode);
            Files.writeString(dayOfWeekPath,
                    content, StandardOpenOption.APPEND);
            System.out.println("Enter another time and course code combination");
        }

        System.out.println("Thank you for using the program");

    }

}
