package basic_programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrainSeat implements Cloneable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<Integer, Integer> seat = new HashMap<Integer, Integer>();
		seat.put(1, 11);
		seat.put(2, 9);
		seat.put(3, 7);
		seat.put(4, 5);
		seat.put(5, 3);
		seat.put(6, 1);
		seat.put(7, -1);
		seat.put(8, -3);
		seat.put(9, -5);
		seat.put(10, -7);
		seat.put(11, -9);
		seat.put(0, -11);
		Map<Integer, String> seatName = new HashMap<Integer, String>();
		seatName.put(1, "WS");
		seatName.put(2, "MS");
		seatName.put(3, "AS");
		seatName.put(4, "AS");
		seatName.put(5, "MS");
		seatName.put(0, "WS");
		StringBuffer out = new StringBuffer();
		for(int i=s.nextInt();i>0;i--){
			int seatNumber = s.nextInt();
			out.append(seat.get(seatNumber%12)+ seatNumber).append(" ").append(seatName.get(seatNumber%6)).append("\n");
		}
		TrainSeat t = new TrainSeat();
		try {
			t.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(out);
	}
}
