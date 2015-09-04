import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Problem1 {
	public static void main(String vb[])throws Exception {
		Order[] orderobj = new Order[8];
		ArrayList<Order> list = new ArrayList<Order>();
		try{
  			orderobj[0] = new Order("Vinay",7.7,"08/01/1992",95,85,75,85,80,random());
  			orderobj[1] = new Order("Vbrr",7.7,"01/12/1992",95,85,75,70,90,random());
  			orderobj[2] = new Order("bharath",7.7,"12/01/1992",95,85,75,85,80,random());
  			orderobj[3] = new Order("purna",7.7,"12/10/1992",95,85,75,90,80,random());
  			orderobj[4] = new Order("Venky",7.7,"08/01/1992",95,85,75,85,80,random());
  			orderobj[5] = new Order("Vbrk",7.7,"01/12/1992",95,85,75,70,90,random());
  			orderobj[6] = new Order("reddy",7.7,"12/01/1992",95,85,75,85,80,random());
  			orderobj[7] = new Order("pu",7.8,"12/10/1992",95,85,75,90,80,random());
  		
  			for(int i = 0; i < orderobj.length; i++) {
				list.add(orderobj[i]);
			}
		

  			Collections.sort(list, new Comparision());
			Collections.reverse(list);
			for (Order output : list) {
				System.out.println(output);
			}
  		} catch (Exception error) {}
	}

	public static int random () {
		int hTckt;
		Random rand = new Random();
		hTckt = rand.nextInt(99);
		return hTckt;
	}

}