package pemrosesanFile;
import java.io.*;
import javax.swing.JOptionPane;

public class renameFile {
	File oldFile;
	File newFile;

	void getRNfile(File oldfile, File newfile) {
		oldFile = oldfile;
		newFile = newfile;
	}
	
	void renamefile() {
		try {
			boolean rename = oldFile.renameTo(newFile);
			if(rename) {
				JOptionPane.showMessageDialog(null, "File Telah di Rename");
			}else {
				JOptionPane.showMessageDialog(null, "File gagal di Rename (File Tidak Ditemukan)");
			}
		}
		catch (Exception e) {
			//Do Nothing
		}
	}
}
