import java.util.*;
public class compare {
  public static void main(String[] args) {
    //compare
    String name1 = "Tony";
    String name2 = "Tony2";

    //1 s1>s2 : +ve value
    //2 s1==s2 : 0
    //3 s1<s2 : -ve value


    // hello wello wello> hello
    // hello cello 

    if(name1.compareTo(name2)==0){
      System.out.println("Strings is equal");

    }else{
      System.out.println("Strings are not equal");
    }

    if(new String("Tony")== new String("Tony")){
      System.out.println("Strings are equal");
    } else {
      System.out.println("Strings are not equal");
    }
  }
  
}
