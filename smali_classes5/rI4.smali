.class public LrI4;
.super LLD;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TranscodeType:",
        "Ljava/lang/Object;",
        ">",
        "LLD<",
        "LrI4<",
        "TTranscodeType;>;>;"
    }
.end annotation


# static fields
.field public static final T:LYI4;


# instance fields
.field public final B:Landroid/content/Context;

.field public final C:LUI4;

.field public final D:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field public final E:Lcom/bumptech/glide/a;

.field public final F:Lcom/bumptech/glide/c;

.field public G:LK96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LK96<",
            "*-TTranscodeType;>;"
        }
    .end annotation
.end field

.field public H:Ljava/lang/Object;

.field public I:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LTI4<",
            "TTranscodeType;>;>;"
        }
    .end annotation
.end field

.field public J:LrI4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LrI4<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field public K:LrI4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LrI4<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field public P:Ljava/lang/Float;

.field public Q:Z

.field public R:Z

.field public S:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LYI4;

    invoke-direct {v0}, LYI4;-><init>()V

    sget-object v1, LB41;->c:LB41;

    invoke-virtual {v0, v1}, LLD;->k(LB41;)LLD;

    move-result-object v0

    check-cast v0, LYI4;

    sget-object v1, LP24;->e:LP24;

    invoke-virtual {v0, v1}, LLD;->o0(LP24;)LLD;

    move-result-object v0

    check-cast v0, LYI4;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LLD;->x0(Z)LLD;

    move-result-object v0

    check-cast v0, LYI4;

    sput-object v0, LrI4;->T:LYI4;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/a;LUI4;Ljava/lang/Class;Landroid/content/Context;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/a;",
            "LUI4;",
            "Ljava/lang/Class<",
            "TTranscodeType;>;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, LLD;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LrI4;->Q:Z

    iput-object p1, p0, LrI4;->E:Lcom/bumptech/glide/a;

    iput-object p2, p0, LrI4;->C:LUI4;

    iput-object p3, p0, LrI4;->D:Ljava/lang/Class;

    iput-object p4, p0, LrI4;->B:Landroid/content/Context;

    invoke-virtual {p2, p3}, LUI4;->g(Ljava/lang/Class;)LK96;

    move-result-object p3

    iput-object p3, p0, LrI4;->G:LK96;

    invoke-virtual {p1}, Lcom/bumptech/glide/a;->i()Lcom/bumptech/glide/c;

    move-result-object p1

    iput-object p1, p0, LrI4;->F:Lcom/bumptech/glide/c;

    invoke-virtual {p2}, LUI4;->e()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, LrI4;->M0(Ljava/util/List;)V

    invoke-virtual {p2}, LUI4;->f()LYI4;

    move-result-object p1

    invoke-virtual {p0, p1}, LrI4;->G0(LLD;)LrI4;

    return-void
.end method


# virtual methods
.method public F0(LTI4;)LrI4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTI4<",
            "TTranscodeType;>;)",
            "LrI4<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-virtual {p0}, LLD;->S()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LrI4;->K0()LrI4;

    move-result-object v0

    invoke-virtual {v0, p1}, LrI4;->F0(LTI4;)LrI4;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p1, :cond_2

    iget-object v0, p0, LrI4;->I:Ljava/util/List;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LrI4;->I:Ljava/util/List;

    :cond_1
    iget-object v0, p0, LrI4;->I:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    check-cast p1, LrI4;

    return-object p1
.end method

.method public G0(LLD;)LrI4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLD<",
            "*>;)",
            "LrI4<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-super {p0, p1}, LLD;->d(LLD;)LLD;

    move-result-object p1

    check-cast p1, LrI4;

    return-object p1
.end method

.method public final H0(LLY5;LTI4;LLD;Ljava/util/concurrent/Executor;)LnI4;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLY5<",
            "TTranscodeType;>;",
            "LTI4<",
            "TTranscodeType;>;",
            "LLD<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "LnI4;"
        }
    .end annotation

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v4, 0x0

    iget-object v5, p0, LrI4;->G:LK96;

    invoke-virtual {p3}, LLD;->H()LP24;

    move-result-object v6

    invoke-virtual {p3}, LLD;->C()I

    move-result v7

    invoke-virtual {p3}, LLD;->B()I

    move-result v8

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v9, p3

    move-object v10, p4

    invoke-virtual/range {v0 .. v10}, LrI4;->I0(Ljava/lang/Object;LLY5;LTI4;LEI4;LK96;LP24;IILLD;Ljava/util/concurrent/Executor;)LnI4;

    move-result-object p1

    return-object p1
