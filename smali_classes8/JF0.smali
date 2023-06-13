.class public final LJF0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final d:LJF0;

.field public static final e:LJF0;

.field public static final f:LJF0;

.field public static final g:LJF0;

.field public static final h:LJF0;

.field public static final i:LJF0;

.field public static final j:LJF0;


# instance fields
.field public b:D

.field public c:D


# direct methods
.method public static strictfp constructor <clinit>()V
    .locals 5

    new-instance v0, LJF0;

    const-wide v1, 0x400921fb54442d18L    # Math.PI

    const-wide v3, 0x3ca1a62633145c07L    # 1.2246467991473532E-16

    invoke-direct {v0, v1, v2, v3, v4}, LJF0;-><init>(DD)V

    sput-object v0, LJF0;->d:LJF0;

    new-instance v0, LJF0;

    const-wide v1, 0x401921fb54442d18L    # 6.283185307179586

    const-wide v3, 0x3cb1a62633145c07L    # 2.4492935982947064E-16

    invoke-direct {v0, v1, v2, v3, v4}, LJF0;-><init>(DD)V

    sput-object v0, LJF0;->e:LJF0;

    new-instance v0, LJF0;

    const-wide v1, 0x3ff921fb54442d18L    # 1.5707963267948966

    const-wide v3, 0x3c91a62633145c07L    # 6.123233995736766E-17

    invoke-direct {v0, v1, v2, v3, v4}, LJF0;-><init>(DD)V

    sput-object v0, LJF0;->f:LJF0;

    new-instance v0, LJF0;

    const-wide v1, 0x4005bf0a8b145769L    # Math.E

    const-wide v3, 0x3ca4d57ee2b1013aL

    invoke-direct {v0, v1, v2, v3, v4}, LJF0;-><init>(DD)V

    sput-object v0, LJF0;->g:LJF0;

    new-instance v0, LJF0;

    const-wide/high16 v1, 0x7ff8000000000000L    # Double.NaN

    invoke-direct {v0, v1, v2, v1, v2}, LJF0;-><init>(DD)V

    sput-object v0, LJF0;->h:LJF0;

    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    invoke-static {v0, v1}, LJF0;->l0(D)LJF0;

    move-result-object v0

    sput-object v0, LJF0;->i:LJF0;

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1}, LJF0;->l0(D)LJF0;

    move-result-object v0

    sput-object v0, LJF0;->j:LJF0;

    return-void
.end method

.method public strictfp constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LJF0;->b:D

    iput-wide v0, p0, LJF0;->c:D

    invoke-virtual {p0, v0, v1}, LJF0;->m(D)V

    return-void
.end method

.method public strictfp constructor <init>(D)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LJF0;->b:D

    iput-wide v0, p0, LJF0;->c:D

    invoke-virtual {p0, p1, p2}, LJF0;->m(D)V

    return-void
.end method

.method public strictfp constructor <init>(DD)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LJF0;->b:D

    iput-wide v0, p0, LJF0;->c:D

    invoke-virtual {p0, p1, p2, p3, p4}, LJF0;->n(DD)V

    return-void
.end method

.method public strictfp constructor <init>(LJF0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LJF0;->b:D

    iput-wide v0, p0, LJF0;->c:D

    invoke-virtual {p0, p1}, LJF0;->o(LJF0;)V

    return-void
.end method

.method public static strictfp f(LJF0;)LJF0;
    .locals 1

    new-instance v0, LJF0;

    invoke-direct {v0, p0}, LJF0;-><init>(LJF0;)V

    return-object v0
.end method

.method public static strictfp f0(CI)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static strictfp g()LJF0;
    .locals 3

    new-instance v0, LJF0;

    const-wide/high16 v1, 0x7ff8000000000000L    # Double.NaN

    invoke-direct {v0, v1, v2, v1, v2}, LJF0;-><init>(DD)V

    return-object v0
.end method

.method public static strictfp l0(D)LJF0;
    .locals 1

    new-instance v0, LJF0;

    invoke-direct {v0, p0, p1}, LJF0;-><init>(D)V

    return-object v0
.end method

.method public static strictfp w(D)I
    .locals 6

    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v4

    div-double/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    int-to-double v4, v0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    mul-double/2addr v4, v2

    cmpg-double p0, v4, p0

    if-gtz p0, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    return v0
.end method


# virtual methods
.method public final strictfp H(LJF0;)LJF0;
    .locals 1

    invoke-virtual {p1}, LJF0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LJF0;->g()LJF0;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p0}, LJF0;->f(LJF0;)LJF0;

    move-result-object v0

    invoke-virtual {v0, p1}, LJF0;->Z(LJF0;)LJF0;

    move-result-object p1

    return-object p1
