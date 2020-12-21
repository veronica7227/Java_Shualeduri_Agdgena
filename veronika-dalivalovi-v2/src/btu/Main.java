package btu;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        int DELAY = 3000; // MS
        String DIRECTORY = "BTU_DOCUMENTS";

        File folder = new File(DIRECTORY);
        File[] files = folder.listFiles();

        FileThread fileThread = new FileThread(files, DELAY);
        fileThread.start();

        SearchThread searchThread = new SearchThread(files);
        searchThread.start();


    }
}
