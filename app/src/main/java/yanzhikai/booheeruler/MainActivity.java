package yanzhikai.booheeruler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import yanzhikai.ruler.BooheeRuler;
import yanzhikai.ruler.KgNumberLayout;

public class MainActivity extends AppCompatActivity {
    private BooheeRuler mBooheeRuler;
    private KgNumberLayout mKgNumberLayout;
    private TextView tv_scale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBooheeRuler = (BooheeRuler) findViewById(R.id.br);
        tv_scale = (TextView) findViewById(R.id.tv_scale);
        mKgNumberLayout = (KgNumberLayout) findViewById(R.id.knl);

        mKgNumberLayout.bindRuler(mBooheeRuler);


    }
}
