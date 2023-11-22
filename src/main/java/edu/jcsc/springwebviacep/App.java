package edu.jcsc.springwebviacep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.jcsc.springwebviacep.model.ViaCepModel;
import edu.jcsc.springwebviacep.service.ViaCepService;

@Component
public class App implements CommandLineRunner {
    
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public void run(String... args) throws Exception {

       ViaCepModel viaCepModel = viaCepService.getAddress("50010-000");

       System.out.println(viaCepModel.getCep());
       System.out.println(viaCepModel.getLogradouro());
       System.out.println(viaCepModel.getBairro());
       System.out.println(viaCepModel.getLocalidade());
       System.out.println(viaCepModel.getUf());
    }

}
