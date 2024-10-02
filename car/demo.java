package car;

public class demo {
	public static void main(String[] args) { 
		
		int max_score=5;
		int user_score=2;
		double percentage=  max_score + (max_score>6 ? ++user_score : user_score);
		System.out.println("the percentage is"+percentage);
	}

	}


