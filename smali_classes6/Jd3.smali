.class public LJd3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJd3$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public transient a:[Ljava/lang/Object;

.field public transient b:[I

.field public transient c:I

.field public transient d:I

.field public transient e:[I

.field public transient f:[J

.field public transient g:F

.field public transient h:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0, v1}, LJd3;->k(IF)V

    return-void
.end method

.method public static A(JI)J
    .locals 4

    const-wide v0, -0x100000000L

    and-long/2addr p0, v0

    const-wide v0, 0xffffffffL

    int-to-long v2, p2

    and-long/2addr v0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static e(J)I
    .locals 1

    const/16 v0, 0x20

    ushr-long/2addr p0, v0

    long-to-int p0, p0

    return p0
.end method

.method public static g(J)I
    .locals 0

    long-to-int p0, p0

    return p0
.end method

.method public static n(I)[J
    .locals 2

    new-array p0, p0, [J

    const-wide/16 v0, -0x1

    invoke-static {p0, v0, v1}, Ljava/util/Arrays;->fill([JJ)V

    return-object p0
.end method

.method public static o(I)[I
    .locals 1

    new-array p0, p0, [I

    const/4 v0, -0x1

    invoke-static {p0, v0}, Ljava/util/Arrays;->fill([II)V

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 4

    iget v0, p0, LJd3;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LJd3;->d:I

    iget-object v0, p0, LJd3;->a:[Ljava/lang/Object;

    iget v1, p0, LJd3;->c:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    iget-object v0, p0, LJd3;->b:[I

    iget v1, p0, LJd3;->c:I

    invoke-static {v0, v3, v1, v3}, Ljava/util/Arrays;->fill([IIII)V

    iget-object v0, p0, LJd3;->e:[I

    const/4 v1, -0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, LJd3;->f:[J

    const-wide/16 v1, -0x1

    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->fill([JJ)V

    iput v3, p0, LJd3;->c:I

    return-void
.end method

.method public b()I
    .locals 1

    iget v0, p0, LJd3;->c:I

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0, p1}, LJd3;->j(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LJd3;->b:[I

    aget p1, v0, p1

    :goto_0
    return p1
.end method

.method public d(I)LmX2$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "LmX2$a<",
            "TK;>;"
        }
    .end annotation

    iget v0, p0, LJd3;->c:I

    invoke-static {p1, v0}, LEZ3;->l(II)I

    new-instance v0, LJd3$a;

    invoke-direct {v0, p0, p1}, LJd3$a;-><init>(LJd3;I)V

    return-object v0
.end method

.method public f(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TK;"
        }
    .end annotation

    iget v0, p0, LJd3;->c:I

    invoke-static {p1, v0}, LEZ3;->l(II)I

    iget-object v0, p0, LJd3;->a:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public h(I)I
    .locals 1

    iget v0, p0, LJd3;->c:I

    invoke-static {p1, v0}, LEZ3;->l(II)I

    iget-object v0, p0, LJd3;->b:[I

    aget p1, v0, p1

    return p1
.end method

.method public final i()I
    .locals 1

    iget-object v0, p0, LJd3;->e:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public j(Ljava/lang/Object;)I
    .locals 5

    invoke-static {p1}, LwH1;->c(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, LJd3;->e:[I

    invoke-virtual {p0}, LJd3;->i()I

    move-result v2

    and-int/2addr v2, v0

    aget v1, v1, v2

    :goto_0
    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    iget-object v2, p0, LJd3;->f:[J

    aget-wide v3, v2, v1

    invoke-static {v3, v4}, LJd3;->e(J)I

    move-result v2

    if-ne v2, v0, :cond_0

    iget-object v2, p0, LJd3;->a:[Ljava/lang/Object;

    aget-object v2, v2, v1

    invoke-static {p1, v2}, LXd3;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    invoke-static {v3, v4}, LJd3;->g(J)I

    move-result v1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public k(IF)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    const-string v3, "Initial capacity must be non-negative"

    invoke-static {v2, v3}, LEZ3;->e(ZLjava/lang/Object;)V

    const/4 v2, 0x0

    cmpl-float v2, p2, v2

    if-lez v2, :cond_1

    move v0, v1

    :cond_1
    const-string v2, "Illegal load factor"

    invoke-static {v0, v2}, LEZ3;->e(ZLjava/lang/Object;)V

    float-to-double v2, p2

    invoke-static {p1, v2, v3}, LwH1;->a(ID)I

    move-result v0

    invoke-static {v0}, LJd3;->o(I)[I

    move-result-object v2

    iput-object v2, p0, LJd3;->e:[I

    iput p2, p0, LJd3;->g:F

    new-array v2, p1, [Ljava/lang/Object;

    iput-object v2, p0, LJd3;->a:[Ljava/lang/Object;

    new-array v2, p1, [I

    iput-object v2, p0, LJd3;->b:[I

    invoke-static {p1}, LJd3;->n(I)[J

    move-result-object p1

    iput-object p1, p0, LJd3;->f:[J

    int-to-float p1, v0

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, LJd3;->h:I

    return-void
.end method

.method public l(ILjava/lang/Object;II)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITK;II)V"
        }
    .end annotation

    iget-object v0, p0, LJd3;->f:[J

    int-to-long v1, p4

    const/16 p4, 0x20

    shl-long/2addr v1, p4

    const-wide v3, 0xffffffffL

    or-long/2addr v1, v3

    aput-wide v1, v0, p1

    iget-object p4, p0, LJd3;->a:[Ljava/lang/Object;

    aput-object p2, p4, p1

    iget-object p2, p0, LJd3;->b:[I

    aput p3, p2, p1

    return-void
.end method

.method public m(I)V
    .locals 8

    invoke-virtual {p0}, LJd3;->z()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-ge p1, v0, :cond_2

    iget-object v5, p0, LJd3;->a:[Ljava/lang/Object;

    aget-object v6, v5, v0

    aput-object v6, v5, p1

    iget-object v6, p0, LJd3;->b:[I

    aget v7, v6, v0

    aput v7, v6, p1

    aput-object v4, v5, v0

    aput v3, v6, v0

    iget-object v3, p0, LJd3;->f:[J

    aget-wide v4, v3, v0

    aput-wide v4, v3, p1

    aput-wide v1, v3, v0

    invoke-static {v4, v5}, LJd3;->e(J)I

    move-result v1

    invoke-virtual {p0}, LJd3;->i()I

    move-result v2

    and-int/2addr v1, v2

    iget-object v2, p0, LJd3;->e:[I

    aget v3, v2, v1

    if-ne v3, v0, :cond_0

    aput p1, v2, v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, LJd3;->f:[J

    aget-wide v4, v1, v3

    invoke-static {v4, v5}, LJd3;->g(J)I

    move-result v1

    if-ne v1, v0, :cond_1

    iget-object v0, p0, LJd3;->f:[J

    invoke-static {v4, v5, p1}, LJd3;->A(JI)J

    move-result-wide v1

    aput-wide v1, v0, v3

    goto :goto_1

    :cond_1
    move v3, v1

    goto :goto_0

    :cond_2
    iget-object v0, p0, LJd3;->a:[Ljava/lang/Object;

    aput-object v4, v0, p1

    iget-object v0, p0, LJd3;->b:[I

    aput v3, v0, p1

    iget-object v0, p0, LJd3;->f:[J

    aput-wide v1, v0, p1

    :goto_1
    return-void
.end method

.method public p(I)I
    .locals 1

    add-int/lit8 p1, p1, 0x1

    iget v0, p0, LJd3;->c:I

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public q(II)I
    .locals 0

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public r(Ljava/lang/Object;I)I
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I)I"
        }
    .end annotation

    const-string v0, "count"

    invoke-static {p2, v0}, Ldm0;->c(ILjava/lang/String;)V

    iget-object v0, p0, LJd3;->f:[J

    iget-object v1, p0, LJd3;->a:[Ljava/lang/Object;

    iget-object v2, p0, LJd3;->b:[I

    invoke-static {p1}, LwH1;->c(Ljava/lang/Object;)I

    move-result v3

    invoke-virtual {p0}, LJd3;->i()I

    move-result v4

    and-int/2addr v4, v3

    iget v5, p0, LJd3;->c:I

    iget-object v6, p0, LJd3;->e:[I

    aget v7, v6, v4

    const/4 v8, -0x1

    if-ne v7, v8, :cond_0

    aput v5, v6, v4

    goto :goto_1

    :cond_0
    :goto_0
    aget-wide v9, v0, v7

    invoke-static {v9, v10}, LJd3;->e(J)I

    move-result v4

    if-ne v4, v3, :cond_1

    aget-object v4, v1, v7

    invoke-static {p1, v4}, LXd3;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    aget p1, v2, v7

    aput p2, v2, v7

    return p1

    :cond_1
    invoke-static {v9, v10}, LJd3;->g(J)I

    move-result v4

    if-ne v4, v8, :cond_4

    invoke-static {v9, v10, v5}, LJd3;->A(JI)J

    move-result-wide v1

    aput-wide v1, v0, v7

    :goto_1
    const v0, 0x7fffffff

    if-eq v5, v0, :cond_3

    add-int/lit8 v0, v5, 0x1

    invoke-virtual {p0, v0}, LJd3;->w(I)V

    invoke-virtual {p0, v5, p1, p2, v3}, LJd3;->l(ILjava/lang/Object;II)V

    iput v0, p0, LJd3;->c:I

    iget p1, p0, LJd3;->h:I

    if-lt v5, p1, :cond_2

    iget-object p1, p0, LJd3;->e:[I

    array-length p1, p1

    mul-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, LJd3;->x(I)V

    :cond_2
    iget p1, p0, LJd3;->d:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LJd3;->d:I

    const/4 p1, 0x0

    return p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot contain more than Integer.MAX_VALUE elements!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    move v7, v4

    goto :goto_0
.end method

.method public s(Ljava/lang/Object;)I
    .locals 1

    invoke-static {p1}, LwH1;->c(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, p1, v0}, LJd3;->t(Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final t(Ljava/lang/Object;I)I
    .locals 9

    invoke-virtual {p0}, LJd3;->i()I

    move-result v0

    and-int/2addr v0, p2

    iget-object v1, p0, LJd3;->e:[I

    aget v1, v1, v0

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    return v2

    :cond_0
    move v4, v3

    :goto_0
    iget-object v5, p0, LJd3;->f:[J

    aget-wide v6, v5, v1

    invoke-static {v6, v7}, LJd3;->e(J)I

    move-result v5

    if-ne v5, p2, :cond_2

    iget-object v5, p0, LJd3;->a:[Ljava/lang/Object;

    aget-object v5, v5, v1

    invoke-static {p1, v5}, LXd3;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object p1, p0, LJd3;->b:[I

    aget p1, p1, v1

    if-ne v4, v3, :cond_1

    iget-object p2, p0, LJd3;->e:[I

    iget-object v2, p0, LJd3;->f:[J

    aget-wide v3, v2, v1

    invoke-static {v3, v4}, LJd3;->g(J)I

    move-result v2

    aput v2, p2, v0

    goto :goto_1

    :cond_1
    iget-object p2, p0, LJd3;->f:[J

    aget-wide v2, p2, v4

    aget-wide v5, p2, v1

    invoke-static {v5, v6}, LJd3;->g(J)I

    move-result v0

    invoke-static {v2, v3, v0}, LJd3;->A(JI)J

    move-result-wide v2

    aput-wide v2, p2, v4

    :goto_1
    invoke-virtual {p0, v1}, LJd3;->m(I)V

    iget p2, p0, LJd3;->c:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, LJd3;->c:I

    iget p2, p0, LJd3;->d:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, LJd3;->d:I

    return p1

    :cond_2
    iget-object v4, p0, LJd3;->f:[J

    aget-wide v5, v4, v1

    invoke-static {v5, v6}, LJd3;->g(J)I

    move-result v4

    if-ne v4, v3, :cond_3

    return v2

    :cond_3
    move v8, v4

    move v4, v1

    move v1, v8

    goto :goto_0
.end method

.method public u(I)I
    .locals 4

    iget-object v0, p0, LJd3;->a:[Ljava/lang/Object;

    aget-object v0, v0, p1

    iget-object v1, p0, LJd3;->f:[J

    aget-wide v2, v1, p1

    invoke-static {v2, v3}, LJd3;->e(J)I

    move-result p1

    invoke-virtual {p0, v0, p1}, LJd3;->t(Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public v(I)V
    .locals 4

    iget-object v0, p0, LJd3;->a:[Ljava/lang/Object;

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LJd3;->a:[Ljava/lang/Object;

    iget-object v0, p0, LJd3;->b:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, LJd3;->b:[I

    iget-object v0, p0, LJd3;->f:[J

    array-length v1, v0

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    if-le p1, v1, :cond_0

    const-wide/16 v2, -0x1

    invoke-static {v0, v1, p1, v2, v3}, Ljava/util/Arrays;->fill([JIIJ)V

    :cond_0
    iput-object v0, p0, LJd3;->f:[J

    return-void
.end method

.method public final w(I)V
    .locals 2

    iget-object v0, p0, LJd3;->f:[J

    array-length v0, v0

    if-le p1, v0, :cond_1

    ushr-int/lit8 p1, v0, 0x1

    const/4 v1, 0x1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/2addr p1, v0

    if-gez p1, :cond_0

    const p1, 0x7fffffff

    :cond_0
    if-eq p1, v0, :cond_1

    invoke-virtual {p0, p1}, LJd3;->v(I)V

    :cond_1
    return-void
.end method

.method public final x(I)V
    .locals 11

    iget-object v0, p0, LJd3;->e:[I

    array-length v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    if-lt v0, v1, :cond_0

    const p1, 0x7fffffff

    iput p1, p0, LJd3;->h:I

    return-void

    :cond_0
    int-to-float v0, p1

    iget v1, p0, LJd3;->g:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {p1}, LJd3;->o(I)[I

    move-result-object p1

    iget-object v1, p0, LJd3;->f:[J

    array-length v2, p1

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    :goto_0
    iget v4, p0, LJd3;->c:I

    if-ge v3, v4, :cond_1

    aget-wide v4, v1, v3

    invoke-static {v4, v5}, LJd3;->e(J)I

    move-result v4

    and-int v5, v4, v2

    aget v6, p1, v5

    aput v3, p1, v5

    int-to-long v4, v4

    const/16 v7, 0x20

    shl-long/2addr v4, v7

    const-wide v7, 0xffffffffL

    int-to-long v9, v6

    and-long v6, v9, v7

    or-long/2addr v4, v6

    aput-wide v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iput v0, p0, LJd3;->h:I

    iput-object p1, p0, LJd3;->e:[I

    return-void
.end method

.method public y(II)V
    .locals 1

    iget v0, p0, LJd3;->c:I

    invoke-static {p1, v0}, LEZ3;->l(II)I

    iget-object v0, p0, LJd3;->b:[I

    aput p2, v0, p1

    return-void
.end method

.method public z()I
    .locals 1

    iget v0, p0, LJd3;->c:I

    return v0
.end method
