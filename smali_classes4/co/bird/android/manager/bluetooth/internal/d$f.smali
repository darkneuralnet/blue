.class public final Lco/bird/android/manager/bluetooth/internal/d$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/bluetooth/internal/d;->i(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/H<",
        "Lco/bird/android/model/Vehicle;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/H;",
        "Lco/bird/android/model/Vehicle;",
        "emitter",
        "",
        "invoke",
        "(Lio/reactivex/H;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/bluetooth/internal/d;

.field public final synthetic h:Lco/bird/android/model/Vehicle;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$f;->g:Lco/bird/android/manager/bluetooth/internal/d;

    iput-object p2, p0, Lco/bird/android/manager/bluetooth/internal/d$f;->h:Lco/bird/android/model/Vehicle;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/H;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$f;->invoke(Lio/reactivex/H;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/reactivex/H;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/H<",
            "Lco/bird/android/model/Vehicle;",
            ">;)V"
        }
    .end annotation

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d$f;->g:Lco/bird/android/manager/bluetooth/internal/d;

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/d$f;->h:Lco/bird/android/model/Vehicle;

    const-string v2, "connect"

    invoke-static {v0, v1, v2}, Lco/bird/android/manager/bluetooth/internal/d;->access$trace(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d$f;->g:Lco/bird/android/manager/bluetooth/internal/d;

    invoke-static {v0}, Lco/bird/android/manager/bluetooth/internal/d;->access$getDisconnectingSubject$p(Lco/bird/android/manager/bluetooth/internal/d;)Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/subjects/a;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/VehicleException;

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->h:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/manager/bluetooth/internal/VehicleException;-><init>(Lco/bird/android/manager/bluetooth/internal/VehicleException$a;Lco/bird/android/manager/bluetooth/internal/c;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lio/reactivex/H;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d$f;->g:Lco/bird/android/manager/bluetooth/internal/d;

    invoke-static {v0}, Lco/bird/android/manager/bluetooth/internal/d;->access$getAdapter$p(Lco/bird/android/manager/bluetooth/internal/d;)Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/d$f;->h:Lco/bird/android/model/Vehicle;

    invoke-virtual {v1}, Lco/bird/android/model/Vehicle;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lco/bird/android/manager/bluetooth/internal/VehicleException;

    sget-object v2, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->h:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/manager/bluetooth/internal/VehicleException;-><init>(Lco/bird/android/manager/bluetooth/internal/VehicleException$a;Lco/bird/android/manager/bluetooth/internal/c;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lio/reactivex/H;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    new-instance v1, Lco/bird/android/manager/bluetooth/internal/d$f$a;

    iget-object v2, p0, Lco/bird/android/manager/bluetooth/internal/d$f;->g:Lco/bird/android/manager/bluetooth/internal/d;

    iget-object v3, p0, Lco/bird/android/manager/bluetooth/internal/d$f;->h:Lco/bird/android/model/Vehicle;

    invoke-direct {v1, v2, v3, p1}, Lco/bird/android/manager/bluetooth/internal/d$f$a;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Lio/reactivex/H;)V

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$f;->g:Lco/bird/android/manager/bluetooth/internal/d;

    const/4 v2, 0x1

    invoke-static {p1, v2}, Lco/bird/android/manager/bluetooth/internal/d;->access$setConnecting$p(Lco/bird/android/manager/bluetooth/internal/d;Z)V

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$f;->g:Lco/bird/android/manager/bluetooth/internal/d;

    invoke-static {p1}, Lco/bird/android/manager/bluetooth/internal/d;->access$getLock$p(Lco/bird/android/manager/bluetooth/internal/d;)Ljava/lang/Object;

    move-result-object p1

    iget-object v2, p0, Lco/bird/android/manager/bluetooth/internal/d$f;->g:Lco/bird/android/manager/bluetooth/internal/d;

    monitor-enter p1

    :try_start_0
    invoke-static {v2}, Lco/bird/android/manager/bluetooth/internal/d;->access$getContext$p(Lco/bird/android/manager/bluetooth/internal/d;)Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v1}, Landroid/bluetooth/BluetoothDevice;->connectGatt(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    invoke-static {v2, v0}, Lco/bird/android/manager/bluetooth/internal/d;->access$setGatt$p(Lco/bird/android/manager/bluetooth/internal/d;Landroid/bluetooth/BluetoothGatt;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0
.end method
