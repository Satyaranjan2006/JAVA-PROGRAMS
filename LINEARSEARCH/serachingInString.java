package LINEARSEARCH;
//searching in string 
public class serachingInString {
    public static void main(String[] args) {
        
    
    //take an string
    String name="satya";
   char target='t';
    System.out.println(searching(name,target));
    }

    static boolean searching(String name,char target){//getting the value
        for(int i=0;i<name.length();i++){
        if(target==name.charAt(i)){//checkin each  charecter
            return true;
        }

            }
            return false;
    }
   
}
