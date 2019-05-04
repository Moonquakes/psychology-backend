package psychology.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import psychology.bl.ContactService;
import psychology.dao.ContactRepo;
import psychology.entity.Contact;
import psychology.response.BasicResponse;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepo contactRepo;

    @Override
    public Contact[] getContact(){
        List<Contact> contactList = contactRepo.findAll();
        Contact[] contacts = new Contact[contactList.size()];
        for(int i=0;i<contactList.size();i++){
            contacts[i] = contactList.get(i);
        }
        return contacts;
    }

    @Override
    public BasicResponse addContact(String name, String email, String mobileNum){
        if(contactRepo.findById(name).isPresent()){
            return new BasicResponse(false,"该联系人的姓名已存在！");
        }else {
            Contact contact = new Contact(name,email,mobileNum);
            contactRepo.save(contact);
            return new BasicResponse(true,"");
        }
    }

    @Override
    public BasicResponse deleteContact(String name){
        if(contactRepo.findById(name).isPresent()){
            Contact contact = contactRepo.findById(name).get();
            contactRepo.delete(contact);
            return new BasicResponse(true,"");
        }else {
            return new BasicResponse(false,"该联系人的姓名不存在！");
        }
    }
}
