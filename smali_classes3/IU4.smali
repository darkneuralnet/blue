.class public final LIU4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/FlightBanner;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B?\u0008\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u0012\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0010\u0012\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0014\u0012\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "LIU4;",
        "Lco/bird/android/model/FlightBanner;",
        "",
        "onBannerShown",
        "LWU4;",
        "a",
        "LWU4;",
        "ridePassManager",
        "LEa;",
        "b",
        "LEa;",
        "analyticsManager",
        "LTq4;",
        "c",
        "LTq4;",
        "reactiveConfig",
        "LMU4;",
        "d",
        "LMU4;",
        "ui",
        "Le13;",
        "e",
        "Le13;",
        "navigator",
        "Lcom/uber/autodispose/ScopeProvider;",
        "f",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "<init>",
        "(LWU4;LEa;LTq4;LMU4;Le13;Lcom/uber/autodispose/ScopeProvider;)V",
        "ride-pass_release"
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
        "SMAP\nRidePassBannerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassBannerPresenterImpl.kt\nco/bird/android/feature/ridepass/view/RidePassBannerPresenterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,82:1\n766#2:83\n857#2,2:84\n766#2:87\n857#2,2:88\n1747#2,3:90\n1#3:86\n180#4:93\n*S KotlinDebug\n*F\n+ 1 RidePassBannerPresenterImpl.kt\nco/bird/android/feature/ridepass/view/RidePassBannerPresenterImpl\n*L\n39#1:83\n39#1:84,2\n40#1:87\n40#1:88,2\n50#1:90,3\n61#1:93\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LWU4;

.field public final b:LEa;

.field public final c:LTq4;

.field public final d:LMU4;

.field public final e:Le13;

.field public final f:Lcom/uber/autodispose/ScopeProvider;


# direct methods
.method public constructor <init>(LWU4;LEa;LTq4;LMU4;Le13;Lcom/uber/autodispose/ScopeProvider;)V
    .locals 1

    const-string v0, "ridePassManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIU4;->a:LWU4;

    iput-object p2, p0, LIU4;->b:LEa;

    iput-object p3, p0, LIU4;->c:LTq4;

    iput-object p4, p0, LIU4;->d:LMU4;

    iput-object p5, p0, LIU4;->e:Le13;

    iput-object p6, p0, LIU4;->f:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LIU4;->b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getAnalyticsManager$p(LIU4;)LEa;
    .locals 0

    iget-object p0, p0, LIU4;->b:LEa;

    return-object p0
.end method

.method public static final synthetic access$getNavigator$p(LIU4;)Le13;
    .locals 0

    iget-object p0, p0, LIU4;->e:Le13;

    return-object p0
.end method

.method public static final synthetic access$getReactiveConfig$p(LIU4;)LTq4;
    .locals 0

    iget-object p0, p0, LIU4;->c:LTq4;

    return-object p0
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public closeImmediately()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lco/bird/android/model/FlightBanner$DefaultImpls;->closeImmediately(Lco/bird/android/model/FlightBanner;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public onBannerRemoved()V
    .locals 0

    invoke-static {p0}, Lco/bird/android/model/FlightBanner$DefaultImpls;->onBannerRemoved(Lco/bird/android/model/FlightBanner;)V

    return-void
.end method

.method public onBannerShown()V
    .locals 13

    iget-object v0, p0, LIU4;->a:LWU4;

    invoke-interface {v0}, LWU4;->E0()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/RidePassView;->isIneligible()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    move-object v1, v4

    :goto_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {v6}, Lco/bird/android/model/persistence/RidePassView;->isAvailable()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v3

    if-eqz v0, :cond_5

    move-object v4, v2

    :cond_5
    if-nez v1, :cond_6

    move-object v1, v4

    :cond_6
    if-eqz v1, :cond_c

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/RidePassView;

    iget-object v2, p0, LIU4;->d:LMU4;

    iget-object v4, p0, LIU4;->c:LTq4;

    invoke-virtual {v4}, LTq4;->f8()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/Config;->getRidePass()Lco/bird/android/model/wire/configs/RidePassConfig;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/RidePassConfig;->getEnabledV2()Z

    move-result v4

    invoke-interface {v2, v1, v4}, LMU4;->b(Ljava/util/List;Z)V

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_8

    :cond_7
    move v3, v4

    goto :goto_3

    :cond_8
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {v5}, Lco/bird/android/model/persistence/RidePassView;->isIneligible()Z

    move-result v5

    if-eqz v5, :cond_9

    :goto_3
    if-eqz v3, :cond_b

    iget-object v2, p0, LIU4;->b:LEa;

    new-instance v12, LVU4;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getUserRidePassId()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_a

    const-string v3, ""

    :cond_a
    move-object v7, v3

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getLinkCode()Ljava/lang/String;

    move-result-object v8

    const-string v9, "banner"

    const/4 v10, 0x7

    const/4 v11, 0x0

    move-object v3, v12

    invoke-direct/range {v3 .. v11}, LVU4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v12}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    goto :goto_4

    :cond_b
    iget-object v2, p0, LIU4;->b:LEa;

    new-instance v10, LzV4;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getLinkCode()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x7

    const/4 v9, 0x0

    move-object v3, v10

    invoke-direct/range {v3 .. v9}, LzV4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v10}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :goto_4
    iget-object v2, p0, LIU4;->d:LMU4;

    invoke-interface {v2}, LMU4;->a()Lio/reactivex/Observable;

    move-result-object v2

    iget-object v3, p0, LIU4;->f:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v3}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v3, LIU4$a;

    invoke-direct {v3, v1, p0, v0}, LIU4$a;-><init>(Ljava/util/List;LIU4;Lco/bird/android/model/persistence/RidePassView;)V

    new-instance v0, LHU4;

    invoke-direct {v0, v3}, LHU4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v2, v0}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    :cond_c
    return-void
.end method
