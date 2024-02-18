import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class practice{
    public static void main(String[] args) {
        //practice1
        ArrayList a=new ArrayList();
        a.add("Ankit");
        a.add("Rohit");
        a.add("Sumit");
        a.add("Ram");
        a.add("puja");

        for(Object o :a)
        {
            System.out.println(o);
        }

        //practice 2
        Date d= new Date();
        System.out.println(d.getHours()+":"+ d.getMinutes()+":"+ d.getSeconds());

        //practice 3
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        //practice 4
        LocalDateTime t=LocalDateTime.now();

        DateTimeFormatter df=DateTimeFormatter.ofPattern("H:m:s");
        String mytime=df.format(t);
        System.out.println(mytime);


        //practice 5
        HashSet<Integer> s =new HashSet();
        s.add(5);
        s.add(4);
        s.add(6);
        s.add(9);
        s.add(10);
        s.add(10);
        System.out.println(s);
        

    }
}