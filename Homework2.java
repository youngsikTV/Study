import java.util.Scanner;

class Student {
    int id;
    String name;
    String major;
    long phoneNumber;

    public Student(int id, String name, String major, long phoneNumber){
        this.id = id;
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String change(){
        String number = Long.toString(phoneNumber);
        String first = number.substring(0, 2);
        String middle = number.substring(2, 6);
        String last = number.substring(6);
        return "0" + first + "-" + middle + "-" + last;
    }
    public void printing() {
        System.out.println(id + ", " + name + ", " + major + ", " + change());
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        for (int i = 0; i < 3; i++){
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요 : ");
            int id = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            long phoneNumber = sc.nextLong();

            students[i] = new Student(id, name, major, phoneNumber);
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        System.out.print("첫번째 학생 : "); students[0].printing();
        System.out.print("두번째 학생 : "); students[1].printing();
        System.out.print("세번째 학생 : "); students[2].printing();

    }
}
