package json;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {
    private final List<JsonPair> jsonPairs = new ArrayList<JsonPair>();

    public JsonObject(JsonPair... jsonPairs) {
        for (JsonPair el : jsonPairs) {
            this.jsonPairs.add(el);
        }
    }

    @Override
    public String toJson() {
        String str = new String("{");
        Integer count = 0;
        for (JsonPair pair : this.jsonPairs) {
            str += "'" + pair.name + "'" + ":" + pair.value.toJson();
            count+=1;
            if ((this.jsonPairs.size() >1) && (this.jsonPairs.size()!=count)){
                str+=",";
            }
//            {'surname': 'Nik'}
        }
        str += "}";
        return str;
    }

    public void add(JsonPair jsonPair) {
        this.jsonPairs.add(jsonPair);
    }

    public Json find(String name) {
        // ToDo
        return null;
    }

    public JsonObject projection(String... names) {
        // ToDo
        return null;
    }
}
