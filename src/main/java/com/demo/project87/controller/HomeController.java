package com.demo.project87.controller;

import com.demo.project87.domain.Ticket;
import com.demo.project87.repo.TicketRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class HomeController {

    @Autowired
    TicketRepository customerRepo;

    @GetMapping(value = "/api/tickets")
    public Iterable<Ticket> getTickets() {
        return customerRepo.findAll();
    }

    @PostMapping(value = "/api/book")
    public Ticket bookTicket(@RequestBody Ticket ticket) {
        log.info("Saving customer!");
        return customerRepo.save(ticket);
    }

}
