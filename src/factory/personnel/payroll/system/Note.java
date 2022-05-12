package factory.personnel.payroll.system;
/*@author AFSAR*/
public class Note {
    private int id;
    private String note;
    private String date;
    public Note next;
    
    public Note() {
        
    }
    
    public Note(int id,String note,String date) {
        this.id = id;
        this.note = note;
        this.date = date;
        this.next = null;
    }
    
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNote() {return note;}
    public void setNote(String note) {this.note = note;}

    public String getDate() {return date;}
    public void setDate(String date) {this.date = date;}
}
