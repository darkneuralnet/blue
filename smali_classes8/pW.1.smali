.class public final synthetic LpW;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/BleManagerHandler$e;


# instance fields
.field public final synthetic a:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpW;->a:Landroid/bluetooth/BluetoothDevice;

    iput p2, p0, LpW;->b:I

    return-void
.end method


# virtual methods
.method public final a(LyU;)V
    .locals 2

    iget-object v0, p0, LpW;->a:Landroid/bluetooth/BluetoothDevice;

    iget v1, p0, LpW;->b:I

    invoke-static {v0, v1, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->N0(Landroid/bluetooth/BluetoothDevice;ILyU;)V

    return-void
.end method
