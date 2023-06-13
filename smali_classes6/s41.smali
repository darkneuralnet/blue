.class public Ls41;
.super Lbd4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls41$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbd4<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lve5;

.field public final c:LkX;

.field public final d:Ljava/lang/String;

.field public final e:Landroid/bluetooth/BluetoothManager;

.field public final f:Lio/reactivex/E;

.field public final g:LL46;

.field public final h:Lxy0;


# direct methods
.method public constructor <init>(Lve5;LkX;Ljava/lang/String;Landroid/bluetooth/BluetoothManager;Lio/reactivex/E;LL46;Lxy0;)V
    .locals 0

    invoke-direct {p0}, Lbd4;-><init>()V

    iput-object p1, p0, Ls41;->b:Lve5;

    iput-object p2, p0, Ls41;->c:LkX;

    iput-object p3, p0, Ls41;->d:Ljava/lang/String;

    iput-object p4, p0, Ls41;->e:Landroid/bluetooth/BluetoothManager;

    iput-object p5, p0, Ls41;->f:Lio/reactivex/E;

    iput-object p6, p0, Ls41;->g:LL46;

    iput-object p7, p0, Ls41;->h:Lxy0;

    return-void
.end method


# virtual methods
.method public b(Lio/reactivex/y;Ldd4;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "Ljava/lang/Void;",
            ">;",
            "Ldd4;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Ls41;->h:Lxy0;

    sget-object v1, Lke5$a;->f:Lke5$a;

    invoke-interface {v0, v1}, Lxy0;->a(Lke5$a;)V

    iget-object v0, p0, Ls41;->c:LkX;

    invoke-virtual {v0}, LkX;->a()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Disconnect operation has been executed but GATT instance was null - considering disconnected."

    invoke-static {v1, v0}, Lye5;->r(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Ls41;->d(Lio/reactivex/j;Ldd4;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Ls41;->f(Landroid/bluetooth/BluetoothGatt;)Lio/reactivex/F;

    move-result-object v0

    iget-object v1, p0, Ls41;->f:Lio/reactivex/E;

    invoke-virtual {v0, v1}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Ls41$a;

    invoke-direct {v1, p0, p1, p2}, Ls41$a;-><init>(Ls41;Lio/reactivex/y;Ldd4;)V

    invoke-virtual {v0, v1}, Lio/reactivex/F;->a(Lio/reactivex/I;)V

    :goto_0
    return-void
.end method

.method public c(Landroid/os/DeadObjectException;)Lcom/polidea/rxandroidble2/exceptions/BleException;
    .locals 3

    new-instance v0, Lcom/polidea/rxandroidble2/exceptions/BleDisconnectedException;

    iget-object v1, p0, Ls41;->d:Ljava/lang/String;

    const/4 v2, -0x1

    invoke-direct {v0, p1, v1, v2}, Lcom/polidea/rxandroidble2/exceptions/BleDisconnectedException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;I)V

    return-object v0
.end method

.method public d(Lio/reactivex/j;Ldd4;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/j<",
            "Ljava/lang/Void;",
            ">;",
            "Ldd4;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Ls41;->h:Lxy0;

    sget-object v1, Lke5$a;->e:Lke5$a;

    invoke-interface {v0, v1}, Lxy0;->a(Lke5$a;)V

    invoke-interface {p2}, Ldd4;->release()V

    invoke-interface {p1}, Lio/reactivex/j;->onComplete()V

    return-void
.end method

.method public final e(Landroid/bluetooth/BluetoothGatt;)Lio/reactivex/F;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothGatt;",
            ")",
            "Lio/reactivex/F<",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;"
        }
    .end annotation

    new-instance v0, Ls41$b;

    iget-object v1, p0, Ls41;->b:Lve5;

    iget-object v2, p0, Ls41;->f:Lio/reactivex/E;

    invoke-direct {v0, p1, v1, v2}, Ls41$b;-><init>(Landroid/bluetooth/BluetoothGatt;Lve5;Lio/reactivex/E;)V

    iget-object v1, p0, Ls41;->g:LL46;

    iget-wide v2, v1, LL46;->a:J

    iget-object v4, v1, LL46;->b:Ljava/util/concurrent/TimeUnit;

    iget-object v5, v1, LL46;->c:Lio/reactivex/E;

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    move-wide v1, v2

    move-object v3, v4

    move-object v4, v5

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Lio/reactivex/F;->c0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final f(Landroid/bluetooth/BluetoothGatt;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothGatt;",
            ")",
            "Lio/reactivex/F<",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ls41;->g(Landroid/bluetooth/BluetoothGatt;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Ls41;->e(Landroid/bluetooth/BluetoothGatt;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final g(Landroid/bluetooth/BluetoothGatt;)Z
    .locals 2

    iget-object v0, p0, Ls41;->e:Landroid/bluetooth/BluetoothManager;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    const/4 v1, 0x7

    invoke-virtual {v0, p1, v1}, Landroid/bluetooth/BluetoothManager;->getConnectionState(Landroid/bluetooth/BluetoothDevice;I)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DisconnectOperation{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls41;->d:Ljava/lang/String;

    invoke-static {v1}, LOx2;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
