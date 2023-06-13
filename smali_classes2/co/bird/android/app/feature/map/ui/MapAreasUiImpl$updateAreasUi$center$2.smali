.class final Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$updateAreasUi$center$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->updateAreasUi(FLjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/location/Location;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroid/location/Location;",
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
        "SMAP\nMapAreasUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapAreasUi.kt\nco/bird/android/app/feature/map/ui/MapAreasUiImpl$updateAreasUi$center$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,681:1\n1855#2,2:682\n*S KotlinDebug\n*F\n+ 1 MapAreasUi.kt\nco/bird/android/app/feature/map/ui/MapAreasUiImpl$updateAreasUi$center$2\n*L\n368#1:682,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $viewport:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$updateAreasUi$center$2;->$viewport:Ljava/util/List;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroid/location/Location;
    .locals 10

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$updateAreasUi$center$2;->$viewport:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v2, v1

    move-object v3, v2

    move-object v4, v3

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v1, :cond_1

    iget-wide v6, v5, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v8

    cmpl-double v6, v6, v8

    if-lez v6, :cond_2

    :cond_1
    iget-wide v6, v5, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    :cond_2
    if-eqz v2, :cond_3

    iget-wide v6, v5, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v8

    cmpg-double v6, v6, v8

    if-gez v6, :cond_4

    :cond_3
    iget-wide v6, v5, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    :cond_4
    if-eqz v3, :cond_5

    iget-wide v6, v5, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v8

    cmpl-double v6, v6, v8

    if-lez v6, :cond_6

    :cond_5
    iget-wide v6, v5, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    :cond_6
    if-eqz v4, :cond_7

    iget-wide v6, v5, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v8

    cmpg-double v6, v6, v8

    if-gez v6, :cond_0

    :cond_7
    iget-wide v4, v5, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    goto :goto_0

    :cond_8
    move-object v2, v1

    move-object v3, v2

    move-object v4, v3

    :cond_9
    if-eqz v1, :cond_a

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    add-double/2addr v5, v1

    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    div-double/2addr v5, v1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    add-double/2addr v7, v3

    div-double/2addr v7, v1

    invoke-direct {v0, v5, v6, v7, v8}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    goto :goto_1

    :cond_a
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, v1, v2}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    :goto_1
    invoke-static {v0}, Lcm2;->e(Lcom/google/android/gms/maps/model/LatLng;)Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$updateAreasUi$center$2;->invoke()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method
