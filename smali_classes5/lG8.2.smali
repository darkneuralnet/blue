.class public final LlG8;
.super LBF8;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, LBF8;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final varargs a([Ljava/lang/Object;)LlG8;
    .locals 6

    const/16 v0, 0xf

    invoke-static {p1, v0}, LlI8;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    iget v1, p0, LBF8;->b:I

    add-int/2addr v1, v0

    iget-object v2, p0, LBF8;->a:[Ljava/lang/Object;

    array-length v3, v2

    const/4 v4, 0x0

    if-ge v3, v1, :cond_2

    shr-int/lit8 v5, v3, 0x1

    add-int/2addr v3, v5

    add-int/lit8 v3, v3, 0x1

    if-ge v3, v1, :cond_0

    add-int/lit8 v1, v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v1

    add-int v3, v1, v1

    :cond_0
    if-gez v3, :cond_1

    const v3, 0x7fffffff

    :cond_1
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, LBF8;->a:[Ljava/lang/Object;

    iput-boolean v4, p0, LBF8;->c:Z

    goto :goto_0

    :cond_2
    iget-boolean v1, p0, LBF8;->c:Z

    if-eqz v1, :cond_3

    invoke-virtual {v2}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, p0, LBF8;->a:[Ljava/lang/Object;

    iput-boolean v4, p0, LBF8;->c:Z

    :cond_3
    :goto_0
    iget-object v1, p0, LBF8;->a:[Ljava/lang/Object;

    iget v2, p0, LBF8;->b:I

    invoke-static {p1, v4, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, LBF8;->b:I

    add-int/2addr p1, v0

    iput p1, p0, LBF8;->b:I

    return-object p0
.end method

.method public final b()LCH8;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LBF8;->c:Z

    iget-object v0, p0, LBF8;->a:[Ljava/lang/Object;

    iget v1, p0, LBF8;->b:I

    invoke-static {v0, v1}, LCH8;->j([Ljava/lang/Object;I)LCH8;

    move-result-object v0

    return-object v0
.end method
