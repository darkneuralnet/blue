.class public Lfi3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lei3;


# instance fields
.field public final a:Lve5;

.field public final b:Landroid/bluetooth/BluetoothGatt;

.field public final c:LPx2;

.field public final d:LL46;

.field public final e:Lio/reactivex/E;

.field public final f:Lio/reactivex/E;

.field public final g:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LSr4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lve5;Landroid/bluetooth/BluetoothGatt;LPx2;LL46;Lio/reactivex/E;Lio/reactivex/E;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lve5;",
            "Landroid/bluetooth/BluetoothGatt;",
            "LPx2;",
            "LL46;",
            "Lio/reactivex/E;",
            "Lio/reactivex/E;",
            "LZ94<",
            "LSr4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfi3;->a:Lve5;

    iput-object p2, p0, Lfi3;->b:Landroid/bluetooth/BluetoothGatt;

    iput-object p3, p0, Lfi3;->c:LPx2;

    iput-object p4, p0, Lfi3;->d:LL46;

    iput-object p5, p0, Lfi3;->e:Lio/reactivex/E;

    iput-object p6, p0, Lfi3;->f:Lio/reactivex/E;

    iput-object p7, p0, Lfi3;->g:LZ94;

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothGattDescriptor;[B)Lz01;
    .locals 8

    new-instance v7, Lz01;

    iget-object v1, p0, Lfi3;->a:Lve5;

    iget-object v2, p0, Lfi3;->b:Landroid/bluetooth/BluetoothGatt;

    iget-object v3, p0, Lfi3;->d:LL46;

    const/4 v4, 0x2

    move-object v0, v7

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lz01;-><init>(Lve5;Landroid/bluetooth/BluetoothGatt;LL46;ILandroid/bluetooth/BluetoothGattDescriptor;[B)V

    return-object v7
.end method

.method public b(JLjava/util/concurrent/TimeUnit;)LYt5;
    .locals 6

    new-instance v0, LYt5;

    iget-object v1, p0, Lfi3;->a:Lve5;

    iget-object v2, p0, Lfi3;->b:Landroid/bluetooth/BluetoothGatt;

    iget-object v3, p0, Lfi3;->c:LPx2;

    new-instance v4, LL46;

    iget-object v5, p0, Lfi3;->f:Lio/reactivex/E;

    invoke-direct {v4, p1, p2, p3, v5}, LL46;-><init>(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)V

    invoke-direct {v0, v1, v2, v3, v4}, LYt5;-><init>(Lve5;Landroid/bluetooth/BluetoothGatt;LPx2;LL46;)V

    return-object v0
.end method

.method public c(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Lfi0;
    .locals 7

    new-instance v6, Lfi0;

    iget-object v1, p0, Lfi3;->a:Lve5;

    iget-object v2, p0, Lfi3;->b:Landroid/bluetooth/BluetoothGatt;

    iget-object v3, p0, Lfi3;->d:LL46;

    move-object v0, v6

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lfi0;-><init>(Lve5;Landroid/bluetooth/BluetoothGatt;LL46;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    return-object v6
.end method
