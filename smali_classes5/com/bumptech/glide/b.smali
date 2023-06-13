.class public final Lcom/bumptech/glide/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/b$d;,
        Lcom/bumptech/glide/b$c;,
        Lcom/bumptech/glide/b$b;,
        Lcom/bumptech/glide/b$e;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "LK96<",
            "**>;>;"
        }
    .end annotation
.end field

.field public final b:Lcom/bumptech/glide/d$a;

.field public c:LDd1;

.field public d:LeU;

.field public e:Lto;

.field public f:LOP2;

.field public g:LKC1;

.field public h:LKC1;

.field public i:Lz41$a;

.field public j:LUP2;

.field public k:LEy0;

.field public l:I

.field public m:Lcom/bumptech/glide/a$a;

.field public n:Lcom/bumptech/glide/manager/b$b;

.field public o:LKC1;

.field public p:Z

.field public q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LTI4<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lso;

    invoke-direct {v0}, Lso;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/b;->a:Ljava/util/Map;

    new-instance v0, Lcom/bumptech/glide/d$a;

    invoke-direct {v0}, Lcom/bumptech/glide/d$a;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/b;->b:Lcom/bumptech/glide/d$a;

    const/4 v0, 0x4

    iput v0, p0, Lcom/bumptech/glide/b;->l:I

    new-instance v0, Lcom/bumptech/glide/b$a;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/b$a;-><init>(Lcom/bumptech/glide/b;)V

    iput-object v0, p0, Lcom/bumptech/glide/b;->m:Lcom/bumptech/glide/a$a;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/util/List;Lbj;)Lcom/bumptech/glide/a;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "LLC1;",
            ">;",
            "Lbj;",
            ")",
            "Lcom/bumptech/glide/a;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    iget-object v1, v0, Lcom/bumptech/glide/b;->g:LKC1;

    if-nez v1, :cond_0

    invoke-static {}, LKC1;->g()LKC1;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/b;->g:LKC1;

    :cond_0
    iget-object v1, v0, Lcom/bumptech/glide/b;->h:LKC1;

    if-nez v1, :cond_1

    invoke-static {}, LKC1;->e()LKC1;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/b;->h:LKC1;

    :cond_1
    iget-object v1, v0, Lcom/bumptech/glide/b;->o:LKC1;

    if-nez v1, :cond_2

    invoke-static {}, LKC1;->c()LKC1;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/b;->o:LKC1;

    :cond_2
    iget-object v1, v0, Lcom/bumptech/glide/b;->j:LUP2;

    if-nez v1, :cond_3

    new-instance v1, LUP2$a;

    invoke-direct {v1, v2}, LUP2$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, LUP2$a;->a()LUP2;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/b;->j:LUP2;

    :cond_3
    iget-object v1, v0, Lcom/bumptech/glide/b;->k:LEy0;

    if-nez v1, :cond_4

    new-instance v1, LMW0;

    invoke-direct {v1}, LMW0;-><init>()V

    iput-object v1, v0, Lcom/bumptech/glide/b;->k:LEy0;

    :cond_4
    iget-object v1, v0, Lcom/bumptech/glide/b;->d:LeU;

    if-nez v1, :cond_6

    iget-object v1, v0, Lcom/bumptech/glide/b;->j:LUP2;

    invoke-virtual {v1}, LUP2;->b()I

    move-result v1

    if-lez v1, :cond_5

    new-instance v3, LrE2;

    int-to-long v4, v1

    invoke-direct {v3, v4, v5}, LrE2;-><init>(J)V

    iput-object v3, v0, Lcom/bumptech/glide/b;->d:LeU;

    goto :goto_0

    :cond_5
    new-instance v1, LfU;

    invoke-direct {v1}, LfU;-><init>()V

    iput-object v1, v0, Lcom/bumptech/glide/b;->d:LeU;

    :cond_6
    :goto_0
    iget-object v1, v0, Lcom/bumptech/glide/b;->e:Lto;

    if-nez v1, :cond_7

    new-instance v1, LqE2;

    iget-object v3, v0, Lcom/bumptech/glide/b;->j:LUP2;

    invoke-virtual {v3}, LUP2;->a()I

    move-result v3

    invoke-direct {v1, v3}, LqE2;-><init>(I)V

    iput-object v1, v0, Lcom/bumptech/glide/b;->e:Lto;

    :cond_7
    iget-object v1, v0, Lcom/bumptech/glide/b;->f:LOP2;

    if-nez v1, :cond_8

    new-instance v1, LyE2;

    iget-object v3, v0, Lcom/bumptech/glide/b;->j:LUP2;

    invoke-virtual {v3}, LUP2;->d()I

    move-result v3

    int-to-long v3, v3

    invoke-direct {v1, v3, v4}, LyE2;-><init>(J)V

    iput-object v1, v0, Lcom/bumptech/glide/b;->f:LOP2;

    :cond_8
    iget-object v1, v0, Lcom/bumptech/glide/b;->i:Lz41$a;

    if-nez v1, :cond_9

    new-instance v1, Lo62;

    invoke-direct {v1, v2}, Lo62;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lcom/bumptech/glide/b;->i:Lz41$a;

    :cond_9
    iget-object v1, v0, Lcom/bumptech/glide/b;->c:LDd1;

    if-nez v1, :cond_a

    new-instance v1, LDd1;

    iget-object v4, v0, Lcom/bumptech/glide/b;->f:LOP2;

    iget-object v5, v0, Lcom/bumptech/glide/b;->i:Lz41$a;

    iget-object v6, v0, Lcom/bumptech/glide/b;->h:LKC1;

    iget-object v7, v0, Lcom/bumptech/glide/b;->g:LKC1;

    invoke-static {}, LKC1;->h()LKC1;

    move-result-object v8

    iget-object v9, v0, Lcom/bumptech/glide/b;->o:LKC1;

    iget-boolean v10, v0, Lcom/bumptech/glide/b;->p:Z

    move-object v3, v1

    invoke-direct/range {v3 .. v10}, LDd1;-><init>(LOP2;Lz41$a;LKC1;LKC1;LKC1;LKC1;Z)V

    iput-object v1, v0, Lcom/bumptech/glide/b;->c:LDd1;

    :cond_a
    iget-object v1, v0, Lcom/bumptech/glide/b;->q:Ljava/util/List;

    if-nez v1, :cond_b

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/b;->q:Ljava/util/List;

    goto :goto_1

    :cond_b
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/b;->q:Ljava/util/List;

    :goto_1
    iget-object v1, v0, Lcom/bumptech/glide/b;->b:Lcom/bumptech/glide/d$a;

    invoke-virtual {v1}, Lcom/bumptech/glide/d$a;->b()Lcom/bumptech/glide/d;

    move-result-object v15

    new-instance v7, Lcom/bumptech/glide/manager/b;

    iget-object v1, v0, Lcom/bumptech/glide/b;->n:Lcom/bumptech/glide/manager/b$b;

    invoke-direct {v7, v1, v15}, Lcom/bumptech/glide/manager/b;-><init>(Lcom/bumptech/glide/manager/b$b;Lcom/bumptech/glide/d;)V

    new-instance v16, Lcom/bumptech/glide/a;

    iget-object v3, v0, Lcom/bumptech/glide/b;->c:LDd1;

    iget-object v4, v0, Lcom/bumptech/glide/b;->f:LOP2;

    iget-object v5, v0, Lcom/bumptech/glide/b;->d:LeU;

    iget-object v6, v0, Lcom/bumptech/glide/b;->e:Lto;

    iget-object v8, v0, Lcom/bumptech/glide/b;->k:LEy0;

    iget v9, v0, Lcom/bumptech/glide/b;->l:I

    iget-object v10, v0, Lcom/bumptech/glide/b;->m:Lcom/bumptech/glide/a$a;

    iget-object v11, v0, Lcom/bumptech/glide/b;->a:Ljava/util/Map;

    iget-object v12, v0, Lcom/bumptech/glide/b;->q:Ljava/util/List;

    move-object/from16 v1, v16

    move-object/from16 v2, p1

    move-object/from16 v13, p2

    move-object/from16 v14, p3

    invoke-direct/range {v1 .. v15}, Lcom/bumptech/glide/a;-><init>(Landroid/content/Context;LDd1;LOP2;LeU;Lto;Lcom/bumptech/glide/manager/b;LEy0;ILcom/bumptech/glide/a$a;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lbj;Lcom/bumptech/glide/d;)V

    return-object v16
.end method

.method public b(Lcom/bumptech/glide/manager/b$b;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/b;->n:Lcom/bumptech/glide/manager/b$b;

    return-void
.end method
