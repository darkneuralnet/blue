.class public final LY11;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY11$a;
    }
.end annotation


# static fields
.field public static final g:[I


# instance fields
.field public final a:LET;

.field public b:Z

.field public c:I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, LY11;->g:[I

    return-void

    nop

    :array_0
    .array-data 4
        0xee0
        0x1dc
        0x83b
        0x707
    .end array-data
.end method

.method public constructor <init>(LET;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY11;->a:LET;

    return-void
.end method

.method public static b(LY11$a;LY11$a;)F
    .locals 2

    invoke-virtual {p0}, LY11$a;->a()I

    move-result v0

    invoke-virtual {p0}, LY11$a;->b()I

    move-result p0

    invoke-virtual {p1}, LY11$a;->a()I

    move-result v1

    invoke-virtual {p1}, LY11$a;->b()I

    move-result p1

    invoke-static {v0, p0, v1, p1}, LdN2;->b(IIII)F

    move-result p0

    return p0
.end method

.method public static c(LfN4;LfN4;)F
    .locals 2

    invoke-virtual {p0}, LfN4;->c()F

    move-result v0

    invoke-virtual {p0}, LfN4;->d()F

    move-result p0

    invoke-virtual {p1}, LfN4;->c()F

    move-result v1

    invoke-virtual {p1}, LfN4;->d()F

    move-result p1

    invoke-static {v0, p0, v1, p1}, LdN2;->a(FFFF)F

    move-result p0

    return p0
.end method

.method public static d([LfN4;II)[LfN4;
    .locals 10

    int-to-float p2, p2

    int-to-float p1, p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr p1, v0

    div-float/2addr p2, p1

    const/4 p1, 0x0

    aget-object v1, p0, p1

    invoke-virtual {v1}, LfN4;->c()F

    move-result v1

    const/4 v2, 0x2

    aget-object v3, p0, v2

    invoke-virtual {v3}, LfN4;->c()F

    move-result v3

    sub-float/2addr v1, v3

    aget-object v3, p0, p1

    invoke-virtual {v3}, LfN4;->d()F

    move-result v3

    aget-object v4, p0, v2

    invoke-virtual {v4}, LfN4;->d()F

    move-result v4

    sub-float/2addr v3, v4

    aget-object v4, p0, p1

    invoke-virtual {v4}, LfN4;->c()F

    move-result v4

    aget-object v5, p0, v2

    invoke-virtual {v5}, LfN4;->c()F

    move-result v5

    add-float/2addr v4, v5

    div-float/2addr v4, v0

    aget-object v5, p0, p1

    invoke-virtual {v5}, LfN4;->d()F

    move-result v5

    aget-object v6, p0, v2

    invoke-virtual {v6}, LfN4;->d()F

    move-result v6

    add-float/2addr v5, v6

    div-float/2addr v5, v0

    new-instance v6, LfN4;

    mul-float/2addr v1, p2

    add-float v7, v4, v1

    mul-float/2addr v3, p2

    add-float v8, v5, v3

    invoke-direct {v6, v7, v8}, LfN4;-><init>(FF)V

    new-instance v7, LfN4;

    sub-float/2addr v4, v1

    sub-float/2addr v5, v3

    invoke-direct {v7, v4, v5}, LfN4;-><init>(FF)V

    const/4 v1, 0x1

    aget-object v3, p0, v1

    invoke-virtual {v3}, LfN4;->c()F

    move-result v3

    const/4 v4, 0x3

    aget-object v5, p0, v4

    invoke-virtual {v5}, LfN4;->c()F

    move-result v5

    sub-float/2addr v3, v5

    aget-object v5, p0, v1

    invoke-virtual {v5}, LfN4;->d()F

    move-result v5

    aget-object v8, p0, v4

    invoke-virtual {v8}, LfN4;->d()F

    move-result v8

    sub-float/2addr v5, v8

    aget-object v8, p0, v1

    invoke-virtual {v8}, LfN4;->c()F

    move-result v8

    aget-object v9, p0, v4

    invoke-virtual {v9}, LfN4;->c()F

    move-result v9

    add-float/2addr v8, v9

    div-float/2addr v8, v0

    aget-object v9, p0, v1

    invoke-virtual {v9}, LfN4;->d()F

    move-result v9

    aget-object p0, p0, v4

    invoke-virtual {p0}, LfN4;->d()F

    move-result p0

    add-float/2addr v9, p0

    div-float/2addr v9, v0

    new-instance p0, LfN4;

    mul-float/2addr v3, p2

    add-float v0, v8, v3

    mul-float/2addr p2, v5

    add-float v5, v9, p2

    invoke-direct {p0, v0, v5}, LfN4;-><init>(FF)V

    new-instance v0, LfN4;

    sub-float/2addr v8, v3

    sub-float/2addr v9, p2

    invoke-direct {v0, v8, v9}, LfN4;-><init>(FF)V

    const/4 p2, 0x4

    new-array p2, p2, [LfN4;

    aput-object v6, p2, p1

    aput-object p0, p2, v1

    aput-object v7, p2, v2

    aput-object v0, p2, v4

    return-object p2
.end method

.method public static h(JZ)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    const/4 v0, 0x4

    if-eqz p2, :cond_0

    const/4 p2, 0x7

    const/4 v1, 0x2

    goto :goto_0

    :cond_0
    const/16 p2, 0xa

    move v1, v0

    :goto_0
    sub-int v2, p2, v1

    new-array v3, p2, [I

    add-int/lit8 p2, p2, -0x1

    :goto_1
    if-ltz p2, :cond_1

    long-to-int v4, p0

    and-int/lit8 v4, v4, 0xf

    aput v4, v3, p2

    shr-long/2addr p0, v0

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_1
    :try_start_0
    new-instance p0, Lit4;

    sget-object p1, LuB1;->k:LuB1;

    invoke-direct {p0, p1}, Lit4;-><init>(LuB1;)V

    invoke-virtual {p0, v3, v2}, Lit4;->a([II)V
    :try_end_0
    .catch Lcom/google/zxing/common/reedsolomon/ReedSolomonException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x0

    move p1, p0

    :goto_2
    if-ge p0, v1, :cond_2

    shl-int/lit8 p1, p1, 0x4

    aget p2, v3, p0

    add-int/2addr p1, p2

    add-int/lit8 p0, p0, 0x1

    goto :goto_2

    :cond_2
    return p1

    :catch_0
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0
.end method

.method public static m([II)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    const/4 v4, 0x2

    if-ge v2, v0, :cond_0

    aget v5, p0, v2

    add-int/lit8 v4, p1, -0x2

    shr-int v4, v5, v4

    shl-int/lit8 v4, v4, 0x1

    and-int/lit8 v5, v5, 0x1

    add-int/2addr v4, v5

    shl-int/lit8 v3, v3, 0x3

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    and-int/lit8 p0, v3, 0x1

    shl-int/lit8 p0, p0, 0xb

    shr-int/lit8 p1, v3, 0x1

    add-int/2addr p0, p1

    :goto_1
    const/4 p1, 0x4

    if-ge v1, p1, :cond_2

    sget-object p1, LY11;->g:[I

    aget p1, p1, v1

    xor-int/2addr p1, p0

    invoke-static {p1}, Ljava/lang/Integer;->bitCount(I)I

    move-result p1

    if-gt p1, v4, :cond_1

    return v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public a(Z)Lav;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    invoke-virtual {p0}, LY11;->k()LY11$a;

    move-result-object v0

    invoke-virtual {p0, v0}, LY11;->f(LY11$a;)[LfN4;

    move-result-object v6

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    aget-object v1, v6, v0

    const/4 v2, 0x2

    aget-object v3, v6, v2

    aput-object v3, v6, v0

    aput-object v1, v6, v2

    :cond_0
    invoke-virtual {p0, v6}, LY11;->e([LfN4;)V

    iget-object v1, p0, LY11;->a:LET;

    iget v0, p0, LY11;->f:I

    rem-int/lit8 v2, v0, 0x4

    aget-object v2, v6, v2

    add-int/lit8 v3, v0, 0x1

    rem-int/lit8 v3, v3, 0x4

    aget-object v3, v6, v3

    add-int/lit8 v4, v0, 0x2

    rem-int/lit8 v4, v4, 0x4

    aget-object v4, v6, v4

    add-int/lit8 v0, v0, 0x3

    rem-int/lit8 v0, v0, 0x4

    aget-object v5, v6, v0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, LY11;->q(LET;LfN4;LfN4;LfN4;LfN4;)LET;

    move-result-object v8

    invoke-virtual {p0, v6}, LY11;->l([LfN4;)[LfN4;

    move-result-object v9

    new-instance v0, Lav;

    iget-boolean v10, p0, LY11;->b:Z

    iget v11, p0, LY11;->d:I

    iget v12, p0, LY11;->c:I

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lav;-><init>(LET;[LfN4;ZII)V

    return-object v0
.end method

.method public final e([LfN4;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    const/4 v0, 0x0

    aget-object v1, p1, v0

    invoke-virtual {p0, v1}, LY11;->o(LfN4;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    aget-object v2, p1, v1

    invoke-virtual {p0, v2}, LY11;->o(LfN4;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x2

    aget-object v3, p1, v2

    invoke-virtual {p0, v3}, LY11;->o(LfN4;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, 0x3

    aget-object v4, p1, v3

    invoke-virtual {p0, v4}, LY11;->o(LfN4;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget v4, p0, LY11;->e:I

    mul-int/2addr v4, v2

    const/4 v5, 0x4

    new-array v6, v5, [I

    aget-object v7, p1, v0

    aget-object v8, p1, v1

    invoke-virtual {p0, v7, v8, v4}, LY11;->r(LfN4;LfN4;I)I

    move-result v7

    aput v7, v6, v0

    aget-object v7, p1, v1

    aget-object v8, p1, v2

    invoke-virtual {p0, v7, v8, v4}, LY11;->r(LfN4;LfN4;I)I

    move-result v7

    aput v7, v6, v1

    aget-object v7, p1, v2

    aget-object v8, p1, v3

    invoke-virtual {p0, v7, v8, v4}, LY11;->r(LfN4;LfN4;I)I

    move-result v7

    aput v7, v6, v2

    aget-object v2, p1, v3

    aget-object p1, p1, v0

    invoke-virtual {p0, v2, p1, v4}, LY11;->r(LfN4;LfN4;I)I

    move-result p1

    aput p1, v6, v3

    invoke-static {v6, v4}, LY11;->m([II)I

    move-result p1

    iput p1, p0, LY11;->f:I

    const-wide/16 v2, 0x0

    :goto_0
    if-ge v0, v5, :cond_1

    iget p1, p0, LY11;->f:I

    add-int/2addr p1, v0

    rem-int/2addr p1, v5

    aget p1, v6, p1

    iget-boolean v4, p0, LY11;->b:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x7

    shl-long/2addr v2, v4

    shr-int/lit8 p1, p1, 0x1

    and-int/lit8 p1, p1, 0x7f

    int-to-long v7, p1

    goto :goto_1

    :cond_0
    const/16 v4, 0xa

    shl-long/2addr v2, v4

    shr-int/lit8 v4, p1, 0x2

    and-int/lit16 v4, v4, 0x3e0

    shr-int/lit8 p1, p1, 0x1

    and-int/lit8 p1, p1, 0x1f

    add-int/2addr v4, p1

    int-to-long v7, v4

    :goto_1
    add-long/2addr v2, v7

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, LY11;->b:Z

    invoke-static {v2, v3, p1}, LY11;->h(JZ)I

    move-result p1

    iget-boolean v0, p0, LY11;->b:Z

    if-eqz v0, :cond_2

    shr-int/lit8 v0, p1, 0x6

    add-int/2addr v0, v1

    iput v0, p0, LY11;->c:I

    and-int/lit8 p1, p1, 0x3f

    add-int/2addr p1, v1

    iput p1, p0, LY11;->d:I

    return-void

    :cond_2
    shr-int/lit8 v0, p1, 0xb

    add-int/2addr v0, v1

    iput v0, p0, LY11;->c:I

    and-int/lit16 p1, p1, 0x7ff

    add-int/2addr p1, v1

    iput p1, p0, LY11;->d:I

    return-void

    :cond_3
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p1

    throw p1
.end method

.method public final f(LY11$a;)[LfN4;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    const/4 v0, 0x1

    iput v0, p0, LY11;->e:I

    move-object v1, p1

    move-object v2, v1

    move-object v3, v2

    move v4, v0

    :goto_0
    iget v5, p0, LY11;->e:I

    const/16 v6, 0x9

    const/4 v7, 0x2

    if-ge v5, v6, :cond_1

    const/4 v5, -0x1

    invoke-virtual {p0, p1, v4, v0, v5}, LY11;->j(LY11$a;ZII)LY11$a;

    move-result-object v6

    invoke-virtual {p0, v1, v4, v0, v0}, LY11;->j(LY11$a;ZII)LY11$a;

    move-result-object v8

    invoke-virtual {p0, v2, v4, v5, v0}, LY11;->j(LY11$a;ZII)LY11$a;

    move-result-object v9

    invoke-virtual {p0, v3, v4, v5, v5}, LY11;->j(LY11$a;ZII)LY11$a;

    move-result-object v5

    iget v10, p0, LY11;->e:I

    if-le v10, v7, :cond_0

    invoke-static {v5, v6}, LY11;->b(LY11$a;LY11$a;)F

    move-result v10

    iget v11, p0, LY11;->e:I

    int-to-float v11, v11

    mul-float/2addr v10, v11

    invoke-static {v3, p1}, LY11;->b(LY11$a;LY11$a;)F

    move-result v11

    iget v12, p0, LY11;->e:I

    add-int/2addr v12, v7

    int-to-float v12, v12

    mul-float/2addr v11, v12

    div-float/2addr v10, v11

    float-to-double v10, v10

    const-wide/high16 v12, 0x3fe8000000000000L    # 0.75

    cmpg-double v12, v10, v12

    if-ltz v12, :cond_1

    const-wide/high16 v12, 0x3ff4000000000000L    # 1.25

    cmpl-double v10, v10, v12

    if-gtz v10, :cond_1

    invoke-virtual {p0, v6, v8, v9, v5}, LY11;->p(LY11$a;LY11$a;LY11$a;LY11$a;)Z

    move-result v10

    if-eqz v10, :cond_1

    :cond_0
    xor-int/lit8 v4, v4, 0x1

    iget p1, p0, LY11;->e:I

    add-int/2addr p1, v0

    iput p1, p0, LY11;->e:I

    move-object v3, v5

    move-object p1, v6

    move-object v1, v8

    move-object v2, v9

    goto :goto_0

    :cond_1
    iget v4, p0, LY11;->e:I

    const/4 v5, 0x5

    if-eq v4, v5, :cond_3

    const/4 v6, 0x7

    if-ne v4, v6, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p1

    throw p1

    :cond_3
    :goto_1
    const/4 v6, 0x0

    if-ne v4, v5, :cond_4

    move v4, v0

    goto :goto_2

    :cond_4
    move v4, v6

    :goto_2
    iput-boolean v4, p0, LY11;->b:Z

    new-instance v4, LfN4;

    invoke-virtual {p1}, LY11$a;->a()I

    move-result v5

    int-to-float v5, v5

    const/high16 v8, 0x3f000000    # 0.5f

    add-float/2addr v5, v8

    invoke-virtual {p1}, LY11$a;->b()I

    move-result p1

    int-to-float p1, p1

    sub-float/2addr p1, v8

    invoke-direct {v4, v5, p1}, LfN4;-><init>(FF)V

    new-instance p1, LfN4;

    invoke-virtual {v1}, LY11$a;->a()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v5, v8

    invoke-virtual {v1}, LY11$a;->b()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v1, v8

    invoke-direct {p1, v5, v1}, LfN4;-><init>(FF)V

    new-instance v1, LfN4;

    invoke-virtual {v2}, LY11$a;->a()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v5, v8

    invoke-virtual {v2}, LY11$a;->b()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v2, v8

    invoke-direct {v1, v5, v2}, LfN4;-><init>(FF)V

    new-instance v2, LfN4;

    invoke-virtual {v3}, LY11$a;->a()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v5, v8

    invoke-virtual {v3}, LY11$a;->b()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v3, v8

    invoke-direct {v2, v5, v3}, LfN4;-><init>(FF)V

    const/4 v3, 0x4

    new-array v3, v3, [LfN4;

    aput-object v4, v3, v6

    aput-object p1, v3, v0

    aput-object v1, v3, v7

    const/4 p1, 0x3

    aput-object v2, v3, p1

    iget v0, p0, LY11;->e:I

    mul-int/lit8 v1, v0, 0x2

    sub-int/2addr v1, p1

    mul-int/2addr v0, v7

    invoke-static {v3, v1, v0}, LY11;->d([LfN4;II)[LfN4;

    move-result-object p1

    return-object p1
.end method

.method public final g(LY11$a;LY11$a;)I
    .locals 11

    invoke-static {p1, p2}, LY11;->b(LY11$a;LY11$a;)F

    move-result v0

    invoke-virtual {p2}, LY11$a;->a()I

    move-result v1

    invoke-virtual {p1}, LY11$a;->a()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v1, v0

    invoke-virtual {p2}, LY11$a;->b()I

    move-result p2

    invoke-virtual {p1}, LY11$a;->b()I

    move-result v2

    sub-int/2addr p2, v2

    int-to-float p2, p2

    div-float/2addr p2, v0

    invoke-virtual {p1}, LY11$a;->a()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, LY11$a;->b()I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, LY11;->a:LET;

    invoke-virtual {p1}, LY11$a;->a()I

    move-result v5

    invoke-virtual {p1}, LY11$a;->b()I

    move-result p1

    invoke-virtual {v4, v5, p1}, LET;->h(II)Z

    move-result p1

    float-to-double v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    const/4 v5, 0x0

    move v6, v5

    move v7, v6

    :goto_0
    if-ge v6, v4, :cond_1

    add-float/2addr v2, v1

    add-float/2addr v3, p2

    iget-object v8, p0, LY11;->a:LET;

    invoke-static {v2}, LdN2;->c(F)I

    move-result v9

    invoke-static {v3}, LdN2;->c(F)I

    move-result v10

    invoke-virtual {v8, v9, v10}, LET;->h(II)Z

    move-result v8

    if-eq v8, p1, :cond_0

    add-int/lit8 v7, v7, 0x1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    int-to-float p2, v7

    div-float/2addr p2, v0

    const v0, 0x3dcccccd    # 0.1f

    cmpl-float v1, p2, v0

    if-lez v1, :cond_2

    const v1, 0x3f666666    # 0.9f

    cmpg-float v1, p2, v1

    if-gez v1, :cond_2

    return v5

    :cond_2
    cmpg-float p2, p2, v0

    const/4 v0, 0x1

    if-gtz p2, :cond_3

    move v5, v0

    :cond_3
    if-ne v5, p1, :cond_4

    return v0

    :cond_4
    const/4 p1, -0x1

    return p1
.end method

.method public final i()I
    .locals 3

    iget-boolean v0, p0, LY11;->b:Z

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    iget v0, p0, LY11;->c:I

    mul-int/2addr v0, v1

    add-int/lit8 v0, v0, 0xb

    return v0

    :cond_0
    iget v0, p0, LY11;->c:I

    if-gt v0, v1, :cond_1

    mul-int/2addr v0, v1

    add-int/lit8 v0, v0, 0xf

    return v0

    :cond_1
    mul-int/lit8 v2, v0, 0x4

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v2, v0

    add-int/lit8 v2, v2, 0xf

    return v2
.end method

.method public final j(LY11$a;ZII)LY11$a;
    .locals 2

    invoke-virtual {p1}, LY11$a;->a()I

    move-result v0

    add-int/2addr v0, p3

    invoke-virtual {p1}, LY11$a;->b()I

    move-result p1

    :goto_0
    add-int/2addr p1, p4

    invoke-virtual {p0, v0, p1}, LY11;->n(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LY11;->a:LET;

    invoke-virtual {v1, v0, p1}, LET;->h(II)Z

    move-result v1

    if-ne v1, p2, :cond_0

    add-int/2addr v0, p3

    goto :goto_0

    :cond_0
    sub-int/2addr v0, p3

    sub-int/2addr p1, p4

    :goto_1
    invoke-virtual {p0, v0, p1}, LY11;->n(II)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LY11;->a:LET;

    invoke-virtual {v1, v0, p1}, LET;->h(II)Z

    move-result v1

    if-ne v1, p2, :cond_1

    add-int/2addr v0, p3

    goto :goto_1

    :cond_1
    sub-int/2addr v0, p3

    :goto_2
    invoke-virtual {p0, v0, p1}, LY11;->n(II)Z

    move-result p3

    if-eqz p3, :cond_2

    iget-object p3, p0, LY11;->a:LET;

    invoke-virtual {p3, v0, p1}, LET;->h(II)Z

    move-result p3

    if-ne p3, p2, :cond_2

    add-int/2addr p1, p4

    goto :goto_2

    :cond_2
    sub-int/2addr p1, p4

    new-instance p2, LY11$a;

    invoke-direct {p2, v0, p1}, LY11$a;-><init>(II)V

    return-object p2
.end method

.method public final k()LY11$a;
    .locals 12

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    :try_start_0
    new-instance v5, LOA6;

    iget-object v6, p0, LY11;->a:LET;

    invoke-direct {v5, v6}, LOA6;-><init>(LET;)V

    invoke-virtual {v5}, LOA6;->c()[LfN4;

    move-result-object v5

    aget-object v6, v5, v4

    aget-object v7, v5, v3

    aget-object v8, v5, v1

    aget-object v5, v5, v0
    :try_end_0
    .catch Lcom/google/zxing/NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v5, p0, LY11;->a:LET;

    invoke-virtual {v5}, LET;->o()I

    move-result v5

    div-int/2addr v5, v1

    iget-object v6, p0, LY11;->a:LET;

    invoke-virtual {v6}, LET;->l()I

    move-result v6

    div-int/2addr v6, v1

    new-instance v7, LY11$a;

    add-int/lit8 v8, v5, 0x7

    add-int/lit8 v9, v6, -0x7

    invoke-direct {v7, v8, v9}, LY11$a;-><init>(II)V

    invoke-virtual {p0, v7, v4, v3, v2}, LY11;->j(LY11$a;ZII)LY11$a;

    move-result-object v7

    invoke-virtual {v7}, LY11$a;->c()LfN4;

    move-result-object v7

    new-instance v10, LY11$a;

    add-int/lit8 v6, v6, 0x7

    invoke-direct {v10, v8, v6}, LY11$a;-><init>(II)V

    invoke-virtual {p0, v10, v4, v3, v3}, LY11;->j(LY11$a;ZII)LY11$a;

    move-result-object v8

    invoke-virtual {v8}, LY11$a;->c()LfN4;

    move-result-object v8

    new-instance v10, LY11$a;

    add-int/lit8 v5, v5, -0x7

    invoke-direct {v10, v5, v6}, LY11$a;-><init>(II)V

    invoke-virtual {p0, v10, v4, v2, v3}, LY11;->j(LY11$a;ZII)LY11$a;

    move-result-object v6

    invoke-virtual {v6}, LY11$a;->c()LfN4;

    move-result-object v6

    new-instance v10, LY11$a;

    invoke-direct {v10, v5, v9}, LY11$a;-><init>(II)V

    invoke-virtual {p0, v10, v4, v2, v2}, LY11;->j(LY11$a;ZII)LY11$a;

    move-result-object v5

    invoke-virtual {v5}, LY11$a;->c()LfN4;

    move-result-object v5

    move-object v11, v8

    move-object v8, v6

    move-object v6, v7

    move-object v7, v11

    :goto_0
    invoke-virtual {v6}, LfN4;->c()F

    move-result v9

    invoke-virtual {v5}, LfN4;->c()F

    move-result v10

    add-float/2addr v9, v10

    invoke-virtual {v7}, LfN4;->c()F

    move-result v10

    add-float/2addr v9, v10

    invoke-virtual {v8}, LfN4;->c()F

    move-result v10

    add-float/2addr v9, v10

    const/high16 v10, 0x40800000    # 4.0f

    div-float/2addr v9, v10

    invoke-static {v9}, LdN2;->c(F)I

    move-result v9

    invoke-virtual {v6}, LfN4;->d()F

    move-result v6

    invoke-virtual {v5}, LfN4;->d()F

    move-result v5

    add-float/2addr v6, v5

    invoke-virtual {v7}, LfN4;->d()F

    move-result v5

    add-float/2addr v6, v5

    invoke-virtual {v8}, LfN4;->d()F

    move-result v5

    add-float/2addr v6, v5

    div-float/2addr v6, v10

    invoke-static {v6}, LdN2;->c(F)I

    move-result v5

    :try_start_1
    new-instance v6, LOA6;

    iget-object v7, p0, LY11;->a:LET;

    const/16 v8, 0xf

    invoke-direct {v6, v7, v8, v9, v5}, LOA6;-><init>(LET;III)V

    invoke-virtual {v6}, LOA6;->c()[LfN4;

    move-result-object v6

    aget-object v7, v6, v4

    aget-object v8, v6, v3

    aget-object v1, v6, v1

    aget-object v0, v6, v0
    :try_end_1
    .catch Lcom/google/zxing/NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    new-instance v0, LY11$a;

    add-int/lit8 v1, v9, 0x7

    add-int/lit8 v6, v5, -0x7

    invoke-direct {v0, v1, v6}, LY11$a;-><init>(II)V

    invoke-virtual {p0, v0, v4, v3, v2}, LY11;->j(LY11$a;ZII)LY11$a;

    move-result-object v0

    invoke-virtual {v0}, LY11$a;->c()LfN4;

    move-result-object v7

    new-instance v0, LY11$a;

    add-int/lit8 v5, v5, 0x7

    invoke-direct {v0, v1, v5}, LY11$a;-><init>(II)V

    invoke-virtual {p0, v0, v4, v3, v3}, LY11;->j(LY11$a;ZII)LY11$a;

    move-result-object v0

    invoke-virtual {v0}, LY11$a;->c()LfN4;

    move-result-object v8

    new-instance v0, LY11$a;

    add-int/lit8 v9, v9, -0x7

    invoke-direct {v0, v9, v5}, LY11$a;-><init>(II)V

    invoke-virtual {p0, v0, v4, v2, v3}, LY11;->j(LY11$a;ZII)LY11$a;

    move-result-object v0

    invoke-virtual {v0}, LY11$a;->c()LfN4;

    move-result-object v1

    new-instance v0, LY11$a;

    invoke-direct {v0, v9, v6}, LY11$a;-><init>(II)V

    invoke-virtual {p0, v0, v4, v2, v2}, LY11;->j(LY11$a;ZII)LY11$a;

    move-result-object v0

    invoke-virtual {v0}, LY11$a;->c()LfN4;

    move-result-object v0

    :goto_1
    invoke-virtual {v7}, LfN4;->c()F

    move-result v2

    invoke-virtual {v0}, LfN4;->c()F

    move-result v3

    add-float/2addr v2, v3

    invoke-virtual {v8}, LfN4;->c()F

    move-result v3

    add-float/2addr v2, v3

    invoke-virtual {v1}, LfN4;->c()F

    move-result v3

    add-float/2addr v2, v3

    div-float/2addr v2, v10

    invoke-static {v2}, LdN2;->c(F)I

    move-result v2

    invoke-virtual {v7}, LfN4;->d()F

    move-result v3

    invoke-virtual {v0}, LfN4;->d()F

    move-result v0

    add-float/2addr v3, v0

    invoke-virtual {v8}, LfN4;->d()F

    move-result v0

    add-float/2addr v3, v0

    invoke-virtual {v1}, LfN4;->d()F

    move-result v0

    add-float/2addr v3, v0

    div-float/2addr v3, v10

    invoke-static {v3}, LdN2;->c(F)I

    move-result v0

    new-instance v1, LY11$a;

    invoke-direct {v1, v2, v0}, LY11$a;-><init>(II)V

    return-object v1
.end method

.method public final l([LfN4;)[LfN4;
    .locals 2

    iget v0, p0, LY11;->e:I

    mul-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, LY11;->i()I

    move-result v1

    invoke-static {p1, v0, v1}, LY11;->d([LfN4;II)[LfN4;

    move-result-object p1

    return-object p1
.end method

.method public final n(II)Z
    .locals 1

    if-ltz p1, :cond_0

    iget-object v0, p0, LY11;->a:LET;

    invoke-virtual {v0}, LET;->o()I

    move-result v0

    if-ge p1, v0, :cond_0

    if-lez p2, :cond_0

    iget-object p1, p0, LY11;->a:LET;

    invoke-virtual {p1}, LET;->l()I

    move-result p1

    if-ge p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final o(LfN4;)Z
    .locals 1

    invoke-virtual {p1}, LfN4;->c()F

    move-result v0

    invoke-static {v0}, LdN2;->c(F)I

    move-result v0

    invoke-virtual {p1}, LfN4;->d()F

    move-result p1

    invoke-static {p1}, LdN2;->c(F)I

    move-result p1

    invoke-virtual {p0, v0, p1}, LY11;->n(II)Z

    move-result p1

    return p1
.end method

.method public final p(LY11$a;LY11$a;LY11$a;LY11$a;)Z
    .locals 2

    new-instance v0, LY11$a;

    invoke-virtual {p1}, LY11$a;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x3

    invoke-virtual {p1}, LY11$a;->b()I

    move-result p1

    add-int/lit8 p1, p1, 0x3

    invoke-direct {v0, v1, p1}, LY11$a;-><init>(II)V

    new-instance p1, LY11$a;

    invoke-virtual {p2}, LY11$a;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x3

    invoke-virtual {p2}, LY11$a;->b()I

    move-result p2

    add-int/lit8 p2, p2, -0x3

    invoke-direct {p1, v1, p2}, LY11$a;-><init>(II)V

    new-instance p2, LY11$a;

    invoke-virtual {p3}, LY11$a;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x3

    invoke-virtual {p3}, LY11$a;->b()I

    move-result p3

    add-int/lit8 p3, p3, -0x3

    invoke-direct {p2, v1, p3}, LY11$a;-><init>(II)V

    new-instance p3, LY11$a;

    invoke-virtual {p4}, LY11$a;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x3

    invoke-virtual {p4}, LY11$a;->b()I

    move-result p4

    add-int/lit8 p4, p4, 0x3

    invoke-direct {p3, v1, p4}, LY11$a;-><init>(II)V

    invoke-virtual {p0, p3, v0}, LY11;->g(LY11$a;LY11$a;)I

    move-result p4

    const/4 v1, 0x0

    if-nez p4, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, v0, p1}, LY11;->g(LY11$a;LY11$a;)I

    move-result v0

    if-eq v0, p4, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0, p1, p2}, LY11;->g(LY11$a;LY11$a;)I

    move-result p1

    if-eq p1, p4, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0, p2, p3}, LY11;->g(LY11$a;LY11$a;)I

    move-result p1

    if-ne p1, p4, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method

.method public final q(LET;LfN4;LfN4;LfN4;LfN4;)LET;
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    move-object/from16 v1, p1

    invoke-static {}, LeE1;->b()LeE1;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, LY11;->i()I

    move-result v4

    move v3, v4

    move v2, v4

    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v6, v4, v5

    move-object/from16 v15, p0

    iget v8, v15, LY11;->e:I

    int-to-float v4, v8

    sub-float v5, v6, v4

    move v7, v5

    move v4, v5

    move v10, v5

    int-to-float v8, v8

    add-float/2addr v6, v8

    move v8, v6

    move v9, v6

    move v11, v6

    invoke-virtual/range {p2 .. p2}, LfN4;->c()F

    move-result v12

    invoke-virtual/range {p2 .. p2}, LfN4;->d()F

    move-result v13

    invoke-virtual/range {p3 .. p3}, LfN4;->c()F

    move-result v14

    invoke-virtual/range {p3 .. p3}, LfN4;->d()F

    move-result v16

    move/from16 v15, v16

    invoke-virtual/range {p4 .. p4}, LfN4;->c()F

    move-result v16

    invoke-virtual/range {p4 .. p4}, LfN4;->d()F

    move-result v17

    invoke-virtual/range {p5 .. p5}, LfN4;->c()F

    move-result v18

    invoke-virtual/range {p5 .. p5}, LfN4;->d()F

    move-result v19

    invoke-virtual/range {v0 .. v19}, LeE1;->c(LET;IIFFFFFFFFFFFFFFFF)LET;

    move-result-object v0

    return-object v0
.end method

.method public final r(LfN4;LfN4;I)I
    .locals 7

    invoke-static {p1, p2}, LY11;->c(LfN4;LfN4;)F

    move-result v0

    int-to-float v1, p3

    div-float v1, v0, v1

    invoke-virtual {p1}, LfN4;->c()F

    move-result v2

    invoke-virtual {p1}, LfN4;->d()F

    move-result v3

    invoke-virtual {p2}, LfN4;->c()F

    move-result v4

    invoke-virtual {p1}, LfN4;->c()F

    move-result v5

    sub-float/2addr v4, v5

    mul-float/2addr v4, v1

    div-float/2addr v4, v0

    invoke-virtual {p2}, LfN4;->d()F

    move-result p2

    invoke-virtual {p1}, LfN4;->d()F

    move-result p1

    sub-float/2addr p2, p1

    mul-float/2addr v1, p2

    div-float/2addr v1, v0

    const/4 p1, 0x0

    move p2, p1

    :goto_0
    if-ge p1, p3, :cond_1

    iget-object v0, p0, LY11;->a:LET;

    int-to-float v5, p1

    mul-float v6, v5, v4

    add-float/2addr v6, v2

    invoke-static {v6}, LdN2;->c(F)I

    move-result v6

    mul-float/2addr v5, v1

    add-float/2addr v5, v3

    invoke-static {v5}, LdN2;->c(F)I

    move-result v5

    invoke-virtual {v0, v6, v5}, LET;->h(II)Z

    move-result v0

    if-eqz v0, :cond_0

    sub-int v0, p3, p1

    const/4 v5, 0x1

    sub-int/2addr v0, v5

    shl-int v0, v5, v0

    or-int/2addr p2, v0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return p2
.end method
