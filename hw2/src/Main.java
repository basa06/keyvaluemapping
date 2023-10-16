import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String [] students = {"Alissa", "Ben", "Charlie", "Dianna"};
        String[] grades ={"B","D","B","A"};
        int index = Arrays.asList(students).indexOf("Charlie");
        String key = grades[index];
        for (int i = 0; i<grades.length; i++){
            if (grades[i]==key){
                System.out.println(key);
                break;
            }
        }
    }
}