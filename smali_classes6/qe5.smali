.class public Lqe5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne5;


# instance fields
.field public final a:Landroid/bluetooth/BluetoothDevice;

.field public final b:LGy0;

.field public final c:LAG;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAG<",
            "Lke5$a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lvi0;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;LGy0;LAG;Lvi0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "LGy0;",
            "LAG<",
            "Lke5$a;",
            ">;",
            "Lvi0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lqe5;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lqe5;->a:Landroid/bluetooth/BluetoothDevice;

    iput-object p2, p0, Lqe5;->b:LGy0;

    iput-object p3, p0, Lqe5;->c:LAG;

    iput-object p4, p0, Lqe5;->d:Lvi0;

    return-void
.end method

.method public static synthetic f(Lqe5;)V
    .locals 0

    invoke-direct {p0}, Lqe5;->j()V

    return-void
.end method

.method public static synthetic g(Lqe5;Lwy0;)Lio/reactivex/B;
    .locals 0

    invoke-direct {p0, p1}, Lqe5;->k(Lwy0;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method private synthetic j()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lqe5;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method private synthetic k(Lwy0;)Lio/reactivex/B;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lqe5;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqe5;->b:LGy0;

    invoke-interface {v0, p1}, LGy0;->a(Lwy0;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, Lpe5;

    invoke-direct {v0, p0}, Lpe5;-><init>(Lqe5;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doFinally(Lio/reactivex/functions/a;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/polidea/rxandroidble2/exceptions/BleAlreadyConnectedException;

    iget-object v0, p0, Lqe5;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/polidea/rxandroidble2/exceptions/BleAlreadyConnectedException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Z)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lio/reactivex/Observable<",
            "Lke5;",
            ">;"
        }
    .end annotation

    new-instance v0, Lwy0$a;

    invoke-direct {v0}, Lwy0$a;-><init>()V

    invoke-virtual {v0, p1}, Lwy0$a;->b(Z)Lwy0$a;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lwy0$a;->d(Z)Lwy0$a;

    move-result-object p1

    invoke-virtual {p1}, Lwy0$a;->a()Lwy0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqe5;->h(Lwy0;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public b()Lke5$a;
    .locals 1

    iget-object v0, p0, Lqe5;->c:LAG;

    invoke-virtual {v0}, LAG;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lke5$a;

    return-object v0
.end method

.method public c(ZLK46;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LK46;",
            ")",
            "Lio/reactivex/Observable<",
            "Lke5;",
            ">;"
        }
    .end annotation

    new-instance v0, Lwy0$a;

    invoke-direct {v0}, Lwy0$a;-><init>()V

    invoke-virtual {v0, p1}, Lwy0$a;->b(Z)Lwy0$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lwy0$a;->c(LK46;)Lwy0$a;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lwy0$a;->d(Z)Lwy0$a;

    move-result-object p1

    invoke-virtual {p1}, Lwy0$a;->a()Lwy0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqe5;->h(Lwy0;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public d()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lqe5;->a:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqe5;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lqe5;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lqe5;

    iget-object v0, p0, Lqe5;->a:Landroid/bluetooth/BluetoothDevice;

    iget-object p1, p1, Lqe5;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothDevice;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lqe5;->i(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h(Lwy0;)Lio/reactivex/Observable;
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

    new-instance v0, Loe5;

    invoke-direct {v0, p0, p1}, Loe5;-><init>(Lqe5;Lwy0;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lqe5;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i(Z)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lqe5;->d:Lvi0;

    invoke-virtual {p1}, Lvi0;->a()Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "[NO BLUETOOTH_CONNECT PERMISSION]"

    return-object p1

    :cond_0
    iget-object p1, p0, Lqe5;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RxBleDeviceImpl{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqe5;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LOx2;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lqe5;->i(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
