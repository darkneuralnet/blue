.class public Lrk5;
.super Lpk5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpk5<",
        "Lxe5;",
        "Landroid/bluetooth/le/ScanCallback;",
        ">;"
    }
.end annotation


# instance fields
.field public final c:Lu62;

.field public final d:LId;

.field public final e:Lcom/polidea/rxandroidble2/scan/ScanSettings;

.field public final f:LXa1;

.field public final g:[Lcom/polidea/rxandroidble2/scan/ScanFilter;

.field public h:Lio/reactivex/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/y<",
            "Lxe5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpd5;Lu62;LId;Lcom/polidea/rxandroidble2/scan/ScanSettings;LXa1;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)V
    .locals 0

    invoke-direct {p0, p1}, Lpk5;-><init>(Lpd5;)V

    iput-object p2, p0, Lrk5;->c:Lu62;

    iput-object p4, p0, Lrk5;->e:Lcom/polidea/rxandroidble2/scan/ScanSettings;

    iput-object p5, p0, Lrk5;->f:LXa1;

    iput-object p6, p0, Lrk5;->g:[Lcom/polidea/rxandroidble2/scan/ScanFilter;

    iput-object p3, p0, Lrk5;->d:LId;

    const/4 p1, 0x0

    iput-object p1, p0, Lrk5;->h:Lio/reactivex/y;

    return-void
.end method

.method public static synthetic g(Lrk5;)Lio/reactivex/y;
    .locals 0

    iget-object p0, p0, Lrk5;->h:Lio/reactivex/y;

    return-object p0
.end method

.method public static i(I)I
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x5

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    if-eq p0, v1, :cond_0

    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "Encountered unknown scanning error code: %d -> check android.bluetooth.le.ScanCallback"

    invoke-static {v0, p0}, Lye5;->r(Ljava/lang/String;[Ljava/lang/Object;)V

    const p0, 0x7fffffff

    return p0

    :cond_0
    const/16 p0, 0x9

    return p0

    :cond_1
    const/16 p0, 0x8

    return p0

    :cond_2
    const/4 p0, 0x7

    return p0

    :cond_3
    const/4 p0, 0x6

    return p0

    :cond_4
    return v1
.end method


# virtual methods
.method public bridge synthetic d(Lio/reactivex/y;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lrk5;->h(Lio/reactivex/y;)Landroid/bluetooth/le/ScanCallback;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lpd5;Ljava/lang/Object;)Z
    .locals 0

    check-cast p2, Landroid/bluetooth/le/ScanCallback;

    invoke-virtual {p0, p1, p2}, Lrk5;->j(Lpd5;Landroid/bluetooth/le/ScanCallback;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic f(Lpd5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Landroid/bluetooth/le/ScanCallback;

    invoke-virtual {p0, p1, p2}, Lrk5;->k(Lpd5;Landroid/bluetooth/le/ScanCallback;)V

    return-void
.end method

.method public h(Lio/reactivex/y;)Landroid/bluetooth/le/ScanCallback;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "Lxe5;",
            ">;)",
            "Landroid/bluetooth/le/ScanCallback;"
        }
    .end annotation

    iput-object p1, p0, Lrk5;->h:Lio/reactivex/y;

    new-instance p1, Lrk5$a;

    invoke-direct {p1, p0}, Lrk5$a;-><init>(Lrk5;)V

    return-object p1
.end method

.method public j(Lpd5;Landroid/bluetooth/le/ScanCallback;)Z
    .locals 3

    iget-object v0, p0, Lrk5;->f:LXa1;

    invoke-virtual {v0}, LXa1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "No library side filtering \u2014> debug logs of scanned devices disabled"

    invoke-static {v1, v0}, Lye5;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lrk5;->d:LId;

    iget-object v1, p0, Lrk5;->g:[Lcom/polidea/rxandroidble2/scan/ScanFilter;

    invoke-virtual {v0, v1}, LId;->c([Lcom/polidea/rxandroidble2/scan/ScanFilter;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lrk5;->d:LId;

    iget-object v2, p0, Lrk5;->e:Lcom/polidea/rxandroidble2/scan/ScanSettings;

    invoke-virtual {v1, v2}, LId;->d(Lcom/polidea/rxandroidble2/scan/ScanSettings;)Landroid/bluetooth/le/ScanSettings;

    move-result-object v1

    invoke-virtual {p1, v0, v1, p2}, Lpd5;->d(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V

    const/4 p1, 0x1

    return p1
.end method

.method public k(Lpd5;Landroid/bluetooth/le/ScanCallback;)V
    .locals 0

    invoke-virtual {p1, p2}, Lpd5;->f(Landroid/bluetooth/le/ScanCallback;)V

    iget-object p1, p0, Lrk5;->h:Lio/reactivex/y;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lio/reactivex/j;->onComplete()V

    const/4 p1, 0x0

    iput-object p1, p0, Lrk5;->h:Lio/reactivex/y;

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lrk5;->g:[Lcom/polidea/rxandroidble2/scan/ScanFilter;

    if-eqz v0, :cond_1

    array-length v0, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iget-object v1, p0, Lrk5;->f:LXa1;

    invoke-virtual {v1}, LXa1;->a()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ScanOperationApi21{"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ""

    if-eqz v0, :cond_2

    move-object v4, v3

    goto :goto_2

    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ANY_MUST_MATCH -> nativeFilters="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lrk5;->g:[Lcom/polidea/rxandroidble2/scan/ScanFilter;

    invoke-static {v5}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_2
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v0, :cond_3

    if-nez v1, :cond_3

    const-string v0, " and then "

    goto :goto_3

    :cond_3
    move-object v0, v3

    :goto_3
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_4

    goto :goto_4

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ANY_MUST_MATCH -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrk5;->f:LXa1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_4
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
