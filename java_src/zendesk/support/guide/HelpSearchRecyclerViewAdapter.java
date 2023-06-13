package zendesk.support.guide;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SearchArticle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class HelpSearchRecyclerViewAdapter extends RecyclerView.AbstractC11843h {
    private static final int TYPE_ARTICLE = 531;
    private static final int TYPE_NO_RESULTS = 441;
    private static final int TYPE_PADDING = 423;
    private final HelpCenterProvider helpCenterProvider;
    private final HelpCenterConfiguration helpCenterUiConfig;
    private String query;
    private boolean resultsCleared = false;
    private List<SearchArticle> searchArticles;

    /* loaded from: classes8.dex */
    public class HelpSearchViewHolder extends RecyclerView.AbstractC11834D {
        private Context context;
        private TextView subtitleTextView;
        private TextView titleTextView;

        public HelpSearchViewHolder(View view, Context context) {
            super(view);
            this.titleTextView = (TextView) view.findViewById(C34497Mi4.title);
            this.subtitleTextView = (TextView) view.findViewById(C34497Mi4.subtitle);
            this.context = context;
        }

        public void bindTo(final SearchArticle searchArticle) {
            String str;
            int indexOf;
            if (searchArticle != null && searchArticle.getArticle() != null) {
                if (searchArticle.getArticle().getTitle() != null) {
                    str = searchArticle.getArticle().getTitle();
                } else {
                    str = "";
                }
                if (HelpSearchRecyclerViewAdapter.this.query == null) {
                    indexOf = -1;
                } else {
                    indexOf = str.toLowerCase(Locale.getDefault()).indexOf(HelpSearchRecyclerViewAdapter.this.query.toLowerCase(Locale.getDefault()));
                }
                if (indexOf != -1) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new StyleSpan(1), indexOf, HelpSearchRecyclerViewAdapter.this.query.length() + indexOf, 18);
                    this.titleTextView.setText(spannableString);
                } else {
                    this.titleTextView.setText(str);
                }
                this.subtitleTextView.setText(this.context.getString(C41127fl4.help_search_subtitle_format, searchArticle.getCategory().getName(), searchArticle.getSection().getName()));
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.guide.HelpSearchRecyclerViewAdapter.HelpSearchViewHolder.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        HelpSearchRecyclerViewAdapter.this.helpCenterProvider.submitRecordArticleView(searchArticle.getArticle(), C32272Cv2.m111343c(searchArticle.getArticle().getLocale()), new AbstractC44415lI6<Void>() { // from class: zendesk.support.guide.HelpSearchRecyclerViewAdapter.HelpSearchViewHolder.1.1
                            @Override // p000.AbstractC44415lI6
                            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                                C33694Ix2.m101454e("HelpCenterActivity", "Error submitting Help Center reporting: [reason] %s [isNetworkError] %s [status] %d", interfaceC48782sg1.mo9891c(), Boolean.valueOf(interfaceC48782sg1.mo9888f()), Integer.valueOf(interfaceC48782sg1.getStatus()));
                            }

                            @Override // p000.AbstractC44415lI6
                            public void onSuccess(Void r1) {
                            }
                        });
                        ViewArticleActivity.builder(searchArticle.getArticle()).show(HelpSearchViewHolder.this.itemView.getContext(), HelpSearchRecyclerViewAdapter.this.helpCenterUiConfig.getConfigurations());
                    }
                });
                return;
            }
            C33694Ix2.m101454e("HelpCenterActivity", "The article was null, cannot bind the view.", new Object[0]);
        }
    }

    /* loaded from: classes8.dex */
    public class NoResultsViewHolder extends RecyclerView.AbstractC11834D {
        public NoResultsViewHolder(View view) {
            super(view);
        }
    }

    /* loaded from: classes8.dex */
    public class PaddingViewHolder extends RecyclerView.AbstractC11834D {
        public PaddingViewHolder(View view) {
            super(view);
        }
    }

    public HelpSearchRecyclerViewAdapter(List<SearchArticle> list, String str, HelpCenterConfiguration helpCenterConfiguration, HelpCenterProvider helpCenterProvider) {
        this.searchArticles = list;
        this.query = str;
        this.helpCenterUiConfig = helpCenterConfiguration;
        this.helpCenterProvider = helpCenterProvider;
    }

    private int getPaddingExtraItem() {
        return this.helpCenterUiConfig.isContactUsButtonVisible() ? 1 : 0;
    }

    public void clearResults() {
        this.resultsCleared = true;
        this.searchArticles = Collections.emptyList();
        this.query = "";
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        if (this.resultsCleared) {
            return 0;
        }
        return Math.max(this.searchArticles.size() + getPaddingExtraItem(), 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemViewType(int i) {
        if (i == 0 && this.searchArticles.size() == 0) {
            return TYPE_NO_RESULTS;
        }
        if (i > 0 && i == this.searchArticles.size()) {
            return TYPE_PADDING;
        }
        return TYPE_ARTICLE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(RecyclerView.AbstractC11834D abstractC11834D, int i) {
        if (TYPE_ARTICLE == getItemViewType(i)) {
            ((HelpSearchViewHolder) abstractC11834D).bindTo(this.searchArticles.get(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != TYPE_PADDING) {
            if (i != TYPE_NO_RESULTS) {
                if (i != TYPE_ARTICLE) {
                    return null;
                }
                return new HelpSearchViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C52382yk4.zs_row_search_article, viewGroup, false), viewGroup.getContext());
            }
            return new NoResultsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C52382yk4.zs_row_no_articles_found, viewGroup, false));
        }
        return new PaddingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C52382yk4.zs_row_padding, viewGroup, false));
    }

    public void update(List<SearchArticle> list, String str) {
        this.resultsCleared = false;
        this.searchArticles = list;
        this.query = str;
        notifyDataSetChanged();
    }
}
