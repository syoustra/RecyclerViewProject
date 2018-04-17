package com.example.android.recyclerviewproject;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
                                                                    //ADDING IN THE <> BROKE MY CODE
    private List<Students> studentsList;

    public Adapter(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

                                //get context of parent layout, and inflate into PARENT
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view, parent, false);

        return new ViewHolder(itemView);                // need to return NEW viewholder every time

    }



                //THESE TWO COME FROM IMPLEMENTING RED-LINE METHODS FROM CLASS DECLARATION
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView studentName;
        private TextView studentAge;
        private TextView studentPhoneType;
        private TextView studentSummary;

        public ViewHolder (View itemView) {
            super(itemView);
            studentName = itemView.findViewById(R.id.item_name);
            studentAge = itemView.findViewById(R.id.item_age);
            studentPhoneType = itemView.findViewById(R.id.item_phone_type);
            studentSummary = itemView.findViewById(R.id.item_summary);
            itemView.setOnClickListener(this);                      //labels each item in RecyclerView as needing onClickt

        }

        public void bind(int position) {

            studentName.setText(studentsList.get(position).getName());
            studentAge.setText(studentsList.get(position).getAge());
            studentPhoneType.setText(studentsList.get(position).getPhoneType());
            studentSummary.setText(studentsList.get(position).getSummary());


        }


        @Override
        public void onClick(View v) {
            studentsList.get(getAdapterPosition()).setName("new name!");

            notifyDataSetChanged();
        }
    }
}
