.class public final synthetic LY93;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# instance fields
.field public final synthetic b:Landroid/bluetooth/BluetoothGattCharacteristic;


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY93;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LY93;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Laa3;->c(Landroid/bluetooth/BluetoothGattCharacteristic;Ljava/lang/Throwable;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
