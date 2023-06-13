.class public final LNl1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIl1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B!\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0004R \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR \u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\t\u001a\u0004\u0008\u000e\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "LNl1;",
        "LIl1;",
        "Lgl;",
        "a",
        "Lgl;",
        "preference",
        "La94;",
        "Lco/bird/android/model/BountyBirdsFilter;",
        "b",
        "La94;",
        "i",
        "()La94;",
        "bountyFilter",
        "c",
        "j",
        "defaultBountyFilter",
        "LRh6;",
        "userStream",
        "LTq4;",
        "reactiveConfig",
        "<init>",
        "(Lgl;LRh6;LTq4;)V",
        "contractor_release"
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
        "SMAP\nFilterBirdsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterBirdsManagerImpl.kt\nco/bird/android/manager/contractor/FilterBirdsManagerImpl\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,93:1\n81#2,2:94\n180#3:96\n*S KotlinDebug\n*F\n+ 1 FilterBirdsManagerImpl.kt\nco/bird/android/manager/contractor/FilterBirdsManagerImpl\n*L\n30#1:94,2\n65#1:96\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lgl;

.field public final b:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/model/BountyBirdsFilter;",
            ">;"
        }
    .end annotation
.end field

.field public final c:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/model/BountyBirdsFilter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgl;LRh6;LTq4;)V
    .locals 11

    const-string v0, "preference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userStream"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "reactiveConfig"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNl1;->a:Lgl;

    sget-object p1, La94;->h:La94$a;

    new-instance p2, Lco/bird/android/model/BountyBirdsFilter;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v8, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v8}, Lco/bird/android/model/BountyBirdsFilter;-><init>(Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lm46;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, p2, v0, v1, v0}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p2

    iput-object p2, p0, LNl1;->b:La94;

    new-instance p2, Lco/bird/android/model/BountyBirdsFilter;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x3f

    const/4 v10, 0x0

    move-object v2, p2

    invoke-direct/range {v2 .. v10}, Lco/bird/android/model/BountyBirdsFilter;-><init>(Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lco/bird/android/model/IntervalFilter;Lm46;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1, p2, v0, v1, v0}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p1

    iput-object p1, p0, LNl1;->c:La94;

    sget-object p1, Lio/reactivex/rxkotlin/e;->a:Lio/reactivex/rxkotlin/e;

    invoke-virtual {p3}, LTq4;->X2()Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {p3}, LTq4;->T2()Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {p3}, LTq4;->V2()Lio/reactivex/Observable;

    move-result-object v2

    invoke-virtual {p3}, LTq4;->R2()Lio/reactivex/Observable;

    move-result-object v3

    invoke-virtual {p3}, LTq4;->v3()Lio/reactivex/Observable;

    move-result-object v4

    invoke-virtual {p3}, LTq4;->H3()Lio/reactivex/Observable;

    move-result-object v5

    sget-object p1, LD00;->g:LD00$a;

    new-instance v6, LNl1$e;

    invoke-direct {v6, p1}, LNl1$e;-><init>(LD00$a;)V

    invoke-static/range {v0 .. v6}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/k;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "Observable.combineLatest\u20261, t2, t3, t4, t5, t6) })"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, LNl1$a;->g:LNl1$a;

    new-instance p3, LJl1;

    invoke-direct {p3, p2}, LJl1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, LNl1$b;

    invoke-direct {p2, p0}, LNl1$b;-><init>(LNl1;)V

    new-instance p3, LKl1;

    invoke-direct {p3, p2}, LKl1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, LNl1$c;

    invoke-direct {p2, p0}, LNl1$c;-><init>(LNl1;)V

    new-instance p3, LLl1;

    invoke-direct {p3, p2}, LLl1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "Observables.combineLates\u2026ilter() ?: filter\n      }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string p3, "UNBOUND"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p2, LNl1$d;

    invoke-direct {p2, p0}, LNl1$d;-><init>(LNl1;)V

    new-instance p3, LMl1;

    invoke-direct {p3, p2}, LMl1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, p3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 0

    invoke-static {p0, p1}, LNl1;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getPreference$p(LNl1;)Lgl;
    .locals 0

    iget-object p0, p0, LNl1;->a:Lgl;

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/BountyBirdsFilter;
    .locals 0

    invoke-static {p0, p1}, LNl1;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/BountyBirdsFilter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LNl1;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LNl1;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Triple;

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/BountyBirdsFilter;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/BountyBirdsFilter;

    return-object p0
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public i()La94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La94<",
            "Lco/bird/android/model/BountyBirdsFilter;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LNl1;->b:La94;

    return-object v0
.end method

.method public j()La94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La94<",
            "Lco/bird/android/model/BountyBirdsFilter;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LNl1;->c:La94;

    return-object v0
.end method
