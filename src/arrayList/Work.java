package arrayList;

import java.util.ArrayList;

public class Work {

    String value;
    int index;

    public ArrayList <String> arrayList = new ArrayList<>();


   public void addValue(String value){
       arrayList.add(value);
   }

   public void removeValue(int index){
       arrayList.remove(index);
   }

}
