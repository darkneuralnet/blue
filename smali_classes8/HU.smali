.class public final synthetic LHU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/BleManagerHandler$f;


# instance fields
.field public final synthetic a:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHU;->a:Landroid/bluetooth/BluetoothDevice;

    iput p2, p0, LHU;->b:I

    return-void
.end method


# virtual methods
.method public final a(Loy0;)V
    .locals 2

    iget-object v0, p0, LHU;->a:Landroid/bluetooth/BluetoothDevice;

    iget v1, p0, LHU;->b:I

    invoke-static {v0, v1, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->R0(Landroid/bluetooth/BluetoothDevice;ILoy0;)V

    return-void
.end method
