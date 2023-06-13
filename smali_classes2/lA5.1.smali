.class public final LlA5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/modelmanager/Filter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lco/bird/android/app/feature/map/modelmanager/Filter<",
        "Lco/bird/android/model/ParkingNest;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u001b0%\u0012\u0006\u0010(\u001a\u00020\'\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008)\u0010*J\u001c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0003H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR?\u0010\u001a\u001a\u001f\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\"8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010#\u00a8\u0006+"
    }
    d2 = {
        "LlA5;",
        "Lco/bird/android/app/feature/map/modelmanager/Filter;",
        "Lco/bird/android/model/ParkingNest;",
        "",
        "models",
        "apply",
        "LTq4;",
        "a",
        "LTq4;",
        "reactiveConfig",
        "",
        "b",
        "Ljava/lang/String;",
        "getId",
        "()Ljava/lang/String;",
        "id",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "",
        "c",
        "Lkotlin/jvm/functions/Function1;",
        "getSetDirty",
        "()Lkotlin/jvm/functions/Function1;",
        "setSetDirty",
        "(Lkotlin/jvm/functions/Function1;)V",
        "setDirty",
        "Lco/bird/android/model/destination/Destination;",
        "d",
        "Lco/bird/android/model/destination/Destination;",
        "destination",
        "Lg46$b;",
        "()Lg46$b;",
        "logger",
        "Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;",
        "()Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;",
        "config",
        "Lio/reactivex/Observable;",
        "destinationStream",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "<init>",
        "(Lio/reactivex/Observable;Lcom/uber/autodispose/ScopeProvider;LTq4;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nShowParkingNearDestinationFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowParkingNearDestinationFilter.kt\nco/bird/android/app/feature/destination/filter/ShowParkingNearDestinationFilter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,78:1\n180#2:79\n*S KotlinDebug\n*F\n+ 1 ShowParkingNearDestinationFilter.kt\nco/bird/android/app/feature/destination/filter/ShowParkingNearDestinationFilter\n*L\n35#1:79\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LTq4;

.field public final b:Ljava/lang/String;

.field public c:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lco/bird/android/model/destination/Destination;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lio/reactivex/Observable;Lcom/uber/autodispose/ScopeProvider;LTq4;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/destination/Destination;",
            ">;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "LTq4;",
            ")V"
        }
    .end annotation

    const-string v0, "destinationStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LlA5;->a:LTq4;

    const-string p3, "destination-edit-parking-filter"

    iput-object p3, p0, LlA5;->b:Ljava/lang/String;

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p3

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p3, "destinationStream\n      \u2026dSchedulers.mainThread())"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, LlA5$a;

    invoke-direct {v1, p0}, LlA5$a;-><init>(LlA5;)V

    const/4 v2, 0x0

    new-instance v3, LlA5$b;

    invoke-direct {v3, p0}, LlA5$b;-><init>(LlA5;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lld5;->subscribeBy$default(Lcom/uber/autodispose/ObservableSubscribeProxy;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public static final synthetic access$getLogger(LlA5;)Lg46$b;
    .locals 0

    invoke-virtual {p0}, LlA5;->b()Lg46$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setDestination$p(LlA5;Lco/bird/android/model/destination/Destination;)V
    .locals 0

    iput-object p1, p0, LlA5;->d:Lco/bird/android/model/destination/Destination;

    return-void
.end method


# virtual methods
.method public final a()Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;
    .locals 1

    iget-object v0, p0, LlA5;->a:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getDestination()Lco/bird/android/model/wire/configs/DestinationConfig;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/DestinationConfig;->getRider()Lco/bird/android/model/wire/configs/RiderDestinationConfig;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RiderDestinationConfig;->getDestinationPinFilter()Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public apply(Ljava/util/List;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/ParkingNest;",
            ">;)",
            "Ljava/util/List<",
            "Lco/bird/android/model/ParkingNest;",
            ">;"
        }
    .end annotation

    const-string v0, "models"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LlA5;->a()Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;->getInnerRadiusMeters()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0}, LlA5;->a()Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;->getOuterRadiusMeters()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0}, LlA5;->a()Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;->getMaxPinsDisplayed()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, LlA5;->d:Lco/bird/android/model/destination/Destination;

    if-nez v3, :cond_0

    return-object p1

    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/ParkingNest;

    sget-object v7, LYw2;->a:LYw2;

    new-instance v8, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v6}, Lco/bird/android/model/ParkingNest;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v9

    invoke-virtual {v9}, Lco/bird/android/model/wire/WireLocation;->getLatitude()D

    move-result-wide v9

    invoke-virtual {v6}, Lco/bird/android/model/ParkingNest;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v11

    invoke-virtual {v11}, Lco/bird/android/model/wire/WireLocation;->getLongitude()D

    move-result-wide v11

    invoke-direct {v8, v9, v10, v11, v12}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    new-instance v9, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v3}, Lco/bird/android/model/destination/Destination;->getLatitude()D

    move-result-wide v10

    invoke-virtual {v3}, Lco/bird/android/model/destination/Destination;->getLongitude()D

    move-result-wide v12

    invoke-direct {v9, v10, v11, v12, v13}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v7, v8, v9}, LYw2;->f(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)F

    move-result v7

    int-to-float v8, v0

    cmpg-float v9, v7, v8

    if-gtz v9, :cond_2

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_2
    cmpl-float v8, v7, v8

    if-lez v8, :cond_1

    int-to-float v8, v1

    cmpg-float v7, v7, v8

    if-gtz v7, :cond_1

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result p1

    if-lt p1, v2, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result p1

    sub-int/2addr v2, p1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result p1

    if-gt p1, v2, :cond_5

    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    goto :goto_1

    :cond_5
    invoke-static {v5, v2}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v4, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    :goto_1
    return-object v4

    :cond_6
    return-object p1
.end method

.method public final b()Lg46$b;
    .locals 2

    const-string v0, "show-park-dest-filter"

    invoke-static {v0}, Lg46;->k(Ljava/lang/String;)Lg46$b;

    move-result-object v0

    const-string v1, "tag(\"show-park-dest-filter\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LlA5;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getSetDirty()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LlA5;->c:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public setSetDirty(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LlA5;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method
