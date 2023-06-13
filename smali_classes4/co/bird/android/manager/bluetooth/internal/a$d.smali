.class public final Lco/bird/android/manager/bluetooth/internal/a$d;
.super LxU$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/bluetooth/internal/a;-><init>(Landroid/content/Context;LaY;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0008\u0010\u0008\u001a\u00020\u0002H\u0014J\u0008\u0010\t\u001a\u00020\u0002H\u0014J\u0008\u0010\n\u001a\u00020\u0002H\u0014J\u0008\u0010\u000b\u001a\u00020\u0002H\u0014\u00a8\u0006\u000c"
    }
    d2 = {
        "co/bird/android/manager/bluetooth/internal/a$d",
        "LxU$b;",
        "",
        "o2",
        "Landroid/bluetooth/BluetoothGatt;",
        "gatt",
        "",
        "S2",
        "X4",
        "c5",
        "Y4",
        "a5",
        "bluetooth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBDVehicleManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BDVehicleManagerImpl.kt\nco/bird/android/manager/bluetooth/internal/BDVehicleManagerImpl$gattCallback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n1#2:451\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic L:Lco/bird/android/manager/bluetooth/internal/a;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/bluetooth/internal/a;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a$d;->L:Lco/bird/android/manager/bluetooth/internal/a;

    invoke-direct {p0}, LxU$b;-><init>()V

    return-void
.end method

.method public static synthetic h5(Lco/bird/android/manager/bluetooth/internal/a;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/manager/bluetooth/internal/a$d;->i5(Lco/bird/android/manager/bluetooth/internal/a;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V

    return-void
.end method

.method public static final i5(Lco/bird/android/manager/bluetooth/internal/a;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "data"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/data/Data;->c()[B

    move-result-object p1

    const-string v0, "defaultCharset()"

    if-eqz p1, :cond_0

    invoke-static {p0}, Lco/bird/android/manager/bluetooth/internal/a;->access$getNotificationRelay$p(Lco/bird/android/manager/bluetooth/internal/a;)Lma4;

    move-result-object p0

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {p0, v2}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p2}, Lno/nordicsemi/android/ble/data/Data;->c()[B

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "received command notification "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public S2(Landroid/bluetooth/BluetoothGatt;)Z
    .locals 3

    const-string v0, "gatt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "isRequiredServiceSupported reached"

    invoke-static {v2, v1}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v1, Lco/bird/android/model/GattUuid;->BD_BIRD_SERVICE:Lco/bird/android/model/GattUuid;

    invoke-virtual {v1}, Lco/bird/android/model/GattUuid;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/a$d;->L:Lco/bird/android/manager/bluetooth/internal/a;

    sget-object v2, Lco/bird/android/model/GattUuid;->BD_COMMAND:Lco/bird/android/model/GattUuid;

    invoke-virtual {v2}, Lco/bird/android/model/GattUuid;->getUuid()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p1

    invoke-static {v1, p1}, Lco/bird/android/manager/bluetooth/internal/a;->access$setCommandCharacteristic$p(Lco/bird/android/manager/bluetooth/internal/a;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a$d;->L:Lco/bird/android/manager/bluetooth/internal/a;

    invoke-static {p1}, Lco/bird/android/manager/bluetooth/internal/a;->access$getCommandCharacteristic$p(Lco/bird/android/manager/bluetooth/internal/a;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isRequiredServiceSupported returning "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a$d;->L:Lco/bird/android/manager/bluetooth/internal/a;

    invoke-static {p1}, Lco/bird/android/manager/bluetooth/internal/a;->access$getCommandCharacteristic$p(Lco/bird/android/manager/bluetooth/internal/a;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0

    :cond_1
    const-string p1, "failed to find required services"

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    return v0
.end method

.method public X4()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "device disconnected"

    invoke-static {v1, v0}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public Y4()V
    .locals 2

    invoke-super {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->Y4()V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "device ready"

    invoke-static {v1, v0}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public a5()V
    .locals 2

    invoke-super {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->a5()V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "manager ready"

    invoke-static {v1, v0}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public c5()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onServicesInvalidated called "

    invoke-static {v1, v0}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public o2()V
    .locals 3

    invoke-super {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->o2()V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Setting command notification"

    invoke-static {v1, v0}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/a$d;->L:Lco/bird/android/manager/bluetooth/internal/a;

    invoke-static {v0}, Lco/bird/android/manager/bluetooth/internal/a;->access$getCommandCharacteristic$p(Lco/bird/android/manager/bluetooth/internal/a;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v0, v1}, Lco/bird/android/manager/bluetooth/internal/a;->access$setNotificationCallback(Lco/bird/android/manager/bluetooth/internal/a;Landroid/bluetooth/BluetoothGattCharacteristic;)LEj6;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/a$d;->L:Lco/bird/android/manager/bluetooth/internal/a;

    new-instance v2, LCv;

    invoke-direct {v2, v1}, LCv;-><init>(Lco/bird/android/manager/bluetooth/internal/a;)V

    invoke-virtual {v0, v2}, LEj6;->h(LQS0;)LEj6;

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/a$d;->L:Lco/bird/android/manager/bluetooth/internal/a;

    invoke-static {v0}, Lco/bird/android/manager/bluetooth/internal/a;->access$getCommandCharacteristic$p(Lco/bird/android/manager/bluetooth/internal/a;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v0, v1}, Lco/bird/android/manager/bluetooth/internal/a;->access$enableNotifications(Lco/bird/android/manager/bluetooth/internal/a;Landroid/bluetooth/BluetoothGattCharacteristic;)Lno/nordicsemi/android/ble/D0;

    move-result-object v0

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/u0;->k()V

    return-void
.end method
