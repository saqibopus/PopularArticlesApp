package articles.saqib.com.populararticlesapp.popular_article_module;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import articles.saqib.com.populararticlesapp.R;
import articles.saqib.com.populararticlesapp.app_helper.Logs;
import articles.saqib.com.populararticlesapp.popular_article_module.adapter.ArticleAdapter;
import articles.saqib.com.populararticlesapp.popular_article_module.contract.PopularArticleContract;
import articles.saqib.com.populararticlesapp.popular_article_module.model.Results;
import articles.saqib.com.populararticlesapp.popular_article_module.presenter.PopularArticlePresenter;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PopularArticleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PopularArticleFragment extends Fragment implements PopularArticleContract.View {

    PopularArticleContract.Presenter presenter = null;
    @BindView(R.id.recycleViewArticle)
    RecyclerView recyclerViewArticle;
    private ArticleAdapter adapter = null;

    public PopularArticleFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment PopularArticleFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PopularArticleFragment newInstance() {
        PopularArticleFragment fragment = new PopularArticleFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_popular_article, container, false);
        ButterKnife.bind(this, v);
        init();
        return v;
    }


    @Override
    public void init() {
        initRecycleView();
        presenter = new PopularArticlePresenter(this);
        presenter.requestPopularArticle("1e4a4f2a02664651b248899fa77f3407s");

    }

    private void initRecycleView() {
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerViewArticle.setLayoutManager(mLayoutManager);
        recyclerViewArticle.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    public void showMessage(int type, String message) {

    }

    @Override
    public void setProgress(boolean isShow) {

    }

    @Override
    public void onPopularArticleLoad(boolean isSuccess, String message, List<Results> results) {
        if (!isSuccess) {
            Logs.tFinal(getActivity(), message);
            return;
        }
        Logs.p("Result Size : "+results.size());
        if (results != null && results.size() > 0) {
            adapter = new ArticleAdapter(getActivity(), results);
            recyclerViewArticle.setAdapter(adapter);
        }
    }


    @Override
    public void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}
