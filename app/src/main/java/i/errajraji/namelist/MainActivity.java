package i.errajraji.namelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_submit = findViewById(R.id.button6);
        final EditText editTextName = findViewById(R.id.edittext1);
        TextView textViewTitle = findViewById(R.id.textView5);
        ListView listViewNames = findViewById(R.id.listview1);
        final List<String> data = new ArrayList<>();


        final ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(  this, android.R.layout.simple_list_item_1, data);
        listViewNames.setAdapter(stringArrayAdapter);

        button_submit.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        String name = editTextName.getText().toString();
                        data.add(name);
                        stringArrayAdapter.notifyDataSetChanged();
                        editTextName.setText("");
                    }
                }
        );
    }
}