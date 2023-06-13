package zendesk.support.guide;

import java.util.ArrayList;
import java.util.List;
import zendesk.core.NetworkInfoProvider;
import zendesk.core.RetryAction;
import zendesk.support.ArticleItem;
import zendesk.support.CategoryItem;
import zendesk.support.HelpItem;
import zendesk.support.SectionItem;
import zendesk.support.SeeAllArticlesItem;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class HelpAdapterPresenter implements HelpMvp$Presenter {
    private static final Integer RETRY_ACTION_ID = 5;
    private HelpCenterMvp$Presenter contentPresenter;
    private boolean hasError;
    private HelpCenterConfiguration helpCenterUiConfig;
    private HelpMvp$Model model;
    private NetworkInfoProvider networkInfoProvider;
    private boolean noResults;
    private RetryAction retryAction;
    private HelpMvp$View view;
    private List<HelpItem> helpItems = new ArrayList();
    private List<HelpItem> filteredItems = new ArrayList();
    private AbstractC44415lI6<List<HelpItem>> callback = new AbstractC44415lI6<List<HelpItem>>() { // from class: zendesk.support.guide.HelpAdapterPresenter.2
        @Override // p000.AbstractC44415lI6
        public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
            HelpCenterMvp$ErrorType helpCenterMvp$ErrorType;
            if (C43505jm0.m29948i(HelpAdapterPresenter.this.helpCenterUiConfig.getCategoryIds())) {
                helpCenterMvp$ErrorType = HelpCenterMvp$ErrorType.CATEGORY_LOAD;
            } else if (C43505jm0.m29948i(HelpAdapterPresenter.this.helpCenterUiConfig.getSectionIds())) {
                helpCenterMvp$ErrorType = HelpCenterMvp$ErrorType.SECTION_LOAD;
            } else {
                helpCenterMvp$ErrorType = HelpCenterMvp$ErrorType.ARTICLES_LOAD;
            }
            HelpAdapterPresenter.this.contentPresenter.onErrorWithRetry(helpCenterMvp$ErrorType, new RetryAction() { // from class: zendesk.support.guide.HelpAdapterPresenter.2.1
                @Override // zendesk.core.RetryAction
                public void onRetry() {
                    HelpAdapterPresenter.this.hasError = false;
                    HelpAdapterPresenter.this.view.showItems(HelpAdapterPresenter.this.filteredItems);
                    HelpAdapterPresenter.this.requestHelpContent();
                }
            });
            HelpAdapterPresenter.this.hasError = true;
            HelpAdapterPresenter.this.view.showItems(HelpAdapterPresenter.this.filteredItems);
        }

        @Override // p000.AbstractC44415lI6
        public void onSuccess(List<HelpItem> list) {
            HelpAdapterPresenter.this.hasError = false;
            HelpAdapterPresenter.this.helpItems = C43505jm0.m29954c(list);
            if (HelpAdapterPresenter.this.helpCenterUiConfig.isCollapseCategories()) {
                HelpAdapterPresenter helpAdapterPresenter = HelpAdapterPresenter.this;
                helpAdapterPresenter.filteredItems = helpAdapterPresenter.getCollapsedCategories(helpAdapterPresenter.helpItems);
            } else {
                HelpAdapterPresenter helpAdapterPresenter2 = HelpAdapterPresenter.this;
                helpAdapterPresenter2.filteredItems = C43505jm0.m29954c(helpAdapterPresenter2.helpItems);
            }
            HelpAdapterPresenter helpAdapterPresenter3 = HelpAdapterPresenter.this;
            helpAdapterPresenter3.noResults = C43505jm0.m29950g(helpAdapterPresenter3.filteredItems);
            HelpAdapterPresenter.this.view.showItems(HelpAdapterPresenter.this.filteredItems);
            HelpAdapterPresenter.this.contentPresenter.onLoad();
        }
    };

    public HelpAdapterPresenter(HelpMvp$View helpMvp$View, HelpMvp$Model helpMvp$Model, NetworkInfoProvider networkInfoProvider, HelpCenterConfiguration helpCenterConfiguration) {
        this.view = helpMvp$View;
        this.model = helpMvp$Model;
        this.networkInfoProvider = networkInfoProvider;
        this.helpCenterUiConfig = helpCenterConfiguration;
    }

    private void addItem(int i, HelpItem helpItem) {
        this.filteredItems.add(i, helpItem);
        this.view.addItem(i, helpItem);
    }

    private void collapseItem(int i) {
        if (i >= getItemCount() - 1) {
            return;
        }
        int i2 = i + 1;
        while (i2 < this.filteredItems.size() && 1 != this.filteredItems.get(i2).getViewType()) {
            removeItem(i2);
        }
    }

    private void expandItem(CategoryItem categoryItem, int i) {
        int i2 = i + 1;
        for (SectionItem sectionItem : categoryItem.getSections()) {
            addItem(i2, sectionItem);
            i2++;
            try {
                for (HelpItem helpItem : sectionItem.getChildren()) {
                    addItem(i2, helpItem);
                    i2++;
                }
            } catch (ClassCastException e) {
                C33694Ix2.m101455d("HelpCenterActivity", "Error expanding item", e, new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HelpItem> getCollapsedCategories(List<HelpItem> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (1 == list.get(i).getViewType()) {
                    arrayList.add(list.get(i));
                    ((CategoryItem) list.get(i)).setExpanded(false);
                }
            }
        }
        return arrayList;
    }

    private int getPaddingItemCount() {
        return this.helpCenterUiConfig.isContactUsButtonVisible() ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadMoreArticles(final SeeAllArticlesItem seeAllArticlesItem) {
        final SectionItem section = seeAllArticlesItem.getSection();
        final RetryAction retryAction = new RetryAction() { // from class: zendesk.support.guide.HelpAdapterPresenter.3
            @Override // zendesk.core.RetryAction
            public void onRetry() {
                HelpAdapterPresenter.this.loadMoreArticles(seeAllArticlesItem);
            }
        };
        if (this.networkInfoProvider.isNetworkAvailable()) {
            this.model.getArticlesForSection(section, this.helpCenterUiConfig.getLabelNames(), new AbstractC44415lI6<List<ArticleItem>>() { // from class: zendesk.support.guide.HelpAdapterPresenter.4
                @Override // p000.AbstractC44415lI6
                public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                    HelpAdapterPresenter.this.helpItems.remove(seeAllArticlesItem);
                    C33694Ix2.m101454e("HelpCenterActivity", "Failed to load more articles", interfaceC48782sg1);
                    HelpAdapterPresenter.this.contentPresenter.onErrorWithRetry(HelpCenterMvp$ErrorType.ARTICLES_LOAD, retryAction);
                }

                @Override // p000.AbstractC44415lI6
                public void onSuccess(List<ArticleItem> list) {
                    int indexOf = HelpAdapterPresenter.this.helpItems.indexOf(seeAllArticlesItem);
                    int indexOf2 = HelpAdapterPresenter.this.filteredItems.indexOf(seeAllArticlesItem);
                    for (ArticleItem articleItem : list) {
                        if (!HelpAdapterPresenter.this.helpItems.contains(articleItem)) {
                            int i = indexOf + 1;
                            HelpAdapterPresenter.this.helpItems.add(indexOf, articleItem);
                            section.addArticle(articleItem);
                            if (indexOf2 != -1) {
                                HelpAdapterPresenter.this.filteredItems.add(indexOf2, articleItem);
                                HelpAdapterPresenter.this.view.addItem(indexOf2, articleItem);
                                indexOf2++;
                            }
                            indexOf = i;
                        }
                    }
                    HelpAdapterPresenter.this.helpItems.remove(seeAllArticlesItem);
                    int indexOf3 = HelpAdapterPresenter.this.filteredItems.indexOf(seeAllArticlesItem);
                    HelpAdapterPresenter.this.filteredItems.remove(seeAllArticlesItem);
                    HelpAdapterPresenter.this.view.removeItem(indexOf3);
                }
            });
            return;
        }
        this.retryAction = retryAction;
        this.networkInfoProvider.addRetryAction(RETRY_ACTION_ID, retryAction);
    }

    private void removeItem(int i) {
        this.filteredItems.remove(i);
        this.view.removeItem(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestHelpContent() {
        if (!this.networkInfoProvider.isNetworkAvailable()) {
            RetryAction retryAction = new RetryAction() { // from class: zendesk.support.guide.HelpAdapterPresenter.1
                @Override // zendesk.core.RetryAction
                public void onRetry() {
                    HelpAdapterPresenter.this.requestHelpContent();
                }
            };
            this.retryAction = retryAction;
            this.networkInfoProvider.addRetryAction(RETRY_ACTION_ID, retryAction);
        }
        this.model.getArticles(this.helpCenterUiConfig.getCategoryIds(), this.helpCenterUiConfig.getSectionIds(), this.helpCenterUiConfig.getLabelNames(), this.callback);
    }

    @Override // zendesk.support.guide.HelpMvp$Presenter
    public HelpItem getItem(int i) {
        return this.filteredItems.get(i);
    }

    @Override // zendesk.support.guide.HelpMvp$Presenter
    public int getItemCount() {
        if (this.hasError) {
            return 0;
        }
        return Math.max(this.filteredItems.size() + getPaddingItemCount(), 1);
    }

    @Override // zendesk.support.guide.HelpMvp$Presenter
    public HelpItem getItemForBinding(int i) {
        if (this.filteredItems.size() <= 0 || i >= this.filteredItems.size()) {
            return null;
        }
        return this.filteredItems.get(i);
    }

    @Override // zendesk.support.guide.HelpMvp$Presenter
    public int getItemViewType(int i) {
        if (this.noResults) {
            return 7;
        }
        if (this.filteredItems.size() > 0) {
            if (i == this.filteredItems.size()) {
                return 8;
            }
            return this.filteredItems.get(i).getViewType();
        }
        return 5;
    }

    @Override // zendesk.support.guide.HelpMvp$Presenter
    public void onAttached() {
        this.networkInfoProvider.register();
        if (C43505jm0.m29950g(this.helpItems)) {
            requestHelpContent();
        }
    }

    @Override // zendesk.support.guide.HelpMvp$Presenter
    public boolean onCategoryClick(CategoryItem categoryItem, int i) {
        if (categoryItem == null) {
            return false;
        }
        boolean expanded = categoryItem.setExpanded(!categoryItem.isExpanded());
        if (expanded) {
            expandItem(categoryItem, this.filteredItems.indexOf(categoryItem));
        } else {
            collapseItem(this.filteredItems.indexOf(categoryItem));
        }
        return expanded;
    }

    @Override // zendesk.support.guide.HelpMvp$Presenter
    public void onDetached() {
        this.networkInfoProvider.removeRetryAction(RETRY_ACTION_ID);
        this.networkInfoProvider.unregister();
    }

    @Override // zendesk.support.guide.HelpMvp$Presenter
    public void onSeeAllClick(SeeAllArticlesItem seeAllArticlesItem) {
        loadMoreArticles(seeAllArticlesItem);
    }

    @Override // zendesk.support.guide.HelpMvp$Presenter
    public void setContentPresenter(HelpCenterMvp$Presenter helpCenterMvp$Presenter) {
        this.contentPresenter = helpCenterMvp$Presenter;
    }
}
