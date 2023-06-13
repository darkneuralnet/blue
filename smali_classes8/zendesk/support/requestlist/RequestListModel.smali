.class Lzendesk/support/requestlist/RequestListModel;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final REQUEST_LIST_ITEMS_CACHE_KEY:Ljava/lang/String; = "request_list_items"

.field static final SETTINGS_CACHE_KEY:Ljava/lang/String; = "request_list_settings"


# instance fields
.field private final blipsProvider:Lzendesk/support/SupportBlipsProvider;

.field private final cache:Lzendesk/core/MemoryCache;

.field private final mapper:LhI6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhI6<",
            "Lzendesk/support/requestlist/RequestInfo;",
            "Lzendesk/support/requestlist/RequestListItem;",
            ">;"
        }
    .end annotation
.end field

.field private final requestInfoDataSource:Lzendesk/support/requestlist/RequestInfoDataSource;

.field private final settingsAggregatedCallback:Lzendesk/support/AggregatedCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzendesk/support/AggregatedCallback<",
            "Lzendesk/support/SupportSdkSettings;",
            ">;"
        }
    .end annotation
.end field

.field private final settingsProvider:Lzendesk/support/SupportSettingsProvider;


# direct methods
.method public constructor <init>(Lzendesk/support/requestlist/RequestInfoDataSource;Lzendesk/core/MemoryCache;Lzendesk/support/SupportBlipsProvider;Lzendesk/support/SupportSettingsProvider;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lzendesk/support/AggregatedCallback;

    invoke-direct {v0}, Lzendesk/support/AggregatedCallback;-><init>()V

    iput-object v0, p0, Lzendesk/support/requestlist/RequestListModel;->settingsAggregatedCallback:Lzendesk/support/AggregatedCallback;

    new-instance v0, Lzendesk/support/requestlist/RequestListModel$2;

    invoke-direct {v0, p0}, Lzendesk/support/requestlist/RequestListModel$2;-><init>(Lzendesk/support/requestlist/RequestListModel;)V

    iput-object v0, p0, Lzendesk/support/requestlist/RequestListModel;->mapper:LhI6;

    iput-object p1, p0, Lzendesk/support/requestlist/RequestListModel;->requestInfoDataSource:Lzendesk/support/requestlist/RequestInfoDataSource;

    iput-object p2, p0, Lzendesk/support/requestlist/RequestListModel;->cache:Lzendesk/core/MemoryCache;

    iput-object p3, p0, Lzendesk/support/requestlist/RequestListModel;->blipsProvider:Lzendesk/support/SupportBlipsProvider;

    iput-object p4, p0, Lzendesk/support/requestlist/RequestListModel;->settingsProvider:Lzendesk/support/SupportSettingsProvider;

    return-void
.end method

.method public static synthetic access$000(Lzendesk/support/requestlist/RequestListModel;Ljava/util/List;Z)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2}, Lzendesk/support/requestlist/RequestListModel;->filterClosedRequests(Ljava/util/List;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$100(Lzendesk/support/requestlist/RequestListModel;)LhI6;
    .locals 0

    iget-object p0, p0, Lzendesk/support/requestlist/RequestListModel;->mapper:LhI6;

    return-object p0
.end method

.method public static synthetic access$200(Lzendesk/support/requestlist/RequestListModel;)Lzendesk/core/MemoryCache;
    .locals 0

    iget-object p0, p0, Lzendesk/support/requestlist/RequestListModel;->cache:Lzendesk/core/MemoryCache;

    return-object p0
.end method

.method private filterClosedRequests(Ljava/util/List;Z)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/support/requestlist/RequestInfo;",
            ">;Z)",
            "Ljava/util/List<",
            "Lzendesk/support/requestlist/RequestInfo;",
            ">;"
        }
    .end annotation

    if-eqz p2, :cond_0

    return-object p1

    :cond_0
    new-instance p2, Lzendesk/support/requestlist/RequestListModel$3;

    invoke-direct {p2, p0}, Lzendesk/support/requestlist/RequestListModel$3;-><init>(Lzendesk/support/requestlist/RequestListModel;)V

    invoke-static {p1, p2}, Ljm0;->f(Ljava/util/Collection;LhI6;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public cacheSupportSdkSettings(Lzendesk/support/SupportSdkSettings;)V
    .locals 2

    iget-object v0, p0, Lzendesk/support/requestlist/RequestListModel;->cache:Lzendesk/core/MemoryCache;

    const-string v1, "request_list_settings"

    invoke-interface {v0, v1, p1}, Lzendesk/core/MemoryCache;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public cleanup()V
    .locals 2

    iget-object v0, p0, Lzendesk/support/requestlist/RequestListModel;->cache:Lzendesk/core/MemoryCache;

    const-string v1, "request_list_settings"

    invoke-interface {v0, v1}, Lzendesk/core/MemoryCache;->remove(Ljava/lang/String;)V

    iget-object v0, p0, Lzendesk/support/requestlist/RequestListModel;->cache:Lzendesk/core/MemoryCache;

    const-string v1, "request_list_items"

    invoke-interface {v0, v1}, Lzendesk/core/MemoryCache;->remove(Ljava/lang/String;)V

    return-void
.end method

.method public getCachedRequestInfos()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lzendesk/support/requestlist/RequestListItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/requestlist/RequestListModel;->cache:Lzendesk/core/MemoryCache;

    const-string v1, "request_list_items"

    invoke-interface {v0, v1}, Lzendesk/core/MemoryCache;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getCachedSettings()Lzendesk/support/SupportSdkSettings;
    .locals 2

    iget-object v0, p0, Lzendesk/support/requestlist/RequestListModel;->cache:Lzendesk/core/MemoryCache;

    const-string v1, "request_list_settings"

    invoke-interface {v0, v1}, Lzendesk/core/MemoryCache;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/SupportSdkSettings;

    return-object v0
.end method

.method public loadItems(ZLzendesk/support/SupportSdkSettings;LlI6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lzendesk/support/SupportSdkSettings;",
            "LlI6<",
            "Ljava/util/List<",
            "Lzendesk/support/requestlist/RequestListItem;",
            ">;>;)V"
        }
    .end annotation

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lzendesk/support/requestlist/RequestListModel;->getCachedRequestInfos()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lzendesk/support/requestlist/RequestListModel;->getCachedRequestInfos()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p3, p1}, LlI6;->onSuccess(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Lzendesk/support/requestlist/RequestListModel;->requestInfoDataSource:Lzendesk/support/requestlist/RequestInfoDataSource;

    new-instance v0, Lzendesk/support/requestlist/RequestListModel$1;

    invoke-direct {v0, p0, p2, p3}, Lzendesk/support/requestlist/RequestListModel$1;-><init>(Lzendesk/support/requestlist/RequestListModel;Lzendesk/support/SupportSdkSettings;LlI6;)V

    invoke-interface {p1, v0}, Lzendesk/support/requestlist/RequestInfoDataSource;->load(LlI6;)V

    :goto_1
    return-void
.end method

.method public loadSettings(LlI6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlI6<",
            "Lzendesk/support/SupportSdkSettings;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/requestlist/RequestListModel;->settingsAggregatedCallback:Lzendesk/support/AggregatedCallback;

    invoke-virtual {v0, p1}, Lzendesk/support/AggregatedCallback;->add(LlI6;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lzendesk/support/requestlist/RequestListModel;->settingsProvider:Lzendesk/support/SupportSettingsProvider;

    iget-object v0, p0, Lzendesk/support/requestlist/RequestListModel;->settingsAggregatedCallback:Lzendesk/support/AggregatedCallback;

    invoke-interface {p1, v0}, Lzendesk/support/SupportSettingsProvider;->getSettings(LlI6;)V

    :cond_0
    return-void
.end method

.method public trackRequestListViewed()V
    .locals 1

    iget-object v0, p0, Lzendesk/support/requestlist/RequestListModel;->blipsProvider:Lzendesk/support/SupportBlipsProvider;

    invoke-interface {v0}, Lzendesk/support/SupportBlipsProvider;->requestListViewed()V

    return-void
.end method
