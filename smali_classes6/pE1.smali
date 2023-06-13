.class public final LpE1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/google/gson/internal/Excluder;

.field public b:Lmz2;

.field public c:LWk1;

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Lb52<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LCb6;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LCb6;",
            ">;"
        }
    .end annotation
.end field

.field public g:Z

.field public h:Ljava/lang/String;

.field public i:I

.field public j:I

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Ld56;

.field public s:Ld56;

.field public final t:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lot4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/gson/internal/Excluder;->h:Lcom/google/gson/internal/Excluder;

    iput-object v0, p0, LpE1;->a:Lcom/google/gson/internal/Excluder;

    sget-object v0, Lmz2;->b:Lmz2;

    iput-object v0, p0, LpE1;->b:Lmz2;

    sget-object v0, LVk1;->b:LVk1;

    iput-object v0, p0, LpE1;->c:LWk1;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LpE1;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LpE1;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LpE1;->f:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, LpE1;->g:Z

    sget-object v1, LoE1;->z:Ljava/lang/String;

    iput-object v1, p0, LpE1;->h:Ljava/lang/String;

    const/4 v1, 0x2

    iput v1, p0, LpE1;->i:I

    iput v1, p0, LpE1;->j:I

    iput-boolean v0, p0, LpE1;->k:Z

    iput-boolean v0, p0, LpE1;->l:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, LpE1;->m:Z

    iput-boolean v0, p0, LpE1;->n:Z

    iput-boolean v0, p0, LpE1;->o:Z

    iput-boolean v0, p0, LpE1;->p:Z

    iput-boolean v1, p0, LpE1;->q:Z

    sget-object v0, LoE1;->B:Ld56;

    iput-object v0, p0, LpE1;->r:Ld56;

    sget-object v0, LoE1;->C:Ld56;

    iput-object v0, p0, LpE1;->s:Ld56;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, LpE1;->t:Ljava/util/LinkedList;

    return-void
.end method

