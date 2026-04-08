package app.liste;


import app.users.models.User;

import java.util.Objects;

public class UserNode {
    private User user;
    private UserNode next;

    public UserNode(User user) {
        this.user = user;
    }


    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public UserNode getNext() {
        return next;
    }
    public void setNext(UserNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "UserNode{" +
                "user=" + user +
                ", next=" + next +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserNode userNode = (UserNode) o;
        return Objects.equals(user, userNode.user) && Objects.equals(next, userNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, next);
    }
}
