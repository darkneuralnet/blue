.class public final LcF;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXE;
.implements LSx6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u00020\u0002B1\u0008\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0015\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0001J\t\u0010\u0007\u001a\u00020\u0005H\u0096\u0001J\u0008\u0010\u0008\u001a\u00020\u0005H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "LcF;",
        "LXE;",
        "LSx6;",
        "LRx6;",
        "listener",
        "",
        "d",
        "onResume",
        "a",
        "LTq4;",
        "LTq4;",
        "reactiveConfig",
        "LdF;",
        "b",
        "LdF;",
        "ui",
        "Lcom/uber/autodispose/ScopeProvider;",
        "c",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "Le13;",
        "Le13;",
        "navigator",
        "Liy6;",
        "e",
        "Liy6;",
        "warehouseChecker",
        "<init>",
        "(LTq4;LdF;Lcom/uber/autodispose/ScopeProvider;Le13;Liy6;)V",
        "servicecenter_release"
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
        "SMAP\nBatchLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatchLandingPresenter.kt\nco/bird/android/feature/servicecenter/batches/landing/BatchLandingPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,56:1\n180#2:57\n180#2:58\n161#2:59\n161#2:60\n*S KotlinDebug\n*F\n+ 1 BatchLandingPresenter.kt\nco/bird/android/feature/servicecenter/batches/landing/BatchLandingPresenterImpl\n*L\n33#1:57\n38#1:58\n43#1:59\n50#1:60\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LTq4;

.field public final b:LdF;

.field public final c:Lcom/uber/autodispose/ScopeProvider;

.field public final d:Le13;

.field public final e:Liy6;


# direct methods
.method public constructor <init>(LTq4;LdF;Lcom/uber/autodispose/ScopeProvider;Le13;Liy6;)V
    .locals 1

    const-string v0, "reactiveConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "warehouseChecker"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LcF;->a:LTq4;

    iput-object p2, p0, LcF;->b:LdF;

    iput-object p3, p0, LcF;->c:Lcom/uber/autodispose/ScopeProvider;

    iput-object p4, p0, LcF;->d:Le13;

    iput-object p5, p0, LcF;->e:Liy6;

    invoke-virtual {p5, p2}, Liy6;->B(LVx6;)V

    return-void
.end method

.method public static final synthetic access$getNavigator$p(LcF;)Le13;
    .locals 0

    iget-object p0, p0, LcF;->d:Le13;

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LcF;->k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LcF;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LcF;->l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LcF;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, LcF;->a:LTq4;

    invoke-virtual {v0}, LTq4;->j3()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "reactiveConfig.enableAdd\u2026dSchedulers.mainThread())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LcF;->c:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LcF$a;

    iget-object v3, p0, LcF;->b:LdF;

    invoke-direct {v2, v3}, LcF$a;-><init>(Ljava/lang/Object;)V

    new-instance v3, LYE;

    invoke-direct {v3, v2}, LYE;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LcF;->a:LTq4;

    invoke-virtual {v0}, LTq4;->T7()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "reactiveConfig.enableVie\u2026dSchedulers.mainThread())"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LcF;->c:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LcF$b;

    iget-object v3, p0, LcF;->b:LdF;

    invoke-direct {v2, v3}, LcF$b;-><init>(Ljava/lang/Object;)V

    new-instance v3, LZE;

    invoke-direct {v3, v2}, LZE;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LcF;->b:LdF;

    invoke-interface {v0}, LdF;->Tf()Lio/reactivex/k;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/k;->s0(Lio/reactivex/E;)Lio/reactivex/k;

    move-result-object v0

    const-string v2, "ui.addToBatchClicks()\n  \u2026dSchedulers.mainThread())"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LcF;->c:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/k;->f(Lio/reactivex/l;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/FlowableSubscribeProxy;

    new-instance v2, LcF$c;

    invoke-direct {v2, p0}, LcF$c;-><init>(LcF;)V

    new-instance v3, LaF;

    invoke-direct {v3, v2}, LaF;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/FlowableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LcF;->b:LdF;

    invoke-interface {v0}, LdF;->yi()Lio/reactivex/k;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/k;->s0(Lio/reactivex/E;)Lio/reactivex/k;

    move-result-object v0

    const-string v2, "ui.searchAllBatchesClick\u2026dSchedulers.mainThread())"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LcF;->c:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/k;->f(Lio/reactivex/l;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/FlowableSubscribeProxy;

    new-instance v1, LcF$d;

    invoke-direct {v1, p0}, LcF$d;-><init>(LcF;)V

    new-instance v2, LbF;

    invoke-direct {v2, v1}, LbF;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/FlowableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public d(LRx6;)V
    .locals 1

    iget-object v0, p0, LcF;->e:Liy6;

    invoke-virtual {v0, p1}, Liy6;->d(LRx6;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    iget-object v0, p0, LcF;->e:Liy6;

    invoke-virtual {v0}, Liy6;->onResume()V

    return-void
.end method
