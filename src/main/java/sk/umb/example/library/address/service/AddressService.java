package sk.umb.example.library.address.service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AddressService {


    public List<AddressDetailDto> getAllAddresses() {
        return Collections.EMPTY_LIST;
    }

    public Long createAddress(AddressDetailDto addressDetailDTO) {
        return 1L;
    }
}
