.class public final LrS;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000c\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0005\u001a\u00020\u0004H\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "LrS;",
        "",
        "",
        "b",
        "Lco/bird/android/model/wire/configs/Config;",
        "d",
        "LsS;",
        "a",
        "LsS;",
        "f",
        "()LsS;",
        "ui",
        "LpU4;",
        "LpU4;",
        "getRideMapStateManager",
        "()LpU4;",
        "rideMapStateManager",
        "LTq4;",
        "c",
        "LTq4;",
        "e",
        "()LTq4;",
        "reactiveConfig",
        "Lcom/uber/autodispose/ScopeProvider;",
        "Lcom/uber/autodispose/ScopeProvider;",
        "getScopeProvider",
        "()Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "<init>",
        "(LsS;LpU4;LTq4;Lcom/uber/autodispose/ScopeProvider;)V",
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
        "SMAP\nBirdRidePriceBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRidePriceBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/BirdRidePriceBannerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,61:1\n180#2:62\n*S KotlinDebug\n*F\n+ 1 BirdRidePriceBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/BirdRidePriceBannerPresenterImpl\n*L\n53#1:62\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LsS;

.field public final b:LpU4;

.field public final c:LTq4;

.field public final d:Lcom/uber/autodispose/ScopeProvider;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LsS;LpU4;LTq4;Lcom/uber/autodispose/ScopeProvider;)V
    .locals 1

    const-string v0, "ui"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rideMapStateManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrS;->a:LsS;

    iput-object p2, p0, LrS;->b:LpU4;

    iput-object p3, p0, LrS;->c:LTq4;

    iput-object p4, p0, LrS;->d:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LrS;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method


# virtual methods
.method public b()V
    .locals 3

    invoke-virtual {p0}, LrS;->d()Lco/bird/android/model/wire/configs/Config;

    move-result-object v0

    iget-object v1, p0, LrS;->b:LpU4;

    invoke-interface {v1}, LpU4;->g()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getPricingUiConfig()Lco/bird/android/model/wire/configs/PricingUiConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/PricingUiConfig;->getFlightBarPricing()Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->getShowRidePriceInBanners()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LFv0;->a(Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/model/wire/WireRidePrice;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LrS;->a:LsS;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getPricingUiConfig()Lco/bird/android/model/wire/configs/PricingUiConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/PricingUiConfig;->getFlightBarPricing()Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/PricingUiFlightBarConfig;->getAndroidSpecificBannerRidePriceMaxNumberOfLines()I

    move-result v0

    invoke-interface {v2, v1, v0}, LsS;->Ji(Lco/bird/android/model/wire/WireRidePrice;I)V

    iget-object v0, p0, LrS;->a:LsS;

    invoke-interface {v0}, LsS;->G1()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v2, LrS$a;

    invoke-direct {v2, v1, p0}, LrS$a;-><init>(Lco/bird/android/model/wire/WireRidePrice;LrS;)V

    new-instance v1, LqS;

    invoke-direct {v1, v2}, LqS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun configurePr\u2026r)\n      .subscribe()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LrS;->d:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method

.method public final d()Lco/bird/android/model/wire/configs/Config;
    .locals 2

    iget-object v0, p0, LrS;->c:LTq4;

    iget-object v1, p0, LrS;->b:LpU4;

    invoke-interface {v1}, LpU4;->g()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireBird;

    invoke-static {v0, v1}, LUq4;->c(LTq4;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v0

    return-object v0
.end method

.method public final e()LTq4;
    .locals 1

    iget-object v0, p0, LrS;->c:LTq4;

    return-object v0
.end method

.method public final f()LsS;
    .locals 1

    iget-object v0, p0, LrS;->a:LsS;

    return-object v0
.end method