.method public constructor <init>(LoE1;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/gson/internal/Excluder;->h:Lcom/google/gson/internal/Excluder;

    iput-object v0, p0, LpE1;->a:Lcom/google/gson/internal/Excluder;

    sget-object v0, Lmz2;->b:Lmz2;

    iput-object v0, p0, LpE1;->b:Lmz2;

    sget-object v0, LVk1;->b:LVk1;

    iput-object v0, p0, LpE1;->c:LWk1;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LpE1;->d:Ljava/util/Map;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LpE1;->e:Ljava/util/List;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, LpE1;->f:Ljava/util/List;

    const/4 v3, 0x0

    iput-boolean v3, p0, LpE1;->g:Z

    sget-object v4, LoE1;->z:Ljava/lang/String;

    iput-object v4, p0, LpE1;->h:Ljava/lang/String;

    const/4 v4, 0x2

    iput v4, p0, LpE1;->i:I

    iput v4, p0, LpE1;->j:I

    iput-boolean v3, p0, LpE1;->k:Z

    iput-boolean v3, p0, LpE1;->l:Z

    const/4 v4, 0x1

    iput-boolean v4, p0, LpE1;->m:Z

    iput-boolean v3, p0, LpE1;->n:Z

    iput-boolean v3, p0, LpE1;->o:Z

    iput-boolean v3, p0, LpE1;->p:Z

    iput-boolean v4, p0, LpE1;->q:Z

    sget-object v3, LoE1;->B:Ld56;

    iput-object v3, p0, LpE1;->r:Ld56;

    sget-object v3, LoE1;->C:Ld56;

    iput-object v3, p0, LpE1;->s:Ld56;

    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    iput-object v3, p0, LpE1;->t:Ljava/util/LinkedList;

    iget-object v4, p1, LoE1;->f:Lcom/google/gson/internal/Excluder;

    iput-object v4, p0, LpE1;->a:Lcom/google/gson/internal/Excluder;

    iget-object v4, p1, LoE1;->g:LWk1;

    iput-object v4, p0, LpE1;->c:LWk1;

    iget-object v4, p1, LoE1;->h:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-boolean v0, p1, LoE1;->i:Z

    iput-boolean v0, p0, LpE1;->g:Z

    iget-boolean v0, p1, LoE1;->j:Z

    iput-boolean v0, p0, LpE1;->k:Z

    iget-boolean v0, p1, LoE1;->k:Z

    iput-boolean v0, p0, LpE1;->o:Z

    iget-boolean v0, p1, LoE1;->l:Z

    iput-boolean v0, p0, LpE1;->m:Z

    iget-boolean v0, p1, LoE1;->m:Z

    iput-boolean v0, p0, LpE1;->n:Z

    iget-boolean v0, p1, LoE1;->n:Z

    iput-boolean v0, p0, LpE1;->p:Z

    iget-boolean v0, p1, LoE1;->o:Z

    iput-boolean v0, p0, LpE1;->l:Z

    iget-object v0, p1, LoE1;->t:Lmz2;

    iput-object v0, p0, LpE1;->b:Lmz2;

    iget-object v0, p1, LoE1;->q:Ljava/lang/String;

    iput-object v0, p0, LpE1;->h:Ljava/lang/String;

    iget v0, p1, LoE1;->r:I

    iput v0, p0, LpE1;->i:I

    iget v0, p1, LoE1;->s:I

    iput v0, p0, LpE1;->j:I

    iget-object v0, p1, LoE1;->u:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p1, LoE1;->v:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-boolean v0, p1, LoE1;->p:Z

    iput-boolean v0, p0, LpE1;->q:Z

    iget-object v0, p1, LoE1;->w:Ld56;

    iput-object v0, p0, LpE1;->r:Ld56;

    iget-object v0, p1, LoE1;->x:Ld56;

    iput-object v0, p0, LpE1;->s:Ld56;

    iget-object p1, p1, LoE1;->y:Ljava/util/List;

    invoke-virtual {v3, p1}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;IILjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "LCb6;",
            ">;)V"
        }
    .end annotation

    sget-boolean v0, LlO5;->a:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    sget-object p2, LTW0$b;->b:LTW0$b;

    invoke-virtual {p2, p1}, LTW0$b;->b(Ljava/lang/String;)LCb6;

    move-result-object p2

    if-eqz v0, :cond_0

    sget-object p3, LlO5;->c:LTW0$b;

    invoke-virtual {p3, p1}, LTW0$b;->b(Ljava/lang/String;)LCb6;

    move-result-object v1

    sget-object p3, LlO5;->b:LTW0$b;

    invoke-virtual {p3, p1}, LTW0$b;->b(Ljava/lang/String;)LCb6;

    move-result-object p1

    goto :goto_1

    :cond_0
    :goto_0
    move-object p1, v1

    goto :goto_1

    :cond_1
    const/4 p1, 0x2

    if-eq p2, p1, :cond_3

    if-eq p3, p1, :cond_3

    sget-object p1, LTW0$b;->b:LTW0$b;

    invoke-virtual {p1, p2, p3}, LTW0$b;->a(II)LCb6;

    move-result-object p1

    if-eqz v0, :cond_2

    sget-object v1, LlO5;->c:LTW0$b;

    invoke-virtual {v1, p2, p3}, LTW0$b;->a(II)LCb6;

    move-result-object v1

    sget-object v2, LlO5;->b:LTW0$b;

    invoke-virtual {v2, p2, p3}, LTW0$b;->a(II)LCb6;

    move-result-object p2

    move-object v3, p2

    move-object p2, p1

    move-object p1, v3

    goto :goto_1

    :cond_2
    move-object p2, p1

    goto :goto_0

    :goto_1
    invoke-interface {p4, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_3

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method

.method public b()LoE1;
    .locals 26

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v19, v1

    iget-object v2, v0, LpE1;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, v0, LpE1;->f:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x3

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, v0, LpE1;->e:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, v0, LpE1;->f:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v2, v0, LpE1;->h:Ljava/lang/String;

    iget v3, v0, LpE1;->i:I

    iget v4, v0, LpE1;->j:I

    invoke-virtual {v0, v2, v3, v4, v1}, LpE1;->a(Ljava/lang/String;IILjava/util/List;)V

    new-instance v23, LoE1;

    move-object/from16 v1, v23

    iget-object v2, v0, LpE1;->a:Lcom/google/gson/internal/Excluder;

    iget-object v3, v0, LpE1;->c:LWk1;

    new-instance v5, Ljava/util/HashMap;

    move-object v4, v5

    iget-object v6, v0, LpE1;->d:Ljava/util/Map;

    invoke-direct {v5, v6}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iget-boolean v5, v0, LpE1;->g:Z

    iget-boolean v6, v0, LpE1;->k:Z

    iget-boolean v7, v0, LpE1;->o:Z

    iget-boolean v8, v0, LpE1;->m:Z

    iget-boolean v9, v0, LpE1;->n:Z

    iget-boolean v10, v0, LpE1;->p:Z

    iget-boolean v11, v0, LpE1;->l:Z

    iget-boolean v12, v0, LpE1;->q:Z

    iget-object v13, v0, LpE1;->b:Lmz2;

    iget-object v14, v0, LpE1;->h:Ljava/lang/String;

    iget v15, v0, LpE1;->i:I

    move-object/from16 v24, v1

    iget v1, v0, LpE1;->j:I

    move/from16 v16, v1

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v17, v1

    move-object/from16 v25, v2

    iget-object v2, v0, LpE1;->e:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v18, v1

    iget-object v2, v0, LpE1;->f:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, v0, LpE1;->r:Ld56;

    move-object/from16 v20, v1

    iget-object v1, v0, LpE1;->s:Ld56;

    move-object/from16 v21, v1

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v22, v1

    iget-object v2, v0, LpE1;->t:Ljava/util/LinkedList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object/from16 v1, v24

    move-object/from16 v2, v25

    invoke-direct/range {v1 .. v22}, LoE1;-><init>(Lcom/google/gson/internal/Excluder;LWk1;Ljava/util/Map;ZZZZZZZZLmz2;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;Ld56;Ld56;Ljava/util/List;)V

    return-object v23
.end method

.method public c()LpE1;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LpE1;->m:Z

    return-object p0
.end method

.method public d()LpE1;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LpE1;->k:Z

    return-object p0
.end method

.method public varargs e([I)LpE1;
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LpE1;->a:Lcom/google/gson/internal/Excluder;

    invoke-virtual {v0, p1}, Lcom/google/gson/internal/Excluder;->q([I)Lcom/google/gson/internal/Excluder;

    move-result-object p1

    iput-object p1, p0, LpE1;->a:Lcom/google/gson/internal/Excluder;

    return-object p0
.end method

.method public f(Ljava/lang/reflect/Type;Ljava/lang/Object;)LpE1;
    .locals 3

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p2, Llj2;

    if-nez v0, :cond_1

    instance-of v1, p2, Lvi2;

    if-nez v1, :cond_1

    instance-of v1, p2, Lb52;

    if-nez v1, :cond_1

    instance-of v1, p2, LBb6;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, La;->a(Z)V

    instance-of v1, p2, Lb52;

    if-eqz v1, :cond_2

    iget-object v1, p0, LpE1;->d:Ljava/util/Map;

    move-object v2, p2

    check-cast v2, Lb52;

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-nez v0, :cond_3

    instance-of v0, p2, Lvi2;

    if-eqz v0, :cond_4

    :cond_3
    invoke-static {p1}, LFb6;->get(Ljava/lang/reflect/Type;)LFb6;

    move-result-object v0

    iget-object v1, p0, LpE1;->e:Ljava/util/List;

    invoke-static {v0, p2}, Lcom/google/gson/internal/bind/TreeTypeAdapter;->g(LFb6;Ljava/lang/Object;)LCb6;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    instance-of v0, p2, LBb6;

    if-eqz v0, :cond_5

    invoke-static {p1}, LFb6;->get(Ljava/lang/reflect/Type;)LFb6;

    move-result-object p1

    check-cast p2, LBb6;

    invoke-static {p1, p2}, Lcom/google/gson/internal/bind/TypeAdapters;->a(LFb6;LBb6;)LCb6;

    move-result-object p1

    iget-object p2, p0, LpE1;->e:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object p0
.end method

.method public g(LCb6;)LpE1;
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LpE1;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public h()LpE1;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LpE1;->g:Z

    return-object p0
.end method

.method public i(LVk1;)LpE1;
    .locals 0

    invoke-virtual {p0, p1}, LpE1;->j(LWk1;)LpE1;

    move-result-object p1

    return-object p1
.end method

.method public j(LWk1;)LpE1;
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, LWk1;

    iput-object p1, p0, LpE1;->c:LWk1;

    return-object p0
.end method

.method public k()LpE1;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LpE1;->p:Z

    return-object p0
.end method

.method public l()LpE1;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LpE1;->n:Z

    return-object p0
.end method
