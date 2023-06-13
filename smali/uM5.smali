.class public final LuM5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0015\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u000c\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0008\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0002H\u0002R$\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0013\u00a8\u0006\u001e"
    }
    d2 = {
        "LuM5;",
        "",
        "",
        "default",
        "e",
        "value",
        "a",
        "handle",
        "",
        "f",
        "index",
        "h",
        "g",
        "b",
        "i",
        "atLeast",
        "c",
        "d",
        "<set-?>",
        "I",
        "getSize",
        "()I",
        "size",
        "",
        "[I",
        "values",
        "handles",
        "firstFreeHandle",
        "<init>",
        "()V",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public a:I

.field public b:[I

.field public c:[I

.field public d:[I

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v1, v0, [I

    iput-object v1, p0, LuM5;->b:[I

    new-array v1, v0, [I

    iput-object v1, p0, LuM5;->c:[I

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    add-int/lit8 v3, v2, 0x1

    aput v3, v1, v2

    move v2, v3

    goto :goto_0

    :cond_0
    iput-object v1, p0, LuM5;->d:[I

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 3

    iget v0, p0, LuM5;->a:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, LuM5;->c(I)V

    iget v0, p0, LuM5;->a:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, LuM5;->a:I

    invoke-virtual {p0}, LuM5;->b()I

    move-result v1

    iget-object v2, p0, LuM5;->b:[I

    aput p1, v2, v0

    iget-object p1, p0, LuM5;->c:[I

    aput v1, p1, v0

    iget-object p1, p0, LuM5;->d:[I

    aput v0, p1, v1

    invoke-virtual {p0, v0}, LuM5;->h(I)V

    return v1
.end method

.method public final b()I
    .locals 9

    iget-object v0, p0, LuM5;->d:[I

    array-length v0, v0

    iget v1, p0, LuM5;->e:I

    if-lt v1, v0, :cond_1

    mul-int/lit8 v0, v0, 0x2

    new-array v8, v0, [I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int/lit8 v2, v1, 0x1

    aput v2, v8, v1

    move v1, v2

    goto :goto_0

    :cond_0
    iget-object v1, p0, LuM5;->d:[I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    move-object v2, v8

    invoke-static/range {v1 .. v7}, Lkotlin/collections/ArraysKt;->copyInto$default([I[IIIIILjava/lang/Object;)[I

    iput-object v8, p0, LuM5;->d:[I

    :cond_1
    iget v0, p0, LuM5;->e:I

    iget-object v1, p0, LuM5;->d:[I

    aget v1, v1, v0

    iput v1, p0, LuM5;->e:I

    return v0
.end method

.method public final c(I)V
    .locals 10

    iget-object v0, p0, LuM5;->b:[I

    array-length v1, v0

    if-gt p1, v1, :cond_0

    return-void

    :cond_0
    mul-int/lit8 v1, v1, 0x2

    new-array p1, v1, [I

    new-array v9, v1, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xe

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lkotlin/collections/ArraysKt;->copyInto$default([I[IIIIILjava/lang/Object;)[I

    iget-object v2, p0, LuM5;->c:[I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v8, 0x0

    move-object v3, v9

    invoke-static/range {v2 .. v8}, Lkotlin/collections/ArraysKt;->copyInto$default([I[IIIIILjava/lang/Object;)[I

    iput-object p1, p0, LuM5;->b:[I

    iput-object v9, p0, LuM5;->c:[I

    return-void
.end method

.method public final d(I)V
    .locals 2

    iget-object v0, p0, LuM5;->d:[I

    iget v1, p0, LuM5;->e:I

    aput v1, v0, p1

    iput p1, p0, LuM5;->e:I

    return-void
.end method

.method public final e(I)I
    .locals 1

    iget v0, p0, LuM5;->a:I

    if-lez v0, :cond_0

    iget-object p1, p0, LuM5;->b:[I

    const/4 v0, 0x0

    aget p1, p1, v0

    :cond_0
    return p1
.end method

.method public final f(I)V
    .locals 2

    iget-object v0, p0, LuM5;->d:[I

    aget v0, v0, p1

    iget v1, p0, LuM5;->a:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v0, v1}, LuM5;->i(II)V

    iget v1, p0, LuM5;->a:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, LuM5;->a:I

    invoke-virtual {p0, v0}, LuM5;->h(I)V

    invoke-virtual {p0, v0}, LuM5;->g(I)V

    invoke-virtual {p0, p1}, LuM5;->d(I)V

    return-void
.end method

.method public final g(I)V
    .locals 6

    iget-object v0, p0, LuM5;->b:[I

    iget v1, p0, LuM5;->a:I

    shr-int/lit8 v1, v1, 0x1

    :goto_0
    if-ge p1, v1, :cond_2

    add-int/lit8 v2, p1, 0x1

    shl-int/lit8 v2, v2, 0x1

    add-int/lit8 v3, v2, -0x1

    iget v4, p0, LuM5;->a:I

    if-ge v2, v4, :cond_1

    aget v4, v0, v2

    aget v5, v0, v3

    if-ge v4, v5, :cond_1

    aget v3, v0, p1

    if-ge v4, v3, :cond_0

    invoke-virtual {p0, v2, p1}, LuM5;->i(II)V

    move p1, v2

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    aget v2, v0, v3

    aget v4, v0, p1

    if-ge v2, v4, :cond_2

    invoke-virtual {p0, v3, p1}, LuM5;->i(II)V

    move p1, v3

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final h(I)V
    .locals 4

    iget-object v0, p0, LuM5;->b:[I

    aget v1, v0, p1

    :goto_0
    if-lez p1, :cond_0

    add-int/lit8 v2, p1, 0x1

    shr-int/lit8 v2, v2, 0x1

    add-int/lit8 v2, v2, -0x1

    aget v3, v0, v2

    if-le v3, v1, :cond_0

    invoke-virtual {p0, v2, p1}, LuM5;->i(II)V

    move p1, v2

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final i(II)V
    .locals 5

    iget-object v0, p0, LuM5;->b:[I

    iget-object v1, p0, LuM5;->c:[I

    iget-object v2, p0, LuM5;->d:[I

    aget v3, v0, p1

    aget v4, v0, p2

    aput v4, v0, p1

    aput v3, v0, p2

    aget v0, v1, p1

    aget v3, v1, p2

    aput v3, v1, p1

    aput v0, v1, p2

    aget v0, v1, p1

    aput p1, v2, v0

    aget p1, v1, p2

    aput p2, v2, p1

    return-void
.end method
