package pemrosesanFile;
import java.io.*;
import javax.swing.JOptionPane;

public class deleteFile {
	File filename;
	
	void getDfile(File FileName) {
		filename = FileName;
	}
	
	void deletefile() {
		try {
			boolean delete = filename.delete();
			if (delete) {
				JOptionPane.showMessageDialog(null, "File telah di Hapus");
			}
			else {
				JOptionPane.showMessageDialog(null, "File gagal di Hapus, Operasi Dibatalkan)");
			}
		}
		catch (Exception e) {
			//DoNothing
		}
	}
}
