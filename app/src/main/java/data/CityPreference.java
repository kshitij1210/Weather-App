package data;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by admin on 07-Jun-17.
 */
public class CityPreference {
    SharedPreferences prefs;

    public CityPreference(Activity activity)
    {
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    public String getCity()
    {
        return prefs.getString("city" , "Delhi,India");
    }

    public void setCity(String city)
    {
        prefs.edit().putString("city",city).commit();
    }
}
