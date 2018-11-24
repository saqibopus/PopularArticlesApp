package articles.saqib.com.populararticlesapp.popular_article_module;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import articles.saqib.com.populararticlesapp.R;
import articles.saqib.com.populararticlesapp.popular_article_module.contract.ArticleContract;
import articles.saqib.com.populararticlesapp.popular_article_module.presenter.ArticlePresenter;
import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * Created By : Saqib Shaikh
 * Date : 24-11-2018
 * Purpose / Usage : Article activity to load multiple article fragments.
 * Additional Comments:
 */
public class ArticleActivity extends AppCompatActivity implements ArticleContract.View {
    private ArticleContract.Presenter presenter;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerApp;
    @BindView(R.id.nav_view)
    NavigationView navApp;
    @BindView(R.id.toolbar)
    Toolbar tbAppBar;
    private ActionBarDrawerToggle toggleDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_article);
        ButterKnife.bind(this);
        init();
    }

    @Override
    public void init() {
        presenter = new ArticlePresenter(this);
        presenter.requestPopularArticle(null);
        initClass();
        initNavigationDrawer();
        initToolbar();
    }

    private void initClass() {
        toggleDrawer = new ActionBarDrawerToggle(ArticleActivity.this, drawerApp, R.string.toggle_open, R.string.toggle_open) {
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };
        drawerApp.addDrawerListener(toggleDrawer);

        toggleDrawer.syncState();
    }

    private void initToolbar() {
        setSupportActionBar(tbAppBar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.mipmap.menu_home);
    }

    @Override
    public void showMessage(int type, String message) {

    }

    @Override
    public void setProgress(boolean isShow) {

    }

    @Override
    public Context getContext() {
        return ArticleActivity.this;
    }

    @Override
    public void loadFragments(Fragment f) {

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.layout_fragments, f);
        // or ft.add(R.id.your_placeholder, new FooFragment());
        ft.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_popular_article, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_search) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initNavigationDrawer() {
        navApp.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {

                        menuItem.setChecked(true);
                        drawerApp.closeDrawers();

                        return true;
                    }
                });
    }


}
