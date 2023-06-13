.class public final LMp3;
.super Lf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf1<",
        "LOp3;",
        "LPp3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "LMp3;",
        "Lf1;",
        "LOp3;",
        "LPp3;",
        "renderer",
        "",
        "q",
        "LO86;",
        "e",
        "LO86;",
        "transferOrderManager",
        "LGp3;",
        "f",
        "LGp3;",
        "operatorOrderNavigator",
        "<init>",
        "(LO86;LGp3;)V",
        "co.bird.android.feature.transfer-order"
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
        "SMAP\nOperatorOrderPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderPresenter.kt\nco/bird/android/feature/transferorder/operator/OperatorOrderPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,43:1\n199#2:44\n*S KotlinDebug\n*F\n+ 1 OperatorOrderPresenter.kt\nco/bird/android/feature/transferorder/operator/OperatorOrderPresenter\n*L\n31#1:44\n*E\n"
    }
.end annotation


# instance fields
.field public final e:LO86;

.field public final f:LGp3;


# direct methods
.method public constructor <init>(LO86;LGp3;)V
    .locals 1

    const-string v0, "transferOrderManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "operatorOrderNavigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La22;->a:La22;

    invoke-direct {p0, v0}, Lf1;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LMp3;->e:LO86;

    iput-object p2, p0, LMp3;->f:LGp3;

    return-void
.end method

.method public static final synthetic access$getOperatorOrderNavigator$p(LMp3;)LGp3;
    .locals 0

    iget-object p0, p0, LMp3;->f:LGp3;

    return-object p0
.end method

.method public static final synthetic access$getTransferOrderManager$p(LMp3;)LO86;
    .locals 0

    iget-object p0, p0, LMp3;->e:LO86;

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LMp3;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LMp3;->t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LMp3;->r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LMp3;->s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic consume(Lrx4;)V
    .locals 0

    check-cast p1, LOp3;

    invoke-virtual {p0, p1}, LMp3;->q(LOp3;)V

    return-void
.end method

.method public q(LOp3;)V
    .locals 2

    const-string v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lf1;->consume(Lrx4;)V

    iget-object p1, p0, LMp3;->e:LO86;

    invoke-interface {p1}, LO86;->f()Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LMp3$a;

    invoke-direct {v0, p0}, LMp3$a;-><init>(LMp3;)V

    new-instance v1, LIp3;

    invoke-direct {v1, v0}, LIp3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->E(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, LMp3;->e:LO86;

    invoke-interface {v0}, LO86;->d0()Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LMp3$b;

    invoke-direct {v0, p0}, LMp3$b;-><init>(LMp3;)V

    new-instance v1, LJp3;

    invoke-direct {v1, v0}, LJp3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LMp3$c;

    invoke-direct {v0, p0}, LMp3$c;-><init>(LMp3;)V

    new-instance v1, LKp3;

    invoke-direct {v1, v0}, LKp3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "override fun consume(ren\u2026g()\n        }\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance v0, LMp3$d;

    invoke-direct {v0, p0}, LMp3$d;-><init>(LMp3;)V

    new-instance v1, LLp3;

    invoke-direct {v1, v0}, LLp3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method
