package com.faldrow.service;

import com.faldrow.model.Element;
import com.faldrow.model.Result;
import com.faldrow.repo.ElementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;


/**
 * Created by Artur on 15.06.2020.
 */
@Service
public class PeopleClient {

    @Autowired
    private ElementRepo elementRepo;

    //@Transactional
    public void save(){
        saveElementsall(getAllElements());

    }

    private void saveElementsall(Result result){
        for(Element element:result.getResults()){
            elementRepo.save(element);

        }
    }

    private Result getAllElements(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Result> exchange = restTemplate.exchange(
                "https://swapi.dev/api/people/",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Result.class);
        return exchange.getBody();

    }
}
