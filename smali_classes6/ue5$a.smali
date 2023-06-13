.class public Lue5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lue5;->b(Ljava/util/UUID;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Landroid/bluetooth/BluetoothGattCharacteristic;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/UUID;

.field public final synthetic c:Lue5;


# direct methods
.method public constructor <init>(Lue5;Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, Lue5$a;->c:Lue5;

    iput-object p2, p0, Lue5$a;->b:Ljava/util/UUID;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 3

    iget-object v0, p0, Lue5$a;->c:Lue5;

    iget-object v0, v0, Lue5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothGattService;

    iget-object v2, p0, Lue5$a;->b:Ljava/util/UUID;

    invoke-virtual {v1, v2}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_1
    new-instance v0, Lcom/polidea/rxandroidble2/exceptions/BleCharacteristicNotFoundException;

    iget-object v1, p0, Lue5$a;->b:Ljava/util/UUID;

    invoke-direct {v0, v1}, Lcom/polidea/rxandroidble2/exceptions/BleCharacteristicNotFoundException;-><init>(Ljava/util/UUID;)V

    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lue5$a;->a()Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    return-object v0
.end method
