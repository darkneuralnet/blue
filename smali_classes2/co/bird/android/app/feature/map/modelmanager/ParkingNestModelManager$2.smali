.class final Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager;-><init>(Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;Lio/reactivex/Observable;)V
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
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/ParkingNest;",
        ">;+",
        "Lkotlin/Pair<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lcom/google/android/gms/maps/model/LatLng;",
        ">;+",
        "Ljava/lang/Float;",
        ">;>;",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012R\u0010\u0004\u001aN\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0003*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u0001\u00120\u0012.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0001\u0012\u0004\u0012\u00020\u0008 \u0003*\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0001\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00050\u00050\u0005H\n\u00a2\u0006\u0002\u0008\t"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/ParkingNest;",
        "Lcom/google/android/gms/maps/model/LatLng;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nParkingNestModelManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingNestModelManager.kt\nco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1855#2,2:102\n766#2:104\n857#2,2:105\n1789#2,3:107\n1549#2:110\n1620#2,3:111\n*S KotlinDebug\n*F\n+ 1 ParkingNestModelManager.kt\nco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager$2\n*L\n47#1:102,2\n51#1:104\n51#1:105,2\n55#1:107,3\n56#1:110\n56#1:111,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager$2;->this$0:Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager$2;->invoke(Lkotlin/Pair;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/ParkingNest;",
            ">;+",
            "Lkotlin/Pair<",
            "+",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;",
            "Ljava/lang/Float;",
            ">;>;)",
            "Ljava/util/List<",
            "Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    new-instance v2, Lcom/google/android/gms/maps/model/LatLngBounds$a;

    invoke-direct {v2}, Lcom/google/android/gms/maps/model/LatLngBounds$a;-><init>()V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->b(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$a;

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->a()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v1

    const-string v2, "Builder()\n          .app\u2026     }\n          .build()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "parkingNests"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lco/bird/android/model/ParkingNest;

    invoke-virtual {v4}, Lco/bird/android/model/ParkingNest;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v4

    invoke-static {v4}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->toLatLng(Lco/bird/android/model/wire/WireLocation;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/google/android/gms/maps/model/LatLngBounds;->u(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager$2;->this$0:Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager;

    invoke-static {v0}, Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager;->access$getParkingNestFilters$p(Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/app/feature/map/modelmanager/Filter;

    invoke-interface {v1, v2}, Lco/bird/android/app/feature/map/modelmanager/Filter;->apply(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    goto :goto_2

    :cond_3
    check-cast v2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/ParkingNest;

    new-instance v3, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;

    const/high16 v4, 0x41880000    # 17.0f

    cmpl-float v4, p1, v4

    if-ltz v4, :cond_4

    const/4 v4, 0x1

    goto :goto_4

    :cond_4
    const/4 v4, 0x0

    :goto_4
    invoke-direct {v3, v2, v4}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderItem;-><init>(Lco/bird/android/model/ParkingNest;Z)V

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    return-object v0
.end method
