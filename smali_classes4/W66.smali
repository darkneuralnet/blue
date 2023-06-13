.class public final LW66;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LsO4;
.implements LrO4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LsO4<",
        "Lkotlin/Unit;",
        "Lco/bird/android/model/TransactionSummary;",
        ">;",
        "LrO4<",
        "Lkotlin/Unit;",
        "Lco/bird/android/model/TransactionSummary;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J.\u0010\u0013\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00120\u00112\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000f0\u000eH\u0016J.\u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00150\u00112\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000f0\u0014H\u0016J.\u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00150\u00112\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000f0\u0014H\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "LW66;",
        "LsO4;",
        "",
        "Lco/bird/android/model/TransactionSummary;",
        "LrO4;",
        "create",
        "",
        "position",
        "item",
        "g",
        "item1",
        "item2",
        "",
        "f",
        "LEc2$c;",
        "LTD3;",
        "params",
        "Lio/reactivex/F;",
        "LbO4;",
        "c",
        "LEc2$d;",
        "LcO4;",
        "b",
        "a",
        "LTg6;",
        "LTg6;",
        "client",
        "<init>",
        "(LTg6;)V",
        "user_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LTg6;


# direct methods
.method public constructor <init>(LTg6;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW66;->a:LTg6;

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LcO4;
    .locals 0

    invoke-static {p0, p1}, LW66;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LcO4;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LbO4;
    .locals 0

    invoke-static {p0, p1}, LW66;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LbO4;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LcO4;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LcO4;

    return-object p0
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LbO4;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LbO4;

    return-object p0
.end method


# virtual methods
.method public a(LEc2$d;)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEc2$d<",
            "LTD3<",
            "Lkotlin/Unit;",
            "Lco/bird/android/model/TransactionSummary;",
            ">;>;)",
            "Lio/reactivex/F<",
            "LcO4<",
            "Lco/bird/android/model/TransactionSummary;",
            ">;>;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LW66;->a:LTg6;

    iget-object v1, p1, LEc2$d;->a:Ljava/lang/Object;

    check-cast v1, LTD3;

    invoke-virtual {v1}, LTD3;->c()J

    move-result-wide v1

    long-to-int v1, v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iget p1, p1, LEc2$d;->b:I

    invoke-interface {v0, v1, p1}, LTg6;->u(II)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, LW66$a;->g:LW66$a;

    new-instance v1, LU66;

    invoke-direct {v1, v0}, LU66;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LcO4$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v2, v1}, LcO4$b;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->R(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "client.getTransactionHis\u2026ryableLoadResult.Error())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lco/bird/android/model/TransactionSummary;

    check-cast p2, Lco/bird/android/model/TransactionSummary;

    invoke-virtual {p0, p1, p2}, LW66;->f(Lco/bird/android/model/TransactionSummary;Lco/bird/android/model/TransactionSummary;)Z

    move-result p1

    return p1
.end method

.method public b(LEc2$d;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEc2$d<",
            "LTD3<",
            "Lkotlin/Unit;",
            "Lco/bird/android/model/TransactionSummary;",
            ">;>;)",
            "Lio/reactivex/F<",
            "LcO4<",
            "Lco/bird/android/model/TransactionSummary;",
            ">;>;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LcO4$a;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v0}, LcO4$a;-><init>(Ljava/util/List;)V

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "just(RetryableLoadResult.Content(listOf()))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c(LEc2$c;)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEc2$c<",
            "LTD3<",
            "Lkotlin/Unit;",
            "Lco/bird/android/model/TransactionSummary;",
            ">;>;)",
            "Lio/reactivex/F<",
            "LbO4<",
            "Lco/bird/android/model/TransactionSummary;",
            ">;>;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LW66;->a:LTg6;

    const/4 v1, 0x0

    iget p1, p1, LEc2$c;->b:I

    invoke-interface {v0, v1, p1}, LTg6;->u(II)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, LW66$b;->g:LW66$b;

    new-instance v1, LV66;

    invoke-direct {v1, v0}, LV66;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LbO4$c;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, LbO4$c;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->R(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "client.getTransactionHis\u2026oadInitialResult.Error())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public create()LrO4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LrO4<",
            "Lkotlin/Unit;",
            "Lco/bird/android/model/TransactionSummary;",
            ">;"
        }
    .end annotation

    return-object p0
.end method

.method public f(Lco/bird/android/model/TransactionSummary;Lco/bird/android/model/TransactionSummary;)Z
    .locals 1

    const-string v0, "item1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/TransactionSummary;->primaryKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lco/bird/android/model/TransactionSummary;->primaryKey()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public g(JLco/bird/android/model/TransactionSummary;)V
    .locals 0

    const-string p1, "item"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic getKey(JLjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p3, Lco/bird/android/model/TransactionSummary;

    invoke-virtual {p0, p1, p2, p3}, LW66;->g(JLco/bird/android/model/TransactionSummary;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
