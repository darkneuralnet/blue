.class public final LjA1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LfA1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B9\u0008\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000c\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016J\u0008\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006!"
    }
    d2 = {
        "LjA1;",
        "LfA1;",
        "",
        "a",
        "b",
        "i",
        "",
        "tabIndex",
        "j",
        "Lco/bird/android/model/wire/WireFrequentFlyerView;",
        "Lco/bird/android/model/wire/WireFrequentFlyerView;",
        "data",
        "LnA1;",
        "LnA1;",
        "ui",
        "LTq4;",
        "c",
        "LTq4;",
        "reactiveConfig",
        "Le13;",
        "d",
        "Le13;",
        "navigator",
        "Lcom/uber/autodispose/ScopeProvider;",
        "e",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "LEa;",
        "f",
        "LEa;",
        "analyticsManager",
        "<init>",
        "(Lco/bird/android/model/wire/WireFrequentFlyerView;LnA1;LTq4;Le13;Lcom/uber/autodispose/ScopeProvider;LEa;)V",
        "frequent-flyer_release"
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
        "SMAP\nFrequentFlyerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrequentFlyerPresenter.kt\nco/bird/android/feature/frequentFlyer/FrequentFlyerPresenterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,92:1\n1549#2:93\n1620#2,3:94\n180#3:97\n180#3:98\n180#3:99\n*S KotlinDebug\n*F\n+ 1 FrequentFlyerPresenter.kt\nco/bird/android/feature/frequentFlyer/FrequentFlyerPresenterImpl\n*L\n36#1:93\n36#1:94,3\n47#1:97\n54#1:98\n60#1:99\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/model/wire/WireFrequentFlyerView;

.field public final b:LnA1;

.field public final c:LTq4;

.field public final d:Le13;

.field public final e:Lcom/uber/autodispose/ScopeProvider;

.field public final f:LEa;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireFrequentFlyerView;LnA1;LTq4;Le13;Lcom/uber/autodispose/ScopeProvider;LEa;)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LjA1;->a:Lco/bird/android/model/wire/WireFrequentFlyerView;

    iput-object p2, p0, LjA1;->b:LnA1;

    iput-object p3, p0, LjA1;->c:LTq4;

    iput-object p4, p0, LjA1;->d:Le13;

    iput-object p5, p0, LjA1;->e:Lcom/uber/autodispose/ScopeProvider;

    iput-object p6, p0, LjA1;->f:LEa;

    return-void
.end method

.method public static final synthetic access$getData$p(LjA1;)Lco/bird/android/model/wire/WireFrequentFlyerView;
    .locals 0

    iget-object p0, p0, LjA1;->a:Lco/bird/android/model/wire/WireFrequentFlyerView;

    return-object p0
.end method

.method public static final synthetic access$getUi$p(LjA1;)LnA1;
    .locals 0

    iget-object p0, p0, LjA1;->b:LnA1;

    return-object p0
.end method

.method public static final synthetic access$onTermsClicked(LjA1;)V
    .locals 0

    invoke-virtual {p0}, LjA1;->i()V

    return-void
.end method

