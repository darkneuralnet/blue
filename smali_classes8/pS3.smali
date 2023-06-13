.class public final synthetic LpS3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lno/nordicsemi/android/ble/r0;

.field public final synthetic c:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/r0;Landroid/bluetooth/BluetoothDevice;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpS3;->b:Lno/nordicsemi/android/ble/r0;

    iput-object p2, p0, LpS3;->c:Landroid/bluetooth/BluetoothDevice;

    iput p3, p0, LpS3;->d:I

    iput p4, p0, LpS3;->e:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LpS3;->b:Lno/nordicsemi/android/ble/r0;

    iget-object v1, p0, LpS3;->c:Landroid/bluetooth/BluetoothDevice;

    iget v2, p0, LpS3;->d:I

    iget v3, p0, LpS3;->e:I

    invoke-static {v0, v1, v2, v3}, Lno/nordicsemi/android/ble/r0;->I(Lno/nordicsemi/android/ble/r0;Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method
