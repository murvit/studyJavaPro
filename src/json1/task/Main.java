package json1.task;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) throws Exception {

        byte[] buf;
        try (RandomAccessFile f = new RandomAccessFile("C:\\Vit\\study\\xml\\json.txt", "r");
        )
        {
            buf = new byte[(int)f.length()];
            f.read(buf);
        }

        String result = new String(buf);

        Gson gson = new GsonBuilder().create();
        Person person = gson.fromJson(result, Person.class);

        System.out.println(person.name);
        System.out.println(person.surname);

        for (String phone: person.phones) {
            System.out.println(phone);
        }
        System.out.println(person.address.country);
        System.out.println(person.address.city);
        System.out.println(person.address.street);
    }
}
