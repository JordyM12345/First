
public class password {

	public static void main(String[] args) {
		
				
				boolean ans = isGoodPassword("ds1fGggrr/ee");
				System.out.print("Is good password?\n" + ans);
			}
			
			public static boolean isGoodPassword(String s)
			{
				
				boolean longEnough = true;
				boolean upperCase= true;
				boolean lowerCase= true;
				boolean nonAl= true;
				boolean digit= true;
				
				boolean isGoodPassword = false;
				
				//>= 8
				if (s.length() < 8)
				{
					longEnough = false;
				}
				
				
				//has uppercase
				for (int i = 0; i < s.length(); i++) 
				{
					if (Character.isUpperCase(s.charAt(i)))
					{
						upperCase = true;
						break;
					}
					else 
					{
						upperCase = false;
					}
				}
				
				//hasLowerCase
				for (int i = 0; i < s.length(); i++) 
				{
					if (Character.isLowerCase(s.charAt(i))) 
					{
						lowerCase = true;
						break;
					}
					else 
					{
						lowerCase = false;
					}
				}
				
				//has non alpha
				for (int i = 0; i < s.length(); i++) 
				{
					if (!Character.isLetterOrDigit(s.charAt(i)))
					{
						nonAl = true;
						break;
					}
					else 
					{
						nonAl = false;
					}
				}
				
				//has digit
				for (int i = 0; i < s.length(); i++) 
				{
					if (Character.isDigit(s.charAt(i)))
					{
						digit = true;
						break;
					}
					else 
					{
						digit = false;
					}
				}
				
				if (longEnough == true && upperCase  == true && lowerCase == true && nonAl == true && digit == true)
				{
					isGoodPassword = true;
				}
				
				return isGoodPassword;

			}

	


	}


