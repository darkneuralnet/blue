.class public final synthetic LlH6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lno/nordicsemi/android/ble/D0;

.field public final synthetic c:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic d:[B


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/D0;Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlH6;->b:Lno/nordicsemi/android/ble/D0;

    iput-object p2, p0, LlH6;->c:Landroid/bluetooth/BluetoothDevice;

    iput-object p3, p0, LlH6;->d:[B

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LlH6;->b:Lno/nordicsemi/android/ble/D0;

    iget-object v1, p0, LlH6;->c:Landroid/bluetooth/BluetoothDevice;

    iget-object v2, p0, LlH6;->d:[B

    invoke-static {v0, v1, v2}, Lno/nordicsemi/android/ble/D0;->I(Lno/nordicsemi/android/ble/D0;Landroid/bluetooth/BluetoothDevice;[B)V

    return-void
.end method
