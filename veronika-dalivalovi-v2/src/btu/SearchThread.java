package btu;

import java.io.File;
import java.util.Scanner;

public class SearchThread extends Thread {

    public File[] files;

    public SearchThread(File[] files){
        this.files = files;
    }
    @Override
    public void run() {

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("შემოიტანე საძიებო სიტყვა: ");
            String fileName = scanner.nextLine();
            System.out.println("შემოტანილი საზიებო სიტყვა " + fileName);
            if(!fileName.equals("")){
                searchFiles(fileName);
            }
        }
    }

    public void searchFiles(String searchString){
        for(File file: this.files){
            if(file.isFile()){
                String fileName = file.getName();
                if(fileName.contains(searchString)){
                    System.out.println("მოიძებნა " + fileName);
                }
            }
        }
    }
}
