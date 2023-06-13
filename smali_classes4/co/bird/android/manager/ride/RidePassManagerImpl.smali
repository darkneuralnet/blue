.class public final Lco/bird/android/manager/ride/RidePassManagerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWU4;
.implements LFq2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\u0008\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u00104\u001a\u000203\u00a2\u0006\u0004\u00085\u00106J\u000e\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0008H\u0016J\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\t\u001a\u00020\u0008H\u0016J \u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0013*\u0008\u0012\u0004\u0012\u00020\u000b0\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR5\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u001e*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00130\u00130\u001d8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u001f\u001a\u0004\u0008 \u0010!R\'\u0010%\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u00130\u001d8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u001f\u001a\u0004\u0008$\u0010!R\'\u0010(\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u00130\u001d8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u001f\u001a\u0004\u0008\'\u0010!R\'\u0010+\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u00130\u001d8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008)\u0010\u001f\u001a\u0004\u0008*\u0010!R\'\u0010.\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u00130\u001d8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008,\u0010\u001f\u001a\u0004\u0008-\u0010!R \u00102\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u00130/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101\u00a8\u00067"
    }
    d2 = {
        "Lco/bird/android/manager/ride/RidePassManagerImpl;",
        "LWU4;",
        "LFq2;",
        "Lio/reactivex/Observable;",
        "",
        "enabled",
        "Lio/reactivex/c;",
        "refresh",
        "",
        "linkCode",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/persistence/RidePassView;",
        "G0",
        "y0",
        "ridePass",
        "d",
        "userSubscriptionId",
        "C0",
        "O",
        "",
        "t",
        "LGX4;",
        "b",
        "LGX4;",
        "ridePassViewRepository",
        "LTq4;",
        "c",
        "LTq4;",
        "reactiveConfig",
        "LZ84;",
        "kotlin.jvm.PlatformType",
        "Lkotlin/Lazy;",
        "E0",
        "()LZ84;",
        "ridePasses",
        "e",
        "getPromotedRidePasses",
        "promotedRidePasses",
        "f",
        "F0",
        "activeRidePasses",
        "g",
        "getAvailableRidePasses",
        "availableRidePasses",
        "h",
        "D0",
        "ineligibleRidePasses",
        "La94;",
        "i",
        "La94;",
        "ridePassesRelay",
        "LRh6;",
        "userStream",
        "<init>",
        "(LGX4;LTq4;LRh6;)V",
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
        "SMAP\nRidePassManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n180#2:139\n180#2:142\n52#3,2:140\n766#4:143\n857#4,2:144\n*S KotlinDebug\n*F\n+ 1 RidePassManagerImpl.kt\nco/bird/android/manager/ride/RidePassManagerImpl\n*L\n71#1:139\n85#1:142\n79#1:140,2\n134#1:143\n134#1:144,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LGX4;

.field public final c:LTq4;

.field public final d:Lkotlin/Lazy;

.field public final e:Lkotlin/Lazy;

.field public final f:Lkotlin/Lazy;

.field public final g:Lkotlin/Lazy;

.field public final h:Lkotlin/Lazy;

.field public final i:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LGX4;LTq4;LRh6;)V
    .locals 5

    const-string v0, "ridePassViewRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userStream"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->b:LGX4;

    iput-object p2, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->c:LTq4;

    new-instance v0, Lco/bird/android/manager/ride/RidePassManagerImpl$k;

    invoke-direct {v0, p0}, Lco/bird/android/manager/ride/RidePassManagerImpl$k;-><init>(Lco/bird/android/manager/ride/RidePassManagerImpl;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->d:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/manager/ride/RidePassManagerImpl$j;

    invoke-direct {v0, p0}, Lco/bird/android/manager/ride/RidePassManagerImpl$j;-><init>(Lco/bird/android/manager/ride/RidePassManagerImpl;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->e:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/manager/ride/RidePassManagerImpl$f;

    invoke-direct {v0, p0}, Lco/bird/android/manager/ride/RidePassManagerImpl$f;-><init>(Lco/bird/android/manager/ride/RidePassManagerImpl;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->f:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/manager/ride/RidePassManagerImpl$g;

    invoke-direct {v0, p0}, Lco/bird/android/manager/ride/RidePassManagerImpl$g;-><init>(Lco/bird/android/manager/ride/RidePassManagerImpl;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->g:Lkotlin/Lazy;

    new-instance v0, Lco/bird/android/manager/ride/RidePassManagerImpl$i;

    invoke-direct {v0, p0}, Lco/bird/android/manager/ride/RidePassManagerImpl$i;-><init>(Lco/bird/android/manager/ride/RidePassManagerImpl;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->h:Lkotlin/Lazy;

    sget-object v0, La94;->h:La94$a;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->i:La94;

    invoke-interface {p3}, LRh6;->i()Lio/reactivex/Observable;

    move-result-object p3

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

    new-instance v3, Lco/bird/android/manager/ride/RidePassManagerImpl$a;

    invoke-direct {v3, p0}, Lco/bird/android/manager/ride/RidePassManagerImpl$a;-><init>(Lco/bird/android/manager/ride/RidePassManagerImpl;)V

    new-instance v4, LXU4;

    invoke-direct {v4, v3}, LXU4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p3, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    sget-object p3, Lee3;->a:Lee3;

    invoke-interface {p1}, LGX4;->t1()Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p2}, LTq4;->f8()LZ84;

    move-result-object p2

    sget-object p3, Lco/bird/android/manager/ride/RidePassManagerImpl$b;->g:Lco/bird/android/manager/ride/RidePassManagerImpl$b;

    new-instance v3, LYU4;

    invoke-direct {v3, p3}, LYU4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p2

    invoke-virtual {p2}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object p2

    const-string p3, "reactiveConfig.config.ma\u2026 }.distinctUntilChanged()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Lco/bird/android/manager/ride/RidePassManagerImpl$l;->a:Lco/bird/android/manager/ride/RidePassManagerImpl$l;

    invoke-static {p1, p2, p3}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "combineLatest(source1, s\u2026, t2: T2 -> (t1 to t2) })"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lco/bird/android/manager/ride/RidePassManagerImpl$c;->g:Lco/bird/android/manager/ride/RidePassManagerImpl$c;

    new-instance p3, LZU4;

    invoke-direct {p3, p2}, LZU4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p1

    const-wide/16 p2, 0x1

    invoke-virtual {p1, p2, p3}, Lio/reactivex/Observable;->retry(J)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "Observables.combineLates\u2026base.\") }\n      .retry(1)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p2, Lco/bird/android/manager/ride/RidePassManagerImpl$d;

    invoke-direct {p2, p0}, Lco/bird/android/manager/ride/RidePassManagerImpl$d;-><init>(Lco/bird/android/manager/ride/RidePassManagerImpl;)V

    new-instance p3, LaV4;

    invoke-direct {p3, p2}, LaV4;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object p2, Lco/bird/android/manager/ride/RidePassManagerImpl$e;->g:Lco/bird/android/manager/ride/RidePassManagerImpl$e;

    new-instance v0, LbV4;

    invoke-direct {v0, p2}, LbV4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, p3, v0}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/RidePassManagerImpl;->n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$filterPassesByConfigIfNeeded(Lco/bird/android/manager/ride/RidePassManagerImpl;Ljava/util/List;Z)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/manager/ride/RidePassManagerImpl;->t(Ljava/util/List;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getReactiveConfig$p(Lco/bird/android/manager/ride/RidePassManagerImpl;)LTq4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->c:LTq4;

    return-object p0
.end method

.method public static final synthetic access$getRidePassViewRepository$p(Lco/bird/android/manager/ride/RidePassManagerImpl;)LGX4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->b:LGX4;

    return-object p0
.end method

.method public static final synthetic access$getRidePassesRelay$p(Lco/bird/android/manager/ride/RidePassManagerImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->i:La94;

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/RidePassManagerImpl;->o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/RidePassManagerImpl;->p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/RidePassManagerImpl;->q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/RidePassManagerImpl;->s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/RidePassManagerImpl;->l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method public C0(Ljava/lang/String;)Lio/reactivex/c;
    .locals 1

    const-string v0, "userSubscriptionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->b:LGX4;

    invoke-interface {v0, p1}, LGX4;->C0(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "ridePassViewRepository.c\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public D0()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->h:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public E0()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->d:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public F0()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->f:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public G0(Ljava/lang/String;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;"
        }
    .end annotation

    const-string v0, "linkCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->b:LGX4;

    invoke-interface {v0, p1}, LGX4;->P0(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "ridePassViewRepository.g\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public O(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;"
        }
    .end annotation

    const-string v0, "linkCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->b:LGX4;

    invoke-interface {v0, p1}, LGX4;->O(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "ridePassViewRepository.s\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public d(Lco/bird/android/model/persistence/RidePassView;)Lio/reactivex/c;
    .locals 1

    const-string v0, "ridePass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->b:LGX4;

    invoke-interface {v0, p1}, LGX4;->d(Lco/bird/android/model/persistence/RidePassView;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "ridePassViewRepository.t\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public enabled()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lco/bird/android/manager/ride/RidePassManagerImpl;->E0()LZ84;

    move-result-object v0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->defaultIfEmpty(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/ride/RidePassManagerImpl$h;

    invoke-direct {v1, p0}, Lco/bird/android/manager/ride/RidePassManagerImpl$h;-><init>(Lco/bird/android/manager/ride/RidePassManagerImpl;)V

    new-instance v2, LcV4;

    invoke-direct {v2, v1}, LcV4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun enabled(): \u2026it.isNotEmpty()\n    }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public refresh()Lio/reactivex/c;
    .locals 2

    iget-object v0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->b:LGX4;

    invoke-interface {v0}, LGX4;->L0()Lio/reactivex/c;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "ridePassViewRepository.f\u2026scribeOn(Schedulers.io())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final t(Ljava/util/List;Z)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;Z)",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;"
        }
    .end annotation

    if-eqz p2, :cond_0

    goto :goto_1

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/RidePassView;->isPurchased()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object p1, p2

    :goto_1
    return-object p1
.end method

.method public y0(Ljava/lang/String;)Lio/reactivex/c;
    .locals 1

    const-string v0, "linkCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/ride/RidePassManagerImpl;->b:LGX4;

    invoke-interface {v0, p1}, LGX4;->y0(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "ridePassViewRepository.b\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
