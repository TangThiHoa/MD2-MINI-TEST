import java.util.ArrayList;
import java.util.List;

public class ManagePerson implements Manage<Person> {
    private List<Person> personList = new ArrayList<>();

    public ManagePerson() {
    }

    @Override
    public void add(Person person) {
        personList.add(person);

    }

    @Override
    public void edit(String sdt, Person person) {

        if (search(sdt) != -1) {
            personList.set(search(sdt), person);
        }else System.out.println("Không tìm thấy ");


    }

    // void không trả về
    // int có kiểu trả về thì phải hứng

    @Override
    public void remove(String sdt) {
        int index = search(sdt);                 // index hứng chỉ số từ search
        if (index == -1) {
            System.out.println("Không tìm thấy ");
        } else {
            personList.remove(index);
            System.out.println("Xóa thành công ");
        }


    }

    @Override
    //nhập vào tên => lấy ra chỉ số
    public int search(String sdt) {
        for (int i = 0; i < personList.size(); i++) {
            //nếu như list có chữa đối tượng giống tên đấy thì lấy ra chỉ số
            if (personList.get(i).getSoDt().equals(sdt)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void print() {
        for (int i = 0; i < personList.size(); i++) {

            System.out.println(personList.get(i));

        }

    }
}
