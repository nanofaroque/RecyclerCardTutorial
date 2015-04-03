package tutorial.card.recycler.nanofaroque.com.recyclercardtutorial;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ofaro on 4/3/2015.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.PlaceInfoHolder> {
    private ArrayList<PlaceInformation> placeInformations;

    public MyAdapter(ArrayList<PlaceInformation> placeInformations) {
        this.placeInformations = placeInformations;
    }

    @Override
    public PlaceInfoHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        /* creating view from the layout for child element in the listview by using inflater*/
        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view,viewGroup,false);
        /*returning the new placeholder with the view*/
        return new PlaceInfoHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PlaceInfoHolder placeInfoHolder, int i) {
        //getting the place information from the list
        PlaceInformation placeInformation=placeInformations.get(i);
        placeInfoHolder.tvName.setText(placeInformation.getName());
        placeInfoHolder.tvPhone.setText(placeInformation.getPhone());
        placeInfoHolder.img.setImageResource(placeInformation.getImg());

    }

    @Override
    public int getItemCount() {
        return placeInformations.size();
    }

    public class PlaceInfoHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        protected TextView tvName;
        protected TextView tvPhone;
        protected ImageView img;

        public PlaceInfoHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvName=(TextView)itemView.findViewById(R.id.name);
            tvPhone=(TextView)itemView.findViewById(R.id.phone);
            img=(ImageView)itemView.findViewById(R.id.image);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(),"position:"+getPosition(),Toast.LENGTH_LONG).show();
            StateListAnimator stateListAnimator= AnimatorInflater.loadStateListAnimator(v.getContext(),R.drawable.button_style_custom);
            v.setStateListAnimator(stateListAnimator);
        }
    }
}
