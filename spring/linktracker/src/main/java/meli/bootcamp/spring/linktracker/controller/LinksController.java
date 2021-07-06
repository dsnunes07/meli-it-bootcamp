package meli.bootcamp.spring.linktracker.controller;

import meli.bootcamp.spring.linktracker.business.LinkService;
import meli.bootcamp.spring.linktracker.model.LinkDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RequestMapping("/link")
@RestController
public class LinksController {
    @Autowired
    LinkService linkService;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Integer> create(@RequestBody LinkDTO link) {
        Integer linkId = linkService.create(link);
        return new ResponseEntity<>(linkId, HttpStatus.OK);
    }

    @GetMapping("/{linkId}/{password}")
    @ResponseStatus(HttpStatus.OK)
    public void find(@PathVariable int linkId, @PathVariable String password, HttpServletResponse response) {
        LinkDTO link = linkService.find(linkId, password);
        response.setStatus(302);
        response.setHeader("Location", link.getUrl());
    }
}