.method public static final synthetic access$trackLoyaltyBenefitsTabViewed(LjA1;I)V
    .locals 0

    invoke-virtual {p0, p1}, LjA1;->j(I)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LjA1;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LjA1;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LjA1;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
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
.method public a()V
    .locals 9

    iget-object v0, p0, LjA1;->b:LnA1;

    iget-object v1, p0, LjA1;->a:Lco/bird/android/model/wire/WireFrequentFlyerView;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireFrequentFlyerView;->getProgress()Lco/bird/android/model/wire/WireFrequentFlyerProgress;

    move-result-object v1

    invoke-interface {v0, v1}, LnA1;->oi(Lco/bird/android/model/wire/WireFrequentFlyerProgress;)V

    iget-object v0, p0, LjA1;->b:LnA1;

    iget-object v1, p0, LjA1;->a:Lco/bird/android/model/wire/WireFrequentFlyerView;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireFrequentFlyerView;->getHeaderLevel()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, LjA1;->a:Lco/bird/android/model/wire/WireFrequentFlyerView;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireFrequentFlyerView;->getHeadline()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LjA1;->a:Lco/bird/android/model/wire/WireFrequentFlyerView;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireFrequentFlyerView;->getTierViews()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/wire/WireTierView;

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireTierView;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v3, p0, LjA1;->a:Lco/bird/android/model/wire/WireFrequentFlyerView;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireFrequentFlyerView;->getSelectedLevelIndex()I

    move-result v3

    new-instance v5, LDz1$c;

    invoke-direct {v5, v1, v2, v4, v3}, LDz1$c;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;I)V

    invoke-interface {v0, v5}, LnA1;->d9(LDz1$c;)V

    iget-object v0, p0, LjA1;->b:LnA1;

    new-instance v1, LDz1$b;

    iget-object v2, p0, LjA1;->c:LTq4;

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getFrequentFlyer()Lco/bird/android/model/wire/configs/FrequentFlyerConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->getFaqZendeskArticleId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    iget-object v4, p0, LjA1;->c:LTq4;

    invoke-virtual {v4}, LTq4;->f8()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/Config;->getFrequentFlyer()Lco/bird/android/model/wire/configs/FrequentFlyerConfig;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->getTermsZendeskArticleId()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :cond_2
    invoke-direct {v1, v2, v3}, LDz1$b;-><init>(Ljava/lang/Long;Ljava/lang/Long;)V

    invoke-interface {v0, v1}, LnA1;->ij(LDz1$b;)V

    iget-object v0, p0, LjA1;->b:LnA1;

    invoke-interface {v0}, LnA1;->fc()Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "ui.selectedTab()\n      .\u2026dSchedulers.mainThread())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LjA1;->e:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LjA1$a;

    invoke-direct {v2, p0}, LjA1$a;-><init>(LjA1;)V

    new-instance v3, LgA1;

    invoke-direct {v3, v2}, LgA1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LjA1;->b:LnA1;

    invoke-interface {v0}, LnA1;->Cf()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v2, p0, LjA1;->e:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LjA1$b;

    invoke-direct {v2, p0}, LjA1$b;-><init>(LjA1;)V

    new-instance v3, LhA1;

    invoke-direct {v3, v2}, LhA1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LjA1;->b:LnA1;

    invoke-interface {v0}, LnA1;->m2()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v2, p0, LjA1;->e:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, LjA1$c;

    invoke-direct {v1, p0}, LjA1$c;-><init>(LjA1;)V

    new-instance v2, LiA1;

    invoke-direct {v2, v1}, LiA1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LjA1;->f:LEa;

    new-instance v8, LjE2;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v1, p0, LjA1;->a:Lco/bird/android/model/wire/WireFrequentFlyerView;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireFrequentFlyerView;->getHeadline()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LjE2;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v8}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public b()V
    .locals 4

    iget-object v0, p0, LjA1;->c:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getFrequentFlyer()Lco/bird/android/model/wire/configs/FrequentFlyerConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->getFaqZendeskArticleId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LjA1;->d:Le13;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Le13;->w3(J)V

    :cond_0
    return-void
.end method

.method public final i()V
    .locals 9

    iget-object v0, p0, LjA1;->c:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getFrequentFlyer()Lco/bird/android/model/wire/configs/FrequentFlyerConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->getTermsZendeskArticleId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LjA1;->d:Le13;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Le13;->w3(J)V

    :cond_0
    iget-object v0, p0, LjA1;->f:LEa;

    new-instance v8, LkE2;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v1, p0, LjA1;->a:Lco/bird/android/model/wire/WireFrequentFlyerView;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireFrequentFlyerView;->getHeadline()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LkE2;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v8}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public final j(I)V
    .locals 8

    iget-object v0, p0, LjA1;->a:Lco/bird/android/model/wire/WireFrequentFlyerView;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireFrequentFlyerView;->getTierViews()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireTierView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireTierView;->getTitle()Ljava/lang/String;

    move-result-object v4

    iget-object p1, p0, LjA1;->f:LEa;

    new-instance v7, LiE2;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LiE2;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v7}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method
