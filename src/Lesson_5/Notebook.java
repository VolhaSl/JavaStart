package Lesson_5;

public class Notebook {

    String day;
    String activity;
    String place;
    double startTime;
    double coast;

    public void ScheduleActivity(){
        System.out.println(day+ " " + "-" +" " + activity);
    }

    public void FullInfo(){
         System.out.println(day + " " + activity + "\n"
                + "stsrt" +" "+startTime +"\n"
                + place +"\n"
                +"coast" + " " +coast);

    }

}
