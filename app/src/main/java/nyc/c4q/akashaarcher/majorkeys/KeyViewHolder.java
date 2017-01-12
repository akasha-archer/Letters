package nyc.c4q.akashaarcher.majorkeys;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyc.c4q.akashaarcher.majorkeys.model.Key;

/**
 * Created by akashaarcher on 1/11/17.
 */

public class KeyViewHolder extends RecyclerView.ViewHolder {

    private final View view;
    private TextView tvName;


    public KeyViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        view = itemView;
        tvName = (TextView) view.findViewById(R.id.tv_name);
    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.key_item_layout, parent, false);
    }


    public void bind(final Key keys) {
        tvName.setText(keys.getName());
        tvName.setTextColor(Color.parseColor(keys.getTextColor()));
    }
//
//    @Override
//    public void onClick(View view) {
//        tvName.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent detailIntent = new Intent(this, DetailActivity.class);
//            }
//        });
//    }

}
