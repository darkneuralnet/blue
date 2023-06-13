.class public final LQo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNo0;
.implements Luo0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\u0008\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\"\u0010#J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\t\u0010\u0005\u001a\u00020\u0003H\u0096\u0001J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\tH\u0016R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001a\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006$"
    }
    d2 = {
        "LQo0;",
        "LNo0;",
        "Luo0;",
        "",
        "t1",
        "onResume",
        "",
        "birdId",
        "u1",
        "",
        "showLockCommand",
        "showAlarmCommand",
        "showSleepCommand",
        "e",
        "a",
        "Luo0;",
        "delegate",
        "Lcom/uber/autodispose/ScopeProvider;",
        "b",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "Llp0;",
        "c",
        "Llp0;",
        "ui",
        "LJo0;",
        "d",
        "LJo0;",
        "converter",
        "Lio/reactivex/subjects/a;",
        "Lco/bird/android/model/wire/WireBird;",
        "v1",
        "()Lio/reactivex/subjects/a;",
        "birdSubject",
        "<init>",
        "(Luo0;Lcom/uber/autodispose/ScopeProvider;Llp0;LJo0;)V",
        "co.bird.android.feature.lib.command"
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
        "SMAP\nCommandDialogPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandDialogPresenter.kt\nco/bird/android/command/bottomsheet/CommandDialogPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,42:1\n180#2:43\n*S KotlinDebug\n*F\n+ 1 CommandDialogPresenter.kt\nco/bird/android/command/bottomsheet/CommandDialogPresenterImpl\n*L\n30#1:43\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Luo0;

.field public final b:Lcom/uber/autodispose/ScopeProvider;

.field public final c:Llp0;

.field public final d:LJo0;


# direct methods
.method public constructor <init>(Luo0;Lcom/uber/autodispose/ScopeProvider;Llp0;LJo0;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "converter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQo0;->a:Luo0;

    iput-object p2, p0, LQo0;->b:Lcom/uber/autodispose/ScopeProvider;

    iput-object p3, p0, LQo0;->c:Llp0;

    iput-object p4, p0, LQo0;->d:LJo0;

    invoke-virtual {p0}, LQo0;->v1()Lio/reactivex/subjects/a;

    move-result-object p1

    new-instance v0, LQo0$a;

    invoke-direct {v0, p4}, LQo0$a;-><init>(Ljava/lang/Object;)V

    new-instance p4, LOo0;

    invoke-direct {p4, v0}, LOo0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p4}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p4

    invoke-virtual {p1, p4}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p4, "birdSubject\n      .flatM\u2026dSchedulers.mainThread())"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p2, LQo0$b;

    invoke-direct {p2, p3}, LQo0$b;-><init>(Ljava/lang/Object;)V

    new-instance p3, LPo0;

    invoke-direct {p3, p2}, LPo0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, p3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LQo0;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LQo0;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public e(ZZZ)V
    .locals 1

    iget-object v0, p0, LQo0;->d:LJo0;

    invoke-interface {v0, p1, p2, p3}, LJo0;->c(ZZZ)V

    return-void
.end method

.method public onResume()V
    .locals 1

    iget-object v0, p0, LQo0;->a:Luo0;

    invoke-interface {v0}, Luo0;->onResume()V

    return-void
.end method

.method public t1()V
    .locals 1

    iget-object v0, p0, LQo0;->a:Luo0;

    invoke-interface {v0}, Luo0;->t1()V

    return-void
.end method

.method public u1(Ljava/lang/String;)V
    .locals 1

    const-string v0, "birdId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQo0;->a:Luo0;

    invoke-interface {v0, p1}, Luo0;->u1(Ljava/lang/String;)V

    return-void
.end method

.method public v1()Lio/reactivex/subjects/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/subjects/a<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LQo0;->a:Luo0;

    invoke-interface {v0}, Luo0;->v1()Lio/reactivex/subjects/a;

    move-result-object v0

    return-object v0
.end method
