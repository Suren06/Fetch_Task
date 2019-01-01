package Service;


import Model.Users;

import java.util.List;

    public interface FetchService {

        Users findByUsername(String username);
        List<Users> findAllContacts();
    }
