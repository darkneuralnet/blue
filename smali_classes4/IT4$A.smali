.class public final LIT4$A;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4;->k1(Lco/bird/android/model/wire/WireRide;LbF0;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/CompleteRideResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/CompleteRideResponse;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)Lio/reactivex/K;",
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
.field public final synthetic g:LIT4;

.field public final synthetic h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "LNm4;",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/CompleteRideResponse;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic i:Lco/bird/android/model/wire/WireRide;


# direct methods
.method public constructor <init>(LIT4;Ljava/util/Map;Lco/bird/android/model/wire/WireRide;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LIT4;",
            "Ljava/util/Map<",
            "LNm4;",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/CompleteRideResponse;",
            ">;>;",
            "Lco/bird/android/model/wire/WireRide;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LIT4$A;->g:LIT4;

    iput-object p2, p0, LIT4$A;->h:Ljava/util/Map;

    iput-object p3, p0, LIT4$A;->i:Lco/bird/android/model/wire/WireRide;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/Unit;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Unit;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/CompleteRideResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LIT4$A;->g:LIT4;

    iget-object v0, p0, LIT4$A;->h:Ljava/util/Map;

    invoke-static {v0}, LMm4;->q(Ljava/util/Map;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "setupRace(raceParticipan\u2026dSchedulers.mainThread())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LIT4$A;->i:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lco/bird/android/model/RideState$Status;->ENDED:Lco/bird/android/model/RideState$Status;

    invoke-static {p1, v0, v1, v2}, LIT4;->access$andHandleRideStateUpdate(LIT4;Lio/reactivex/F;Ljava/lang/String;Lco/bird/android/model/RideState$Status;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LIT4$A;->invoke(Lkotlin/Unit;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
