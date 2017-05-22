import java.util.Date;

/**
 * Created by qngapparat on 18.05.17.
 */
public class Main {

    public static void main(String[] args){

        MetaInfoList<Integer, String> myList1 = new MetaInfoList<>();
        MetaInfoList<String, Date> myList2 = new MetaInfoList<>();

        Date myDate1 = new Date();
        Date myDate2 = new Date();
        Date myDate3 = new Date();

        myList1.add(1337, "thats leet");
        myList1.add(69, "lol hehe");
        myList1.add(420, "blaze it lmaaooooo lol");

        myList2.add("firstadd", myDate1);
        myList2.add("secondadd", myDate2);
        myList2.add("thirdadd", myDate3);


        System.out.println(myList1.get(0) + ":" + myList1.getMetaInfo(0));
        System.out.println(myList1.get(1) + ":" + myList1.getMetaInfo(1));
        System.out.println(myList1.get(2) + ":" + myList1.getMetaInfo(2));


        System.out.println(myList2.get(0) + ":" + myList2.getMetaInfo(0));
        System.out.println(myList2.get(1) + ":" + myList2.getMetaInfo(1));
        System.out.println(myList2.get(2) + ":" + myList2.getMetaInfo(2));

        /*
        System.out.println(myList2.get(0));
        System.out.println(myList2.get(1));
        System.out.println(myList2.getMetaInfo(2));*/


    }

}
