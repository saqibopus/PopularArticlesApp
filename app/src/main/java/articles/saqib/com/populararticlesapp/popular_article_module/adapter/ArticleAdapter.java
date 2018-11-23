package articles.saqib.com.populararticlesapp.popular_article_module.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import articles.saqib.com.populararticlesapp.R;
import articles.saqib.com.populararticlesapp.popular_article_module.model.Results;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 *
 */

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ArticleHolder> {
    private Context context;
    private List<Results> articleList = new ArrayList<>();

    public ArticleAdapter(Context context, List<Results> articleList) {
        this.context = context;
        this.articleList = articleList;
    }

    @NonNull
    @Override
    public ArticleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.layout_articles, parent, false);
        ButterKnife.bind(this, v);
        return new ArticleHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }

    public class ArticleHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imgIcon)
        ImageView imgIcon;
        @BindView(R.id.tvTitle)
        TextView tvTitle;
        @BindView(R.id.tvBy)
        TextView tvBy;
        @BindView(R.id.tvDate)
        TextView tvDate;

        public ArticleHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }
    }
}
