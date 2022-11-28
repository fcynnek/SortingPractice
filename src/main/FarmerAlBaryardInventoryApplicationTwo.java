package main;

import java.util.Arrays;
import main.animals.Pig;
import main.service.FileService;

public class FarmerAlBaryardInventoryApplicationTwo {

	public static void main(String[] args) {

		FileService fileService = new FileService();
		Pig[] pigs = fileService.getPigsFromFile();
		String[] pigNames = new String[4];
		int i = 0;
		
		// SORT the pigs by name...

		// 1. run a for loop on the pig array
		for (Pig pig : pigs) {

			// 2. In the for loop create an array called pig names, get the names of the pigs using
			// the getName getter from the Pig class, save it into the pigNames string array
			pigNames[i] = pig.getName();
			i = i + 1;
			
			// NOTE: only way to add into an array is through index [i]
		}
		
		// 3. Sort the pig names
		Arrays.sort(pigNames);
		
		// 4. Print the sorted names to the console
		for (String pigName : pigNames) {
			System.out.println(pigName);
		}
		
	}
}



