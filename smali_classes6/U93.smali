.class public final synthetic LU93;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/i;


# instance fields
.field public final synthetic a:Lfd3;

.field public final synthetic b:Landroid/bluetooth/BluetoothGattCharacteristic;

.field public final synthetic c:LA01;

.field public final synthetic d:[B


# direct methods
.method public synthetic constructor <init>(Lfd3;Landroid/bluetooth/BluetoothGattCharacteristic;LA01;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU93;->a:Lfd3;

    iput-object p2, p0, LU93;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput-object p3, p0, LU93;->c:LA01;

    iput-object p4, p0, LU93;->d:[B

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/c;)Lio/reactivex/h;
    .locals 4

    iget-object v0, p0, LU93;->a:Lfd3;

    iget-object v1, p0, LU93;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-object v2, p0, LU93;->c:LA01;

    iget-object v3, p0, LU93;->d:[B

    invoke-static {v0, v1, v2, v3, p1}, Laa3;->b(Lfd3;Landroid/bluetooth/BluetoothGattCharacteristic;LA01;[BLio/reactivex/c;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
