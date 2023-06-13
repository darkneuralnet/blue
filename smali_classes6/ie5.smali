.class public Lie5;
.super Lde5;
.source "SourceFile"


# instance fields
.field public final a:LKk0;

.field public final b:LGk5;

.field public final c:Lse5;

.field public final d:Lcl5;

.field public final e:Luk5;

.field public final f:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "Lxe5;",
            "LTk5;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lgk0$b;

.field public final h:Lio/reactivex/E;

.field public final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public final j:LUX;

.field public final k:Lpd5;

.field public final l:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lnd5$b;",
            ">;"
        }
    .end annotation
.end field

.field public final m:LNw2;

.field public final n:Lan2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lan2<",
            "LOk0;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Ldw;

.field public final p:LBi0;

.field public final q:Lvi0;


# direct methods
.method public constructor <init>(LUX;Lpd5;LKk0;Lio/reactivex/Observable;LGk5;LNw2;Lan2;Lse5;Lcl5;Luk5;Lio/reactivex/functions/o;Lio/reactivex/E;Lgk0$b;Ldw;LBi0;Lvi0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LUX;",
            "Lpd5;",
            "LKk0;",
            "Lio/reactivex/Observable<",
            "Lnd5$b;",
            ">;",
            "LGk5;",
            "LNw2;",
            "Lan2<",
            "LOk0;",
            ">;",
            "Lse5;",
            "Lcl5;",
            "Luk5;",
            "Lio/reactivex/functions/o<",
            "Lxe5;",
            "LTk5;",
            ">;",
            "Lio/reactivex/E;",
            "Lgk0$b;",
            "Ldw;",
            "LBi0;",
            "Lvi0;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Lde5;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v0, Lie5;->i:Ljava/util/Map;

    move-object v1, p3

    iput-object v1, v0, Lie5;->a:LKk0;

    move-object v1, p1

    iput-object v1, v0, Lie5;->j:LUX;

    move-object v1, p2

    iput-object v1, v0, Lie5;->k:Lpd5;

    move-object v1, p4

    iput-object v1, v0, Lie5;->l:Lio/reactivex/Observable;

    move-object v1, p5

    iput-object v1, v0, Lie5;->b:LGk5;

    move-object v1, p6

    iput-object v1, v0, Lie5;->m:LNw2;

    move-object v1, p7

    iput-object v1, v0, Lie5;->n:Lan2;

    move-object v1, p8

    iput-object v1, v0, Lie5;->c:Lse5;

    move-object v1, p9

    iput-object v1, v0, Lie5;->d:Lcl5;

    move-object v1, p10

    iput-object v1, v0, Lie5;->e:Luk5;

    move-object v1, p11

    iput-object v1, v0, Lie5;->f:Lio/reactivex/functions/o;

    move-object v1, p12

    iput-object v1, v0, Lie5;->h:Lio/reactivex/E;

    move-object v1, p13

    iput-object v1, v0, Lie5;->g:Lgk0$b;

    move-object/from16 v1, p14

    iput-object v1, v0, Lie5;->o:Ldw;

    move-object/from16 v1, p15

    iput-object v1, v0, Lie5;->p:LBi0;

    move-object/from16 v1, p16

    iput-object v1, v0, Lie5;->q:Lvi0;

    return-void
.end method

.method public static synthetic f(Lnd5$b;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0}, Lie5;->m(Lnd5$b;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lie5;Lcom/polidea/rxandroidble2/scan/ScanSettings;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)Lio/reactivex/B;
    .locals 0

    invoke-direct {p0, p1, p2}, Lie5;->o(Lcom/polidea/rxandroidble2/scan/ScanSettings;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lnd5$b;)Z
    .locals 0

    invoke-static {p0}, Lie5;->l(Lnd5$b;)Z

    move-result p0

    return p0
.end method

.method public static synthetic i(LTk5;)V
    .locals 0

    invoke-static {p0}, Lie5;->n(LTk5;)V

    return-void
.end method

.method public static synthetic l(Lnd5$b;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    sget-object v0, Lnd5$b;->c:Lnd5$b;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic m(Lnd5$b;)Lio/reactivex/u;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance p0, Lcom/polidea/rxandroidble2/exceptions/BleScanException;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/polidea/rxandroidble2/exceptions/BleScanException;-><init>(I)V

    invoke-static {p0}, Lio/reactivex/p;->v(Ljava/lang/Throwable;)Lio/reactivex/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(LTk5;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {}, Lye5;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "%s"

    invoke-static {p0, v0}, Lye5;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private synthetic o(Lcom/polidea/rxandroidble2/scan/ScanSettings;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)Lio/reactivex/B;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lie5;->e:Luk5;

    invoke-virtual {p1}, Lcom/polidea/rxandroidble2/scan/ScanSettings;->i()Z

    move-result v1

    invoke-interface {v0, v1}, Luk5;->a(Z)V

    iget-object v0, p0, Lie5;->d:Lcl5;

    invoke-interface {v0, p1, p2}, Lcl5;->a(Lcom/polidea/rxandroidble2/scan/ScanSettings;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)Lbl5;

    move-result-object p1

    iget-object p2, p1, Lbl5;->a:LYh3;

    iget-object v0, p0, Lie5;->a:LKk0;

    invoke-interface {v0, p2}, LKk0;->a(LYh3;)Lio/reactivex/Observable;

    move-result-object p2

    iget-object v0, p0, Lie5;->h:Lio/reactivex/E;

    invoke-virtual {p2, v0}, Lio/reactivex/Observable;->unsubscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p2

    iget-object p1, p1, Lbl5;->b:Lio/reactivex/C;

    invoke-virtual {p2, p1}, Lio/reactivex/Observable;->compose(Lio/reactivex/C;)Lio/reactivex/Observable;

    move-result-object p1

    iget-object p2, p0, Lie5;->f:Lio/reactivex/functions/o;

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lfe5;

    invoke-direct {p2}, Lfe5;-><init>()V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0}, Lie5;->j()Lio/reactivex/Observable;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->mergeWith(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public b(Ljava/lang/String;)Lne5;
    .locals 1

    invoke-virtual {p0}, Lie5;->k()V

    iget-object v0, p0, Lie5;->c:Lse5;

    invoke-virtual {v0, p1}, Lse5;->a(Ljava/lang/String;)Lne5;

    move-result-object p1

    return-object p1
.end method

.method public c()Lde5$a;
    .locals 1

    iget-object v0, p0, Lie5;->k:Lpd5;

    invoke-virtual {v0}, Lpd5;->b()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lde5$a;->b:Lde5$a;

    return-object v0

    :cond_0
    iget-object v0, p0, Lie5;->m:LNw2;

    invoke-interface {v0}, LNw2;->a()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lde5$a;->c:Lde5$a;

    return-object v0

    :cond_1
    iget-object v0, p0, Lie5;->k:Lpd5;

    invoke-virtual {v0}, Lpd5;->c()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lde5$a;->d:Lde5$a;

    return-object v0

    :cond_2
    iget-object v0, p0, Lie5;->m:LNw2;

    invoke-interface {v0}, LNw2;->b()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lde5$a;->e:Lde5$a;

    return-object v0

    :cond_3
    sget-object v0, Lde5$a;->f:Lde5$a;

    return-object v0
.end method

.method public d()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lde5$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lie5;->n:Lan2;

    invoke-interface {v0}, Lan2;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public varargs e(Lcom/polidea/rxandroidble2/scan/ScanSettings;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/polidea/rxandroidble2/scan/ScanSettings;",
            "[",
            "Lcom/polidea/rxandroidble2/scan/ScanFilter;",
            ")",
            "Lio/reactivex/Observable<",
            "LTk5;",
            ">;"
        }
    .end annotation

    new-instance v0, Lee5;

    invoke-direct {v0, p0, p1, p2}, Lee5;-><init>(Lie5;Lcom/polidea/rxandroidble2/scan/ScanSettings;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public finalize()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p0, Lie5;->g:Lgk0$b;

    invoke-interface {v0}, Lgk0$b;->a()V

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method public j()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lie5;->l:Lio/reactivex/Observable;

    new-instance v1, Lge5;

    invoke-direct {v1}, Lge5;-><init>()V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstElement()Lio/reactivex/p;

    move-result-object v0

    new-instance v1, Lhe5;

    invoke-direct {v1}, Lhe5;-><init>()V

    invoke-virtual {v0, v1}, Lio/reactivex/p;->x(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/p;->d0()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final k()V
    .locals 2

    iget-object v0, p0, Lie5;->k:Lpd5;

    invoke-virtual {v0}, Lpd5;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "RxAndroidBle library needs a BluetoothAdapter to be available in the system to work. If this is a test on an emulator then you can use \'https://github.com/Polidea/RxAndroidBle/tree/master/mockrxandroidble\'"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
