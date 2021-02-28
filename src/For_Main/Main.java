package For_Main;

import java.util.Locale;
import java.util.Scanner;



//8537ан7дрей к_"№;;)2345о12нон23;"!ен;"2134ко -> Андрей Кононенко
public class Main {
    public static void main(String[] args) {
        String FullName = "";
        Scanner scanner = new Scanner(System.in);
        FullName = scanner.nextLine();
        StringBuilder sb = new StringBuilder("");
        FullName = FullName.trim();
        char[] FullNameArray = FullName.toCharArray();
        boolean flag = true;
        for (int i = 0; i < FullNameArray.length; i++) {
            if (flag){
                if (Character.isLetter(FullNameArray[i])){
                    FullNameArray[i] = Character.toUpperCase(FullNameArray[i]);
                    flag = !flag;
                }
            }
            if (Character.isLetter(FullNameArray[i]) || FullNameArray[i] == ' '){
                if (i < FullNameArray.length-1) {
                    if (FullNameArray[i] == ' ' && (Character.isLetter(FullNameArray[i+1])  )) {
                        FullNameArray[i+1] = Character.toUpperCase(FullNameArray[i+1]);
                    }
                    if (FullNameArray[i] == ' ' && FullNameArray[i+1] == ' ') {
                        continue;
                    }
                }
                sb.append(FullNameArray[i]);
            }
        }
        String FullNameTemp = sb.toString();
        System.out.println(FullNameTemp);
    }
}
