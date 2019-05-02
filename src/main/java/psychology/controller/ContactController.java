package psychology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import psychology.bl.ContactService;
import psychology.entity.Contact;
import psychology.parameter.ContactParam;
import psychology.response.BasicResponse;

@CrossOrigin
@RestController
@RequestMapping(value = "/contact")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping(value = "/getContact")
    public Contact[] getContact(){
        return contactService.getContact();
    }

    @PostMapping(value = "/addContact")
    public BasicResponse addContact(@RequestBody ContactParam param){
        return contactService.addContact(param.getName(),param.getEmail(),param.getMobileNum());
    }

    @PostMapping(value = "/deleteContact")
    public BasicResponse deleteContact(@RequestBody ContactParam param){
        return contactService.deleteContact(param.getName());
    }
}
