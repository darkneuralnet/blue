.class public final LZD3$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZD3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u008d\u0001\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u0012\"\u0008\u0008\u0001\u0010\u0002*\u00020\u0001\"\u0008\u0008\u0002\u0010\u0003*\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u0011\u001a\u0004\u0018\u00018\u0001H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001f"
    }
    d2 = {
        "LZD3$c;",
        "",
        "K",
        "T",
        "LfE3;",
        "pagingSource",
        "LfE3$b$c;",
        "initialPage",
        "LZC0;",
        "coroutineScope",
        "LSC0;",
        "notifyDispatcher",
        "fetchDispatcher",
        "LZD3$a;",
        "boundaryCallback",
        "LZD3$d;",
        "config",
        "key",
        "LZD3;",
        "a",
        "(LfE3;LfE3$b$c;LZC0;LSC0;LSC0;LZD3$a;LZD3$d;Ljava/lang/Object;)LZD3;",
        "",
        "currentSize",
        "snapshotSize",
        "LZD3$b;",
        "callback",
        "",
        "b",
        "(IILZD3$b;)V",
        "<init>",
        "()V",
        "paging-common"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, LZD3$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LfE3;LfE3$b$c;LZC0;LSC0;LSC0;LZD3$a;LZD3$d;Ljava/lang/Object;)LZD3;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "LfE3<",
            "TK;TT;>;",
            "LfE3$b$c<",
            "TK;TT;>;",
            "LZC0;",
            "LSC0;",
            "LSC0;",
            "LZD3$a<",
            "TT;>;",
            "LZD3$d;",
            "TK;)",
            "LZD3<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    move-object v1, p1

    move-object/from16 v6, p7

    const-string v0, "pagingSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    move-object v2, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notifyDispatcher"

    move-object v3, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fetchDispatcher"

    move-object v4, p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    new-instance v0, LfE3$a$d;

    iget v5, v6, LZD3$d;->d:I

    iget-boolean v7, v6, LZD3$d;->c:Z

    move-object/from16 v8, p8

    invoke-direct {v0, v8, v5, v7}, LfE3$a$d;-><init>(Ljava/lang/Object;IZ)V

    new-instance v5, LZD3$c$a;

    const/4 v7, 0x0

    invoke-direct {v5, p1, v0, v7}, LZD3$c$a;-><init>(LfE3;LfE3$a$d;Lkotlin/coroutines/Continuation;)V

    const/4 v0, 0x1

    invoke-static {v7, v5, v0, v7}, LX30;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LfE3$b$c;

    move-object v7, v0

    goto :goto_0

    :cond_0
    move-object/from16 v8, p8

    move-object v7, p2

    :goto_0
    new-instance v9, LhB0;

    move-object v0, v9

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LhB0;-><init>(LfE3;LZC0;LSC0;LSC0;LZD3$a;LZD3$d;LfE3$b$c;Ljava/lang/Object;)V

    return-object v9
.end method

.method public final b(IILZD3$b;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-ge p2, p1, :cond_1

    if-lez p2, :cond_0

    invoke-virtual {p3, v0, p2}, LZD3$b;->a(II)V

    :cond_0
    sub-int/2addr p1, p2

    if-lez p1, :cond_3

    invoke-virtual {p3, p2, p1}, LZD3$b;->b(II)V

    goto :goto_0

    :cond_1
    if-lez p1, :cond_2

    invoke-virtual {p3, v0, p1}, LZD3$b;->a(II)V

    :cond_2
    sub-int/2addr p2, p1

    if-eqz p2, :cond_3

    invoke-virtual {p3, p1, p2}, LZD3$b;->c(II)V

    :cond_3
    :goto_0
    return-void
.end method
