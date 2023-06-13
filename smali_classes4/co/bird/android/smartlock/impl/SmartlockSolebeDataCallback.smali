.class public abstract Lco/bird/android/smartlock/impl/SmartlockSolebeDataCallback;
.super Lno/nordicsemi/android/ble/callback/profile/ProfileReadResponse;
.source "SourceFile"

# interfaces
.implements LvK5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008&\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/smartlock/impl/SmartlockSolebeDataCallback;",
        "Lno/nordicsemi/android/ble/callback/profile/ProfileReadResponse;",
        "LvK5;",
        "Landroid/bluetooth/BluetoothDevice;",
        "device",
        "Lno/nordicsemi/android/ble/data/Data;",
        "data",
        "",
        "b",
        "<init>",
        "()V",
        "impl_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lno/nordicsemi/android/ble/callback/profile/ProfileReadResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lno/nordicsemi/android/ble/response/ReadResponse;->b(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/data/Data;->d()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p2}, Lno/nordicsemi/android/ble/data/Data;->c()[B

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p0, p1, p2}, LvK5;->a(Landroid/bluetooth/BluetoothDevice;[B)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2}, Lno/nordicsemi/android/ble/callback/profile/ProfileReadResponse;->d(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V

    return-void
.end method
