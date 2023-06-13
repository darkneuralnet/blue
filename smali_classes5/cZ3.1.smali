.class public LcZ3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI73;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(LcZ3;Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;
    .locals 0

    invoke-virtual {p0, p1}, LcZ3;->c(Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lio/reactivex/Observable;
    .locals 2
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

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    new-instance v1, LcZ3$a;

    invoke-direct {v1, p0, p1, v0}, LcZ3$a;-><init>(LcZ3;Landroid/content/Context;Landroid/content/IntentFilter;)V

    invoke-static {v1}, Lio/reactivex/Observable;->create(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, LBy0;->b()LBy0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->defaultIfEmpty(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;
    .locals 1

    new-instance v0, LcZ3$b;

    invoke-direct {v0, p0, p1}, LcZ3$b;-><init>(LcZ3;Lio/reactivex/functions/a;)V

    invoke-static {v0}, Lio/reactivex/disposables/d;->c(Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "ReactiveNetwork"

    invoke-static {v0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public e(Landroid/content/Context;Landroid/content/BroadcastReceiver;)V
    .locals 0

    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "receiver was already unregistered"

    invoke-virtual {p0, p2, p1}, LcZ3;->d(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
