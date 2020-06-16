package com.faldrow.model;

import lombok.*;

import java.util.List;
import java.util.Set;

/**
 * Created by Artur on 15.06.2020.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Result {

    private String count;
    private String next;
    private String previous;
    private Set<Element> results;
}
