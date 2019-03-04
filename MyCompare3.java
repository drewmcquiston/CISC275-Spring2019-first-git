import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCompare3 {
	
	public static void main(String[] args){
		
		List<Dog> dogs = new ArrayList<Dog>(); //object 1
		dogs.add(new Dog("Fido", 4)); //object 2
		dogs.add(new Dog("Fido", 3)); //object 3
		dogs.add(new Dog("Alfie", 4)); //object 4

		System.out.println(dogs);
		Collections.sort(dogs, new Comparator<Animal>(){ //object 5 is comparator
			@Override
			public int compare(Animal a, Animal b){
			    return a.getLegs() - b.getLegs();
			}
		});
		System.out.println(dogs);
	}
}