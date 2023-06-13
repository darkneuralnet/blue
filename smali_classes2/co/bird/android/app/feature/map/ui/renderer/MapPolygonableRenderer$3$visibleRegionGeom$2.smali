.class final Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$visibleRegionGeom$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3;->invoke(Lkotlin/Triple;)Lna4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LCX3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LCX3;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "()LCX3;",
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
.field final synthetic $visibleRegion:Lcom/google/android/gms/maps/model/VisibleRegion;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/maps/model/VisibleRegion;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$visibleRegionGeom$2;->$visibleRegion:Lcom/google/android/gms/maps/model/VisibleRegion;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LCX3;
    .locals 8

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$visibleRegionGeom$2;->$visibleRegion:Lcom/google/android/gms/maps/model/VisibleRegion;

    const/4 v1, 0x5

    new-array v1, v1, [LyB0;

    new-instance v2, LyB0;

    iget-object v3, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->d:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v4, v3, Lcom/google/android/gms/maps/model/LatLng;->c:D

    iget-wide v6, v3, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-direct {v2, v4, v5, v6, v7}, LyB0;-><init>(DD)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, LyB0;

    iget-object v3, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->e:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v4, v3, Lcom/google/android/gms/maps/model/LatLng;->c:D

    iget-wide v6, v3, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-direct {v2, v4, v5, v6, v7}, LyB0;-><init>(DD)V

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, LyB0;

    iget-object v3, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->c:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v4, v3, Lcom/google/android/gms/maps/model/LatLng;->c:D

    iget-wide v6, v3, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-direct {v2, v4, v5, v6, v7}, LyB0;-><init>(DD)V

    const/4 v3, 0x2

    aput-object v2, v1, v3

    new-instance v2, LyB0;

    iget-object v3, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->b:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v4, v3, Lcom/google/android/gms/maps/model/LatLng;->c:D

    iget-wide v6, v3, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-direct {v2, v4, v5, v6, v7}, LyB0;-><init>(DD)V

    const/4 v3, 0x3

    aput-object v2, v1, v3

    new-instance v2, LyB0;

    iget-object v0, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->d:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v3, v0, Lcom/google/android/gms/maps/model/LatLng;->c:D

    iget-wide v5, v0, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-direct {v2, v3, v4, v5, v6}, LyB0;-><init>(DD)V

    const/4 v0, 0x4

    aput-object v2, v1, v0

    new-instance v0, LbC1;

    invoke-direct {v0}, LbC1;-><init>()V

    invoke-static {}, LAB0;->d()LAB0;

    move-result-object v2

    invoke-virtual {v2, v1}, LAB0;->c([LyB0;)LEB0;

    move-result-object v1

    invoke-virtual {v0, v1}, LbC1;->w(LEB0;)LCX3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$visibleRegionGeom$2;->invoke()LCX3;

    move-result-object v0

    return-object v0
.end method
