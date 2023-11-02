package excerise;

import java.util.Scanner;
/**
 * 회원관리App
 */
public class MemberApp {
    /**
     * Starting point
     */
    public static void main(String[] args) {

        MemberService memberSerive = new MemberService();

        Scanner scanner = new Scanner(System.in);

        System.out.print("로그인할 사용자를 입력하세요: ");
        String userId = scanner.nextLine().trim();

        // 입력한 사용자ID가 존재하지 않는다면 존재한 ID를 입력할 때까지 반복함.
        while (true) {
            Member member = memberSerive.findBy(userId);
            if (member != null) {
                break;
            }

            System.out.print("없은 아이디 입니다. 다시 로그인할 사용자를 입력하세요: ");
            userId = scanner.nextLine().trim();
        }

        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.nextLine().trim();

        // 입력받은 ID와 비밀번호가 맞는지 확인
        boolean isLoginSuccss = memberSerive.login(userId, password);
        if (isLoginSuccss) {
            System.out.println("로그인에 성공했습니다.");
        } else {
            System.out.println("로그인에 실패했습니다.");
        }
        scanner.close();
    }
}