.end method

.method public final strictfp J()LJF0;
    .locals 5

    invoke-virtual {p0}, LJF0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, LJF0;

    iget-wide v1, p0, LJF0;->b:D

    neg-double v1, v1

    iget-wide v3, p0, LJF0;->c:D

    neg-double v3, v3

    invoke-direct {v0, v1, v2, v3, v4}, LJF0;-><init>(DD)V

    return-object v0
.end method

.method public strictfp M(I)LJF0;
    .locals 5

    int-to-double v0, p1

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    if-nez v0, :cond_0

    invoke-static {v1, v2}, LJF0;->l0(D)LJF0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, LJF0;

    invoke-direct {v0, p0}, LJF0;-><init>(LJF0;)V

    invoke-static {v1, v2}, LJF0;->l0(D)LJF0;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_4

    :cond_1
    :goto_0
    if-lez v2, :cond_3

    rem-int/lit8 v4, v2, 0x2

    if-ne v4, v3, :cond_2

    invoke-virtual {v1, v0}, LJF0;->Z(LJF0;)LJF0;

    :cond_2
    div-int/lit8 v2, v2, 0x2

    if-lez v2, :cond_1

    invoke-virtual {v0}, LJF0;->e0()LJF0;

    move-result-object v0

    goto :goto_0

    :cond_3
    move-object v0, v1

    :cond_4
    if-gez p1, :cond_5

    invoke-virtual {v0}, LJF0;->N()LJF0;

    move-result-object p1

    return-object p1

    :cond_5
    return-object v0
.end method

.method public final strictfp N()LJF0;
    .locals 19

    move-object/from16 v0, p0

    iget-wide v1, v0, LJF0;->b:D

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    div-double v5, v3, v1

    const-wide v7, 0x41a0000002000000L    # 1.34217729E8

    mul-double v9, v5, v7

    sub-double v11, v9, v5

    mul-double/2addr v7, v1

    sub-double/2addr v9, v11

    sub-double v11, v5, v9

    sub-double v13, v7, v1

    mul-double v15, v5, v1

    sub-double/2addr v7, v13

    sub-double v13, v1, v7

    mul-double v17, v9, v7

    sub-double v17, v17, v15

    mul-double/2addr v9, v13

    add-double v17, v17, v9

    mul-double/2addr v7, v11

    add-double v17, v17, v7

    mul-double/2addr v11, v13

    add-double v17, v17, v11

    sub-double/2addr v3, v15

    sub-double v3, v3, v17

    iget-wide v7, v0, LJF0;->c:D

    mul-double/2addr v7, v5

    sub-double/2addr v3, v7

    div-double/2addr v3, v1

    add-double v1, v5, v3

    sub-double/2addr v5, v1

    add-double/2addr v5, v3

    new-instance v3, LJF0;

    invoke-direct {v3, v1, v2, v5, v6}, LJF0;-><init>(DD)V

    return-object v3
.end method

.method public final strictfp P(D)LJF0;
    .locals 8

    iget-wide v0, p0, LJF0;->b:D

    add-double v2, v0, p1

    sub-double v4, v2, v0

    sub-double v6, v2, v4

    sub-double/2addr p1, v4

    sub-double/2addr v0, v6

    add-double/2addr p1, v0

    iget-wide v0, p0, LJF0;->c:D

    add-double/2addr p1, v0

    add-double v0, v2, p1

    sub-double/2addr v2, v0

    add-double/2addr p1, v2

    add-double v2, v0, p1

    iput-wide v2, p0, LJF0;->b:D

    sub-double/2addr v0, v2

    add-double/2addr p1, v0

    iput-wide p1, p0, LJF0;->c:D

    return-object p0
.end method

.method public final strictfp U(DD)LJF0;
    .locals 17

    move-object/from16 v0, p0

    iget-wide v1, v0, LJF0;->b:D

    add-double v3, v1, p1

    iget-wide v5, v0, LJF0;->c:D

    add-double v7, v5, p3

    sub-double v9, v3, v1

    sub-double v11, v7, v5

    sub-double v13, v3, v9

    sub-double v15, v7, v11

    sub-double v9, p1, v9

    sub-double/2addr v1, v13

    add-double/2addr v9, v1

    sub-double v1, p3, v11

    sub-double/2addr v5, v15

    add-double/2addr v1, v5

    add-double/2addr v9, v7

    add-double v5, v3, v9

    sub-double/2addr v3, v5

    add-double/2addr v9, v3

    add-double/2addr v1, v9

    add-double v3, v5, v1

    sub-double/2addr v5, v3

    add-double/2addr v1, v5

    iput-wide v3, v0, LJF0;->b:D

    iput-wide v1, v0, LJF0;->c:D

    return-object v0
