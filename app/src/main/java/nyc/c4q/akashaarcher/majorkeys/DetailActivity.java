package nyc.c4q.akashaarcher.majorkeys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by akashaarcher on 1/11/17.
 */

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView ivDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivDetail = (ImageView) findViewById(R.id.img_detail);

    }

    @Override
    public void onClick(View view) {

    }
}
