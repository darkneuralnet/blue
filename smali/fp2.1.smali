.class public final Lfp2;
.super LfE3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfp2$c;,
        Lfp2$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Key:",
        "Ljava/lang/Object;",
        "Value:",
        "Ljava/lang/Object;",
        ">",
        "LfE3<",
        "TKey;TValue;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u0000 \u001f*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0008\u0008\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0017B#\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J-\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00000\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\rJ%\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00052\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00000\tH\u0002R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0014R&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00168\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u001c\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006 "
    }
    d2 = {
        "Lfp2;",
        "",
        "Key",
        "Value",
        "LfE3;",
        "",
        "pageSize",
        "",
        "i",
        "LfE3$a;",
        "params",
        "LfE3$b;",
        "d",
        "(LfE3$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "LhE3;",
        "state",
        "b",
        "(LhE3;)Ljava/lang/Object;",
        "h",
        "LSC0;",
        "LSC0;",
        "fetchDispatcher",
        "LWS0;",
        "c",
        "LWS0;",
        "g",
        "()LWS0;",
        "dataSource",
        "I",
        "<init>",
        "(LSC0;LWS0;)V",
        "e",
        "paging-common"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final e:Lfp2$c;


# instance fields
.field public final b:LSC0;

.field public final c:LWS0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWS0<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field

.field public d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfp2$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfp2$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfp2;->e:Lfp2$c;

    return-void
.end method

.method public constructor <init>(LSC0;LWS0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSC0;",
            "LWS0<",
            "TKey;TValue;>;)V"
        }
    .end annotation

    const-string v0, "fetchDispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LfE3;-><init>()V

    iput-object p1, p0, Lfp2;->b:LSC0;

    iput-object p2, p0, Lfp2;->c:LWS0;

    const/high16 p1, -0x80000000

    iput p1, p0, Lfp2;->d:I

    new-instance p1, Lfp2$a;

    invoke-direct {p1, p0}, Lfp2$a;-><init>(Lfp2;)V

    invoke-virtual {p2, p1}, LWS0;->c(LWS0$d;)V

    new-instance p1, Lfp2$b;

    invoke-direct {p1, p0}, Lfp2$b;-><init>(Lfp2;)V

    invoke-virtual {p0, p1}, LfE3;->e(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method


# virtual methods
.method public b(LhE3;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhE3<",
            "TKey;TValue;>;)TKey;"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfp2;->c:LWS0;

    invoke-virtual {v0}, LWS0;->e()LWS0$e;

    move-result-object v0

    sget-object v1, Lfp2$d;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, LhE3;->d()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, LhE3;->b(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v0, p0, Lfp2;->c:LWS0;

    invoke-virtual {v0, p1}, LWS0;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p1}, LhE3;->d()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {p1}, LhE3;->a(LhE3;)I

    move-result v1

    sub-int v1, v0, v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-virtual {p1}, LhE3;->e()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v4

    if-ge v3, v4, :cond_2

    invoke-virtual {p1}, LhE3;->e()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LfE3$b$c;

    invoke-virtual {v4}, LfE3$b$c;->b()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v4

    if-le v1, v4, :cond_2

    invoke-virtual {p1}, LhE3;->e()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LfE3$b$c;

    invoke-virtual {v4}, LfE3$b$c;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1, v0}, LhE3;->c(I)LfE3$b$c;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LfE3$b$c;->f()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :cond_4
    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_5
    :goto_1
    return-object v2
.end method

.method public d(LfE3$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LfE3$a<",
            "TKey;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LfE3$b<",
            "TKey;TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, LfE3$a$d;

    if-eqz v0, :cond_0

    sget-object v0, Lpt2;->b:Lpt2;

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_0
    instance-of v0, p1, LfE3$a$a;

    if-eqz v0, :cond_1

    sget-object v0, Lpt2;->d:Lpt2;

    goto :goto_0

    :cond_1
    instance-of v0, p1, LfE3$a$c;

    if-eqz v0, :cond_3

    sget-object v0, Lpt2;->c:Lpt2;

    goto :goto_0

    :goto_1
    iget v0, p0, Lfp2;->d:I

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_2

    const-string v0, "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould\'ve been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106"

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lfp2;->h(LfE3$a;)I

    move-result v0

    iput v0, p0, Lfp2;->d:I

    :cond_2
    new-instance v0, LWS0$f;

    invoke-virtual {p1}, LfE3$a;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1}, LfE3$a;->b()I

    move-result v4

    invoke-virtual {p1}, LfE3$a;->c()Z

    move-result v5

    iget v6, p0, Lfp2;->d:I

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LWS0$f;-><init>(Lpt2;Ljava/lang/Object;IZI)V

    iget-object v1, p0, Lfp2;->b:LSC0;

    new-instance v2, Lfp2$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, p1, v3}, Lfp2$e;-><init>(Lfp2;LWS0$f;LfE3$a;Lkotlin/coroutines/Continuation;)V

    invoke-static {v1, v2, p2}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final g()LWS0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LWS0<",
            "TKey;TValue;>;"
        }
    .end annotation

    iget-object v0, p0, Lfp2;->c:LWS0;

    return-object v0
.end method

.method public final h(LfE3$a;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LfE3$a<",
            "TKey;>;)I"
        }
    .end annotation

    instance-of v0, p1, LfE3$a$d;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LfE3$a;->b()I

    move-result v0

    rem-int/lit8 v0, v0, 0x3

    if-nez v0, :cond_0

    invoke-virtual {p1}, LfE3$a;->b()I

    move-result p1

    div-int/lit8 p1, p1, 0x3

    return p1

    :cond_0
    invoke-virtual {p1}, LfE3$a;->b()I

    move-result p1

    return p1
.end method

.method public final i(I)V
    .locals 2

    iget v0, p0, Lfp2;->d:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    iput p1, p0, Lfp2;->d:I

    return-void

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Page size is already set to "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lfp2;->d:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x2e

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
