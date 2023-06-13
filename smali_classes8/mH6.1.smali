.class public final synthetic LmH6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lno/nordicsemi/android/ble/D0;

.field public final synthetic c:Landroid/bluetooth/BluetoothDevice;


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/D0;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LmH6;->b:Lno/nordicsemi/android/ble/D0;

    iput-object p2, p0, LmH6;->c:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LmH6;->b:Lno/nordicsemi/android/ble/D0;

    iget-object v1, p0, LmH6;->c:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, v1}, Lno/nordicsemi/android/ble/D0;->J(Lno/nordicsemi/android/ble/D0;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method
