package com.developer.flavia.bibliotec;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LivrosActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livros);

        String [] NomeLivros = new String[]{"Programação em Java","Desenvolvimento Mobile Android","Historia Da Computação"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,NomeLivros);
        listView = (ListView)findViewById(R.id.listLivros);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                switch (position){

                    case 0:
                        String url = "https://drive.google.com/file/d/0B7yupPfGAOJlTDlIam5HWkRxVjg/view";
                        i.setData(Uri.parse(url));
                        startActivity(i);

                        break;
                    case 1:
                        String url1 = " https://drive.google.com/file/d/0B4vTRz_mEjbtSlh1ZHlKdjVlWjg/view";
                        i.setData(Uri.parse(url1));
                        startActivity(i);

                        break;
                    case 2:

                        String url2 = "https://drive.google.com/file/d/0B4QrkmTXYQ6GdEZaZkJMdm5SaGc/view";
                        i.setData(Uri.parse(url2));
                        startActivity(i);

                        break;

                }
            }
        });


    }
}
