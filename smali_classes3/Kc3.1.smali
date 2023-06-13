.class public final LKc3;
.super Lf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf1<",
        "LNc3;",
        "LOc3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0008\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t*\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0002J\u001a\u0010\u000e\u001a\u00020\r*\u0008\u0012\u0004\u0012\u00020\u000c0\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "LKc3;",
        "Lf1;",
        "LNc3;",
        "LOc3;",
        "renderer",
        "",
        "r",
        "Lio/reactivex/F;",
        "",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/persistence/Notification;",
        "w",
        "Lco/bird/android/model/persistence/nestedstructures/NotificationAction;",
        "Lio/reactivex/c;",
        "s",
        "",
        "e",
        "v",
        "LDa3;",
        "LDa3;",
        "notificationCenterManager",
        "LEa;",
        "f",
        "LEa;",
        "analyticsManager",
        "LNV0;",
        "g",
        "LNV0;",
        "deeplinkResolver",
        "<init>",
        "(LDa3;LEa;LNV0;)V",
        "notification-center_release"
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
        "SMAP\nNotificationDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationDetailsPresenter.kt\nco/bird/android/feature/notificationcenter/details/NotificationDetailsPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,104:1\n180#2:105\n237#2:106\n*S KotlinDebug\n*F\n+ 1 NotificationDetailsPresenter.kt\nco/bird/android/feature/notificationcenter/details/NotificationDetailsPresenter\n*L\n33#1:105\n43#1:106\n*E\n"
    }
.end annotation


# instance fields
.field public final e:LDa3;

.field public final f:LEa;

.field public final g:LNV0;


# direct methods
.method public constructor <init>(LDa3;LEa;LNV0;)V
    .locals 3

    const-string v0, "notificationCenterManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deeplinkResolver"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LOc3;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, LOc3;-><init>(Lco/bird/android/model/persistence/Notification;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v0}, Lf1;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LKc3;->e:LDa3;

    iput-object p2, p0, LKc3;->f:LEa;

    iput-object p3, p0, LKc3;->g:LNV0;

    return-void
.end method

.method public static final synthetic access$getAnalyticsManager$p(LKc3;)LEa;
    .locals 0

    iget-object p0, p0, LKc3;->f:LEa;

    return-object p0
.end method

.method public static final synthetic access$getDeeplinkResolver$p(LKc3;)LNV0;
    .locals 0

    iget-object p0, p0, LKc3;->g:LNV0;

    return-object p0
.end method

.method public static final synthetic access$getNotificationCenterManager$p(LKc3;)LDa3;
    .locals 0

    iget-object p0, p0, LKc3;->e:LDa3;

    return-object p0
.end method

.method public static final synthetic access$onError(LKc3;Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1}, LKc3;->v(Ljava/lang/Throwable;)V

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

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LKc3;->x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LKc3;->t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LKc3;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LKc3;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LKc3;->u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic consume(Lrx4;)V
    .locals 0

    check-cast p1, LNc3;

    invoke-virtual {p0, p1}, LKc3;->r(LNc3;)V

    return-void
.end method

.method public r(LNc3;)V
    .locals 3

    const-string v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lf1;->consume(Lrx4;)V

    invoke-interface {p1}, LNc3;->N3()Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {p0, v0}, LKc3;->w(Lio/reactivex/F;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, LKc3$a;

    invoke-direct {v1, p0}, LKc3$a;-><init>(LKc3;)V

    new-instance v2, LFc3;

    invoke-direct {v2, v1}, LFc3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, LNc3;->c1()Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, LKc3;->s(Lio/reactivex/Observable;LNc3;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LKc3$b;

    invoke-direct {v0, p0}, LKc3$b;-><init>(Ljava/lang/Object;)V

    new-instance v1, LGc3;

    invoke-direct {v1, v0}, LGc3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->T()Lio/reactivex/c;

    move-result-object p1

    const-string v0, "renderer.actionClicks()\n\u2026::onError)\n      .retry()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method

.method public final s(Lio/reactivex/Observable;LNc3;)Lio/reactivex/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/nestedstructures/NotificationAction;",
            ">;",
            "LNc3;",
            ")",
            "Lio/reactivex/c;"
        }
    .end annotation

    invoke-interface {p2}, LNc3;->N3()Lio/reactivex/F;

    move-result-object p2

    new-instance v0, LKc3$c;

    iget-object v1, p0, LKc3;->e:LDa3;

    invoke-direct {v0, v1}, LKc3$c;-><init>(Ljava/lang/Object;)V

    new-instance v1, LHc3;

    invoke-direct {v1, v0}, LHc3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v1}, Lio/reactivex/F;->D(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p2

    const-string v0, "renderer.notificationId(\u2026OperatorNotificationById)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lio/reactivex/rxkotlin/f;->a(Lio/reactivex/Observable;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, LKc3$d;

    invoke-direct {p2, p0}, LKc3$d;-><init>(LKc3;)V

    new-instance v0, LIc3;

    invoke-direct {v0, p2}, LIc3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "private fun Observable<N\u2026)\n          }\n      }\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final v(Ljava/lang/Throwable;)V
    .locals 1

    new-instance v0, LKc3$e;

    invoke-direct {v0, p1}, LKc3$e;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lf1;->i(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final w(Lio/reactivex/F;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/F<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/Notification;",
            ">;"
        }
    .end annotation

    new-instance v0, LKc3$f;

    invoke-direct {v0, p0}, LKc3$f;-><init>(LKc3;)V

    new-instance v1, LJc3;

    invoke-direct {v1, v0}, LJc3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->D(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "private fun Single<Strin\u2026    }\n        }\n    }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
