package com.cubic.umohackathonblockchain.endpoint;

import com.cubic.umohackathonblockchain.dto.Ticket;
import com.cubic.umohackathonblockchain.dto.TicketPurchaseRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ticket")
public interface TicketEndpoint {

    @PostMapping
    Ticket buyTicket(@RequestBody TicketPurchaseRequest request);

    @GetMapping("/validate/{ticketId}")
    boolean validateTicket(@PathVariable("ticketId") String ticketId);
}
