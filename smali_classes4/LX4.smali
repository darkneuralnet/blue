.class public final LLX4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGX4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B1\u0008\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020#\u00a2\u0006\u0004\u0008\'\u0010(J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000f0\u000eH\u0016J\u0016\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010\u0012\u001a\u00020\u0002H\u0016J\u0008\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006)"
    }
    d2 = {
        "LLX4;",
        "LGX4;",
        "Lio/reactivex/c;",
        "L0",
        "",
        "linkCode",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/persistence/RidePassView;",
        "P0",
        "y0",
        "ridePassView",
        "d",
        "userSubscriptionId",
        "C0",
        "Lio/reactivex/Observable;",
        "",
        "t1",
        "O",
        "O0",
        "clear",
        "LPU4;",
        "a",
        "LPU4;",
        "ridePassClient",
        "LqT5;",
        "b",
        "LqT5;",
        "subscriptionClient",
        "LCX4;",
        "c",
        "LCX4;",
        "ridePassViewDao",
        "Lgl;",
        "Lgl;",
        "preference",
        "LTq4;",
        "e",
        "LTq4;",
        "reactiveConfig",
        "<init>",
        "(LPU4;LqT5;LCX4;Lgl;LTq4;)V",
        "co.bird.android.repository.ride-pass-view"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LPU4;

.field public final b:LqT5;

.field public final c:LCX4;

.field public final d:Lgl;

.field public final e:LTq4;


# direct methods
.method public constructor <init>(LPU4;LqT5;LCX4;Lgl;LTq4;)V
    .locals 1

    const-string v0, "ridePassClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subscriptionClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ridePassViewDao"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preference"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLX4;->a:LPU4;

    iput-object p2, p0, LLX4;->b:LqT5;

    iput-object p3, p0, LLX4;->c:LCX4;

    iput-object p4, p0, LLX4;->d:Lgl;

    iput-object p5, p0, LLX4;->e:LTq4;

    return-void
.end method

.method public static synthetic J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LLX4;->P1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LLX4;->Q1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L1(LLX4;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0}, LLX4;->M1(LLX4;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final M1(LLX4;)Lio/reactivex/h;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LLX4;->L0()Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final P1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final Q1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final synthetic access$getPreference$p(LLX4;)Lgl;
    .locals 0

    iget-object p0, p0, LLX4;->d:Lgl;

    return-object p0
.end method

.method public static final synthetic access$getReactiveConfig$p(LLX4;)LTq4;
    .locals 0

    iget-object p0, p0, LLX4;->e:LTq4;

    return-object p0
.end method

.method public static final synthetic access$getRidePassViewDao$p(LLX4;)LCX4;
    .locals 0

    iget-object p0, p0, LLX4;->c:LCX4;

    return-object p0
.end method


# virtual methods
.method public C0(Ljava/lang/String;)Lio/reactivex/c;
    .locals 2

    const-string v0, "userSubscriptionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LLX4;->b:LqT5;

    new-instance v1, Lco/bird/api/request/UserSubscriptionCancelRecurringRequest;

    invoke-direct {v1, p1}, Lco/bird/api/request/UserSubscriptionCancelRecurringRequest;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LqT5;->a(Lco/bird/api/request/UserSubscriptionCancelRecurringRequest;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    const-string v0, "subscriptionClient.cance\u2026re\n      .ignoreElement()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public L0()Lio/reactivex/c;
    .locals 3

    iget-object v0, p0, LLX4;->a:LPU4;

    invoke-interface {v0}, LPU4;->c()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LLX4$a;

    invoke-direct {v1, p0}, LLX4$a;-><init>(LLX4;)V

    new-instance v2, LIX4;

    invoke-direct {v2, v1}, LIX4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "override fun fetchRidePa\u2026}\n          )\n      }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public N1(Lio/reactivex/Observable;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Observable<",
            "TT;>;)",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, LGX4$a;->a(LGX4;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

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

    iget-object v0, p0, LLX4;->c:LCX4;

    invoke-virtual {v0, p1}, LCX4;->e(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0, p1}, LLX4;->N1(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public O0()Lio/reactivex/c;
    .locals 1

    iget-object v0, p0, LLX4;->c:LCX4;

    invoke-virtual {v0}, LCX4;->b()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public O1(Lio/reactivex/F;)Lio/reactivex/F;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/F<",
            "TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, LGX4$a;->b(LGX4;Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public P0(Ljava/lang/String;)Lio/reactivex/F;
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

    iget-object v0, p0, LLX4;->c:LCX4;

    invoke-virtual {v0, p1}, LCX4;->e(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object p1

    const-string v0, "ridePassViewDao.streamRi\u2026de)\n      .firstOrError()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LLX4;->O1(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public clear()Lio/reactivex/c;
    .locals 1

    iget-object v0, p0, LLX4;->c:LCX4;

    invoke-virtual {v0}, LCX4;->a()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public d(Lco/bird/android/model/persistence/RidePassView;)Lio/reactivex/c;
    .locals 2

    const-string v0, "ridePassView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LLX4;->a:LPU4;

    new-instance v1, Lco/bird/api/request/WireRidePassTransferRequest;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/RidePassView;->getUserRidePassId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-direct {v1, p1}, Lco/bird/api/request/WireRidePassTransferRequest;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LPU4;->b(Lco/bird/api/request/WireRidePassTransferRequest;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LLX4$b;

    invoke-direct {v0, p0}, LLX4$b;-><init>(LLX4;)V

    new-instance v1, LJX4;

    invoke-direct {v1, v0}, LJX4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "override fun transferRid\u2026tchRidePassViewV2() }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public t1()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LLX4;->c:LCX4;

    invoke-virtual {v0}, LCX4;->c()Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {p0, v0}, LLX4;->N1(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public y0(Ljava/lang/String;)Lio/reactivex/c;
    .locals 2

    const-string v0, "linkCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LLX4;->a:LPU4;

    new-instance v1, Lco/bird/api/request/RidePassBuyRequest;

    invoke-direct {v1, p1}, Lco/bird/api/request/RidePassBuyRequest;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LPU4;->a(Lco/bird/api/request/RidePassBuyRequest;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LHX4;

    invoke-direct {v0, p0}, LHX4;-><init>(LLX4;)V

    invoke-static {v0}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "ridePassClient.buyRidePa\u2026 fetchRidePassViewV2() })"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
