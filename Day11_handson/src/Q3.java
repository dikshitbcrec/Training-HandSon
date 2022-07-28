import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 Write a program in java for LambdaExpressionFilter demo. The filter will filter 
 the list of electronic products whose cost is less than 20000 and print the details of productsin the list whose cost is greater than 20000

Step1: Create an Electronic Product bean class with attributes id , name and price

Step2: create a main method and add list of products created to product list

Step3: create a stream object and filter the list using stream filter and lambda expression

Step4: Using lambda expression iterate through list to print product name and product price

Sample output
Iphone 6S: 65000.0
Sony Xperia: 25000.0
Redmi4 : 26000.0
 */
public class Q3 {
public static void main(String[] args) {
	List<Electronic> ec=new ArrayList<Electronic>();
	ec.add(new Electronic(1,"Iphone",65000f));
	ec.add(new Electronic(2,"Samsung",21000f));
	ec.add(new Electronic(3,"Sony Xperia",25000f));
	ec.add(new Electronic(4,"Vivo",18000f));
	ec.add(new Electronic(5,"Redmi",12000f));
	ec.add(new Electronic(6,"Oppo",31000f));
	
	Map<String, Float> map= ec.stream()
			.filter(p-> p.price > 20000)
			.collect(Collectors.toMap(p->p.name, p->p.price));
	
	map.forEach((k,v)->{
		System.out.println(k+" : "+v);
	});
}
}
