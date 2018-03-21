package com.example.demo.controller;

import com.example.demo.model.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.error.CustomErroType;

import static com.example.demo.model.Client.clientList;

@RestController
@RequestMapping("clients")
public class ClientEndPoint {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> showAllClients() {
        return new ResponseEntity<>(clientList, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<?> showClientById(@PathVariable("id") int id){
        Client student = new Client();
        //student.setClientId(id);
        int index = clientList.indexOf(student);

        if (index == -1)
            return new ResponseEntity<>(new CustomErroType("Student not found"), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(clientList.get(index), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<?> saveClient(@RequestBody Client client){
        clientList.add(client);
        return  new ResponseEntity<>(client, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteClient(@RequestBody Client client){
        clientList.remove(client);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateClient(@RequestBody Client client){
        clientList.remove(client);
        clientList.add(client);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}