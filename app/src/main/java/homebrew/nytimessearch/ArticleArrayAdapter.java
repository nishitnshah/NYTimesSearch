package homebrew.nytimessearch;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by Nishit on 11/1/16.
 */

public class ArticleArrayAdapter extends ArrayAdapter<Article> {
    public ArticleArrayAdapter(Context context, List<Article> articles) {
        super(context, android.R.layout.simple_list_item_1, articles);
    }
}
