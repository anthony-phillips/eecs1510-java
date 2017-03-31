
public class Entry{
    // Name
    private String name;

    public String getName(){ return this.name; }

    public void setName(String name){ this.name = name; }

    // Quantity
    private int quantity;

    public int getQuantity(){ return this.quantity; }

    public void setQuantity(int quantity){ this.quantity = quantity; }

    // Note
    private String note;

    public String getNote(){ return this.note; }

    public void setNote(String note){ this.note = note; }

    // Constructor
    public Entry(String name, int quantity, String note){
        this.name = name;
        this.quantity = quantity;
        this.note = note;
    }

    public String toString(){
        return String.format("-- %s%n-- %d%n-- %s%n",
            this.getName(), this.getQuantity(), this.getNote());
    }
}