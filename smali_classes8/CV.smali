.class public final synthetic LCV;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/BleManagerHandler$e;


# instance fields
.field public final synthetic a:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCV;->a:Landroid/bluetooth/BluetoothDevice;

    iput-object p2, p0, LCV;->b:Ljava/lang/String;

    iput p3, p0, LCV;->c:I

    return-void
.end method


# virtual methods
.method public final a(LyU;)V
    .locals 3

    iget-object v0, p0, LCV;->a:Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, LCV;->b:Ljava/lang/String;

    iget v2, p0, LCV;->c:I

    invoke-static {v0, v1, v2, p1}, Lno/nordicsemi/android/ble/BleManagerHandler;->K0(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;ILyU;)V

    return-void
.end method
