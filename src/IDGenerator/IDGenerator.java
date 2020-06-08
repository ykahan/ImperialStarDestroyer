package IDGenerator;

import java.util.Random;

public final class IDGenerator {

    private IDGenerator(){

    }

    public static String getUniqueID(){
        char[] chars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
        'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
        'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3',
        '4', '5', '6', '7', '8', '9', '0'};

        String ID = "";
        for(int i = 0; i < 20; i++){
            Random rand = new Random();
            int index = rand.nextInt(chars.length - 1);
            ID += chars[index];
        }

        return ID;
    }
}

