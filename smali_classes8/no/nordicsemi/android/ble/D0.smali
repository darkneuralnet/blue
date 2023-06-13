.class public final Lno/nordicsemi/android/ble/D0;
.super Lno/nordicsemi/android/ble/y0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lno/nordicsemi/android/ble/y0<",
        "LSS0;",
        ">;"
    }
.end annotation


# static fields
.field public static final z:LaT0;


# instance fields
.field public s:LaT0;

.field public final t:[B

.field public final u:I

.field public v:[B

.field public w:[B

.field public x:I

.field public y:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LbY0;

    invoke-direct {v0}, LbY0;-><init>()V

    sput-object v0, Lno/nordicsemi/android/ble/D0;->z:LaT0;

    return-void
.end method

.method public constructor <init>(Lno/nordicsemi/android/ble/u0$c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lno/nordicsemi/android/ble/D0;-><init>(Lno/nordicsemi/android/ble/u0$c;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    return-void
.end method

.method public constructor <init>(Lno/nordicsemi/android/ble/u0$c;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lno/nordicsemi/android/ble/y0;-><init>(Lno/nordicsemi/android/ble/u0$c;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    const/4 p1, 0x0

    iput p1, p0, Lno/nordicsemi/android/ble/D0;->x:I

    const/4 p2, 0x0

    iput-object p2, p0, Lno/nordicsemi/android/ble/D0;->t:[B

    iput p1, p0, Lno/nordicsemi/android/ble/D0;->u:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/D0;->y:Z

    return-void
.end method

.method public constructor <init>(Lno/nordicsemi/android/ble/u0$c;Landroid/bluetooth/BluetoothGattCharacteristic;[BIII)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lno/nordicsemi/android/ble/y0;-><init>(Lno/nordicsemi/android/ble/u0$c;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    const/4 p1, 0x0

    iput p1, p0, Lno/nordicsemi/android/ble/D0;->x:I

    iput-boolean p1, p0, Lno/nordicsemi/android/ble/D0;->y:Z

    invoke-static {p3, p4, p5}, LS70;->a([BII)[B

    move-result-object p1

    iput-object p1, p0, Lno/nordicsemi/android/ble/D0;->t:[B

    iput p6, p0, Lno/nordicsemi/android/ble/D0;->u:I

    return-void
.end method

.method public static synthetic I(Lno/nordicsemi/android/ble/D0;Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lno/nordicsemi/android/ble/D0;->R(Landroid/bluetooth/BluetoothDevice;[B)V

    return-void
.end method

.method public static synthetic J(Lno/nordicsemi/android/ble/D0;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lno/nordicsemi/android/ble/D0;->S(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private synthetic R(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 0

    return-void
.end method

.method private synthetic S(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    iget-object v0, p0, Lno/nordicsemi/android/ble/y0;->r:Ljava/lang/Object;

    if-eqz v0, :cond_0

    :try_start_0
    check-cast v0, LSS0;

    new-instance v1, Lno/nordicsemi/android/ble/data/Data;

    iget-object v2, p0, Lno/nordicsemi/android/ble/D0;->t:[B

    invoke-direct {v1, v2}, Lno/nordicsemi/android/ble/data/Data;-><init>([B)V

    invoke-interface {v0, p1, v1}, LSS0;->a(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v0, Lno/nordicsemi/android/ble/u0;->q:Ljava/lang/String;

    const-string v1, "Exception in Value callback"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/D0;->U(Landroid/os/Handler;)Lno/nordicsemi/android/ble/D0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic G(LQI4;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/D0;->V(LQI4;)Lno/nordicsemi/android/ble/D0;

    move-result-object p1

    return-object p1
.end method

.method public K(LkG;)Lno/nordicsemi/android/ble/D0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->f(LkG;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public L(LyT5;)Lno/nordicsemi/android/ble/D0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->j(LyT5;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public M(LDj1;)Lno/nordicsemi/android/ble/D0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->l(LDj1;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public N(I)[B
    .locals 6

    iget-object v0, p0, Lno/nordicsemi/android/ble/D0;->s:LaT0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_6

    iget-object v3, p0, Lno/nordicsemi/android/ble/D0;->t:[B

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    iget v4, p0, Lno/nordicsemi/android/ble/D0;->u:I

    const/4 v5, 0x4

    if-eq v4, v5, :cond_1

    add-int/lit8 p1, p1, -0x3

    goto :goto_0

    :cond_1
    add-int/lit8 p1, p1, -0xc

    :goto_0
    iget-object v4, p0, Lno/nordicsemi/android/ble/D0;->w:[B

    if-nez v4, :cond_2

    iget v4, p0, Lno/nordicsemi/android/ble/D0;->x:I

    invoke-interface {v0, v3, v4, p1}, LaT0;->a([BII)[B

    move-result-object v4

    :cond_2
    if-eqz v4, :cond_3

    iget-object v0, p0, Lno/nordicsemi/android/ble/D0;->s:LaT0;

    iget-object v3, p0, Lno/nordicsemi/android/ble/D0;->t:[B

    iget v5, p0, Lno/nordicsemi/android/ble/D0;->x:I

    add-int/2addr v5, v2

    invoke-interface {v0, v3, v5, p1}, LaT0;->a([BII)[B

    move-result-object p1

    iput-object p1, p0, Lno/nordicsemi/android/ble/D0;->w:[B

    :cond_3
    iget-object p1, p0, Lno/nordicsemi/android/ble/D0;->w:[B

    if-nez p1, :cond_4

    iput-boolean v2, p0, Lno/nordicsemi/android/ble/D0;->y:Z

    :cond_4
    iput-object v4, p0, Lno/nordicsemi/android/ble/D0;->v:[B

    if-eqz v4, :cond_5

    goto :goto_1

    :cond_5
    new-array v4, v1, [B

    :goto_1
    return-object v4

    :cond_6
    :goto_2
    iput-boolean v2, p0, Lno/nordicsemi/android/ble/D0;->y:Z

    iget-object p1, p0, Lno/nordicsemi/android/ble/D0;->t:[B

    iput-object p1, p0, Lno/nordicsemi/android/ble/D0;->v:[B

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    new-array p1, v1, [B

    :goto_3
    return-object p1
.end method

.method public O()I
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/ble/D0;->u:I

    return v0
.end method

.method public P()Z
    .locals 1

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/D0;->y:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public Q(Lj72;)Lno/nordicsemi/android/ble/D0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->m(Lj72;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public T(Landroid/bluetooth/BluetoothDevice;[B)Z
    .locals 2

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    new-instance v1, LlH6;

    invoke-direct {v1, p0, p1, p2}, LlH6;-><init>(Lno/nordicsemi/android/ble/D0;Landroid/bluetooth/BluetoothDevice;[B)V

    invoke-interface {v0, v1}, LL80;->b(Ljava/lang/Runnable;)V

    iget v0, p0, Lno/nordicsemi/android/ble/D0;->x:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lno/nordicsemi/android/ble/D0;->x:I

    iget-boolean v0, p0, Lno/nordicsemi/android/ble/D0;->y:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0;->b:LL80;

    new-instance v1, LmH6;

    invoke-direct {v1, p0, p1}, LmH6;-><init>(Lno/nordicsemi/android/ble/D0;Landroid/bluetooth/BluetoothDevice;)V

    invoke-interface {v0, v1}, LL80;->b(Ljava/lang/Runnable;)V

    :cond_0
    iget-object p1, p0, Lno/nordicsemi/android/ble/D0;->v:[B

    invoke-static {p2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public U(Landroid/os/Handler;)Lno/nordicsemi/android/ble/D0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->F(Landroid/os/Handler;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public V(LQI4;)Lno/nordicsemi/android/ble/D0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/u0;->G(LQI4;)Lno/nordicsemi/android/ble/u0;

    return-object p0
.end method

.method public W()Lno/nordicsemi/android/ble/D0;
    .locals 1

    sget-object v0, Lno/nordicsemi/android/ble/D0;->z:LaT0;

    iput-object v0, p0, Lno/nordicsemi/android/ble/D0;->s:LaT0;

    return-object p0
.end method

.method public X(LSS0;)Lno/nordicsemi/android/ble/D0;
    .locals 0

    invoke-super {p0, p1}, Lno/nordicsemi/android/ble/y0;->H(Ljava/lang/Object;)Lno/nordicsemi/android/ble/y0;

    return-object p0
.end method

.method public bridge synthetic j(LyT5;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/D0;->L(LyT5;)Lno/nordicsemi/android/ble/D0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(LDj1;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/D0;->M(LDj1;)Lno/nordicsemi/android/ble/D0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Lj72;)Lno/nordicsemi/android/ble/u0;
    .locals 0

    invoke-virtual {p0, p1}, Lno/nordicsemi/android/ble/D0;->Q(Lj72;)Lno/nordicsemi/android/ble/D0;

    move-result-object p1

    return-object p1
.end method
