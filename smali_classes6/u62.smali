.class public Lu62;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LGk5;

.field public final b:LZ92;


# direct methods
.method public constructor <init>(LGk5;LZ92;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu62;->a:LGk5;

    iput-object p2, p0, Lu62;->b:LZ92;

    return-void
.end method

.method public static d(I)Lkj5;
    .locals 2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    const/4 v1, 0x4

    if-eq p0, v1, :cond_0

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v0, v1

    const-string p0, "Unknown callback type %d -> check android.bluetooth.le.ScanSettings"

    invoke-static {p0, v0}, Lye5;->r(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p0, Lkj5;->g:Lkj5;

    return-object p0

    :cond_0
    sget-object p0, Lkj5;->d:Lkj5;

    return-object p0

    :cond_1
    sget-object p0, Lkj5;->c:Lkj5;

    return-object p0

    :cond_2
    sget-object p0, Lkj5;->b:Lkj5;

    return-object p0
.end method


# virtual methods
.method public a(ILandroid/bluetooth/le/ScanResult;)Lxe5;
    .locals 9

    new-instance v5, LFk5;

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object v0

    iget-object v1, p0, Lu62;->a:LGk5;

    invoke-direct {v5, v0, v1}, LFk5;-><init>(Landroid/bluetooth/le/ScanRecord;LGk5;)V

    new-instance v8, Lxe5;

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getRssi()I

    move-result v2

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getTimestampNanos()J

    move-result-wide v3

    invoke-static {p1}, Lu62;->d(I)Lkj5;

    move-result-object v6

    iget-object p1, p0, Lu62;->b:LZ92;

    invoke-interface {p1, p2}, LZ92;->a(Landroid/bluetooth/le/ScanResult;)LY92;

    move-result-object v7

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lxe5;-><init>(Landroid/bluetooth/BluetoothDevice;IJLCk5;Lkj5;LY92;)V

    return-object v8
.end method

.method public b(Landroid/bluetooth/BluetoothDevice;I[B)Lxe5;
    .locals 9

    iget-object v0, p0, Lu62;->a:LGk5;

    invoke-virtual {v0, p3}, LGk5;->c([B)LCk5;

    move-result-object v6

    new-instance p3, Lxe5;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sget-object v7, Lkj5;->f:Lkj5;

    sget-object v8, LY92;->b:LY92;

    move-object v1, p3

    move-object v2, p1

    move v3, p2

    invoke-direct/range {v1 .. v8}, Lxe5;-><init>(Landroid/bluetooth/BluetoothDevice;IJLCk5;Lkj5;LY92;)V

    return-object p3
.end method

.method public c(Landroid/bluetooth/le/ScanResult;)Lxe5;
    .locals 9

    new-instance v5, LFk5;

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object v0

    iget-object v1, p0, Lu62;->a:LGk5;

    invoke-direct {v5, v0, v1}, LFk5;-><init>(Landroid/bluetooth/le/ScanRecord;LGk5;)V

    new-instance v8, Lxe5;

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getRssi()I

    move-result v2

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getTimestampNanos()J

    move-result-wide v3

    sget-object v6, Lkj5;->e:Lkj5;

    iget-object v0, p0, Lu62;->b:LZ92;

    invoke-interface {v0, p1}, LZ92;->a(Landroid/bluetooth/le/ScanResult;)LY92;

    move-result-object v7

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lxe5;-><init>(Landroid/bluetooth/BluetoothDevice;IJLCk5;Lkj5;LY92;)V

    return-object v8
.end method
