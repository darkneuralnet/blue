package zendesk.support.guide;

import java.util.List;
import zendesk.support.HelpCenterSettings;
import zendesk.support.SearchArticle;
/* loaded from: classes8.dex */
public interface HelpCenterMvp$Model {
    void getSettings(AbstractC44415lI6<HelpCenterSettings> abstractC44415lI6);

    void search(List<Long> list, List<Long> list2, String str, String[] strArr, AbstractC44415lI6<List<SearchArticle>> abstractC44415lI6);
}
