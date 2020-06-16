package com.faldrow;

import com.faldrow.service.PeopleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Artur on 16.06.2020.
 */
@Component
public class Start{

    @Autowired
    public Start(PeopleClient peopleClient)
    {
        peopleClient.save();
    }
}
