.class public final LRm3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Li66;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LOh;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManagerFactory;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManagerFactory;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManagerFactory;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManagerFactory;",
            ">;"
        }
    .end annotation
.end field

.field public final i:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Li66;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LOh;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManagerFactory;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManagerFactory;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManagerFactory;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManagerFactory;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRm3;->a:LY94;

    iput-object p2, p0, LRm3;->b:LY94;

    iput-object p3, p0, LRm3;->c:LY94;

    iput-object p4, p0, LRm3;->d:LY94;

    iput-object p5, p0, LRm3;->e:LY94;

    iput-object p6, p0, LRm3;->f:LY94;

    iput-object p7, p0, LRm3;->g:LY94;

    iput-object p8, p0, LRm3;->h:LY94;

    iput-object p9, p0, LRm3;->i:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LRm3;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Li66;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LOh;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManagerFactory;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManagerFactory;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManagerFactory;",
            ">;",
            "LY94<",
            "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManagerFactory;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;)",
            "LRm3;"
        }
    .end annotation

    new-instance v10, LRm3;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, LRm3;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v10
.end method

.method public static c(Li66;LTq4;LOh;Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManagerFactory;Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;ZLBK2;ZLdr4;)LOm3;
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    new-instance v19, LOm3;

    move-object/from16 v0, v19

    invoke-direct/range {v0 .. v18}, LOm3;-><init>(Li66;LTq4;LOh;Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManagerFactory;Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;ZLBK2;ZLdr4;)V

    return-object v19
.end method


# virtual methods
.method public b(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;ZLBK2;Z)LOm3;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move-object/from16 v13, p5

    move-object/from16 v14, p6

    move/from16 v15, p7

    move-object/from16 v16, p8

    move/from16 v17, p9

    iget-object v1, v0, LRm3;->a:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li66;

    iget-object v2, v0, LRm3;->b:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LTq4;

    iget-object v3, v0, LRm3;->c:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LOh;

    iget-object v4, v0, LRm3;->d:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;

    iget-object v5, v0, LRm3;->e:LY94;

    invoke-interface {v5}, LY94;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManagerFactory;

    iget-object v6, v0, LRm3;->f:LY94;

    invoke-interface {v6}, LY94;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManagerFactory;

    iget-object v7, v0, LRm3;->g:LY94;

    invoke-interface {v7}, LY94;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManagerFactory;

    iget-object v8, v0, LRm3;->h:LY94;

    invoke-interface {v8}, LY94;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManagerFactory;

    move-object/from16 p1, v1

    iget-object v1, v0, LRm3;->i:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v18, v1

    check-cast v18, Ldr4;

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v18}, LRm3;->c(Li66;LTq4;LOh;Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManagerFactory;Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;ZLBK2;ZLdr4;)LOm3;

    move-result-object v1

    return-object v1
.end method