.end method

.method public final strictfp W(LJF0;)LJF0;
    .locals 4

    iget-wide v0, p1, LJF0;->b:D

    iget-wide v2, p1, LJF0;->c:D

    invoke-virtual {p0, v0, v1, v2, v3}, LJF0;->U(DD)LJF0;

    move-result-object p1

    return-object p1
.end method

.method public final strictfp Y(DD)LJF0;
    .locals 15

    move-object v0, p0

    iget-wide v1, v0, LJF0;->b:D

    const-wide v3, 0x41a0000002000000L    # 1.34217729E8

    mul-double v5, v1, v3

    sub-double v7, v5, v1

    mul-double v3, v3, p1

    sub-double/2addr v5, v7

    sub-double v7, v1, v5

    sub-double v9, v3, p1

    mul-double v11, v1, p1

    sub-double/2addr v3, v9

    sub-double v9, p1, v3

    mul-double v13, v5, v3

    sub-double/2addr v13, v11

    mul-double/2addr v5, v9

    add-double/2addr v13, v5

    mul-double/2addr v3, v7

    add-double/2addr v13, v3

    mul-double/2addr v7, v9

    add-double/2addr v13, v7

    mul-double v1, v1, p3

    iget-wide v3, v0, LJF0;->c:D

    mul-double v3, v3, p1

    add-double/2addr v1, v3

    add-double/2addr v13, v1

    add-double v1, v11, v13

    sub-double/2addr v11, v1

    add-double/2addr v13, v11

    iput-wide v1, v0, LJF0;->b:D

    iput-wide v13, v0, LJF0;->c:D

    return-object v0
.end method

.method public final strictfp Z(LJF0;)LJF0;
    .locals 4

    iget-wide v0, p1, LJF0;->b:D

    iget-wide v2, p1, LJF0;->c:D

    invoke-virtual {p0, v0, v1, v2, v3}, LJF0;->Y(DD)LJF0;

    move-result-object p1

    return-object p1
.end method

.method public final strictfp c0(LJF0;)LJF0;
    .locals 4

    invoke-virtual {p0}, LJF0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-wide v0, p1, LJF0;->b:D

    neg-double v0, v0

    iget-wide v2, p1, LJF0;->c:D

    neg-double v2, v2

    invoke-virtual {p0, v0, v1, v2, v3}, LJF0;->U(DD)LJF0;

    move-result-object p1

    return-object p1
.end method

.method public strictfp clone()Ljava/lang/Object;
    .locals 1

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public strictfp compareTo(Ljava/lang/Object;)I
    .locals 8

    check-cast p1, LJF0;

    iget-wide v0, p0, LJF0;->b:D

    iget-wide v2, p1, LJF0;->b:D

    cmpg-double v4, v0, v2

    const/4 v5, -0x1

    if-gez v4, :cond_0

    return v5

    :cond_0
    cmpl-double v0, v0, v2

    const/4 v1, 0x1

    if-lez v0, :cond_1

    return v1

    :cond_1
    iget-wide v2, p0, LJF0;->c:D

    iget-wide v6, p1, LJF0;->c:D

    cmpg-double p1, v2, v6

    if-gez p1, :cond_2

    return v5

    :cond_2
    cmpl-double p1, v2, v6

    if-lez p1, :cond_3

    return v1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public strictfp d()LJF0;
    .locals 1

    invoke-virtual {p0}, LJF0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LJF0;->h:LJF0;

    return-object v0

    :cond_0
    invoke-virtual {p0}, LJF0;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LJF0;->J()LJF0;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, LJF0;

    invoke-direct {v0, p0}, LJF0;-><init>(LJF0;)V

    return-object v0
.end method

