package functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class challengestreams {
    public static void main(String[] args) {
    	
    	List<String> names = new ArrayList<>();
        names.add("Max");
        names.add("Phoebe");
        names.add("Joey");
        names.add("Ross");
        
    	System.out.println(names);
    	List<String> filteredlist = names.stream().map(i->i.toLowerCase()).collect(Collectors.toList());
    	System.out.println(filteredlist);
}
}