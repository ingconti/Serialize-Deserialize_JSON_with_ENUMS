package org.example;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GSONEnumExamples {
    public static void main(String[] args) {
        serializeEnumGson();
        deserializeEnumGson();
    }

    public static void serializeEnumGson() {
        Project project = new Project(100, "CMS", "Content Management System", ProjectStatus.NEW);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String result = gson.toJson(project);
        System.out.println(result);
    }

    public static void deserializeEnumGson() {
        String input = "{\r\n" +
                "  \"projectId\": 100,\r\n" +
                "  \"projectName\": \"CMS\",\r\n" +
                "  \"projectDesc\": \"Content Management System\",\r\n" +
                "  \"projectStatus\": \"NEW\"\r\n" +
                "}";
        Gson gson = new GsonBuilder().create();
        Project project = gson.fromJson(input, Project.class);
        System.out.println(project.toString());
    }
}
