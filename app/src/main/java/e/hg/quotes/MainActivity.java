package e.hg.quotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= findViewById (R.id.button);
        textView=findViewById(R.id.textView2);


       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               QouteServer quoteServer = new QouteServer();

               textView.setText(quoteServer.getRandomQuote());

           }
       });





    }
}


