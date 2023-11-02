package excerise;

public class MemberService  {
    // 향후 데이터베이스 읽어 초기화 하는 부분으로 변경.
    private static final Member[] MEMBERS = {
        new Member("anon1", "1q2w3e4r", "박철수", 10),
        new Member("anon2", "1qaz2wsx", "김영희", 11),
    };

    /**
     * 로그인 처리 
     * 입력된 사용자ID와 비밀번호가 일하하는 Mmeber가 존재하여 로그인 성공
     * @param userId 검색대상 사용자 ID
     * @param password userId의 비밀번호
     * @return
     */
    public boolean login(String userId, String password) {
        for (Member member : MEMBERS) {
            if (member.getUserId().equals(userId) && member.getPassword().equals(password)) {
            return true;
        }
        }

        return false;
    }
    /**
     * 사용자 정보 조회
     * @param userId 조회대상 사용자 ID
     * @return
     */
    public Member findBy(String userId) {
        for (Member member : MEMBERS) {
            if (member.getUserId().equals(userId)) {
                return member;
            }
        }
        return null;
    }
}
