.class public final Lco/bird/android/manager/bluetooth/internal/a$a;
.super LCk6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/bluetooth/internal/a;-><init>(Landroid/content/Context;LaY;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "co/bird/android/manager/bluetooth/internal/a$a",
        "LCk6;",
        "Landroid/bluetooth/BluetoothDevice;",
        "device",
        "",
        "d",
        "k",
        "bluetooth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lco/bird/android/manager/bluetooth/internal/a;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/bluetooth/internal/a;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a$a;->a:Lco/bird/android/manager/bluetooth/internal/a;

    invoke-direct {p0}, LCk6;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LCk6;->d(Landroid/bluetooth/BluetoothDevice;)V

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a$a;->a:Lco/bird/android/manager/bluetooth/internal/a;

    invoke-static {p1}, Lco/bird/android/manager/bluetooth/internal/a;->access$getDisconnectingSubject$p(Lco/bird/android/manager/bluetooth/internal/a;)Lio/reactivex/subjects/a;

    move-result-object p1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public k(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LCk6;->k(Landroid/bluetooth/BluetoothDevice;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/a$a;->a:Lco/bird/android/manager/bluetooth/internal/a;

    invoke-static {v0}, Lco/bird/android/manager/bluetooth/internal/a;->access$getLock$p(Lco/bird/android/manager/bluetooth/internal/a;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/a$a;->a:Lco/bird/android/manager/bluetooth/internal/a;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v1}, LxU;->v()V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onLinkLossOccurred: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a$a;->a:Lco/bird/android/manager/bluetooth/internal/a;

    invoke-static {p1}, Lco/bird/android/manager/bluetooth/internal/a;->access$getDisconnectedSubject$p(Lco/bird/android/manager/bluetooth/internal/a;)Lio/reactivex/subjects/d;

    move-result-object p1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method
