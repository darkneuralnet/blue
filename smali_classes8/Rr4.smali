.class public final synthetic LRr4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LQS0;

.field public final synthetic c:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic d:Lno/nordicsemi/android/ble/data/Data;


# direct methods
.method public synthetic constructor <init>(LQS0;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRr4;->b:LQS0;

    iput-object p2, p0, LRr4;->c:Landroid/bluetooth/BluetoothDevice;

    iput-object p3, p0, LRr4;->d:Lno/nordicsemi/android/ble/data/Data;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LRr4;->b:LQS0;

    iget-object v1, p0, LRr4;->c:Landroid/bluetooth/BluetoothDevice;

    iget-object v2, p0, LRr4;->d:Lno/nordicsemi/android/ble/data/Data;

    invoke-static {v0, v1, v2}, Lno/nordicsemi/android/ble/s0;->I(LQS0;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V

    return-void
.end method
