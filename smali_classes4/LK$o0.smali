.class public final LLK$o0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLK;->v2(Lco/bird/android/model/wire/WireBird;Z)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/Vehicle;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "isBluetoothOff",
        "Lio/reactivex/B;",
        "Lco/bird/android/model/Vehicle;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Boolean;)Lio/reactivex/B;",
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
.field public final synthetic g:LLK;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(LLK;Lco/bird/android/model/wire/WireBird;Z)V
    .locals 0

    iput-object p1, p0, LLK$o0;->g:LLK;

    iput-object p2, p0, LLK$o0;->h:Lco/bird/android/model/wire/WireBird;

    iput-boolean p3, p0, LLK$o0;->i:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Boolean;)Lio/reactivex/B;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "isBluetoothOff"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lco/bird/android/model/exception/BluetoothException;

    sget-object v0, Lco/bird/android/model/exception/BluetoothException$Reason;->DISABLED:Lco/bird/android/model/exception/BluetoothException$Reason;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p1, v2, v0, v1, v2}, Lco/bird/android/model/exception/BluetoothException;-><init>(Ljava/lang/Throwable;Lco/bird/android/model/exception/BluetoothException$Reason;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "{\n          Observable.e\u2026ason.DISABLED))\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LLK$o0;->g:LLK;

    iget-object v0, p0, LLK$o0;->h:Lco/bird/android/model/wire/WireBird;

    invoke-static {p1, v0}, LLK;->access$updateBirdState(LLK;Lco/bird/android/model/wire/WireBird;)V

    invoke-static {}, LLK;->access$getScannedVehicles$cp()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iget-object v0, p0, LLK$o0;->h:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0}, LuC6;->b(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/VehicleDescriptor;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/Vehicle;

    if-nez p1, :cond_1

    iget-object p1, p0, LLK$o0;->g:LLK;

    iget-object v0, p0, LLK$o0;->h:Lco/bird/android/model/wire/WireBird;

    iget-boolean v1, p0, LLK$o0;->i:Z

    invoke-virtual {p1, v0, v1}, LLK;->k(Lco/bird/android/model/wire/WireBird;Z)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "{\n            Observable.just(vehicle)\n          }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LLK$o0;->invoke(Ljava/lang/Boolean;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
