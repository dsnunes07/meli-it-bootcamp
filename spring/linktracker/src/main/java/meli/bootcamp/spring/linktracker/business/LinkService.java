package meli.bootcamp.spring.linktracker.business;

import meli.bootcamp.spring.linktracker.model.LinkDTO;
import meli.bootcamp.spring.linktracker.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkService {

    @Autowired
    LinkRepository linkRepository;

    public Integer create(LinkDTO link) {
        return linkRepository.create(link);
    }

    public LinkDTO find(Integer linkId, String password){
        LinkDTO link = linkRepository.find(linkId);
        if (link.getPassword().equals(password)) {
            linkRepository.increaseAccessCounter(linkId);
            return link;
        }
        return null;
    }
}
