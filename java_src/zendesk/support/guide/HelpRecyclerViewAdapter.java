package zendesk.support.guide;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.CategoryItem;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpItem;
import zendesk.support.SectionItem;
import zendesk.support.SeeAllArticlesItem;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class HelpRecyclerViewAdapter extends RecyclerView.AbstractC11843h<HelpViewHolder> implements HelpMvp$View {
    private Context context;
    private int defaultCategoryTitleColour;
    private final HelpCenterConfiguration helpCenterUiConfig;
    private int highlightCategoryTitleColour;
    private HelpMvp$Presenter presenter;

    /* loaded from: classes8.dex */
    public class ArticleViewHolder extends HelpViewHolder {
        public ArticleViewHolder(View view) {
            super(view);
            this.textView = (TextView) view;
        }

        @Override // zendesk.support.guide.HelpRecyclerViewAdapter.HelpViewHolder
        public void bindTo(final HelpItem helpItem, int i) {
            if (helpItem != null && helpItem.getId() != null) {
                this.textView.setText(C31646Ad6.m115426a(helpItem.getName()));
                this.textView.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.guide.HelpRecyclerViewAdapter.ArticleViewHolder.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ViewArticleActivity.builder(helpItem.getId().longValue()).show(HelpRecyclerViewAdapter.this.context, HelpRecyclerViewAdapter.this.helpCenterUiConfig.getConfigurations());
                    }
                });
                return;
            }
            C33694Ix2.m101454e("HelpCenterActivity", "Article item was null, cannot bind", new Object[0]);
        }
    }

    /* loaded from: classes8.dex */
    public class CategoryViewHolder extends HelpViewHolder {
        private static final int ROTATION_END_LEVEL = 10000;
        private static final String ROTATION_PROPERTY_NAME = "level";
        private static final int ROTATION_START_LEVEL = 0;
        private boolean expanded;
        private Drawable expanderDrawable;

        public CategoryViewHolder(View view) {
            super(view);
            this.textView = (TextView) view;
            Drawable mutate = P61.m90834r(NA0.m94299e(view.getContext(), C32139Cg4.zs_help_ic_expand_more)).mutate();
            this.expanderDrawable = mutate;
            P61.m90838n(mutate, C31646Ad6.m115422e(16842808, HelpRecyclerViewAdapter.this.context, C34002Kf4.zs_fallback_text_color));
            P61.m90836p(this.expanderDrawable, PorterDuff.Mode.SRC_IN);
            ((TextView) view).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.expanderDrawable, (Drawable) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHighlightColor(boolean z) {
            if (z) {
                this.textView.setTextColor(HelpRecyclerViewAdapter.this.highlightCategoryTitleColour);
                this.expanderDrawable.setColorFilter(HelpRecyclerViewAdapter.this.highlightCategoryTitleColour, PorterDuff.Mode.SRC_IN);
                return;
            }
            this.textView.setTextColor(HelpRecyclerViewAdapter.this.defaultCategoryTitleColour);
            this.expanderDrawable.setColorFilter(HelpRecyclerViewAdapter.this.defaultCategoryTitleColour, PorterDuff.Mode.SRC_IN);
        }

        @Override // zendesk.support.guide.HelpRecyclerViewAdapter.HelpViewHolder
        public void bindTo(HelpItem helpItem, final int i) {
            int i2 = 0;
            if (helpItem == null) {
                C33694Ix2.m101454e("HelpCenterActivity", "Category item was null, cannot bind", new Object[0]);
                return;
            }
            this.textView.setText(C31646Ad6.m115426a(helpItem.getName()));
            final CategoryItem categoryItem = (CategoryItem) helpItem;
            boolean isExpanded = categoryItem.isExpanded();
            this.expanded = isExpanded;
            Drawable drawable = this.expanderDrawable;
            if (isExpanded) {
                i2 = 10000;
            }
            drawable.setLevel(i2);
            setHighlightColor(categoryItem.isExpanded());
            this.textView.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.guide.HelpRecyclerViewAdapter.CategoryViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int i3;
                    CategoryViewHolder categoryViewHolder = CategoryViewHolder.this;
                    categoryViewHolder.expanded = HelpRecyclerViewAdapter.this.presenter.onCategoryClick(categoryItem, i);
                    Drawable drawable2 = CategoryViewHolder.this.expanderDrawable;
                    int[] iArr = new int[2];
                    int i4 = 10000;
                    if (CategoryViewHolder.this.expanded) {
                        i3 = 0;
                    } else {
                        i3 = 10000;
                    }
                    iArr[0] = i3;
                    if (!CategoryViewHolder.this.expanded) {
                        i4 = 0;
                    }
                    iArr[1] = i4;
                    ObjectAnimator.ofInt(drawable2, "level", iArr).start();
                    CategoryViewHolder categoryViewHolder2 = CategoryViewHolder.this;
                    categoryViewHolder2.setHighlightColor(categoryViewHolder2.expanded);
                }
            });
        }

        public boolean isExpanded() {
            return this.expanded;
        }
    }

    /* loaded from: classes8.dex */
    public class ExtraPaddingViewHolder extends HelpViewHolder {
        public ExtraPaddingViewHolder(View view) {
            super(view);
        }

        @Override // zendesk.support.guide.HelpRecyclerViewAdapter.HelpViewHolder
        public void bindTo(HelpItem helpItem, int i) {
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class HelpViewHolder extends RecyclerView.AbstractC11834D {
        TextView textView;

        public HelpViewHolder(View view) {
            super(view);
        }

        public abstract void bindTo(HelpItem helpItem, int i);
    }

    /* loaded from: classes8.dex */
    public class LoadingViewHolder extends HelpViewHolder {
        public LoadingViewHolder(View view) {
            super(view);
        }

        @Override // zendesk.support.guide.HelpRecyclerViewAdapter.HelpViewHolder
        public void bindTo(HelpItem helpItem, int i) {
        }
    }

    /* loaded from: classes8.dex */
    public class NoResultsViewHolder extends HelpViewHolder {
        public NoResultsViewHolder(View view) {
            super(view);
        }

        @Override // zendesk.support.guide.HelpRecyclerViewAdapter.HelpViewHolder
        public void bindTo(HelpItem helpItem, int i) {
        }
    }

    /* loaded from: classes8.dex */
    public class SectionViewHolder extends HelpViewHolder {
        public SectionViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(C34497Mi4.section_title);
        }

        @Override // zendesk.support.guide.HelpRecyclerViewAdapter.HelpViewHolder
        public void bindTo(HelpItem helpItem, int i) {
            if (helpItem == null) {
                C33694Ix2.m101454e("HelpCenterActivity", "Section item was null, cannot bind", new Object[0]);
            } else {
                this.textView.setText(C31646Ad6.m115426a(helpItem.getName()));
            }
        }
    }

    /* loaded from: classes8.dex */
    public class SeeAllViewHolder extends HelpViewHolder {
        private ProgressBar progressBar;

        public SeeAllViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(C34497Mi4.help_section_action_button);
            this.progressBar = (ProgressBar) view.findViewById(C34497Mi4.help_section_loading_progress);
        }

        @Override // zendesk.support.guide.HelpRecyclerViewAdapter.HelpViewHolder
        public void bindTo(final HelpItem helpItem, int i) {
            String string;
            if (!(helpItem instanceof SeeAllArticlesItem)) {
                C33694Ix2.m101454e("HelpCenterActivity", "SeeAll item was null, cannot bind", new Object[0]);
                return;
            }
            final SeeAllArticlesItem seeAllArticlesItem = (SeeAllArticlesItem) helpItem;
            if (seeAllArticlesItem.isLoading()) {
                this.textView.setVisibility(8);
                this.progressBar.setVisibility(0);
            } else {
                this.textView.setVisibility(0);
                this.progressBar.setVisibility(8);
            }
            SectionItem section = seeAllArticlesItem.getSection();
            if (section != null) {
                string = HelpRecyclerViewAdapter.this.context.getString(C41127fl4.support_help_see_all_n_articles_label, Integer.valueOf(section.getTotalArticlesCount()));
            } else {
                string = HelpRecyclerViewAdapter.this.context.getString(C41127fl4.support_help_see_all_articles_label);
            }
            this.textView.setText(string);
            this.textView.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.guide.HelpRecyclerViewAdapter.SeeAllViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SeeAllViewHolder.this.textView.setVisibility(8);
                    SeeAllViewHolder.this.progressBar.setVisibility(0);
                    HelpRecyclerViewAdapter.this.presenter.onSeeAllClick((SeeAllArticlesItem) helpItem);
                    seeAllArticlesItem.setLoading(true);
                }
            });
        }
    }

    public HelpRecyclerViewAdapter(HelpCenterConfiguration helpCenterConfiguration, HelpCenterProvider helpCenterProvider, NetworkInfoProvider networkInfoProvider) {
        this.presenter = new HelpAdapterPresenter(this, new HelpModel(helpCenterProvider), networkInfoProvider, helpCenterConfiguration);
        this.helpCenterUiConfig = helpCenterConfiguration;
    }

    private View inflateView(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }

    @Override // zendesk.support.guide.HelpMvp$View
    public void addItem(int i, HelpItem helpItem) {
        notifyItemInserted(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.presenter.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemViewType(int i) {
        return this.presenter.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        Context context = recyclerView.getContext();
        this.context = context;
        this.highlightCategoryTitleColour = C31646Ad6.m115422e(C43439jf4.colorPrimary, context, C34002Kf4.zs_fallback_text_color);
        this.defaultCategoryTitleColour = NA0.m94301c(this.context, C34002Kf4.zs_help_text_color_primary);
        this.presenter.onAttached();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.presenter.onDetached();
        this.context = null;
    }

    @Override // zendesk.support.guide.HelpMvp$View
    public void removeItem(int i) {
        notifyItemRemoved(i);
    }

    public void setContentUpdateListener(HelpCenterMvp$Presenter helpCenterMvp$Presenter) {
        HelpMvp$Presenter helpMvp$Presenter = this.presenter;
        if (helpMvp$Presenter != null) {
            helpMvp$Presenter.setContentPresenter(helpCenterMvp$Presenter);
        }
    }

    @Override // zendesk.support.guide.HelpMvp$View
    public void showItems(List<HelpItem> list) {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(HelpViewHolder helpViewHolder, int i) {
        if (helpViewHolder == null) {
            C33694Ix2.m101447l("HelpCenterActivity", "Holder was null, possible unexpected item type", new Object[0]);
        } else {
            helpViewHolder.bindTo(this.presenter.getItemForBinding(i), i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public HelpViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                return new CategoryViewHolder(inflateView(viewGroup, C52382yk4.zs_row_category));
            case 2:
                return new SectionViewHolder(inflateView(viewGroup, C52382yk4.zs_row_section));
            case 3:
                return new ArticleViewHolder(inflateView(viewGroup, C52382yk4.zs_row_article));
            case 4:
                return new SeeAllViewHolder(inflateView(viewGroup, C52382yk4.zs_row_action));
            case 5:
                return new LoadingViewHolder(inflateView(viewGroup, C52382yk4.zs_row_loading_progress));
            case 6:
            default:
                C33694Ix2.m101447l("HelpCenterActivity", "Unknown item type, returning null for holder", new Object[0]);
                return null;
            case 7:
                return new NoResultsViewHolder(inflateView(viewGroup, C52382yk4.zs_row_no_articles_found));
            case 8:
                return new ExtraPaddingViewHolder(inflateView(viewGroup, C52382yk4.zs_row_padding));
        }
    }
}
