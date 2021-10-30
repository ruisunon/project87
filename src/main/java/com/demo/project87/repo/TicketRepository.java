package com.demo.project87.repo;

import com.demo.project87.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Iterable<Ticket> findAllByOrderByIdAsc();

    Iterable<Ticket> findAllByLockExpiryIsNotNull();

}
