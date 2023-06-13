.class public final LgH3$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LgH3;->B()V
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
        "LfM2;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "LfM2;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u00020\u00052^\u0010\u0004\u001aZ\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u0003 \u0002*,\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "LfM2;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "<name for destructuring parameter 0>",
        "",
        "invoke",
        "(Lkotlin/Pair;)V",
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
.field public final synthetic g:LgH3;


# direct methods
.method public constructor <init>(LgH3;)V
    .locals 0

    iput-object p1, p0, LgH3$i;->g:LgH3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LgH3$i;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "LfM2;",
            "Lco/bird/android/buava/Optional<",
            "LfM2;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LfM2;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, LfM2;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lco/bird/android/model/ParkingNest;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LfM2;

    if-eqz p1, :cond_0

    iget-object v0, p0, LgH3$i;->g:LgH3;

    invoke-static {v0}, LgH3;->access$getMapUi$p(LgH3;)Lco/bird/android/app/feature/map/ui/MapParkingUi;

    move-result-object v0

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/ui/MapParkingUi;->resetParkingMarker(LfM2;)V

    :cond_0
    iget-object p1, p0, LgH3$i;->g:LgH3;

    invoke-static {p1}, LgH3;->access$getFlightBannerCoordinatorPresenter$p(LgH3;)LZr1;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/FlightBannerNode$FlightBanner;->PARKING_NEST:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {p1, v0}, LZr1;->N1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    :cond_1
    return-void
.end method
