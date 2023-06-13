.class public final LRK1$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRK1;->G(Lio/reactivex/Observable;Lco/bird/android/model/wire/WireBird;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LTk5;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LTk5;",
        "scanResult",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LTk5;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LRK1;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lco/bird/android/model/wire/WirePhysicalLock;


# direct methods
.method public constructor <init>(LRK1;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;)V
    .locals 0

    iput-object p1, p0, LRK1$c;->g:LRK1;

    iput-object p2, p0, LRK1$c;->h:Lco/bird/android/model/wire/WireBird;

    iput-object p3, p0, LRK1$c;->i:Ljava/lang/String;

    iput-object p4, p0, LRK1$c;->j:Lco/bird/android/model/wire/WirePhysicalLock;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LTk5;)Lio/reactivex/h;
    .locals 4

    const-string v0, "scanResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LRK1$c;->g:LRK1;

    invoke-static {v0}, LRK1;->access$getReactiveConfig$p(LRK1;)LTq4;

    move-result-object v0

    iget-object v1, p0, LRK1$c;->h:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0, v1}, LUq4;->c(LTq4;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getSmartlockConfig()Lco/bird/android/model/wire/configs/SmartlockRideConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/SmartlockRideConfig;->getOpenAttemptCount()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v2, p0, LRK1$c;->i:Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "continuing unlocking now that lease has started"

    invoke-static {v3, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, p0, LRK1$c;->g:LRK1;

    invoke-static {v2}, LRK1;->access$getSmartlockManager$p(LRK1;)LoI5;

    move-result-object v2

    iget-object v3, p0, LRK1$c;->j:Lco/bird/android/model/wire/WirePhysicalLock;

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    invoke-interface {v2, p1, v3, v0}, LoI5;->b(LTk5;Lco/bird/android/model/wire/WirePhysicalLock;I)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTk5;

    invoke-virtual {p0, p1}, LRK1$c;->a(LTk5;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
