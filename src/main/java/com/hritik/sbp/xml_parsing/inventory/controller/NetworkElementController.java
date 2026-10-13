package com.hritik.sbp.xml_parsing.inventory.controller;


import com.hritik.sbp.xml_parsing.inventory.dto.NetworkElementRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/network-elements")
public class NetworkElementController {

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public NetworkElementRequest createNetworkElement(@RequestBody NetworkElementRequest request) {
        System.out.println("Received network element: " + request.getId());
        return request;
    }
}