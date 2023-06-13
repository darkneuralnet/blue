.class public final LzZ5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LtZ5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0008\u0010\u0007\u001a\u00020\u0005H\u0016J\u0008\u0010\u0008\u001a\u00020\u0005H\u0016J\u0008\u0010\t\u001a\u00020\u0005H\u0016J\u0008\u0010\n\u001a\u00020\u0005H\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000cR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u000fR \u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0017R&\u0010\u001d\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u00198\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u0014\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "LzZ5;",
        "LtZ5;",
        "",
        "birdId",
        "birdCode",
        "Lio/reactivex/c;",
        "b",
        "a",
        "d",
        "refresh",
        "n",
        "Lom3;",
        "Lom3;",
        "operatorManager",
        "LsZ5;",
        "LsZ5;",
        "taskOrderClient",
        "La94;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/TaskOrderData;",
        "c",
        "La94;",
        "mutableTaskData",
        "Ljava/lang/String;",
        "taskOrderBirdId",
        "LZ84;",
        "e",
        "LZ84;",
        "()LZ84;",
        "taskOrderData",
        "<init>",
        "(Lom3;LsZ5;)V",
        "task-order_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lom3;

.field public final b:LsZ5;

.field public final c:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/TaskOrderData;",
            ">;>;"
        }
    .end annotation
.end field

.field public d:Ljava/lang/String;

.field public final e:LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/TaskOrderData;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lom3;LsZ5;)V
    .locals 2

    const-string v0, "operatorManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taskOrderClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzZ5;->a:Lom3;

    iput-object p2, p0, LzZ5;->b:LsZ5;

    sget-object p1, La94;->h:La94$a;

    sget-object p2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p2}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, p2, v0, v1, v0}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p1

    iput-object p1, p0, LzZ5;->c:La94;

    sget-object p2, LZ84;->d:LZ84$a;

    invoke-virtual {p2, p1}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object p1

    iput-object p1, p0, LzZ5;->e:LZ84;

    return-void
.end method

.method public static final synthetic access$getMutableTaskData$p(LzZ5;)La94;
    .locals 0

    iget-object p0, p0, LzZ5;->c:La94;

    return-object p0
.end method

.method public static final synthetic access$setTaskOrderBirdId$p(LzZ5;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LzZ5;->d:Ljava/lang/String;

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LzZ5;->k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LzZ5;->l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LzZ5;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LzZ5;->m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LzZ5;->o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static final m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Lio/reactivex/c;
    .locals 3

    iget-object v0, p0, LzZ5;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p0, LzZ5;->b:LsZ5;

    new-instance v2, Lco/bird/api/request/TaskOrderRequest;

    invoke-direct {v2, v0}, Lco/bird/api/request/TaskOrderRequest;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, LsZ5;->b(Lco/bird/api/request/TaskOrderRequest;)Lio/reactivex/c;

    move-result-object v0

    sget-object v1, LzZ5$a;->g:LzZ5$a;

    new-instance v2, LxZ5;

    invoke-direct {v2, v1}, LxZ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-virtual {p0}, LzZ5;->n()Lio/reactivex/c;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/c;
    .locals 2

    const-string v0, "birdId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LzZ5;->a:Lom3;

    sget-object v1, Lco/bird/android/model/constant/FlightSheetContext;->STANDARD:Lco/bird/android/model/constant/FlightSheetContext;

    invoke-interface {v0, p1, v1}, Lom3;->Y(Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LzZ5$c;

    invoke-direct {v1, p0, p1, p2}, LzZ5$c;-><init>(LzZ5;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, LuZ5;

    invoke-direct {p1, v1}, LuZ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    new-instance p2, LzZ5$d;

    invoke-direct {p2, p0}, LzZ5$d;-><init>(LzZ5;)V

    new-instance v0, LvZ5;

    invoke-direct {v0, p2}, LvZ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    const-string p2, "override fun getTaskOrde\u2026     .ignoreElement()\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/TaskOrderData;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LzZ5;->e:LZ84;

    return-object v0
.end method

.method public d()Lio/reactivex/c;
    .locals 3

    iget-object v0, p0, LzZ5;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p0, LzZ5;->b:LsZ5;

    new-instance v2, Lco/bird/api/request/TaskOrderRequest;

    invoke-direct {v2, v0}, Lco/bird/api/request/TaskOrderRequest;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, LsZ5;->a(Lco/bird/api/request/TaskOrderRequest;)Lio/reactivex/c;

    move-result-object v0

    sget-object v1, LzZ5$b;->g:LzZ5$b;

    new-instance v2, LwZ5;

    invoke-direct {v2, v1}, LwZ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-virtual {p0}, LzZ5;->n()Lio/reactivex/c;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final n()Lio/reactivex/c;
    .locals 2

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Task Order bird id is null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lg46;->e(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "error(exception)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public refresh()Lio/reactivex/c;
    .locals 3

    iget-object v0, p0, LzZ5;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p0, LzZ5;->a:Lom3;

    sget-object v2, Lco/bird/android/model/constant/FlightSheetContext;->STANDARD:Lco/bird/android/model/constant/FlightSheetContext;

    invoke-interface {v1, v0, v2}, Lom3;->n0(Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;)Lio/reactivex/c;

    move-result-object v0

    sget-object v1, LzZ5$e;->g:LzZ5$e;

    new-instance v2, LyZ5;

    invoke-direct {v2, v1}, LyZ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-virtual {p0}, LzZ5;->n()Lio/reactivex/c;

    move-result-object v0

    :cond_1
    return-object v0
.end method
