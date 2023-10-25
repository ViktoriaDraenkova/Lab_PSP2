public class Person extends Human{
    private boolean ticket;
    private boolean document;
    Person(boolean ticket, boolean document, String name, String secondName, int age, boolean state){
        super(name, secondName, age, state);
        this.ticket=ticket;
        this.document=document;
    }

    public void setTicket(boolean ticket){
        this.ticket=ticket;
    }
    public boolean getTicket(){
        return ticket;
    }
    public void setDocument(boolean document){
        this.document=document;
    }
    public boolean getDocument(){
        return document;
    }
    @Override
    public void sayHello(){
        if(ticket&&document) {
            System.out.println("Здравствуйте, вот мой билетик и документ!");
        }
        else{
            System.out.println("Здравствуйте, я хотел бы приобрести билетик!");
        }
    }
    @Override
    public String toString() {
        String str =super.toString();
        return (str+" наличие документа "+document);
    }
    @Override
    public boolean equals(Object ob) {
        Person pers = (Person) ob;
        return super.equals(pers) && this.document == pers.document && this.ticket == pers.ticket;
    }
    @Override
    public int hashCode() {
        return super.hashCode() + 71;
    }
}
