package com.demo.project87;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import com.demo.project87.domain.Ticket;
import com.demo.project87.repo.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    TicketRepository ticketRepo;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<String> city = Arrays.asList("London", "New York", "Bangalore");
        ticketRepo.deleteAll();
        IntStream.range(1, 201).forEach(i -> {
            ticketRepo.save(Ticket.builder()
                    .seatNumber("Seat_" + i)
                    .eventDate(LocalDate.now())
                    .build());
        });
    }
}
