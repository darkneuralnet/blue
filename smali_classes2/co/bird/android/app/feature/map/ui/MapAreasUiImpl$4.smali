.class final Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4;
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
        "Lco/bird/android/model/Polygonable;",
        "+",
        "Lcom/google/android/gms/maps/model/LatLng;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/Polygonable;",
        "Lcom/google/android/gms/maps/model/LatLng;",
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

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Lco/bird/android/model/Polygonable;",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/Polygonable;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/maps/model/LatLng;

    instance-of v1, v0, Lco/bird/android/model/persistence/Area;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    move-object v2, v0

    check-cast v2, Lco/bird/android/model/persistence/Area;

    new-instance v3, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4$1;

    invoke-direct {v3, v0, v1, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4$1;-><init>(Lco/bird/android/model/Polygonable;Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-static {v1, v2, v3}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$handleAreaClick(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Lco/bird/android/model/persistence/Area;Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_0
    instance-of p1, v0, Lco/bird/android/model/persistence/ZonePolygonable;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    check-cast v0, Lco/bird/android/model/persistence/ZonePolygonable;

    invoke-static {p1, v0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$handleZoneClick(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Lco/bird/android/model/persistence/ZonePolygonable;)V

    :cond_1
    :goto_0
    return-void
.end method
