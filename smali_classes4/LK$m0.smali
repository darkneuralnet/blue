.class public final LLK$m0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLK;->k(Lco/bird/android/model/wire/WireBird;Z)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/y<",
        "Lco/bird/android/model/Vehicle;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/y;",
        "Lco/bird/android/model/Vehicle;",
        "emitter",
        "",
        "b",
        "(Lio/reactivex/y;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LLK;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(LLK;Lco/bird/android/model/wire/WireBird;Z)V
    .locals 0

    iput-object p1, p0, LLK$m0;->g:LLK;

    iput-object p2, p0, LLK$m0;->h:Lco/bird/android/model/wire/WireBird;

    iput-boolean p3, p0, LLK$m0;->i:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LLK;LLK$m0$b;)V
    .locals 0

    invoke-static {p0, p1}, LLK$m0;->c(LLK;LLK$m0$b;)V

    return-void
.end method

.method public static final c(LLK;LLK$m0$b;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$scanCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LLK;->H2(Ljj5;)V

    return-void
.end method


# virtual methods
.method public final b(Lio/reactivex/y;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "Lco/bird/android/model/Vehicle;",
            ">;)V"
        }
    .end annotation

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LLK$m0;->g:LLK;

    iget-object v1, p0, LLK$m0;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "scan: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LLK;->J2(Ljava/lang/String;)V

    iget-object v0, p0, LLK$m0;->g:LLK;

    invoke-virtual {v0}, LLK;->R1()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LLK$m0;->g:LLK;

    const-string v1, "scan: bluetooth off"

    invoke-virtual {v0, v1}, LLK;->J2(Ljava/lang/String;)V

    iget-object v0, p0, LLK$m0;->g:LLK;

    iget-object v1, p0, LLK$m0;->h:Lco/bird/android/model/wire/WireBird;

    iget-boolean v2, p0, LLK$m0;->i:Z

    sget-object v3, Lco/bird/android/model/exception/BluetoothException$Reason;->DISABLED:Lco/bird/android/model/exception/BluetoothException$Reason;

    invoke-static {p1, v0, v1, v2, v3}, LLK;->access$scan$onErrorOrComplete(Lio/reactivex/y;LLK;Lco/bird/android/model/wire/WireBird;ZLco/bird/android/model/exception/BluetoothException$Reason;)V

    return-void

    :cond_0
    iget-object v0, p0, LLK$m0;->g:LLK;

    iget-object v1, p0, LLK$m0;->h:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0, v1}, LLK;->access$updateBirdState(LLK;Lco/bird/android/model/wire/WireBird;)V

    invoke-static {}, LLK;->access$getScannedVehicles$cp()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    iget-object v1, p0, LLK$m0;->h:Lco/bird/android/model/wire/WireBird;

    invoke-static {v1}, LuC6;->b(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/VehicleDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/Vehicle;

    if-eqz v0, :cond_1

    iget-object v1, p0, LLK$m0;->g:LLK;

    const-string v2, "scan: found vehicle, just return"

    invoke-virtual {v1, v2}, LLK;->J2(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    invoke-interface {p1}, Lio/reactivex/j;->onComplete()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LLK$m0;->g:LLK;

    invoke-static {v0}, LLK;->access$getScanning$p(LLK;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LLK$m0;->g:LLK;

    const-string v1, "scan: scanning, ignore"

    invoke-virtual {v0, v1}, LLK;->J2(Ljava/lang/String;)V

    invoke-interface {p1}, Lio/reactivex/j;->onComplete()V

    goto :goto_0

    :cond_2
    new-instance v7, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {v7, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v0, LLK$m0$b;

    iget-object v3, p0, LLK$m0;->g:LLK;

    iget-object v5, p0, LLK$m0;->h:Lco/bird/android/model/wire/WireBird;

    iget-boolean v6, p0, LLK$m0;->i:Z

    move-object v2, v0

    move-object v4, p1

    invoke-direct/range {v2 .. v7}, LLK$m0$b;-><init>(LLK;Lio/reactivex/y;Lco/bird/android/model/wire/WireBird;ZLjava/util/concurrent/atomic/AtomicBoolean;)V

    iget-object v1, p0, LLK$m0;->g:LLK;

    new-instance v2, LRK;

    invoke-direct {v2, v1, v0}, LRK;-><init>(LLK;LLK$m0$b;)V

    invoke-interface {p1, v2}, Lio/reactivex/y;->a(Lio/reactivex/functions/f;)V

    iget-object v1, p0, LLK$m0;->g:LLK;

    iget-object p1, p0, LLK$m0;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v1, p1}, LLK;->Q1(Lco/bird/android/model/wire/WireBird;)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, LLK;->startScanBle$bluetooth_release$default(LLK;Ljj5;Ljava/util/List;IILjava/lang/Object;)V

    iget-object p1, p0, LLK$m0;->g:LLK;

    invoke-static {p1}, LLK;->access$getScheduler$p(LLK;)LaY;

    move-result-object p1

    new-instance v1, LLK$m0$a;

    iget-object v2, p0, LLK$m0;->g:LLK;

    invoke-direct {v1, v2, v0}, LLK$m0$a;-><init>(LLK;LLK$m0$b;)V

    const-wide/16 v2, 0xa

    invoke-interface {p1, v1, v2, v3}, LaY;->c(Lkotlin/jvm/functions/Function0;J)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/y;

    invoke-virtual {p0, p1}, LLK$m0;->b(Lio/reactivex/y;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