.method public strictfp d0()I
    .locals 8

    iget-wide v0, p0, LJF0;->b:D

    const-wide/16 v2, 0x0

    cmpl-double v4, v0, v2

    const/4 v5, 0x1

    if-lez v4, :cond_0

    return v5

    :cond_0
    cmpg-double v0, v0, v2

    const/4 v1, -0x1

    if-gez v0, :cond_1

    return v1

    :cond_1
    iget-wide v6, p0, LJF0;->c:D

    cmpl-double v0, v6, v2

    if-lez v0, :cond_2

    return v5

    :cond_2
    cmpg-double v0, v6, v2

    if-gez v0, :cond_3

    return v1

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public final strictfp e(LJF0;)LJF0;
    .locals 1

    invoke-static {p0}, LJF0;->f(LJF0;)LJF0;

    move-result-object v0

    invoke-virtual {v0, p1}, LJF0;->W(LJF0;)LJF0;

    move-result-object p1

    return-object p1
.end method

.method public strictfp e0()LJF0;
    .locals 1

    invoke-virtual {p0, p0}, LJF0;->H(LJF0;)LJF0;

    move-result-object v0

    return-object v0
.end method

.method public final strictfp g0(LJF0;)LJF0;
    .locals 0

    invoke-virtual {p1}, LJF0;->J()LJF0;

    move-result-object p1

    invoke-virtual {p0, p1}, LJF0;->e(LJF0;)LJF0;

    move-result-object p1

    return-object p1
.end method

.method public final strictfp h(LJF0;)LJF0;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-wide v2, v0, LJF0;->b:D

    iget-wide v4, v1, LJF0;->b:D

    div-double v6, v2, v4

    const-wide v8, 0x41a0000002000000L    # 1.34217729E8

    mul-double v10, v6, v8

    sub-double v12, v10, v6

    mul-double/2addr v8, v4

    sub-double/2addr v10, v12

    sub-double v12, v6, v10

    sub-double v14, v8, v4

    mul-double v16, v6, v4

    sub-double/2addr v8, v14

    sub-double v14, v4, v8

    mul-double v18, v10, v8

    sub-double v18, v18, v16

    mul-double/2addr v10, v14

    add-double v18, v18, v10

    mul-double/2addr v8, v12

    add-double v18, v18, v8

    mul-double/2addr v12, v14

    add-double v18, v18, v12

    sub-double v2, v2, v16

    sub-double v2, v2, v18

    iget-wide v8, v0, LJF0;->c:D

    add-double/2addr v2, v8

    iget-wide v8, v1, LJF0;->c:D

    mul-double/2addr v8, v6

    sub-double/2addr v2, v8

    div-double/2addr v2, v4

    add-double v4, v6, v2

    sub-double/2addr v6, v4

    add-double/2addr v6, v2

    new-instance v1, LJF0;

    invoke-direct {v1, v4, v5, v6, v7}, LJF0;-><init>(DD)V

    return-object v1
.end method

