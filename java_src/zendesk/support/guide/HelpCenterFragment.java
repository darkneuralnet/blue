package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.HelpCenterProvider;
/* loaded from: classes8.dex */
public class HelpCenterFragment extends Fragment {
    public static final String LOG_TAG = "HelpCenterFragment";
    private HelpRecyclerViewAdapter adapter;
    HelpCenterProvider helpCenterProvider;
    NetworkInfoProvider networkInfoProvider;
    private HelpCenterMvp$Presenter presenter;
    private RecyclerView recyclerView;

    @SuppressLint({"RestrictedApi"})
    public static HelpCenterFragment newInstance(HelpCenterConfiguration helpCenterConfiguration) {
        Bundle bundle = new Bundle();
        C32756Ex0.m108197b(bundle, helpCenterConfiguration);
        HelpCenterFragment helpCenterFragment = new HelpCenterFragment();
        helpCenterFragment.setArguments(bundle);
        return helpCenterFragment;
    }

    private void setupRecyclerView() {
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.recyclerView.addItemDecoration(new SeparatorDecoration(NA0.m94299e(getContext(), C32139Cg4.zs_help_separator)));
        this.recyclerView.setAdapter(this.adapter);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        GuideSdkDependencyProvider guideSdkDependencyProvider = GuideSdkDependencyProvider.INSTANCE;
        if (guideSdkDependencyProvider.isInitialized()) {
            guideSdkDependencyProvider.provideGuideSdkComponent().inject(this);
            HelpRecyclerViewAdapter helpRecyclerViewAdapter = new HelpRecyclerViewAdapter((HelpCenterConfiguration) C32756Ex0.m108194e(getArguments(), HelpCenterConfiguration.class), this.helpCenterProvider, this.networkInfoProvider);
            this.adapter = helpRecyclerViewAdapter;
            HelpCenterMvp$Presenter helpCenterMvp$Presenter = this.presenter;
            if (helpCenterMvp$Presenter != null) {
                helpRecyclerViewAdapter.setContentUpdateListener(helpCenterMvp$Presenter);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C52382yk4.zs_fragment_help, viewGroup, false);
        this.recyclerView = (RecyclerView) inflate.findViewById(C34497Mi4.help_center_article_list);
        setupRecyclerView();
        return inflate;
    }

    public void setPresenter(HelpCenterMvp$Presenter helpCenterMvp$Presenter) {
        this.presenter = helpCenterMvp$Presenter;
        HelpRecyclerViewAdapter helpRecyclerViewAdapter = this.adapter;
        if (helpRecyclerViewAdapter != null) {
            helpRecyclerViewAdapter.setContentUpdateListener(helpCenterMvp$Presenter);
        }
    }
}
