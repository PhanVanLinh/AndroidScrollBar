package toong.vn.androidscrollbar.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import toong.vn.androidscrollbar.R;
import toong.vn.androidscrollbar.model.RecyclerItem;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private OneItemTypeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        getSupportActionBar().setTitle("RecyclerViewActivity");
        mRecyclerView = (RecyclerView) findViewById(R.id.activity_recycler_view);

        ArrayList<RecyclerItem> data = new ArrayList<>();
        data.add(new RecyclerItem("a", "b"));
        data.add(new RecyclerItem("c", "b"));
        data.add(new RecyclerItem("d", "b"));
        data.add(new RecyclerItem("e", "b"));
        data.add(new RecyclerItem("f", "b"));
        data.add(new RecyclerItem("g", "b"));
        data.add(new RecyclerItem("h", "b"));
        data.add(new RecyclerItem("j", "b"));
        data.add(new RecyclerItem("k", "b"));
        data.add(new RecyclerItem("l", "b"));
        data.add(new RecyclerItem("m", "b"));
        data.add(new RecyclerItem("n", "b"));
        data.add(new RecyclerItem("o", "b"));
        data.add(new RecyclerItem("u", "b"));
        data.add(new RecyclerItem("p", "b"));
        data.add(new RecyclerItem("q", "b"));
        data.add(new RecyclerItem("r", "b"));
        data.add(new RecyclerItem("s", "b"));
        data.add(new RecyclerItem("w", "b"));
        data.add(new RecyclerItem("y", "b"));

        // set up the RecyclerView
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new OneItemTypeAdapter(this, data.toArray(new RecyclerItem[data.size()]));
        mRecyclerView.setAdapter(adapter);
    }
}
