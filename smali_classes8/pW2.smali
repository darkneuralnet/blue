.class public final synthetic LpW2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lno/nordicsemi/android/ble/q0;

.field public final synthetic c:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/q0;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpW2;->b:Lno/nordicsemi/android/ble/q0;

    iput-object p2, p0, LpW2;->c:Landroid/bluetooth/BluetoothDevice;

    iput p3, p0, LpW2;->d:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LpW2;->b:Lno/nordicsemi/android/ble/q0;

    iget-object v1, p0, LpW2;->c:Landroid/bluetooth/BluetoothDevice;

    iget v2, p0, LpW2;->d:I

    invoke-static {v0, v1, v2}, Lno/nordicsemi/android/ble/q0;->I(Lno/nordicsemi/android/ble/q0;Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method
