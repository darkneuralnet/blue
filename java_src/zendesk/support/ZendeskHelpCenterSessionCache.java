package zendesk.support;
/* loaded from: classes8.dex */
class ZendeskHelpCenterSessionCache implements HelpCenterSessionCache {
    public static final LastSearch DEFAULT_SEARCH = new LastSearch("", 0);
    private LastSearch lastSearch;
    private boolean uniqueSearchResultClick = false;

    @Override // zendesk.support.HelpCenterSessionCache
    public LastSearch getLastSearch() {
        LastSearch lastSearch = this.lastSearch;
        return lastSearch != null ? lastSearch : DEFAULT_SEARCH;
    }

    @Override // zendesk.support.HelpCenterSessionCache
    public boolean isUniqueSearchResultClick() {
        return this.uniqueSearchResultClick;
    }

    @Override // zendesk.support.HelpCenterSessionCache
    public void setLastSearch(String str, int i) {
        this.lastSearch = new LastSearch(str, i);
        this.uniqueSearchResultClick = true;
    }

    @Override // zendesk.support.HelpCenterSessionCache
    public void unsetUniqueSearchResultClick() {
        this.uniqueSearchResultClick = false;
    }
}
