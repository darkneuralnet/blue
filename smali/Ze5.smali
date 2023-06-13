.class public LZe5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "PrivateConstructorForUtilityClass"
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LZe5;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LEb5;",
            "Z[",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Lio/reactivex/k<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, LZe5;->f(LEb5;Z)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/schedulers/a;->b(Ljava/util/concurrent/Executor;)Lio/reactivex/E;

    move-result-object p1

    invoke-static {p3}, Lio/reactivex/p;->D(Ljava/util/concurrent/Callable;)Lio/reactivex/p;

    move-result-object p3

    invoke-static {p0, p2}, LZe5;->b(LEb5;[Ljava/lang/String;)Lio/reactivex/k;

    move-result-object p0

    invoke-virtual {p0, p1}, Lio/reactivex/k;->Y0(Lio/reactivex/E;)Lio/reactivex/k;

    move-result-object p0

    invoke-virtual {p0, p1}, Lio/reactivex/k;->s1(Lio/reactivex/E;)Lio/reactivex/k;

    move-result-object p0

    invoke-virtual {p0, p1}, Lio/reactivex/k;->s0(Lio/reactivex/E;)Lio/reactivex/k;

    move-result-object p0

    new-instance p1, LZe5$b;

    invoke-direct {p1, p3}, LZe5$b;-><init>(Lio/reactivex/p;)V

    invoke-virtual {p0, p1}, Lio/reactivex/k;->d0(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object p0

    return-object p0
.end method

.method public static varargs b(LEb5;[Ljava/lang/String;)Lio/reactivex/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEb5;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/k<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, LZe5$a;

    invoke-direct {v0, p1, p0}, LZe5$a;-><init>([Ljava/lang/String;LEb5;)V

    sget-object p0, Lio/reactivex/b;->f:Lio/reactivex/b;

    invoke-static {v0, p0}, Lio/reactivex/k;->t(Lio/reactivex/n;Lio/reactivex/b;)Lio/reactivex/k;

    move-result-object p0

    return-object p0
.end method

.method public static c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LEb5;",
            "Z[",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, LZe5;->f(LEb5;Z)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/schedulers/a;->b(Ljava/util/concurrent/Executor;)Lio/reactivex/E;

    move-result-object p1

    invoke-static {p3}, Lio/reactivex/p;->D(Ljava/util/concurrent/Callable;)Lio/reactivex/p;

    move-result-object p3

    invoke-static {p0, p2}, LZe5;->d(LEb5;[Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p0

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p0

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->unsubscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p0

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p0

    new-instance p1, LZe5$d;

    invoke-direct {p1, p3}, LZe5$d;-><init>(Lio/reactivex/p;)V

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->flatMapMaybe(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static varargs d(LEb5;[Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEb5;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, LZe5$c;

    invoke-direct {v0, p1, p0}, LZe5$c;-><init>([Ljava/lang/String;LEb5;)V

    invoke-static {v0}, Lio/reactivex/Observable;->create(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/util/concurrent/Callable;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LZe5$e;

    invoke-direct {v0, p0}, LZe5$e;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {v0}, Lio/reactivex/F;->j(Lio/reactivex/J;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static f(LEb5;Z)Ljava/util/concurrent/Executor;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LEb5;->p()Ljava/util/concurrent/Executor;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, LEb5;->m()Ljava/util/concurrent/Executor;

    move-result-object p0

    return-object p0
.end method
