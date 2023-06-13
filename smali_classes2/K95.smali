.class public final LK95;
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
            "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
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
            "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK95;->a:LY94;

    iput-object p2, p0, LK95;->b:LY94;

    iput-object p3, p0, LK95;->c:LY94;

    iput-object p4, p0, LK95;->d:LY94;

    iput-object p5, p0, LK95;->e:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;)LK95;
    .locals 7
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
            "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;)",
            "LK95;"
        }
    .end annotation

    new-instance v6, LK95;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LK95;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(Li66;LTq4;LOh;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;ZZLBK2;ZZLdr4;)LH95;
    .locals 18

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

    move/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move-object/from16 v16, p15

    new-instance v17, LH95;

    move-object/from16 v0, v17

    invoke-direct/range {v0 .. v16}, LH95;-><init>(Li66;LTq4;LOh;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;ZZLBK2;ZZLdr4;)V

    return-object v17
.end method


# virtual methods
.method public b(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;ZZLBK2;ZZ)LH95;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, LK95;->a:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Li66;

    iget-object v1, v0, LK95;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LTq4;

    iget-object v1, v0, LK95;->c:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, LOh;

    iget-object v1, v0, LK95;->d:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;

    iget-object v1, v0, LK95;->e:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Ldr4;

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    move/from16 v12, p7

    move/from16 v13, p8

    move-object/from16 v14, p9

    move/from16 v15, p10

    move/from16 v16, p11

    invoke-static/range {v2 .. v17}, LK95;->c(Li66;LTq4;LOh;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;ZZLBK2;ZZLdr4;)LH95;

    move-result-object v1

    return-object v1
.end method
