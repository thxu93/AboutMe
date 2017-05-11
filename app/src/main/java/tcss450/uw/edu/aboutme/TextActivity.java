package tcss450.uw.edu.aboutme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = "Hi, my name is Thomas Xu and I’m an alumni of " +
                "Central Washington University with a degree in Bachelor of Arts " +
                "Biology and a minor in Chemistry. I’ve decided to expand my areas of " +
                "knowledge and pursue a degree in Computer Science at UW in hopes of working " +
                "for a company where I can contribute my ideas and make a difference. " +
                "\nPlanning on graduating in the Fall of 2017 and doing an internship in the summer " +
                "at Starbucks.";

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }
}
