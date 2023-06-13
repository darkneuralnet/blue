.class public final Lco/bird/android/manager/bluetooth/internal/d$f$a;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/bluetooth/internal/d$f;->invoke(Lio/reactivex/H;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J \u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "co/bird/android/manager/bluetooth/internal/d$f$a",
        "Landroid/bluetooth/BluetoothGattCallback;",
        "Landroid/bluetooth/BluetoothGatt;",
        "gatt",
        "",
        "status",
        "newState",
        "",
        "onConnectionStateChange",
        "onServicesDiscovered",
        "Landroid/bluetooth/BluetoothGattCharacteristic;",
        "characteristic",
        "onCharacteristicRead",
        "onCharacteristicChanged",
        "onCharacteristicWrite",
        "bluetooth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lco/bird/android/manager/bluetooth/internal/d;

.field public final synthetic b:Lco/bird/android/model/Vehicle;

.field public final synthetic c:Lio/reactivex/H;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/H<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Lio/reactivex/H;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/manager/bluetooth/internal/d;",
            "Lco/bird/android/model/Vehicle;",
            "Lio/reactivex/H<",
            "Lco/bird/android/model/Vehicle;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->a:Lco/bird/android/manager/bluetooth/internal/d;

    iput-object p2, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->b:Lco/bird/android/model/Vehicle;

    iput-object p3, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->c:Lio/reactivex/H;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 3

    const-string v0, "gatt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "characteristic"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->a:Lco/bird/android/manager/bluetooth/internal/d;

    invoke-static {p1}, Lco/bird/android/manager/bluetooth/internal/d;->access$getScheduler$p(Lco/bird/android/manager/bluetooth/internal/d;)LaY;

    move-result-object p1

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/d$f$a$a;

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->a:Lco/bird/android/manager/bluetooth/internal/d;

    iget-object v2, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->b:Lco/bird/android/model/Vehicle;

    invoke-direct {v0, v1, v2, p2}, Lco/bird/android/manager/bluetooth/internal/d$f$a$a;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    invoke-interface {p1, v0}, LaY;->b(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 3

    const-string v0, "gatt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "characteristic"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->a:Lco/bird/android/manager/bluetooth/internal/d;

    invoke-static {p1}, Lco/bird/android/manager/bluetooth/internal/d;->access$getScheduler$p(Lco/bird/android/manager/bluetooth/internal/d;)LaY;

    move-result-object p1

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/d$f$a$b;

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->a:Lco/bird/android/manager/bluetooth/internal/d;

    iget-object v2, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->b:Lco/bird/android/model/Vehicle;

    invoke-direct {v0, v1, v2, p2, p3}, Lco/bird/android/manager/bluetooth/internal/d$f$a$b;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    invoke-interface {p1, v0}, LaY;->b(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 3

    const-string v0, "gatt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "characteristic"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->a:Lco/bird/android/manager/bluetooth/internal/d;

    invoke-static {p1}, Lco/bird/android/manager/bluetooth/internal/d;->access$getScheduler$p(Lco/bird/android/manager/bluetooth/internal/d;)LaY;

    move-result-object p1

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/d$f$a$c;

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->a:Lco/bird/android/manager/bluetooth/internal/d;

    iget-object v2, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->b:Lco/bird/android/model/Vehicle;

    invoke-direct {v0, v1, v2, p2, p3}, Lco/bird/android/manager/bluetooth/internal/d$f$a$c;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    invoke-interface {p1, v0}, LaY;->b(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 7

    const-string p2, "gatt"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->a:Lco/bird/android/manager/bluetooth/internal/d;

    invoke-static {p2}, Lco/bird/android/manager/bluetooth/internal/d;->access$getScheduler$p(Lco/bird/android/manager/bluetooth/internal/d;)LaY;

    move-result-object p2

    new-instance v6, Lco/bird/android/manager/bluetooth/internal/d$f$a$d;

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->a:Lco/bird/android/manager/bluetooth/internal/d;

    iget-object v2, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->b:Lco/bird/android/model/Vehicle;

    iget-object v5, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->c:Lio/reactivex/H;

    move-object v0, v6

    move-object v3, p1

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lco/bird/android/manager/bluetooth/internal/d$f$a$d;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGatt;ILio/reactivex/H;)V

    invoke-interface {p2, v6}, LaY;->b(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 8

    const-string v0, "gatt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->a:Lco/bird/android/manager/bluetooth/internal/d;

    invoke-static {v0}, Lco/bird/android/manager/bluetooth/internal/d;->access$getScheduler$p(Lco/bird/android/manager/bluetooth/internal/d;)LaY;

    move-result-object v0

    new-instance v7, Lco/bird/android/manager/bluetooth/internal/d$f$a$e;

    iget-object v2, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->a:Lco/bird/android/manager/bluetooth/internal/d;

    iget-object v3, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->b:Lco/bird/android/model/Vehicle;

    iget-object v6, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a;->c:Lio/reactivex/H;

    move-object v1, v7

    move-object v4, p1

    move v5, p2

    invoke-direct/range {v1 .. v6}, Lco/bird/android/manager/bluetooth/internal/d$f$a$e;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGatt;ILio/reactivex/H;)V

    invoke-interface {v0, v7}, LaY;->b(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
