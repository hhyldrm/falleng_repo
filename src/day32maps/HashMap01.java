package day32maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/*
 1) Map use key value structure
 2)"key"s must be unique, "value"s can be dublicated
 3)"key"s can't be null except in "Hashmap", it can have just once
 4)"value"s can use null many times
 
 5) HashMap does not put elements in any order, because of that it is too fast
 6) If you send another value to a key, it overwrites new value
 */
public class HashMap01 {

public static void main(String[] args) {
        
        HashMap< Integer,String > hm1 = new HashMap<>();
        //How to add elements to a HashMap
        hm1.put(100, "Ali");
        hm1.put(101, "Veli");
        hm1.put(102, "Mete");
        System.out.println(hm1);//{100=Ali, 101=Veli, 102=Mete}
        hm1.put(102, "Efe");
        System.out.println(hm1);//{100=Ali, 101=Veli, 102=Efe}
        hm1.put(103, null);
        System.out.println(hm1);//{100=Ali, 101=Veli, 102=Efe, 103=null}
        hm1.put(104, "");
        System.out.println(hm1);//{100=Ali, 101=Veli, 102=Efe, 103=null, 104=}
        hm1.put(105, "Ali");
        System.out.println(hm1);//{100=Ali, 101=Veli, 102=Efe, 103=null, 104=, 105=Ali}
        
        HashMap< Integer,String > hm2 = new HashMap<>();
        hm2.put(200, "X");
        hm2.put(201, "Y");
        System.out.println(hm2);//{200=X, 201=Y}
        
        //If you use putAll(), data types of key and value must match, otherwise it gives Compile Time Error
        //how to add multiple elements
        hm1.putAll(hm2);
        System.out.println(hm1);//{100=Ali, 101=Veli, 102=Efe, 103=null, 104=, 200=X, 105=Ali, 201=Y}
        
        hm1.putIfAbsent(106, "Efe");// If the key is missing, then puts the entry
        System.out.println(hm1);//{100=Ali, 101=Veli, 102=Efe, 103=null, 104=, 200=X, 105=Ali, 201=Y, 106=Efe}
        
        hm1.putIfAbsent(100, "Alex");// If the key exists, then it does not put the entry
        System.out.println(hm1);//{100=Ali, 101=Veli, 102=Efe, 103=null, 104=, 200=X, 105=Ali, 201=Y, 106=Efe}
        
        //How to remove element from HashMap
        String val1= hm1.remove(100);
        System.out.println(val1);//Ali
        System.out.println(hm1);
        
        boolean val2= hm1.remove(101, "Veli");
        System.out.println(val2);//true
        System.out.println(hm1);//{102=Efe, 103=null, 104=, 200=X, 105=Ali, 201=Y, 106=Efe}
        
        //How to get data from HashMap
        String val3= hm1.get(102);
        System.out.println(val3);//Efe
        System.out.println(hm1);
        
        String val4= hm1.get(400);
        System.out.println(val4);//null: For non-existing key, it returns null
        
        String val5 = hm1.getOrDefault(102, "The key is missing");
        System.out.println(val5);//Efe
        
        String val6 = hm1.getOrDefault(500, "The key is missing");
        System.out.println(val6);//The key is missing
        
        Set<Integer> keys01 = hm1.keySet();
        System.out.println(keys01);//[102, 103, 104, 200, 105, 201, 106]
        
        Collection<String> values01 = hm1.values();
        System.out.println(values01);//[Efe, null, , X, Ali, Y, Efe]
        
        //How to update a value in HashMap
        String val7= hm1.replace(102, "Han");
        System.out.println(val7);//Efe
        System.out.println(hm1);
        
        String val8= hm1.replace(400, "Han");
        System.out.println(val8);//null: For non-existing key, it returns null
        System.out.println(hm1);
        
        boolean val9 =hm1.replace(105, "Ali", "Efe");
        System.out.println(val9);//true
        System.out.println(hm1);//{102=Han, 103=null, 104=, 200=X, 105=Efe, 201=Y, 106=Efe}
        
        boolean val10 =hm1.replace(500, "Ali", "Efe");
        System.out.println(val10);//false
        
        boolean val11 =hm1.replace(201, "A", "Efe");
        System.out.println(val11);//false
    }
}
