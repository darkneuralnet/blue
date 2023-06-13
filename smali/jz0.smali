.class public Ljz0;
.super LcB6;
.source "SourceFile"


# instance fields
.field public A1:LOE$a;

.field public W0:LOE;

.field public X0:Lo01;

.field public Y0:I

.field public Z0:LOE$b;

.field public a1:Z

.field public b1:LbU2;

.field public c1:LLr2;

.field public d1:I

.field public e1:I

.field public f1:I

.field public g1:I

.field public h1:I

.field public i1:I

.field public j1:[Lnh0;

.field public k1:[Lnh0;

.field public l1:Z

.field public m1:Z

.field public n1:Z

.field public o1:I

.field public p1:I

.field public q1:I

.field public r1:Z

.field public s1:Z

.field public t1:Z

.field public u1:I

.field public v1:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "LXy0;",
            ">;"
        }
    .end annotation
.end field

.field public w1:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "LXy0;",
            ">;"
        }
    .end annotation
.end field

.field public x1:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "LXy0;",
            ">;"
        }
    .end annotation
.end field

.field public y1:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "LXy0;",
            ">;"
        }
    .end annotation
.end field

.field public z1:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Liz0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, LcB6;-><init>()V

    new-instance v0, LOE;

    invoke-direct {v0, p0}, LOE;-><init>(Ljz0;)V

    iput-object v0, p0, Ljz0;->W0:LOE;

    new-instance v0, Lo01;

    invoke-direct {v0, p0}, Lo01;-><init>(Ljz0;)V

    iput-object v0, p0, Ljz0;->X0:Lo01;

    const/4 v0, 0x0

    iput-object v0, p0, Ljz0;->Z0:LOE$b;

    const/4 v1, 0x0

    iput-boolean v1, p0, Ljz0;->a1:Z

    new-instance v2, LLr2;

    invoke-direct {v2}, LLr2;-><init>()V

    iput-object v2, p0, Ljz0;->c1:LLr2;

    iput v1, p0, Ljz0;->h1:I

    iput v1, p0, Ljz0;->i1:I

    const/4 v2, 0x4

    new-array v3, v2, [Lnh0;

    iput-object v3, p0, Ljz0;->j1:[Lnh0;

    new-array v2, v2, [Lnh0;

    iput-object v2, p0, Ljz0;->k1:[Lnh0;

    iput-boolean v1, p0, Ljz0;->l1:Z

    iput-boolean v1, p0, Ljz0;->m1:Z

    iput-boolean v1, p0, Ljz0;->n1:Z

    iput v1, p0, Ljz0;->o1:I

    iput v1, p0, Ljz0;->p1:I

    const/16 v2, 0x101

    iput v2, p0, Ljz0;->q1:I

    iput-boolean v1, p0, Ljz0;->r1:Z

    iput-boolean v1, p0, Ljz0;->s1:Z

    iput-boolean v1, p0, Ljz0;->t1:Z

    iput v1, p0, Ljz0;->u1:I

    iput-object v0, p0, Ljz0;->v1:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, Ljz0;->w1:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, Ljz0;->x1:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, Ljz0;->y1:Ljava/lang/ref/WeakReference;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ljz0;->z1:Ljava/util/HashSet;

    new-instance v0, LOE$a;

    invoke-direct {v0}, LOE$a;-><init>()V

    iput-object v0, p0, Ljz0;->A1:LOE$a;

    return-void
.end method

.method public static X1(ILiz0;LOE$b;LOE$a;I)Z
    .locals 5

    const/4 p0, 0x0

    if-nez p2, :cond_0

    return p0

    :cond_0
    invoke-virtual {p1}, Liz0;->X()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_13

    instance-of v0, p1, LwE1;

    if-nez v0, :cond_13

    instance-of v0, p1, LCy;

    if-eqz v0, :cond_1

    goto/16 :goto_8

    :cond_1
    invoke-virtual {p1}, Liz0;->C()Liz0$b;

    move-result-object v0

    iput-object v0, p3, LOE$a;->a:Liz0$b;

    invoke-virtual {p1}, Liz0;->V()Liz0$b;

    move-result-object v0

    iput-object v0, p3, LOE$a;->b:Liz0$b;

    invoke-virtual {p1}, Liz0;->Y()I

    move-result v0

    iput v0, p3, LOE$a;->c:I

    invoke-virtual {p1}, Liz0;->z()I

    move-result v0

    iput v0, p3, LOE$a;->d:I

    iput-boolean p0, p3, LOE$a;->i:Z

    iput p4, p3, LOE$a;->j:I

    iget-object p4, p3, LOE$a;->a:Liz0$b;

    sget-object v0, Liz0$b;->d:Liz0$b;

    const/4 v1, 0x1

    if-ne p4, v0, :cond_2

    move p4, v1

    goto :goto_0

    :cond_2
    move p4, p0

    :goto_0
    iget-object v2, p3, LOE$a;->b:Liz0$b;

    if-ne v2, v0, :cond_3

    move v0, v1

    goto :goto_1

    :cond_3
    move v0, p0

    :goto_1
    const/4 v2, 0x0

    if-eqz p4, :cond_4

    iget v3, p1, Liz0;->f0:F

    cmpl-float v3, v3, v2

    if-lez v3, :cond_4

    move v3, v1

    goto :goto_2

    :cond_4
    move v3, p0

    :goto_2
    if-eqz v0, :cond_5

    iget v4, p1, Liz0;->f0:F

    cmpl-float v2, v4, v2

    if-lez v2, :cond_5

    move v2, v1

    goto :goto_3

    :cond_5
    move v2, p0

    :goto_3
    if-eqz p4, :cond_7

    invoke-virtual {p1, p0}, Liz0;->c0(I)Z

    move-result v4

    if-eqz v4, :cond_7

    iget v4, p1, Liz0;->w:I

    if-nez v4, :cond_7

    if-nez v3, :cond_7

    sget-object p4, Liz0$b;->c:Liz0$b;

    iput-object p4, p3, LOE$a;->a:Liz0$b;

    if-eqz v0, :cond_6

    iget p4, p1, Liz0;->x:I

    if-nez p4, :cond_6

    sget-object p4, Liz0$b;->b:Liz0$b;

    iput-object p4, p3, LOE$a;->a:Liz0$b;

    :cond_6
    move p4, p0

    :cond_7
    if-eqz v0, :cond_9

    invoke-virtual {p1, v1}, Liz0;->c0(I)Z

    move-result v4

    if-eqz v4, :cond_9

    iget v4, p1, Liz0;->x:I

    if-nez v4, :cond_9

    if-nez v2, :cond_9

    sget-object v0, Liz0$b;->c:Liz0$b;

    iput-object v0, p3, LOE$a;->b:Liz0$b;

    if-eqz p4, :cond_8

    iget v0, p1, Liz0;->w:I

    if-nez v0, :cond_8

    sget-object v0, Liz0$b;->b:Liz0$b;

    iput-object v0, p3, LOE$a;->b:Liz0$b;

    :cond_8
    move v0, p0

    :cond_9
    invoke-virtual {p1}, Liz0;->p0()Z

    move-result v4

    if-eqz v4, :cond_a

    sget-object p4, Liz0$b;->b:Liz0$b;

    iput-object p4, p3, LOE$a;->a:Liz0$b;

    move p4, p0

    :cond_a
    invoke-virtual {p1}, Liz0;->q0()Z

    move-result v4

    if-eqz v4, :cond_b

    sget-object v0, Liz0$b;->b:Liz0$b;

    iput-object v0, p3, LOE$a;->b:Liz0$b;

    move v0, p0

    :cond_b
    const/4 v4, 0x4

    if-eqz v3, :cond_e

    iget-object v3, p1, Liz0;->y:[I

    aget p0, v3, p0

    if-ne p0, v4, :cond_c

    sget-object p0, Liz0$b;->b:Liz0$b;

    iput-object p0, p3, LOE$a;->a:Liz0$b;

    goto :goto_5

    :cond_c
    if-nez v0, :cond_e

    iget-object p0, p3, LOE$a;->b:Liz0$b;

    sget-object v0, Liz0$b;->b:Liz0$b;

    if-ne p0, v0, :cond_d

    iget p0, p3, LOE$a;->d:I

    goto :goto_4

    :cond_d
    sget-object p0, Liz0$b;->c:Liz0$b;

    iput-object p0, p3, LOE$a;->a:Liz0$b;

    invoke-interface {p2, p1, p3}, LOE$b;->b(Liz0;LOE$a;)V

    iget p0, p3, LOE$a;->f:I

    :goto_4
    iput-object v0, p3, LOE$a;->a:Liz0$b;

    invoke-virtual {p1}, Liz0;->x()F

    move-result v0

    int-to-float p0, p0

    mul-float/2addr v0, p0

    float-to-int p0, v0

    iput p0, p3, LOE$a;->c:I

    :cond_e
    :goto_5
    if-eqz v2, :cond_12

    iget-object p0, p1, Liz0;->y:[I

    aget p0, p0, v1

    if-ne p0, v4, :cond_f

    sget-object p0, Liz0$b;->b:Liz0$b;

    iput-object p0, p3, LOE$a;->b:Liz0$b;

    goto :goto_7

    :cond_f
    if-nez p4, :cond_12

    iget-object p0, p3, LOE$a;->a:Liz0$b;

    sget-object p4, Liz0$b;->b:Liz0$b;

    if-ne p0, p4, :cond_10

    iget p0, p3, LOE$a;->c:I

    goto :goto_6

    :cond_10
    sget-object p0, Liz0$b;->c:Liz0$b;

    iput-object p0, p3, LOE$a;->b:Liz0$b;

    invoke-interface {p2, p1, p3}, LOE$b;->b(Liz0;LOE$a;)V

    iget p0, p3, LOE$a;->e:I

    :goto_6
    iput-object p4, p3, LOE$a;->b:Liz0$b;

    invoke-virtual {p1}, Liz0;->y()I

    move-result p4

    const/4 v0, -0x1

    if-ne p4, v0, :cond_11

    int-to-float p0, p0

    invoke-virtual {p1}, Liz0;->x()F

    move-result p4

    div-float/2addr p0, p4

    float-to-int p0, p0

    iput p0, p3, LOE$a;->d:I

    goto :goto_7

    :cond_11
    invoke-virtual {p1}, Liz0;->x()F

    move-result p4

    int-to-float p0, p0

    mul-float/2addr p4, p0

    float-to-int p0, p4

    iput p0, p3, LOE$a;->d:I

    :cond_12
    :goto_7
    invoke-interface {p2, p1, p3}, LOE$b;->b(Liz0;LOE$a;)V

    iget p0, p3, LOE$a;->e:I

    invoke-virtual {p1, p0}, Liz0;->o1(I)V

    iget p0, p3, LOE$a;->f:I

    invoke-virtual {p1, p0}, Liz0;->P0(I)V

    iget-boolean p0, p3, LOE$a;->h:Z

    invoke-virtual {p1, p0}, Liz0;->O0(Z)V

    iget p0, p3, LOE$a;->g:I

    invoke-virtual {p1, p0}, Liz0;->E0(I)V

    sget p0, LOE$a;->k:I

    iput p0, p3, LOE$a;->j:I

    iget-boolean p0, p3, LOE$a;->i:Z

    return p0

    :cond_13
    :goto_8
    iput p0, p3, LOE$a;->e:I

    iput p0, p3, LOE$a;->f:I

    return p0
.end method


# virtual methods
.method public A1(LLr2;)Z
    .locals 12

    const/16 v0, 0x40

    invoke-virtual {p0, v0}, Ljz0;->Y1(I)Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Liz0;->g(LLr2;Z)V

    iget-object v1, p0, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    const/4 v5, 0x1

    if-ge v3, v1, :cond_1

    iget-object v6, p0, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Liz0;

    invoke-virtual {v6, v2, v2}, Liz0;->W0(IZ)V

    invoke-virtual {v6, v5, v2}, Liz0;->W0(IZ)V

    instance-of v6, v6, LCy;

    if-eqz v6, :cond_0

    move v4, v5

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-eqz v4, :cond_3

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_3

    iget-object v4, p0, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Liz0;

    instance-of v6, v4, LCy;

    if-eqz v6, :cond_2

    check-cast v4, LCy;

    invoke-virtual {v4}, LCy;->C1()V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    iget-object v3, p0, Ljz0;->z1:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->clear()V

    move v3, v2

    :goto_2
    if-ge v3, v1, :cond_6

    iget-object v4, p0, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Liz0;

    invoke-virtual {v4}, Liz0;->f()Z

    move-result v6

    if-eqz v6, :cond_5

    instance-of v6, v4, Lzu6;

    if-eqz v6, :cond_4

    iget-object v6, p0, Ljz0;->z1:Ljava/util/HashSet;

    invoke-virtual {v6, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {v4, p1, v0}, Liz0;->g(LLr2;Z)V

    :cond_5
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    :goto_4
    iget-object v3, p0, Ljz0;->z1:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    move-result v3

    if-lez v3, :cond_a

    iget-object v3, p0, Ljz0;->z1:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    move-result v3

    iget-object v4, p0, Ljz0;->z1:Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Liz0;

    check-cast v6, Lzu6;

    iget-object v7, p0, Ljz0;->z1:Ljava/util/HashSet;

    invoke-virtual {v6, v7}, Lzu6;->z1(Ljava/util/HashSet;)Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-virtual {v6, p1, v0}, Liz0;->g(LLr2;Z)V

    iget-object v4, p0, Ljz0;->z1:Ljava/util/HashSet;

    invoke-virtual {v4, v6}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :cond_8
    iget-object v4, p0, Ljz0;->z1:Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/util/HashSet;->size()I

    move-result v4

    if-ne v3, v4, :cond_6

    iget-object v3, p0, Ljz0;->z1:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Liz0;

    invoke-virtual {v4, p1, v0}, Liz0;->g(LLr2;Z)V

    goto :goto_5

    :cond_9
    iget-object v3, p0, Ljz0;->z1:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->clear()V

    goto :goto_4

    :cond_a
    sget-boolean v3, LLr2;->r:Z

    if-eqz v3, :cond_e

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    move v4, v2

    :goto_6
    if-ge v4, v1, :cond_c

    iget-object v6, p0, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Liz0;

    invoke-virtual {v6}, Liz0;->f()Z

    move-result v7

    if-nez v7, :cond_b

    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_b
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_c
    invoke-virtual {p0}, Liz0;->C()Liz0$b;

    move-result-object v1

    sget-object v4, Liz0$b;->c:Liz0$b;

    if-ne v1, v4, :cond_d

    move v10, v2

    goto :goto_7

    :cond_d
    move v10, v5

    :goto_7
    const/4 v11, 0x0

    move-object v6, p0

    move-object v7, p0

    move-object v8, p1

    move-object v9, v3

    invoke-virtual/range {v6 .. v11}, Liz0;->e(Ljz0;LLr2;Ljava/util/HashSet;IZ)V

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Liz0;

    invoke-static {p0, p1, v3}, Lhy3;->a(Ljz0;LLr2;Liz0;)V

    invoke-virtual {v3, p1, v0}, Liz0;->g(LLr2;Z)V

    goto :goto_8

    :cond_e
    move v3, v2

    :goto_9
    if-ge v3, v1, :cond_14

    iget-object v4, p0, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Liz0;

    instance-of v6, v4, Ljz0;

    if-eqz v6, :cond_12

    iget-object v6, v4, Liz0;->b0:[Liz0$b;

    aget-object v7, v6, v2

    aget-object v6, v6, v5

    sget-object v8, Liz0$b;->c:Liz0$b;

    if-ne v7, v8, :cond_f

    sget-object v9, Liz0$b;->b:Liz0$b;

    invoke-virtual {v4, v9}, Liz0;->T0(Liz0$b;)V

    :cond_f
    if-ne v6, v8, :cond_10

    sget-object v9, Liz0$b;->b:Liz0$b;

    invoke-virtual {v4, v9}, Liz0;->k1(Liz0$b;)V

    :cond_10
    invoke-virtual {v4, p1, v0}, Liz0;->g(LLr2;Z)V

    if-ne v7, v8, :cond_11

    invoke-virtual {v4, v7}, Liz0;->T0(Liz0$b;)V

    :cond_11
    if-ne v6, v8, :cond_13

    invoke-virtual {v4, v6}, Liz0;->k1(Liz0$b;)V

    goto :goto_a

    :cond_12
    invoke-static {p0, p1, v4}, Lhy3;->a(Ljz0;LLr2;Liz0;)V

    invoke-virtual {v4}, Liz0;->f()Z

    move-result v6

    if-nez v6, :cond_13

    invoke-virtual {v4, p1, v0}, Liz0;->g(LLr2;Z)V

    :cond_13
    :goto_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_14
    iget v0, p0, Ljz0;->h1:I

    const/4 v1, 0x0

    if-lez v0, :cond_15

    invoke-static {p0, p1, v1, v2}, Lmh0;->b(Ljz0;LLr2;Ljava/util/ArrayList;I)V

    :cond_15
    iget v0, p0, Ljz0;->i1:I

    if-lez v0, :cond_16

    invoke-static {p0, p1, v1, v5}, Lmh0;->b(Ljz0;LLr2;Ljava/util/ArrayList;I)V

    :cond_16
    return v5
.end method

.method public final B1(Liz0;)V
    .locals 5

    iget v0, p0, Ljz0;->h1:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Ljz0;->k1:[Lnh0;

    array-length v2, v1

    if-lt v0, v2, :cond_0

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnh0;

    iput-object v0, p0, Ljz0;->k1:[Lnh0;

    :cond_0
    iget-object v0, p0, Ljz0;->k1:[Lnh0;

    iget v1, p0, Ljz0;->h1:I

    new-instance v2, Lnh0;

    const/4 v3, 0x0

    invoke-virtual {p0}, Ljz0;->U1()Z

    move-result v4

    invoke-direct {v2, p1, v3, v4}, Lnh0;-><init>(Liz0;IZ)V

    aput-object v2, v0, v1

    iget p1, p0, Ljz0;->h1:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljz0;->h1:I

    return-void
.end method

.method public C1(LXy0;)V
    .locals 2

    iget-object v0, p0, Ljz0;->y1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LXy0;->e()I

    move-result v0

    iget-object v1, p0, Ljz0;->y1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LXy0;

    invoke-virtual {v1}, LXy0;->e()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ljz0;->y1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public D1(LXy0;)V
    .locals 2

    iget-object v0, p0, Ljz0;->w1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LXy0;->e()I

    move-result v0

    iget-object v1, p0, Ljz0;->w1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LXy0;

    invoke-virtual {v1}, LXy0;->e()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ljz0;->w1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public final E1(LXy0;LrN5;)V
    .locals 3

    iget-object v0, p0, Ljz0;->c1:LLr2;

    invoke-virtual {v0, p1}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object p1

    iget-object v0, p0, Ljz0;->c1:LLr2;

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-virtual {v0, p2, p1, v1, v2}, LLr2;->h(LrN5;LrN5;II)V

    return-void
.end method

.method public final F1(LXy0;LrN5;)V
    .locals 3

    iget-object v0, p0, Ljz0;->c1:LLr2;

    invoke-virtual {v0, p1}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object p1

    iget-object v0, p0, Ljz0;->c1:LLr2;

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-virtual {v0, p1, p2, v1, v2}, LLr2;->h(LrN5;LrN5;II)V

    return-void
.end method

.method public final G1(Liz0;)V
    .locals 5

    iget v0, p0, Ljz0;->i1:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Ljz0;->j1:[Lnh0;

    array-length v3, v2

    if-lt v0, v3, :cond_0

    array-length v0, v2

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnh0;

    iput-object v0, p0, Ljz0;->j1:[Lnh0;

    :cond_0
    iget-object v0, p0, Ljz0;->j1:[Lnh0;

    iget v2, p0, Ljz0;->i1:I

    new-instance v3, Lnh0;

    invoke-virtual {p0}, Ljz0;->U1()Z

    move-result v4

    invoke-direct {v3, p1, v1, v4}, Lnh0;-><init>(Liz0;IZ)V

    aput-object v3, v0, v2

    iget p1, p0, Ljz0;->i1:I

    add-int/2addr p1, v1

    iput p1, p0, Ljz0;->i1:I

    return-void
.end method

.method public H1(LXy0;)V
    .locals 2

    iget-object v0, p0, Ljz0;->x1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LXy0;->e()I

    move-result v0

    iget-object v1, p0, Ljz0;->x1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LXy0;

    invoke-virtual {v1}, LXy0;->e()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ljz0;->x1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public I1(LXy0;)V
    .locals 2

    iget-object v0, p0, Ljz0;->v1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LXy0;->e()I

    move-result v0

    iget-object v1, p0, Ljz0;->v1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LXy0;

    invoke-virtual {v1}, LXy0;->e()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ljz0;->v1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public J1(Z)Z
    .locals 1

    iget-object v0, p0, Ljz0;->X0:Lo01;

    invoke-virtual {v0, p1}, Lo01;->f(Z)Z

    move-result p1

    return p1
.end method

.method public K1(Z)Z
    .locals 1

    iget-object v0, p0, Ljz0;->X0:Lo01;

    invoke-virtual {v0, p1}, Lo01;->g(Z)Z

    move-result p1

    return p1
.end method

.method public L1(ZI)Z
    .locals 1

    iget-object v0, p0, Ljz0;->X0:Lo01;

    invoke-virtual {v0, p1, p2}, Lo01;->h(ZI)Z

    move-result p1

    return p1
.end method

.method public M1(LbU2;)V
    .locals 1

    iput-object p1, p0, Ljz0;->b1:LbU2;

    iget-object v0, p0, Ljz0;->c1:LLr2;

    invoke-virtual {v0, p1}, LLr2;->v(LbU2;)V

    return-void
.end method

.method public N1()LOE$b;
    .locals 1

    iget-object v0, p0, Ljz0;->Z0:LOE$b;

    return-object v0
.end method

.method public O1()I
    .locals 1

    iget v0, p0, Ljz0;->q1:I

    return v0
.end method

.method public P1()LLr2;
    .locals 1

    iget-object v0, p0, Ljz0;->c1:LLr2;

    return-object v0
.end method

.method public Q(Ljava/lang/StringBuilder;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Liz0;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":{\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  actualWidth:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Liz0;->d0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "  actualHeight:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Liz0;->e0:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LcB6;->v1()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Liz0;

    invoke-virtual {v1, p1}, Liz0;->Q(Ljava/lang/StringBuilder;)V

    const-string v1, ",\n"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v0, "}"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public Q1()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public R1()V
    .locals 1

    iget-object v0, p0, Ljz0;->X0:Lo01;

    invoke-virtual {v0}, Lo01;->j()V

    return-void
.end method

.method public S1()V
    .locals 1

    iget-object v0, p0, Ljz0;->X0:Lo01;

    invoke-virtual {v0}, Lo01;->k()V

    return-void
.end method

.method public T1()Z
    .locals 1

    iget-boolean v0, p0, Ljz0;->t1:Z

    return v0
.end method

.method public U1()Z
    .locals 1

    iget-boolean v0, p0, Ljz0;->a1:Z

    return v0
.end method

.method public V1()Z
    .locals 1

    iget-boolean v0, p0, Ljz0;->s1:Z

    return v0
.end method

.method public W1(IIIIIIIII)J
    .locals 12

    move-object v11, p0

    move/from16 v3, p8

    iput v3, v11, Ljz0;->d1:I

    move/from16 v4, p9

    iput v4, v11, Ljz0;->e1:I

    iget-object v0, v11, Ljz0;->W0:LOE;

    move-object v1, p0

    move v2, p1

    move v5, p2

    move v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p7

    invoke-virtual/range {v0 .. v10}, LOE;->d(Ljz0;IIIIIIIII)J

    move-result-wide v0

    return-wide v0
.end method

.method public Y1(I)Z
    .locals 1

    iget v0, p0, Ljz0;->q1:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final Z1()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ljz0;->h1:I

    iput v0, p0, Ljz0;->i1:I

    return-void
.end method

.method public a2(LOE$b;)V
    .locals 1

    iput-object p1, p0, Ljz0;->Z0:LOE$b;

    iget-object v0, p0, Ljz0;->X0:Lo01;

    invoke-virtual {v0, p1}, Lo01;->n(LOE$b;)V

    return-void
.end method

.method public b2(I)V
    .locals 0

    iput p1, p0, Ljz0;->q1:I

    const/16 p1, 0x200

    invoke-virtual {p0, p1}, Ljz0;->Y1(I)Z

    move-result p1

    sput-boolean p1, LLr2;->r:Z

    return-void
.end method

.method public c2(I)V
    .locals 0

    iput p1, p0, Ljz0;->Y0:I

    return-void
.end method

.method public d2(Z)V
    .locals 0

    iput-boolean p1, p0, Ljz0;->a1:Z

    return-void
.end method

.method public e2(LLr2;[Z)Z
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    aput-boolean v1, p2, v0

    const/16 p2, 0x40

    invoke-virtual {p0, p2}, Ljz0;->Y1(I)Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Liz0;->u1(LLr2;Z)V

    iget-object v0, p0, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v3, p0, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Liz0;

    invoke-virtual {v3, p1, p2}, Liz0;->u1(LLr2;Z)V

    invoke-virtual {v3}, Liz0;->e0()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v2, 0x1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public f2()V
    .locals 1

    iget-object v0, p0, Ljz0;->W0:LOE;

    invoke-virtual {v0, p0}, LOE;->e(Ljz0;)V

    return-void
.end method

.method public t1(ZZ)V
    .locals 3

    invoke-super {p0, p1, p2}, Liz0;->t1(ZZ)V

    iget-object v0, p0, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Liz0;

    invoke-virtual {v2, p1, p2}, Liz0;->t1(ZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public v0()V
    .locals 1

    iget-object v0, p0, Ljz0;->c1:LLr2;

    invoke-virtual {v0}, LLr2;->E()V

    const/4 v0, 0x0

    iput v0, p0, Ljz0;->d1:I

    iput v0, p0, Ljz0;->f1:I

    iput v0, p0, Ljz0;->e1:I

    iput v0, p0, Ljz0;->g1:I

    iput-boolean v0, p0, Ljz0;->r1:Z

    invoke-super {p0}, LcB6;->v0()V

    return-void
.end method

.method public w1()V
    .locals 18

    move-object/from16 v1, p0

    const/4 v2, 0x0

    iput v2, v1, Liz0;->h0:I

    iput v2, v1, Liz0;->i0:I

    iput-boolean v2, v1, Ljz0;->s1:Z

    iput-boolean v2, v1, Ljz0;->t1:Z

    iget-object v0, v1, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Liz0;->Y()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Liz0;->z()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    iget-object v5, v1, Liz0;->b0:[Liz0$b;

    const/4 v6, 0x1

    aget-object v7, v5, v6

    aget-object v5, v5, v2

    iget-object v8, v1, Ljz0;->b1:LbU2;

    if-eqz v8, :cond_0

    iget-wide v9, v8, LbU2;->E:J

    const-wide/16 v11, 0x1

    add-long/2addr v9, v11

    iput-wide v9, v8, LbU2;->E:J

    :cond_0
    iget v8, v1, Ljz0;->Y0:I

    if-nez v8, :cond_3

    iget v8, v1, Ljz0;->q1:I

    invoke-static {v8, v6}, Lhy3;->b(II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual/range {p0 .. p0}, Ljz0;->N1()LOE$b;

    move-result-object v8

    invoke-static {v1, v8}, Lc41;->h(Ljz0;LOE$b;)V

    move v8, v2

    :goto_0
    if-ge v8, v3, :cond_3

    iget-object v9, v1, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Liz0;

    invoke-virtual {v9}, Liz0;->o0()Z

    move-result v10

    if-eqz v10, :cond_2

    instance-of v10, v9, LwE1;

    if-nez v10, :cond_2

    instance-of v10, v9, LCy;

    if-nez v10, :cond_2

    instance-of v10, v9, Lzu6;

    if-nez v10, :cond_2

    invoke-virtual {v9}, Liz0;->n0()Z

    move-result v10

    if-nez v10, :cond_2

    invoke-virtual {v9, v2}, Liz0;->w(I)Liz0$b;

    move-result-object v10

    invoke-virtual {v9, v6}, Liz0;->w(I)Liz0$b;

    move-result-object v11

    sget-object v12, Liz0$b;->d:Liz0$b;

    if-ne v10, v12, :cond_1

    iget v10, v9, Liz0;->w:I

    if-eq v10, v6, :cond_1

    if-ne v11, v12, :cond_1

    iget v10, v9, Liz0;->x:I

    if-eq v10, v6, :cond_1

    move v10, v6

    goto :goto_1

    :cond_1
    move v10, v2

    :goto_1
    if-nez v10, :cond_2

    new-instance v10, LOE$a;

    invoke-direct {v10}, LOE$a;-><init>()V

    iget-object v11, v1, Ljz0;->Z0:LOE$b;

    sget v12, LOE$a;->k:I

    invoke-static {v2, v9, v11, v10, v12}, Ljz0;->X1(ILiz0;LOE$b;LOE$a;I)Z

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_3
    const/4 v8, 0x2

    if-le v3, v8, :cond_9

    sget-object v9, Liz0$b;->c:Liz0$b;

    if-eq v5, v9, :cond_4

    if-ne v7, v9, :cond_9

    :cond_4
    iget v10, v1, Ljz0;->q1:I

    const/16 v11, 0x400

    invoke-static {v10, v11}, Lhy3;->b(II)Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-virtual/range {p0 .. p0}, Ljz0;->N1()LOE$b;

    move-result-object v10

    invoke-static {v1, v10}, LmE1;->c(Ljz0;LOE$b;)Z

    move-result v10

    if-eqz v10, :cond_9

    if-ne v5, v9, :cond_6

    invoke-virtual/range {p0 .. p0}, Liz0;->Y()I

    move-result v10

    if-ge v0, v10, :cond_5

    if-lez v0, :cond_5

    invoke-virtual {v1, v0}, Liz0;->o1(I)V

    iput-boolean v6, v1, Ljz0;->s1:Z

    goto :goto_2

    :cond_5
    invoke-virtual/range {p0 .. p0}, Liz0;->Y()I

    move-result v0

    :cond_6
    :goto_2
    if-ne v7, v9, :cond_8

    invoke-virtual/range {p0 .. p0}, Liz0;->z()I

    move-result v9

    if-ge v4, v9, :cond_7

    if-lez v4, :cond_7

    invoke-virtual {v1, v4}, Liz0;->P0(I)V

    iput-boolean v6, v1, Ljz0;->t1:Z

    goto :goto_3

    :cond_7
    invoke-virtual/range {p0 .. p0}, Liz0;->z()I

    move-result v4

    :cond_8
    :goto_3
    move v9, v4

    move v4, v0

    move v0, v6

    goto :goto_4

    :cond_9
    move v9, v4

    move v4, v0

    move v0, v2

    :goto_4
    const/16 v10, 0x40

    invoke-virtual {v1, v10}, Ljz0;->Y1(I)Z

    move-result v11

    if-nez v11, :cond_b

    const/16 v11, 0x80

    invoke-virtual {v1, v11}, Ljz0;->Y1(I)Z

    move-result v11

    if-eqz v11, :cond_a

    goto :goto_5

    :cond_a
    move v11, v2

    goto :goto_6

    :cond_b
    :goto_5
    move v11, v6

    :goto_6
    iget-object v12, v1, Ljz0;->c1:LLr2;

    iput-boolean v2, v12, LLr2;->h:Z

    iput-boolean v2, v12, LLr2;->i:Z

    iget v13, v1, Ljz0;->q1:I

    if-eqz v13, :cond_c

    if-eqz v11, :cond_c

    iput-boolean v6, v12, LLr2;->i:Z

    :cond_c
    iget-object v11, v1, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual/range {p0 .. p0}, Liz0;->C()Liz0$b;

    move-result-object v12

    sget-object v13, Liz0$b;->c:Liz0$b;

    if-eq v12, v13, :cond_e

    invoke-virtual/range {p0 .. p0}, Liz0;->V()Liz0$b;

    move-result-object v12

    if-ne v12, v13, :cond_d

    goto :goto_7

    :cond_d
    move v12, v2

    goto :goto_8

    :cond_e
    :goto_7
    move v12, v6

    :goto_8
    invoke-virtual/range {p0 .. p0}, Ljz0;->Z1()V

    move v13, v2

    :goto_9
    if-ge v13, v3, :cond_10

    iget-object v14, v1, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Liz0;

    instance-of v15, v14, LcB6;

    if-eqz v15, :cond_f

    check-cast v14, LcB6;

    invoke-virtual {v14}, LcB6;->w1()V

    :cond_f
    add-int/lit8 v13, v13, 0x1

    goto :goto_9

    :cond_10
    invoke-virtual {v1, v10}, Ljz0;->Y1(I)Z

    move-result v10

    move v13, v0

    move v0, v2

    move v14, v6

    :goto_a
    if-eqz v14, :cond_22

    add-int/lit8 v15, v0, 0x1

    :try_start_0
    iget-object v0, v1, Ljz0;->c1:LLr2;

    invoke-virtual {v0}, LLr2;->E()V

    invoke-virtual/range {p0 .. p0}, Ljz0;->Z1()V

    iget-object v0, v1, Ljz0;->c1:LLr2;

    invoke-virtual {v1, v0}, Liz0;->o(LLr2;)V

    move v0, v2

    :goto_b
    if-ge v0, v3, :cond_11

    iget-object v6, v1, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Liz0;

    iget-object v2, v1, Ljz0;->c1:LLr2;

    invoke-virtual {v6, v2}, Liz0;->o(LLr2;)V

    add-int/lit8 v0, v0, 0x1

    const/4 v2, 0x0

    const/4 v6, 0x1

    goto :goto_b

    :cond_11
    iget-object v0, v1, Ljz0;->c1:LLr2;

    invoke-virtual {v1, v0}, Ljz0;->A1(LLr2;)Z

    move-result v14

    iget-object v0, v1, Ljz0;->v1:Ljava/lang/ref/WeakReference;

    const/4 v2, 0x0

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_12

    iget-object v0, v1, Ljz0;->v1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXy0;

    iget-object v6, v1, Ljz0;->c1:LLr2;

    iget-object v8, v1, Liz0;->R:LXy0;

    invoke-virtual {v6, v8}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v6

    invoke-virtual {v1, v0, v6}, Ljz0;->F1(LXy0;LrN5;)V

    iput-object v2, v1, Ljz0;->v1:Ljava/lang/ref/WeakReference;

    :cond_12
    iget-object v0, v1, Ljz0;->x1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_13

    iget-object v0, v1, Ljz0;->x1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXy0;

    iget-object v6, v1, Ljz0;->c1:LLr2;

    iget-object v8, v1, Liz0;->T:LXy0;

    invoke-virtual {v6, v8}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v6

    invoke-virtual {v1, v0, v6}, Ljz0;->E1(LXy0;LrN5;)V

    iput-object v2, v1, Ljz0;->x1:Ljava/lang/ref/WeakReference;

    :cond_13
    iget-object v0, v1, Ljz0;->w1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_14

    iget-object v0, v1, Ljz0;->w1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXy0;

    iget-object v6, v1, Ljz0;->c1:LLr2;

    iget-object v8, v1, Liz0;->Q:LXy0;

    invoke-virtual {v6, v8}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v6

    invoke-virtual {v1, v0, v6}, Ljz0;->F1(LXy0;LrN5;)V

    iput-object v2, v1, Ljz0;->w1:Ljava/lang/ref/WeakReference;

    :cond_14
    iget-object v0, v1, Ljz0;->y1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_15

    iget-object v0, v1, Ljz0;->y1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXy0;

    iget-object v6, v1, Ljz0;->c1:LLr2;

    iget-object v8, v1, Liz0;->S:LXy0;

    invoke-virtual {v6, v8}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v6

    invoke-virtual {v1, v0, v6}, Ljz0;->E1(LXy0;LrN5;)V

    iput-object v2, v1, Ljz0;->y1:Ljava/lang/ref/WeakReference;

    :cond_15
    if-eqz v14, :cond_16

    iget-object v0, v1, Ljz0;->c1:LLr2;

    invoke-virtual {v0}, LLr2;->A()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_c

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "EXCEPTION : "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_16
    :goto_c
    if-eqz v14, :cond_17

    iget-object v0, v1, Ljz0;->c1:LLr2;

    sget-object v2, Lhy3;->a:[Z

    invoke-virtual {v1, v0, v2}, Ljz0;->e2(LLr2;[Z)Z

    move-result v0

    goto :goto_e

    :cond_17
    iget-object v0, v1, Ljz0;->c1:LLr2;

    invoke-virtual {v1, v0, v10}, Liz0;->u1(LLr2;Z)V

    const/4 v0, 0x0

    :goto_d
    if-ge v0, v3, :cond_18

    iget-object v2, v1, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Liz0;

    iget-object v6, v1, Ljz0;->c1:LLr2;

    invoke-virtual {v2, v6, v10}, Liz0;->u1(LLr2;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_d

    :cond_18
    const/4 v0, 0x0

    :goto_e
    const/16 v2, 0x8

    if-eqz v12, :cond_1b

    if-ge v15, v2, :cond_1b

    sget-object v6, Lhy3;->a:[Z

    const/4 v8, 0x2

    aget-boolean v6, v6, v8

    if-eqz v6, :cond_1b

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v14, 0x0

    :goto_f
    if-ge v6, v3, :cond_19

    iget-object v2, v1, LcB6;->V0:Ljava/util/ArrayList;

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Liz0;

    move/from16 v16, v0

    iget v0, v2, Liz0;->h0:I

    invoke-virtual {v2}, Liz0;->Y()I

    move-result v17

    add-int v0, v0, v17

    invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I

    move-result v14

    iget v0, v2, Liz0;->i0:I

    invoke-virtual {v2}, Liz0;->z()I

    move-result v2

    add-int/2addr v0, v2

    invoke-static {v8, v0}, Ljava/lang/Math;->max(II)I

    move-result v8

    add-int/lit8 v6, v6, 0x1

    move/from16 v0, v16

    const/16 v2, 0x8

    goto :goto_f

    :cond_19
    move/from16 v16, v0

    iget v0, v1, Liz0;->o0:I

    invoke-static {v0, v14}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, v1, Liz0;->p0:I

    invoke-static {v2, v8}, Ljava/lang/Math;->max(II)I

    move-result v2

    sget-object v6, Liz0$b;->c:Liz0$b;

    if-ne v5, v6, :cond_1a

    invoke-virtual/range {p0 .. p0}, Liz0;->Y()I

    move-result v8

    if-ge v8, v0, :cond_1a

    invoke-virtual {v1, v0}, Liz0;->o1(I)V

    iget-object v0, v1, Liz0;->b0:[Liz0$b;

    const/4 v8, 0x0

    aput-object v6, v0, v8

    const/4 v13, 0x1

    const/16 v16, 0x1

    :cond_1a
    if-ne v7, v6, :cond_1c

    invoke-virtual/range {p0 .. p0}, Liz0;->z()I

    move-result v0

    if-ge v0, v2, :cond_1c

    invoke-virtual {v1, v2}, Liz0;->P0(I)V

    iget-object v0, v1, Liz0;->b0:[Liz0$b;

    const/4 v2, 0x1

    aput-object v6, v0, v2

    const/4 v13, 0x1

    const/16 v16, 0x1

    goto :goto_10

    :cond_1b
    move/from16 v16, v0

    :cond_1c
    :goto_10
    iget v0, v1, Liz0;->o0:I

    invoke-virtual/range {p0 .. p0}, Liz0;->Y()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Liz0;->Y()I

    move-result v2

    if-le v0, v2, :cond_1d

    invoke-virtual {v1, v0}, Liz0;->o1(I)V

    iget-object v0, v1, Liz0;->b0:[Liz0$b;

    sget-object v2, Liz0$b;->b:Liz0$b;

    const/4 v6, 0x0

    aput-object v2, v0, v6

    const/4 v13, 0x1

    const/16 v16, 0x1

    :cond_1d
    iget v0, v1, Liz0;->p0:I

    invoke-virtual/range {p0 .. p0}, Liz0;->z()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Liz0;->z()I

    move-result v2

    if-le v0, v2, :cond_1e

    invoke-virtual {v1, v0}, Liz0;->P0(I)V

    iget-object v0, v1, Liz0;->b0:[Liz0$b;

    sget-object v2, Liz0$b;->b:Liz0$b;

    const/4 v6, 0x1

    aput-object v2, v0, v6

    move v2, v6

    move/from16 v16, v2

    goto :goto_11

    :cond_1e
    const/4 v6, 0x1

    move v2, v13

    :goto_11
    if-nez v2, :cond_20

    iget-object v0, v1, Liz0;->b0:[Liz0$b;

    const/4 v8, 0x0

    aget-object v0, v0, v8

    sget-object v13, Liz0$b;->c:Liz0$b;

    if-ne v0, v13, :cond_1f

    if-lez v4, :cond_1f

    invoke-virtual/range {p0 .. p0}, Liz0;->Y()I

    move-result v0

    if-le v0, v4, :cond_1f

    iput-boolean v6, v1, Ljz0;->s1:Z

    iget-object v0, v1, Liz0;->b0:[Liz0$b;

    sget-object v2, Liz0$b;->b:Liz0$b;

    aput-object v2, v0, v8

    invoke-virtual {v1, v4}, Liz0;->o1(I)V

    move v2, v6

    move/from16 v16, v2

    :cond_1f
    iget-object v0, v1, Liz0;->b0:[Liz0$b;

    aget-object v0, v0, v6

    if-ne v0, v13, :cond_20

    if-lez v9, :cond_20

    invoke-virtual/range {p0 .. p0}, Liz0;->z()I

    move-result v0

    if-le v0, v9, :cond_20

    iput-boolean v6, v1, Ljz0;->t1:Z

    iget-object v0, v1, Liz0;->b0:[Liz0$b;

    sget-object v2, Liz0$b;->b:Liz0$b;

    aput-object v2, v0, v6

    invoke-virtual {v1, v9}, Liz0;->P0(I)V

    const/16 v0, 0x8

    const/4 v2, 0x1

    const/4 v13, 0x1

    goto :goto_12

    :cond_20
    move v13, v2

    move/from16 v2, v16

    const/16 v0, 0x8

    :goto_12
    if-le v15, v0, :cond_21

    const/4 v14, 0x0

    goto :goto_13

    :cond_21
    move v14, v2

    :goto_13
    move v0, v15

    const/4 v2, 0x0

    const/4 v6, 0x1

    const/4 v8, 0x2

    goto/16 :goto_a

    :cond_22
    iput-object v11, v1, LcB6;->V0:Ljava/util/ArrayList;

    if-eqz v13, :cond_23

    iget-object v0, v1, Liz0;->b0:[Liz0$b;

    const/4 v2, 0x0

    aput-object v5, v0, v2

    const/4 v2, 0x1

    aput-object v7, v0, v2

    :cond_23
    iget-object v0, v1, Ljz0;->c1:LLr2;

    invoke-virtual {v0}, LLr2;->w()Lb80;

    move-result-object v0

    invoke-virtual {v1, v0}, LcB6;->z0(Lb80;)V

    return-void
.end method

.method public z1(Liz0;I)V
    .locals 1

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Ljz0;->B1(Liz0;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    invoke-virtual {p0, p1}, Ljz0;->G1(Liz0;)V

    :cond_1
    :goto_0
    return-void
.end method
