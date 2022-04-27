import java.util.ArrayList;
import java.util.List;

public class ManagePerson1 {
    List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public int search(String sdt) {
        for (int i = 0; i < personList.size(); i++) {
            if (sdt.equals(personList.get(i).getSoDt())) {
                return i;
            }
        }
        return -1;
    }

    public List<Person> searchName (String name) {
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getHoTen().contains(name)) {  //contains : tên chữa chuỗi , kí tự giống hoặc gần giống
                list.add(personList.get(i));
            }
        }
        return list;
    }

    public void delete (String sdt) {
        if (search(sdt)==-1){
            System.out.println("Không tìm thấy");
        }else {
            personList.remove(search(sdt));
        }
    }
    public void edit (String sdt , Person person){
        if(search(sdt)==-1){
            System.out.println("Không tìm thấy");
        }else {
            personList.set(search(sdt),person);
        }

    }


    public void print(){
        for (int i = 0; i< personList.size();i++){
            System.out.println(personList.get(i));
        }
//        for (Person p: personList) {      // lấy phần từ trong hàm
//            System.out.println(p);
//        }
    }
}
