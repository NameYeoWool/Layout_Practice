package desipline.layout_practice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ListView extends AppCompatActivity {

    android.widget.ListView listView;
    ArrayAdapter<String> mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = (android.widget.ListView) findViewById(R.id.listView1);
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, new ArrayList<String>());
        listView.setAdapter(mAdapter);
        initData();
    }

    private void initData(){
        String[] items = getResources().getStringArray(R.array.list_item);
        for(String s:items){
            mAdapter.add(s);
        }
    }
}
