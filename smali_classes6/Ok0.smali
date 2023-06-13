.class public LOk0;
.super Lio/reactivex/Observable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/Observable<",
        "Lde5$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lpd5;

.field public final c:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lnd5$b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LNw2;

.field public final f:Lio/reactivex/E;


# direct methods
.method public constructor <init>(Lpd5;Lio/reactivex/Observable;Lio/reactivex/Observable;LNw2;Lio/reactivex/E;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpd5;",
            "Lio/reactivex/Observable<",
            "Lnd5$b;",
            ">;",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;",
            "LNw2;",
            "Lio/reactivex/E;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/Observable;-><init>()V

    iput-object p1, p0, LOk0;->b:Lpd5;

    iput-object p2, p0, LOk0;->c:Lio/reactivex/Observable;

    iput-object p3, p0, LOk0;->d:Lio/reactivex/Observable;

    iput-object p4, p0, LOk0;->e:LNw2;

    iput-object p5, p0, LOk0;->f:Lio/reactivex/E;

    return-void
.end method

.method public static a(Lpd5;Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpd5;",
            "Lio/reactivex/Observable<",
            "Lnd5$b;",
            ">;",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Lde5$a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lpd5;->c()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lnd5$b;->c:Lnd5$b;

    goto :goto_0

    :cond_0
    sget-object p0, Lnd5$b;->d:Lnd5$b;

    :goto_0
    invoke-virtual {p1, p0}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    new-instance p1, LOk0$c;

    invoke-direct {p1, p2}, LOk0$c;-><init>(Lio/reactivex/Observable;)V

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static c(LNw2;Lio/reactivex/E;)Lio/reactivex/F;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LNw2;",
            "Lio/reactivex/E;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x1

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lio/reactivex/Observable;->interval(JJLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, LOk0$b;

    invoke-direct {v0, p0}, LOk0$b;-><init>(LNw2;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->takeWhile(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Observable;->count()Lio/reactivex/F;

    move-result-object p0

    new-instance p1, LOk0$a;

    invoke-direct {p1}, LOk0$a;-><init>()V

    invoke-virtual {p0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-",
            "Lde5$a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LOk0;->b:Lpd5;

    invoke-virtual {v0}, Lpd5;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lio/reactivex/disposables/d;->b()Lio/reactivex/disposables/c;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-interface {p1}, Lio/reactivex/D;->onComplete()V

    return-void

    :cond_0
    iget-object v0, p0, LOk0;->e:LNw2;

    iget-object v1, p0, LOk0;->f:Lio/reactivex/E;

    invoke-static {v0, v1}, LOk0;->c(LNw2;Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LOk0$d;

    invoke-direct {v1, p0}, LOk0$d;-><init>(LOk0;)V

    invoke-virtual {v0, v1}, Lio/reactivex/F;->D(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
