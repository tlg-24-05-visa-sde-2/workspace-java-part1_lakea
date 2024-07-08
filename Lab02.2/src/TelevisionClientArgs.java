import java.sql.SQLOutput;
import java.util.Arrays;

class TelevisionClientArgs {
    public static void main(String[] args) {
        //must first check for the presence of your required 3 arguments
        if (args.length < 3) {
            String usage = "Usuage: Java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: Java TelevisionClientArgs Samsung 32 PLASMA";
            String note1 = "Note 1: supported displays are " + Arrays.toString(DisplayType.values());
            String note2 = "Note 2: Volume must be between " + Television.MIN_VOLUME + " and " + Television.MAX_VOLUME;
            String note3 = "Note 3: Supported brands are " + Arrays.toString(Television.VALID_BRANDS);
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            return;
                     //early return from main(), application exits
        }

        // at this point you can safely proceed because you have arguments
        // 1st lets show we have them
        // System.out.println("You provided " + args.length + " arguments");

        //STEP 1: convert argument strings into proper types for Television
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());

        //STEP 2: create an instance of Television woh these converted values
        Television tv = new Television(brand, volume, display);

        //STEP 3: print it toString and congratulate them on their fine purchase
        System.out.println("Congratulations, your custom Television is on it's way");
        System.out.println(tv); //toString() automatically called
    }

}