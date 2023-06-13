.class public final synthetic LQ93;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Laa3;

.field public final synthetic c:Landroid/bluetooth/BluetoothGattCharacteristic;

.field public final synthetic d:Z

.field public final synthetic e:Lfd3;


# direct methods
.method public synthetic constructor <init>(Laa3;Landroid/bluetooth/BluetoothGattCharacteristic;ZLfd3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ93;->b:Laa3;

    iput-object p2, p0, LQ93;->c:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput-boolean p3, p0, LQ93;->d:Z

    iput-object p4, p0, LQ93;->e:Lfd3;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LQ93;->b:Laa3;

    iget-object v1, p0, LQ93;->c:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-boolean v2, p0, LQ93;->d:Z

    iget-object v3, p0, LQ93;->e:Lfd3;

    invoke-static {v0, v1, v2, v3}, Laa3;->d(Laa3;Landroid/bluetooth/BluetoothGattCharacteristic;ZLfd3;)Lio/reactivex/B;

    move-result-object v0

    return-object v0
.end method
