.class public Lay0;
.super Lbd4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbd4<",
        "Landroid/bluetooth/BluetoothGatt;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Landroid/bluetooth/BluetoothDevice;

.field public final c:LtU;

.field public final d:Lve5;

.field public final e:LkX;

.field public final f:LL46;

.field public final g:Z

.field public final h:Lxy0;


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;LtU;Lve5;LkX;LL46;ZLxy0;)V
    .locals 0

    invoke-direct {p0}, Lbd4;-><init>()V

    iput-object p1, p0, Lay0;->b:Landroid/bluetooth/BluetoothDevice;

    iput-object p2, p0, Lay0;->c:LtU;

    iput-object p3, p0, Lay0;->d:Lve5;

    iput-object p4, p0, Lay0;->e:LkX;

    iput-object p5, p0, Lay0;->f:LL46;

    iput-boolean p6, p0, Lay0;->g:Z

    iput-object p7, p0, Lay0;->h:Lxy0;

    return-void
.end method


# virtual methods
.method public b(Lio/reactivex/y;Ldd4;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;",
            "Ldd4;",
            ")V"
        }
    .end annotation

    new-instance v0, Lay0$a;

    invoke-direct {v0, p0, p2}, Lay0$a;-><init>(Lay0;Ldd4;)V

    invoke-virtual {p0}, Lay0;->e()Lio/reactivex/F;

    move-result-object v1

    invoke-virtual {p0}, Lay0;->g()Lio/reactivex/L;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/F;->i(Lio/reactivex/L;)Lio/reactivex/F;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/reactivex/F;->r(Lio/reactivex/functions/a;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {p1}, Lr51;->a(Lio/reactivex/y;)Lio/reactivex/observers/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->Z(Lio/reactivex/I;)Lio/reactivex/I;

    move-result-object v0

    check-cast v0, Lio/reactivex/observers/e;

    invoke-interface {p1, v0}, Lio/reactivex/y;->b(Lio/reactivex/disposables/c;)V

    iget-boolean p1, p0, Lay0;->g:Z

    if-eqz p1, :cond_0

    invoke-interface {p2}, Ldd4;->release()V

    :cond_0
    return-void
.end method

.method public c(Landroid/os/DeadObjectException;)Lcom/polidea/rxandroidble2/exceptions/BleException;
    .locals 3

    new-instance v0, Lcom/polidea/rxandroidble2/exceptions/BleDisconnectedException;

    iget-object v1, p0, Lay0;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-direct {v0, p1, v1, v2}, Lcom/polidea/rxandroidble2/exceptions/BleDisconnectedException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;I)V

    return-object v0
.end method

.method public d()Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;"
        }
    .end annotation

    new-instance v0, Lay0$e;

    invoke-direct {v0, p0}, Lay0$e;-><init>(Lay0;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;"
        }
    .end annotation

    new-instance v0, Lay0$d;

    invoke-direct {v0, p0}, Lay0$d;-><init>(Lay0;)V

    invoke-static {v0}, Lio/reactivex/F;->j(Lio/reactivex/J;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public f()Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;"
        }
    .end annotation

    new-instance v0, Lay0$c;

    invoke-direct {v0, p0}, Lay0$c;-><init>(Lay0;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lio/reactivex/L;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/L<",
            "Landroid/bluetooth/BluetoothGatt;",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;"
        }
    .end annotation

    new-instance v0, Lay0$b;

    invoke-direct {v0, p0}, Lay0$b;-><init>(Lay0;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ConnectOperation{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lay0;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LOx2;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", autoConnect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lay0;->g:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
