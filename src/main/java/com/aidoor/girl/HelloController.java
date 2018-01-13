package com.aidoor.girl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

@RequestMapping(value = "{id}/hi",method = RequestMethod.GET)
    public String say(@PathVariable("id") int id){
    return "hello spring boot"+id;
}
}
