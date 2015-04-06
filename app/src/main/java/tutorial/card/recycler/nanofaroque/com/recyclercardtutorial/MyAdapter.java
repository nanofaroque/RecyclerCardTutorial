package tutorial.card.recycler.nanofaroque.com.recyclercardtutorial;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
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
//has to extend RecylerView.Adapter<YourAdapterName.YourDataHolderName>
//in my case PersonInfoHolder is the data holder class
//in this adapter, you have to implement two methods:
//onCreateViewHolder--> to Create the view from your child view layout file
// return the data holder object(PersonInfoHolder).
//do not forget to create the PersonInfoHolder object by using child view

//onBindViewHolder-->
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.PersonInfoHolder> {
    
    private ArrayList<PersonInformation> personInformations;

    public MyAdapter(ArrayList<PersonInformation> placeInformations) {
        this.personInformations = placeInformations;
    }

    @Override
    public PersonInfoHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        /* creating view from the layout for child element in the listview by using inflater*/
        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view,viewGroup,false);
        /*returning the new placeholder with the view*/
        return new PersonInfoHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PersonInfoHolder personInfoHolder, int i) {
        //getting the place information from the list
        PersonInformation placeInformation= personInformations.get(i);
        personInfoHolder.tvName.setText(placeInformation.getName());
        personInfoHolder.tvPhone.setText(placeInformation.getPhone());
        personInfoHolder.img.setImageResource(placeInformation.getImg());

    }

    @Override
    public int getItemCount() {
        return personInformations.size();
    }

    public class PersonInfoHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        protected TextView tvName;
        protected TextView tvPhone;
        protected ImageView img;

        public PersonInfoHolder(View itemView) {
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
