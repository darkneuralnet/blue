.class public final Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final areaManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbn;",
            ">;"
        }
    .end annotation
.end field

.field private final birdManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaM;",
            ">;"
        }
    .end annotation
.end field

.field private final deepLinkManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LhW0;",
            ">;"
        }
    .end annotation
.end field

.field private final filterAreasManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LGl1;",
            ">;"
        }
    .end annotation
.end field

.field private final locationManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
            ">;"
        }
    .end annotation
.end field

.field private final preferenceProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field private final reactiveConfigProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field private final rideManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
            ">;"
        }
    .end annotation
.end field

.field private final rideMapStateManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LpU4;",
            ">;"
        }
    .end annotation
.end field

.field private final riderMapDataManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lq95;",
            ">;"
        }
    .end annotation
.end field

.field private final sensorManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/hardware/SensorManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "LGl1;",
            ">;",
            "LY94<",
            "Landroid/hardware/SensorManager;",
            ">;",
            "LY94<",
            "LpU4;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LhW0;",
            ">;",
            "LY94<",
            "LaM;",
            ">;",
            "LY94<",
            "Lq95;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->locationManagerProvider:LY94;

    iput-object p2, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->reactiveConfigProvider:LY94;

    iput-object p3, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->areaManagerProvider:LY94;

    iput-object p4, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->filterAreasManagerProvider:LY94;

    iput-object p5, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->sensorManagerProvider:LY94;

    iput-object p6, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->rideMapStateManagerProvider:LY94;

    iput-object p7, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->preferenceProvider:LY94;

    iput-object p8, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->deepLinkManagerProvider:LY94;

    iput-object p9, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->birdManagerProvider:LY94;

    iput-object p10, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->riderMapDataManagerProvider:LY94;

    iput-object p11, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->rideManagerProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "LGl1;",
            ">;",
            "LY94<",
            "Landroid/hardware/SensorManager;",
            ">;",
            "LY94<",
            "LpU4;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LhW0;",
            ">;",
            "LY94<",
            "LaM;",
            ">;",
            "LY94<",
            "Lq95;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;)",
            "Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;"
        }
    .end annotation

    new-instance v12, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;

    move-object v0, v12

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v12
.end method

.method public static newInstance(Ldr4;LTq4;Lbn;LGl1;Landroid/hardware/SensorManager;LpU4;Lgl;LhW0;LaM;Lq95;LYR4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/model/constant/MapMode;Z)Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldr4;",
            "LTq4;",
            "Lbn;",
            "LGl1;",
            "Landroid/hardware/SensorManager;",
            "LpU4;",
            "Lgl;",
            "LhW0;",
            "LaM;",
            "Lq95;",
            "LYR4;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "*>;",
            "Lco/bird/android/app/feature/map/ui/MapUi;",
            "Lco/bird/android/model/constant/MapMode;",
            "Z)",
            "Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;"
        }
    .end annotation

    new-instance v16, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    move-object/from16 v0, v16

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

    invoke-direct/range {v0 .. v15}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;-><init>(Ldr4;LTq4;Lbn;LGl1;Landroid/hardware/SensorManager;LpU4;Lgl;LhW0;LaM;Lq95;LYR4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/model/constant/MapMode;Z)V

    return-object v16
.end method


# virtual methods
.method public get(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/model/constant/MapMode;Z)Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "*>;",
            "Lco/bird/android/app/feature/map/ui/MapUi;",
            "Lco/bird/android/model/constant/MapMode;",
            "Z)",
            "Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->locationManagerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ldr4;

    iget-object v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->reactiveConfigProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LTq4;

    iget-object v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->areaManagerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lbn;

    iget-object v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->filterAreasManagerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, LGl1;

    iget-object v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->sensorManagerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/hardware/SensorManager;

    iget-object v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->rideMapStateManagerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, LpU4;

    iget-object v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->preferenceProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lgl;

    iget-object v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->deepLinkManagerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, LhW0;

    iget-object v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->birdManagerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, LaM;

    iget-object v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->riderMapDataManagerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lq95;

    iget-object v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->rideManagerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, LYR4;

    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move-object/from16 v15, p3

    move/from16 v16, p4

    invoke-static/range {v2 .. v16}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl_Factory;->newInstance(Ldr4;LTq4;Lbn;LGl1;Landroid/hardware/SensorManager;LpU4;Lgl;LhW0;LaM;Lq95;LYR4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/model/constant/MapMode;Z)Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    move-result-object v1

    return-object v1
.end method
