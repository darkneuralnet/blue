.class final Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$geom$2;
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
        "LCX3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LCX3;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$geom$2\n+ 2 JtsGeometry.kt\nco/bird/android/geo/extension/JtsGeometryKt\n*L\n1#1,518:1\n45#2,2:519\n35#2:521\n47#2,3:522\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$geom$2\n*L\n132#1:519,2\n132#1:521\n132#1:522,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $polygonable:Lco/bird/android/model/Polygonable;


# direct methods
.method public constructor <init>(Lco/bird/android/model/Polygonable;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$geom$2;->$polygonable:Lco/bird/android/model/Polygonable;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LCX3;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$geom$2;->$polygonable:Lco/bird/android/model/Polygonable;

    invoke-interface {v0}, Lco/bird/android/model/Polygonable;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v0

    :try_start_0
    invoke-static {}, LFj2;->d()Landroid/util/LruCache;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, LCX3;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type org.locationtech.jts.geom.Polygon"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$geom$2;->invoke()LCX3;

    move-result-object v0

    return-object v0
.end method
