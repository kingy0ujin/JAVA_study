package excerise;

/**
 * 사용자 정보
 */
public class Member  {

    private String userId;      // 사용자 ID

    private String password;    // 비밀번호

    private String userName;    // 사용자 이름

    private int age;            // 나이

    /**
     * 사용자 정보 초기화를 위한 생성자
     * @param userId  사용자ID
     * @param password 비밀번호
     * @param userName  사용자 이름
     * @param age  이름
     */
    public Member(String userId, String password, String userName, int age) {
        this.userId = userId;
        this.password = password;
        this.userName = userName;
        this.setAge(age);
    }

    /**
     * 사용자 ID Getter 
     */
    public String getUserId() {
        return userId;
    }
    /**
     * 사용자ID Setter
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 비밀번호 Getter
     */
    public String getPassword() {
        return password;
    }

    /**
     * 비밀번호 Getter
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 사용자이름 Getter
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 사용자이름 Setter
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /** 
     * 나이 Getter
     */
    public int getAge() {
        return age;
    }

    /**
     * 나이 Setter
     */
    public void setAge(int age) {
        // 나이 0보다 클 때 설정하고 
        // 0보다 작으면 0으로 설정.
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }
}
