.class public final LbX;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u00a8\u0006\u0003"
    }
    d2 = {
        "Lno/nordicsemi/android/support/v18/scanner/ScanResult;",
        "Lco/bird/android/bluetooth/model/ScannedDevice;",
        "a",
        "interface_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)Lco/bird/android/bluetooth/model/ScannedDevice;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/bluetooth/model/ScannedDevice;

    invoke-virtual {p0}, Lno/nordicsemi/android/support/v18/scanner/ScanResult;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    const-string v1, "this.device.address"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lno/nordicsemi/android/support/v18/scanner/ScanResult;->b()I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {p0}, Lno/nordicsemi/android/support/v18/scanner/ScanResult;->b()I

    move-result v6

    invoke-static {p0}, LWk5;->a(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)Lorg/joda/time/DateTime;

    move-result-object v7

    const/16 v8, 0x8

    const/4 v9, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v9}, Lco/bird/android/bluetooth/model/ScannedDevice;-><init>(Lno/nordicsemi/android/support/v18/scanner/ScanResult;Ljava/lang/String;IIILorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
