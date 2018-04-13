package pemrosesanFile;
import java.io.*;
import javax.swing.JOptionPane;

public class writeFile {
	String teks;
	String fileName;
	
	void getWfile(String name, String Teks) {
		fileName = name;
		teks = Teks;
	}

	void writefile() {
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter writefile = new BufferedWriter(fw);
			writefile.write(teks);
			writefile.close();
			JOptionPane.showMessageDialog(null, "File Telah Dibuat");
		}
		catch (Exception e){
			e.getMessage();
			JOptionPane.showMessageDialog(null, "File Gagal Dibuat, Operasi Dibatalkan");
		}
	}
}
