package flocally.appsriv.fbandgpluslogin;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Homescreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);
        TextView user_name =(TextView)findViewById(R.id.user_name);


        Bundle bundle = getIntent().getExtras();
        if (bundle!=null)
        {
            String name = bundle.getString("name");
            if (name!=null)
            {
                user_name.setText(name);
            }
            else
            {
                user_name.setText("Unknown Name");
            }

        }
    }

}
