.class public LWG6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWG6$c;
    }
.end annotation


# static fields
.field public static final t:Ljava/lang/String;


# instance fields
.field public b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lxm5;",
            ">;"
        }
    .end annotation
.end field

.field public e:Landroidx/work/WorkerParameters$a;

.field public f:LHG6;

.field public g:Landroidx/work/c;

.field public h:LmZ5;

.field public i:Landroidx/work/c$a;

.field public j:Landroidx/work/a;

.field public k:LZw1;

.field public l:Landroidx/work/impl/WorkDatabase;

.field public m:LIG6;

.field public n:Lm01;

.field public o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public p:Ljava/lang/String;

.field public q:Lew5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lew5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final r:Lew5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lew5<",
            "Landroidx/work/c$a;",
            ">;"
        }
    .end annotation
.end field

.field public volatile s:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkerWrapper"

    invoke-static {v0}, LBx2;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LWG6;->t:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(LWG6$c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    iput-object v0, p0, LWG6;->i:Landroidx/work/c$a;

    invoke-static {}, Lew5;->t()Lew5;

    move-result-object v0

    iput-object v0, p0, LWG6;->q:Lew5;

    invoke-static {}, Lew5;->t()Lew5;

    move-result-object v0

    iput-object v0, p0, LWG6;->r:Lew5;

    iget-object v0, p1, LWG6$c;->a:Landroid/content/Context;

    iput-object v0, p0, LWG6;->b:Landroid/content/Context;

    iget-object v0, p1, LWG6$c;->d:LmZ5;

    iput-object v0, p0, LWG6;->h:LmZ5;

    iget-object v0, p1, LWG6$c;->c:LZw1;

    iput-object v0, p0, LWG6;->k:LZw1;

    iget-object v0, p1, LWG6$c;->g:LHG6;

    iput-object v0, p0, LWG6;->f:LHG6;

    iget-object v0, v0, LHG6;->a:Ljava/lang/String;

    iput-object v0, p0, LWG6;->c:Ljava/lang/String;

    iget-object v0, p1, LWG6$c;->h:Ljava/util/List;

    iput-object v0, p0, LWG6;->d:Ljava/util/List;

    iget-object v0, p1, LWG6$c;->j:Landroidx/work/WorkerParameters$a;

    iput-object v0, p0, LWG6;->e:Landroidx/work/WorkerParameters$a;

    iget-object v0, p1, LWG6$c;->b:Landroidx/work/c;

    iput-object v0, p0, LWG6;->g:Landroidx/work/c;

    iget-object v0, p1, LWG6$c;->e:Landroidx/work/a;

    iput-object v0, p0, LWG6;->j:Landroidx/work/a;

    iget-object v0, p1, LWG6$c;->f:Landroidx/work/impl/WorkDatabase;

    iput-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->I()LIG6;

    move-result-object v0

    iput-object v0, p0, LWG6;->m:LIG6;

    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->D()Lm01;

    move-result-object v0

    iput-object v0, p0, LWG6;->n:Lm01;

    invoke-static {p1}, LWG6$c;->a(LWG6$c;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LWG6;->o:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(LWG6;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    invoke-direct {p0, p1}, LWG6;->i(Lcom/google/common/util/concurrent/ListenableFuture;)V

    return-void
.end method

.method private synthetic i(Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 1

    iget-object v0, p0, LWG6;->r:Lew5;

    invoke-virtual {v0}, Lw0;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Ljava/util/List;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Work [ id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LWG6;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tags={ "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    const-string v3, ", "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string p1, " } ]"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LWG6;->q:Lew5;

    return-object v0
.end method

.method public d()LTC6;
    .locals 1

    iget-object v0, p0, LWG6;->f:LHG6;

    invoke-static {v0}, LKG6;->a(LHG6;)LTC6;

    move-result-object v0

    return-object v0
.end method

.method public e()LHG6;
    .locals 1

    iget-object v0, p0, LWG6;->f:LHG6;

    return-object v0
.end method

.method public final f(Landroidx/work/c$a;)V
    .locals 3

    instance-of v0, p1, Landroidx/work/c$a$c;

    if-eqz v0, :cond_1

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object p1

    sget-object v0, LWG6;->t:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Worker result SUCCESS for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LWG6;->p:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, LBx2;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, LWG6;->f:LHG6;

    invoke-virtual {p1}, LHG6;->j()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LWG6;->l()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LWG6;->q()V

    goto :goto_0

    :cond_1
    instance-of p1, p1, Landroidx/work/c$a$b;

    if-eqz p1, :cond_2

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object p1

    sget-object v0, LWG6;->t:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Worker result RETRY for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LWG6;->p:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, LBx2;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, LWG6;->k()V

    goto :goto_0

    :cond_2
    invoke-static {}, LBx2;->e()LBx2;

    move-result-object p1

    sget-object v0, LWG6;->t:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Worker result FAILURE for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LWG6;->p:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, LBx2;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, LWG6;->f:LHG6;

    invoke-virtual {p1}, LHG6;->j()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, LWG6;->l()V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, LWG6;->p()V

    :goto_0
    return-void
.end method

.method public g()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, LWG6;->s:Z

    invoke-virtual {p0}, LWG6;->r()Z

    iget-object v1, p0, LWG6;->r:Lew5;

    invoke-virtual {v1, v0}, Lw0;->cancel(Z)Z

    iget-object v0, p0, LWG6;->g:Landroidx/work/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, LWG6;->r:Lew5;

    invoke-virtual {v0}, Lw0;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LWG6;->g:Landroidx/work/c;

    invoke-virtual {v0}, Landroidx/work/c;->p()V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WorkSpec "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LWG6;->f:LHG6;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is already done. Not interrupting."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v1

    sget-object v2, LWG6;->t:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final h(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v0}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, LWG6;->m:LIG6;

    invoke-interface {v1, p1}, LIG6;->b(Ljava/lang/String;)LUC6$a;

    move-result-object v1

    sget-object v2, LUC6$a;->g:LUC6$a;

    if-eq v1, v2, :cond_0

    iget-object v1, p0, LWG6;->m:LIG6;

    sget-object v2, LUC6$a;->e:LUC6$a;

    invoke-interface {v1, v2, p1}, LIG6;->j(LUC6$a;Ljava/lang/String;)I

    :cond_0
    iget-object v1, p0, LWG6;->n:Lm01;

    invoke-interface {v1, p1}, Lm01;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public j()V
    .locals 3

    invoke-virtual {p0}, LWG6;->r()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, LWG6;->m:LIG6;

    iget-object v1, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, LIG6;->b(Ljava/lang/String;)LUC6$a;

    move-result-object v0

    iget-object v1, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->H()LzG6;

    move-result-object v1

    iget-object v2, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v1, v2}, LzG6;->delete(Ljava/lang/String;)V

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LWG6;->m(Z)V

    goto :goto_0

    :cond_0
    sget-object v1, LUC6$a;->c:LUC6$a;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LWG6;->i:Landroidx/work/c$a;

    invoke-virtual {p0, v0}, LWG6;->f(Landroidx/work/c$a;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LUC6$a;->b()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, LWG6;->k()V

    :cond_2
    :goto_0
    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->g()V

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, LEb5;->g()V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, LWG6;->d:Ljava/util/List;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxm5;

    iget-object v2, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v1, v2}, Lxm5;->e(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, LWG6;->j:Landroidx/work/a;

    iget-object v1, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    iget-object v2, p0, LWG6;->d:Ljava/util/List;

    invoke-static {v0, v1, v2}, LEm5;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    :cond_5
    return-void
.end method

.method public final k()V
    .locals 5

    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->c()V

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, LWG6;->m:LIG6;

    sget-object v2, LUC6$a;->b:LUC6$a;

    iget-object v3, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, LIG6;->j(LUC6$a;Ljava/lang/String;)I

    iget-object v1, p0, LWG6;->m:LIG6;

    iget-object v2, p0, LWG6;->c:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-interface {v1, v2, v3, v4}, LIG6;->c(Ljava/lang/String;J)V

    iget-object v1, p0, LWG6;->m:LIG6;

    iget-object v2, p0, LWG6;->c:Ljava/lang/String;

    const-wide/16 v3, -0x1

    invoke-interface {v1, v2, v3, v4}, LIG6;->o(Ljava/lang/String;J)I

    iget-object v1, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, LEb5;->g()V

    invoke-virtual {p0, v0}, LWG6;->m(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, LEb5;->g()V

    invoke-virtual {p0, v0}, LWG6;->m(Z)V

    throw v1
.end method

.method public final l()V
    .locals 5

    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->c()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, LWG6;->m:LIG6;

    iget-object v2, p0, LWG6;->c:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-interface {v1, v2, v3, v4}, LIG6;->c(Ljava/lang/String;J)V

    iget-object v1, p0, LWG6;->m:LIG6;

    sget-object v2, LUC6$a;->b:LUC6$a;

    iget-object v3, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, LIG6;->j(LUC6$a;Ljava/lang/String;)I

    iget-object v1, p0, LWG6;->m:LIG6;

    iget-object v2, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v1, v2}, LIG6;->g(Ljava/lang/String;)I

    iget-object v1, p0, LWG6;->m:LIG6;

    iget-object v2, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v1, v2}, LIG6;->h(Ljava/lang/String;)V

    iget-object v1, p0, LWG6;->m:LIG6;

    iget-object v2, p0, LWG6;->c:Ljava/lang/String;

    const-wide/16 v3, -0x1

    invoke-interface {v1, v2, v3, v4}, LIG6;->o(Ljava/lang/String;J)I

    iget-object v1, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, LEb5;->g()V

    invoke-virtual {p0, v0}, LWG6;->m(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, LEb5;->g()V

    invoke-virtual {p0, v0}, LWG6;->m(Z)V

    throw v1
.end method

.method public final m(Z)V
    .locals 4

    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->I()LIG6;

    move-result-object v0

    invoke-interface {v0}, LIG6;->f()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LWG6;->b:Landroid/content/Context;

    const-class v1, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, LKD3;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, LWG6;->m:LIG6;

    sget-object v1, LUC6$a;->b:LUC6$a;

    iget-object v2, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, LIG6;->j(LUC6$a;Ljava/lang/String;)I

    iget-object v0, p0, LWG6;->m:LIG6;

    iget-object v1, p0, LWG6;->c:Ljava/lang/String;

    const-wide/16 v2, -0x1

    invoke-interface {v0, v1, v2, v3}, LIG6;->o(Ljava/lang/String;J)I

    :cond_1
    iget-object v0, p0, LWG6;->f:LHG6;

    if-eqz v0, :cond_2

    iget-object v0, p0, LWG6;->g:Landroidx/work/c;

    if-eqz v0, :cond_2

    iget-object v0, p0, LWG6;->k:LZw1;

    iget-object v1, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, LZw1;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LWG6;->k:LZw1;

    iget-object v1, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, LZw1;->b(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->g()V

    iget-object v0, p0, LWG6;->q:Lew5;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lew5;->p(Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public final n()V
    .locals 5

    iget-object v0, p0, LWG6;->m:LIG6;

    iget-object v1, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, LIG6;->b(Ljava/lang/String;)LUC6$a;

    move-result-object v0

    sget-object v1, LUC6$a;->c:LUC6$a;

    const-string v2, "Status for "

    if-ne v0, v1, :cond_0

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v0

    sget-object v1, LWG6;->t:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LWG6;->c:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is RUNNING; not doing any work and rescheduling for later execution"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LWG6;->m(Z)V

    goto :goto_0

    :cond_0
    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v1

    sget-object v3, LWG6;->t:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LWG6;->c:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " ; not doing any work"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LWG6;->m(Z)V

    :goto_0
    return-void
.end method

.method public final o()V
    .locals 15

    invoke-virtual {p0}, LWG6;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, LWG6;->f:LHG6;

    iget-object v1, v0, LHG6;->b:LUC6$a;

    sget-object v2, LUC6$a;->b:LUC6$a;

    if-eq v1, v2, :cond_1

    invoke-virtual {p0}, LWG6;->n()V

    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->A()V

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v0

    sget-object v1, LWG6;->t:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, LWG6;->f:LHG6;

    iget-object v3, v3, LHG6;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is not in ENQUEUED state. Nothing more to do"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->g()V

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {v0}, LHG6;->j()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LWG6;->f:LHG6;

    invoke-virtual {v0}, LHG6;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, LWG6;->f:LHG6;

    invoke-virtual {v2}, LHG6;->c()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v0

    sget-object v1, LWG6;->t:Ljava/lang/String;

    const-string v2, "Delaying execution for %s because it is being executed before schedule."

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v5, p0, LWG6;->f:LHG6;

    iget-object v5, v5, LHG6;->c:Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, LWG6;->m(Z)V

    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->A()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->g()V

    return-void

    :cond_3
    :try_start_2
    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->A()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->g()V

    iget-object v0, p0, LWG6;->f:LHG6;

    invoke-virtual {v0}, LHG6;->j()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LWG6;->f:LHG6;

    iget-object v0, v0, LHG6;->e:Landroidx/work/b;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_4
    iget-object v0, p0, LWG6;->j:Landroidx/work/a;

    invoke-virtual {v0}, Landroidx/work/a;->f()Li32;

    move-result-object v0

    iget-object v1, p0, LWG6;->f:LHG6;

    iget-object v1, v1, LHG6;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Li32;->b(Ljava/lang/String;)Lh32;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v0

    sget-object v1, LWG6;->t:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not create Input Merger "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LWG6;->f:LHG6;

    iget-object v3, v3, LHG6;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LBx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, LWG6;->p()V

    return-void

    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, LWG6;->f:LHG6;

    iget-object v2, v2, LHG6;->e:Landroidx/work/b;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, LWG6;->m:LIG6;

    iget-object v3, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v2, v3}, LIG6;->d(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0, v1}, Lh32;->b(Ljava/util/List;)Landroidx/work/b;

    move-result-object v0

    goto :goto_0

    :goto_1
    new-instance v0, Landroidx/work/WorkerParameters;

    iget-object v1, p0, LWG6;->c:Ljava/lang/String;

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    iget-object v4, p0, LWG6;->o:Ljava/util/List;

    iget-object v5, p0, LWG6;->e:Landroidx/work/WorkerParameters$a;

    iget-object v1, p0, LWG6;->f:LHG6;

    iget v6, v1, LHG6;->k:I

    invoke-virtual {v1}, LHG6;->f()I

    move-result v7

    iget-object v1, p0, LWG6;->j:Landroidx/work/a;

    invoke-virtual {v1}, Landroidx/work/a;->d()Ljava/util/concurrent/Executor;

    move-result-object v8

    iget-object v9, p0, LWG6;->h:LmZ5;

    iget-object v1, p0, LWG6;->j:Landroidx/work/a;

    invoke-virtual {v1}, Landroidx/work/a;->n()LQG6;

    move-result-object v10

    new-instance v11, LBG6;

    iget-object v1, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    iget-object v12, p0, LWG6;->h:LmZ5;

    invoke-direct {v11, v1, v12}, LBG6;-><init>(Landroidx/work/impl/WorkDatabase;LmZ5;)V

    new-instance v12, LSC6;

    iget-object v1, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    iget-object v13, p0, LWG6;->k:LZw1;

    iget-object v14, p0, LWG6;->h:LmZ5;

    invoke-direct {v12, v1, v13, v14}, LSC6;-><init>(Landroidx/work/impl/WorkDatabase;LZw1;LmZ5;)V

    move-object v1, v0

    invoke-direct/range {v1 .. v12}, Landroidx/work/WorkerParameters;-><init>(Ljava/util/UUID;Landroidx/work/b;Ljava/util/Collection;Landroidx/work/WorkerParameters$a;IILjava/util/concurrent/Executor;LmZ5;LQG6;LT74;Lsx1;)V

    iget-object v1, p0, LWG6;->g:Landroidx/work/c;

    if-nez v1, :cond_6

    iget-object v1, p0, LWG6;->j:Landroidx/work/a;

    invoke-virtual {v1}, Landroidx/work/a;->n()LQG6;

    move-result-object v1

    iget-object v2, p0, LWG6;->b:Landroid/content/Context;

    iget-object v3, p0, LWG6;->f:LHG6;

    iget-object v3, v3, LHG6;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v0}, LQG6;->b(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/c;

    move-result-object v1

    iput-object v1, p0, LWG6;->g:Landroidx/work/c;

    :cond_6
    iget-object v1, p0, LWG6;->g:Landroidx/work/c;

    if-nez v1, :cond_7

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v0

    sget-object v1, LWG6;->t:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not create Worker "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LWG6;->f:LHG6;

    iget-object v3, v3, LHG6;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LBx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, LWG6;->p()V

    return-void

    :cond_7
    invoke-virtual {v1}, Landroidx/work/c;->l()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v0

    sget-object v1, LWG6;->t:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Received an already-used Worker "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LWG6;->f:LHG6;

    iget-object v3, v3, LHG6;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "; Worker Factory should return new instances"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LBx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, LWG6;->p()V

    return-void

    :cond_8
    iget-object v1, p0, LWG6;->g:Landroidx/work/c;

    invoke-virtual {v1}, Landroidx/work/c;->n()V

    invoke-virtual {p0}, LWG6;->s()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {p0}, LWG6;->r()Z

    move-result v1

    if-eqz v1, :cond_9

    return-void

    :cond_9
    new-instance v1, LRC6;

    iget-object v3, p0, LWG6;->b:Landroid/content/Context;

    iget-object v4, p0, LWG6;->f:LHG6;

    iget-object v5, p0, LWG6;->g:Landroidx/work/c;

    invoke-virtual {v0}, Landroidx/work/WorkerParameters;->b()Lsx1;

    move-result-object v6

    iget-object v7, p0, LWG6;->h:LmZ5;

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, LRC6;-><init>(Landroid/content/Context;LHG6;Landroidx/work/c;Lsx1;LmZ5;)V

    iget-object v0, p0, LWG6;->h:LmZ5;

    invoke-interface {v0}, LmZ5;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, LRC6;->b()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    iget-object v1, p0, LWG6;->r:Lew5;

    new-instance v2, LVG6;

    invoke-direct {v2, p0, v0}, LVG6;-><init>(LWG6;Lcom/google/common/util/concurrent/ListenableFuture;)V

    new-instance v3, LSX5;

    invoke-direct {v3}, LSX5;-><init>()V

    invoke-virtual {v1, v2, v3}, Lw0;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    new-instance v1, LWG6$a;

    invoke-direct {v1, p0, v0}, LWG6$a;-><init>(LWG6;Lcom/google/common/util/concurrent/ListenableFuture;)V

    iget-object v2, p0, LWG6;->h:LmZ5;

    invoke-interface {v2}, LmZ5;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, LWG6;->p:Ljava/lang/String;

    iget-object v1, p0, LWG6;->r:Lew5;

    new-instance v2, LWG6$b;

    invoke-direct {v2, p0, v0}, LWG6$b;-><init>(LWG6;Ljava/lang/String;)V

    iget-object v0, p0, LWG6;->h:LmZ5;

    invoke-interface {v0}, LmZ5;->c()LRs5;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lw0;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_2

    :cond_a
    invoke-virtual {p0}, LWG6;->n()V

    :goto_2
    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, LEb5;->g()V

    throw v0
.end method

.method public p()V
    .locals 4

    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->c()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, LWG6;->c:Ljava/lang/String;

    invoke-virtual {p0, v1}, LWG6;->h(Ljava/lang/String;)V

    iget-object v1, p0, LWG6;->i:Landroidx/work/c$a;

    check-cast v1, Landroidx/work/c$a$a;

    invoke-virtual {v1}, Landroidx/work/c$a$a;->e()Landroidx/work/b;

    move-result-object v1

    iget-object v2, p0, LWG6;->m:LIG6;

    iget-object v3, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v2, v3, v1}, LIG6;->s(Ljava/lang/String;Landroidx/work/b;)V

    iget-object v1, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, LEb5;->g()V

    invoke-virtual {p0, v0}, LWG6;->m(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, LEb5;->g()V

    invoke-virtual {p0, v0}, LWG6;->m(Z)V

    throw v1
.end method

.method public final q()V
    .locals 9

    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->c()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, LWG6;->m:LIG6;

    sget-object v2, LUC6$a;->d:LUC6$a;

    iget-object v3, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, LIG6;->j(LUC6$a;Ljava/lang/String;)I

    iget-object v1, p0, LWG6;->i:Landroidx/work/c$a;

    check-cast v1, Landroidx/work/c$a$c;

    invoke-virtual {v1}, Landroidx/work/c$a$c;->e()Landroidx/work/b;

    move-result-object v1

    iget-object v2, p0, LWG6;->m:LIG6;

    iget-object v3, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v2, v3, v1}, LIG6;->s(Ljava/lang/String;Landroidx/work/b;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v3, p0, LWG6;->n:Lm01;

    iget-object v4, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v3, v4}, Lm01;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, p0, LWG6;->m:LIG6;

    invoke-interface {v5, v4}, LIG6;->b(Ljava/lang/String;)LUC6$a;

    move-result-object v5

    sget-object v6, LUC6$a;->f:LUC6$a;

    if-ne v5, v6, :cond_0

    iget-object v5, p0, LWG6;->n:Lm01;

    invoke-interface {v5, v4}, Lm01;->b(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v5

    sget-object v6, LWG6;->t:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Setting status to enqueued for "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, LBx2;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, p0, LWG6;->m:LIG6;

    sget-object v6, LUC6$a;->b:LUC6$a;

    invoke-interface {v5, v6, v4}, LIG6;->j(LUC6$a;Ljava/lang/String;)I

    iget-object v5, p0, LWG6;->m:LIG6;

    invoke-interface {v5, v4, v1, v2}, LIG6;->c(Ljava/lang/String;J)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, LEb5;->g()V

    invoke-virtual {p0, v0}, LWG6;->m(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, LEb5;->g()V

    invoke-virtual {p0, v0}, LWG6;->m(Z)V

    throw v1
.end method

.method public final r()Z
    .locals 5

    iget-boolean v0, p0, LWG6;->s:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v0

    sget-object v2, LWG6;->t:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Work interrupted for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, LWG6;->p:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LWG6;->m:LIG6;

    iget-object v2, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v0, v2}, LIG6;->b(Ljava/lang/String;)LUC6$a;

    move-result-object v0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0, v1}, LWG6;->m(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LUC6$a;->b()Z

    move-result v0

    xor-int/2addr v0, v2

    invoke-virtual {p0, v0}, LWG6;->m(Z)V

    :goto_0
    return v2

    :cond_1
    return v1
.end method

.method public run()V
    .locals 1

    iget-object v0, p0, LWG6;->o:Ljava/util/List;

    invoke-virtual {p0, v0}, LWG6;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LWG6;->p:Ljava/lang/String;

    invoke-virtual {p0}, LWG6;->o()V

    return-void
.end method

.method public final s()Z
    .locals 3

    iget-object v0, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, LWG6;->m:LIG6;

    iget-object v1, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, LIG6;->b(Ljava/lang/String;)LUC6$a;

    move-result-object v0

    sget-object v1, LUC6$a;->b:LUC6$a;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LWG6;->m:LIG6;

    sget-object v1, LUC6$a;->c:LUC6$a;

    iget-object v2, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, LIG6;->j(LUC6$a;Ljava/lang/String;)I

    iget-object v0, p0, LWG6;->m:LIG6;

    iget-object v1, p0, LWG6;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, LIG6;->u(Ljava/lang/String;)I

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, LEb5;->g()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, LWG6;->l:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, LEb5;->g()V

    throw v0
.end method
