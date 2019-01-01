package com.example.Fetch_Task;


import Model.Users;
import Service.FetchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

    @RestController
    @RequestMapping("/fetchContacts")
    public class FetchController {

        @Autowired
        private FetchService fetchService;

        @RequestMapping("/fetchContacts")
        public List<Users> getUsers(){
            return fetchService.findAllContacts();
        }
    }
