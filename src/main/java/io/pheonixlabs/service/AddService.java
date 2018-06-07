package io.pheonixlabs.service;

/**
 * Created by anand on 4/15/2018.
 */

import io.pheonixlabs.entity.CollectionDetails;
import jdk.nashorn.internal.ir.ObjectNode;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class AddService {

    public static Map<String, CollectionDetails> collectionDetailsMap = new LinkedHashMap<>();

/*    @PostMapping("/addNewService")
    public ModelAndView addNewService(@RequestBody ObjectNode jsonData) {

        collectionDetailsMap.put("");

        return new ModelAndView("", params);
    }*/

}
