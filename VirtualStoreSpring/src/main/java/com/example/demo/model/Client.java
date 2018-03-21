package com.example.demo.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class Client {

    private int clientId;
    private String clientName;
    public static List<Client> clientList;

    static {
        clientRepository();
    }

    public Client(){}

    public Client(String clientName){
        this.clientName = clientName;
    }

    public Client(String clientName, int clientId){
        this(clientName);
        this.clientId = clientId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    private static void clientRepository() {
        clientList = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientId == client.clientId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(clientId);
    }
}
