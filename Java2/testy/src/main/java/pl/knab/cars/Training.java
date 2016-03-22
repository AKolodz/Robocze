package pl.knab.cars;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Training {
	public static void main(String args[]){
int i=0;
//		
//		Car carsArray[]=new Car[10];		//tworzę miejsce na ten typ obiektów
//		for(Car car:carsArray){
//			car=new Car();					//używam konstruktora dla każdego z miejsc które zaallokowałem
//			car.setType("kombi");
//			carsArray[i++]=car;
//		}
//		
//		carsArray[0].setType("VW Golf");
//		
//		for(Car car:carsArray){
//			System.out.println(car.getType());
//		}
	///////////////////////////////////////////////////////////////////////////	
		
		List<Car> carsList=new ArrayList<Car>();
		for(i=0;i<10;i++){
			Car car=new TerrainCar();
			carsList.add(car);
		}
		for(Car car:carsList){
			System.out.println(car.type);
		}
		carsList.remove(5);
		
		System.out.println();
		for(Car car:carsList){
			System.out.println(car.type);
		}
		/////////////////////////////////////////////////////////////////////////
		//jeden typ obiektu przyjmuje każdego, gdy chce sie dodać jeszcze raz-> zwraca false i nic nie zmienia, daje możliwość obsługi błędu
		Set<Car> carsSet=new HashSet<>();
		//carsSet.add(e)
		////////////////////////////////////////////////////////////////////////
		Map<String,Car> mapp=new HashMap<>();
		try{
		Map<Integer,Car> carsMap=new HashMap<>();
		Car carValue1=new Car();
		carValue1.setType("Nowy");
		Car carValue2=new Car();
		carValue2.setType("Stary");
		Car carValue3=new Car();
		carValue3.setType("Używany");
		
		carsMap.put(1, carValue1);
		carsMap.put(2, carValue2);
		carsMap.put(3, carValue3);
		
		mapp.put(carValue1.getType(), carValue1);
		mapp.put(carValue2.getType(), carValue2);
		mapp.put(carValue3.getType(), carValue3);
		
		carsMap.remove(3);
		mapp.remove(carValue3.getType());
		}catch (Exception e){
			System.err.println("Error occured!");
		}finally{
			mapp.clear();
		}
	}
}

