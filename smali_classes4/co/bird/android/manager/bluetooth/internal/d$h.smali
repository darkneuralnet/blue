.class public final Lco/bird/android/manager/bluetooth/internal/d$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/bluetooth/internal/d;->a(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Vehicle;",
        "Lio/reactivex/K<",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/Vehicle;",
        "it",
        "Lio/reactivex/K;",
        "",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"
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

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$h;->g:Lco/bird/android/manager/bluetooth/internal/d;

    iput-object p2, p0, Lco/bird/android/manager/bluetooth/internal/d$h;->h:Lco/bird/android/model/Vehicle;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$h;->c(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)Ljava/lang/Boolean;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/manager/bluetooth/internal/d;->access$getLock$p(Lco/bird/android/manager/bluetooth/internal/d;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lco/bird/android/manager/bluetooth/internal/d;->access$getGatt$p(Lco/bird/android/manager/bluetooth/internal/d;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "disconnect: gatt.disconnect()"

    invoke-static {p0, p1, v2}, Lco/bird/android/manager/bluetooth/internal/d;->access$trace(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    const/16 v2, 0x1f4

    invoke-static {v2}, LHY;->b(I)V

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->close()V

    const-string v1, "disconnect: gatt.close()"

    invoke-static {p0, p1, v1}, Lco/bird/android/manager/bluetooth/internal/d;->access$trace(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    invoke-static {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d;->access$setGatt$p(Lco/bird/android/manager/bluetooth/internal/d;Landroid/bluetooth/BluetoothGatt;)V

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$h;->g:Lco/bird/android/manager/bluetooth/internal/d;

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d$h;->h:Lco/bird/android/model/Vehicle;

    new-instance v1, LYm6;

    invoke-direct {v1, p1, v0}, LYm6;-><init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V

    invoke-static {v1}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Vehicle;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$h;->b(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
