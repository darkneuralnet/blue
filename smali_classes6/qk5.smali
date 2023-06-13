.class public Lqk5;
.super Lpk5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpk5<",
        "Lxe5;",
        "Landroid/bluetooth/BluetoothAdapter$LeScanCallback;",
        ">;"
    }
.end annotation


# instance fields
.field public final c:Lu62;

.field public final d:LXa1;


# direct methods
.method public constructor <init>(Lpd5;Lu62;LXa1;)V
    .locals 0

    invoke-direct {p0, p1}, Lpk5;-><init>(Lpd5;)V

    iput-object p2, p0, Lqk5;->c:Lu62;

    iput-object p3, p0, Lqk5;->d:LXa1;

    return-void
.end method


# virtual methods
.method public bridge synthetic d(Lio/reactivex/y;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lqk5;->g(Lio/reactivex/y;)Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lpd5;Ljava/lang/Object;)Z
    .locals 0

    check-cast p2, Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

    invoke-virtual {p0, p1, p2}, Lqk5;->h(Lpd5;Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic f(Lpd5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

    invoke-virtual {p0, p1, p2}, Lqk5;->i(Lpd5;Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)V

    return-void
.end method

.method public g(Lio/reactivex/y;)Landroid/bluetooth/BluetoothAdapter$LeScanCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "Lxe5;",
            ">;)",
            "Landroid/bluetooth/BluetoothAdapter$LeScanCallback;"
        }
    .end annotation

    new-instance v0, Lqk5$a;

    invoke-direct {v0, p0, p1}, Lqk5$a;-><init>(Lqk5;Lio/reactivex/y;)V

    return-object v0
.end method

.method public h(Lpd5;Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z
    .locals 2

    iget-object v0, p0, Lqk5;->d:LXa1;

    invoke-virtual {v0}, LXa1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "No library side filtering \u2014> debug logs of scanned devices disabled"

    invoke-static {v1, v0}, Lye5;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p1, p2}, Lpd5;->e(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z

    move-result p1

    return p1
.end method

.method public i(Lpd5;Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)V
    .locals 0

    invoke-virtual {p1, p2}, Lpd5;->g(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScanOperationApi18{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqk5;->d:LXa1;

    invoke-virtual {v1}, LXa1;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ANY_MUST_MATCH -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lqk5;->d:LXa1;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
