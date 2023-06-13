.class public LpM5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVq5;


# instance fields
.field public a:Lsr2;

.field public b:D

.field public c:LrM5;


# direct methods
.method public constructor <init>(DLrM5;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LBb5;

    invoke-direct {v0}, LBb5;-><init>()V

    iput-object v0, p0, LpM5;->a:Lsr2;

    iput-object p3, p0, LpM5;->c:LrM5;

    iput-wide p1, p0, LpM5;->b:D

    return-void
.end method

.method public static b(Lcr5;ILcr5;I)Z
    .locals 2

    const/4 v0, 0x0

    if-eq p0, p2, :cond_0

    return v0

    :cond_0
    sub-int p2, p1, p3

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    const/4 v1, 0x1

    if-ne p2, v1, :cond_1

    move p2, v1

    goto :goto_0

    :cond_1
    move p2, v0

    :goto_0
    if-eqz p2, :cond_2

    return v1

    :cond_2
    invoke-interface {p0}, Lcr5;->isClosed()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p0}, Lcr5;->size()I

    move-result p0

    sub-int/2addr p0, v1

    if-nez p1, :cond_3

    if-eq p3, p0, :cond_4

    :cond_3
    if-nez p3, :cond_5

    if-ne p1, p0, :cond_5

    :cond_4
    return v1

    :cond_5
    return v0
.end method


# virtual methods
.method public a(Lcr5;ILcr5;I)V
    .locals 17

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move/from16 v10, p2

    move-object/from16 v11, p3

    move/from16 v12, p4

    if-ne v9, v11, :cond_0

    if-ne v10, v12, :cond_0

    return-void

    :cond_0
    invoke-interface/range {p1 .. p2}, Lcr5;->u(I)LyB0;

    move-result-object v13

    add-int/lit8 v0, v10, 0x1

    invoke-interface {v9, v0}, Lcr5;->u(I)LyB0;

    move-result-object v14

    invoke-interface/range {p3 .. p4}, Lcr5;->u(I)LyB0;

    move-result-object v15

    add-int/lit8 v0, v12, 0x1

    invoke-interface {v11, v0}, Lcr5;->u(I)LyB0;

    move-result-object v7

    invoke-static/range {p1 .. p4}, LpM5;->b(Lcr5;ILcr5;I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, v8, LpM5;->a:Lsr2;

    invoke-virtual {v0, v13, v14, v15, v7}, Lsr2;->d(LyB0;LyB0;LyB0;LyB0;)V

    iget-object v0, v8, LpM5;->a:Lsr2;

    invoke-virtual {v0}, Lsr2;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v8, LpM5;->a:Lsr2;

    invoke-virtual {v0}, Lsr2;->g()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, v8, LpM5;->a:Lsr2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lsr2;->f(I)LyB0;

    move-result-object v0

    iget-object v1, v8, LpM5;->c:LrM5;

    invoke-virtual {v1, v0}, LrM5;->a(LyB0;)LyB0;

    move-result-object v0

    move-object v1, v9

    check-cast v1, LS83;

    invoke-virtual {v1, v0, v10}, LS83;->a(LyB0;I)V

    move-object v1, v11

    check-cast v1, LS83;

    invoke-virtual {v1, v0, v12}, LS83;->a(LyB0;I)V

    :cond_1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object v3, v13

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object v6, v15

    move-object/from16 v16, v7

    invoke-virtual/range {v0 .. v7}, LpM5;->c(Lcr5;ILyB0;Lcr5;ILyB0;LyB0;)V

    move-object v3, v14

    invoke-virtual/range {v0 .. v7}, LpM5;->c(Lcr5;ILyB0;Lcr5;ILyB0;LyB0;)V

    move-object/from16 v1, p3

    move/from16 v2, p4

    move-object v3, v15

    move-object/from16 v4, p1

    move/from16 v5, p2

    move-object v6, v13

    move-object v7, v14

    invoke-virtual/range {v0 .. v7}, LpM5;->c(Lcr5;ILyB0;Lcr5;ILyB0;LyB0;)V

    move-object/from16 v3, v16

    invoke-virtual/range {v0 .. v7}, LpM5;->c(Lcr5;ILyB0;Lcr5;ILyB0;LyB0;)V

    return-void
.end method

.method public final c(Lcr5;ILyB0;Lcr5;ILyB0;LyB0;)V
    .locals 4

    invoke-virtual {p3, p6}, LyB0;->f(LyB0;)D

    move-result-wide v0

    iget-wide v2, p0, LpM5;->b:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p3, p7}, LyB0;->f(LyB0;)D

    move-result-wide v0

    iget-wide v2, p0, LpM5;->b:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    return-void

    :cond_1
    invoke-static {p3, p6, p7}, LG51;->a(LyB0;LyB0;LyB0;)D

    move-result-wide p6

    iget-wide v0, p0, LpM5;->b:D

    cmpg-double p6, p6, v0

    if-gez p6, :cond_2

    check-cast p4, LS83;

    invoke-virtual {p4, p3, p5}, LS83;->a(LyB0;I)V

    check-cast p1, LS83;

    invoke-virtual {p1, p3, p2}, LS83;->a(LyB0;I)V

    :cond_2
    return-void
.end method

.method public isDone()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
