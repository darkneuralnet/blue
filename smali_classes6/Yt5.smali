.class public LYt5;
.super LnB5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LnB5<",
        "Lue5;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroid/bluetooth/BluetoothGatt;

.field public final g:LPx2;


# direct methods
.method public constructor <init>(Lve5;Landroid/bluetooth/BluetoothGatt;LPx2;LL46;)V
    .locals 1

    sget-object v0, LuU;->c:LuU;

    invoke-direct {p0, p2, p1, v0, p4}, LnB5;-><init>(Landroid/bluetooth/BluetoothGatt;Lve5;LuU;LL46;)V

    iput-object p2, p0, LYt5;->f:Landroid/bluetooth/BluetoothGatt;

    iput-object p3, p0, LYt5;->g:LPx2;

    return-void
.end method

.method public static synthetic g(Landroid/bluetooth/BluetoothGatt;)Lue5;
    .locals 0

    invoke-static {p0}, LYt5;->l(Landroid/bluetooth/BluetoothGatt;)Lue5;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroid/bluetooth/BluetoothGatt;Lio/reactivex/E;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LYt5;->n(Landroid/bluetooth/BluetoothGatt;Lio/reactivex/E;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(LYt5;Lue5;)V
    .locals 0

    invoke-direct {p0, p1}, LYt5;->k(Lue5;)V

    return-void
.end method

.method public static synthetic j(Landroid/bluetooth/BluetoothGatt;Ljava/lang/Long;)Lio/reactivex/F;
    .locals 0

    invoke-static {p0, p1}, LYt5;->m(Landroid/bluetooth/BluetoothGatt;Ljava/lang/Long;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method private synthetic k(Lue5;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LYt5;->g:LPx2;

    iget-object v1, p0, LYt5;->f:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LPx2;->m(Lue5;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic l(Landroid/bluetooth/BluetoothGatt;)Lue5;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, Lue5;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getServices()Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lue5;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static synthetic m(Landroid/bluetooth/BluetoothGatt;Ljava/lang/Long;)Lio/reactivex/F;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance p1, LXt5;

    invoke-direct {p1, p0}, LXt5;-><init>(Landroid/bluetooth/BluetoothGatt;)V

    invoke-static {p1}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Landroid/bluetooth/BluetoothGatt;Lio/reactivex/E;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGatt;->getServices()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Lcom/polidea/rxandroidble2/exceptions/BleGattCallbackTimeoutException;

    sget-object v0, LuU;->c:LuU;

    invoke-direct {p1, p0, v0}, Lcom/polidea/rxandroidble2/exceptions/BleGattCallbackTimeoutException;-><init>(Landroid/bluetooth/BluetoothGatt;LuU;)V

    invoke-static {p1}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p0

    return-object p0

    :cond_0
    const-wide/16 v0, 0x5

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2, p1}, Lio/reactivex/F;->g0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LWt5;

    invoke-direct {v0, p0}, LWt5;-><init>(Landroid/bluetooth/BluetoothGatt;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d(Lve5;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lve5;",
            ")",
            "Lio/reactivex/F<",
            "Lue5;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lve5;->h()Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LUt5;

    invoke-direct {v0, p0}, LUt5;-><init>(LYt5;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public e(Landroid/bluetooth/BluetoothGatt;)Z
    .locals 0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    move-result p1

    return p1
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
            "Lue5;",
            ">;"
        }
    .end annotation

    new-instance p2, LVt5;

    invoke-direct {p2, p1, p3}, LVt5;-><init>(Landroid/bluetooth/BluetoothGatt;Lio/reactivex/E;)V

    invoke-static {p2}, Lio/reactivex/F;->k(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServiceDiscoveryOperation{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, LnB5;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
