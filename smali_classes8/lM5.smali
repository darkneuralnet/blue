.class public LlM5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVq5;


# instance fields
.field public final a:Lsr2;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LyB0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:D


# direct methods
.method public constructor <init>(D)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LlM5;->c:D

    new-instance p1, LBb5;

    invoke-direct {p1}, LBb5;-><init>()V

    iput-object p1, p0, LlM5;->a:Lsr2;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LlM5;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Lcr5;ILcr5;I)V
    .locals 15

    move-object v6, p0

    move-object/from16 v7, p1

    move/from16 v8, p2

    move-object/from16 v9, p3

    move/from16 v10, p4

    if-ne v7, v9, :cond_0

    if-ne v8, v10, :cond_0

    return-void

    :cond_0
    invoke-interface/range {p1 .. p2}, Lcr5;->u(I)LyB0;

    move-result-object v11

    add-int/lit8 v0, v8, 0x1

    invoke-interface {v7, v0}, Lcr5;->u(I)LyB0;

    move-result-object v12

    invoke-interface/range {p3 .. p4}, Lcr5;->u(I)LyB0;

    move-result-object v13

    add-int/lit8 v0, v10, 0x1

    invoke-interface {v9, v0}, Lcr5;->u(I)LyB0;

    move-result-object v14

    iget-object v0, v6, LlM5;->a:Lsr2;

    invoke-virtual {v0, v11, v12, v13, v14}, Lsr2;->d(LyB0;LyB0;LyB0;LyB0;)V

    iget-object v0, v6, LlM5;->a:Lsr2;

    invoke-virtual {v0}, Lsr2;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v6, LlM5;->a:Lsr2;

    invoke-virtual {v0}, Lsr2;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, v6, LlM5;->a:Lsr2;

    invoke-virtual {v2}, Lsr2;->g()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, v6, LlM5;->b:Ljava/util/List;

    iget-object v3, v6, LlM5;->a:Lsr2;

    invoke-virtual {v3, v1}, Lsr2;->f(I)LyB0;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move-object v1, v7

    check-cast v1, LS83;

    iget-object v2, v6, LlM5;->a:Lsr2;

    invoke-virtual {v1, v2, v8, v0}, LS83;->d(Lsr2;II)V

    move-object v0, v9

    check-cast v0, LS83;

    iget-object v1, v6, LlM5;->a:Lsr2;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v10, v2}, LS83;->d(Lsr2;II)V

    return-void

    :cond_2
    move-object v0, p0

    move-object v1, v11

    move-object/from16 v2, p3

    move/from16 v3, p4

    move-object v4, v13

    move-object v5, v14

    invoke-virtual/range {v0 .. v5}, LlM5;->c(LyB0;Lcr5;ILyB0;LyB0;)V

    move-object v1, v12

    invoke-virtual/range {v0 .. v5}, LlM5;->c(LyB0;Lcr5;ILyB0;LyB0;)V

    move-object v1, v13

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object v4, v11

    move-object v5, v12

    invoke-virtual/range {v0 .. v5}, LlM5;->c(LyB0;Lcr5;ILyB0;LyB0;)V

    move-object v1, v14

    invoke-virtual/range {v0 .. v5}, LlM5;->c(LyB0;Lcr5;ILyB0;LyB0;)V

    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LyB0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LlM5;->b:Ljava/util/List;

    return-object v0
.end method

.method public final c(LyB0;Lcr5;ILyB0;LyB0;)V
    .locals 4

    invoke-virtual {p1, p4}, LyB0;->f(LyB0;)D

    move-result-wide v0

    iget-wide v2, p0, LlM5;->c:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p5}, LyB0;->f(LyB0;)D

    move-result-wide v0

    iget-wide v2, p0, LlM5;->c:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    return-void

    :cond_1
    invoke-static {p1, p4, p5}, LG51;->a(LyB0;LyB0;LyB0;)D

    move-result-wide p4

    iget-wide v0, p0, LlM5;->c:D

    cmpg-double p4, p4, v0

    if-gez p4, :cond_2

    iget-object p4, p0, LlM5;->b:Ljava/util/List;

    invoke-interface {p4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    check-cast p2, LS83;

    invoke-virtual {p2, p1, p3}, LS83;->a(LyB0;I)V

    :cond_2
    return-void
.end method

.method public isDone()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
