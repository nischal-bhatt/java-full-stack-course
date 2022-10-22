package SOLIDDESIGNPRINCIPLES;

public class SingleResponsibilityExample {

	public static void main(String[] args) {
		
		
		
	}
}

interface IUser {
	boolean Login(String username, String password);
    boolean Register(String username, String password, String email);
   // void LogError(String error);
   // boolean sendEmail(String content);
}

interface LogError {
	void LogSomeError(String error);
}

interface sendEmail {
	boolean SendAnEmail(String content);
}
