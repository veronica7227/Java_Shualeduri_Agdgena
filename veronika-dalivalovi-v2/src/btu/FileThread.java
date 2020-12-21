package btu;

import java.io.File;

public class FileThread extends Thread {

    public File[] files;
    public int DELAY;
    public FileThread(File[] files, int DELAY){
        this.files = files;
        this.DELAY = DELAY;
    }
    @Override
    public void run() {


        while (true){
            System.out.println(this.files.length);
            try{
                Thread.sleep(DELAY);
            }catch (Exception e){
                System.err.println(e);
            }
        }
    }
}
