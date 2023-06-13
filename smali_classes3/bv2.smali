.class public final Lbv2;
.super Lf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbv2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf1<",
        "Ldv2;",
        "Lev2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0011\u0008\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR:\u0010\u0012\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e \u000f*\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000c0\u000c0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R>\u0010\u0015\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0013 \u000f*\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u000c0\u000c0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0011\u00a8\u0006\u001a"
    }
    d2 = {
        "Lbv2;",
        "Lf1;",
        "Ldv2;",
        "Lev2;",
        "renderer",
        "",
        "q",
        "Lgl;",
        "e",
        "Lgl;",
        "prefs",
        "Lma4;",
        "",
        "LfN1;",
        "",
        "kotlin.jvm.PlatformType",
        "f",
        "Lma4;",
        "hostsEnabledRelay",
        "",
        "g",
        "hostPortRelay",
        "<init>",
        "(Lgl;)V",
        "h",
        "a",
        "co.bird.android.feature.localhost"
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
        "SMAP\nLocalHostPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalHostPresenter.kt\nco/bird/android/feature/localhost/LocalHostPresenter\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n61#2,2:132\n180#3:134\n180#3:135\n180#3:136\n180#3:138\n271#4:137\n12990#5,3:139\n1#6:142\n*S KotlinDebug\n*F\n+ 1 LocalHostPresenter.kt\nco/bird/android/feature/localhost/LocalHostPresenter\n*L\n32#1:132,2\n39#1:134\n54#1:135\n65#1:136\n82#1:138\n75#1:137\n110#1:139,3\n*E\n"
    }
.end annotation


# static fields
.field public static final h:Lbv2$a;


# instance fields
.field public final e:Lgl;

.field public final f:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/util/Map<",
            "LfN1;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public final g:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/util/Map<",
            "LfN1;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbv2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbv2$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbv2;->h:Lbv2$a;

    return-void
.end method

.method public constructor <init>(Lgl;)V
    .locals 7

    const-string v0, "prefs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LTe6;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LTe6;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v0}, Lf1;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lbv2;->e:Lgl;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p1

    const-string v0, "create<Map<Host, Boolean>>()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lbv2;->f:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p1

    const-string v0, "create<Map<Host, Int?>>()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lbv2;->g:Lma4;

    return-void
.end method

.method public static final synthetic access$getHostPortRelay$p(Lbv2;)Lma4;
    .locals 0

    iget-object p0, p0, Lbv2;->g:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getHostsEnabledRelay$p(Lbv2;)Lma4;
    .locals 0

    iget-object p0, p0, Lbv2;->f:Lma4;

    return-object p0
.end method

.method public static final synthetic access$getPrefs$p(Lbv2;)Lgl;
    .locals 0

    iget-object p0, p0, Lbv2;->e:Lgl;

    return-object p0
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

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lbv2;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lbv2;->s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lbv2;->r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lbv2;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic consume(Lrx4;)V
    .locals 0

    check-cast p1, Ldv2;

    invoke-virtual {p0, p1}, Lbv2;->q(Ldv2;)V

    return-void
.end method

.method public q(Ldv2;)V
    .locals 6

    const-string v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lf1;->consume(Lrx4;)V

    sget-object v0, Lee3;->a:Lee3;

    invoke-interface {p1}, Ldv2;->y5()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    iget-object v2, p0, Lbv2;->e:Lgl;

    invoke-static {v2}, Lcv2;->access$getFormattedLocalUrl(Lgl;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "renderer.localAddressCha\u2026ormattedLocalUrl)\n      )"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lbv2;->f:Lma4;

    iget-object v3, p0, Lbv2;->g:Lma4;

    sget-object v4, Lbv2$b;->a:Lbv2$b;

    invoke-static {v0, v2, v3, v4}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/h;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "combineLatest(source1, s\u2026 -> Triple(t1, t2, t3) })"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v2

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v3, Lbv2$d;

    invoke-direct {v3, p0}, Lbv2$d;-><init>(Lbv2;)V

    new-instance v4, LXu2;

    invoke-direct {v4, v3}, LXu2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, Ldv2;->I7()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v3, p0, Lbv2;->f:Lma4;

    invoke-static {v0, v3}, Lio/reactivex/rxkotlin/f;->a(Lio/reactivex/Observable;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v3

    invoke-static {v3}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v3, Lbv2$e;

    invoke-direct {v3, p0}, Lbv2$e;-><init>(Lbv2;)V

    new-instance v4, LYu2;

    invoke-direct {v4, v3}, LYu2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, Ldv2;->j8()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v3, p0, Lbv2;->g:Lma4;

    invoke-static {v0, v3}, Lio/reactivex/rxkotlin/f;->a(Lio/reactivex/Observable;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v3

    invoke-static {v3}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v3, Lbv2$f;

    invoke-direct {v3, p0}, Lbv2$f;-><init>(Lbv2;)V

    new-instance v4, LZu2;

    invoke-direct {v4, v3}, LZu2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, Ldv2;->H0()Lio/reactivex/Observable;

    move-result-object v0

    invoke-interface {p1}, Ldv2;->y5()Lio/reactivex/Observable;

    move-result-object p1

    iget-object v3, p0, Lbv2;->e:Lgl;

    invoke-static {v3}, Lcv2;->access$getFormattedLocalUrl(Lgl;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v1, "renderer.localAddressCha\u2026prefs.formattedLocalUrl))"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lbv2;->f:Lma4;

    iget-object v3, p0, Lbv2;->g:Lma4;

    new-instance v4, Lbv2$c;

    invoke-direct {v4}, Lbv2$c;-><init>()V

    invoke-virtual {v0, p1, v1, v3, v4}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/i;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "withLatestFrom(o1, o2, o\u2026.invoke(t, t1, t2, t3) })"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, Lbv2$g;

    invoke-direct {v0, p0}, Lbv2$g;-><init>(Lbv2;)V

    new-instance v1, Lav2;

    invoke-direct {v1, v0}, Lav2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-static {}, LfN1;->values()[LfN1;

    move-result-object p1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v5, p0, Lbv2;->e:Lgl;

    invoke-virtual {v5, v3}, Lgl;->d0(LfN1;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, p0, Lbv2;->e:Lgl;

    invoke-virtual {v5, v3}, Lgl;->c0(LfN1;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lbv2;->f:Lma4;

    invoke-virtual {v1, p1}, Lma4;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, Lbv2;->g:Lma4;

    invoke-virtual {p1, v0}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method