.end method

.method public final I0(Ljava/lang/Object;LLY5;LTI4;LEI4;LK96;LP24;IILLD;Ljava/util/concurrent/Executor;)LnI4;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "LLY5<",
            "TTranscodeType;>;",
            "LTI4<",
            "TTranscodeType;>;",
            "LEI4;",
            "LK96<",
            "*-TTranscodeType;>;",
            "LP24;",
            "II",
            "LLD<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "LnI4;"
        }
    .end annotation

    move-object/from16 v11, p0

    iget-object v0, v11, LrI4;->K:LrI4;

    if-eqz v0, :cond_0

    new-instance v0, Log1;

    move-object/from16 v13, p1

    move-object/from16 v1, p4

    invoke-direct {v0, v13, v1}, Log1;-><init>(Ljava/lang/Object;LEI4;)V

    move-object v4, v0

    move-object v15, v4

    goto :goto_0

    :cond_0
    move-object/from16 v13, p1

    move-object/from16 v1, p4

    const/4 v0, 0x0

    move-object v15, v0

    move-object v4, v1

    :goto_0
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-virtual/range {v0 .. v10}, LrI4;->J0(Ljava/lang/Object;LLY5;LTI4;LEI4;LK96;LP24;IILLD;Ljava/util/concurrent/Executor;)LnI4;

    move-result-object v0

    if-nez v15, :cond_1

    return-object v0

    :cond_1
    iget-object v1, v11, LrI4;->K:LrI4;

    invoke-virtual {v1}, LLD;->C()I

    move-result v1

    iget-object v2, v11, LrI4;->K:LrI4;

    invoke-virtual {v2}, LLD;->B()I

    move-result v2

    invoke-static/range {p7 .. p8}, Lpi6;->t(II)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, v11, LrI4;->K:LrI4;

    invoke-virtual {v3}, LLD;->c0()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual/range {p9 .. p9}, LLD;->C()I

    move-result v1

    invoke-virtual/range {p9 .. p9}, LLD;->B()I

    move-result v2

    :cond_2
    move/from16 v19, v1

    move/from16 v20, v2

    iget-object v12, v11, LrI4;->K:LrI4;

    iget-object v1, v12, LrI4;->G:LK96;

    invoke-virtual {v12}, LLD;->H()LP24;

    move-result-object v18

    iget-object v2, v11, LrI4;->K:LrI4;

    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move-object v3, v15

    move-object/from16 v15, p3

    move-object/from16 v16, v3

    move-object/from16 v17, v1

    move-object/from16 v21, v2

    move-object/from16 v22, p10

    invoke-virtual/range {v12 .. v22}, LrI4;->I0(Ljava/lang/Object;LLY5;LTI4;LEI4;LK96;LP24;IILLD;Ljava/util/concurrent/Executor;)LnI4;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Log1;->n(LnI4;LnI4;)V

    return-object v3
.end method

