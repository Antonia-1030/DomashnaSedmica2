package homework.informatics;

public class ZadachaTri {
    public static void main(String[] args){
        int FloorNumber = 4;
        string PhraseSaid;
        switch (FloorNumber){
            case 1:
                PhraseSaid = "Zdravei Mimi.";
                break;
            case 2:
                PhraseSaid = "Zdravei Vanya.";
                break;
            case 3:
                PhraseSaid = "Zdravei Boris.";
                break;
            case 4:
                PhraseSaid = "Zdravei Denica.";
                break;
            case 5:
                PhraseSaid = "Zdravei Zlatusha.";
                break;
            case 6:
                PhraseSaid = "Zdravei Vanya.";
                break;
            case 7:
                PhraseSaid = "Zdravei Nikolai.";
                break;
            case 8:
                PhraseSaid = "Zdravei Ivanka.";
                break;
            default:
                PhraseSaid= "OUCH!";
                break;
        }
        System.out.print("Skochiliyat kaza " + PhraseSaid);
    }
}
