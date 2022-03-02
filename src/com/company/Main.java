package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(dopustim(45,47));
        System.out.println(dopustim(15,7));
        System.out.println(dopustim(75,-10));
        System.out.println(dopustim(50,17));
        System.out.println(dopustim(13,30));

    }
       public static String dopustim(int ageOfPerson, double temperature){
          if(ageOfPerson >= 20 && ageOfPerson <= 45 && temperature >= -20 && temperature <= 30)

              return "Можно идти гулять";

          else if(ageOfPerson < 20 && temperature >= 0 && temperature <= 28)

              return "Можно идти гулять";

          else if(ageOfPerson > 45 && temperature >= -10 && temperature <= 25)

              return "Можно идти гулять";

          else

              return "Отсавайтесь дома";
      }
}
