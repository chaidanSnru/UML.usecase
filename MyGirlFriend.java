import java.util.ArrayList;
import java.util.List;

public class MyGirlFriend {

    public static void main(String[] args) {
        GirlFriend nongNid = new GirlFriend("nongNid", "5Day", "old");
        GirlFriend nongSom = new GirlFriend("nongSom", "25Day", "old");
        GirlFriend nongPle = new GirlFriend("nongPle", "Now", "new");
        List<GirlFriend> girlFriendLists = new ArrayList<>();
        girlFriendLists.add(nongNid);
        girlFriendLists.add(nongSom);
        girlFriendLists.add(nongPle);
        for (GirlFriend girlFriend : girlFriendLists) {
            System.out.println("My girlfriend name " + girlFriend.girlFriendName +" fall in love for " 
            + girlFriend.girlFriendFallInLoveTime +" status " + girlFriend.girlFriendstatus);    
        }
        nongNid.attack(nongPle);
        nongPle.cry();
        nongSom.attack(nongPle);
        nongPle.cry();
    }
}