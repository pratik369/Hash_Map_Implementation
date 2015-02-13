/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapimp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pratik
 */
public class HashMapImp {

    
    class Container {
        Object key;
        Object value;
        public void insert(Object key, Object value){
            this.key=key;
            this.value=value;
        }
    }
    
    
    private Container c;
    private List<Container> recordList;
    
    public HashMapImp(){
        this.recordList = new ArrayList<Container>();
    }
    
    
    public void put(Object key, Object value){
        this.c= new Container();
        c.insert(key, value);
        for(int i=0;i<recordList.size();i++){
            Container c1 = recordList.get(i);
            if(c1.key.equals(key)){
                recordList.remove(i);
                break;
            }
            
        }
        recordList.add(c);
        
    
    }
    
    
    public Object get(Object key){
        for(int i = 0; i<this.recordList.size(); i++){
            Container c = recordList.get(i);
            if(key.toString() == c.key.toString())
                return c.value;
        }
        return null;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        HashMapImp hashmap = new HashMapImp();
        hashmap.put("5", "1");
        hashmap.put("4", "2");
        hashmap.put("3", "3");
        System.out.println(hashmap.get("3"));
        hashmap.put("6", "4");
         
        System.out.println(hashmap.get("5"));
        System.out.println(hashmap.get("3"));
        System.out.println(hashmap.get("6"));
    }
    
}
