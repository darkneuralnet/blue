.class public final Lio/reactivex/internal/schedulers/p;
.super Lio/reactivex/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/schedulers/p$a;,
        Lio/reactivex/internal/schedulers/p$b;,
        Lio/reactivex/internal/schedulers/p$c;
    }
.end annotation


# static fields
.field public static final d:Lio/reactivex/internal/schedulers/p;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/reactivex/internal/schedulers/p;

    invoke-direct {v0}, Lio/reactivex/internal/schedulers/p;-><init>()V

    sput-object v0, Lio/reactivex/internal/schedulers/p;->d:Lio/reactivex/internal/schedulers/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/E;-><init>()V

    return-void
.end method

.method public static g()Lio/reactivex/internal/schedulers/p;
    .locals 1

    sget-object v0, Lio/reactivex/internal/schedulers/p;->d:Lio/reactivex/internal/schedulers/p;

    return-object v0
.end method


# virtual methods
.method public b()Lio/reactivex/E$c;
    .locals 1

    new-instance v0, Lio/reactivex/internal/schedulers/p$c;

    invoke-direct {v0}, Lio/reactivex/internal/schedulers/p$c;-><init>()V

    return-object v0
.end method

.method public d(Ljava/lang/Runnable;)Lio/reactivex/disposables/c;
    .locals 0

    invoke-static {p1}, Lio/reactivex/plugins/a;->w(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    sget-object p1, Lio/reactivex/internal/disposables/e;->b:Lio/reactivex/internal/disposables/e;

    return-object p1
.end method

.method public e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;
    .locals 0

    :try_start_0
    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->sleep(J)V

    invoke-static {p1}, Lio/reactivex/plugins/a;->w(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    invoke-static {p1}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    :goto_0
    sget-object p1, Lio/reactivex/internal/disposables/e;->b:Lio/reactivex/internal/disposables/e;

    return-object p1
.end method
