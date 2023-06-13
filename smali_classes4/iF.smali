.class public final LiF;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LfF;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J*\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\n0\u00062\u0006\u0010\t\u001a\u00020\u00022\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\n0\u0006H\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\n0\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "LiF;",
        "LfF;",
        "",
        "description",
        "Lco/bird/api/request/BatchKind;",
        "batchKind",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/wire/WireBatch;",
        "e",
        "batchId",
        "",
        "birdsIds",
        "Lco/bird/api/response/BatchBird;",
        "b",
        "c",
        "a",
        "birdId",
        "d",
        "LVE;",
        "LVE;",
        "batchClient",
        "Llh6;",
        "Llh6;",
        "userManager",
        "<init>",
        "(LVE;Llh6;)V",
        "batch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LVE;

.field public final b:Llh6;


# direct methods
.method public constructor <init>(LVE;Llh6;)V
    .locals 1

    const-string v0, "batchClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiF;->a:LVE;

    iput-object p2, p0, LiF;->b:Llh6;

    return-void
.end method

.method public static final synthetic access$getBatchClient$p(LiF;)LVE;
    .locals 0

    iget-object p0, p0, LiF;->a:LVE;

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LiF;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LiF;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/api/response/BatchBird;",
            ">;>;"
        }
    .end annotation

    const-string v0, "batchId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LiF;->a:LVE;

    invoke-interface {v0, p1}, LVE;->a(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "batchClient.getBirdsByBa\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b(Ljava/lang/String;Ljava/util/List;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/api/response/BatchBird;",
            ">;>;"
        }
    .end annotation

    const-string v0, "batchId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdsIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LiF;->a:LVE;

    new-instance v1, Lco/bird/api/request/BatchAddBirdsRequestBody;

    invoke-direct {v1, p1, p2}, Lco/bird/api/request/BatchAddBirdsRequestBody;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v0, v1}, LVE;->e(Lco/bird/api/request/BatchAddBirdsRequestBody;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "batchClient.addVehiclesT\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c()Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBatch;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LiF;->b:Llh6;

    invoke-interface {v0}, Llh6;->getUser()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LiF$b;

    invoke-direct {v1, p0}, LiF$b;-><init>(LiF;)V

    new-instance v2, LgF;

    invoke-direct {v2, v1}, LgF;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "override fun getBatchesF\u2026beOn(Schedulers.io())\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/BatchBird;",
            ">;"
        }
    .end annotation

    const-string v0, "batchId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LiF;->a:LVE;

    new-instance v1, Lco/bird/api/request/BatchRemoveBirdRequestBody;

    invoke-direct {v1, p1, p2}, Lco/bird/api/request/BatchRemoveBirdRequestBody;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, LVE;->b(Lco/bird/api/request/BatchRemoveBirdRequestBody;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "batchClient.removeVehicl\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public e(Ljava/lang/String;Lco/bird/api/request/BatchKind;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/api/request/BatchKind;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireBatch;",
            ">;"
        }
    .end annotation

    const-string p2, "description"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LiF;->b:Llh6;

    invoke-interface {p2}, Llh6;->getUser()Lio/reactivex/F;

    move-result-object p2

    new-instance v0, LiF$a;

    invoke-direct {v0, p0, p1}, LiF$a;-><init>(LiF;Ljava/lang/String;)V

    new-instance p1, LhF;

    invoke-direct {p1, v0}, LhF;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "override fun createBatch\u2026beOn(Schedulers.io())\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
