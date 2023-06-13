.class public final Laq1;
.super Lf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laq1$a;,
        Laq1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf1<",
        "Lgq1;",
        "Llq1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u001aB\u0011\u0008\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J*\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0007*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00080\u0007H\u0002J\u000c\u0010\u000f\u001a\u00020\u000e*\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0014\u00a8\u0006\u001b"
    }
    d2 = {
        "Laq1;",
        "Lf1;",
        "Lgq1;",
        "Llq1;",
        "renderer",
        "",
        "x",
        "Lio/reactivex/Observable;",
        "Lkotlin/Triple;",
        "",
        "Lco/bird/android/model/persistence/FleetReportPeriod;",
        "Lco/bird/android/model/constant/FleetReportPage;",
        "Lco/bird/android/model/persistence/FleetReport;",
        "K",
        "Lio/reactivex/c;",
        "H",
        "",
        "e",
        "G",
        "LHp1;",
        "LHp1;",
        "manager",
        "<init>",
        "(LHp1;)V",
        "f",
        "a",
        "b",
        "co.bird.android.feature.fleet-status"
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
        "SMAP\nFleetReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportPresenter.kt\nco/bird/android/feature/fleetstatus/kpi/core/FleetReportPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,116:1\n180#2:117\n180#2:118\n*S KotlinDebug\n*F\n+ 1 FleetReportPresenter.kt\nco/bird/android/feature/fleetstatus/kpi/core/FleetReportPresenter\n*L\n54#1:117\n66#1:118\n*E\n"
    }
.end annotation


# static fields
.field public static final f:Laq1$a;


# instance fields
.field public final e:LHp1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Laq1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Laq1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Laq1;->f:Laq1$a;

    return-void
.end method

.method public constructor <init>(LHp1;)V
    .locals 7

    const-string v0, "manager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llq1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Llq1;-><init>(Lco/bird/android/model/persistence/FleetReport;Ljava/util/List;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v0}, Lf1;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Laq1;->e:LHp1;

    return-void
.end method

.method public static final A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/persistence/FleetReportPeriod;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/persistence/FleetReportPeriod;

    return-object p0
.end method

.method public static final B(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Triple;

    return-object p0
.end method

.method public static final C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final D(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method

.method public static final E(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final I(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final synthetic access$getManager$p(Laq1;)LHp1;
    .locals 0

    iget-object p0, p0, Laq1;->e:LHp1;

    return-object p0
.end method

.method public static final synthetic access$onError(Laq1;Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1}, Laq1;->G(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final synthetic access$progress(Laq1;Lio/reactivex/c;)Lio/reactivex/c;
    .locals 0

    invoke-virtual {p0, p1}, Laq1;->H(Lio/reactivex/c;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1, p2}, Laq1;->D(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Laq1;->C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Laq1;->F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Laq1;->E(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Laq1;->L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Laq1;->J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Laq1;->I(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic t(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1, p2}, Laq1;->y(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/persistence/FleetReportPeriod;
    .locals 0

    invoke-static {p0, p1}, Laq1;->A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/persistence/FleetReportPeriod;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Laq1;->B(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Laq1;->z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static final y(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method

.method public static final z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method


# virtual methods
.method public final G(Ljava/lang/Throwable;)V
    .locals 1

    invoke-static {p1}, Lbg5;->i(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    new-instance v0, Laq1$k;

    invoke-direct {v0, p1}, Laq1$k;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lf1;->i(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final H(Lio/reactivex/c;)Lio/reactivex/c;
    .locals 2

    new-instance v0, Laq1$l;

    invoke-direct {v0, p0}, Laq1$l;-><init>(Laq1;)V

    new-instance v1, LPp1;

    invoke-direct {v1, v0}, LPp1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->E(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, Laq1$m;

    invoke-direct {v0, p0}, Laq1$m;-><init>(Laq1;)V

    new-instance v1, LRp1;

    invoke-direct {v1, v0}, LRp1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->C(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "private fun Completable.\u2026oading - 1) }\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final K(Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "Lkotlin/Triple<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/persistence/FleetReportPeriod;",
            "Lco/bird/android/model/constant/FleetReportPage;",
            ">;>;)",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/FleetReport;",
            ">;"
        }
    .end annotation

    new-instance v0, Laq1$n;

    invoke-direct {v0, p0}, Laq1$n;-><init>(Laq1;)V

    new-instance v1, LQp1;

    invoke-direct {v1, v0}, LQp1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "private fun Observable<T\u2026.toObservable()\n    }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic consume(Lrx4;)V
    .locals 0

    check-cast p1, Lgq1;

    invoke-virtual {p0, p1}, Laq1;->x(Lgq1;)V

    return-void
.end method

.method public x(Lgq1;)V
    .locals 5

    const-string v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lf1;->consume(Lrx4;)V

    invoke-interface {p1}, Lgq1;->k2()Lio/reactivex/Observable;

    move-result-object v0

    invoke-interface {p1}, Lgq1;->d5()Lio/reactivex/Observable;

    move-result-object v1

    invoke-interface {p1}, Lgq1;->e4()Lio/reactivex/Observable;

    move-result-object v2

    sget-object v3, Laq1$c;->g:Laq1$c;

    new-instance v4, LSp1;

    invoke-direct {v4, v3}, LSp1;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {v1, v2, v4}, Lio/reactivex/Observable;->zip(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, Laq1$d;

    invoke-direct {v2, p0}, Laq1$d;-><init>(Laq1;)V

    new-instance v3, LTp1;

    invoke-direct {v3, v2}, LTp1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Laq1$e;->g:Laq1$e;

    new-instance v3, LUp1;

    invoke-direct {v3, v2}, LUp1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/F;->k0()Lio/reactivex/Observable;

    move-result-object v1

    invoke-static {v0, v1}, Lio/reactivex/Observable;->merge(Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-interface {p1}, Lgq1;->d5()Lio/reactivex/Observable;

    move-result-object v1

    invoke-interface {p1}, Lgq1;->e4()Lio/reactivex/Observable;

    move-result-object v2

    sget-object v3, Laq1$f;->g:Laq1$f;

    new-instance v4, LVp1;

    invoke-direct {v4, v3}, LVp1;-><init>(Lkotlin/jvm/functions/Function3;)V

    invoke-virtual {v0, v1, v2, v4}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/h;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun consume(ren\u2026 = periods) }\n      }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Laq1;->K(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v2

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v3, Laq1$g;

    invoke-direct {v3, p0}, Laq1$g;-><init>(Laq1;)V

    new-instance v4, LWp1;

    invoke-direct {v4, v3}, LWp1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, Lgq1;->d5()Lio/reactivex/Observable;

    move-result-object v0

    invoke-interface {p1}, Lgq1;->e4()Lio/reactivex/Observable;

    move-result-object p1

    sget-object v3, Laq1$h;->g:Laq1$h;

    new-instance v4, LXp1;

    invoke-direct {v4, v3}, LXp1;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {v0, p1, v4}, Lio/reactivex/Observable;->zip(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Laq1$i;

    invoke-direct {v0, p0}, Laq1$i;-><init>(Laq1;)V

    new-instance v3, LYp1;

    invoke-direct {v3, v0}, LYp1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v3}, Lio/reactivex/F;->D(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, Laq1$j;

    invoke-direct {v0, p0}, Laq1$j;-><init>(Laq1;)V

    new-instance v1, LZp1;

    invoke-direct {v1, v0}, LZp1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method
