.class final Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3;->invoke$filterVisiblePolygonables(Ljava/util/List;ZLandroid/location/Location;FLco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;Lcom/google/android/gms/maps/model/VisibleRegion;Lkotlin/Lazy;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lco/bird/android/model/Polygonable;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lco/bird/android/model/Polygonable;",
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
        "SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,518:1\n1#2:519\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $polygonable:Lco/bird/android/model/Polygonable;

.field final synthetic $userLocation:Landroid/location/Location;

.field final synthetic $zoom:F

.field final synthetic this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;


# direct methods
.method public constructor <init>(Lco/bird/android/model/Polygonable;Landroid/location/Location;FLco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->$polygonable:Lco/bird/android/model/Polygonable;

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->$userLocation:Landroid/location/Location;

    iput p3, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->$zoom:F

    iput-object p4, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lco/bird/android/model/Polygonable;
    .locals 59

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->$polygonable:Lco/bird/android/model/Polygonable;

    instance-of v2, v1, Lco/bird/android/model/persistence/Area;

    if-eqz v2, :cond_7

    check-cast v1, Lco/bird/android/model/ZoomBehaviorable;

    iget-object v2, v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->$userLocation:Landroid/location/Location;

    iget v3, v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->$zoom:F

    invoke-static {v1, v2, v3}, LKX3;->a(Lco/bird/android/model/ZoomBehaviorable;Landroid/location/Location;F)LjJ6;

    move-result-object v1

    iget-object v2, v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->$polygonable:Lco/bird/android/model/Polygonable;

    move-object v3, v2

    check-cast v3, Lco/bird/android/model/persistence/Area;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-virtual {v1}, LjJ6;->b()I

    move-result v23

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const v56, -0x80001

    const v57, 0xfffff

    const/16 v58, 0x0

    invoke-static/range {v3 .. v58}, Lco/bird/android/model/persistence/Area;->copy$default(Lco/bird/android/model/persistence/Area;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;ILjava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Lco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;IILjava/lang/Object;)Lco/bird/android/model/persistence/Area;

    move-result-object v2

    iget-object v3, v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    invoke-static {v3}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->access$getPolygonablePolygons$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;

    move-result-object v3

    iget-object v4, v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->$polygonable:Lco/bird/android/model/Polygonable;

    invoke-virtual {v3, v4}, Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    iget-object v3, v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    invoke-static {v3}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->access$getPolygonablePolygons$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;

    move-result-object v3

    iget-object v5, v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->$polygonable:Lco/bird/android/model/Polygonable;

    invoke-virtual {v3, v5}, Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->getPolygonable()Lco/bird/android/model/Polygonable;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v3}, Lco/bird/android/model/Polygonable;->getColor()I

    move-result v3

    invoke-virtual {v1}, LjJ6;->b()I

    move-result v7

    if-ne v3, v7, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v6

    :goto_0
    if-eqz v3, :cond_2

    iget-object v3, v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    invoke-static {v3}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->access$getPolygonablePolygons$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;

    move-result-object v3

    iget-object v7, v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->$polygonable:Lco/bird/android/model/Polygonable;

    invoke-virtual {v3, v7}, Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->isAdded()Z

    move-result v3

    if-ne v3, v5, :cond_1

    goto :goto_1

    :cond_1
    move v5, v6

    :goto_1
    invoke-virtual {v1}, LjJ6;->c()Z

    move-result v3

    if-eq v5, v3, :cond_5

    :cond_2
    iget-object v3, v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    invoke-static {v3}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->access$getLogger$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)Lg46$b;

    move-result-object v3

    iget-object v5, v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->$polygonable:Lco/bird/android/model/Polygonable;

    invoke-interface {v5}, Lco/bird/android/model/Polygonable;->getId()Ljava/lang/String;

    move-result-object v5

    iget-object v7, v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    invoke-static {v7}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->access$getPolygonablePolygons$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;

    move-result-object v7

    iget-object v8, v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->$polygonable:Lco/bird/android/model/Polygonable;

    invoke-virtual {v7, v8}, Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->getPolygonable()Lco/bird/android/model/Polygonable;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-interface {v7}, Lco/bird/android/model/Polygonable;->getColor()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_2

    :cond_3
    move-object v7, v4

    :goto_2
    invoke-virtual {v1}, LjJ6;->b()I

    move-result v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "setting "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " as modified by modifying value colors: "

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " vs "

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {v3, v5, v6}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    invoke-static {v3}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->access$getPolygonablePolygons$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;

    move-result-object v3

    iget-object v5, v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->$polygonable:Lco/bird/android/model/Polygonable;

    invoke-virtual {v3, v5}, Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v3, v2}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->setPolygonable(Lco/bird/android/model/Polygonable;)V

    :cond_5
    :goto_3
    invoke-virtual {v1}, LjJ6;->c()Z

    move-result v1

    if-eqz v1, :cond_6

    move-object v1, v2

    goto :goto_4

    :cond_6
    move-object v1, v4

    :cond_7
    :goto_4
    return-object v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2;->invoke()Lco/bird/android/model/Polygonable;

    move-result-object v0

    return-object v0
.end method
