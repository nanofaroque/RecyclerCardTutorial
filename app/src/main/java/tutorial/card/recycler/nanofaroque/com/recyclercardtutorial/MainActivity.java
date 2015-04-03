package tutorial.card.recycler.nanofaroque.com.recyclercardtutorial;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    ArrayList<PlaceInformation> placeList;


    private Integer[] imgid = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,
            R.drawable.img9,
            R.drawable.img10,
            R.drawable.img11,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.cardList);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        //placeList=new ArrayList<PlaceInformation>();
        placeList=createList();
        MyAdapter myAdapter=new MyAdapter(placeList);
        recyclerView.setAdapter(myAdapter);
    }

    private ArrayList<PlaceInformation> createList() {
        ArrayList<PlaceInformation> places=new ArrayList<>();
        places.add(new PlaceInformation("Md Omar Faroque","872-888-2069",imgid[0]));
        places.add(new PlaceInformation("Md Omar Faroque","872-888-2069",imgid[1]));
        places.add(new PlaceInformation("Md Omar Faroque","872-888-2069",imgid[2]));
        places.add(new PlaceInformation("Md Omar Faroque","872-888-2069",imgid[3]));
        places.add(new PlaceInformation("Md Omar Faroque","872-888-2069",imgid[4]));
        places.add(new PlaceInformation("Md Omar Faroque","872-888-2069",imgid[5]));
        places.add(new PlaceInformation("Md Omar Faroque","872-888-2069",imgid[6]));
        places.add(new PlaceInformation("Md Omar Faroque","872-888-2069",imgid[7]));
        places.add(new PlaceInformation("Md Omar Faroque","872-888-2069",imgid[8]));
        places.add(new PlaceInformation("Md Omar Faroque","872-888-2069",imgid[9]));
        places.add(new PlaceInformation("Md Omar Faroque","872-888-2069",imgid[10]));
        return places;

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
