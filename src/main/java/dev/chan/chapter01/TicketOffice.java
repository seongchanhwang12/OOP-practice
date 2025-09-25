package dev.chan.chapter01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... ticket) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(ticket));
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long fee) {
        this.amount -= fee;
    }

    public void plusAmount(Long fee) {
        this.amount += fee;
    }


}
