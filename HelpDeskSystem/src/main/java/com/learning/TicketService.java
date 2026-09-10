import java.util.ArrayList;
public class TicketService {
    private ArrayList<ticket> tickets = new ArrayList<>();
    public void addTicket(ticket t){
        tickets.add(t);
        System.out.println("Ticket Created Sucessfully");
    }
    public void displayTickets(){
        for(ticket t: tickets){
            System.out.println(t);
        }
    }
    public ticket searchTicketById(int ID){
        for(ticket t : tickets){
            if(t.getTicketId() == ID){
                return t;
            }
        }
        return null;
    }

    public void updateStatus(int ID,ticketStatus status) {
        ticket t = searchTicketById(ID);
        if (t != null) {
            t.setStatus(status);
            System.out.println("Status Updated Sucessfully");
        } else {
            System.out.println("Ticket Not Found");
        }
    }

    public void deleteTicket(int ID){
        ticket t = searchTicketById(ID);
        if(t!=null){
            tickets.remove(t);
            System.out.println("Ticket deleted sucessfully");
        }
        else{
            System.out.println("Ticket Not Found");
        }
    }

    public void openTickets(){
        tickets.stream()
                .filter(t -> t.getStatus() == ticketStatus.OPEN)
                .forEach(System.out::println);
    }

}