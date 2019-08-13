package prob05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LoginMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		List<User> joinUsers = new ArrayList<User>();
		joinUsers.add( new User( "john", "1234") );
		
		System.out.println("아이디를 입력하시오 : ");
		String id = scanner.nextLine();
		
		System.out.println("비밀번호를 입력하시오 : ");
		String password = scanner.nextLine();
		
		//ArrayList의 1번째 요소의 객체를 비교
		if(joinUsers.get(0).equals(new User(id, password))) {
			System.out.println("로그인 성공");
		}else {
			System.out.println(id);
			System.out.println(password);
			
			if(joinUsers.get(0).getPassword() != password) {
				System.out.println("비밀번호 실패");
			}
			System.out.println("로그인 실패");
		}
		

	}
	
	public static void login(List<User> users, User user ) throws UserNotFoundException, PasswordDismatchException {
		if( !users.contains(user) ){
			throw new UserNotFoundException();
		}
		
		User savedUser = users.get( users.indexOf( user ) );
		
		if( !savedUser.getPassword().equals( user.getPassword()) ){
			throw new PasswordDismatchException();
		}
	}
}
