package com.asanast.technical.interview.asaitec.controller;

import com.asanast.technical.interview.asaitec.domain.entity.Ticket;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController("/api/tickets")
public class TicketController {

    @GetMapping("/ticketoperator")
    public ResponseEntity<?> getTicketsOperator() {
        return ResponseEntity.ok("OK");
    }

    @PostMapping("/create")
    public ResponseEntity<?> createTicket(Principal principal, @RequestBody Ticket ticket) {
        return ResponseEntity.ok("OK");
    }

    @PutMapping("/comment/{id}")
    public ResponseEntity<?> comment(Principal principal, @RequestParam Long id) {
        return ResponseEntity.ok("OK");
    }

    @PostMapping("/ticket/{ticketId}/user/{userId}")
    public ResponseEntity<?> assignToOperator(@RequestParam Long ticketId, @RequestParam Long userId) {
        return ResponseEntity.ok("OK");
    }

}
