.class public final LcP6;
.super LVK6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LVK6<",
        "LcO5;",
        ">;"
    }
.end annotation


# static fields
.field public static j:LcP6;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# instance fields
.field public final g:Landroid/os/Handler;

.field public final h:LiN6;

.field public final i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LdO5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LiN6;)V
    .locals 3

    new-instance v0, LhK6;

    const-string v1, "SplitInstallListenerRegistry"

    invoke-direct {v0, v1}, LhK6;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, v1, p1}, LVK6;-><init>(LhK6;Landroid/content/IntentFilter;Landroid/content/Context;)V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, LcP6;->g:Landroid/os/Handler;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, LcP6;->i:Ljava/util/Set;

    iput-object p2, p0, LcP6;->h:LiN6;

    return-void
.end method

.method public static declared-synchronized f(Landroid/content/Context;)LcP6;
    .locals 3

    const-class v0, LcP6;

    monitor-enter v0

    :try_start_0
    sget-object v1, LcP6;->j:LcP6;

    if-nez v1, :cond_0

    new-instance v1, LcP6;

    sget-object v2, LtO6;->b:LtO6;

    invoke-direct {v1, p0, v2}, LcP6;-><init>(Landroid/content/Context;LiN6;)V

    sput-object v1, LcP6;->j:LcP6;

    :cond_0
    sget-object p0, LcP6;->j:LcP6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static synthetic h(LcP6;LcO5;II)V
    .locals 2

    iget-object v0, p0, LcP6;->g:Landroid/os/Handler;

    new-instance v1, LZO6;

    invoke-direct {v1, p0, p1, p2, p3}, LZO6;-><init>(LcP6;LcO5;II)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic i(LcP6;)LhK6;
    .locals 0

    iget-object p0, p0, LVK6;->a:LhK6;

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    const-string v0, "session_state"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, LcO5;->e(Landroid/os/Bundle;)LcO5;

    move-result-object v0

    iget-object v1, p0, LVK6;->a:LhK6;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const-string v3, "ListenerRegistryBroadcastReceiver.onReceive: %s"

    invoke-virtual {v1, v3, v2}, LhK6;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, LcP6;->h:LiN6;

    invoke-interface {v1}, LiN6;->a()LwN6;

    move-result-object v1

    invoke-virtual {v0}, LcO5;->i()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LcO5;->d()Ljava/util/List;

    move-result-object v2

    new-instance v3, LWO6;

    invoke-direct {v3, p0, v0, p2, p1}, LWO6;-><init>(LcP6;LcO5;Landroid/content/Intent;Landroid/content/Context;)V

    invoke-interface {v1, v2, v3}, LwN6;->a(Ljava/util/List;LUM6;)V

    return-void

    :cond_1
    invoke-virtual {p0, v0}, LcP6;->g(LcO5;)V

    return-void
.end method

.method public final declared-synchronized g(LcO5;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/LinkedHashSet;

    iget-object v1, p0, LcP6;->i:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LdO5;

    invoke-interface {v1, p1}, LKP5;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LVK6;->d(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
