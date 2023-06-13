.class public Lv41;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw41;


# instance fields
.field public final a:LAG;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAG<",
            "Lcom/polidea/rxandroidble2/exceptions/BleException;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lcom/polidea/rxandroidble2/exceptions/BleException;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lpd5;Lio/reactivex/Observable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpd5;",
            "Lio/reactivex/Observable<",
            "Lnd5$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LAG;->g()LAG;

    move-result-object v0

    iput-object v0, p0, Lv41;->a:LAG;

    invoke-static {p2, p3}, Lv41;->c(Lpd5;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p2

    new-instance p3, Lv41$c;

    invoke-direct {p3, p0, p1}, Lv41$c;-><init>(Lv41;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lv41$b;

    invoke-direct {p2, p0}, Lv41$b;-><init>(Lv41;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lv41$a;

    invoke-direct {p2, p0}, Lv41$a;-><init>(Lv41;)V

    invoke-virtual {p1, v0, p2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object p1

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstElement()Lio/reactivex/p;

    move-result-object p2

    invoke-virtual {p2}, Lio/reactivex/p;->d0()Lio/reactivex/Observable;

    move-result-object p2

    new-instance p3, Lv41$d;

    invoke-direct {p3, p0, p1}, Lv41$d;-><init>(Lv41;Lio/reactivex/disposables/c;)V

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->doOnTerminate(Lio/reactivex/functions/a;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->replay()Lio/reactivex/observables/a;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lio/reactivex/observables/a;->a(I)Lio/reactivex/Observable;

    move-result-object p1

    iput-object p1, p0, Lv41;->b:Lio/reactivex/Observable;

    new-instance p2, Lv41$e;

    invoke-direct {p2, p0}, Lv41$e;-><init>(Lv41;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    iput-object p1, p0, Lv41;->c:Lio/reactivex/Observable;

    return-void
.end method

.method public static c(Lpd5;Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpd5;",
            "Lio/reactivex/Observable<",
            "Lnd5$b;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Lv41$g;

    invoke-direct {v0}, Lv41$g;-><init>()V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0}, Lpd5;->c()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p1, p0}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    new-instance p1, Lv41$f;

    invoke-direct {p1}, Lv41$f;-><init>()V

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/polidea/rxandroidble2/exceptions/BleException;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv41;->b:Lio/reactivex/Observable;

    return-object v0
.end method

.method public b()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lv41;->c:Lio/reactivex/Observable;

    return-object v0
.end method

.method public d(Lcom/polidea/rxandroidble2/exceptions/BleDisconnectedException;)V
    .locals 1

    iget-object v0, p0, Lv41;->a:LAG;

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public e(Lcom/polidea/rxandroidble2/exceptions/BleGattException;)V
    .locals 1

    iget-object v0, p0, Lv41;->a:LAG;

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    return-void
.end method
