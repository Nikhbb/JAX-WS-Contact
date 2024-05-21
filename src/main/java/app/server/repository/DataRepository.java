package app.server.repository;

import app.server.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<Contact> fetchData() {
        List<Contact> list = new ArrayList<>();
        list.add(new Contact(1, "Tom", "0971234567"));
        list.add(new Contact(2, "Alice", "0982365984"));
        list.add(new Contact(3, "Bob", "0993265945"));
        return list;
    }
}
