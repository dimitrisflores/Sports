import java.util.ArrayList;

public class runSports
	{
		public static void main(String[] args)
		{
			ArrayList<sports> list = new ArrayList<sports>();
			list.add(new sports());
			list.add(new wrestling());
			list.add(new nonContactSports());
			list.add(new golf());
			
			for (sports s : list)
				{	
				((contactSports) s).funSport();
				((nonContactSports) s).nonHittingSports();
				((wrestling) s).wonState();
				((golf) s).lowestPR();
				System.out.println();
				}
			
		}
	}
