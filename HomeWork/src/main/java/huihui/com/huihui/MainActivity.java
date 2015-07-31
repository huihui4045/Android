package huihui.com.huihui;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private AutoCompleteTextView autoCompleteTextView;


    private String[][] datas = new String[][]{{"海淀区", "朝阳区"}, {"商丘", "开封"}, {"青岛", "日照"}};

    private String[] privace = new String[]{"北京", "山东", "河南"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.auto);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line, privace);


        autoCompleteTextView.setAdapter(adapter);


        autoCompleteTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                String str = s.toString();
                if (str.equals(privace[0])) {
                    Toast.makeText(MainActivity.this, datas[0].toString(), Toast.LENGTH_SHORT).show();

                } else if (str.equals(privace[1])) {

                    Toast.makeText(MainActivity.this, datas[1].toString(), Toast.LENGTH_SHORT).show();
                } else if (str.equals(privace[2])) {
                    Toast.makeText(MainActivity.this, datas[2].toString(), Toast.LENGTH_SHORT).show();
                }

            }
        });


    }


}
