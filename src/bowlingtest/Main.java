package bowlingtest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello word");
        BufferedReader sorolvaso = null;
        ArrayList<Integer> leutottBabuk=  new ArrayList<Integer>();
        try {
            sorolvaso = new BufferedReader(new FileReader("Bowling1.txt"));
            String sor;


            while ((sor = sorolvaso.readLine()) != null) {
                System.out.println(sor.length());
                int z=sor.length();
                if(z>1){
                    for(int i=0;i<z;i++){
                        if(Character.getNumericValue(sor.charAt(i))!=-1){
                            leutottBabuk.add(Character.getNumericValue(sor.charAt(i)));
                        }

                    }
                        ;
                }
            }


            sorolvaso.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int sum=0;
        for(int i=0;i<leutottBabuk.size();i++){
            System.out.println("a leutott babu: "+leutottBabuk.get(i));
            sum+=leutottBabuk.get(i);
            System.out.println("szumma: "+sum);
        }
    }
}
