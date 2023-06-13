.class public abstract Lol;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnl$b;


# instance fields
.field private final appStateCallback:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lnl$b;",
            ">;"
        }
    .end annotation
.end field

.field private final appStateMonitor:Lnl;

.field private currentAppState:Lim;

.field private isRegisteredForAppState:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lnl;->b()Lnl;

    move-result-object v0

    invoke-direct {p0, v0}, Lol;-><init>(Lnl;)V

    return-void
.end method

.method public constructor <init>(Lnl;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lol;->isRegisteredForAppState:Z

    sget-object v0, Lim;->c:Lim;

    iput-object v0, p0, Lol;->currentAppState:Lim;

    iput-object p1, p0, Lol;->appStateMonitor:Lnl;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lol;->appStateCallback:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public getAppState()Lim;
    .locals 1

    iget-object v0, p0, Lol;->currentAppState:Lim;

    return-object v0
.end method

.method public getAppStateCallback()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Lnl$b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lol;->appStateCallback:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method public incrementTsnsCount(I)V
    .locals 1

    iget-object v0, p0, Lol;->appStateMonitor:Lnl;

    invoke-virtual {v0, p1}, Lnl;->e(I)V

    return-void
.end method

.method public onUpdateAppState(Lim;)V
    .locals 2

    iget-object v0, p0, Lol;->currentAppState:Lim;

    sget-object v1, Lim;->c:Lim;

    if-ne v0, v1, :cond_0

    iput-object p1, p0, Lol;->currentAppState:Lim;

    goto :goto_0

    :cond_0
    if-eq v0, p1, :cond_1

    if-eq p1, v1, :cond_1

    sget-object p1, Lim;->f:Lim;

    iput-object p1, p0, Lol;->currentAppState:Lim;

    :cond_1
    :goto_0
    return-void
.end method

.method public registerForAppState()V
    .locals 2

    iget-boolean v0, p0, Lol;->isRegisteredForAppState:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lol;->appStateMonitor:Lnl;

    invoke-virtual {v0}, Lnl;->a()Lim;

    move-result-object v0

    iput-object v0, p0, Lol;->currentAppState:Lim;

    iget-object v0, p0, Lol;->appStateMonitor:Lnl;

    iget-object v1, p0, Lol;->appStateCallback:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v1}, Lnl;->k(Ljava/lang/ref/WeakReference;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lol;->isRegisteredForAppState:Z

    return-void
.end method

.method public unregisterForAppState()V
    .locals 2

    iget-boolean v0, p0, Lol;->isRegisteredForAppState:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lol;->appStateMonitor:Lnl;

    iget-object v1, p0, Lol;->appStateCallback:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v1}, Lnl;->p(Ljava/lang/ref/WeakReference;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lol;->isRegisteredForAppState:Z

    return-void
.end method
