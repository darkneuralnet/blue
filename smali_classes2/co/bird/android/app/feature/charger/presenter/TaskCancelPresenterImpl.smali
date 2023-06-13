.class public final Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;
.super LxC;
.source "SourceFile"

# interfaces
.implements LYY5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$ZendeskCreateRequestError;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00010B5\u0012\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020,0+\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007J\u001c\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0008\u0010\u0010\u001a\u00020\u0005H\u0002J\u0008\u0010\u0011\u001a\u00020\u0005H\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0016\u0010$\u001a\u00020\r8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0016\u0010&\u001a\u00020\r8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008%\u0010#R\u0016\u0010*\u001a\u00020\'8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008(\u0010)\u00a8\u00061"
    }
    d2 = {
        "Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;",
        "LxC;",
        "LYY5;",
        "Landroid/content/Intent;",
        "intent",
        "",
        "b",
        "Lzendesk/support/CreateRequest;",
        "request",
        "Lio/reactivex/c;",
        "E",
        "",
        "success",
        "",
        "reason",
        "O",
        "K",
        "F",
        "LrZ5;",
        "c",
        "LrZ5;",
        "ui",
        "Le13;",
        "d",
        "Le13;",
        "navigator",
        "LjB0;",
        "e",
        "LjB0;",
        "contractorManager",
        "LEa;",
        "f",
        "LEa;",
        "analyticsManager",
        "g",
        "Ljava/lang/String;",
        "birdCode",
        "h",
        "taskId",
        "Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;",
        "i",
        "Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;",
        "taskCancelMode",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "LRE;",
        "scopeProvider",
        "<init>",
        "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LrZ5;Le13;LjB0;LEa;)V",
        "ZendeskCreateRequestError",
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
        "SMAP\nTaskCancelPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskCancelPresenter.kt\nco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,153:1\n180#2:154\n237#2:155\n180#2:156\n*S KotlinDebug\n*F\n+ 1 TaskCancelPresenter.kt\nco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl\n*L\n62#1:154\n106#1:155\n119#1:156\n*E\n"
    }
.end annotation


# instance fields
.field public final c:LrZ5;

.field public final d:Le13;

.field public final e:LjB0;

.field public final f:LEa;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LrZ5;Le13;LjB0;LEa;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LrZ5;",
            "Le13;",
            "LjB0;",
            "LEa;",
            ")V"
        }
    .end annotation

    const-string v0, "scopeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contractorManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxC;-><init>(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;)V

    iput-object p2, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->c:LrZ5;

    iput-object p3, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->d:Le13;

    iput-object p4, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->e:LjB0;

    iput-object p5, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->f:LEa;

    return-void
.end method

.method public static synthetic A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->I(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final H(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
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

.method public static final L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic P(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;ZLjava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->O(ZLjava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getAnalyticsManager$p(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)LEa;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->f:LEa;

    return-object p0
.end method

.method public static final synthetic access$getBirdCode$p(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->g:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getContractorManager$p(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)LjB0;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->e:LjB0;

    return-object p0
.end method

.method public static final synthetic access$getNavigator$p(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)Le13;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->d:Le13;

    return-object p0
.end method

.method public static final synthetic access$getTaskId$p(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->h:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getUi$p(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)LrZ5;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->c:LrZ5;

    return-object p0
.end method

.method public static final synthetic access$showCancelRequestSubmitted(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;ZLjava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->O(ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->H(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final E(Lzendesk/support/CreateRequest;)Lio/reactivex/c;
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$a;

    invoke-direct {v0, p1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$a;-><init>(Lzendesk/support/CreateRequest;)V

    invoke-static {v0}, Lnh5;->e(Lkotlin/jvm/functions/Function1;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final F()V
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->c:LrZ5;

    invoke-virtual {v0}, LrZ5;->Sl()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$b;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$b;-><init>(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)V

    new-instance v2, LaZ5;

    invoke-direct {v2, v1}, LaZ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$c;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$c;-><init>(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)V

    new-instance v2, LbZ5;

    invoke-direct {v2, v1}, LbZ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "private fun initSubmitAP\u2026Timber.w(it)\n      })\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LxC;->t()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$d;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$d;-><init>(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)V

    new-instance v2, LcZ5;

    invoke-direct {v2, v1}, LcZ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v1, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$e;->g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$e;

    new-instance v3, LdZ5;

    invoke-direct {v3, v1}, LdZ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final K()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->c:LrZ5;

    invoke-virtual {v0}, LrZ5;->Sl()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$f;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$f;-><init>(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)V

    new-instance v2, LeZ5;

    invoke-direct {v2, v1}, LeZ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$g;-><init>(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)V

    new-instance v2, LfZ5;

    invoke-direct {v2, v1}, LfZ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/c;->T()Lio/reactivex/c;

    move-result-object v0

    const-string v1, "private fun initSubmitIn\u2026r)\n      .subscribe()\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LxC;->t()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method

.method public final O(ZLjava/lang/String;)V
    .locals 23

    move-object/from16 v0, p0

    if-eqz p1, :cond_1

    iget-object v1, v0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->c:LrZ5;

    new-instance v2, LqZ5;

    iget-object v3, v0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->g:Ljava/lang/String;

    if-nez v3, :cond_0

    const-string v3, "birdCode"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v3, 0x0

    :cond_0
    invoke-direct {v2, v3}, LqZ5;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$i;

    invoke-direct {v5, v0}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$i;-><init>(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x76

    const/4 v10, 0x0

    invoke-static/range {v1 .. v10}, LH31$a;->showDialog$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v11, v0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->c:LrZ5;

    invoke-virtual {v11}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget v2, Lnl4;->task_indirect_cancel_error_dialog_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v12

    if-nez p2, :cond_2

    iget-object v1, v0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->c:LrZ5;

    invoke-virtual {v1}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget v2, Lnl4;->error_generic_body:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ui.activity.getString(L.string.error_generic_body)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v13, v1

    goto :goto_0

    :cond_2
    move-object/from16 v13, p2

    :goto_0
    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1fc

    const/16 v22, 0x0

    invoke-static/range {v11 .. v22}, LH31$a;->showDialog$default(LH31;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/Integer;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public b(Landroid/content/Intent;)V
    .locals 3

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bird_code"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v0, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->g:Ljava/lang/String;

    const-string v0, "task_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v0, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->h:Ljava/lang/String;

    iget-object v0, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->c:LrZ5;

    invoke-virtual {v0}, LrZ5;->Rl()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "ui.reasonTextChanged()\n \u2026dSchedulers.mainThread())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LxC;->t()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$h;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$h;-><init>(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)V

    new-instance v2, LZY5;

    invoke-direct {v2, v1}, LZY5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    const-string v0, "task_cancel_mode"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

    iput-object p1, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->i:Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

    if-nez p1, :cond_0

    const-string p1, "taskCancelMode"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    sget-object v0, Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;->b:Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->K()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->F()V

    :goto_0
    return-void
.end method
