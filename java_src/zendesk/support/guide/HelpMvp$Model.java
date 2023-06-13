package zendesk.support.guide;

import java.util.List;
import zendesk.support.ArticleItem;
import zendesk.support.HelpItem;
import zendesk.support.SectionItem;
/* loaded from: classes8.dex */
public interface HelpMvp$Model {
    void getArticles(List<Long> list, List<Long> list2, String[] strArr, AbstractC44415lI6<List<HelpItem>> abstractC44415lI6);

    void getArticlesForSection(SectionItem sectionItem, String[] strArr, AbstractC44415lI6<List<ArticleItem>> abstractC44415lI6);
}
