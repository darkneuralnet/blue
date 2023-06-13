.class public final synthetic LS93;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Laa3;

.field public final synthetic c:Lio/reactivex/subjects/d;

.field public final synthetic d:Ldi0;

.field public final synthetic e:Landroid/bluetooth/BluetoothGattCharacteristic;

.field public final synthetic f:Lfd3;


# direct methods
.method public synthetic constructor <init>(Laa3;Lio/reactivex/subjects/d;Ldi0;Landroid/bluetooth/BluetoothGattCharacteristic;Lfd3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS93;->b:Laa3;

    iput-object p2, p0, LS93;->c:Lio/reactivex/subjects/d;

    iput-object p3, p0, LS93;->d:Ldi0;

    iput-object p4, p0, LS93;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput-object p5, p0, LS93;->f:Lfd3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LS93;->b:Laa3;

    iget-object v1, p0, LS93;->c:Lio/reactivex/subjects/d;

    iget-object v2, p0, LS93;->d:Ldi0;

    iget-object v3, p0, LS93;->e:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-object v4, p0, LS93;->f:Lfd3;

    invoke-static {v0, v1, v2, v3, v4}, Laa3;->f(Laa3;Lio/reactivex/subjects/d;Ldi0;Landroid/bluetooth/BluetoothGattCharacteristic;Lfd3;)V

    return-void
.end method
