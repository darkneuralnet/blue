.class public final LzK6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/os/IInterface;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LhK6;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LjK6;",
            ">;"
        }
    .end annotation
.end field

.field public e:Z

.field public final f:Landroid/content/Intent;

.field public final g:LsK6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsK6<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final h:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "LrK6;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Landroid/os/IBinder$DeathRecipient;

.field public j:Landroid/content/ServiceConnection;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public k:Landroid/os/IInterface;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, LzK6;->l:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LhK6;Ljava/lang/String;Landroid/content/Intent;LsK6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LhK6;",
            "Ljava/lang/String;",
            "Landroid/content/Intent;",
            "LsK6<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LzK6;->d:Ljava/util/List;

    new-instance v0, LlK6;

    invoke-direct {v0, p0}, LlK6;-><init>(LzK6;)V

    iput-object v0, p0, LzK6;->i:Landroid/os/IBinder$DeathRecipient;

    iput-object p1, p0, LzK6;->a:Landroid/content/Context;

    iput-object p2, p0, LzK6;->b:LhK6;

    iput-object p3, p0, LzK6;->c:Ljava/lang/String;

    iput-object p4, p0, LzK6;->f:Landroid/content/Intent;

    iput-object p5, p0, LzK6;->g:LsK6;

    new-instance p1, Ljava/lang/ref/WeakReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LzK6;->h:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static synthetic d(LzK6;LjK6;)V
    .locals 4

    iget-object v0, p0, LzK6;->k:Landroid/os/IInterface;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-boolean v0, p0, LzK6;->e:Z

    if-nez v0, :cond_2

    iget-object v0, p0, LzK6;->b:LhK6;

    const-string v2, "Initiate binding to the service."

    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LzK6;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, LxK6;

    invoke-direct {p1, p0}, LxK6;-><init>(LzK6;)V

    iput-object p1, p0, LzK6;->j:Landroid/content/ServiceConnection;

    const/4 v0, 0x1

    iput-boolean v0, p0, LzK6;->e:Z

    iget-object v2, p0, LzK6;->a:Landroid/content/Context;

    iget-object v3, p0, LzK6;->f:Landroid/content/Intent;

    invoke-virtual {v2, v3, p1, v0}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, LzK6;->b:LhK6;

    const-string v0, "Failed to bind to the service."

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v2}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v1, p0, LzK6;->e:Z

    iget-object p1, p0, LzK6;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LjK6;

    new-instance v1, Lcom/google/android/play/core/internal/ar;

    invoke-direct {v1}, Lcom/google/android/play/core/internal/ar;-><init>()V

    invoke-virtual {v0, v1}, LjK6;->b(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    iget-object p0, p0, LzK6;->d:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    :cond_1
    return-void

    :cond_2
    iget-boolean v0, p0, LzK6;->e:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, LzK6;->b:LhK6;

    const-string v2, "Waiting to bind to the service."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p0, p0, LzK6;->d:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_3
    invoke-virtual {p1}, LjK6;->run()V

    return-void
.end method

.method public static synthetic e(LzK6;)Landroid/os/IInterface;
    .locals 0

    iget-object p0, p0, LzK6;->k:Landroid/os/IInterface;

    return-object p0
.end method

.method public static synthetic f(LzK6;)LhK6;
    .locals 0

    iget-object p0, p0, LzK6;->b:LhK6;

    return-object p0
.end method

.method public static synthetic g(LzK6;)Landroid/content/ServiceConnection;
    .locals 0

    iget-object p0, p0, LzK6;->j:Landroid/content/ServiceConnection;

    return-object p0
.end method

.method public static synthetic h(LzK6;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, LzK6;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic i(LzK6;)LsK6;
    .locals 0

    iget-object p0, p0, LzK6;->g:LsK6;

    return-object p0
.end method

.method public static synthetic j(LzK6;)V
    .locals 4

    iget-object v0, p0, LzK6;->b:LhK6;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "linkToDeath"

    invoke-virtual {v0, v3, v2}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, LzK6;->k:Landroid/os/IInterface;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object v2, p0, LzK6;->i:Landroid/os/IBinder$DeathRecipient;

    invoke-interface {v0, v2, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object p0, p0, LzK6;->b:LhK6;

    const-string v2, "linkToDeath failed"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v2, v1}, LhK6;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic k(LzK6;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LzK6;->d:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic l(LzK6;LjK6;)V
    .locals 0

    invoke-virtual {p0, p1}, LzK6;->r(LjK6;)V

    return-void
.end method

.method public static synthetic m(LzK6;)V
    .locals 4

    iget-object v0, p0, LzK6;->b:LhK6;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "unlinkToDeath"

    invoke-virtual {v0, v3, v2}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LzK6;->k:Landroid/os/IInterface;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object p0, p0, LzK6;->i:Landroid/os/IBinder$DeathRecipient;

    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    return-void
.end method

.method public static synthetic o(LzK6;Landroid/os/IInterface;)V
    .locals 0

    iput-object p1, p0, LzK6;->k:Landroid/os/IInterface;

    return-void
.end method

.method public static synthetic p(LzK6;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LzK6;->j:Landroid/content/ServiceConnection;

    return-void
.end method

.method public static synthetic q(LzK6;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LzK6;->e:Z

    return-void
.end method


# virtual methods
.method public final a(LjK6;)V
    .locals 2

    new-instance v0, LnK6;

    invoke-virtual {p1}, LjK6;->c()LaO6;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, LnK6;-><init>(LzK6;LaO6;LjK6;)V

    invoke-virtual {p0, v0}, LzK6;->r(LjK6;)V

    return-void
.end method

.method public final b()V
    .locals 1

    new-instance v0, LpK6;

    invoke-direct {v0, p0}, LpK6;-><init>(LzK6;)V

    invoke-virtual {p0, v0}, LzK6;->r(LjK6;)V

    return-void
.end method

.method public final c()Landroid/os/IInterface;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LzK6;->k:Landroid/os/IInterface;

    return-object v0
.end method

.method public final bridge synthetic n()V
    .locals 5

    iget-object v0, p0, LzK6;->b:LhK6;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "reportBinderDeath"

    invoke-virtual {v0, v3, v2}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LzK6;->h:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LrK6;

    if-nez v0, :cond_1

    iget-object v0, p0, LzK6;->b:LhK6;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, LzK6;->c:Ljava/lang/String;

    aput-object v3, v2, v1

    const-string v1, "%s : Binder has died."

    invoke-virtual {v0, v1, v2}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LzK6;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LjK6;

    new-instance v2, Landroid/os/RemoteException;

    iget-object v3, p0, LzK6;->c:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, " : Binder has died."

    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LjK6;->b(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LzK6;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void

    :cond_1
    iget-object v2, p0, LzK6;->b:LhK6;

    const-string v3, "calling onBinderDied"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v1}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v0}, LrK6;->a()V

    return-void
.end method

.method public final r(LjK6;)V
    .locals 4

    sget-object v0, LzK6;->l:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LzK6;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/HandlerThread;

    iget-object v2, p0, LzK6;->c:Ljava/lang/String;

    const/16 v3, 0xa

    invoke-direct {v1, v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    iget-object v2, p0, LzK6;->c:Ljava/lang/String;

    new-instance v3, Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v3, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, LzK6;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
