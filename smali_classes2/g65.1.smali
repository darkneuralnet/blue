.class public final Lg65;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B/\u0008\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\t\u0012\u0008\u0008\u0001\u0010\u0010\u001a\u00020\r\u0012\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0002R\u0014\u0010\u0008\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0012\u00a8\u0006\u0016"
    }
    d2 = {
        "Lg65;",
        "",
        "",
        "e",
        "d",
        "LYR4;",
        "a",
        "LYR4;",
        "rideManager",
        "Lcom/uber/autodispose/ScopeProvider;",
        "b",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "LZr1;",
        "c",
        "LZr1;",
        "flightBannerCoordinatorPresenter",
        "LP75;",
        "LP75;",
        "rideUi",
        "<init>",
        "(LYR4;Lcom/uber/autodispose/ScopeProvider;LZr1;LP75;)V",
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
        "SMAP\nRideStartInBadAreaPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStartInBadAreaPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideStartInBadAreaPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,71:1\n180#2:72\n180#2:73\n*S KotlinDebug\n*F\n+ 1 RideStartInBadAreaPresenter.kt\nco/bird/android/app/feature/ride/presenter/RideStartInBadAreaPresenterImpl\n*L\n41#1:72\n49#1:73\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LYR4;

.field public final b:Lcom/uber/autodispose/ScopeProvider;

.field public final c:LZr1;

.field public final d:LP75;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LYR4;Lcom/uber/autodispose/ScopeProvider;LZr1;LP75;)V
    .locals 1

    const-string v0, "rideManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flightBannerCoordinatorPresenter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rideUi"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg65;->a:LYR4;

    iput-object p2, p0, Lg65;->b:Lcom/uber/autodispose/ScopeProvider;

    iput-object p3, p0, Lg65;->c:LZr1;

    iput-object p4, p0, Lg65;->d:LP75;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lg65;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$disableRideStartBanners(Lg65;)V
    .locals 0

    invoke-virtual {p0}, Lg65;->d()V

    return-void
.end method

.method public static final synthetic access$getFlightBannerCoordinatorPresenter$p(Lg65;)LZr1;
    .locals 0

    iget-object p0, p0, Lg65;->c:LZr1;

    return-object p0
.end method

.method public static final synthetic access$getRideManager$p(Lg65;)LYR4;
    .locals 0

    iget-object p0, p0, Lg65;->a:LYR4;

    return-object p0
.end method

.method public static final synthetic access$getRideUi$p(Lg65;)LP75;
    .locals 0

    iget-object p0, p0, Lg65;->d:LP75;

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lg65;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lg65;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    iget-object v0, p0, Lg65;->c:LZr1;

    sget-object v1, Lco/bird/android/model/FlightBannerNode$FlightBanner;->RIDE_START_OUTSIDE_OPERATING_AREA:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {v0, v1}, LZr1;->N1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    iget-object v0, p0, Lg65;->c:LZr1;

    sget-object v1, Lco/bird/android/model/FlightBannerNode$FlightBanner;->RIDE_START_IN_NO_RIDE_AREA:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {v0, v1}, LZr1;->N1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    return-void
.end method

.method public e()V
    .locals 4

    iget-object v0, p0, Lg65;->a:LYR4;

    invoke-interface {v0}, LYR4;->D()LZ84;

    move-result-object v0

    sget-object v1, Lg65$a;->g:Lg65$a;

    new-instance v2, Ld65;

    invoke-direct {v2, v1}, Ld65;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "rideManager.badAreaRideE\u2026dSchedulers.mainThread())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lg65;->b:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, Lg65$b;

    invoke-direct {v2, p0}, Lg65$b;-><init>(Lg65;)V

    new-instance v3, Le65;

    invoke-direct {v3, v2}, Le65;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lg65;->a:LYR4;

    invoke-interface {v0}, LYR4;->F()LZ84;

    move-result-object v0

    iget-object v2, p0, Lg65;->b:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lg65$c;

    invoke-direct {v1, p0}, Lg65$c;-><init>(Lg65;)V

    new-instance v2, Lf65;

    invoke-direct {v2, v1}, Lf65;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method
