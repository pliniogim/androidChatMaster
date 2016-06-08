package edu.galileo.android.androidchat.contactlist.ui;

import edu.galileo.android.androidchat.contactlist.entities.User;

/**
 * Created by ykro.
 */
public interface ContactListView {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);
}
