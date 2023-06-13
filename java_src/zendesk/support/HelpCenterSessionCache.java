package zendesk.support;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public interface HelpCenterSessionCache {
    LastSearch getLastSearch();

    boolean isUniqueSearchResultClick();

    void setLastSearch(String str, int i);

    void unsetUniqueSearchResultClick();
}
