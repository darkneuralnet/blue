.class public final Lyq3$t;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyq3;->v()V
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
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u00020\u00052N\u0010\u0004\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00020\u0002 \u0003*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "LfM2;",
        "Lco/bird/android/buava/Optional;",
        "kotlin.jvm.PlatformType",
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
.field public final synthetic g:Lyq3;


# direct methods
.method public constructor <init>(Lyq3;)V
    .locals 0

    iput-object p1, p0, Lyq3$t;->g:Lyq3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lyq3$t;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 2
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

    move-result-object v1

    instance-of v1, v1, Lco/bird/android/model/ParkingNest;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LfM2;

    if-eqz p1, :cond_0

    iget-object v1, p0, Lyq3$t;->g:Lyq3;

    invoke-static {v1}, Lyq3;->access$getMapUi$p(Lyq3;)LNm3;

    move-result-object v1

    invoke-interface {v1, p1}, Lco/bird/android/app/feature/map/ui/MapParkingUi;->resetParkingMarker(LfM2;)V

    :cond_0
    iget-object p1, p0, Lyq3$t;->g:Lyq3;

    invoke-static {p1}, Lyq3;->access$getMapUi$p(Lyq3;)LNm3;

    move-result-object p1

    invoke-interface {p1, v0}, Lco/bird/android/app/feature/map/ui/MapParkingUi;->selectParkingMarker(LfM2;)V

    iget-object p1, p0, Lyq3$t;->g:Lyq3;

    invoke-static {p1}, Lyq3;->access$getCurrentParkingMarkerRelay$p(Lyq3;)LAG;

    move-result-object p1

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v1, v0}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-virtual {p1, v0}, LAG;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LfM2;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lyq3$t;->g:Lyq3;

    invoke-static {v0}, Lyq3;->access$getMapUi$p(Lyq3;)LNm3;

    move-result-object v0

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/ui/MapParkingUi;->resetParkingMarker(LfM2;)V

    :cond_2
    :goto_0
    return-void
.end method
