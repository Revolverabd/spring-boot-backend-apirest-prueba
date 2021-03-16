package cl.cocha.spring.boot.backend.apirest.helpers;

import org.modelmapper.ModelMapper;

public class ModelHelper {

    public static ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
