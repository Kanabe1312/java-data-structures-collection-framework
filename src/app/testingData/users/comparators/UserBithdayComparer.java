package app.testingData.users.comparators;

import app.testingData.users.models.User;

import java.util.Comparator;

public class UserBithdayComparer implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {

        return o1.getBirthday().compareTo(o2.getBirthday());
    }
}
