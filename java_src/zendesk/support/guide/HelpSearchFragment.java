package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SearchArticle;
/* loaded from: classes8.dex */
public class HelpSearchFragment extends Fragment {
    private HelpSearchRecyclerViewAdapter adapter;
    private HelpCenterProvider helpCenterProvider;
    private RecyclerView recyclerView;
    private List<SearchArticle> searchArticles = Collections.emptyList();
    private String query = "";

    @SuppressLint({"RestrictedApi"})
    public static HelpSearchFragment newInstance(HelpCenterConfiguration helpCenterConfiguration, HelpCenterProvider helpCenterProvider) {
        Bundle bundle = new Bundle();
        C32756Ex0.m108197b(bundle, helpCenterConfiguration);
        HelpSearchFragment helpSearchFragment = new HelpSearchFragment();
        helpSearchFragment.setArguments(bundle);
        helpSearchFragment.helpCenterProvider = helpCenterProvider;
        return helpSearchFragment;
    }

    private void setupRecyclerView() {
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        HelpSearchRecyclerViewAdapter helpSearchRecyclerViewAdapter = new HelpSearchRecyclerViewAdapter(this.searchArticles, this.query, (HelpCenterConfiguration) C32756Ex0.m108194e(getArguments(), HelpCenterConfiguration.class), this.helpCenterProvider);
        this.adapter = helpSearchRecyclerViewAdapter;
        this.recyclerView.setAdapter(helpSearchRecyclerViewAdapter);
    }

    public void clearResults() {
        HelpSearchRecyclerViewAdapter helpSearchRecyclerViewAdapter = this.adapter;
        if (helpSearchRecyclerViewAdapter != null) {
            helpSearchRecyclerViewAdapter.clearResults();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C52382yk4.zs_fragment_help, viewGroup, false);
        this.recyclerView = (RecyclerView) inflate.findViewById(C34497Mi4.help_center_article_list);
        setupRecyclerView();
        return inflate;
    }

    public void updateResults(List<SearchArticle> list, String str) {
        RecyclerView recyclerView;
        this.searchArticles = list;
        this.query = str;
        if (this.adapter != null && (recyclerView = this.recyclerView) != null) {
            recyclerView.setVisibility(0);
            this.adapter.update(list, str);
            this.recyclerView.announceForAccessibility(getString(C41127fl4.zs_help_center_search_loaded_accessibility));
        }
    }
}
