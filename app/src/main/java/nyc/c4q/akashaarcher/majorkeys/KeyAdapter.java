package nyc.c4q.akashaarcher.majorkeys;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.akashaarcher.majorkeys.model.Key;

/**
 * Created by akashaarcher on 1/11/17.
 */

public class KeyAdapter extends RecyclerView.Adapter {

    Context context;
    private List<Key> keyList;

    public KeyAdapter(Context context) {
        this.context = context;
        this.keyList = new ArrayList<>();
    }

    public void setData(List<Key> keyList) {
        this.keyList = keyList;
        notifyDataSetChanged();
    }


    @Override
    public KeyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new KeyViewHolder(parent);
    }

//    @Override
//    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//
//    }
//
//    @Override
//    public void onBindViewHolder(KeyViewHolder holder, int position) {
//        Key keys = keyList.get(position);
//        holder.bind(keys);
//    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        KeyViewHolder keyViewHolder = (KeyViewHolder) holder;
        Key keys = keyList.get(position);
        keyViewHolder.bind(keys);
    }

    @Override
    public int getItemCount() {
        return keyList.size();
    }


}
