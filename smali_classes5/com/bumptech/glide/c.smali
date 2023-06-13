.class public Lcom/bumptech/glide/c;
.super Landroid/content/ContextWrapper;
.source "SourceFile"


# static fields
.field public static final k:LK96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LK96<",
            "**>;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lto;

.field public final b:LMC1$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LMC1$b<",
            "Lcom/bumptech/glide/Registry;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LzY1;

.field public final d:Lcom/bumptech/glide/a$a;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LTI4<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/Map;
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

.field public final g:LDd1;

.field public final h:Lcom/bumptech/glide/d;

.field public final i:I

.field public j:LYI4;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LyB1;

    invoke-direct {v0}, LyB1;-><init>()V

    sput-object v0, Lcom/bumptech/glide/c;->k:LK96;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lto;LMC1$b;LzY1;Lcom/bumptech/glide/a$a;Ljava/util/Map;Ljava/util/List;LDd1;Lcom/bumptech/glide/d;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lto;",
            "LMC1$b<",
            "Lcom/bumptech/glide/Registry;",
            ">;",
            "LzY1;",
            "Lcom/bumptech/glide/a$a;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "LK96<",
            "**>;>;",
            "Ljava/util/List<",
            "LTI4<",
            "Ljava/lang/Object;",
            ">;>;",
            "LDd1;",
            "Lcom/bumptech/glide/d;",
            "I)V"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/bumptech/glide/c;->a:Lto;

    iput-object p4, p0, Lcom/bumptech/glide/c;->c:LzY1;

    iput-object p5, p0, Lcom/bumptech/glide/c;->d:Lcom/bumptech/glide/a$a;

    iput-object p7, p0, Lcom/bumptech/glide/c;->e:Ljava/util/List;

    iput-object p6, p0, Lcom/bumptech/glide/c;->f:Ljava/util/Map;

    iput-object p8, p0, Lcom/bumptech/glide/c;->g:LDd1;

    iput-object p9, p0, Lcom/bumptech/glide/c;->h:Lcom/bumptech/glide/d;

    iput p10, p0, Lcom/bumptech/glide/c;->i:I

    invoke-static {p3}, LMC1;->a(LMC1$b;)LMC1$b;

    move-result-object p1

    iput-object p1, p0, Lcom/bumptech/glide/c;->b:LMC1$b;

    return-void
.end method


# virtual methods
.method public a(Landroid/widget/ImageView;Ljava/lang/Class;)LIt6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/widget/ImageView;",
            "Ljava/lang/Class<",
            "TX;>;)",
            "LIt6<",
            "Landroid/widget/ImageView;",
            "TX;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/c;->c:LzY1;

    invoke-virtual {v0, p1, p2}, LzY1;->a(Landroid/widget/ImageView;Ljava/lang/Class;)LIt6;

    move-result-object p1

    return-object p1
.end method

.method public b()Lto;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/c;->a:Lto;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LTI4<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/c;->e:Ljava/util/List;

    return-object v0
.end method

.method public declared-synchronized d()LYI4;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/c;->j:LYI4;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/c;->d:Lcom/bumptech/glide/a$a;

    invoke-interface {v0}, Lcom/bumptech/glide/a$a;->build()LYI4;

    move-result-object v0

    invoke-virtual {v0}, LLD;->d0()LLD;

    move-result-object v0

    check-cast v0, LYI4;

    iput-object v0, p0, Lcom/bumptech/glide/c;->j:LYI4;

    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/c;->j:LYI4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public e(Ljava/lang/Class;)LK96;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "LK96<",
            "*TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/c;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK96;

    if-nez v0, :cond_1

    iget-object v1, p0, Lcom/bumptech/glide/c;->f:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK96;

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    sget-object v0, Lcom/bumptech/glide/c;->k:LK96;

    :cond_2
    return-object v0
.end method

.method public f()LDd1;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/c;->g:LDd1;

    return-object v0
.end method

.method public g()Lcom/bumptech/glide/d;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/c;->h:Lcom/bumptech/glide/d;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lcom/bumptech/glide/c;->i:I

    return v0
.end method

.method public i()Lcom/bumptech/glide/Registry;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/c;->b:LMC1$b;

    invoke-interface {v0}, LMC1$b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/Registry;

    return-object v0
.end method
