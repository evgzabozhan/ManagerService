package com.zeoblocks.ManagerService.resource;

import com.zeoblocks.ManagerService.mapper.ClientMapper;
import com.zeoblocks.ManagerService.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/clients")
public class ClientResource {

    private ClientMapper clientMapper;

    public ClientResource(ClientMapper clientMapper){
        this.clientMapper = clientMapper;
    }

    @GetMapping("/all")
    public List<Client> getAllClients(){
        return clientMapper.findAll();
    }
}
