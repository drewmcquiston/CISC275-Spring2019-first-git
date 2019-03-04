# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.
done

2. What five objects are created in the main?
The ArrayList dogs, the 3 Dogs in that list, and the Animal Comparator.

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?
This is the line that calls the constructor: Collections.sort(dogs, new Comparator<Animal>(){
There is no Comparator class definition in this file because the original java.util.Comparator class is imported and used and then the compare method is overridden.