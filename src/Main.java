public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("1234","nhom1","nu","hoa","na","5/9");
        Person person2 = new Person("125534","nhom1","nu","hoa","na","5/9");
        Person person3 = new Person("144234","nhom1","nu","hoa","na","5/9");
        Person person4 = new Person("123444","nhom1","nu","hoa","na","5/9");


        ManagePerson managePerson = new ManagePerson();
        managePerson.add(person1);
        managePerson.add(person2);
        managePerson.add(person3);
        managePerson.add(person4);


        managePerson.print();
        System.out.println(managePerson.search("1234"));
//        managePerson.remove("1234");
        managePerson.edit("123",person4);
        managePerson.print();

    }
}
