import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileReader;

public class Bai1 implements Runnable {
    String fileName;

    public String getFileName(String fileName) {
        return getFileName(fileName);
    }

    public void setFileNamer(String fileName) {
        this.fileName = fileName;
    }

    public Bai1(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {

            FileReader fr = new FileReader(this.fileName);
            BufferedReader br = new BufferedReader(fr);
            int n;
            while ((n = br.read()) != -1) {
                System.out.println(this.getFileName(fileName) + n);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Bai1("D:\\CS1\\PhatTrienHeThongTichHop\\BaiTap\\Tuan3\\text1.txt"));
        Thread t2 = new Thread(new Bai1("D:\\CS1\\PhatTrienHeThongTichHop\\BaiTap\\Tuan3\\text2.txt"));
        Thread t3 = new Thread(new Bai1("D:\\CS1\\PhatTrienHeThongTichHop\\BaiTap\\Tuan3\\text3.txt"));
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Done");
    }

}