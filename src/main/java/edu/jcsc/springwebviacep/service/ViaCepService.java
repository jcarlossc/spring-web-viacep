package edu.jcsc.springwebviacep.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import edu.jcsc.springwebviacep.model.ViaCepModel;

@Service
public class ViaCepService {
    
    public ViaCepModel getAddress(String cep){
        RestTemplate template = new RestTemplate();
        return template.getForObject(
            "https://viacep.com.br/ws/{cep}/json",
            ViaCepModel.class, 
            cep);
    }
}
