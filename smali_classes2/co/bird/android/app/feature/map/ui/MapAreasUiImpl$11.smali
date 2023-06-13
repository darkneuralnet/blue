.class final Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$11;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;-><init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;LOh;Ldr4;)V
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
        "Lco/bird/android/model/persistence/Area;",
        "+",
        "Lcom/google/android/gms/maps/model/GroundOverlayOptions;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/Area;",
        "Lcom/google/android/gms/maps/model/GroundOverlayOptions;",
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
.field final synthetic this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$11;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$11;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/Area;",
            "Lcom/google/android/gms/maps/model/GroundOverlayOptions;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/Area;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/maps/model/GroundOverlayOptions;

    const-string v1, "area"

    if-eqz p1, :cond_0

    iget-object v2, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$11;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-static {v2}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$getMap$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)LcD1;

    move-result-object v2

    invoke-virtual {v2, p1}, LcD1;->b(Lcom/google/android/gms/maps/model/GroundOverlayOptions;)LfE1;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v2, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$11;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1, v3}, LfE1;->h(Ljava/lang/Object;)V

    invoke-static {v2}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$getAreaGroundOverlay$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$11;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-static {p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$getMap$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)LcD1;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v2}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/Area;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v3

    invoke-static {v3}, LJX3;->a(Lco/bird/android/model/Polygon;)Lco/bird/android/model/Point;

    move-result-object v3

    invoke-static {v3}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->toLatLng(Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v2

    iget-object v3, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$11;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/Area;->getOverlayLabel()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/Area;->getOverlayIcon()Lco/bird/android/model/constant/AreaIconType;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lan;->b(Lco/bird/android/model/constant/AreaIconType;)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Lco/bird/android/model/persistence/Area;->getBorderColor()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v4, v0, v1, v5}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$toBitmapDescriptor(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Ljava/lang/String;Lco/bird/android/model/persistence/Area;Ljava/lang/Integer;Ljava/lang/Integer;)LPT;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    const/high16 v2, 0x43480000    # 200.0f

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->Y1(F)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    invoke-virtual {p1, v1}, LcD1;->c(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$11;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-static {v1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$getAreaLabelMarkers$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$11;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-static {v1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$getAreaMarkers$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_1
    return-void
.end method