.method public final J0(Ljava/lang/Object;LLY5;LTI4;LEI4;LK96;LP24;IILLD;Ljava/util/concurrent/Executor;)LnI4;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "LLY5<",
            "TTranscodeType;>;",
            "LTI4<",
            "TTranscodeType;>;",
            "LEI4;",
            "LK96<",
            "*-TTranscodeType;>;",
            "LP24;",
            "II",
            "LLD<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "LnI4;"
        }
    .end annotation

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    move-object/from16 v5, p4

    move-object/from16 v13, p6

    iget-object v0, v11, LrI4;->J:LrI4;

    if-eqz v0, :cond_4

    iget-boolean v1, v11, LrI4;->S:Z

    if-nez v1, :cond_3

    iget-object v1, v0, LrI4;->G:LK96;

    iget-boolean v2, v0, LrI4;->Q:Z

    if-eqz v2, :cond_0

    move-object/from16 v14, p5

    goto :goto_0

    :cond_0
    move-object v14, v1

    :goto_0
    invoke-virtual {v0}, LLD;->V()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v11, LrI4;->J:LrI4;

    invoke-virtual {v0}, LLD;->H()LP24;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {v11, v13}, LrI4;->L0(LP24;)LP24;

    move-result-object v0

    :goto_1
    move-object v15, v0

    iget-object v0, v11, LrI4;->J:LrI4;

    invoke-virtual {v0}, LLD;->C()I

    move-result v0

    iget-object v1, v11, LrI4;->J:LrI4;

    invoke-virtual {v1}, LLD;->B()I

    move-result v1

    invoke-static/range {p7 .. p8}, Lpi6;->t(II)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v11, LrI4;->J:LrI4;

    invoke-virtual {v2}, LLD;->c0()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual/range {p9 .. p9}, LLD;->C()I

    move-result v0

    invoke-virtual/range {p9 .. p9}, LLD;->B()I

    move-result v1

    :cond_2
    move/from16 v16, v0

    move/from16 v17, v1

    new-instance v10, LZ36;

    invoke-direct {v10, v12, v5}, LZ36;-><init>(Ljava/lang/Object;LEI4;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p9

    move-object v5, v10

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object v13, v10

    move-object/from16 v10, p10

    invoke-virtual/range {v0 .. v10}, LrI4;->c1(Ljava/lang/Object;LLY5;LTI4;LLD;LEI4;LK96;LP24;IILjava/util/concurrent/Executor;)LnI4;

    move-result-object v10

    const/4 v0, 0x1

    iput-boolean v0, v11, LrI4;->S:Z

    iget-object v9, v11, LrI4;->J:LrI4;

    move-object v0, v9

    move-object v4, v13

    move-object v5, v14

    move-object v6, v15

    move/from16 v7, v16

    move/from16 v8, v17

    move-object v12, v10

    move-object/from16 v10, p10

    invoke-virtual/range {v0 .. v10}, LrI4;->I0(Ljava/lang/Object;LLY5;LTI4;LEI4;LK96;LP24;IILLD;Ljava/util/concurrent/Executor;)LnI4;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v11, LrI4;->S:Z

    invoke-virtual {v13, v12, v0}, LZ36;->m(LnI4;LnI4;)V

    return-object v13

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    iget-object v0, v11, LrI4;->P:Ljava/lang/Float;

    if-eqz v0, :cond_5

    new-instance v14, LZ36;

    invoke-direct {v14, v12, v5}, LZ36;-><init>(Ljava/lang/Object;LEI4;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p9

    move-object v5, v14

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p10

    invoke-virtual/range {v0 .. v10}, LrI4;->c1(Ljava/lang/Object;LLY5;LTI4;LLD;LEI4;LK96;LP24;IILjava/util/concurrent/Executor;)LnI4;

    move-result-object v15

    invoke-virtual/range {p9 .. p9}, LLD;->h()LLD;

    move-result-object v0

    iget-object v1, v11, LrI4;->P:Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v0, v1}, LLD;->w0(F)LLD;

    move-result-object v4

    invoke-virtual {v11, v13}, LrI4;->L0(LP24;)LP24;

    move-result-object v7

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v10}, LrI4;->c1(Ljava/lang/Object;LLY5;LTI4;LLD;LEI4;LK96;LP24;IILjava/util/concurrent/Executor;)LnI4;

    move-result-object v0

    invoke-virtual {v14, v15, v0}, LZ36;->m(LnI4;LnI4;)V

    return-object v14

    :cond_5
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p9

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p10

    invoke-virtual/range {v0 .. v10}, LrI4;->c1(Ljava/lang/Object;LLY5;LTI4;LLD;LEI4;LK96;LP24;IILjava/util/concurrent/Executor;)LnI4;

    move-result-object v0

    return-object v0
.end method

