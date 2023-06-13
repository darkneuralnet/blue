.class public LLy0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGy0;


# instance fields
.field public final a:LKk0;

.field public final b:Lgy0$a;

.field public final c:Lio/reactivex/E;


# direct methods
.method public constructor <init>(LKk0;Lgy0$a;Lio/reactivex/E;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLy0;->a:LKk0;

    iput-object p2, p0, LLy0;->b:Lgy0$a;

    iput-object p3, p0, LLy0;->c:Lio/reactivex/E;

    return-void
.end method

.method public static synthetic b(Ljava/util/Set;Lio/reactivex/disposables/c;)V
    .locals 0

    invoke-static {p0, p1}, LLy0;->f(Ljava/util/Set;Lio/reactivex/disposables/c;)V

    return-void
.end method

.method public static synthetic c(LLy0;Lwy0;)Lio/reactivex/B;
    .locals 0

    invoke-direct {p0, p1}, LLy0;->h(Lwy0;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/util/Set;)V
    .locals 0

    invoke-static {p0}, LLy0;->g(Ljava/util/Set;)V

    return-void
.end method

.method public static synthetic f(Ljava/util/Set;Lio/reactivex/disposables/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyy0;

    invoke-interface {p1}, Lyy0;->c()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic g(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyy0;

    invoke-interface {v0}, Lyy0;->b()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private synthetic h(Lwy0;)Lio/reactivex/B;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LLy0;->b:Lgy0$a;

    iget-boolean v1, p1, Lwy0;->a:Z

    invoke-interface {v0, v1}, Lgy0$a;->a(Z)Lgy0$a;

    move-result-object v0

    iget-boolean v1, p1, Lwy0;->b:Z

    invoke-interface {v0, v1}, Lgy0$a;->c(Z)Lgy0$a;

    move-result-object v0

    iget-object p1, p1, Lwy0;->c:LK46;

    invoke-interface {v0, p1}, Lgy0$a;->b(LK46;)Lgy0$a;

    move-result-object p1

    invoke-interface {p1}, Lgy0$a;->build()Lgy0;

    move-result-object p1

    invoke-interface {p1}, Lgy0;->a()Ljava/util/Set;

    move-result-object v0

    invoke-static {p1}, LLy0;->j(Lgy0;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-static {p1}, LLy0;->i(Lgy0;)Lio/reactivex/Observable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->mergeWith(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {p0, p1}, LLy0;->e(Lgy0;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {v1, p1}, Lio/reactivex/Observable;->delaySubscription(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v1, LIy0;

    invoke-direct {v1, v0}, LIy0;-><init>(Ljava/util/Set;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->doOnSubscribe(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v1, LJy0;

    invoke-direct {v1, v0}, LJy0;-><init>(Ljava/util/Set;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->doFinally(Lio/reactivex/functions/a;)Lio/reactivex/Observable;

    move-result-object p1

    iget-object v0, p0, LLy0;->c:Lio/reactivex/E;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    iget-object v0, p0, LLy0;->c:Lio/reactivex/E;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->unsubscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public static i(Lgy0;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgy0;",
            ")",
            "Lio/reactivex/Observable<",
            "Lke5;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Lgy0;->b()Lve5;

    move-result-object p0

    invoke-virtual {p0}, Lve5;->k()Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static j(Lgy0;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgy0;",
            ")",
            "Lio/reactivex/Observable<",
            "Lke5;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LKy0;

    invoke-direct {v0, p0}, LKy0;-><init>(Lgy0;)V

    invoke-static {v0}, Lio/reactivex/Observable;->fromCallable(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lwy0;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwy0;",
            ")",
            "Lio/reactivex/Observable<",
            "Lke5;",
            ">;"
        }
    .end annotation

    new-instance v0, LHy0;

    invoke-direct {v0, p0, p1}, LHy0;-><init>(LLy0;Lwy0;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public e(Lgy0;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgy0;",
            ")",
            "Lio/reactivex/Observable<",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LLy0;->a:LKk0;

    invoke-interface {p1}, Lgy0;->d()Lay0;

    move-result-object p1

    invoke-interface {v0, p1}, LKk0;->a(LYh3;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
