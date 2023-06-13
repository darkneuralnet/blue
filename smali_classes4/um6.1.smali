.class public final synthetic Lum6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/manager/bluetooth/internal/d;

.field public final synthetic c:Lco/bird/android/model/Vehicle;

.field public final synthetic d:Landroid/bluetooth/BluetoothGatt;

.field public final synthetic e:Landroid/bluetooth/BluetoothGattService;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lum6;->b:Lco/bird/android/manager/bluetooth/internal/d;

    iput-object p2, p0, Lum6;->c:Lco/bird/android/model/Vehicle;

    iput-object p3, p0, Lum6;->d:Landroid/bluetooth/BluetoothGatt;

    iput-object p4, p0, Lum6;->e:Landroid/bluetooth/BluetoothGattService;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lum6;->b:Lco/bird/android/manager/bluetooth/internal/d;

    iget-object v1, p0, Lum6;->c:Lco/bird/android/model/Vehicle;

    iget-object v2, p0, Lum6;->d:Landroid/bluetooth/BluetoothGatt;

    iget-object v3, p0, Lum6;->e:Landroid/bluetooth/BluetoothGattService;

    invoke-static {v0, v1, v2, v3}, Lco/bird/android/manager/bluetooth/internal/d;->H(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattService;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
