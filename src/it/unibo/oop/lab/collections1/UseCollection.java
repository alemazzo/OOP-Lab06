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
    	
    	for(int i : list1) {
    		System.out.println(i);
    	}
    	
    	
    	list1 = new ArrayList<>();
    	list2 = new LinkedList<>();
    	
    	
    	// ************************************ //
    	
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
        
        
        // ************************************ //
        
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
        
        
        // ************************************ //
        
        final int NUMREAD = 1000;
        time = System.nanoTime();
        for (int i = 1; i <= NUMREAD; i++) {
            list1.get(list1.size()/2);
        }
        /*
         * Compute the time and print result
         */
        time = System.nanoTime() - time;
        System.out.println("Reading " + NUMREAD
                + " times the middle element from ArrayList took " + time
                + " ns");
        
        // ************************************ //
        
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
        
        // ************************************ //
        
        Map<String, Long> world = new HashMap<>();
        world.put("Africa", 1110645000l);
        world.put("Americas", 972005000l);
        world.put("Antartica", 0l);
        world.put("Asia", 4298723000l);
        world.put("Africa", 742452000l);
        world.put("Africa", 38304000l);
        
        long sum = 0;
        for(long value : world.values()) {
        	sum += value;
        }
        System.out.println("Sum = " + sum);
    }
}
