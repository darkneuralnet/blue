.class public LU83;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVq5;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Lsr2;

.field public f:LyB0;

.field public g:[LyB0;

.field public h:Ljava/util/List;

.field public i:I


# direct methods
.method public constructor <init>(Lsr2;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LU83;->a:Z

    iput-boolean v0, p0, LU83;->b:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, LU83;->c:Z

    iput-boolean v0, p0, LU83;->d:Z

    const/4 v1, 0x0

    iput-object v1, p0, LU83;->f:LyB0;

    iput-object v1, p0, LU83;->g:[LyB0;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, LU83;->h:Ljava/util/List;

    iput v0, p0, LU83;->i:I

    iput-object p1, p0, LU83;->e:Lsr2;

    iput-object v1, p0, LU83;->f:LyB0;

    return-void
.end method

.method public static e(Lcr5;I)Z
    .locals 1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p0}, Lcr5;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x2

    if-lt p1, p0, :cond_1

    return v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static f(LyB0;LyB0;LyB0;LyB0;ZZZZ)Z
    .locals 2

    invoke-static {p0, p2, p4, p6}, LU83;->g(LyB0;LyB0;ZZ)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-static {p0, p3, p4, p7}, LU83;->g(LyB0;LyB0;ZZ)Z

    move-result p0

    if-eqz p0, :cond_1

    return v1

    :cond_1
    invoke-static {p1, p2, p5, p6}, LU83;->g(LyB0;LyB0;ZZ)Z

    move-result p0

    if-eqz p0, :cond_2

    return v1

    :cond_2
    invoke-static {p1, p3, p5, p7}, LU83;->g(LyB0;LyB0;ZZ)Z

    move-result p0

    if-eqz p0, :cond_3

    return v1

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static g(LyB0;LyB0;ZZ)Z
    .locals 1

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p1}, LyB0;->g(LyB0;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v0
.end method


# virtual methods
.method public a(Lcr5;ILcr5;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    iget-boolean v5, v0, LU83;->a:Z

    if-nez v5, :cond_0

    invoke-virtual/range {p0 .. p0}, LU83;->d()Z

    move-result v5

    if-eqz v5, :cond_0

    return-void

    :cond_0
    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v1, v3, :cond_1

    move v7, v6

    goto :goto_0

    :cond_1
    move v7, v5

    :goto_0
    if-eqz v7, :cond_2

    if-ne v2, v4, :cond_2

    move v8, v6

    goto :goto_1

    :cond_2
    move v8, v5

    :goto_1
    if-eqz v8, :cond_3

    return-void

    :cond_3
    iget-boolean v8, v0, LU83;->b:Z

    if-eqz v8, :cond_6

    invoke-static/range {p1 .. p2}, LU83;->e(Lcr5;I)Z

    move-result v8

    if-nez v8, :cond_5

    invoke-static/range {p3 .. p4}, LU83;->e(Lcr5;I)Z

    move-result v8

    if-eqz v8, :cond_4

    goto :goto_2

    :cond_4
    move v8, v5

    goto :goto_3

    :cond_5
    :goto_2
    move v8, v6

    :goto_3
    if-nez v8, :cond_6

    return-void

    :cond_6
    invoke-interface/range {p1 .. p2}, Lcr5;->u(I)LyB0;

    move-result-object v8

    add-int/lit8 v9, v2, 0x1

    invoke-interface {v1, v9}, Lcr5;->u(I)LyB0;

    move-result-object v15

    invoke-interface/range {p3 .. p4}, Lcr5;->u(I)LyB0;

    move-result-object v14

    add-int/lit8 v9, v4, 0x1

    invoke-interface {v3, v9}, Lcr5;->u(I)LyB0;

    move-result-object v13

    if-nez v2, :cond_7

    move/from16 v16, v6

    goto :goto_4

    :cond_7
    move/from16 v16, v5

    :goto_4
    add-int/lit8 v9, v2, 0x2

    invoke-interface/range {p1 .. p1}, Lcr5;->size()I

    move-result v1

    if-ne v9, v1, :cond_8

    move v1, v6

    goto :goto_5

    :cond_8
    move v1, v5

    :goto_5
    if-nez v4, :cond_9

    move/from16 v17, v6

    goto :goto_6

    :cond_9
    move/from16 v17, v5

    :goto_6
    add-int/lit8 v9, v4, 0x2

    invoke-interface/range {p3 .. p3}, Lcr5;->size()I

    move-result v3

    if-ne v9, v3, :cond_a

    move v3, v6

    goto :goto_7

    :cond_a
    move v3, v5

    :goto_7
    iget-object v9, v0, LU83;->e:Lsr2;

    invoke-virtual {v9, v8, v15, v14, v13}, Lsr2;->d(LyB0;LyB0;LyB0;LyB0;)V

    iget-object v9, v0, LU83;->e:Lsr2;

    invoke-virtual {v9}, Lsr2;->i()Z

    move-result v9

    if-eqz v9, :cond_b

    iget-object v9, v0, LU83;->e:Lsr2;

    invoke-virtual {v9}, Lsr2;->l()Z

    move-result v9

    if-eqz v9, :cond_b

    move/from16 v18, v6

    goto :goto_8

    :cond_b
    move/from16 v18, v5

    :goto_8
    iget-boolean v9, v0, LU83;->d:Z

    if-nez v9, :cond_d

    if-eqz v7, :cond_c

    sub-int v2, v4, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-gt v2, v6, :cond_c

    move v2, v6

    goto :goto_9

    :cond_c
    move v2, v5

    :goto_9
    if-nez v2, :cond_d

    move-object v9, v8

    move-object v10, v15

    move-object v11, v14

    move-object v12, v13

    move-object v2, v13

    move/from16 v13, v16

    move-object v4, v14

    move v14, v1

    move-object v1, v15

    move/from16 v15, v17

    move/from16 v16, v3

    invoke-static/range {v9 .. v16}, LU83;->f(LyB0;LyB0;LyB0;LyB0;ZZZZ)Z

    move-result v3

    if-eqz v3, :cond_e

    move v3, v6

    goto :goto_a

    :cond_d
    move-object v2, v13

    move-object v4, v14

    move-object v1, v15

    :cond_e
    move v3, v5

    :goto_a
    if-nez v18, :cond_f

    if-eqz v3, :cond_11

    :cond_f
    const/4 v3, 0x4

    new-array v3, v3, [LyB0;

    iput-object v3, v0, LU83;->g:[LyB0;

    aput-object v8, v3, v5

    aput-object v1, v3, v6

    const/4 v1, 0x2

    aput-object v4, v3, v1

    const/4 v1, 0x3

    aput-object v2, v3, v1

    iget-object v1, v0, LU83;->e:Lsr2;

    invoke-virtual {v1, v5}, Lsr2;->f(I)LyB0;

    move-result-object v1

    iput-object v1, v0, LU83;->f:LyB0;

    iget-boolean v2, v0, LU83;->c:Z

    if-eqz v2, :cond_10

    iget-object v2, v0, LU83;->h:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_10
    iget v1, v0, LU83;->i:I

    add-int/2addr v1, v6

    iput v1, v0, LU83;->i:I

    :cond_11
    return-void
.end method

.method public b()LyB0;
    .locals 1

    iget-object v0, p0, LU83;->f:LyB0;

    return-object v0
.end method

.method public c()[LyB0;
    .locals 1

    iget-object v0, p0, LU83;->g:[LyB0;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, LU83;->f:LyB0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public h(Z)V
    .locals 0

    iput-boolean p1, p0, LU83;->a:Z

    return-void
.end method

.method public isDone()Z
    .locals 2

    iget-boolean v0, p0, LU83;->a:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LU83;->f:LyB0;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method
