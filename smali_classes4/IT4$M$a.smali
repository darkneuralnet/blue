.class public final LIT4$M$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4$M;->invoke()LZ84;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/wire/WireBird;",
        ">;+",
        "Lco/bird/android/model/RideStates;",
        ">;",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/RideState;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u00012 \u0010\u0005\u001a\u001c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/wire/WireBird;",
        "Lco/bird/android/model/RideStates;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "Lco/bird/android/model/RideState;",
        "a",
        "(Lkotlin/Pair;)Lco/bird/android/buava/Optional;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$focusedRideState$2$focusedRideStateObservable$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1626:1\n1#2:1627\n*E\n"
    }
.end annotation


# static fields
.field public static final g:LIT4$M$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LIT4$M$a;

    invoke-direct {v0}, LIT4$M$a;-><init>()V

    sput-object v0, LIT4$M$a;->g:LIT4$M$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Pair;)Lco/bird/android/buava/Optional;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "Lco/bird/android/model/RideStates;",
            ">;)",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/RideState;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/RideStates;

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireBird;

    if-eqz v0, :cond_2

    invoke-virtual {p1, v0}, Lco/bird/android/model/RideStates;->rideForBird(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/RideState;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lco/bird/android/model/RideStateKt;->isInRide(Lco/bird/android/model/RideState;)Z

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    move v2, v4

    :cond_0
    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    :cond_2
    const-string v0, "rideStates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lco/bird/android/model/RideStatesKt;->firstActivePrimaryThenGuestOrNull(Lco/bird/android/model/RideStates;)Lco/bird/android/model/RideState;

    move-result-object v0

    :cond_3
    invoke-virtual {v1, v0}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LIT4$M$a;->a(Lkotlin/Pair;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method
