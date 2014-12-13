package map;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ApplyMap {

	public static void main(String[] args) {
		/*
		 * UseMap() can be utilize here.
		 */
		UseMap um = new UseMap();
		um.addElementByMap("Apple", "red");
		um.addElementByMap("Orange", "orange");
		um.addElementByMap("Banana", "Yellow");
		um.addElementByMap("Respberry", "red");

		Map<String, String> newMap = new HashMap<String, String>();
		newMap = um.getCompleteMap();
		
		for ( Entry<String, String> entry : newMap.entrySet() ) {
			System.out.println("Key: " + entry.getKey() + ",     Value: " + entry.getValue());
		}
		System.out.println();
		
		Map<String, String> NewMap1 = new HashMap<String, String>();
		NewMap1.put("Cat", "Black");
		NewMap1.put("Dog", "Brown");
		NewMap1.put("Bird", "Blue");
		
		newMap = um.getDataByMap(NewMap1);
		for ( Entry<String, String> entry : newMap.entrySet() ) {
			System.out.println("Key: " + entry.getKey() + ",     Value: " + entry.getValue());
		}
		System.out.println();
		List<String> listOfFruits = new ArrayList<String>();
		listOfFruits.add("Apple");
		listOfFruits.add("Banana");
		listOfFruits.add("Pear");
		
		List<String> listOfColors = new ArrayList<String>();
		listOfColors.add("White");
		listOfColors.add("Pink");
		listOfColors.add("Green");
		listOfColors.add("Red");
		
		List<String> listOfPlanets = new ArrayList<String>();
		listOfPlanets.add("Earth");
		listOfPlanets.add("Mars");
		listOfPlanets.add("Jupiter");
		listOfPlanets.add("Venus");
		
		
		Map<String, List<String>> listMap = new LinkedHashMap<String,List<String>>();
		listMap.put("Fruits", listOfFruits);
		listMap.put("Animals", listOfColors);
		listMap.put("Trees", listOfPlanets);
		
		Map<String, List<String>> retMap = new LinkedHashMap<String,List<String>>();
		retMap = um.getDataByMapList(listMap);
		for(Entry<String, List<String>> entry: retMap.entrySet()){
			System.out.println(entry.getKey()+" : "+ entry.getValue());
			
		}
	
			
		}
	}
