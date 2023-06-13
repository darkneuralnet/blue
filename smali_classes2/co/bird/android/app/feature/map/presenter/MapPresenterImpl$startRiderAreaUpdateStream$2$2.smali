.class final Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startRiderAreaUpdateStream$2$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startRiderAreaUpdateStream$2;->invoke(Ljava/lang/Boolean;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LNn;",
        "Lkotlin/Pair<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lcom/google/android/gms/maps/model/LatLng;",
        ">;+",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0010\t\u001a.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "LNn;",
        "areaRefreshRequest",
        "Lkotlin/Pair;",
        "",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(LNn;)Lkotlin/Pair;",
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
.field final synthetic this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startRiderAreaUpdateStream$2$2;->this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LNn;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startRiderAreaUpdateStream$2$2;->invoke(LNn;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(LNn;)Lkotlin/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LNn;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "areaRefreshRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LNn;->b()Landroid/location/Location;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startRiderAreaUpdateStream$2$2;->this$0:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    invoke-static {v0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->access$getLocationManager$p(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)Ldr4;

    move-result-object v0

    invoke-interface {v0}, Ldr4;->p()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/Location;

    :cond_0
    invoke-virtual {p1}, LNn;->c()Ljava/lang/Double;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    goto :goto_0

    :cond_1
    const-wide v1, 0x40b3880000000000L    # 5000.0

    :goto_0
    invoke-static {v0}, Lcm2;->d(Landroid/location/Location;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    invoke-static {p1, v1, v2}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->createBounds(Lcom/google/android/gms/maps/model/LatLng;D)Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object p1

    invoke-static {p1}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->points(Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
