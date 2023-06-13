.class Lzendesk/core/ZendeskNetworkInfoProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/core/NetworkInfoProvider;
.implements Lzendesk/core/NetworkAware;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/core/ZendeskNetworkInfoProvider$CurrentState;
    }
.end annotation


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "ZendeskNetworkInfoProvider"


# instance fields
.field private final connectivityManager:Landroid/net/ConnectivityManager;

.field private currentState:Lzendesk/core/ZendeskNetworkInfoProvider$CurrentState;

.field private final listeners:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/ref/WeakReference<",
            "Lzendesk/core/NetworkAware;",
            ">;>;"
        }
    .end annotation
.end field

.field private networkCallback:Landroid/net/ConnectivityManager$NetworkCallback;

.field private final retryActions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/ref/WeakReference<",
            "Lzendesk/core/RetryAction;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/net/ConnectivityManager;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->listeners:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->retryActions:Ljava/util/Map;

    const/4 v0, 0x0

    iput-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->currentState:Lzendesk/core/ZendeskNetworkInfoProvider$CurrentState;

    iput-object p1, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->connectivityManager:Landroid/net/ConnectivityManager;

    return-void
.end method

.method private static isConnectedOrConnecting(Landroid/net/ConnectivityManager;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private registerForNetworkCallbacks()V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "ZendeskNetworkInfoProvider"

    const-string v2, "Adding Lollipop network callbacks..."

    invoke-static {v1, v2, v0}, LIx2;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lzendesk/core/ZendeskNetworkInfoProvider$1;

    invoke-direct {v1, p0, v0}, Lzendesk/core/ZendeskNetworkInfoProvider$1;-><init>(Lzendesk/core/ZendeskNetworkInfoProvider;Landroid/os/Handler;)V

    iput-object v1, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->networkCallback:Landroid/net/ConnectivityManager$NetworkCallback;

    iget-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->connectivityManager:Landroid/net/ConnectivityManager;

    new-instance v1, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    invoke-virtual {v1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v1

    iget-object v2, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->networkCallback:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v0, v1, v2}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void
.end method

.method private unregisterForNetworkCallbacks()V
    .locals 2

    iget-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->networkCallback:Landroid/net/ConnectivityManager$NetworkCallback;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->connectivityManager:Landroid/net/ConnectivityManager;

    invoke-virtual {v1, v0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->networkCallback:Landroid/net/ConnectivityManager$NetworkCallback;

    :cond_0
    return-void
.end method


# virtual methods
.method public addNetworkAwareListener(Ljava/lang/Integer;Lzendesk/core/NetworkAware;)V
    .locals 2

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->listeners:Ljava/util/Map;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public addRetryAction(Ljava/lang/Integer;Lzendesk/core/RetryAction;)V
    .locals 2

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->retryActions:Ljava/util/Map;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public clearNetworkAwareListeners()V
    .locals 1

    iget-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->listeners:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public clearRetryActions()V
    .locals 1

    iget-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->retryActions:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public isNetworkAvailable()Z
    .locals 1

    iget-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->connectivityManager:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onNetworkAvailable()V
    .locals 4

    sget-object v0, Lzendesk/core/ZendeskNetworkInfoProvider$CurrentState;->CONNECTED:Lzendesk/core/ZendeskNetworkInfoProvider$CurrentState;

    iget-object v1, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->currentState:Lzendesk/core/ZendeskNetworkInfoProvider$CurrentState;

    if-eq v0, v1, :cond_5

    iget-object v1, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->connectivityManager:Landroid/net/ConnectivityManager;

    invoke-static {v1}, Lzendesk/core/ZendeskNetworkInfoProvider;->isConnectedOrConnecting(Landroid/net/ConnectivityManager;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    iput-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->currentState:Lzendesk/core/ZendeskNetworkInfoProvider$CurrentState;

    iget-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->listeners:Ljava/util/Map;

    invoke-static {v0}, Ljm0;->d(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->retryActions:Ljava/util/Map;

    invoke-static {v1}, Ljm0;->d(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzendesk/core/NetworkAware;

    invoke-interface {v2}, Lzendesk/core/NetworkAware;->onNetworkAvailable()V

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/core/RetryAction;

    invoke-interface {v1}, Lzendesk/core/RetryAction;->onRetry()V

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->retryActions:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    :cond_5
    :goto_2
    return-void
.end method

.method public onNetworkUnavailable()V
    .locals 3

    sget-object v0, Lzendesk/core/ZendeskNetworkInfoProvider$CurrentState;->DISCONNECTED:Lzendesk/core/ZendeskNetworkInfoProvider$CurrentState;

    iget-object v1, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->currentState:Lzendesk/core/ZendeskNetworkInfoProvider$CurrentState;

    if-eq v0, v1, :cond_2

    iget-object v1, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->connectivityManager:Landroid/net/ConnectivityManager;

    invoke-static {v1}, Lzendesk/core/ZendeskNetworkInfoProvider;->isConnectedOrConnecting(Landroid/net/ConnectivityManager;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iput-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->currentState:Lzendesk/core/ZendeskNetworkInfoProvider$CurrentState;

    iget-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->listeners:Ljava/util/Map;

    invoke-static {v0}, Ljm0;->d(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/core/NetworkAware;

    invoke-interface {v1}, Lzendesk/core/NetworkAware;->onNetworkUnavailable()V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public register()V
    .locals 0

    invoke-direct {p0}, Lzendesk/core/ZendeskNetworkInfoProvider;->registerForNetworkCallbacks()V

    return-void
.end method

.method public removeNetworkAwareListener(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->listeners:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public removeRetryAction(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lzendesk/core/ZendeskNetworkInfoProvider;->retryActions:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public unregister()V
    .locals 0

    invoke-direct {p0}, Lzendesk/core/ZendeskNetworkInfoProvider;->unregisterForNetworkCallbacks()V

    return-void
.end method
