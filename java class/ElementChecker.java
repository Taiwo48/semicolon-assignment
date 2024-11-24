import java.util.List;
 public class ElementChecker { 
public static void main(String[] args) { 
List<Integer> numbers = List.of(1, 2, 3, 4, 5); 
int elementToCheck = 3; 
boolean exists = containsElement(numbers, elementToCheck); 
System.out.println("Does the list contain " + elementToCheck + "? " + exists); 
}
 public static boolean containsElement(List<Integer> list, int element)
 { 
for (int item : list) { 
if (item == element) { 
return true; 
} 
} 
return false; 
}
 }