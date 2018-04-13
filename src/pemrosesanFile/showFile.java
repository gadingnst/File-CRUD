package pemrosesanFile;
import java.io.*;

public class showFile {
	File dir = new File(".");
	void show () {
        File[] filesList = dir.listFiles();
        int jumlahfile = 0;
        boolean find = false;
        for(File file : filesList){
        	boolean show = file.isFile() && !file.isHidden();
            if(show){
                System.out.println(file.getName());
                find = true;
                jumlahfile++;
            }
        }
        if (find) {
        	System.out.println("\n"+jumlahfile+" FILE DITEMUKAN");
        }
        else{
        	System.out.println("TIDAK ADA FILE DITEMUKAN");
        }
	}
}
