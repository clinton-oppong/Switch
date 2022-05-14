public class Main {
    public static void main(String[] args) {
/*        int value = 3;
        if (value == 1) {
            System.out.println("value was 1");
        } else if (value == 2) {
            System.out.println("value eas 2");
        } else {
            System.out.println("value was not 1 or 2");
        }
    }
 */

        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("value was 4 or 5 or 6");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("value was 1 or 2");
                break; //#usually a break is not needed
        }



        char switchletter = 'A';

        switch (switchletter){
            case 'A': case 'B': case 'C': case 'D' :
                System.out.println("yeb u got");
                break;

            default:
                System.out.println("not it sorry");
                break;
        }

    }
}