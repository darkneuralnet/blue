.class public Lxe5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVk5;


# instance fields
.field public final a:Landroid/bluetooth/BluetoothDevice;

.field public final b:I

.field public final c:J

.field public final d:LCk5;

.field public final e:Lkj5;

.field public final f:LY92;


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;IJLCk5;Lkj5;LY92;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxe5;->a:Landroid/bluetooth/BluetoothDevice;

    iput p2, p0, Lxe5;->b:I

    iput-wide p3, p0, Lxe5;->c:J

    iput-object p5, p0, Lxe5;->d:LCk5;

    iput-object p6, p0, Lxe5;->e:Lkj5;

    iput-object p7, p0, Lxe5;->f:LY92;

    return-void
.end method


# virtual methods
.method public a()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lxe5;->a:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lxe5;->b:I

    return v0
.end method

.method public c()Lkj5;
    .locals 1

    iget-object v0, p0, Lxe5;->e:Lkj5;

    return-object v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lxe5;->c:J

    return-wide v0
.end method

.method public e()LY92;
    .locals 1

    iget-object v0, p0, Lxe5;->f:LY92;

    return-object v0
.end method

.method public getAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxe5;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceName()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lxe5;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getScanRecord()LCk5;
    .locals 1

    iget-object v0, p0, Lxe5;->d:LCk5;

    return-object v0
.end method
