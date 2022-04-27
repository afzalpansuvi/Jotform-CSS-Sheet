//import org.json.JSONArray;

//import org.json.JSONException;
import org.json.JSONObject;
public class NG {
    public static void main(String[] args) {
        Jotform client = new JotForm("3d46d7ff9353a3aebd8e4e648e496b57");
        //JSONObject answers = client.getSubmissions("", "100", null, "created_at");
        JSONObject answers = client.getFormSubmissions("221008427343043");
        try {
        System.out.println(answers.toString(4));
            } catch (Exception ex) {
        }
    }
}

Here's the output for a simple form with just one text field
{

  "content": [{

    "answers": {"1": {

      "name": "name",

      "order": "1",

      "sublabels": "{\"prefix\":\"Prefix\",\"first\":\"First Name\",\"middle\":\"Middle Name\",\"last\":\"Last Name\",\"suffix\":\"Suffix\"}",

      "text": "Name",

      "type": "control_fullname"

    }},

    "created_at": "2022-04-11 23:05:19",

    "flag": "0",

    "form_id": "221008427343043",

    "id": "5255419196673414988",

    "ip": "12.217.237.66",

    "new": "1",

    "notes": "",

    "status": "ACTIVE",

    "updated_at": null

  }],

  "duration": "21.43ms",

  "limit-left": 998,

  "message": "success",

  "responseCode": 200,

  "resultSet": {

    "count": 1,

    "limit": 20,

    "offset": 0

  }

}