.class public final synthetic LVt5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Landroid/bluetooth/BluetoothGatt;

.field public final synthetic c:Lio/reactivex/E;


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothGatt;Lio/reactivex/E;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVt5;->b:Landroid/bluetooth/BluetoothGatt;

    iput-object p2, p0, LVt5;->c:Lio/reactivex/E;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LVt5;->b:Landroid/bluetooth/BluetoothGatt;

    iget-object v1, p0, LVt5;->c:Lio/reactivex/E;

    invoke-static {v0, v1}, LYt5;->h(Landroid/bluetooth/BluetoothGatt;Lio/reactivex/E;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method
