package pemrosesanFile;
import javax.swing.*;
import java.io.*;

public class main {

	public static void main(String[] args) {
		try {
			String PFile = JOptionPane.showInputDialog("Masukkan Keperluan Anda (write/read/rename/delete/show File)");
			//write = Untuk Membuat dan Mengisi File
			//read = untuk Membaca Isi File
			//rename = untuk Mengubah Nama File
			//delete = untuk Menghapus File
			//show = untuk Menampilkan List File

			if(PFile.equals("write")) {
				writeFile write = new writeFile();
				String fname = JOptionPane.showInputDialog("[Write] Masukkan Nama File");
				String texts = JOptionPane.showInputDialog("[Write] Masukkan Isi File (Teks)");
				write.getWfile(fname, texts);
				write.writefile();
			}
			else if(PFile.equals("read")) {
				showFile show = new showFile();
				show.show();
				readFile read = new readFile();
				String fname = JOptionPane.showInputDialog("[Read] Masukkan Nama File");
				read.getRfile(fname);
				read.readfile();
			}
			else if(PFile.equals("rename")) {
				showFile show = new showFile();
				show.show();
				renameFile rename = new renameFile();
				String fname = JOptionPane.showInputDialog("[Rename] Masukkan Nama File Lama");
				File oldFile = new File(fname);
				try {
					FileReader read = new FileReader(fname);
					String newname = JOptionPane.showInputDialog("[Rename] Masukkan Nama File Baru");
					File newFile = new File(newname);				
					rename.getRNfile(oldFile, newFile);
					rename.renamefile();
					read.close();
				}
				catch (FileNotFoundException fnfe) {
					JOptionPane.showMessageDialog(null, "File Tidak Ditemukan");
				}
			}
			else if(PFile.equals("delete")) {
				showFile show = new showFile();
				show.show();
				deleteFile delete = new deleteFile();
				String fname = JOptionPane.showInputDialog("[Delete] Masukkan Nama File");
				File filename = new File(fname);
				try {
					FileReader read = new FileReader(fname);
					delete.getDfile(filename);
					delete.deletefile();
					read.close();
				}
				catch (FileNotFoundException fnfe){
					JOptionPane.showMessageDialog(null, "File Tidak Ditemukan");
				}
			}
			else if(PFile.equals("show")) {
				showFile show = new showFile();
				show.show();
			}
			else {
				JOptionPane.showMessageDialog(null, "Keperluan Anda Tidak Terdaftar");
			}
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "Operasi Dibatalkan");
		}
	}
}
