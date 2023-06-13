.class final Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4;->invoke(Lkotlin/Pair;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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
.field final synthetic $latLng:Lcom/google/android/gms/maps/model/LatLng;

.field final synthetic $polygonable:Lco/bird/android/model/Polygonable;

.field final synthetic this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/model/Polygonable;Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4$1;->$polygonable:Lco/bird/android/model/Polygonable;

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4$1;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    iput-object p3, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4$1;->$latLng:Lcom/google/android/gms/maps/model/LatLng;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4$1;->$polygonable:Lco/bird/android/model/Polygonable;

    check-cast v0, Lco/bird/android/model/persistence/Area;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/Area;->toolTipTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4$1;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-static {v0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$getCurrentlySelectedMarkerArea$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Lio/reactivex/subjects/a;

    move-result-object v0

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4$1;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-static {v0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$getMap$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)LcD1;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4$1;->$polygonable:Lco/bird/android/model/Polygonable;

    check-cast v2, Lco/bird/android/model/persistence/Area;

    iget-object v3, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4$1;->$latLng:Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {v0, v1, v2, v3}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$showInfoWindow(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;LcD1;Lco/bird/android/model/persistence/Area;Lcom/google/android/gms/maps/model/LatLng;)V

    :cond_0
    return-void
.end method
