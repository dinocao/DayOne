package csd.day1;

public class Tennis {

	public static String getState(int i, int j) {
		// TODO Auto-generated method stub
		String str[] = {"Love", "Fifteen", "Thirty", "Forty"};
		if(i == j)
		{
			if(i < 3)
				return str[i] + " " + "All";
			else
				return "Deuce";
		} else	{
			if(i > 3 || j > 3)
			{
				if(i - j >= 2)
					return "A Win";
				if(j - i >=2)
					return "B Win";
				if(i - j > 0 || j - i > 0)
					return "A Aduantage";
			} 
			return str[i] + " " + str[j];
		}

	}

}
