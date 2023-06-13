.class public final synthetic LV93;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Landroid/bluetooth/BluetoothGatt;

.field public final synthetic c:Landroid/bluetooth/BluetoothGattCharacteristic;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV93;->b:Landroid/bluetooth/BluetoothGatt;

    iput-object p2, p0, LV93;->c:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput-boolean p3, p0, LV93;->d:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LV93;->b:Landroid/bluetooth/BluetoothGatt;

    iget-object v1, p0, LV93;->c:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-boolean v2, p0, LV93;->d:Z

    invoke-static {v0, v1, v2}, Laa3;->i(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V

    return-void
.end method
