public class GirlFriend {

    String girlFriendName;
    String girlFriendFallInLoveTime;
    String girlFriendstatus;

    public GirlFriend(String name, String fallInLoveTime, String status) {
        girlFriendName = name;
        girlFriendFallInLoveTime = fallInLoveTime;
        girlFriendstatus = status;
    }

    void jealous() {
        System.out.println("หึงๆ");
    }

    void hungry() {
        System.out.println("หิวๆ");
    }

    void attack(GirlFriend gf) {
        System.out.println(this.girlFriendName + " ตี "+ gf.girlFriendName);
    }

    void cry() {
        System.out.println(this.girlFriendName + " ฮือๆ ");
    }
    
}