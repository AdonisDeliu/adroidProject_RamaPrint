package com.fiek.ramaprint;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;

        import java.util.ArrayList;

public class Print extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print);

        mRecyclerView=findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter =new MyAdapter(this,getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList(){

        ArrayList<Model> models=new ArrayList<>();

        Model m=new Model();
        m.setTitle("Reklam per Kamion");
        m.setDescription("Reklame ngjitese per kamion." +
                          "Klienti : Osa-termosistem.");
        m.setImg(R.drawable.print1);
        models.add(m);

        m=new Model();
        m.setTitle("Shkrepesa");
        m.setDescription("Printim i shkrepsave me firme." +
                         "Klienti: Shala.");
        m.setImg(R.drawable.print2);
        models.add(m);

        m=new Model();
        m.setTitle("Etiketa");
        m.setDescription("Etiketa te punuara per klientin tone: AutoServis Gynber.");
        m.setImg(R.drawable.print3);
        models.add(m);

        m=new Model();
        m.setTitle("Kalendar Fletore");
        m.setDescription("Kalendare dhe fletore te printuara me firme." +
                         "Klienti: Korenica.");
        m.setImg(R.drawable.print4);
        models.add(m);

        m=new Model();
        m.setTitle("Etiketa");
        m.setDescription("Etiketa te printuara. " +
                         "Klienti: Daka Vinum.");
        m.setImg(R.drawable.print5);
        models.add(m);

        m=new Model();
        m.setTitle("Carad");
        m.setDescription("Carad e printuar me firme. " +
                         "Klienti: Windor Plast.");
        m.setImg(R.drawable.print6);
        models.add(m);

        m=new Model();
        m.setTitle("Maica");
        m.setDescription("Maica te printuara me logo te UCK.");
        m.setImg(R.drawable.print7);
        models.add(m);

        m=new Model();
        m.setTitle("Roman");
        m.setDescription("Kopertina e printuar per romanin Dikur...");
        m.setImg(R.drawable.print8);
        models.add(m);

        m=new Model();
        m.setTitle("Fletore");
        m.setDescription("Fletore te printuara me firme per klientin M&Sillosi.");
        m.setImg(R.drawable.print9);
        models.add(m);

        m=new Model();
        m.setTitle("Kimika");
        m.setDescription("Kimika te printuara me firme per klientin Topalli.");
        m.setImg(R.drawable.print10);
        models.add(m);

        return models;
    }
}
