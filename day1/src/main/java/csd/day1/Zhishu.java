package csd.day1;
import java.util.ArrayList;;

public class Zhishu {

	public static ArrayList calc(int i) {
		ArrayList arrList = new ArrayList();
		
		for(int j=2; j<i; j++)
		{
			while(i%j==0 && i>j)
			{
				arrList.add(j);
				i /= j;
			}
		}

		arrList.add(i);
		return arrList;

	}

}
