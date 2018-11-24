package articles.saqib.com.populararticlesapp.popular_article_module.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import articles.saqib.com.populararticlesapp.R;
import articles.saqib.com.populararticlesapp.popular_article_module.model.Results;
import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created By : Saqib Shaikh
 * Date : 24-11-2018
 * Purpose / Usage : This adapter is displaying article list.
 * Additional Comments:
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
        Results results = articleList.get(position);
        holder.tvTitle.setText(results.getTitle());
        holder.tvBy.setText(results.getByline());
        holder.tvDate.setText(results.getPublishedDate());
        Picasso.get()
                .load(results.getMedia().get(0).getMediaMetadata().get(0).getUrl())
                .resize(90,90)
                .into(holder.imgIcon);
    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }

    public class ArticleHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imgIcon)
        CircleImageView imgIcon;
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
