.class public final LuR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LoR;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u00a2\u0006\u0004\u0008 \u0010!J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00100\u000fH\u0016J\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J\u0016\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0008\u0010\u0016\u001a\u00020\u0002H\u0016J\u0008\u0010\u0017\u001a\u00020\u0002H\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\""
    }
    d2 = {
        "LuR;",
        "LoR;",
        "Lio/reactivex/c;",
        "v1",
        "",
        "subscriptionPlanId",
        "",
        "trial",
        "m",
        "Lco/bird/android/model/persistence/BirdPlusView;",
        "birdPlusView",
        "K",
        "userSubscriptionId",
        "Q",
        "a0",
        "Lio/reactivex/Observable;",
        "",
        "F1",
        "Z0",
        "K0",
        "codename",
        "s1",
        "u1",
        "clear",
        "LrP;",
        "a",
        "LrP;",
        "birdPlusClient",
        "LlR;",
        "b",
        "LlR;",
        "birdPlusViewDao",
        "<init>",
        "(LrP;LlR;)V",
        "co.bird.android.repository.birdplus"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LrP;

.field public final b:LlR;


# direct methods
.method public constructor <init>(LrP;LlR;)V
    .locals 1

    const-string v0, "birdPlusClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdPlusViewDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LuR;->a:LrP;

    iput-object p2, p0, LuR;->b:LlR;

    return-void
.end method

.method public static synthetic J1(LuR;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0}, LuR;->N1(LuR;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LuR;->Q1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L1(LuR;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0}, LuR;->R1(LuR;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M1(LuR;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0}, LuR;->O1(LuR;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final N1(LuR;)Lio/reactivex/h;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LuR;->v1()Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final O1(LuR;)Lio/reactivex/h;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LuR;->v1()Lio/reactivex/c;

    move-result-object p0

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

.method public static final R1(LuR;)Lio/reactivex/h;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LuR;->v1()Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBirdPlusViewDao$p(LuR;)LlR;
    .locals 0

    iget-object p0, p0, LuR;->b:LlR;

    return-object p0
.end method


# virtual methods
.method public F1()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/BirdPlusView;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LuR;->b:LlR;

    invoke-virtual {v0}, LlR;->c()Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {p0, v0}, LuR;->P1(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public K(Lco/bird/android/model/persistence/BirdPlusView;)Lio/reactivex/c;
    .locals 1

    const-string v0, "birdPlusView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    const-string v0, "complete()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public K0(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/BirdPlusView;",
            ">;"
        }
    .end annotation

    const-string v0, "subscriptionPlanId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LuR;->b:LlR;

    invoke-virtual {v0, p1}, LlR;->f(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0, p1}, LuR;->P1(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public P1(Lio/reactivex/Observable;)Lio/reactivex/Observable;
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

    invoke-static {p0, p1}, LoR$a;->a(LoR;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public Q(Ljava/lang/String;)Lio/reactivex/c;
    .locals 2

    const-string v0, "userSubscriptionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LuR;->a:LrP;

    new-instance v1, Lco/bird/api/request/BirdPlusCancelSubscriptionRequestBody;

    invoke-direct {v1, p1}, Lco/bird/api/request/BirdPlusCancelSubscriptionRequestBody;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LrP;->c(Lco/bird/api/request/BirdPlusCancelSubscriptionRequestBody;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LsR;

    invoke-direct {v0, p0}, LsR;-><init>(LuR;)V

    invoke-static {v0}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "birdPlusClient.cancelSub\u2026{ fetchBirdPassViews() })"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public Z0(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/BirdPlusView;",
            ">;"
        }
    .end annotation

    const-string v0, "userSubscriptionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LuR;->b:LlR;

    invoke-virtual {v0, p1}, LlR;->g(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0, p1}, LuR;->P1(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public a0(Ljava/lang/String;)Lio/reactivex/c;
    .locals 2

    const-string v0, "userSubscriptionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LuR;->a:LrP;

    new-instance v1, Lco/bird/api/request/BirdPlusReactivateSubscriptionRequestBody;

    invoke-direct {v1, p1}, Lco/bird/api/request/BirdPlusReactivateSubscriptionRequestBody;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LrP;->b(Lco/bird/api/request/BirdPlusReactivateSubscriptionRequestBody;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LqR;

    invoke-direct {v0, p0}, LqR;-><init>(LuR;)V

    invoke-static {v0}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "birdPlusClient.reactivat\u2026{ fetchBirdPassViews() })"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public clear()Lio/reactivex/c;
    .locals 1

    iget-object v0, p0, LuR;->b:LlR;

    invoke-virtual {v0}, LlR;->a()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public m(Ljava/lang/String;Z)Lio/reactivex/c;
    .locals 2

    const-string v0, "subscriptionPlanId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LuR;->a:LrP;

    new-instance v1, Lco/bird/api/request/BirdPlusPurchaseSubscriptionRequestBody;

    invoke-direct {v1, p1, p2}, Lco/bird/api/request/BirdPlusPurchaseSubscriptionRequestBody;-><init>(Ljava/lang/String;Z)V

    invoke-interface {v0, v1}, LrP;->d(Lco/bird/api/request/BirdPlusPurchaseSubscriptionRequestBody;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    new-instance p2, LpR;

    invoke-direct {p2, p0}, LpR;-><init>(LuR;)V

    invoke-static {p2}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "birdPlusClient.purchaseS\u2026{ fetchBirdPassViews() })"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public s1(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/BirdPlusView;",
            ">;"
        }
    .end annotation

    const-string v0, "codename"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LuR;->b:LlR;

    invoke-virtual {v0, p1}, LlR;->e(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0, p1}, LuR;->P1(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public u1()Lio/reactivex/c;
    .locals 1

    iget-object v0, p0, LuR;->b:LlR;

    invoke-virtual {v0}, LlR;->b()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public v1()Lio/reactivex/c;
    .locals 3

    iget-object v0, p0, LuR;->a:LrP;

    invoke-interface {v0}, LrP;->a()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LuR$a;

    invoke-direct {v1, p0}, LuR$a;-><init>(LuR;)V

    new-instance v2, LrR;

    invoke-direct {v2, v1}, LrR;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "override fun fetchBirdPa\u2026istence()) })\n      }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
