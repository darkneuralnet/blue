.class public LEj6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/lang/String; = "Ej6"


# instance fields
.field public a:LQS0;

.field public b:LbT0;

.field public c:LL80;

.field public d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LL80;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LEj6;->d:I

    iput-object p1, p0, LEj6;->c:LL80;

    return-void
.end method

.method public static synthetic a(LQS0;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    .locals 0

    invoke-static {p0, p1, p2}, LEj6;->c(LQS0;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V

    return-void
.end method

.method public static synthetic c(LQS0;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    .locals 0

    :try_start_0
    invoke-interface {p0, p1, p2}, LQS0;->b(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    sget-object p1, LEj6;->e:Ljava/lang/String;

    const-string p2, "Exception in Value callback"

    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LEj6;->a:LQS0;

    iput-object v0, p0, LEj6;->b:LbT0;

    const/4 v0, 0x0

    iput v0, p0, LEj6;->d:I

    return-void
.end method

.method public d([B)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public e()V
    .locals 0

    invoke-virtual {p0}, LEj6;->b()V

    return-void
.end method

.method public f(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 3

    iget-object v0, p0, LEj6;->a:LQS0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lno/nordicsemi/android/ble/data/Data;

    invoke-direct {v1, p2}, Lno/nordicsemi/android/ble/data/Data;-><init>([B)V

    iget-object p2, p0, LEj6;->c:LL80;

    new-instance v2, LDj6;

    invoke-direct {v2, v0, p1, v1}, LDj6;-><init>(LQS0;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V

    invoke-interface {p2, v2}, LL80;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g(Landroid/os/Handler;)LEj6;
    .locals 1

    new-instance v0, LEj6$a;

    invoke-direct {v0, p0, p1}, LEj6$a;-><init>(LEj6;Landroid/os/Handler;)V

    iput-object v0, p0, LEj6;->c:LL80;

    return-object p0
.end method

.method public h(LQS0;)LEj6;
    .locals 0

    iput-object p1, p0, LEj6;->a:LQS0;

    return-object p0
.end method
