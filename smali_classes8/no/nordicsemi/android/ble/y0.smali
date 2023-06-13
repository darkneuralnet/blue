.class public abstract Lno/nordicsemi/android/ble/y0;
.super Lno/nordicsemi/android/ble/x0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lno/nordicsemi/android/ble/x0;"
    }
.end annotation


# instance fields
.field public r:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lno/nordicsemi/android/ble/u0$c;)V
    .locals 0

    invoke-direct {p0, p1}, Lno/nordicsemi/android/ble/x0;-><init>(Lno/nordicsemi/android/ble/u0$c;)V

    return-void
.end method

.method public constructor <init>(Lno/nordicsemi/android/ble/u0$c;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lno/nordicsemi/android/ble/x0;-><init>(Lno/nordicsemi/android/ble/u0$c;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    return-void
.end method


# virtual methods
.method public H(Ljava/lang/Object;)Lno/nordicsemi/android/ble/y0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lno/nordicsemi/android/ble/y0<",
            "TT;>;"
        }
    .end annotation

    iput-object p1, p0, Lno/nordicsemi/android/ble/y0;->r:Ljava/lang/Object;

    return-object p0
.end method
