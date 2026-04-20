package app.users.comparators;

import app.users.models.User;

import java.util.Comparator;

public class UserPermissionsComparer implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {

        if(o1.getPermissions().size() > o2.getPermissions().size()){
            return 1;
        }
        else if(o1.getPermissions().size() < o2.getPermissions().size()){
            return -1;
        }

        return 0;
    }
}
