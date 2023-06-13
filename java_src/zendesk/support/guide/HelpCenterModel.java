package zendesk.support.guide;

import java.util.List;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSearch;
import zendesk.support.HelpCenterSettings;
import zendesk.support.HelpCenterSettingsProvider;
import zendesk.support.SearchArticle;
/* loaded from: classes8.dex */
class HelpCenterModel implements HelpCenterMvp$Model {
    private final HelpCenterProvider provider;
    private final HelpCenterSettingsProvider settingsProvider;

    public HelpCenterModel(HelpCenterProvider helpCenterProvider, HelpCenterSettingsProvider helpCenterSettingsProvider) {
        this.provider = helpCenterProvider;
        this.settingsProvider = helpCenterSettingsProvider;
    }

    @Override // zendesk.support.guide.HelpCenterMvp$Model
    public void getSettings(AbstractC44415lI6<HelpCenterSettings> abstractC44415lI6) {
        this.settingsProvider.getSettings(abstractC44415lI6);
    }

    @Override // zendesk.support.guide.HelpCenterMvp$Model
    public void search(List<Long> list, List<Long> list2, String str, String[] strArr, AbstractC44415lI6<List<SearchArticle>> abstractC44415lI6) {
        this.provider.searchArticles(new HelpCenterSearch.Builder().withQuery(str).withCategoryIds(list).withSectionIds(list2).withLabelNames(strArr).build(), abstractC44415lI6);
    }
}
