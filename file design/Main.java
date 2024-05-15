public class Main {
    public static void main(String[] args) {
        // Create files
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        // Create directories
        Directory rootDir = new Directory("Root");
        Directory subDir1 = new Directory("Subdirectory 1");
        Directory subDir2 = new Directory("Subdirectory 2");

        // Add files to subdirectories
        subDir1.addComponent(file1);
        subDir1.addComponent(file2);
        subDir2.addComponent(file3);

        // Add subdirectories to root
        rootDir.addComponent(subDir1);
        rootDir.addComponent(subDir2);

       

        // Display the structure
        rootDir.display();
    }
     }
    


