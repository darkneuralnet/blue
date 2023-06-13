.class public final Li25$Q2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->c9()V
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
        "Lco/bird/android/model/RiderAreaState;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        "+",
        "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;",
        ">;>;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012J\u0010\u0002\u001aF\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00030\u0005 \u0008*\"\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00030\u0005\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\t"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/RiderAreaState;",
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$Q2;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Li25$Q2;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Lco/bird/android/model/RiderAreaState;",
            "+",
            "Ljava/util/List<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireBird;",
            "+",
            "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;",
            ">;>;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/RiderAreaState;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    sget-object v1, Lco/bird/android/model/OUTSIDE_SERVICE_AREA;->INSTANCE:Lco/bird/android/model/OUTSIDE_SERVICE_AREA;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Li25$Q2;->g:Li25;

    invoke-static {v1}, Li25;->access$getOutsideServiceAreaComplianceLogRelay$p(Li25;)Lma4;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lma4;->accept(Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "setting state for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " to "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v3, v4}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Li25$Q2;->g:Li25;

    invoke-static {v3}, Li25;->access$getMapUi$p(Li25;)LG95;

    move-result-object v3

    invoke-interface {v3, v1, v2}, LG95;->x3(Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;Lco/bird/android/model/wire/WireBird;)V

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    iget-object p1, p0, Li25$Q2;->g:Li25;

    invoke-static {p1}, Li25;->access$getMapUi$p(Li25;)LG95;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1, v2}, Lco/bird/android/app/feature/map/ui/MapAreasUi$DefaultImpls;->updateAreasUi$default(Lco/bird/android/app/feature/map/ui/MapAreasUi;FLjava/util/List;ILjava/lang/Object;)V

    iget-object p1, p0, Li25$Q2;->g:Li25;

    invoke-static {p1}, Li25;->access$getShouldZoomMapIfOutsideArea$p(Li25;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Li25$Q2;->g:Li25;

    invoke-virtual {p1}, Li25;->i4()Landroid/location/Location;

    move-result-object v0

    iget-object v1, p0, Li25$Q2;->g:Li25;

    invoke-static {v1}, Li25;->access$getAreaManager$p(Li25;)Lbn;

    move-result-object v1

    invoke-interface {v1}, Lbn;->r()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {p1, v0, v1}, Li25;->access$zoomToShowUserLocationAndNearestOperationalArea(Li25;Landroid/location/Location;Ljava/util/List;)V

    :cond_1
    return-void
.end method
