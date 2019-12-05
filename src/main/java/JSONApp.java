import domain.BasicStudent;
import domain.Student;
import json.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JSONApp {
    public static void main(String[] args) {
        Json jYear = new JsonNumber(2);
        print(jYear); // 2

        Json jMarks = new JsonArray(new JsonNumber(3), new JsonNumber(4));
        print(jMarks); // [3, 4]

        JsonPair name = new JsonPair("name", new JsonString("Andrii"));
        JsonPair surname = new JsonPair("surname", new JsonString("Rodionov"));
        JsonPair marks = new JsonPair("marks", jMarks);
        JsonPair year = new JsonPair("year", jYear);
        JsonObject jsonObj = new JsonObject(name, surname, year, marks);
        print(jsonObj); // {'name': 'Andrii', 'surname': 'Rodionov', 'year': 2, 'marks': [3, 4]}

        print(jsonObj.projection("surname", "age", "year", "marks")); // {'surname': 'Rodionov', 'year': 2, 'marks': [3, 4]}

        BasicStudent basicStudent = new BasicStudent("Andrii", "Rodionov", 2);
        print(basicStudent.toJsonObject()); // {'name': 'Andrii', 'surname': 'Rodionov', 'year': 2}

    }

    private static void print(Json json) {
        System.out.println(json.toJson());
    }


    public static JsonObject sessionResult() {
        Json jYear = new JsonNumber(2);
        Json jMarks = new JsonArray(new JsonNumber(3), new JsonNumber(4));
        JsonPair name = new JsonPair("name", new JsonString("Andrii"));
        JsonPair surname = new JsonPair("surname", new JsonString("Rodionov"));
        JsonPair year = new JsonPair("year", jYear);
        JsonObject jsObj = new JsonObject()
        List exam1 = new ArrayList<JsonPair>();
        List exam2 = new ArrayList<JsonPair>();
        List exam3 = new ArrayList<JsonPair>();
        JsonPair courses1 = new JsonPair("course", new JsonString(new String("OOP"));
        JsonPair courses2 = new JsonPair("mark", new JsonString(new String("3"));
        JsonPair courses3 = new JsonPair("passed", new JsonString(new String("true"));
        JsonPair courses4 = new JsonPair("course", new JsonString(new String("English"));
        JsonPair courses5 = new JsonPair("mark", new JsonString(new String("5"));
        JsonPair courses6 = new JsonPair("passed", new JsonString(new String("true"));
        JsonPair courses7 = new JsonPair("course", new JsonString(new String("Math"));
        JsonPair courses8 = new JsonPair("mark", new JsonString(new String("2"));
        JsonPair courses9 = new JsonPair("passed", new JsonString(new String("false"));
        exam1.add(courses1);
        exam1.add(courses2);
        exam1.add(courses3);
        exam2.add(courses4);
        exam2.add(courses5);
        exam2.add(courses6);
        exam3.add(courses7);
        exam3.add(courses8);
        exam3.add(courses9);
        JsonObject jsonObject = new JsonObject(name, surname, year, marks);
        return jsonObject;
    }
}
