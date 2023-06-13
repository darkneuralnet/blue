.class public LPG4;
.super Lco/bird/android/app/feature/map/ui/MapBirdUiImpl;
.source "SourceFile"

# interfaces
.implements LOG4;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LPG4$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001AB\u00ad\u0001\u0008\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020\'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0008\u0008\u0001\u0010,\u001a\u00020+\u0012\n\u0008\u0001\u0010.\u001a\u0004\u0018\u00010-\u0012\u0008\u0008\u0001\u00100\u001a\u00020/\u0012\u0008\u0008\u0001\u00102\u001a\u000201\u0012\u0008\u0008\u0001\u00104\u001a\u000203\u0012\n\u0008\u0001\u00105\u001a\u0004\u0018\u00010\r\u0012\u0008\u0008\u0001\u00107\u001a\u000206\u0012\u0008\u0008\u0001\u00108\u001a\u00020\u0018\u0012\u0008\u0008\u0001\u00109\u001a\u00020\u0018\u0012\u0008\u0008\u0001\u0010;\u001a\u00020:\u0012\u0008\u0008\u0001\u0010<\u001a\u00020\u0018\u0012\u0008\u0008\u0001\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010>\u001a\u00020=\u00a2\u0006\u0004\u0008?\u0010@J\u000e\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0004H\u0016J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u0006H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0015\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010\u00040\u00040\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\"\u0010\u0017\u001a\u0010\u0012\u000c\u0012\n \u0012*\u0004\u0018\u00010\u00060\u00060\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0014R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR$\u0010\"\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00188V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008 \u0010\u001b\"\u0004\u0008!\u0010\u001d\u00a8\u0006B"
    }
    d2 = {
        "LPG4;",
        "Lco/bird/android/app/feature/map/ui/MapBirdUiImpl;",
        "LOG4;",
        "Lio/reactivex/Observable;",
        "Lcom/google/android/gms/maps/model/PolylineOptions;",
        "Od",
        "Lcom/google/android/gms/maps/model/PolygonOptions;",
        "Q5",
        "options",
        "LMX3;",
        "E1",
        "LDX3;",
        "c0",
        "Landroid/view/View;",
        "b",
        "Landroid/view/View;",
        "mapOverlayLayout",
        "Lio/reactivex/subjects/d;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lio/reactivex/subjects/d;",
        "polylineSubject",
        "d",
        "polygonSubject",
        "",
        "value",
        "getOverlayEnabled",
        "()Z",
        "wf",
        "(Z)V",
        "overlayEnabled",
        "canPanMap",
        "getMapPanEnabled",
        "zj",
        "mapPanEnabled",
        "Li66;",
        "traceProvider",
        "LTq4;",
        "reactiveConfig",
        "LOh;",
        "appBuildConfig",
        "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;",
        "clusterManagerFactory",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "Lcom/google/android/gms/maps/model/CameraPosition;",
        "initialCameraPosition",
        "LcD1;",
        "map",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "reactiveMapEvent",
        "Lcom/google/android/gms/maps/MapView;",
        "mapView",
        "myLocationButton",
        "Lco/bird/android/model/constant/MapMode;",
        "mode",
        "drawUserLocation",
        "userDirectionalArrow",
        "LBK2;",
        "markerOverridesManager",
        "hourly",
        "Ldr4;",
        "locationManager",
        "<init>",
        "(Li66;LTq4;LOh;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;Lco/bird/android/model/constant/MapMode;ZZLBK2;ZLandroid/view/View;Ldr4;)V",
        "a",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Landroid/view/View;

.field public final c:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lcom/google/android/gms/maps/model/PolylineOptions;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lcom/google/android/gms/maps/model/PolygonOptions;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Li66;LTq4;LOh;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;Lco/bird/android/model/constant/MapMode;ZZLBK2;ZLandroid/view/View;Ldr4;)V
    .locals 20

    move-object/from16 v14, p0

    move-object/from16 v13, p7

    move-object/from16 v12, p16

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v15, p4

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move/from16 v11, p12

    move-object/from16 v17, v0

    move-object v0, v12

    move/from16 v12, p13

    move-object/from16 v18, v1

    move-object v1, v13

    move-object/from16 v13, p14

    move/from16 v14, p15

    move-object/from16 v16, p17

    const-string v2, "traceProvider"

    move-object/from16 v19, v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "reactiveConfig"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "appBuildConfig"

    move-object/from16 v3, p3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "clusterManagerFactory"

    move-object/from16 v3, p4

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "activity"

    move-object/from16 v3, p5

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "map"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "reactiveMapEvent"

    move-object/from16 v3, p8

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "mapView"

    move-object/from16 v3, p9

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "mode"

    move-object/from16 v3, p11

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "markerOverridesManager"

    move-object/from16 v3, p14

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "mapOverlayLayout"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "locationManager"

    move-object/from16 v3, p17

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p6

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    move-object/from16 v3, v19

    invoke-direct/range {v0 .. v16}, Lco/bird/android/app/feature/map/ui/MapBirdUiImpl;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;Li66;LTq4;LOh;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;Lco/bird/android/model/constant/MapMode;ZZLBK2;ZLco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;Ldr4;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p16

    iput-object v1, v0, LPG4;->b:Landroid/view/View;

    new-instance v2, LPG4$a;

    move-object/from16 v3, p7

    invoke-direct {v2, v0, v3}, LPG4$a;-><init>(LPG4;LcD1;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v1

    const-string v2, "create<PolylineOptions>()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, LPG4;->c:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v1

    const-string v2, "create<PolygonOptions>()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, LPG4;->d:Lio/reactivex/subjects/d;

    return-void
.end method

.method public static final synthetic access$getPolygonSubject$p(LPG4;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, LPG4;->d:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method public static final synthetic access$getPolylineSubject$p(LPG4;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, LPG4;->c:Lio/reactivex/subjects/d;

    return-object p0
.end method


# virtual methods
.method public E1(Lcom/google/android/gms/maps/model/PolylineOptions;)LMX3;
    .locals 1

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getMap()LcD1;

    move-result-object v0

    invoke-virtual {v0, p1}, LcD1;->e(Lcom/google/android/gms/maps/model/PolylineOptions;)LMX3;

    move-result-object p1

    const-string v0, "map.addPolyline(options)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public Od()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/google/android/gms/maps/model/PolylineOptions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LPG4;->c:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "polylineSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public Q5()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/google/android/gms/maps/model/PolygonOptions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LPG4;->d:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "polygonSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public c0(Lcom/google/android/gms/maps/model/PolygonOptions;)LDX3;
    .locals 1

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getMap()LcD1;

    move-result-object v0

    invoke-virtual {v0, p1}, LcD1;->d(Lcom/google/android/gms/maps/model/PolygonOptions;)LDX3;

    move-result-object p1

    const-string v0, "map.addPolygon(options)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public wf(Z)V
    .locals 1

    iget-object v0, p0, LPG4;->b:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public zj(Z)V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getMap()LcD1;

    move-result-object v0

    invoke-virtual {v0}, LcD1;->l()Lxd6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lxd6;->d(Z)V

    return-void
.end method
