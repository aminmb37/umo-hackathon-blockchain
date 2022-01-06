package com.cubic.umohackathonblockchain.endpoint;

import com.cubic.umohackathonblockchain.dto.Ticket;
import com.cubic.umohackathonblockchain.dto.TicketPurchaseRequest;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketEndpointImpl implements TicketEndpoint {
    @Override
    public Ticket buyTicket(TicketPurchaseRequest request) {
        return null;
    }

    @Override
    public boolean validateTicket(String ticketId) {
        return false;
    }
}
