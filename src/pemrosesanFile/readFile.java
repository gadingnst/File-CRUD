package pemrosesanFile;
import java.io.*;
import javax.swing.JOptionPane;

public class readFile {
	String fileName;
	
	void getRfile(String name) {
		fileName = name;
	}
	
	void readfile() {
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(fr);
			String teks;
			while ((teks = reader.readLine()) != null) {
				JOptionPane.showMessageDialog(null, teks);
			}
			reader.close();
		}
		catch (FileNotFoundException fnfe) {
			fnfe.getMessage();
			JOptionPane.showMessageDialog(null, "File Tidak Ditemukan");
		}
		catch (Exception e) {
			e.getMessage();
			JOptionPane.showMessageDialog(null, "File gagal dibaca, Operasi Dibatalkan");
		}
	}
}
