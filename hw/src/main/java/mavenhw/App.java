package mavenhw;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        User me = new User("Oleksandra", "Ladnykh");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String myName = gson.toJson(me);
        System.out.println(myName);


    }

    static class User{
        String name;
        String lastName;

        User(String name, String lastName){
            this.name = name;
            this.lastName = lastName;
        }
    }
}
