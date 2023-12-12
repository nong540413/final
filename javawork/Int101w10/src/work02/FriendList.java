package  work02; //3.
public class FriendList { //3.,3.1
    private final String friend; //3.2
    private FriendList next; //3.3
    private FriendList(String friend) { //3.4
        this.friend = friend;
    }
    public static FriendList newList() { //3.5
        return new FriendList("");
    }
    public boolean addFriend(String friend) { //3.6
        if (friend == null || friend.isBlank()) return false;
        var current = this;
        while (current.next != null) {
            current = current.next;
            if (current.friend.equals(friend)) return false;
        }
        current.next = new FriendList(friend);
        return true;
    }
    @Override
    public String toString() { //3.7
        FriendList current = this.next;
        if (current == null) return "";
        StringBuilder s = new StringBuilder();
        s.append(current.friend);
        while ((current=current.next) != null) {
            s.append(", ").append(current.friend);
        }
        return s.toString();
    }
}