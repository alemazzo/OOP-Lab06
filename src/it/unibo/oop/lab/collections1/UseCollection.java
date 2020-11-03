package it.unibo.oop.lab.collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {

    private UseCollection() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
    	
    	List<Integer> list1 = new ArrayList<>();
    	
    	for (int i = 1000; i < 2000; i++) {
    		list1.add(i);
    	}
    	
    	List<Integer> list2 = new LinkedList<Integer>(list1);
    	
    	
    	final var swap = list1.get(0);
    	list1.set(0, list1.get(list1.size() - 1));
    	list1.set(list1.size() - 1, swap);
    	
    	for(Integer i : list1) {
    		//System.out.println(i);
    	}
    	
    	
    	list1 = new ArrayList<>();
    	list2 = new LinkedList<>();
    	
    	long time = System.nanoTime();
        /*
         * Run the benchmark
         */
    	final int ELEMS = 100000;
        for (int i = 1; i <= ELEMS; i++) {
            list1.add(0, i);
        }
        /*
         * Compute the time and print result
         */
        time = System.nanoTime() - time;
        System.out.println("Inserting " + ELEMS
                + " int into ArrayList took " + time
                + " ns");
        
        
        time = System.nanoTime();
        for (int i = 1; i <= ELEMS; i++) {
            list2.add(0, i);
        }
        /*
         * Compute the time and print result
         */
        time = System.nanoTime() - time;
        System.out.println("Inserting " + ELEMS
                + " int into LinkedList took " + time
                + " ns");
        
        
        final int NUMREAD = 1000;
        time = System.nanoTime();
        for (int i = 1; i <= NUMREAD; i++) {
            list1.get(ELEMS/2);
        }
        /*
         * Compute the time and print result
         */
        time = System.nanoTime() - time;
        System.out.println("Reading " + NUMREAD
                + " times the middle element from ArrayList took " + time
                + " ns");
        
        
        time = System.nanoTime();
        for (int i = 1; i <= NUMREAD; i++) {
            list2.get(ELEMS/2);
        }
        /*
         * Compute the time and print result
         */
        time = System.nanoTime() - time;
        System.out.println("Reading " + NUMREAD
                + " times the middle element from LinkedList took " + time
                + " ns");
        
        Map<String, Long> world = new HashMap<>();
        world.put("Africa", 1110645000l);
        world.put("Americas", 972005000l);
        world.put("Antartica", 0l);
        world.put("Asia", 4298723000l);
        world.put("Africa", 742452000l);
        world.put("Africa", 38304000l);
        
        long sum = 0;
        for(String key : world.keySet()) {
        	sum += world.get(key);
        }
        System.out.println("Sum = " + sum);
        
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
        /*
         * 8) Compute the population of the world
         */
    }
}