.method public K0()LrI4;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LrI4<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-super {p0}, LLD;->h()LLD;

    move-result-object v0

    check-cast v0, LrI4;

    iget-object v1, v0, LrI4;->G:LK96;

    invoke-virtual {v1}, LK96;->d()LK96;

    move-result-object v1

    iput-object v1, v0, LrI4;->G:LK96;

    iget-object v1, v0, LrI4;->I:Ljava/util/List;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, v0, LrI4;->I:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, LrI4;->I:Ljava/util/List;

    :cond_0
    iget-object v1, v0, LrI4;->J:LrI4;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LrI4;->K0()LrI4;

    move-result-object v1

    iput-object v1, v0, LrI4;->J:LrI4;

    :cond_1
    iget-object v1, v0, LrI4;->K:LrI4;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LrI4;->K0()LrI4;

    move-result-object v1

    iput-object v1, v0, LrI4;->K:LrI4;

    :cond_2
    return-object v0
.end method

.method public final L0(LP24;)LP24;
    .locals 2

    sget-object v0, LrI4$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown priority: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LLD;->H()LP24;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    sget-object p1, LP24;->b:LP24;

    return-object p1

    :cond_2
    sget-object p1, LP24;->c:LP24;

    return-object p1

    :cond_3
    sget-object p1, LP24;->d:LP24;

    return-object p1
.end method

.method public final M0(Ljava/util/List;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LTI4<",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTI4;

    invoke-virtual {p0, v0}, LrI4;->F0(LTI4;)LrI4;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public O0(LLY5;)LLY5;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y::",
            "LLY5<",
            "TTranscodeType;>;>(TY;)TY;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {}, LJh1;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, LrI4;->Q0(LLY5;LTI4;Ljava/util/concurrent/Executor;)LLY5;

    move-result-object p1

    return-object p1
.end method

.method public final P0(LLY5;LTI4;LLD;Ljava/util/concurrent/Executor;)LLY5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y::",
            "LLY5<",
            "TTranscodeType;>;>(TY;",
            "LTI4<",
            "TTranscodeType;>;",
            "LLD<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")TY;"
        }
    .end annotation

    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p0, LrI4;->R:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1, p2, p3, p4}, LrI4;->H0(LLY5;LTI4;LLD;Ljava/util/concurrent/Executor;)LnI4;

    move-result-object p2

    invoke-interface {p1}, LLY5;->getRequest()LnI4;

    move-result-object p4

    invoke-interface {p2, p4}, LnI4;->e(LnI4;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p3, p4}, LrI4;->S0(LLD;LnI4;)Z

    move-result p3

    if-nez p3, :cond_1

    invoke-static {p4}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LnI4;

    invoke-interface {p2}, LnI4;->isRunning()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {p4}, LnI4;->i()V

    :cond_0
    return-object p1

    :cond_1
    iget-object p3, p0, LrI4;->C:LUI4;

    invoke-virtual {p3, p1}, LUI4;->d(LLY5;)V

    invoke-interface {p1, p2}, LLY5;->setRequest(LnI4;)V

    iget-object p3, p0, LrI4;->C:LUI4;

    invoke-virtual {p3, p1, p2}, LUI4;->q(LLY5;LnI4;)V

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "You must call #load() before calling #into()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public Q0(LLY5;LTI4;Ljava/util/concurrent/Executor;)LLY5;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y::",
            "LLY5<",
            "TTranscodeType;>;>(TY;",
            "LTI4<",
            "TTranscodeType;>;",
            "Ljava/util/concurrent/Executor;",
            ")TY;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p0, p3}, LrI4;->P0(LLY5;LTI4;LLD;Ljava/util/concurrent/Executor;)LLY5;

    move-result-object p1

    return-object p1
.end method

