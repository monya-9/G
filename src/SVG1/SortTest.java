package SVG1;

import java.util.*;

class Stu implements Comparable<Stu> {
   int number;
   String name;
   
   public Stu(int number, String name) {
      this.number = number;
      this.name = name;
   }
   
   public String toString() {
      return name;
   }
   public int compareTo(Stu s) {
      return number - s.number;
   }
}

public class SortTest {
   public static void main(String[] args) {
      Stu array[] = {
            new Stu(20090001, "±èÃ¶¼ö"),
            new Stu(20090002, "ÀÌÃ¶¼ö"),
            new Stu(20090003, "¹ÚÃ¶¼ö"),
      };
      List<Stu> list = Arrays.asList(array);
      Collections.sort(list, Collections.reverseOrder());
      System.out.println(list);
   }
}