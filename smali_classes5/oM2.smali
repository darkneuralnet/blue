.class public LoM2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI73;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x17
.end annotation


# instance fields
.field public a:Landroid/net/ConnectivityManager$NetworkCallback;

.field public final b:Lio/reactivex/subjects/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/h<",
            "LBy0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Landroid/content/BroadcastReceiver;

.field public d:LBy0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LBy0;->b()LBy0;

    move-result-object v0

    iput-object v0, p0, LoM2;->d:LBy0;

    invoke-virtual {p0}, LoM2;->d()Landroid/content/BroadcastReceiver;

    move-result-object v0

    iput-object v0, p0, LoM2;->c:Landroid/content/BroadcastReceiver;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/subjects/h;->a()Lio/reactivex/subjects/h;

    move-result-object v0

    iput-object v0, p0, LoM2;->b:Lio/reactivex/subjects/h;

    return-void
.end method

.method public static synthetic b(LoM2;)LBy0;
    .locals 0

    iget-object p0, p0, LoM2;->d:LBy0;

    return-object p0
.end method

.method public static synthetic c(LoM2;LBy0;)LBy0;
    .locals 0

    iput-object p1, p0, LoM2;->d:LBy0;

    return-object p1
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Observable<",
            "LBy0;",
            ">;"
        }
    .end annotation

    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {p0, p1}, LoM2;->e(Landroid/content/Context;)Landroid/net/ConnectivityManager$NetworkCallback;

    move-result-object v1

    iput-object v1, p0, LoM2;->a:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {p0, p1}, LoM2;->j(Landroid/content/Context;)V

    new-instance v1, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    move-result-object v1

    const/16 v2, 0xd

    invoke-virtual {v1, v2}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v1

    iget-object v2, p0, LoM2;->a:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v0, v1, v2}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    iget-object v1, p0, LoM2;->b:Lio/reactivex/subjects/h;

    sget-object v2, Lio/reactivex/b;->f:Lio/reactivex/b;

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->toFlowable(Lio/reactivex/b;)Lio/reactivex/k;

    move-result-object v1

    new-instance v2, LoM2$c;

    invoke-direct {v2, p0, v0, p1}, LoM2$c;-><init>(LoM2;Landroid/net/ConnectivityManager;Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Lio/reactivex/k;->F(Lio/reactivex/functions/a;)Lio/reactivex/k;

    move-result-object v0

    new-instance v1, LoM2$b;

    invoke-direct {v1, p0}, LoM2$b;-><init>(LoM2;)V

    invoke-virtual {v0, v1}, Lio/reactivex/k;->D(Lio/reactivex/functions/g;)Lio/reactivex/k;

    move-result-object v0

    new-instance v1, LoM2$a;

    invoke-direct {v1, p0}, LoM2$a;-><init>(LoM2;)V

    invoke-virtual {v0, v1}, Lio/reactivex/k;->W(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object v0

    invoke-static {p1}, LBy0;->c(Landroid/content/Context;)LBy0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/k;->U0(Ljava/lang/Object;)Lio/reactivex/k;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/k;->B()Lio/reactivex/k;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/k;->r1()Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public d()Landroid/content/BroadcastReceiver;
    .locals 1

    new-instance v0, LoM2$d;

    invoke-direct {v0, p0}, LoM2$d;-><init>(LoM2;)V

    return-object v0
.end method

.method public e(Landroid/content/Context;)Landroid/net/ConnectivityManager$NetworkCallback;
    .locals 1

    new-instance v0, LoM2$e;

    invoke-direct {v0, p0, p1}, LoM2$e;-><init>(LoM2;Landroid/content/Context;)V

    return-object v0
.end method

.method public f(Landroid/content/Context;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "power"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    invoke-virtual {p1, v0}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p1}, Landroid/os/PowerManager;->isDeviceIdleMode()Z

    move-result p1

    if-eqz p1, :cond_0

    if-nez v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public g(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "ReactiveNetwork"

    invoke-static {v0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public h(LBy0;)V
    .locals 1

    iget-object v0, p0, LoM2;->b:Lio/reactivex/subjects/h;

    invoke-interface {v0, p1}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public i(LBy0;LBy0;)Lna4;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBy0;",
            "LBy0;",
            ")",
            "Lna4<",
            "LBy0;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, LBy0;->j()I

    move-result v0

    invoke-virtual {p2}, LBy0;->j()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-virtual {p1}, LBy0;->h()Landroid/net/NetworkInfo$State;

    move-result-object v1

    sget-object v4, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v1, v4, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    invoke-virtual {p2}, LBy0;->h()Landroid/net/NetworkInfo$State;

    move-result-object v4

    sget-object v5, Landroid/net/NetworkInfo$State;->DISCONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v4, v5, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    move v4, v3

    :goto_2
    invoke-virtual {p2}, LBy0;->f()Landroid/net/NetworkInfo$DetailedState;

    move-result-object v5

    sget-object v6, Landroid/net/NetworkInfo$DetailedState;->IDLE:Landroid/net/NetworkInfo$DetailedState;

    if-eq v5, v6, :cond_3

    move v5, v2

    goto :goto_3

    :cond_3
    move v5, v3

    :goto_3
    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    if-eqz v4, :cond_4

    if-eqz v5, :cond_4

    const/4 v0, 0x2

    new-array v0, v0, [LBy0;

    aput-object p2, v0, v3

    aput-object p1, v0, v2

    invoke-static {v0}, Lio/reactivex/k;->h0([Ljava/lang/Object;)Lio/reactivex/k;

    move-result-object p1

    return-object p1

    :cond_4
    new-array p1, v2, [LBy0;

    aput-object p2, p1, v3

    invoke-static {p1}, Lio/reactivex/k;->h0([Ljava/lang/Object;)Lio/reactivex/k;

    move-result-object p1

    return-object p1
.end method

.method public j(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.os.action.DEVICE_IDLE_MODE_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LoM2;->c:Landroid/content/BroadcastReceiver;

    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public k(Landroid/net/ConnectivityManager;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, LoM2;->a:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {p1, v0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "could not unregister network callback"

    invoke-virtual {p0, v0, p1}, LoM2;->g(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public l(Landroid/content/Context;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, LoM2;->c:Landroid/content/BroadcastReceiver;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "could not unregister receiver"

    invoke-virtual {p0, v0, p1}, LoM2;->g(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
