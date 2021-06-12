import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var arrStudent = new Student[1];
        arrStudent[0] = new Student(1, "toan", "nam", 18);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Thêm");
            System.out.println("2.Sửa");
            System.out.println("3.Xóa");
            System.out.println("4.Show");
            System.out.println("5.Exit");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    arrStudent = Manager.create(arrStudent);
                    break;
                case 4:
                    for (Student s:arrStudent) {
                        System.out.println(s);
                    }break;
                case 3 :
                    System.out.println("Nhập id cần xóa");
                    int x = sc.nextInt();
                    for (int i = 0; i < arrStudent.length; i++) {
                        if (arrStudent[i].id==x){
                        arrStudent = Manager.delete(arrStudent , i);
                        }
                    }
                    break;
                case 2 :
                    System.out.println("Nhập id cần sửa");
                    int x1 = sc.nextInt();
                    for (int i = 0; i < arrStudent.length; i++) {
                        if (arrStudent[i].id==x1){
                            do {
                            System.out.println("1.sửa id");
                            System.out.println("2.sửa tên");
                            System.out.println("3.sửa tuổi");
                            System.out.println("4.sửa giới tinh");
                            System.out.println("5.show");
                            System.out.println("6.exit");
                            int choose1 = sc.nextInt();
                            switch (choose1){
                                case 1 :
                                    System.out.println("Nhập id mới");
                                    int x2 = sc.nextInt();
                                    arrStudent[i].id=x2;break;
                                case 2 :
                                    System.out.println("Nhập tên mới");
                                    String x3 = sc.next();
                                    arrStudent[i].name=x3;break;
                                case 3 :
                                    System.out.println("Nhập tuổi mới");
                                    int x4 = sc.nextInt();
                                    arrStudent[i].age=x4;break;
                                case 4 :
                                    System.out.println("Nhập giới tính mới");
                                    String x5 = sc.next();
                                    arrStudent[i].gender=x5;break;
                                case  5 :
                                    for (Student s:arrStudent) {
                                        System.out.println(s);
                                    }
                                    break;
                                case 6 :
                                    System.exit(0);
                            }
                        } while (true);
                        }
                    }break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}