.method public R0(Landroid/widget/ImageView;)LIt6;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            ")",
            "LIt6<",
            "Landroid/widget/ImageView;",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-static {}, Lpi6;->b()V

    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, LLD;->b0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LLD;->Z()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, LrI4$a;->a:[I

    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0}, LLD;->f0()LLD;

    move-result-object v0

    goto :goto_1

    :pswitch_1
    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0}, LLD;->g0()LLD;

    move-result-object v0

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0}, LLD;->f0()LLD;

    move-result-object v0

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0}, LLD;->e0()LLD;

    move-result-object v0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v0, p0

    :goto_1
    iget-object v1, p0, LrI4;->F:Lcom/bumptech/glide/c;

    iget-object v2, p0, LrI4;->D:Ljava/lang/Class;

    invoke-virtual {v1, p1, v2}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;Ljava/lang/Class;)LIt6;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {}, LJh1;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {p0, p1, v1, v0, v2}, LrI4;->P0(LLY5;LTI4;LLD;Ljava/util/concurrent/Executor;)LLY5;

    move-result-object p1

    check-cast p1, LIt6;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final S0(LLD;LnI4;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLD<",
            "*>;",
            "LnI4;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p1}, LLD;->U()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {p2}, LnI4;->isComplete()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public T0(LTI4;)LrI4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTI4<",
            "TTranscodeType;>;)",
            "LrI4<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-virtual {p0}, LLD;->S()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LrI4;->K0()LrI4;

    move-result-object v0

    invoke-virtual {v0, p1}, LrI4;->T0(LTI4;)LrI4;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LrI4;->I:Ljava/util/List;

    invoke-virtual {p0, p1}, LrI4;->F0(LTI4;)LrI4;

    move-result-object p1

    return-object p1
.end method

.method public U0(Landroid/net/Uri;)LrI4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "LrI4<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LrI4;->b1(Ljava/lang/Object;)LrI4;

    move-result-object p1

    return-object p1
.end method

.method public V0(Ljava/io/File;)LrI4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "LrI4<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LrI4;->b1(Ljava/lang/Object;)LrI4;

    move-result-object p1

    return-object p1
.end method

.method public X0(Ljava/lang/Integer;)LrI4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")",
            "LrI4<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LrI4;->b1(Ljava/lang/Object;)LrI4;

    move-result-object p1

    iget-object v0, p0, LrI4;->B:Landroid/content/Context;

    invoke-static {v0}, LDd;->c(Landroid/content/Context;)Lak2;

    move-result-object v0

    invoke-static {v0}, LYI4;->J0(Lak2;)LYI4;

    move-result-object v0

    invoke-virtual {p1, v0}, LrI4;->G0(LLD;)LrI4;

    move-result-object p1

    return-object p1
.end method

.method public Z0(Ljava/lang/Object;)LrI4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "LrI4<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LrI4;->b1(Ljava/lang/Object;)LrI4;

    move-result-object p1

    return-object p1
.end method

.method public a1(Ljava/lang/String;)LrI4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "LrI4<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LrI4;->b1(Ljava/lang/Object;)LrI4;

    move-result-object p1

    return-object p1
.end method

.method public final b1(Ljava/lang/Object;)LrI4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "LrI4<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-virtual {p0}, LLD;->S()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LrI4;->K0()LrI4;

    move-result-object v0

    invoke-virtual {v0, p1}, LrI4;->b1(Ljava/lang/Object;)LrI4;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, LrI4;->H:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, LrI4;->R:Z

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    check-cast p1, LrI4;

    return-object p1
.end method

.method public final c1(Ljava/lang/Object;LLY5;LTI4;LLD;LEI4;LK96;LP24;IILjava/util/concurrent/Executor;)LnI4;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "LLY5<",
            "TTranscodeType;>;",
            "LTI4<",
            "TTranscodeType;>;",
            "LLD<",
            "*>;",
            "LEI4;",
            "LK96<",
            "*-TTranscodeType;>;",
            "LP24;",
            "II",
            "Ljava/util/concurrent/Executor;",
            ")",
            "LnI4;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, LrI4;->B:Landroid/content/Context;

    iget-object v2, v0, LrI4;->F:Lcom/bumptech/glide/c;

    iget-object v4, v0, LrI4;->H:Ljava/lang/Object;

    iget-object v5, v0, LrI4;->D:Ljava/lang/Class;

    iget-object v12, v0, LrI4;->I:Ljava/util/List;

    invoke-virtual {v2}, Lcom/bumptech/glide/c;->f()LDd1;

    move-result-object v14

    invoke-virtual/range {p6 .. p6}, LK96;->e()LI96;

    move-result-object v15

    move-object/from16 v3, p1

    move-object/from16 v6, p4

    move/from16 v7, p8

    move/from16 v8, p9

    move-object/from16 v9, p7

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v13, p5

    move-object/from16 v16, p10

    invoke-static/range {v1 .. v16}, LmB5;->x(Landroid/content/Context;Lcom/bumptech/glide/c;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;LLD;IILP24;LLY5;LTI4;Ljava/util/List;LEI4;LDd1;LI96;Ljava/util/concurrent/Executor;)LmB5;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LrI4;->K0()LrI4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(LLD;)LLD;
    .locals 0

    invoke-virtual {p0, p1}, LrI4;->G0(LLD;)LrI4;

    move-result-object p1

    return-object p1
.end method

.method public d1()LGA1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGA1<",
            "TTranscodeType;>;"
        }
    .end annotation

    const/high16 v0, -0x80000000

    invoke-virtual {p0, v0, v0}, LrI4;->e1(II)LGA1;

    move-result-object v0

    return-object v0
