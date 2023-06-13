.class public final Lco/bird/android/manager/bluetooth/internal/d$f$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/bluetooth/internal/d$f$a;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/bluetooth/internal/d;

.field public final synthetic h:Lco/bird/android/model/Vehicle;

.field public final synthetic i:Landroid/bluetooth/BluetoothGattCharacteristic;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a$a;->g:Lco/bird/android/manager/bluetooth/internal/d;

    iput-object p2, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a$a;->h:Lco/bird/android/model/Vehicle;

    iput-object p3, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a$a;->i:Landroid/bluetooth/BluetoothGattCharacteristic;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/manager/bluetooth/internal/d$f$a$a;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a$a;->g:Lco/bird/android/manager/bluetooth/internal/d;

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a$a;->h:Lco/bird/android/model/Vehicle;

    iget-object v2, p0, Lco/bird/android/manager/bluetooth/internal/d$f$a$a;->i:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {v0, v1, v2}, Lco/bird/android/manager/bluetooth/internal/d;->r0(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    return-void
.end method
