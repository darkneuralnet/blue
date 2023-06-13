.class public final Lyq3$r;
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
        "Lcom/google/android/gms/maps/model/LatLng;",
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
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\t\u001a\u00020\u00062N\u0010\u0005\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "Lco/bird/android/buava/Optional;",
        "LfM2;",
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

    iput-object p1, p0, Lyq3$r;->g:Lyq3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lyq3$r;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            "Lco/bird/android/buava/Optional<",
            "LfM2;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lyq3$r;->g:Lyq3;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lyq3;->access$getMapUi$p(Lyq3;)LNm3;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LfM2;

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/ui/MapParkingUi;->resetParkingMarker(LfM2;)V

    :cond_0
    iget-object p1, p0, Lyq3$r;->g:Lyq3;

    invoke-static {p1}, Lyq3;->access$getOperatorUi$p(Lyq3;)LCw3;

    move-result-object p1

    invoke-interface {p1}, LCw3;->lk()V

    iget-object p1, p0, Lyq3$r;->g:Lyq3;

    invoke-static {p1}, Lyq3;->access$getOperatorUi$p(Lyq3;)LCw3;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LCw3;->Wi(Z)V

    return-void
.end method
