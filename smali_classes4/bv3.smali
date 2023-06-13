.class public final Lbv3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZu3;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00050\u0004H\u0016J\u0016\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0008\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "Lbv3;",
        "LZu3;",
        "Lio/reactivex/c;",
        "j1",
        "Lio/reactivex/Observable;",
        "",
        "Lco/bird/android/model/persistence/OperatorTaskBanner;",
        "L",
        "Lco/bird/android/model/persistence/OperatorTaskGroup;",
        "w1",
        "",
        "title",
        "J0",
        "clear",
        "LTk3;",
        "a",
        "LTk3;",
        "operatorClient",
        "Lww3;",
        "b",
        "Lww3;",
        "operatorTaskV2Dao",
        "<init>",
        "(LTk3;Lww3;)V",
        "co.bird.android.repository.fleet-status"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LTk3;

.field public final b:Lww3;


# direct methods
.method public constructor <init>(LTk3;Lww3;)V
    .locals 1

    const-string v0, "operatorClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "operatorTaskV2Dao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbv3;->a:LTk3;

    iput-object p2, p0, Lbv3;->b:Lww3;

    return-void
.end method

.method public static synthetic J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lbv3;->L1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final L1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final synthetic access$getOperatorTaskV2Dao$p(Lbv3;)Lww3;
    .locals 0

    iget-object p0, p0, Lbv3;->b:Lww3;

    return-object p0
.end method


# virtual methods
.method public J0(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/OperatorTaskGroup;",
            ">;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbv3;->b:Lww3;

    invoke-virtual {v0, p1}, Lww3;->g(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbv3;->K1(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public K1(Lio/reactivex/Observable;)Lio/reactivex/Observable;
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

    invoke-static {p0, p1}, LZu3$a;->a(LZu3;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public L()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorTaskBanner;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lbv3;->b:Lww3;

    invoke-virtual {v0}, Lww3;->e()Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lbv3;->K1(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lio/reactivex/c;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lio/reactivex/c;

    iget-object v1, p0, Lbv3;->b:Lww3;

    invoke-virtual {v1}, Lww3;->a()Lio/reactivex/c;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lbv3;->b:Lww3;

    invoke-virtual {v1}, Lww3;->b()Lio/reactivex/c;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lio/reactivex/c;->r(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "concat(listOf(\n      ope\u2026eratorTaskGroups()\n    ))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public j1()Lio/reactivex/c;
    .locals 3

    iget-object v0, p0, Lbv3;->a:LTk3;

    invoke-interface {v0}, LTk3;->g()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lbv3$a;

    invoke-direct {v1, p0}, Lbv3$a;-><init>(Lbv3;)V

    new-instance v2, Lav3;

    invoke-direct {v2, v1}, Lav3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "override fun fetchOperat\u2026))\n        ))\n      }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public w1()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorTaskGroup;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lbv3;->b:Lww3;

    invoke-virtual {v0}, Lww3;->f()Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lbv3;->K1(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
