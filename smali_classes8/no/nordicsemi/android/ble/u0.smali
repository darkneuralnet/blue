.class public abstract Lno/nordicsemi/android/ble/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lno/nordicsemi/android/ble/u0$b;,
        Lno/nordicsemi/android/ble/u0$c;
    }
.end annotation


# static fields
.field public static final q:Ljava/lang/String; = "u0"


# instance fields
.field public a:LQI4;

.field public b:LL80;

.field public final c:Landroid/os/ConditionVariable;

.field public final d:Lno/nordicsemi/android/ble/u0$c;

.field public final e:Landroid/bluetooth/BluetoothGattCharacteristic;

.field public final f:Landroid/bluetooth/BluetoothGattDescriptor;

.field public g:LkG;

.field public h:LyT5;

.field public i:LDj1;

.field public j:Lj72;

.field public k:LkG;

.field public l:LyT5;

.field public m:LDj1;

.field public n:Z

.field public o:Z

.field public p:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lno/nordicsemi/android/ble/u0$c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/nordicsemi/android/ble/u0;->d:Lno/nordicsemi/android/ble/u0$c;

    const/4 p1, 0x0

    iput-object p1, p0, Lno/nordicsemi/android/ble/u0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput-object p1, p0, Lno/nordicsemi/android/ble/u0;->f:Landroid/bluetooth/BluetoothGattDescriptor;

    new-instance p1, Landroid/os/ConditionVariable;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Landroid/os/ConditionVariable;-><init>(Z)V

    iput-object p1, p0, Lno/nordicsemi/android/ble/u0;->c:Landroid/os/ConditionVariable;

    return-void
.end method

