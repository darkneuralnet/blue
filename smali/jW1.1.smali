.class public final LjW1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000e\n\u0002\u0010\u0011\n\u0002\u0008\u0007\n\u0002\u0010\u0015\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\"\u0010\u0010J\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0012\u0010\u0006\u001a\u00020\u00032\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0008\u001a\u00020\u0003H\u0002R(\u0010\u0011\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0005\u0010\n\u0012\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR0\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00128\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0006\u0010\u0013\u0012\u0004\u0008\u0018\u0010\u0010\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R(\u0010!\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\t\u0010\u001b\u0012\u0004\u0008 \u0010\u0010\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001f\u00a8\u0006#"
    }
    d2 = {
        "LjW1;",
        "",
        "key",
        "",
        "value",
        "a",
        "b",
        "midIndex",
        "valueHash",
        "c",
        "I",
        "e",
        "()I",
        "g",
        "(I)V",
        "getSize$annotations",
        "()V",
        "size",
        "",
        "[Ljava/lang/Object;",
        "d",
        "()[Ljava/lang/Object;",
        "setKeys",
        "([Ljava/lang/Object;)V",
        "getKeys$annotations",
        "keys",
        "",
        "[I",
        "f",
        "()[I",
        "setValues",
        "([I)V",
        "getValues$annotations",
        "values",
        "<init>",
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

.field public b:[Ljava/lang/Object;

.field public c:[I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v1, v0, [Ljava/lang/Object;

    iput-object v1, p0, LjW1;->b:[Ljava/lang/Object;

    new-array v0, v0, [I

    iput-object v0, p0, LjW1;->c:[I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;I)I
    .locals 11

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LjW1;->a:I

    const/4 v1, -0x1

    if-lez v0, :cond_0

    invoke-virtual {p0, p1}, LjW1;->b(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_1

    iget-object p1, p0, LjW1;->c:[I

    aget v1, p1, v0

    aput p2, p1, v0

    return v1

    :cond_0
    move v0, v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    neg-int v0, v0

    iget v2, p0, LjW1;->a:I

    iget-object v3, p0, LjW1;->b:[Ljava/lang/Object;

    array-length v4, v3

    if-ne v2, v4, :cond_2

    array-length v4, v3

    mul-int/lit8 v4, v4, 0x2

    new-array v9, v4, [Ljava/lang/Object;

    array-length v4, v3

    mul-int/lit8 v4, v4, 0x2

    new-array v10, v4, [I

    add-int/lit8 v4, v0, 0x1

    invoke-static {v3, v9, v4, v0, v2}, Lkotlin/collections/ArraysKt;->copyInto([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iget-object v2, p0, LjW1;->c:[I

    iget v3, p0, LjW1;->a:I

    invoke-static {v2, v10, v4, v0, v3}, Lkotlin/collections/ArraysKt;->copyInto([I[IIII)[I

    iget-object v2, p0, LjW1;->b:[Ljava/lang/Object;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v9

    move v6, v0

    invoke-static/range {v2 .. v8}, Lkotlin/collections/ArraysKt;->copyInto$default([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    iget-object v2, p0, LjW1;->c:[I

    move-object v3, v10

    invoke-static/range {v2 .. v8}, Lkotlin/collections/ArraysKt;->copyInto$default([I[IIIIILjava/lang/Object;)[I

    iput-object v9, p0, LjW1;->b:[Ljava/lang/Object;

    iput-object v10, p0, LjW1;->c:[I

    goto :goto_0

    :cond_2
    add-int/lit8 v4, v0, 0x1

    invoke-static {v3, v3, v4, v0, v2}, Lkotlin/collections/ArraysKt;->copyInto([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iget-object v2, p0, LjW1;->c:[I

    iget v3, p0, LjW1;->a:I

    invoke-static {v2, v2, v4, v0, v3}, Lkotlin/collections/ArraysKt;->copyInto([I[IIII)[I

    :goto_0
    iget-object v2, p0, LjW1;->b:[Ljava/lang/Object;

    aput-object p1, v2, v0

    iget-object p1, p0, LjW1;->c:[I

    aput p2, p1, v0

    iget p1, p0, LjW1;->a:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LjW1;->a:I

    return v1
.end method

.method public final b(Ljava/lang/Object;)I
    .locals 6

    iget v0, p0, LjW1;->a:I

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1}, LB6;->a(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-gt v2, v0, :cond_3

    add-int v3, v2, v0

    ushr-int/lit8 v3, v3, 0x1

    iget-object v4, p0, LjW1;->b:[Ljava/lang/Object;

    aget-object v4, v4, v3

    invoke-static {v4}, LB6;->a(Ljava/lang/Object;)I

    move-result v5

    if-ge v5, v1, :cond_0

    add-int/lit8 v2, v3, 0x1

    goto :goto_0

    :cond_0
    if-le v5, v1, :cond_1

    add-int/lit8 v0, v3, -0x1

    goto :goto_0

    :cond_1
    if-ne v4, p1, :cond_2

    return v3

    :cond_2
    invoke-virtual {p0, v3, p1, v1}, LjW1;->c(ILjava/lang/Object;I)I

    move-result p1

    return p1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    neg-int p1, v2

    return p1
.end method

.method public final c(ILjava/lang/Object;I)I
    .locals 2

    add-int/lit8 v0, p1, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_2

    iget-object v1, p0, LjW1;->b:[Ljava/lang/Object;

    aget-object v1, v1, v0

    if-ne v1, p2, :cond_0

    return v0

    :cond_0
    invoke-static {v1}, LB6;->a(Ljava/lang/Object;)I

    move-result v1

    if-eq v1, p3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    add-int/lit8 p1, p1, 0x1

    iget v0, p0, LjW1;->a:I

    :goto_2
    if-ge p1, v0, :cond_5

    iget-object v1, p0, LjW1;->b:[Ljava/lang/Object;

    aget-object v1, v1, p1

    if-ne v1, p2, :cond_3

    return p1

    :cond_3
    invoke-static {v1}, LB6;->a(Ljava/lang/Object;)I

    move-result v1

    if-eq v1, p3, :cond_4

    :goto_3
    add-int/lit8 p1, p1, 0x1

    neg-int p1, p1

    return p1

    :cond_4
    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_5
    iget p1, p0, LjW1;->a:I

    goto :goto_3
.end method

.method public final d()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LjW1;->b:[Ljava/lang/Object;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, LjW1;->a:I

    return v0
.end method

.method public final f()[I
    .locals 1

    iget-object v0, p0, LjW1;->c:[I

    return-object v0
.end method

.method public final g(I)V
    .locals 0

    iput p1, p0, LjW1;->a:I

    return-void
.end method
