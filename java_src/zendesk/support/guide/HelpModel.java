package zendesk.support.guide;

import java.util.ArrayList;
import java.util.List;
import zendesk.support.Article;
import zendesk.support.ArticleItem;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpItem;
import zendesk.support.HelpRequest;
import zendesk.support.SectionItem;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class HelpModel implements HelpMvp$Model {
    private HelpCenterProvider provider;

    public HelpModel(HelpCenterProvider helpCenterProvider) {
        this.provider = helpCenterProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArticleItem convertArticle(Article article) {
        return new ArticleItem(article.getId(), article.getSectionId(), article.getTitle());
    }

    @Override // zendesk.support.guide.HelpMvp$Model
    public void getArticles(List<Long> list, List<Long> list2, String[] strArr, AbstractC44415lI6<List<HelpItem>> abstractC44415lI6) {
        this.provider.getHelp(new HelpRequest.Builder().withCategoryIds(list).withSectionIds(list2).withLabelNames(strArr).includeCategories().includeSections().build(), abstractC44415lI6);
    }

    @Override // zendesk.support.guide.HelpMvp$Model
    public void getArticlesForSection(SectionItem sectionItem, String[] strArr, final AbstractC44415lI6<List<ArticleItem>> abstractC44415lI6) {
        if (sectionItem != null && sectionItem.getId() != null) {
            this.provider.getArticles(sectionItem.getId(), C44504lS5.m27268g(strArr), new AbstractC44415lI6<List<Article>>() { // from class: zendesk.support.guide.HelpModel.1
                @Override // p000.AbstractC44415lI6
                public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                    AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                    if (abstractC44415lI62 != null) {
                        abstractC44415lI62.onError(interfaceC48782sg1);
                    }
                }

                @Override // p000.AbstractC44415lI6
                public void onSuccess(List<Article> list) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (Article article : list) {
                        arrayList.add(HelpModel.this.convertArticle(article));
                    }
                    AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                    if (abstractC44415lI62 != null) {
                        abstractC44415lI62.onSuccess(arrayList);
                    }
                }
            });
        } else {
            abstractC44415lI6.onError(new C49968ug1("SectionItem or its ID was null, cannot load more articles."));
        }
    }
}
