package helper;

import java.io.File;
import java.io.FileReader;

public class GetHTML {

    public static final String PATH = "C:\\Users\\ms\\IdeaProjects\\MyServlet\\src\\HTML\\";

    public String get(String name){
        String result = "";
        try {
            FileReader fr = new FileReader(new File(PATH+name));
            int c;
            while ((c = fr.read()) != -1){
                result += (char)c;
            }
            fr.close();
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        return result;
    }
}
