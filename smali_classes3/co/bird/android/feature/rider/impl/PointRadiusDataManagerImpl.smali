.class public final Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwu6;
.implements LVX0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwu6<",
        "Lvt4;",
        ">;",
        "LVX0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B5\u0008\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0008\u0008\u0001\u0010\u001f\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010#\u001a\u00020\u0002\u00a2\u0006\u0004\u0008/\u00100J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00082\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J\u001e\u0010\u0010\u001a\u00020\r*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bJ\u000c\u0010\u0012\u001a\u00020\u0011*\u00020\u0008H\u0002R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u001eR\u001a\u0010#\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\u001b\u0010\"R\u001a\u0010(\u001a\u0008\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R(\u0010-\u001a\u0010\u0012\u000c\u0012\n **\u0004\u0018\u00010%0%0)8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.\u00a8\u00061"
    }
    d2 = {
        "Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;",
        "Lwu6;",
        "Lvt4;",
        "LVX0;",
        "LLifecycleOwner;",
        "owner",
        "",
        "onCreate",
        "Lcom/google/android/gms/maps/model/LatLngBounds;",
        "region",
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "birds",
        "Lio/reactivex/c;",
        "a",
        "bird",
        "e",
        "",
        "b",
        "LaM;",
        "LaM;",
        "birdManager",
        "Lbn;",
        "c",
        "Lbn;",
        "areaManager",
        "LTq4;",
        "d",
        "LTq4;",
        "reactiveConfig",
        "LLifecycleOwner;",
        "processLifecycleOwner",
        "f",
        "Lvt4;",
        "()Lvt4;",
        "cellType",
        "La94;",
        "",
        "g",
        "La94;",
        "isEnabledRelay",
        "LZ84;",
        "kotlin.jvm.PlatformType",
        "h",
        "LZ84;",
        "isEnabled",
        "()LZ84;",
        "<init>",
        "(LaM;Lbn;LTq4;LLifecycleOwner;Lvt4;)V",
        "impl_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LaM;

.field public final c:Lbn;

.field public final d:LTq4;

.field public final e:LLifecycleOwner;

.field public final f:Lvt4;

.field public final g:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ84<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LaM;Lbn;LTq4;LLifecycleOwner;Lvt4;)V
    .locals 1

    const-string v0, "birdManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "areaManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processLifecycleOwner"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cellType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->b:LaM;

    iput-object p2, p0, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->c:Lbn;

    iput-object p3, p0, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->d:LTq4;

    iput-object p4, p0, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->e:LLifecycleOwner;

    iput-object p5, p0, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->f:Lvt4;

    sget-object p1, La94;->h:La94$a;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 p3, 0x0

    const/4 p5, 0x2

    invoke-static {p1, p2, p3, p5, p3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->g:La94;

    sget-object p2, LZ84;->d:LZ84$a;

    invoke-virtual {p2, p1}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->h:LZ84;

    invoke-interface {p4}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/f;->a(LFq2;)V

    return-void
.end method

.method public static synthetic refreshViaPointRadius$default(Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;Lvt4;Lcom/google/android/gms/maps/model/LatLngBounds;Lco/bird/android/model/wire/WireBird;ILjava/lang/Object;)Lio/reactivex/c;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->e(Lvt4;Lcom/google/android/gms/maps/model/LatLngBounds;Lco/bird/android/model/wire/WireBird;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/LatLngBounds;Ljava/util/List;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/model/LatLngBounds;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    const-string v0, "region"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->d()Lvt4;

    move-result-object v0

    if-eqz p2, :cond_0

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lco/bird/android/model/wire/WireBird;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p0, v0, p1, p2}, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->e(Lvt4;Lcom/google/android/gms/maps/model/LatLngBounds;Lco/bird/android/model/wire/WireBird;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/google/android/gms/maps/model/LatLngBounds;)F
    .locals 2

    iget-object v0, p1, Lcom/google/android/gms/maps/model/LatLngBounds;->b:Lcom/google/android/gms/maps/model/LatLng;

    const-string v1, "southwest"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcm2;->e(Lcom/google/android/gms/maps/model/LatLng;)Landroid/location/Location;

    move-result-object v0

    iget-object p1, p1, Lcom/google/android/gms/maps/model/LatLngBounds;->c:Lcom/google/android/gms/maps/model/LatLng;

    const-string v1, "northeast"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcm2;->e(Lcom/google/android/gms/maps/model/LatLng;)Landroid/location/Location;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result p1

    return p1
.end method

.method public d()Lvt4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->f:Lvt4;

    return-object v0
.end method

.method public final e(Lvt4;Lcom/google/android/gms/maps/model/LatLngBounds;Lco/bird/android/model/wire/WireBird;)Lio/reactivex/c;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "region"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/google/android/gms/maps/model/LatLngBounds;->v()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    const-string v0, "region.center"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcm2;->e(Lcom/google/android/gms/maps/model/LatLng;)Landroid/location/Location;

    move-result-object v2

    invoke-virtual {p0, p2}, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->b(Lcom/google/android/gms/maps/model/LatLngBounds;)F

    move-result p1

    float-to-double p1, p1

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    div-double v3, p1, v0

    invoke-virtual {p0}, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->d()Lvt4;

    move-result-object p1

    instance-of p2, p1, LUK;

    if-eqz p2, :cond_0

    iget-object p1, p0, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->b:LaM;

    invoke-static {v3, v4}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->adjustedNearbyRadius(D)D

    move-result-wide p2

    invoke-interface {p1, v2, p2, p3}, LaM;->J0(Landroid/location/Location;D)Lio/reactivex/c;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of p2, p1, LUm;

    if-eqz p2, :cond_1

    iget-object v1, p0, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->c:Lbn;

    sget-object v5, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    const/4 v6, 0x1

    invoke-interface/range {v1 .. v6}, Lbn;->Z(Landroid/location/Location;DLco/bird/android/model/constant/MapMode;Z)Lio/reactivex/c;

    move-result-object p1

    goto :goto_1

    :cond_1
    instance-of p1, p1, LB23;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->c:Lbn;

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1, v3, v4, p2, v2}, Lbn;->f(DLjava/lang/String;Landroid/location/Location;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    const-string p2, "areaManager.nearbyParkin\u2026\n        .ignoreElement()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public isEnabled()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->h:LZ84;

    return-object v0
.end method

.method public onCreate(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onCreate(LLifecycleOwner;)V

    iget-object p1, p0, Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;->g:La94;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method
