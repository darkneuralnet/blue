package zendesk.support.requestlist;

import java.util.List;
import zendesk.core.MemoryCache;
import zendesk.support.AggregatedCallback;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSdkSettings;
import zendesk.support.SupportSettingsProvider;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class RequestListModel {
    static final String REQUEST_LIST_ITEMS_CACHE_KEY = "request_list_items";
    static final String SETTINGS_CACHE_KEY = "request_list_settings";
    private final SupportBlipsProvider blipsProvider;
    private final MemoryCache cache;
    private final RequestInfoDataSource requestInfoDataSource;
    private final SupportSettingsProvider settingsProvider;
    private final AggregatedCallback<SupportSdkSettings> settingsAggregatedCallback = new AggregatedCallback<>();
    private final InterfaceC42043hI6<RequestInfo, RequestListItem> mapper = new InterfaceC42043hI6<RequestInfo, RequestListItem>() { // from class: zendesk.support.requestlist.RequestListModel.2
        @Override // p000.InterfaceC42043hI6
        public RequestListItem apply(RequestInfo requestInfo) {
            return new RequestListItem(requestInfo);
        }
    };

    public RequestListModel(RequestInfoDataSource requestInfoDataSource, MemoryCache memoryCache, SupportBlipsProvider supportBlipsProvider, SupportSettingsProvider supportSettingsProvider) {
        this.requestInfoDataSource = requestInfoDataSource;
        this.cache = memoryCache;
        this.blipsProvider = supportBlipsProvider;
        this.settingsProvider = supportSettingsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<RequestInfo> filterClosedRequests(List<RequestInfo> list, boolean z) {
        return z ? list : C43505jm0.m29951f(list, new InterfaceC42043hI6<RequestInfo, Boolean>() { // from class: zendesk.support.requestlist.RequestListModel.3
            @Override // p000.InterfaceC42043hI6
            public Boolean apply(RequestInfo requestInfo) {
                return Boolean.valueOf(!requestInfo.isClosed());
            }
        });
    }

    public void cacheSupportSdkSettings(SupportSdkSettings supportSdkSettings) {
        this.cache.put(SETTINGS_CACHE_KEY, supportSdkSettings);
    }

    public void cleanup() {
        this.cache.remove(SETTINGS_CACHE_KEY);
        this.cache.remove(REQUEST_LIST_ITEMS_CACHE_KEY);
    }

    public List<RequestListItem> getCachedRequestInfos() {
        return (List) this.cache.get(REQUEST_LIST_ITEMS_CACHE_KEY);
    }

    public SupportSdkSettings getCachedSettings() {
        return (SupportSdkSettings) this.cache.get(SETTINGS_CACHE_KEY);
    }

    public void loadItems(boolean z, final SupportSdkSettings supportSdkSettings, final AbstractC44415lI6<List<RequestListItem>> abstractC44415lI6) {
        if (!z && getCachedRequestInfos() != null) {
            abstractC44415lI6.onSuccess(getCachedRequestInfos());
        } else {
            this.requestInfoDataSource.load(new AbstractC44415lI6<List<RequestInfo>>() { // from class: zendesk.support.requestlist.RequestListModel.1
                @Override // p000.AbstractC44415lI6
                public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                    abstractC44415lI6.onError(interfaceC48782sg1);
                }

                @Override // p000.AbstractC44415lI6
                public void onSuccess(List<RequestInfo> list) {
                    List m29946k = C43505jm0.m29946k(RequestListModel.this.filterClosedRequests(list, supportSdkSettings.isShowClosedRequests()), RequestListModel.this.mapper);
                    RequestListModel.this.cache.put(RequestListModel.REQUEST_LIST_ITEMS_CACHE_KEY, m29946k);
                    abstractC44415lI6.onSuccess(m29946k);
                }
            });
        }
    }

    public void loadSettings(AbstractC44415lI6<SupportSdkSettings> abstractC44415lI6) {
        if (this.settingsAggregatedCallback.add(abstractC44415lI6)) {
            this.settingsProvider.getSettings(this.settingsAggregatedCallback);
        }
    }

    public void trackRequestListViewed() {
        this.blipsProvider.requestListViewed();
    }
}
