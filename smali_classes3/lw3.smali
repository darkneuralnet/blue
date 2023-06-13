.class public final Llw3;
.super Lf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf1<",
        "Ltw3;",
        "Luw3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0008\u0007\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002R\u0014\u0010\u000c\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\"\u0010\u001d\u001a\u0010\u0012\u000c\u0012\n \u001a*\u0004\u0018\u00010\u00050\u00050\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Llw3;",
        "Lf1;",
        "Ltw3;",
        "Luw3;",
        "renderer",
        "",
        "z",
        "",
        "e",
        "N",
        "Lom3;",
        "Lom3;",
        "operatorManager",
        "",
        "f",
        "Ljava/lang/String;",
        "taskGroupTitle",
        "LQv3;",
        "g",
        "LQv3;",
        "converter",
        "Le13;",
        "h",
        "Le13;",
        "navigator",
        "Lma4;",
        "kotlin.jvm.PlatformType",
        "i",
        "Lma4;",
        "refreshRelay",
        "<init>",
        "(Lom3;Ljava/lang/String;LQv3;Le13;)V",
        "task-list-v2_release"
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
        "SMAP\nOperatorTaskListV2FragmentPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskListV2FragmentPresenter.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2FragmentPresenter\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,112:1\n52#2,2:113\n180#3:115\n237#3:116\n180#3:117\n180#3:118\n180#3:119\n*S KotlinDebug\n*F\n+ 1 OperatorTaskListV2FragmentPresenter.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2FragmentPresenter\n*L\n33#1:113,2\n44#1:115\n61#1:116\n67#1:117\n74#1:118\n102#1:119\n*E\n"
    }
.end annotation


# instance fields
.field public final e:Lom3;

.field public final f:Ljava/lang/String;

.field public final g:LQv3;

.field public final h:Le13;

.field public final i:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lom3;Ljava/lang/String;LQv3;Le13;)V
    .locals 1

    const-string v0, "operatorManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "converter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAO5;->a:LAO5;

    invoke-direct {p0, v0}, Lf1;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Llw3;->e:Lom3;

    iput-object p2, p0, Llw3;->f:Ljava/lang/String;

    iput-object p3, p0, Llw3;->g:LQv3;

    iput-object p4, p0, Llw3;->h:Le13;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p1

    const-string p2, "create<Unit>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llw3;->i:Lma4;

    return-void
.end method

