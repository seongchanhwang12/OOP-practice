package dev.chan.chapter01;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }

    public boolean hasInvitation() {
        return bag.hasInvitation();
    }

    public void buy(Ticket ticket) {
        bag.minusAmount(ticket.getFee());
        bag.setTicket(ticket);
    }
}
