package edu.jcsc.springwebviacep.model;

import org.springframework.stereotype.Component;

@Component
public class ViaCepModel {
    
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    
    public String getCep() {
        return cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getComplemento() {
        return complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public String getLocalidade() {
        return localidade;
    }
    public String getUf() {
        return uf;
    }
    @Override
    public String toString() {
        return "ViaCep [cep="         + 
        cep + ", logradouro="         + 
        logradouro + ", complemento=" + 
        complemento + ", bairro="     + 
        bairro + ", localidade="      + 
        localidade + ", uf="          + 
        uf                            + 
        "]";
    }
   
}
