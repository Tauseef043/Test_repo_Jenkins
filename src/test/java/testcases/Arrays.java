package testcases;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			String[] fruits= {"Apple","Mango","Banana","Orange","Coconut"}; 
			
		int[] Age = {10,24,5,6,7,86,35};
		//array will always start from 0 index
		
		
		
		System.out.println(fruits[2]);

		System.out.println(fruits[4]);
		System.out.println(fruits[0]);
		System.out.println(Age[0]);
		System.out.println(Age[3]);
		System.out.println(Age[4]);
		
		System.out.println(Age);
		
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Value of array index :"+i+" and value of array : "+Age[i]);
			
		}
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Value of array index :"+i+" and value of array : "+fruits[i]);
			
		}
		
		
		
		
		///ARray List
		ArrayList<String> CARS= new ArrayList<String>();

		
		CARS.add(0, "Honda");
		CARS.add(1, "SUZUKI");
		CARS.add(2, "TAYOTA");
		CARS.add(3, "BMW");
		CARS.add(4, "KIA");
		CARS.add(5, "PROTON");
		CARS.add(6, "PORCHE");
		
		System.out.println(CARS);
		
		System.out.println(CARS.get(3));
		System.out.println(CARS.get(0));
		
		
		CARS.remove(3);
		System.out.println(CARS);
		
		CARS.set(3, "FARARI");
		System.out.println(CARS);

		System.out.println("Size of the array: "+CARS.size());
		
		CARS.clear();
		
		System.out.println("value of arrat after clear method : "+CARS);
	
		
		System.out.println(CARS.size());
		
		
		
		System.out.println("**********************************************************************");
		
		CARS.add(0, "Honda");
		CARS.add(1, "SUZUKI");
		CARS.add(2, "TAYOTA");
		CARS.add(3, "BMW");
		CARS.add(4, "KIA");
		CARS.add(5, "PROTON");
		CARS.add(6, "PORCHE");
		
		
		
		for(int i=0; i<CARS.size();i++)
		{
			System.out.println(CARS.get(i));
			
		}
		
		
		
	}

}
