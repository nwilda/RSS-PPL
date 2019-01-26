package ppljoss.statuspersyaratan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private TextView textViewtahapan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.status);

    textViewtahapan= (TextView) findViewById(R.id.tahapan);
    textViewtahapan.setText(R.string.tahapan_selanjutnya);
    }
}
