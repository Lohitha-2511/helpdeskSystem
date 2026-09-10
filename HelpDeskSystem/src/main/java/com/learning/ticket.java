public class ticket{

    private int ticketId;
    private String Title;
    private String description;
    private ticketStatus status;

    public ticket(int ticketId, String Title, String description, ticketStatus status){
        this.ticketId = ticketId;
        this.Title = Title;
        this.description = description;
        this.status = status;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ticketStatus getStatus() {
        return status;
    }

    public void setStatus(ticketStatus status) {
        this.status = status;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ticket{" +
                "ticketId=" + ticketId +
                ", Title='" + Title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}