.method public static final A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final D(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final E(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static final G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final H(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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

.method public static final K(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$getConverter$p(Llw3;)LQv3;
    .locals 0

    iget-object p0, p0, Llw3;->g:LQv3;

    return-object p0
.end method

.method public static final synthetic access$getNavigator$p(Llw3;)Le13;
    .locals 0

    iget-object p0, p0, Llw3;->h:Le13;

    return-object p0
.end method

.method public static final synthetic access$getOperatorManager$p(Llw3;)Lom3;
    .locals 0

    iget-object p0, p0, Llw3;->e:Lom3;

    return-object p0
.end method

.method public static final synthetic access$getRefreshRelay$p(Llw3;)Lma4;
    .locals 0

    iget-object p0, p0, Llw3;->i:Lma4;

    return-object p0
.end method

.method public static final synthetic access$onError(Llw3;Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1}, Llw3;->N(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Llw3;->L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Llw3;->D(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Llw3;->I(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Llw3;->C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Llw3;->G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Llw3;->K(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Llw3;->M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Llw3;->B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Llw3;->F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Llw3;->A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Llw3;->J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Llw3;->E(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Llw3;->H(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final N(Ljava/lang/Throwable;)V
    .locals 1

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    new-instance p1, LFt2;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, LFt2;-><init>(Z)V

    invoke-virtual {p0, p1}, Lf1;->h(Ljava/lang/Object;)V

    sget-object p1, LfA5;->a:LfA5;

    invoke-virtual {p0, p1}, Lf1;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic consume(Lrx4;)V
    .locals 0

    check-cast p1, Ltw3;

    invoke-virtual {p0, p1}, Llw3;->z(Ltw3;)V

    return-void
.end method

.method public z(Ltw3;)V
    .locals 6

    const-string v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lf1;->consume(Lrx4;)V

    iget-object v0, p0, Llw3;->f:Ljava/lang/String;

    const-string v1, "override fun consume(ren\u2026hRelay.accept(Unit) }\n  }"

    const-string v2, "this.`as`(AutoDispose.autoDisposable(provider))"

    if-eqz v0, :cond_0

    sget-object v3, Lee3;->a:Lee3;

    invoke-interface {p1}, Ltw3;->P2()Lio/reactivex/Observable;

    move-result-object v3

    iget-object v4, p0, Llw3;->e:Lom3;

    invoke-interface {v4, v0}, Lom3;->N0(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v4, Llw3$a;->g:Llw3$a;

    new-instance v5, LYv3;

    invoke-direct {v5, v4}, LYv3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v5}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v4, "operatorManager.streamOp\u2026upTitle).map { it.tasks }"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Llw3$n;->a:Llw3$n;

    invoke-static {v3, v0, v4}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v3, "combineLatest(source1, s\u2026, t2: T2 -> (t1 to t2) })"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Llw3$b;->g:Llw3$b;

    new-instance v4, Lfw3;

    invoke-direct {v4, v3}, Lfw3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v3, Llw3$c;

    invoke-direct {v3, p0}, Llw3$c;-><init>(Llw3;)V

    new-instance v4, Lgw3;

    invoke-direct {v4, v3}, Lgw3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v3, Llw3$d;

    invoke-direct {v3, p0}, Llw3$d;-><init>(Llw3;)V

    new-instance v4, Lhw3;

    invoke-direct {v4, v3}, Lhw3;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v3, Llw3$e;->b:Llw3$e;

    new-instance v5, Liw3;

    invoke-direct {v5, v3}, Liw3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4, v5}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, Ltw3;->r0()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v3, p0, Llw3;->i:Lma4;

    invoke-static {v0, v3}, Lio/reactivex/Observable;->merge(Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v3, Llw3$f;

    invoke-direct {v3, p0}, Llw3$f;-><init>(Llw3;)V

    new-instance v4, Ljw3;

    invoke-direct {v4, v3}, Ljw3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v3, Llw3$g;

    invoke-direct {v3, p0}, Llw3$g;-><init>(Llw3;)V

    new-instance v4, Lkw3;

    invoke-direct {v4, v3}, Lkw3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/c;->T()Lio/reactivex/c;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    :cond_0
    invoke-interface {p1}, Ltw3;->C6()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v3, Llw3$h;

    invoke-direct {v3, p0}, Llw3$h;-><init>(Llw3;)V

    new-instance v4, LZv3;

    invoke-direct {v4, v3}, LZv3;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v3, Llw3$i;->b:Llw3$i;

    new-instance v5, Law3;

    invoke-direct {v5, v3}, Law3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4, v5}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, Ltw3;->r2()Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v3

    invoke-static {v3}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v3, Llw3$j;

    invoke-direct {v3, p0}, Llw3$j;-><init>(Llw3;)V

    new-instance v4, Lbw3;

    invoke-direct {v4, v3}, Lbw3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, Ltw3;->X4()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v3, Llw3$k;

    invoke-direct {v3, p0}, Llw3$k;-><init>(Llw3;)V

    new-instance v4, Lcw3;

    invoke-direct {v4, v3}, Lcw3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v3, Llw3$l;

    invoke-direct {v3, p0}, Llw3$l;-><init>(Ljava/lang/Object;)V

    new-instance v4, Ldw3;

    invoke-direct {v4, v3}, Ldw3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, Llw3$m;

    invoke-direct {v0, p0}, Llw3$m;-><init>(Llw3;)V

    new-instance v1, Lew3;

    invoke-direct {v1, v0}, Lew3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method
