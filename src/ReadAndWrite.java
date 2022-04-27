import java.io.File;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void main(String[] args) throws Exception{
        File file = new File("out.csv");
        file.createNewFile();
        PrintWriter pw = new PrintWriter(file);
//        Person person = new Person("12","Nhóm 1","nu","hoa","na","5/9");
//        pw.write(person.getSoDt() + "," + person.getNhom() + ","
//                + person.getGioiTinh() + ","
//                + person.getHoTen() + ","
//                + person.getDiaChi()+ "," + person.getNgaySinh());
        List <Person> personList = new ArrayList<>();
        personList.add(new Person("13","nhóm3","hi","nu","8/7","32"));
        personList.add(new Person("132","nhóm37","hi","nu","8/7","32"));
        personList.add(new Person("143","nhóm35","hi","nu","8/7","32"));
        personList.add(new Person("138","nhóm343223432","hi","nu","8/7","32"));
        for (int i =0;i< personList.size();i++){
            pw.println(personList.get(i));
        }
        pw.close();


    }
}