.method public strictfp h0()Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, LJF0;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "0.0E0"

    return-object v0

    :cond_0
    invoke-virtual {p0}, LJF0;->k()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const/4 v0, 0x1

    new-array v1, v0, [I

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1}, LJF0;->j(Z[I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "E"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v1, v1, v2

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x30

    if-eq v4, v5, :cond_4

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-le v4, v0, :cond_2

    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const-string v0, ""

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LJF0;->q()Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Found leading zero: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final strictfp j(Z[I)Ljava/lang/String;
    .locals 10

    invoke-virtual {p0}, LJF0;->d()LJF0;

    move-result-object v0

    iget-wide v1, v0, LJF0;->b:D

    invoke-static {v1, v2}, LJF0;->w(D)I

    move-result v1

    sget-object v2, LJF0;->i:LJF0;

    invoke-virtual {v2, v1}, LJF0;->M(I)LJF0;

    move-result-object v3

    invoke-virtual {v0, v3}, LJF0;->h(LJF0;)LJF0;

    move-result-object v0

    invoke-virtual {v0, v2}, LJF0;->l(LJF0;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v2}, LJF0;->h(LJF0;)LJF0;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    sget-object v3, LJF0;->j:LJF0;

    invoke-virtual {v0, v3}, LJF0;->t(LJF0;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0, v2}, LJF0;->H(LJF0;)LJF0;

    move-result-object v0

    add-int/lit8 v1, v1, -0x1

    :cond_1
    :goto_0
    add-int/lit8 v2, v1, 0x1

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v4, 0x0

    move v5, v4

    :goto_1
    const/16 v6, 0x1f

    if-gt v5, v6, :cond_8

    if-eqz p1, :cond_2

    if-ne v5, v2, :cond_2

    const/16 v6, 0x2e

    invoke-virtual {v3, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :cond_2
    iget-wide v6, v0, LJF0;->b:D

    double-to-int v6, v6

    if-gez v6, :cond_3

    goto :goto_3

    :cond_3
    const/16 v7, 0x9

    const/4 v8, 0x1

    if-le v6, v7, :cond_4

    const/16 v7, 0x39

    move v9, v8

    goto :goto_2

    :cond_4
    add-int/lit8 v7, v6, 0x30

    int-to-char v7, v7

    move v9, v4

    :goto_2
    invoke-virtual {v3, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    int-to-double v6, v6

    invoke-static {v6, v7}, LJF0;->l0(D)LJF0;

    move-result-object v6

    invoke-virtual {v0, v6}, LJF0;->g0(LJF0;)LJF0;

    move-result-object v0

    sget-object v6, LJF0;->i:LJF0;

    invoke-virtual {v0, v6}, LJF0;->H(LJF0;)LJF0;

    move-result-object v0

    if-eqz v9, :cond_5

    invoke-virtual {v0, v6}, LJF0;->W(LJF0;)LJF0;

    :cond_5
    iget-wide v6, v0, LJF0;->b:D

    invoke-static {v6, v7}, LJF0;->w(D)I

    move-result v6

    if-gez v6, :cond_6

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    rsub-int/lit8 v7, v5, 0x1f

    if-lt v6, v7, :cond_6

    move v8, v4

    :cond_6
    if-nez v8, :cond_7

    goto :goto_3

    :cond_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_8
    :goto_3
    aput v1, p2, v4

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final strictfp k()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LJF0;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "0.0"

    return-object v0

    :cond_0
    invoke-virtual {p0}, LJF0;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "NaN "

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public strictfp k0()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, LJF0;->k()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    new-array v1, v0, [I

    invoke-virtual {p0, v0, v1}, LJF0;->j(Z[I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aget v1, v1, v3

    add-int/2addr v1, v0

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v3, 0x2e

    if-ne v0, v3, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/16 v0, 0x30

    if-gez v1, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "0."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    neg-int v1, v1

    invoke-static {v0, v1}, LJF0;->f0(CI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v1, v3

    invoke-static {v0, v1}, LJF0;->f0(CI)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".0"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_3
    :goto_0
    invoke-virtual {p0}, LJF0;->q()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_4
    return-object v2
.end method

.method public strictfp l(LJF0;)Z
    .locals 5

    iget-wide v0, p0, LJF0;->b:D

    iget-wide v2, p1, LJF0;->b:D

    cmpl-double v4, v0, v2

    if-gtz v4, :cond_1

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, LJF0;->c:D

    iget-wide v2, p1, LJF0;->c:D

    cmpl-double p1, v0, v2

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final strictfp m(D)V
    .locals 0

    iput-wide p1, p0, LJF0;->b:D

    const-wide/16 p1, 0x0

    iput-wide p1, p0, LJF0;->c:D

    return-void
.end method

.method public final strictfp n(DD)V
    .locals 0

    iput-wide p1, p0, LJF0;->b:D

    iput-wide p3, p0, LJF0;->c:D

    return-void
.end method

.method public final strictfp o(LJF0;)V
    .locals 2

    iget-wide v0, p1, LJF0;->b:D

    iput-wide v0, p0, LJF0;->b:D

    iget-wide v0, p1, LJF0;->c:D

    iput-wide v0, p0, LJF0;->c:D

    return-void
.end method

.method public strictfp p()Z
    .locals 2

    iget-wide v0, p0, LJF0;->b:D

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    return v0
.end method

.method public strictfp q()Z
    .locals 5

    iget-wide v0, p0, LJF0;->b:D

    const-wide/16 v2, 0x0

    cmpg-double v4, v0, v2

    if-ltz v4, :cond_1

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, LJF0;->c:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public strictfp r()Z
    .locals 4

    iget-wide v0, p0, LJF0;->b:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, LJF0;->c:D

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public strictfp t(LJF0;)Z
    .locals 5

    iget-wide v0, p0, LJF0;->b:D

    iget-wide v2, p1, LJF0;->b:D

    cmpg-double v4, v0, v2

    if-ltz v4, :cond_1

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, LJF0;->c:D

    iget-wide v2, p1, LJF0;->c:D

    cmpg-double p1, v0, v2

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public strictfp toString()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, LJF0;->b:D

    invoke-static {v0, v1}, LJF0;->w(D)I

    move-result v0

    const/4 v1, -0x3

    if-lt v0, v1, :cond_0

    const/16 v1, 0x14

    if-gt v0, v1, :cond_0

    invoke-virtual {p0}, LJF0;->k0()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LJF0;->h0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
