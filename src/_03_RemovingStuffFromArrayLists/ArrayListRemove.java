package _03_RemovingStuffFromArrayLists;

import java.util.ArrayList;

public class ArrayListRemove {

    class Stuff {
        public String type;
    }
    
    class Worm extends Stuff {
        public Worm() {
            type = "worm";
        }
    }
    
    class Dirt extends Stuff {
        public Dirt() {
            type = "dirt";
        }
    }

    // 1. Write a method that removes the dirt in the yard and returns the
    //    ArrayList
    public static ArrayList<Stuff> cleanOutTheYard( ArrayList<Stuff> yard ) {
    	for(int i = yard.size()-1;i>=0;i--) {
    		if(yard.get(i).type.equals("dirt")) {
    			yard.remove(i);
    		}
    	}
        return yard;
    }
    
    // 2. Write a method that removes the hash tag ('#') characters from the
    //    ArrayList and returns it
    public static ArrayList<Character> removeHashTags(ArrayList<Character> list) {
    	for(int i = list.size()-1;i>=0;i--) {
    		if(list.get(i).equals('#')) {
    			list.remove(i);
    		}
    	}
        return list;
    }
}
