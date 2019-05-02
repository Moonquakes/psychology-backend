package psychology.service;

import org.springframework.stereotype.Service;
import psychology.bl.ContactService;
import psychology.entity.Contact;
import psychology.response.BasicResponse;

@Service
public class ContactServiceImpl implements ContactService {

    @Override
    public Contact[] getContact(){
        //TODO

        return null;
    }

    @Override
    public BasicResponse addContact(String name, String email, String mobileNum){
        //TODO

        return null;
    }

    @Override
    public BasicResponse deleteContact(String name){
        //TODO

        return null;
    }
}
