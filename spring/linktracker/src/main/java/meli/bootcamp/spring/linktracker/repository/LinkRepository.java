package meli.bootcamp.spring.linktracker.repository;

import meli.bootcamp.spring.linktracker.model.LinkDTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class LinkRepository {

    private HashMap<Integer, LinkDTO> links = new HashMap<Integer, LinkDTO>();
    public Integer create(LinkDTO link) {
        this.links.put(links.size() + 1, link);
        return this.links.size();
    }

    public LinkDTO find(Integer linkId) {
        return this.links.get(linkId);
    }

    public void increaseAccessCounter(Integer linkId) {
        this.links.get(linkId).increaseAccessCounter();
    }
}
