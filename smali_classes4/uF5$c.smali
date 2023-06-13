.class public final LuF5$c;
.super LxU$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LuF5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0008\u0010\u0008\u001a\u00020\u0002H\u0014\u00a8\u0006\u000b"
    }
    d2 = {
        "LuF5$c;",
        "LxU$b;",
        "",
        "o2",
        "Landroid/bluetooth/BluetoothGatt;",
        "gatt",
        "",
        "S2",
        "c5",
        "<init>",
        "(LuF5;)V",
        "impl_release"
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
        "SMAP\nSmartlockNokeDeviceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager$SmartlockNokeGattCallback\n+ 2 ValueChangedCallbackExt.kt\nno/nordicsemi/android/ble/ktx/ValueChangedCallbackExtKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,550:1\n73#2:551\n86#2:552\n20#3:553\n22#3:557\n47#3:558\n49#3:562\n50#4:554\n55#4:556\n50#4:559\n55#4:561\n106#5:555\n106#5:560\n*S KotlinDebug\n*F\n+ 1 SmartlockNokeDeviceManager.kt\nco/bird/android/smartlock/impl/SmartLockNokeDeviceManager$SmartlockNokeGattCallback\n*L\n256#1:551\n256#1:552\n257#1:553\n257#1:557\n258#1:558\n258#1:562\n257#1:554\n257#1:556\n258#1:559\n258#1:561\n257#1:555\n258#1:560\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic L:LuF5;


# direct methods
.method public constructor <init>(LuF5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LuF5$c;->L:LuF5;

    invoke-direct {p0}, LxU$b;-><init>()V

    return-void
.end method


# virtual methods
.method public S2(Landroid/bluetooth/BluetoothGatt;)Z
    .locals 2

    const-string v0, "gatt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LJJ5;->access$getSMARTLOCK_NOKE_SERVICE_UUID$p()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LuF5$c;->L:LuF5;

    invoke-static {}, LJJ5;->access$getSMARTLOCK_NOKE_WRITE_COMMAND_CHARACTERISTIC$p()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v0, v1}, LuF5;->access$setWriteCharacteristic$p(LuF5;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    invoke-static {}, LJJ5;->access$getSMARTLOCK_NOKE_NOTIFICATION_CHARACTERISTIC$p()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p1

    invoke-static {v0, p1}, LuF5;->access$setNotifyCharacteristic$p(LuF5;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    :cond_0
    iget-object p1, p0, LuF5$c;->L:LuF5;

    invoke-static {p1}, LuF5;->access$getWriteCharacteristic$p(LuF5;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LuF5$c;->L:LuF5;

    invoke-static {p1}, LuF5;->access$getNotifyCharacteristic$p(LuF5;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public c5()V
    .locals 2

    iget-object v0, p0, LuF5$c;->L:LuF5;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LuF5;->access$setWriteCharacteristic$p(LuF5;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    iget-object v0, p0, LuF5$c;->L:LuF5;

    invoke-static {v0, v1}, LuF5;->access$setNotifyCharacteristic$p(LuF5;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    return-void
.end method

.method public o2()V
    .locals 4

    invoke-super {p0}, Lno/nordicsemi/android/ble/BleManagerHandler;->o2()V

    iget-object v0, p0, LuF5$c;->L:LuF5;

    invoke-static {v0}, LuF5;->access$getNotifyCharacteristic$p(LuF5;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v0, v1}, LuF5;->access$setNotificationCallback(LuF5;Landroid/bluetooth/BluetoothGattCharacteristic;)LEj6;

    move-result-object v0

    const-string v1, "setNotificationCallback(notifyCharacteristic)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LuF5$c$a;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, LuF5$c$a;-><init>(LEj6;Lkotlin/coroutines/Continuation;)V

    invoke-static {v1}, LVu1;->e(Lkotlin/jvm/functions/Function2;)LEu1;

    move-result-object v0

    new-instance v1, LuF5$c$b;

    invoke-direct {v1, v0}, LuF5$c$b;-><init>(LEu1;)V

    iget-object v0, p0, LuF5$c;->L:LuF5;

    new-instance v3, LuF5$c$c;

    invoke-direct {v3, v1, v0}, LuF5$c$c;-><init>(LEu1;LuF5;)V

    invoke-static {}, LT41;->b()LSC0;

    move-result-object v0

    invoke-static {v3, v0}, LVu1;->H(LEu1;Lkotlin/coroutines/CoroutineContext;)LEu1;

    move-result-object v0

    new-instance v1, LuF5$c$d;

    iget-object v3, p0, LuF5$c;->L:LuF5;

    invoke-direct {v1, v3, v2}, LuF5$c$d;-><init>(LuF5;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1}, LVu1;->L(LEu1;Lkotlin/jvm/functions/Function2;)LEu1;

    move-result-object v0

    new-instance v1, LuF5$c$e;

    invoke-direct {v1, v2}, LuF5$c$e;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1}, LVu1;->K(LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object v0

    new-instance v1, LuF5$c$f;

    iget-object v3, p0, LuF5$c;->L:LuF5;

    invoke-direct {v1, v3, v2}, LuF5$c$f;-><init>(LuF5;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1}, LVu1;->f(LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object v0

    invoke-static {}, LT41;->c()LpG2;

    move-result-object v1

    invoke-static {v0, v1}, LVu1;->H(LEu1;Lkotlin/coroutines/CoroutineContext;)LEu1;

    move-result-object v0

    iget-object v1, p0, LuF5$c;->L:LuF5;

    invoke-static {v1}, LuF5;->access$getScope$p(LuF5;)LZC0;

    move-result-object v1

    invoke-static {v0, v1}, LVu1;->I(LEu1;LZC0;)Lzh2;

    iget-object v0, p0, LuF5$c;->L:LuF5;

    invoke-static {v0}, LuF5;->access$getNotifyCharacteristic$p(LuF5;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v0, v1}, LuF5;->access$enableNotifications(LuF5;Landroid/bluetooth/BluetoothGattCharacteristic;)Lno/nordicsemi/android/ble/D0;

    move-result-object v0

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/u0;->k()V

    return-void
.end method