.method public constructor <init>(Lno/nordicsemi/android/ble/u0$c;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/nordicsemi/android/ble/u0;->d:Lno/nordicsemi/android/ble/u0$c;

    iput-object p2, p0, Lno/nordicsemi/android/ble/u0;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    const/4 p1, 0x0

    iput-object p1, p0, Lno/nordicsemi/android/ble/u0;->f:Landroid/bluetooth/BluetoothGattDescriptor;

    new-instance p1, Landroid/os/ConditionVariable;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/os/ConditionVariable;-><init>(Z)V

    iput-object p1, p0, Lno/nordicsemi/android/ble/u0;->c:Landroid/os/ConditionVariable;

    return-void
.end method

.method public static E()Lno/nordicsemi/android/ble/x0;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lno/nordicsemi/android/ble/x0;

    sget-object v1, Lno/nordicsemi/android/ble/u0$c;->g:Lno/nordicsemi/android/ble/u0$c;

    invoke-direct {v0, v1}, Lno/nordicsemi/android/ble/x0;-><init>(Lno/nordicsemi/android/ble/u0$c;)V

    return-object v0
.end method

.method public static synthetic a(Lno/nordicsemi/android/ble/u0;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lno/nordicsemi/android/ble/u0;->p(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic b(Lno/nordicsemi/android/ble/u0;)V
    .locals 0

    invoke-direct {p0}, Lno/nordicsemi/android/ble/u0;->o()V

    return-void
.end method

.method public static synthetic c(Lno/nordicsemi/android/ble/u0;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lno/nordicsemi/android/ble/u0;->n(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic d(Lno/nordicsemi/android/ble/u0;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lno/nordicsemi/android/ble/u0;->q(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static e()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot execute synchronous operation from the UI thread."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static g(Landroid/bluetooth/BluetoothDevice;)Lno/nordicsemi/android/ble/n0;
    .locals 2

    new-instance v0, Lno/nordicsemi/android/ble/n0;

    sget-object v1, Lno/nordicsemi/android/ble/u0$c;->c:Lno/nordicsemi/android/ble/u0$c;

    invoke-direct {v0, v1, p0}, Lno/nordicsemi/android/ble/n0;-><init>(Lno/nordicsemi/android/ble/u0$c;Landroid/bluetooth/BluetoothDevice;)V

    return-object v0
.end method

.method public static h()Lno/nordicsemi/android/ble/x0;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lno/nordicsemi/android/ble/x0;

    sget-object v1, Lno/nordicsemi/android/ble/u0$c;->e:Lno/nordicsemi/android/ble/u0$c;

    invoke-direct {v0, v1}, Lno/nordicsemi/android/ble/x0;-><init>(Lno/nordicsemi/android/ble/u0$c;)V

    return-object v0
.end method

.method public static i()Lno/nordicsemi/android/ble/p0;
    .locals 2

    new-instance v0, Lno/nordicsemi/android/ble/p0;

    sget-object v1, Lno/nordicsemi/android/ble/u0$c;->d:Lno/nordicsemi/android/ble/u0$c;

    invoke-direct {v0, v1}, Lno/nordicsemi/android/ble/p0;-><init>(Lno/nordicsemi/android/ble/u0$c;)V

    return-object v0
.end method

.method private synthetic n(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->i:LDj1;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0, p1, p2}, LDj1;->a(Landroid/bluetooth/BluetoothDevice;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object p2, Lno/nordicsemi/android/ble/u0;->q:Ljava/lang/String;

    const-string v0, "Exception in Fail callback"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method

.method private synthetic o()V
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->j:Lj72;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0}, Lj72;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lno/nordicsemi/android/ble/u0;->q:Ljava/lang/String;

    const-string v2, "Exception in Invalid Request callback"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method

.method private synthetic p(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->g:LkG;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0, p1}, LkG;->a(Landroid/bluetooth/BluetoothDevice;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v0, Lno/nordicsemi/android/ble/u0;->q:Ljava/lang/String;

    const-string v1, "Exception in Before callback"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method

.method private synthetic q(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->h:LyT5;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0, p1}, LyT5;->c(Landroid/bluetooth/BluetoothDevice;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v0, Lno/nordicsemi/android/ble/u0;->q:Ljava/lang/String;

    const-string v1, "Exception in Success callback"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public static r()Lno/nordicsemi/android/ble/x0;
    .locals 2

    new-instance v0, Lno/nordicsemi/android/ble/x0;

    sget-object v1, Lno/nordicsemi/android/ble/u0$c;->p:Lno/nordicsemi/android/ble/u0$c;

    invoke-direct {v0, v1}, Lno/nordicsemi/android/ble/x0;-><init>(Lno/nordicsemi/android/ble/u0$c;)V

    return-object v0
.end method

.method public static s()Lno/nordicsemi/android/ble/x0;
    .locals 2

    new-instance v0, Lno/nordicsemi/android/ble/x0;

    sget-object v1, Lno/nordicsemi/android/ble/u0$c;->n:Lno/nordicsemi/android/ble/u0$c;

    invoke-direct {v0, v1}, Lno/nordicsemi/android/ble/x0;-><init>(Lno/nordicsemi/android/ble/u0$c;)V

    return-object v0
.end method

.method public static t()Lno/nordicsemi/android/ble/D0;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lno/nordicsemi/android/ble/D0;

    sget-object v1, Lno/nordicsemi/android/ble/u0$c;->C:Lno/nordicsemi/android/ble/u0$c;

    invoke-direct {v0, v1}, Lno/nordicsemi/android/ble/D0;-><init>(Lno/nordicsemi/android/ble/u0$c;)V

    return-object v0
.end method

.method public static u(Landroid/bluetooth/BluetoothGattCharacteristic;)Lno/nordicsemi/android/ble/D0;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lno/nordicsemi/android/ble/D0;

    sget-object v1, Lno/nordicsemi/android/ble/u0$c;->q:Lno/nordicsemi/android/ble/u0$c;

    invoke-direct {v0, v1, p0}, Lno/nordicsemi/android/ble/D0;-><init>(Lno/nordicsemi/android/ble/u0$c;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    return-object v0
.end method

.method public static v()Lno/nordicsemi/android/ble/D0;
    .locals 2

    new-instance v0, Lno/nordicsemi/android/ble/D0;

    sget-object v1, Lno/nordicsemi/android/ble/u0$c;->E:Lno/nordicsemi/android/ble/u0$c;

    invoke-direct {v0, v1}, Lno/nordicsemi/android/ble/D0;-><init>(Lno/nordicsemi/android/ble/u0$c;)V

    return-object v0
.end method

.method public static w()Lno/nordicsemi/android/ble/x0;
    .locals 2

    new-instance v0, Lno/nordicsemi/android/ble/x0;

    sget-object v1, Lno/nordicsemi/android/ble/u0$c;->o:Lno/nordicsemi/android/ble/u0$c;

    invoke-direct {v0, v1}, Lno/nordicsemi/android/ble/x0;-><init>(Lno/nordicsemi/android/ble/u0$c;)V

    return-object v0
.end method

.method public static x()Lno/nordicsemi/android/ble/s0;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lno/nordicsemi/android/ble/s0;

    sget-object v1, Lno/nordicsemi/android/ble/u0$c;->B:Lno/nordicsemi/android/ble/u0$c;

    invoke-direct {v0, v1}, Lno/nordicsemi/android/ble/s0;-><init>(Lno/nordicsemi/android/ble/u0$c;)V

    return-object v0
.end method

.method public static y(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Lno/nordicsemi/android/ble/D0;
    .locals 8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v7, Lno/nordicsemi/android/ble/D0;

    sget-object v1, Lno/nordicsemi/android/ble/u0$c;->h:Lno/nordicsemi/android/ble/u0$c;

    const/4 v4, 0x0

    if-eqz p1, :cond_0

    array-length v0, p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v5, v0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getWriteType()I

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    move v6, v0

    move-object v0, v7

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Lno/nordicsemi/android/ble/D0;-><init>(Lno/nordicsemi/android/ble/u0$c;Landroid/bluetooth/BluetoothGattCharacteristic;[BIII)V

    return-object v7
.end method

.method public static z(Landroid/bluetooth/BluetoothGattCharacteristic;[BI)Lno/nordicsemi/android/ble/D0;
    .locals 8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v7, Lno/nordicsemi/android/ble/D0;

    sget-object v1, Lno/nordicsemi/android/ble/u0$c;->h:Lno/nordicsemi/android/ble/u0$c;

    const/4 v4, 0x0

    if-eqz p1, :cond_0

    array-length v0, p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v5, v0

    move-object v0, v7

    move-object v2, p0

    move-object v3, p1

    move v6, p2

    invoke-direct/range {v0 .. v6}, Lno/nordicsemi/android/ble/D0;-><init>(Lno/nordicsemi/android/ble/u0$c;Landroid/bluetooth/BluetoothGattCharacteristic;[BIII)V

    return-object v7
.end method


# virtual methods
.method public A(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 2

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/u0;->p:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/u0;->p:Z

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->m:LDj1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, LDj1;->a(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    new-instance v1, LiI4;

    invoke-direct {v1, p0, p1, p2}, LiI4;-><init>(Lno/nordicsemi/android/ble/u0;Landroid/bluetooth/BluetoothDevice;I)V

    invoke-interface {v0, v1}, LL80;->b(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public B()V
    .locals 2

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/u0;->p:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/u0;->p:Z

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    new-instance v1, LlI4;

    invoke-direct {v1, p0}, LlI4;-><init>(Lno/nordicsemi/android/ble/u0;)V

    invoke-interface {v0, v1}, LL80;->b(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public C(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/u0;->o:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/u0;->o:Z

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->k:LkG;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LkG;->a(Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    new-instance v1, LkI4;

    invoke-direct {v1, p0, p1}, LkI4;-><init>(Lno/nordicsemi/android/ble/u0;Landroid/bluetooth/BluetoothDevice;)V

    invoke-interface {v0, v1}, LL80;->b(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public D(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 3

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/u0;->p:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lno/nordicsemi/android/ble/u0;->p:Z

    iget-object v1, p0, Lno/nordicsemi/android/ble/u0;->l:LyT5;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, LyT5;->c(Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
    iget-object v1, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    new-instance v2, LjI4;

    invoke-direct {v2, p0, p1}, LjI4;-><init>(Lno/nordicsemi/android/ble/u0;Landroid/bluetooth/BluetoothDevice;)V

    invoke-interface {v1, v2}, LL80;->b(Ljava/lang/Runnable;)V

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;
    .locals 1

    new-instance v0, Lno/nordicsemi/android/ble/u0$a;

    invoke-direct {v0, p0, p1}, Lno/nordicsemi/android/ble/u0$a;-><init>(Lno/nordicsemi/android/ble/u0;Landroid/os/Handler;)V

    iput-object v0, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    return-object p0
.end method

.method public G(LQI4;)Lno/nordicsemi/android/ble/u0;
    .locals 1

    iput-object p1, p0, Lno/nordicsemi/android/ble/u0;->a:LQI4;

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    if-nez v0, :cond_0

    iput-object p1, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    :cond_0
    return-object p0
.end method

.method public f(LkG;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/u0;->g:LkG;

    return-object p0
.end method

.method public j(LyT5;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/u0;->h:LyT5;

    return-object p0
.end method

.method public k()V
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->a:LQI4;

    invoke-virtual {v0, p0}, LQI4;->e(Lno/nordicsemi/android/ble/u0;)V

    return-void
.end method

.method public l(LDj1;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/u0;->i:LDj1;

    return-object p0
.end method

.method public m(Lj72;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/u0;->j:Lj72;

    return-object p0
.end method