.end method

.method public e1(II)LGA1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "LGA1<",
            "TTranscodeType;>;"
        }
    .end annotation

    new-instance v0, LOI4;

    invoke-direct {v0, p1, p2}, LOI4;-><init>(II)V

    invoke-static {}, LJh1;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {p0, v0, v0, p1}, LrI4;->Q0(LLY5;LTI4;Ljava/util/concurrent/Executor;)LLY5;

    move-result-object p1

    check-cast p1, LGA1;

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LrI4;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LrI4;

    invoke-super {p0, p1}, LLD;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LrI4;->D:Ljava/lang/Class;

    iget-object v2, p1, LrI4;->D:Ljava/lang/Class;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LrI4;->G:LK96;

    iget-object v2, p1, LrI4;->G:LK96;

    invoke-virtual {v0, v2}, LK96;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LrI4;->H:Ljava/lang/Object;

    iget-object v2, p1, LrI4;->H:Ljava/lang/Object;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LrI4;->I:Ljava/util/List;

    iget-object v2, p1, LrI4;->I:Ljava/util/List;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LrI4;->J:LrI4;

    iget-object v2, p1, LrI4;->J:LrI4;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LrI4;->K:LrI4;

    iget-object v2, p1, LrI4;->K:LrI4;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LrI4;->P:Ljava/lang/Float;

    iget-object v2, p1, LrI4;->P:Ljava/lang/Float;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LrI4;->Q:Z

    iget-boolean v2, p1, LrI4;->Q:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, LrI4;->R:Z

    iget-boolean p1, p1, LrI4;->R:Z

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public f1(F)LrI4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "LrI4<",
            "TTranscodeType;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, LLD;->S()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LrI4;->K0()LrI4;

    move-result-object v0

    invoke-virtual {v0, p1}, LrI4;->f1(F)LrI4;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-gtz v0, :cond_1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, LrI4;->P:Ljava/lang/Float;

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    check-cast p1, LrI4;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "sizeMultiplier must be between 0 and 1"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g1(LK96;)LrI4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LK96<",
            "*-TTranscodeType;>;)",
            "LrI4<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-virtual {p0}, LLD;->S()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LrI4;->K0()LrI4;

    move-result-object v0

    invoke-virtual {v0, p1}, LrI4;->g1(LK96;)LrI4;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LK96;

    iput-object p1, p0, LrI4;->G:LK96;

    const/4 p1, 0x0

    iput-boolean p1, p0, LrI4;->Q:Z

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    check-cast p1, LrI4;

    return-object p1
.end method

.method public bridge synthetic h()LLD;
    .locals 1

    invoke-virtual {p0}, LrI4;->K0()LrI4;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-super {p0}, LLD;->hashCode()I

    move-result v0

    iget-object v1, p0, LrI4;->D:Ljava/lang/Class;

    invoke-static {v1, v0}, Lpi6;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, LrI4;->G:LK96;

    invoke-static {v1, v0}, Lpi6;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, LrI4;->H:Ljava/lang/Object;

    invoke-static {v1, v0}, Lpi6;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, LrI4;->I:Ljava/util/List;

    invoke-static {v1, v0}, Lpi6;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, LrI4;->J:LrI4;

    invoke-static {v1, v0}, Lpi6;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, LrI4;->K:LrI4;

    invoke-static {v1, v0}, Lpi6;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, LrI4;->P:Ljava/lang/Float;

    invoke-static {v1, v0}, Lpi6;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-boolean v1, p0, LrI4;->Q:Z

    invoke-static {v1, v0}, Lpi6;->p(ZI)I

    move-result v0

    iget-boolean v1, p0, LrI4;->R:Z

    invoke-static {v1, v0}, Lpi6;->p(ZI)I

    move-result v0

    return v0
.end method
