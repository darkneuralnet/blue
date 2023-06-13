.class public abstract LnB5;
.super Lbd4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lbd4<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Landroid/bluetooth/BluetoothGatt;

.field public final c:Lve5;

.field public final d:LuU;

.field public final e:LL46;


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothGatt;Lve5;LuU;LL46;)V
    .locals 0

    invoke-direct {p0}, Lbd4;-><init>()V

    iput-object p1, p0, LnB5;->b:Landroid/bluetooth/BluetoothGatt;

    iput-object p2, p0, LnB5;->c:Lve5;

    iput-object p3, p0, LnB5;->d:LuU;

    iput-object p4, p0, LnB5;->e:LL46;

    return-void
.end method


# virtual methods
.method public final b(Lio/reactivex/y;Ldd4;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "TT;>;",
            "Ldd4;",
            ")V"
        }
    .end annotation

    new-instance v0, Led4;

    invoke-direct {v0, p1, p2}, Led4;-><init>(Lio/reactivex/y;Ldd4;)V

    iget-object p1, p0, LnB5;->c:Lve5;

    invoke-virtual {p0, p1}, LnB5;->d(Lve5;)Lio/reactivex/F;

    move-result-object v1

    iget-object p1, p0, LnB5;->e:LL46;

    iget-wide v2, p1, LL46;->a:J

    iget-object v4, p1, LL46;->b:Ljava/util/concurrent/TimeUnit;

    iget-object v5, p1, LL46;->c:Lio/reactivex/E;

    iget-object p1, p0, LnB5;->b:Landroid/bluetooth/BluetoothGatt;

    iget-object p2, p0, LnB5;->c:Lve5;

    invoke-virtual {p0, p1, p2, v5}, LnB5;->f(Landroid/bluetooth/BluetoothGatt;Lve5;Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v6

    invoke-virtual/range {v1 .. v6}, Lio/reactivex/F;->c0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->k0()Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/D;)V

    iget-object p1, p0, LnB5;->b:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {p0, p1}, LnB5;->e(Landroid/bluetooth/BluetoothGatt;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, Led4;->cancel()V

    new-instance p1, Lcom/polidea/rxandroidble2/exceptions/BleGattCannotStartException;

    iget-object p2, p0, LnB5;->b:Landroid/bluetooth/BluetoothGatt;

    iget-object v1, p0, LnB5;->d:LuU;

    invoke-direct {p1, p2, v1}, Lcom/polidea/rxandroidble2/exceptions/BleGattCannotStartException;-><init>(Landroid/bluetooth/BluetoothGatt;LuU;)V

    invoke-virtual {v0, p1}, Led4;->onError(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public c(Landroid/os/DeadObjectException;)Lcom/polidea/rxandroidble2/exceptions/BleException;
    .locals 3

    new-instance v0, Lcom/polidea/rxandroidble2/exceptions/BleDisconnectedException;

    iget-object v1, p0, LnB5;->b:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-direct {v0, p1, v1, v2}, Lcom/polidea/rxandroidble2/exceptions/BleDisconnectedException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;I)V

    return-object v0
.end method

.method public abstract d(Lve5;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lve5;",
            ")",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract e(Landroid/bluetooth/BluetoothGatt;)Z
.end method

.method public f(Landroid/bluetooth/BluetoothGatt;Lve5;Lio/reactivex/E;)Lio/reactivex/F;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothGatt;",
            "Lve5;",
            "Lio/reactivex/E;",
            ")",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    new-instance p1, Lcom/polidea/rxandroidble2/exceptions/BleGattCallbackTimeoutException;

    iget-object p2, p0, LnB5;->b:Landroid/bluetooth/BluetoothGatt;

    iget-object p3, p0, LnB5;->d:LuU;

    invoke-direct {p1, p2, p3}, Lcom/polidea/rxandroidble2/exceptions/BleGattCallbackTimeoutException;-><init>(Landroid/bluetooth/BluetoothGatt;LuU;)V

    invoke-static {p1}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LnB5;->b:Landroid/bluetooth/BluetoothGatt;

    invoke-static {v0}, LOx2;->c(Landroid/bluetooth/BluetoothGatt;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
