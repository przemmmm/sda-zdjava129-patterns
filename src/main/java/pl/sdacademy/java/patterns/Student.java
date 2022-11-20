package pl.sdacademy.java.patterns;

public class Student implements HasPerson{

   private Person person ;  //kompozycja
   private String groupCode;

   @Override
   public Person getPerson() {
      return person;
   }

   public String getGroupCode() {
      return groupCode;
   }
}
