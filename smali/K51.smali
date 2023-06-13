.class public final LK51;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J4\u0010\t\u001a\u00020\u0008\"\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00052\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005J8\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002\u00a8\u0006\u0013"
    }
    d2 = {
        "LK51;",
        "",
        "T",
        "LBs2;",
        "callback",
        "Lnd3;",
        "oldList",
        "newList",
        "",
        "b",
        "",
        "startBoundary",
        "endBoundary",
        "start",
        "end",
        "payload",
        "a",
        "<init>",
        "()V",
        "paging-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final a:LK51;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LK51;

    invoke-direct {v0}, LK51;-><init>()V

    sput-object v0, LK51;->a:LK51;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LBs2;IIIILjava/lang/Object;)V
    .locals 0

    sub-int/2addr p2, p4

    if-lez p2, :cond_0

    invoke-interface {p1, p4, p2, p6}, LBs2;->onChanged(IILjava/lang/Object;)V

    :cond_0
    sub-int/2addr p5, p3

    if-lez p5, :cond_1

    invoke-interface {p1, p3, p5, p6}, LBs2;->onChanged(IILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final b(LBs2;Lnd3;Lnd3;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LBs2;",
            "Lnd3<",
            "TT;>;",
            "Lnd3<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oldList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newList"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lnd3;->c()I

    move-result v0

    invoke-interface {p3}, Lnd3;->c()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-interface {p2}, Lnd3;->c()I

    move-result v1

    invoke-interface {p2}, Lnd3;->b()I

    move-result v2

    add-int/2addr v1, v2

    invoke-interface {p3}, Lnd3;->c()I

    move-result v2

    invoke-interface {p3}, Lnd3;->b()I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int v2, v1, v0

    if-lez v2, :cond_0

    invoke-interface {p1, v0, v2}, LBs2;->onRemoved(II)V

    invoke-interface {p1, v0, v2}, LBs2;->onInserted(II)V

    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-interface {p2}, Lnd3;->c()I

    move-result v1

    invoke-interface {p3}, Lnd3;->a()I

    move-result v3

    invoke-static {v1, v3}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v7

    invoke-interface {p2}, Lnd3;->c()I

    move-result v1

    invoke-interface {p2}, Lnd3;->b()I

    move-result v3

    add-int/2addr v1, v3

    invoke-interface {p3}, Lnd3;->a()I

    move-result v3

    invoke-static {v1, v3}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v8

    sget-object v9, LO31;->b:LO31;

    move-object v3, p0

    move-object v4, p1

    move v5, v2

    move v6, v0

    invoke-virtual/range {v3 .. v9}, LK51;->a(LBs2;IIIILjava/lang/Object;)V

    invoke-interface {p3}, Lnd3;->c()I

    move-result v1

    invoke-interface {p2}, Lnd3;->a()I

    move-result v3

    invoke-static {v1, v3}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v7

    invoke-interface {p3}, Lnd3;->c()I

    move-result v1

    invoke-interface {p3}, Lnd3;->b()I

    move-result v3

    add-int/2addr v1, v3

    invoke-interface {p2}, Lnd3;->a()I

    move-result v3

    invoke-static {v1, v3}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v8

    sget-object v9, LO31;->c:LO31;

    move-object v3, p0

    invoke-virtual/range {v3 .. v9}, LK51;->a(LBs2;IIIILjava/lang/Object;)V

    invoke-interface {p3}, Lnd3;->a()I

    move-result p3

    invoke-interface {p2}, Lnd3;->a()I

    move-result v0

    sub-int/2addr p3, v0

    if-lez p3, :cond_1

    invoke-interface {p2}, Lnd3;->a()I

    move-result p2

    invoke-interface {p1, p2, p3}, LBs2;->onInserted(II)V

    goto :goto_0

    :cond_1
    if-gez p3, :cond_2

    invoke-interface {p2}, Lnd3;->a()I

    move-result p2

    add-int/2addr p2, p3

    neg-int p3, p3

    invoke-interface {p1, p2, p3}, LBs2;->onRemoved(II)V

    :cond_2
    :goto_0
    return-void
.end method
