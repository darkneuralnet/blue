.class public final Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->a(Lcom/google/android/gms/maps/model/LatLngBounds;Ljava/util/List;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/Set<",
        "+",
        "Ljava/lang/Long;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0010\u0010\u0003\u001a\u000c\u0012\u0008\u0012\u00060\u0001j\u0002`\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "",
        "Lco/bird/android/feature/rider/impl/MapGeocacheSubRegion;",
        "innerRegions",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/Set;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

.field public final synthetic h:Lcom/google/android/gms/maps/model/LatLngBounds;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Lcom/google/android/gms/maps/model/LatLngBounds;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$n;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    iput-object p2, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$n;->h:Lcom/google/android/gms/maps/model/LatLngBounds;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)Lio/reactivex/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "innerRegions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$n;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    invoke-static {v0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->access$serverCellIdsForSubRegions(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$n;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    iget-object v1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$n;->h:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/LatLngBounds;->v()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    const-string v2, "region.center"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->access$refreshServerCellIds(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Lcom/google/android/gms/maps/model/LatLng;Ljava/util/Set;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$n;->a(Ljava/util/Set;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
