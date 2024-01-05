public class D_SwitchStatements {

    public static void main(String[] args) {

        //
        // Switch Statement 1
        //

        // Voeg aan onderstaand switch statement de juiste cases toe. Vergeet ook niet op de juiste plekken een `break` toe te voegen.
        int y = 1;
        switch (y) {
            case 1:
                System.out.println(y + "=one");
                break;
            case 2:
                System.out.println(y + "=two");
                break;
            case 3:
                System.out.println(y + "!=one && !=two");
                break;
        }


        //
        // Switch Statement 2
        //

        // Coca-Cola maakt Cola, Fanta en Sprite
        // PepsiCo maakt Pepsi,7Up en Mountain Dew
        // Implementeer een switch statement dat, gegeven het drankje, het merk print.
        // Bij geen resultaat print het statement "onbekend".
        String drink = "Mountain Dew";

        switch (drink) {
            case "Cola":
            case "Fanta":
            case "Sprite":
                System.out.println(drink + " is van het merk Coca-Cola");
                break;
            case "Pepsi":
            case "7Up":
            case "Mountain Dew":
                System.out.println(drink + " is van het merk PepsiCo");
                break;
            default:
                System.out.println("onbekend");
                break;
        }

    }
}
