package org.example;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GSONEnumSample {
    public static void main(String[] args) {
        serializeEnumGson();
        deserializeEnumGson();
    }

    public static void serializeEnumGson() {
        God god = new God( "Neptune", "God of Sea", God.PowerType.CAN_RAISE_WAVES);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String result = gson.toJson(god);
        System.out.println(result);
    }

    public static void deserializeEnumGson() {
        String input = "{\r\n" +
                "  \"name\": \"Jupiter\",\r\n" +
                "  \"desc\": \"Boss of all Gods\",\r\n" +
                "  \"powerType\": \"CAN_THROW_LIGHTINGS\"\r\n" +
                "}";
        Gson gson = new GsonBuilder().create();
        God project = gson.fromJson(input, God.class);
        System.out.println(project.toString());
    }
}
