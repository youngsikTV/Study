import java.util.*;
import java.io.*;

public class Homework9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> db = new HashMap<>();

        // db.txt 에서 ID/비밀번호 읽기
        try {
            File file = new File("./db.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNext()) {
                String id = fileScanner.next().trim();
                String pw = fileScanner.next().trim();
                db.put(id, pw);
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("db.txt 파일을 찾을 수 없습니다.");
            return; // 프로그램 종료
        }

        // 로그인 기능 시작
        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String inputId = sc.nextLine().trim();

            // id 존재 여부 확인
            if (!db.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            // 비밀번호 입력
            System.out.print("password : ");
            String inputPw = sc.nextLine().trim();

            // 비밀번호 일치 확인
            if (!db.get(inputId).equals(inputPw)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            // 둘 다 맞음
            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }

        sc.close();
    }
}
