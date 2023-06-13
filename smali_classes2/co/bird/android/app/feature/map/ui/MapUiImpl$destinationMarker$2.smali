.class final Lco/bird/android/app/feature/map/ui/MapUiImpl$destinationMarker$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/MapUiImpl;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;Li66;LTq4;LOh;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;Lco/bird/android/model/constant/MapMode;ZZLdr4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LfM2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LfM2;",
        "invoke",
        "()LfM2;",
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
.field final synthetic $activity:Lco/bird/android/core/mvp/BaseActivity;

.field final synthetic this$0:Lco/bird/android/app/feature/map/ui/MapUiImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/ui/MapUiImpl;Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl$destinationMarker$2;->this$0:Lco/bird/android/app/feature/map/ui/MapUiImpl;

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl$destinationMarker$2;->$activity:Lco/bird/android/core/mvp/BaseActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LfM2;
    .locals 9

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl$destinationMarker$2;->this$0:Lco/bird/android/app/feature/map/ui/MapUiImpl;

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getMap()LcD1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    iget-object v2, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl$destinationMarker$2;->this$0:Lco/bird/android/app/feature/map/ui/MapUiImpl;

    iget-object v3, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl$destinationMarker$2;->$activity:Lco/bird/android/core/mvp/BaseActivity;

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->R1(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v1, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->v(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v2}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getCenterLocation()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    const/high16 v2, 0x3f000000    # 0.5f

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->u(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    const/high16 v2, 0x43160000    # 150.0f

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->Y1(F)Lcom/google/android/gms/maps/model/MarkerOptions;

    sget v4, LHg4;->ic_receipt_ride_end:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LfB0;->icon$default(Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)LPT;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-virtual {v0, v1}, LcD1;->c(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl$destinationMarker$2;->invoke()LfM2;

    move-result-object v0

    return-object v0
.end method
