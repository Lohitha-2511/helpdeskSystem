import java.util.Scanner;
public class helpDeskApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TicketService ticketService = new TicketService();
        int choice;
        do {
            System.out.println("==== HELPDESK ====");
            System.out.println("1. Create Ticket");
            System.out.println("2. View Tickets");
            System.out.println("3. Search Ticket");
            System.out.println("4. Update Status");
            System.out.println("5. Delete Ticket");
            System.out.println("6. View OPEN Tickets");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Create ticket");
                    int ticketId = sc.nextInt();
                    String ticketTitle = sc.next();
                    String Description = sc.next();
                    ticketStatus status= ticketStatus.OPEN;
                    ticket t = new ticket(ticketId, ticketTitle, Description, status);
                    ticketService.addTicket(t);
                    break;

                case 2:
                    ticketService.displayTickets();
                    break;
                case 3:
                    System.out.println("Enter the ticket id you want :");
                    int id = sc.nextInt();
                    ticket t1 = ticketService.searchTicketById(id);
                    if(t1!=null){
                        System.out.println(t1);
                    }else{
                        System.out.println("Ticket not found");
                    }
                    break;
                case 4:
                    System.out.println("Enter the id and Status : ");
                    id = sc.nextInt();
                    System.out.println("Select the stauts :");
                    System.out.println("1. OPEN");
                    System.out.println("2. IN_PROGRESS");
                    System.out.println("3. RESOLVED");
                    System.out.println("4. CLOSED");
                    int statusChoice = sc.nextInt();
                    ticketStatus statuses = ticketStatus.values()[statusChoice - 1];
                    ticketService.updateStatus(id, statuses);
                    break;
                case 5:
                    System.out.println("Enter the Ticket id you want to delete :");
                    id = sc.nextInt();
                    ticketService.deleteTicket(id);
                    break;
                case 6:
                    System.out.println("open tickets are :");
                    ticketService.openTickets();
                    break;
                case 7:
                    System.out.println("Exiting ...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while (choice != 7);
    }
}