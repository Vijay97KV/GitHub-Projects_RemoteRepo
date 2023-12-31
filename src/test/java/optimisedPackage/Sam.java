package optimisedPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//create an array of type List n add the elements indivisually n groups,
//then sort n print by iterating through iterator, n for each loops, 
//vvi -> Collections.addAll(nameOfThe_fStringList, nameOfThe_StringArray);
public class Sam {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("vijay");
		names.add("vinay");
		names.add("sanjay");
//names.remove(1);
		// names.listIterator().equals(names);
		// names.stream().anyMatch();
		System.out.println("BeforeSorting: " + names);

		Collections.sort(names);
		System.out.println("AfterSorting : " + names);
		System.out.println();

		System.out.println("------------printing using foreach-----------------");
		// printing using foreach
		for (String string : names) {
			System.out.println(string);
		}

		// Further adding names
		names.add("Esha");
		names.add("Danny");
		System.out.println("=========Adding some names & printing Using Iterator() Operator =======");

		// String[] arrays = new String[4];

		String[] stringarray = { "Manu", "Abhi", "Harsha", "Kiran" };
//converted Arrays to List

//		names.addAll(Collections.addAll(Arrays.asList(stringarrays)));

		Collections.addAll(names, "vindya", "Shammi", "Nayana");
		Collections.addAll(names, stringarray);
		Collections.addAll(names, "Apurva", "ganavi");
//		names.addAll("k","v");

		String[] name2 = { "k", "v" };
		// adding arrays into List by converting itto list.
		names.addAll(Arrays.asList(name2));

//		Collections.addAll(names,Arrays.asList(name2));

		System.out.println("names adeen" + names);
		Iterator<String> single = names.iterator();
		while (single.hasNext()) {

			System.out.println(single.next());

		}

	}

}