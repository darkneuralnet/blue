.class public final LUz1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQz1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B!\u0008\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR5\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \r*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000c0\u000c0\u000b8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u000c0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u001d"
    }
    d2 = {
        "LUz1;",
        "LQz1;",
        "Lco/bird/android/model/wire/WireFrequentFlyerView;",
        "view",
        "",
        "g",
        "(Lco/bird/android/model/wire/WireFrequentFlyerView;)V",
        "LPz1;",
        "a",
        "LPz1;",
        "client",
        "LZ84;",
        "Lco/bird/android/buava/Optional;",
        "kotlin.jvm.PlatformType",
        "b",
        "Lkotlin/Lazy;",
        "getData",
        "()LZ84;",
        "data",
        "La94;",
        "c",
        "La94;",
        "mutableData",
        "LRh6;",
        "userStream",
        "LTq4;",
        "config",
        "<init>",
        "(LPz1;LRh6;LTq4;)V",
        "ride_release"
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
        "SMAP\nFrequentFlyerManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrequentFlyerManagerImpl.kt\nco/bird/android/manager/ride/FrequentFlyerManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,62:1\n180#2:63\n180#2:64\n*S KotlinDebug\n*F\n+ 1 FrequentFlyerManagerImpl.kt\nco/bird/android/manager/ride/FrequentFlyerManagerImpl\n*L\n46#1:63\n51#1:64\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LPz1;

.field public final b:Lkotlin/Lazy;

.field public final c:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireFrequentFlyerView;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LPz1;LRh6;LTq4;)V
    .locals 3

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userStream"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUz1;->a:LPz1;

    new-instance p1, LUz1$d;

    invoke-direct {p1, p0}, LUz1$d;-><init>(LUz1;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LUz1;->b:Lkotlin/Lazy;

    sget-object p1, La94;->h:La94$a;

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, La94$a;->createNonRedundant$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p1

    iput-object p1, p0, LUz1;->c:La94;

    invoke-virtual {p3}, LTq4;->f8()LZ84;

    move-result-object p3

    sget-object v0, LUz1$a;->g:LUz1$a;

    new-instance v1, LRz1;

    invoke-direct {v1, v0}, LRz1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p3, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p3

    invoke-virtual {p3}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object p3

    new-instance v0, LUz1$b;

    invoke-direct {v0, p2, p0}, LUz1$b;-><init>(LRh6;LUz1;)V

    new-instance v1, LSz1;

    invoke-direct {v1, v0}, LSz1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p3, v1}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p3

    const-string v0, "config.config.map { it.f\u2026sent())\n        }\n      }"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string v1, "UNBOUND"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {p3, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p3

    const-string v2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/uber/autodispose/ObservableSubscribeProxy;

    invoke-interface {p3, p1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p2}, LRh6;->i()Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p2, LUz1$c;

    invoke-direct {p2, p0}, LUz1$c;-><init>(LUz1;)V

    new-instance p3, LTz1;

    invoke-direct {p3, p2}, LTz1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, p3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LUz1;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getClient$p(LUz1;)LPz1;
    .locals 0

    iget-object p0, p0, LUz1;->a:LPz1;

    return-object p0
.end method

.method public static final synthetic access$getMutableData$p(LUz1;)La94;
    .locals 0

    iget-object p0, p0, LUz1;->c:La94;

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, LUz1;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LUz1;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final g(Lco/bird/android/model/wire/WireFrequentFlyerView;)V
    .locals 2

    iget-object v0, p0, LUz1;->c:La94;

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v1, p1}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {v0, p1}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public getData()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireFrequentFlyerView;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LUz1;->b:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method
