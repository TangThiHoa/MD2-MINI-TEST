import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner= new Scanner(System.in);
        ManagePerson1 managePerson1 = new ManagePerson1();
        int choice ;
        while (true){
            System.out.println("=====QUẢN LÍ DANH BẠ=====\n" +
                "Chọn chức năng theo số : \n" +
                "1. Xem danh sách : \n" +
                "2. Thêm mới \n" +
                "3.Cập nhật \n" +
                "4.Xóa \n" +
                "5.Tìm kiếm \n" +
                "6.Đọc từ file \n" +
                "7. Ghi từ file \n" +
                "8.Thoát \n" );
            System.out.println("Chọn đi bạn :");
            choice = scanner.nextInt();
            switch (choice){
                case 1 :
                    managePerson1.print();
                    break;
                case 2 :
                    System.out.println("Sđt :");
                    String sdt = sc.nextLine();
                    System.out.println("Nhóm :");
                    String nhom = sc.nextLine();
                    System.out.println("Giới tinh :");
                    String gioiTinh = sc.nextLine();
                    System.out.println("Họ tên :");
                    String hoTen = sc.nextLine();
                    System.out.println("Địa chỉ  :");
                    String diaChi = sc.nextLine();
                    System.out.println("Ngày sinh :");
                    String ngaySinh = sc.nextLine();

                    managePerson1.add(new Person(sdt,nhom,gioiTinh,hoTen,diaChi,ngaySinh));
                    System.out.println("Thêm thành công ");
                    break;
                case 3 :
                    System.out.println("Nhập số điện thoại muốn sửa");
                     String soDienThoai = sc.nextLine();
                     if(managePerson1.search(soDienThoai) ==-1){
                         System.out.println("Không có sđt trong ds");
                     }else {
                         System.out.println("Nhóm :");
                         String nhomNew = sc.nextLine();
                         System.out.println("Giới tinh :");
                         String gioiTinhNew = sc.nextLine();
                         System.out.println("Họ tên :");
                         String hoTenNew = sc.nextLine();
                         System.out.println("Địa chỉ  :");
                         String diaChiNew = sc.nextLine();
                         System.out.println("Ngày sinh :");
                         String ngaySinhNew = sc.nextLine();
                         managePerson1.edit(soDienThoai,new Person(soDienThoai,nhomNew,gioiTinhNew,hoTenNew,diaChiNew,ngaySinhNew));
                         System.out.println("Sửa thành công ");
                         break;
                     }
                case 4 :
                    System.out.println("Nhập số điện thoại muốn xóa ");
                    String soDienThoaixoa = sc.nextLine();
                   managePerson1.delete(soDienThoaixoa);
                    System.out.println("Xóa thành công ");
                    break;
                case 5 :
                    System.out.println("Nhập tên muốn tìm :");
                    String name = sc.nextLine();

                    for (Person person : managePerson1.searchName(name)
                         ) {
                        System.out.println(person);
                    }



            }

        }

    }

}
