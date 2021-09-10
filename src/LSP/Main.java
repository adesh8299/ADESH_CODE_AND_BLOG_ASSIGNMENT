package LSP;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Member> myList = new ArrayList<Member>();

        myList.add(new LifetimeMember("Adesh ",new Date()));
        myList.add(new AnnualMember("Kumar",new Date()));
        myList.add(new EnquiryUser("Shukla"));
        for (Member c: myList){
            c.addToDatabase();
        }
    }

}
