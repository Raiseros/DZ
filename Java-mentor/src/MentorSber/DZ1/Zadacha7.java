package MentorSber.DZ1;

//Задача 7
//В первый день спортсмен пробежал 10 км. Каждый следующий день он пробегал на 10% больше, чем предыдущий.
//Определить:
//- сколько км он пробежит в 10-й день;
//- в какой день он пробежит больше 20 км;
//- в какой день его суммарный пробег превысит 100 км.



public class Zadacha7 {
    public static void main(String[] args) {
       int dayNumber = 1;
       double dayDistance = 10;
       boolean flag = true, finish = false;
       double sumDistance = 0;

       while (!finish){
           sumDistance = sumDistance + dayDistance;
           if (dayNumber == 10){
               System.out.println(" Спортсмен пробежал в 10-й день  "   + Math.round(dayDistance) + " км");
           }
           if (flag && dayDistance > 20 ){
               System.out.println(" Спортсмен пробежал больше 20 км в  "   + dayNumber + "-й день");
               flag = false;
           }
           if (sumDistance > 100 ){
               System.out.println(" Спортсмен пробежал больше 100 км в  "   + dayNumber + "-й день");
               finish = true;
           }
           dayDistance = dayDistance * 1.1;
       }
    }
}
