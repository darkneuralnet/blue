.class public LLr2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLr2$a;,
        LLr2$b;
    }
.end annotation


# static fields
.field public static r:Z = false

.field public static s:Z = true

.field public static t:Z = true

.field public static u:Z = true

.field public static v:Z = false

.field public static w:I = 0x3e8

.field public static x:LbU2;

.field public static y:J

.field public static z:J


# instance fields
.field public a:Z

.field public b:I

.field public c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "LrN5;",
            ">;"
        }
    .end annotation
.end field

.field public d:LLr2$a;

.field public e:I

.field public f:I

.field public g:[Lxo;

.field public h:Z

.field public i:Z

.field public j:[Z

.field public k:I

.field public l:I

.field public m:I

.field public final n:Lb80;

.field public o:[LrN5;

.field public p:I

.field public q:LLr2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LLr2;->a:Z

    iput v0, p0, LLr2;->b:I

    const/4 v1, 0x0

    iput-object v1, p0, LLr2;->c:Ljava/util/HashMap;

    const/16 v2, 0x20

    iput v2, p0, LLr2;->e:I

    iput v2, p0, LLr2;->f:I

    iput-object v1, p0, LLr2;->g:[Lxo;

    iput-boolean v0, p0, LLr2;->h:Z

    iput-boolean v0, p0, LLr2;->i:Z

    new-array v1, v2, [Z

    iput-object v1, p0, LLr2;->j:[Z

    const/4 v1, 0x1

    iput v1, p0, LLr2;->k:I

    iput v0, p0, LLr2;->l:I

    iput v2, p0, LLr2;->m:I

    sget v1, LLr2;->w:I

    new-array v1, v1, [LrN5;

    iput-object v1, p0, LLr2;->o:[LrN5;

    iput v0, p0, LLr2;->p:I

    new-array v0, v2, [Lxo;

    iput-object v0, p0, LLr2;->g:[Lxo;

    invoke-virtual {p0}, LLr2;->D()V

    new-instance v0, Lb80;

    invoke-direct {v0}, Lb80;-><init>()V

    iput-object v0, p0, LLr2;->n:Lb80;

    new-instance v1, LQ24;

    invoke-direct {v1, v0}, LQ24;-><init>(Lb80;)V

    iput-object v1, p0, LLr2;->d:LLr2$a;

    sget-boolean v1, LLr2;->v:Z

    if-eqz v1, :cond_0

    new-instance v1, LLr2$b;

    invoke-direct {v1, p0, v0}, LLr2$b;-><init>(LLr2;Lb80;)V

    iput-object v1, p0, LLr2;->q:LLr2$a;

    goto :goto_0

    :cond_0
    new-instance v1, Lxo;

    invoke-direct {v1, v0}, Lxo;-><init>(Lb80;)V

    iput-object v1, p0, LLr2;->q:LLr2$a;

    :goto_0
    return-void
.end method

.method public static s(LLr2;LrN5;LrN5;F)Lxo;
    .locals 0

    invoke-virtual {p0}, LLr2;->r()Lxo;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3}, Lxo;->j(LrN5;LrN5;F)Lxo;

    move-result-object p0

    return-object p0
.end method

.method public static x()LbU2;
    .locals 1

    sget-object v0, LLr2;->x:LbU2;

    return-object v0
.end method


# virtual methods
.method public A()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    sget-object v0, LLr2;->x:LbU2;

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_0

    iget-wide v3, v0, LbU2;->e:J

    add-long/2addr v3, v1

    iput-wide v3, v0, LbU2;->e:J

    :cond_0
    iget-object v0, p0, LLr2;->d:LLr2$a;

    invoke-interface {v0}, LLr2$a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LLr2;->n()V

    return-void

    :cond_1
    iget-boolean v0, p0, LLr2;->h:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, LLr2;->i:Z

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, LLr2;->d:LLr2$a;

    invoke-virtual {p0, v0}, LLr2;->B(LLr2$a;)V

    goto :goto_3

    :cond_3
    :goto_0
    sget-object v0, LLr2;->x:LbU2;

    if-eqz v0, :cond_4

    iget-wide v3, v0, LbU2;->q:J

    add-long/2addr v3, v1

    iput-wide v3, v0, LbU2;->q:J

    :cond_4
    const/4 v0, 0x0

    move v3, v0

    :goto_1
    iget v4, p0, LLr2;->l:I

    if-ge v3, v4, :cond_6

    iget-object v4, p0, LLr2;->g:[Lxo;

    aget-object v4, v4, v3

    iget-boolean v4, v4, Lxo;->f:Z

    if-nez v4, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_6
    const/4 v0, 0x1

    :goto_2
    if-nez v0, :cond_7

    iget-object v0, p0, LLr2;->d:LLr2$a;

    invoke-virtual {p0, v0}, LLr2;->B(LLr2$a;)V

    goto :goto_3

    :cond_7
    sget-object v0, LLr2;->x:LbU2;

    if-eqz v0, :cond_8

    iget-wide v3, v0, LbU2;->p:J

    add-long/2addr v3, v1

    iput-wide v3, v0, LbU2;->p:J

    :cond_8
    invoke-virtual {p0}, LLr2;->n()V

    :goto_3
    return-void
.end method

.method public B(LLr2$a;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    sget-object v0, LLr2;->x:LbU2;

    if-eqz v0, :cond_0

    iget-wide v1, v0, LbU2;->t:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, v0, LbU2;->t:J

    iget-wide v1, v0, LbU2;->u:J

    iget v3, p0, LLr2;->k:I

    int-to-long v3, v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    iput-wide v1, v0, LbU2;->u:J

    sget-object v0, LLr2;->x:LbU2;

    iget-wide v1, v0, LbU2;->v:J

    iget v3, p0, LLr2;->l:I

    int-to-long v3, v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    iput-wide v1, v0, LbU2;->v:J

    :cond_0
    invoke-virtual {p0, p1}, LLr2;->u(LLr2$a;)I

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LLr2;->C(LLr2$a;Z)I

    invoke-virtual {p0}, LLr2;->n()V

    return-void
.end method

.method public final C(LLr2$a;Z)I
    .locals 12

    sget-object p2, LLr2;->x:LbU2;

    const-wide/16 v0, 0x1

    if-eqz p2, :cond_0

    iget-wide v2, p2, LbU2;->h:J

    add-long/2addr v2, v0

    iput-wide v2, p2, LbU2;->h:J

    :cond_0
    const/4 p2, 0x0

    move v2, p2

    :goto_0
    iget v3, p0, LLr2;->k:I

    if-ge v2, v3, :cond_1

    iget-object v3, p0, LLr2;->j:[Z

    aput-boolean p2, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v2, p2

    move v3, v2

    :cond_2
    :goto_1
    if-nez v2, :cond_e

    sget-object v4, LLr2;->x:LbU2;

    if-eqz v4, :cond_3

    iget-wide v5, v4, LbU2;->i:J

    add-long/2addr v5, v0

    iput-wide v5, v4, LbU2;->i:J

    :cond_3
    add-int/lit8 v3, v3, 0x1

    iget v4, p0, LLr2;->k:I

    mul-int/lit8 v4, v4, 0x2

    if-lt v3, v4, :cond_4

    return v3

    :cond_4
    invoke-interface {p1}, LLr2$a;->getKey()LrN5;

    move-result-object v4

    const/4 v5, 0x1

    if-eqz v4, :cond_5

    iget-object v4, p0, LLr2;->j:[Z

    invoke-interface {p1}, LLr2$a;->getKey()LrN5;

    move-result-object v6

    iget v6, v6, LrN5;->d:I

    aput-boolean v5, v4, v6

    :cond_5
    iget-object v4, p0, LLr2;->j:[Z

    invoke-interface {p1, p0, v4}, LLr2$a;->b(LLr2;[Z)LrN5;

    move-result-object v4

    if-eqz v4, :cond_7

    iget-object v6, p0, LLr2;->j:[Z

    iget v7, v4, LrN5;->d:I

    aget-boolean v8, v6, v7

    if-eqz v8, :cond_6

    return v3

    :cond_6
    aput-boolean v5, v6, v7

    :cond_7
    if-eqz v4, :cond_d

    const/4 v5, -0x1

    const v6, 0x7f7fffff    # Float.MAX_VALUE

    move v7, p2

    move v8, v5

    :goto_2
    iget v9, p0, LLr2;->l:I

    if-ge v7, v9, :cond_b

    iget-object v9, p0, LLr2;->g:[Lxo;

    aget-object v9, v9, v7

    iget-object v10, v9, Lxo;->a:LrN5;

    iget-object v10, v10, LrN5;->k:LrN5$a;

    sget-object v11, LrN5$a;->b:LrN5$a;

    if-ne v10, v11, :cond_8

    goto :goto_3

    :cond_8
    iget-boolean v10, v9, Lxo;->f:Z

    if-eqz v10, :cond_9

    goto :goto_3

    :cond_9
    invoke-virtual {v9, v4}, Lxo;->t(LrN5;)Z

    move-result v10

    if-eqz v10, :cond_a

    iget-object v10, v9, Lxo;->e:Lxo$a;

    invoke-interface {v10, v4}, Lxo$a;->h(LrN5;)F

    move-result v10

    const/4 v11, 0x0

    cmpg-float v11, v10, v11

    if-gez v11, :cond_a

    iget v9, v9, Lxo;->b:F

    neg-float v9, v9

    div-float/2addr v9, v10

    cmpg-float v10, v9, v6

    if-gez v10, :cond_a

    move v8, v7

    move v6, v9

    :cond_a
    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_b
    if-le v8, v5, :cond_2

    iget-object v6, p0, LLr2;->g:[Lxo;

    aget-object v6, v6, v8

    iget-object v7, v6, Lxo;->a:LrN5;

    iput v5, v7, LrN5;->e:I

    sget-object v5, LLr2;->x:LbU2;

    if-eqz v5, :cond_c

    iget-wide v9, v5, LbU2;->j:J

    add-long/2addr v9, v0

    iput-wide v9, v5, LbU2;->j:J

    :cond_c
    invoke-virtual {v6, v4}, Lxo;->x(LrN5;)V

    iget-object v4, v6, Lxo;->a:LrN5;

    iput v8, v4, LrN5;->e:I

    invoke-virtual {v4, p0, v6}, LrN5;->h(LLr2;Lxo;)V

    goto/16 :goto_1

    :cond_d
    move v2, v5

    goto/16 :goto_1

    :cond_e
    return v3
.end method

.method public final D()V
    .locals 4

    sget-boolean v0, LLr2;->v:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    :goto_0
    iget v0, p0, LLr2;->l:I

    if-ge v2, v0, :cond_3

    iget-object v0, p0, LLr2;->g:[Lxo;

    aget-object v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v3, p0, LLr2;->n:Lb80;

    iget-object v3, v3, Lb80;->a:LhY3;

    invoke-interface {v3, v0}, LhY3;->b(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, LLr2;->g:[Lxo;

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget v0, p0, LLr2;->l:I

    if-ge v2, v0, :cond_3

    iget-object v0, p0, LLr2;->g:[Lxo;

    aget-object v0, v0, v2

    if-eqz v0, :cond_2

    iget-object v3, p0, LLr2;->n:Lb80;

    iget-object v3, v3, Lb80;->b:LhY3;

    invoke-interface {v3, v0}, LhY3;->b(Ljava/lang/Object;)Z

    :cond_2
    iget-object v0, p0, LLr2;->g:[Lxo;

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public E()V
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, LLr2;->n:Lb80;

    iget-object v3, v2, Lb80;->d:[LrN5;

    array-length v4, v3

    if-ge v1, v4, :cond_1

    aget-object v2, v3, v1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, LrN5;->e()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, v2, Lb80;->c:LhY3;

    iget-object v2, p0, LLr2;->o:[LrN5;

    iget v3, p0, LLr2;->p:I

    invoke-interface {v1, v2, v3}, LhY3;->c([Ljava/lang/Object;I)V

    iput v0, p0, LLr2;->p:I

    iget-object v1, p0, LLr2;->n:Lb80;

    iget-object v1, v1, Lb80;->d:[LrN5;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, LLr2;->c:Ljava/util/HashMap;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    :cond_2
    iput v0, p0, LLr2;->b:I

    iget-object v1, p0, LLr2;->d:LLr2$a;

    invoke-interface {v1}, LLr2$a;->clear()V

    const/4 v1, 0x1

    iput v1, p0, LLr2;->k:I

    move v1, v0

    :goto_1
    iget v2, p0, LLr2;->l:I

    if-ge v1, v2, :cond_4

    iget-object v2, p0, LLr2;->g:[Lxo;

    aget-object v2, v2, v1

    if-eqz v2, :cond_3

    iput-boolean v0, v2, Lxo;->c:Z

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, LLr2;->D()V

    iput v0, p0, LLr2;->l:I

    sget-boolean v0, LLr2;->v:Z

    if-eqz v0, :cond_5

    new-instance v0, LLr2$b;

    iget-object v1, p0, LLr2;->n:Lb80;

    invoke-direct {v0, p0, v1}, LLr2$b;-><init>(LLr2;Lb80;)V

    iput-object v0, p0, LLr2;->q:LLr2$a;

    goto :goto_2

    :cond_5
    new-instance v0, Lxo;

    iget-object v1, p0, LLr2;->n:Lb80;

    invoke-direct {v0, v1}, Lxo;-><init>(Lb80;)V

    iput-object v0, p0, LLr2;->q:LLr2$a;

    :goto_2
    return-void
.end method

.method public final a(LrN5$a;Ljava/lang/String;)LrN5;
    .locals 2

    iget-object v0, p0, LLr2;->n:Lb80;

    iget-object v0, v0, Lb80;->c:LhY3;

    invoke-interface {v0}, LhY3;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LrN5;

    if-nez v0, :cond_0

    new-instance v0, LrN5;

    invoke-direct {v0, p1, p2}, LrN5;-><init>(LrN5$a;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, LrN5;->g(LrN5$a;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LrN5;->e()V

    invoke-virtual {v0, p1, p2}, LrN5;->g(LrN5$a;Ljava/lang/String;)V

    :goto_0
    iget p1, p0, LLr2;->p:I

    sget p2, LLr2;->w:I

    if-lt p1, p2, :cond_1

    mul-int/lit8 p2, p2, 0x2

    sput p2, LLr2;->w:I

    iget-object p1, p0, LLr2;->o:[LrN5;

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LrN5;

    iput-object p1, p0, LLr2;->o:[LrN5;

    :cond_1
    iget-object p1, p0, LLr2;->o:[LrN5;

    iget p2, p0, LLr2;->p:I

    add-int/lit8 v1, p2, 0x1

    iput v1, p0, LLr2;->p:I

    aput-object v0, p1, p2

    return-object v0
.end method

.method public b(Liz0;Liz0;FI)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    sget-object v3, LXy0$b;->c:LXy0$b;

    invoke-virtual {v1, v3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v4

    invoke-virtual {v0, v4}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v6

    sget-object v4, LXy0$b;->d:LXy0$b;

    invoke-virtual {v1, v4}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v5

    invoke-virtual {v0, v5}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v8

    sget-object v5, LXy0$b;->e:LXy0$b;

    invoke-virtual {v1, v5}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v7

    invoke-virtual {v0, v7}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v13

    sget-object v7, LXy0$b;->f:LXy0$b;

    invoke-virtual {v1, v7}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v1

    invoke-virtual {v0, v1}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v9

    invoke-virtual {v2, v3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v1

    invoke-virtual {v0, v1}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v1

    invoke-virtual {v2, v4}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v3

    invoke-virtual {v0, v3}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v10

    invoke-virtual {v2, v5}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v3

    invoke-virtual {v0, v3}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v3

    invoke-virtual {v2, v7}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v2

    invoke-virtual {v0, v2}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, LLr2;->r()Lxo;

    move-result-object v2

    move/from16 v4, p3

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    move/from16 v7, p4

    move-object/from16 p1, v3

    move-wide/from16 p2, v4

    int-to-double v3, v7

    mul-double/2addr v14, v3

    double-to-float v12, v14

    move-object v7, v2

    invoke-virtual/range {v7 .. v12}, Lxo;->q(LrN5;LrN5;LrN5;LrN5;F)Lxo;

    invoke-virtual {v0, v2}, LLr2;->d(Lxo;)V

    invoke-virtual/range {p0 .. p0}, LLr2;->r()Lxo;

    move-result-object v2

    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    mul-double/2addr v7, v3

    double-to-float v10, v7

    move-object v5, v2

    move-object v7, v13

    move-object v8, v1

    move-object/from16 v9, p1

    invoke-virtual/range {v5 .. v10}, Lxo;->q(LrN5;LrN5;LrN5;LrN5;F)Lxo;

    invoke-virtual {v0, v2}, LLr2;->d(Lxo;)V

    return-void
.end method

.method public c(LrN5;LrN5;IFLrN5;LrN5;II)V
    .locals 11

    move-object v0, p0

    move/from16 v1, p8

    invoke-virtual {p0}, LLr2;->r()Lxo;

    move-result-object v10

    move-object v2, v10

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    invoke-virtual/range {v2 .. v9}, Lxo;->h(LrN5;LrN5;IFLrN5;LrN5;I)Lxo;

    const/16 v2, 0x8

    if-eq v1, v2, :cond_0

    invoke-virtual {v10, p0, v1}, Lxo;->d(LLr2;I)Lxo;

    :cond_0
    invoke-virtual {p0, v10}, LLr2;->d(Lxo;)V

    return-void
.end method

.method public d(Lxo;)V
    .locals 7

    if-nez p1, :cond_0

    return-void

    :cond_0
    sget-object v0, LLr2;->x:LbU2;

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_1

    iget-wide v3, v0, LbU2;->f:J

    add-long/2addr v3, v1

    iput-wide v3, v0, LbU2;->f:J

    iget-boolean v3, p1, Lxo;->f:Z

    if-eqz v3, :cond_1

    iget-wide v3, v0, LbU2;->g:J

    add-long/2addr v3, v1

    iput-wide v3, v0, LbU2;->g:J

    :cond_1
    iget v0, p0, LLr2;->l:I

    const/4 v3, 0x1

    add-int/2addr v0, v3

    iget v4, p0, LLr2;->m:I

    if-ge v0, v4, :cond_2

    iget v0, p0, LLr2;->k:I

    add-int/2addr v0, v3

    iget v4, p0, LLr2;->f:I

    if-lt v0, v4, :cond_3

    :cond_2
    invoke-virtual {p0}, LLr2;->z()V

    :cond_3
    iget-boolean v0, p1, Lxo;->f:Z

    const/4 v4, 0x0

    if-nez v0, :cond_c

    invoke-virtual {p1, p0}, Lxo;->D(LLr2;)V

    invoke-virtual {p1}, Lxo;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    :cond_4
    invoke-virtual {p1}, Lxo;->r()V

    invoke-virtual {p1, p0}, Lxo;->f(LLr2;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, LLr2;->p()LrN5;

    move-result-object v0

    iput-object v0, p1, Lxo;->a:LrN5;

    iget v5, p0, LLr2;->l:I

    invoke-virtual {p0, p1}, LLr2;->l(Lxo;)V

    iget v6, p0, LLr2;->l:I

    add-int/2addr v5, v3

    if-ne v6, v5, :cond_9

    iget-object v4, p0, LLr2;->q:LLr2$a;

    invoke-interface {v4, p1}, LLr2$a;->c(LLr2$a;)V

    iget-object v4, p0, LLr2;->q:LLr2$a;

    invoke-virtual {p0, v4, v3}, LLr2;->C(LLr2$a;Z)I

    iget v4, v0, LrN5;->e:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_a

    iget-object v4, p1, Lxo;->a:LrN5;

    if-ne v4, v0, :cond_6

    invoke-virtual {p1, v0}, Lxo;->v(LrN5;)LrN5;

    move-result-object v0

    if-eqz v0, :cond_6

    sget-object v4, LLr2;->x:LbU2;

    if-eqz v4, :cond_5

    iget-wide v5, v4, LbU2;->j:J

    add-long/2addr v5, v1

    iput-wide v5, v4, LbU2;->j:J

    :cond_5
    invoke-virtual {p1, v0}, Lxo;->x(LrN5;)V

    :cond_6
    iget-boolean v0, p1, Lxo;->f:Z

    if-nez v0, :cond_7

    iget-object v0, p1, Lxo;->a:LrN5;

    invoke-virtual {v0, p0, p1}, LrN5;->h(LLr2;Lxo;)V

    :cond_7
    sget-boolean v0, LLr2;->v:Z

    if-eqz v0, :cond_8

    iget-object v0, p0, LLr2;->n:Lb80;

    iget-object v0, v0, Lb80;->a:LhY3;

    invoke-interface {v0, p1}, LhY3;->b(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_8
    iget-object v0, p0, LLr2;->n:Lb80;

    iget-object v0, v0, Lb80;->b:LhY3;

    invoke-interface {v0, p1}, LhY3;->b(Ljava/lang/Object;)Z

    :goto_0
    iget v0, p0, LLr2;->l:I

    sub-int/2addr v0, v3

    iput v0, p0, LLr2;->l:I

    goto :goto_1

    :cond_9
    move v3, v4

    :cond_a
    :goto_1
    invoke-virtual {p1}, Lxo;->s()Z

    move-result v0

    if-nez v0, :cond_b

    return-void

    :cond_b
    move v4, v3

    :cond_c
    if-nez v4, :cond_d

    invoke-virtual {p0, p1}, LLr2;->l(Lxo;)V

    :cond_d
    return-void
.end method

.method public e(LrN5;LrN5;II)Lxo;
    .locals 3

    sget-boolean v0, LLr2;->s:Z

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    if-ne p4, v1, :cond_0

    iget-boolean v0, p2, LrN5;->h:Z

    if-eqz v0, :cond_0

    iget v0, p1, LrN5;->e:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    iget p2, p2, LrN5;->g:F

    int-to-float p3, p3

    add-float/2addr p2, p3

    invoke-virtual {p1, p0, p2}, LrN5;->f(LLr2;F)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0}, LLr2;->r()Lxo;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lxo;->n(LrN5;LrN5;I)Lxo;

    if-eq p4, v1, :cond_1

    invoke-virtual {v0, p0, p4}, Lxo;->d(LLr2;I)Lxo;

    :cond_1
    invoke-virtual {p0, v0}, LLr2;->d(Lxo;)V

    return-object v0
.end method

.method public f(LrN5;I)V
    .locals 5

    sget-boolean v0, LLr2;->s:Z

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iget v0, p1, LrN5;->e:I

    if-ne v0, v1, :cond_2

    int-to-float p2, p2

    invoke-virtual {p1, p0, p2}, LrN5;->f(LLr2;F)V

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, LLr2;->b:I

    add-int/2addr v1, v2

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LLr2;->n:Lb80;

    iget-object v1, v1, Lb80;->d:[LrN5;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    iget-boolean v3, v1, LrN5;->o:Z

    if-eqz v3, :cond_0

    iget v3, v1, LrN5;->p:I

    iget v4, p1, LrN5;->d:I

    if-ne v3, v4, :cond_0

    iget v3, v1, LrN5;->q:F

    add-float/2addr v3, p2

    invoke-virtual {v1, p0, v3}, LrN5;->f(LLr2;F)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    iget v0, p1, LrN5;->e:I

    if-eq v0, v1, :cond_5

    iget-object v1, p0, LLr2;->g:[Lxo;

    aget-object v0, v1, v0

    iget-boolean v1, v0, Lxo;->f:Z

    if-eqz v1, :cond_3

    int-to-float p1, p2

    iput p1, v0, Lxo;->b:F

    goto :goto_1

    :cond_3
    iget-object v1, v0, Lxo;->e:Lxo$a;

    invoke-interface {v1}, Lxo$a;->i()I

    move-result v1

    if-nez v1, :cond_4

    iput-boolean v2, v0, Lxo;->f:Z

    int-to-float p1, p2

    iput p1, v0, Lxo;->b:F

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, LLr2;->r()Lxo;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lxo;->m(LrN5;I)Lxo;

    invoke-virtual {p0, v0}, LLr2;->d(Lxo;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, LLr2;->r()Lxo;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lxo;->i(LrN5;I)Lxo;

    invoke-virtual {p0, v0}, LLr2;->d(Lxo;)V

    :goto_1
    return-void
.end method

.method public g(LrN5;LrN5;IZ)V
    .locals 2

    invoke-virtual {p0}, LLr2;->r()Lxo;

    move-result-object p4

    invoke-virtual {p0}, LLr2;->t()LrN5;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, LrN5;->f:I

    invoke-virtual {p4, p1, p2, v0, p3}, Lxo;->o(LrN5;LrN5;LrN5;I)Lxo;

    invoke-virtual {p0, p4}, LLr2;->d(Lxo;)V

    return-void
.end method

.method public h(LrN5;LrN5;II)V
    .locals 3

    invoke-virtual {p0}, LLr2;->r()Lxo;

    move-result-object v0

    invoke-virtual {p0}, LLr2;->t()LrN5;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, LrN5;->f:I

    invoke-virtual {v0, p1, p2, v1, p3}, Lxo;->o(LrN5;LrN5;LrN5;I)Lxo;

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    iget-object p1, v0, Lxo;->e:Lxo$a;

    invoke-interface {p1, v1}, Lxo$a;->h(LrN5;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, v0, p1, p4}, LLr2;->m(Lxo;II)V

    :cond_0
    invoke-virtual {p0, v0}, LLr2;->d(Lxo;)V

    return-void
.end method

.method public i(LrN5;LrN5;IZ)V
    .locals 2

    invoke-virtual {p0}, LLr2;->r()Lxo;

    move-result-object p4

    invoke-virtual {p0}, LLr2;->t()LrN5;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, LrN5;->f:I

    invoke-virtual {p4, p1, p2, v0, p3}, Lxo;->p(LrN5;LrN5;LrN5;I)Lxo;

    invoke-virtual {p0, p4}, LLr2;->d(Lxo;)V

    return-void
.end method

.method public j(LrN5;LrN5;II)V
    .locals 3

    invoke-virtual {p0}, LLr2;->r()Lxo;

    move-result-object v0

    invoke-virtual {p0}, LLr2;->t()LrN5;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, LrN5;->f:I

    invoke-virtual {v0, p1, p2, v1, p3}, Lxo;->p(LrN5;LrN5;LrN5;I)Lxo;

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    iget-object p1, v0, Lxo;->e:Lxo$a;

    invoke-interface {p1, v1}, Lxo$a;->h(LrN5;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, v0, p1, p4}, LLr2;->m(Lxo;II)V

    :cond_0
    invoke-virtual {p0, v0}, LLr2;->d(Lxo;)V

    return-void
.end method

.method public k(LrN5;LrN5;LrN5;LrN5;FI)V
    .locals 7

    invoke-virtual {p0}, LLr2;->r()Lxo;

    move-result-object v6

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lxo;->k(LrN5;LrN5;LrN5;LrN5;F)Lxo;

    const/16 p1, 0x8

    if-eq p6, p1, :cond_0

    invoke-virtual {v6, p0, p6}, Lxo;->d(LLr2;I)Lxo;

    :cond_0
    invoke-virtual {p0, v6}, LLr2;->d(Lxo;)V

    return-void
.end method

.method public final l(Lxo;)V
    .locals 7

    sget-boolean v0, LLr2;->t:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Lxo;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lxo;->a:LrN5;

    iget p1, p1, Lxo;->b:F

    invoke-virtual {v0, p0, p1}, LrN5;->f(LLr2;F)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LLr2;->g:[Lxo;

    iget v1, p0, LLr2;->l:I

    aput-object p1, v0, v1

    iget-object v0, p1, Lxo;->a:LrN5;

    iput v1, v0, LrN5;->e:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LLr2;->l:I

    invoke-virtual {v0, p0, p1}, LrN5;->h(LLr2;Lxo;)V

    :goto_0
    sget-boolean p1, LLr2;->t:Z

    if-eqz p1, :cond_8

    iget-boolean p1, p0, LLr2;->a:Z

    if-eqz p1, :cond_8

    const/4 p1, 0x0

    move v0, p1

    :goto_1
    iget v1, p0, LLr2;->l:I

    if-ge v0, v1, :cond_7

    iget-object v1, p0, LLr2;->g:[Lxo;

    aget-object v1, v1, v0

    if-nez v1, :cond_1

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "WTF"

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_1
    iget-object v1, p0, LLr2;->g:[Lxo;

    aget-object v1, v1, v0

    if-eqz v1, :cond_6

    iget-boolean v2, v1, Lxo;->f:Z

    if-eqz v2, :cond_6

    iget-object v2, v1, Lxo;->a:LrN5;

    iget v3, v1, Lxo;->b:F

    invoke-virtual {v2, p0, v3}, LrN5;->f(LLr2;F)V

    sget-boolean v2, LLr2;->v:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, LLr2;->n:Lb80;

    iget-object v2, v2, Lb80;->a:LhY3;

    invoke-interface {v2, v1}, LhY3;->b(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    iget-object v2, p0, LLr2;->n:Lb80;

    iget-object v2, v2, Lb80;->b:LhY3;

    invoke-interface {v2, v1}, LhY3;->b(Ljava/lang/Object;)Z

    :goto_2
    iget-object v1, p0, LLr2;->g:[Lxo;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    add-int/lit8 v1, v0, 0x1

    move v3, v1

    :goto_3
    iget v4, p0, LLr2;->l:I

    if-ge v1, v4, :cond_4

    iget-object v3, p0, LLr2;->g:[Lxo;

    add-int/lit8 v4, v1, -0x1

    aget-object v5, v3, v1

    aput-object v5, v3, v4

    iget-object v3, v5, Lxo;->a:LrN5;

    iget v5, v3, LrN5;->e:I

    if-ne v5, v1, :cond_3

    iput v4, v3, LrN5;->e:I

    :cond_3
    add-int/lit8 v3, v1, 0x1

    move v6, v3

    move v3, v1

    move v1, v6

    goto :goto_3

    :cond_4
    if-ge v3, v4, :cond_5

    iget-object v1, p0, LLr2;->g:[Lxo;

    aput-object v2, v1, v3

    :cond_5
    add-int/lit8 v4, v4, -0x1

    iput v4, p0, LLr2;->l:I

    add-int/lit8 v0, v0, -0x1

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    iput-boolean p1, p0, LLr2;->a:Z

    :cond_8
    return-void
.end method

.method public m(Lxo;II)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p3, v0}, LLr2;->o(ILjava/lang/String;)LrN5;

    move-result-object p3

    invoke-virtual {p1, p3, p2}, Lxo;->e(LrN5;I)Lxo;

    return-void
.end method

.method public final n()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, LLr2;->l:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LLr2;->g:[Lxo;

    aget-object v1, v1, v0

    iget-object v2, v1, Lxo;->a:LrN5;

    iget v1, v1, Lxo;->b:F

    iput v1, v2, LrN5;->g:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public o(ILjava/lang/String;)LrN5;
    .locals 5

    sget-object v0, LLr2;->x:LbU2;

    if-eqz v0, :cond_0

    iget-wide v1, v0, LbU2;->l:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, v0, LbU2;->l:J

    :cond_0
    iget v0, p0, LLr2;->k:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, LLr2;->f:I

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, LLr2;->z()V

    :cond_1
    sget-object v0, LrN5$a;->e:LrN5$a;

    invoke-virtual {p0, v0, p2}, LLr2;->a(LrN5$a;Ljava/lang/String;)LrN5;

    move-result-object p2

    iget v0, p0, LLr2;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LLr2;->b:I

    iget v1, p0, LLr2;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LLr2;->k:I

    iput v0, p2, LrN5;->d:I

    iput p1, p2, LrN5;->f:I

    iget-object p1, p0, LLr2;->n:Lb80;

    iget-object p1, p1, Lb80;->d:[LrN5;

    aput-object p2, p1, v0

    iget-object p1, p0, LLr2;->d:LLr2$a;

    invoke-interface {p1, p2}, LLr2$a;->a(LrN5;)V

    return-object p2
.end method

.method public p()LrN5;
    .locals 5

    sget-object v0, LLr2;->x:LbU2;

    if-eqz v0, :cond_0

    iget-wide v1, v0, LbU2;->n:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, v0, LbU2;->n:J

    :cond_0
    iget v0, p0, LLr2;->k:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, LLr2;->f:I

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, LLr2;->z()V

    :cond_1
    sget-object v0, LrN5$a;->d:LrN5$a;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, LLr2;->a(LrN5$a;Ljava/lang/String;)LrN5;

    move-result-object v0

    iget v1, p0, LLr2;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LLr2;->b:I

    iget v2, p0, LLr2;->k:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, LLr2;->k:I

    iput v1, v0, LrN5;->d:I

    iget-object v2, p0, LLr2;->n:Lb80;

    iget-object v2, v2, Lb80;->d:[LrN5;

    aput-object v0, v2, v1

    return-object v0
.end method

.method public q(Ljava/lang/Object;)LrN5;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget v1, p0, LLr2;->k:I

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, LLr2;->f:I

    if-lt v1, v2, :cond_1

    invoke-virtual {p0}, LLr2;->z()V

    :cond_1
    instance-of v1, p1, LXy0;

    if-eqz v1, :cond_5

    check-cast p1, LXy0;

    invoke-virtual {p1}, LXy0;->i()LrN5;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, LLr2;->n:Lb80;

    invoke-virtual {p1, v0}, LXy0;->s(Lb80;)V

    invoke-virtual {p1}, LXy0;->i()LrN5;

    move-result-object p1

    move-object v0, p1

    :cond_2
    iget p1, v0, LrN5;->d:I

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    iget v2, p0, LLr2;->b:I

    if-gt p1, v2, :cond_3

    iget-object v2, p0, LLr2;->n:Lb80;

    iget-object v2, v2, Lb80;->d:[LrN5;

    aget-object v2, v2, p1

    if-nez v2, :cond_5

    :cond_3
    if-eq p1, v1, :cond_4

    invoke-virtual {v0}, LrN5;->e()V

    :cond_4
    iget p1, p0, LLr2;->b:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LLr2;->b:I

    iget v1, p0, LLr2;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LLr2;->k:I

    iput p1, v0, LrN5;->d:I

    sget-object v1, LrN5$a;->b:LrN5$a;

    iput-object v1, v0, LrN5;->k:LrN5$a;

    iget-object v1, p0, LLr2;->n:Lb80;

    iget-object v1, v1, Lb80;->d:[LrN5;

    aput-object v0, v1, p1

    :cond_5
    return-object v0
.end method

.method public r()Lxo;
    .locals 5

    sget-boolean v0, LLr2;->v:Z

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, LLr2;->n:Lb80;

    iget-object v0, v0, Lb80;->a:LhY3;

    invoke-interface {v0}, LhY3;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxo;

    if-nez v0, :cond_0

    new-instance v0, LLr2$b;

    iget-object v3, p0, LLr2;->n:Lb80;

    invoke-direct {v0, p0, v3}, LLr2$b;-><init>(LLr2;Lb80;)V

    sget-wide v3, LLr2;->z:J

    add-long/2addr v3, v1

    sput-wide v3, LLr2;->z:J

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lxo;->y()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LLr2;->n:Lb80;

    iget-object v0, v0, Lb80;->b:LhY3;

    invoke-interface {v0}, LhY3;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxo;

    if-nez v0, :cond_2

    new-instance v0, Lxo;

    iget-object v3, p0, LLr2;->n:Lb80;

    invoke-direct {v0, v3}, Lxo;-><init>(Lb80;)V

    sget-wide v3, LLr2;->y:J

    add-long/2addr v3, v1

    sput-wide v3, LLr2;->y:J

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lxo;->y()V

    :goto_0
    invoke-static {}, LrN5;->c()V

    return-object v0
.end method

.method public t()LrN5;
    .locals 5

    sget-object v0, LLr2;->x:LbU2;

    if-eqz v0, :cond_0

    iget-wide v1, v0, LbU2;->m:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, v0, LbU2;->m:J

    :cond_0
    iget v0, p0, LLr2;->k:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, LLr2;->f:I

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, LLr2;->z()V

    :cond_1
    sget-object v0, LrN5$a;->d:LrN5$a;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, LLr2;->a(LrN5$a;Ljava/lang/String;)LrN5;

    move-result-object v0

    iget v1, p0, LLr2;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LLr2;->b:I

    iget v2, p0, LLr2;->k:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, LLr2;->k:I

    iput v1, v0, LrN5;->d:I

    iget-object v2, p0, LLr2;->n:Lb80;

    iget-object v2, v2, Lb80;->d:[LrN5;

    aput-object v0, v2, v1

    return-object v0
.end method

.method public final u(LLr2$a;)I
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v0, p0

    const/4 v2, 0x0

    :goto_0
    iget v3, v0, LLr2;->l:I

    const/4 v4, 0x0

    if-ge v2, v3, :cond_2

    iget-object v3, v0, LLr2;->g:[Lxo;

    aget-object v3, v3, v2

    iget-object v6, v3, Lxo;->a:LrN5;

    iget-object v6, v6, LrN5;->k:LrN5$a;

    sget-object v7, LrN5$a;->b:LrN5$a;

    if-ne v6, v7, :cond_0

    goto :goto_1

    :cond_0
    iget v3, v3, Lxo;->b:F

    cmpg-float v3, v3, v4

    if-gez v3, :cond_1

    const/4 v2, 0x1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_17

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_3
    :goto_3
    if-nez v2, :cond_16

    sget-object v6, LLr2;->x:LbU2;

    const-wide/16 v7, 0x1

    if-eqz v6, :cond_4

    iget-wide v9, v6, LbU2;->k:J

    add-long/2addr v9, v7

    iput-wide v9, v6, LbU2;->k:J

    :cond_4
    add-int/lit8 v3, v3, 0x1

    const v9, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v10, 0x0

    const/4 v11, -0x1

    const/4 v12, -0x1

    const/4 v13, 0x0

    :goto_4
    iget v14, v0, LLr2;->l:I

    if-ge v10, v14, :cond_13

    iget-object v14, v0, LLr2;->g:[Lxo;

    aget-object v14, v14, v10

    iget-object v15, v14, Lxo;->a:LrN5;

    iget-object v15, v15, LrN5;->k:LrN5$a;

    sget-object v1, LrN5$a;->b:LrN5$a;

    if-ne v15, v1, :cond_5

    goto/16 :goto_b

    :cond_5
    iget-boolean v1, v14, Lxo;->f:Z

    if-eqz v1, :cond_6

    goto/16 :goto_b

    :cond_6
    iget v1, v14, Lxo;->b:F

    cmpg-float v1, v1, v4

    if-gez v1, :cond_12

    sget-boolean v1, LLr2;->u:Z

    const/16 v15, 0x9

    if-eqz v1, :cond_c

    iget-object v1, v14, Lxo;->e:Lxo$a;

    invoke-interface {v1}, Lxo$a;->i()I

    move-result v1

    const/4 v5, 0x0

    :goto_5
    if-ge v5, v1, :cond_12

    iget-object v7, v14, Lxo;->e:Lxo$a;

    invoke-interface {v7, v5}, Lxo$a;->b(I)LrN5;

    move-result-object v7

    iget-object v8, v14, Lxo;->e:Lxo$a;

    invoke-interface {v8, v7}, Lxo$a;->h(LrN5;)F

    move-result v8

    cmpg-float v16, v8, v4

    if-gtz v16, :cond_7

    goto :goto_7

    :cond_7
    const/4 v6, 0x0

    :goto_6
    if-ge v6, v15, :cond_b

    iget-object v15, v7, LrN5;->i:[F

    aget v15, v15, v6

    div-float/2addr v15, v8

    cmpg-float v18, v15, v9

    if-gez v18, :cond_8

    if-eq v6, v13, :cond_9

    :cond_8
    if-le v6, v13, :cond_a

    :cond_9
    iget v12, v7, LrN5;->d:I

    move v13, v6

    move v11, v10

    move v9, v15

    :cond_a
    add-int/lit8 v6, v6, 0x1

    const/16 v15, 0x9

    goto :goto_6

    :cond_b
    :goto_7
    add-int/lit8 v5, v5, 0x1

    const-wide/16 v7, 0x1

    const/16 v15, 0x9

    goto :goto_5

    :cond_c
    const/4 v1, 0x1

    :goto_8
    iget v5, v0, LLr2;->k:I

    if-ge v1, v5, :cond_12

    iget-object v5, v0, LLr2;->n:Lb80;

    iget-object v5, v5, Lb80;->d:[LrN5;

    aget-object v5, v5, v1

    iget-object v6, v14, Lxo;->e:Lxo$a;

    invoke-interface {v6, v5}, Lxo$a;->h(LrN5;)F

    move-result v6

    cmpg-float v7, v6, v4

    if-gtz v7, :cond_d

    const/16 v8, 0x9

    goto :goto_a

    :cond_d
    const/4 v7, 0x0

    const/16 v8, 0x9

    :goto_9
    if-ge v7, v8, :cond_11

    iget-object v15, v5, LrN5;->i:[F

    aget v15, v15, v7

    div-float/2addr v15, v6

    cmpg-float v17, v15, v9

    if-gez v17, :cond_e

    if-eq v7, v13, :cond_f

    :cond_e
    if-le v7, v13, :cond_10

    :cond_f
    move v12, v1

    move v13, v7

    move v11, v10

    move v9, v15

    :cond_10
    add-int/lit8 v7, v7, 0x1

    goto :goto_9

    :cond_11
    :goto_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_12
    :goto_b
    add-int/lit8 v10, v10, 0x1

    const-wide/16 v7, 0x1

    goto/16 :goto_4

    :cond_13
    const/4 v1, -0x1

    if-eq v11, v1, :cond_15

    iget-object v5, v0, LLr2;->g:[Lxo;

    aget-object v5, v5, v11

    iget-object v6, v5, Lxo;->a:LrN5;

    iput v1, v6, LrN5;->e:I

    sget-object v1, LLr2;->x:LbU2;

    if-eqz v1, :cond_14

    iget-wide v6, v1, LbU2;->j:J

    const-wide/16 v8, 0x1

    add-long/2addr v6, v8

    iput-wide v6, v1, LbU2;->j:J

    :cond_14
    iget-object v1, v0, LLr2;->n:Lb80;

    iget-object v1, v1, Lb80;->d:[LrN5;

    aget-object v1, v1, v12

    invoke-virtual {v5, v1}, Lxo;->x(LrN5;)V

    iget-object v1, v5, Lxo;->a:LrN5;

    iput v11, v1, LrN5;->e:I

    invoke-virtual {v1, v0, v5}, LrN5;->h(LLr2;Lxo;)V

    goto :goto_c

    :cond_15
    const/4 v2, 0x1

    :goto_c
    iget v1, v0, LLr2;->k:I

    div-int/lit8 v1, v1, 0x2

    if-le v3, v1, :cond_3

    const/4 v2, 0x1

    goto/16 :goto_3

    :cond_16
    move v1, v3

    goto :goto_d

    :cond_17
    const/4 v1, 0x0

    :goto_d
    return v1
.end method

.method public v(LbU2;)V
    .locals 0

    sput-object p1, LLr2;->x:LbU2;

    return-void
.end method

.method public w()Lb80;
    .locals 1

    iget-object v0, p0, LLr2;->n:Lb80;

    return-object v0
.end method

.method public y(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, LXy0;

    invoke-virtual {p1}, LXy0;->i()LrN5;

    move-result-object p1

    if-eqz p1, :cond_0

    iget p1, p1, LrN5;->g:F

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final z()V
    .locals 6

    iget v0, p0, LLr2;->e:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, LLr2;->e:I

    iget-object v1, p0, LLr2;->g:[Lxo;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxo;

    iput-object v0, p0, LLr2;->g:[Lxo;

    iget-object v0, p0, LLr2;->n:Lb80;

    iget-object v1, v0, Lb80;->d:[LrN5;

    iget v2, p0, LLr2;->e:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [LrN5;

    iput-object v1, v0, Lb80;->d:[LrN5;

    iget v0, p0, LLr2;->e:I

    new-array v1, v0, [Z

    iput-object v1, p0, LLr2;->j:[Z

    iput v0, p0, LLr2;->f:I

    iput v0, p0, LLr2;->m:I

    sget-object v1, LLr2;->x:LbU2;

    if-eqz v1, :cond_0

    iget-wide v2, v1, LbU2;->d:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, v1, LbU2;->d:J

    iget-wide v2, v1, LbU2;->o:J

    int-to-long v4, v0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, v1, LbU2;->o:J

    sget-object v0, LLr2;->x:LbU2;

    iget-wide v1, v0, LbU2;->o:J

    iput-wide v1, v0, LbU2;->y:J

    :cond_0
    return-void
.end method
