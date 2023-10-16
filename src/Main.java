public class Main {
    public static void main(String[] args) {
        Reservation[]reservations = new Reservation [3];
        reservations[0]= new Reservation("John", 564);
        reservations[1]=new Reservation("Wendy", 564);
        reservations[2]=new Reservation("Mandy", 176);

        String key ="Wendy" ;
        for (Reservation r: reservations)
            if (r.name.equals(key)){
                System.out.println(r.room_number);
                break;
            }
    }
}
class Reservation{
    Reservation(String name, int room_number){
        this.name=name;//use this.name, name just means local variable. ypu want to store it in the member variable
        this.room_number=room_number;
    }
    String name;
    int room_number;

}