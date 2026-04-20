package app.users.comparators;

import app.users.models.User;

import java.util.Comparator;

public class UserBithdayComparer implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {

        return o1.getBirthday().compareTo(o2.getBirthday());
    }
}
