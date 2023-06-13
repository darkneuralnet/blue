.class public final Lio/reactivex/internal/operators/observable/L1$c;
.super Lio/reactivex/internal/observers/t;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/disposables/c;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/L1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/L1$c$a;,
        Lio/reactivex/internal/operators/observable/L1$c$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/observers/t<",
        "TT;",
        "Ljava/lang/Object;",
        "Lio/reactivex/Observable<",
        "TT;>;>;",
        "Lio/reactivex/disposables/c;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final h:J

.field public final i:J

.field public final j:Ljava/util/concurrent/TimeUnit;

.field public final k:Lio/reactivex/E$c;

.field public final l:I

.field public final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/reactivex/subjects/i<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public n:Lio/reactivex/disposables/c;

.field public volatile o:Z


# direct methods
.method public constructor <init>(Lio/reactivex/D;JJLjava/util/concurrent/TimeUnit;Lio/reactivex/E$c;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-",
            "Lio/reactivex/Observable<",
            "TT;>;>;JJ",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E$c;",
            "I)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/queue/a;

    invoke-direct {v0}, Lio/reactivex/internal/queue/a;-><init>()V

    invoke-direct {p0, p1, v0}, Lio/reactivex/internal/observers/t;-><init>(Lio/reactivex/D;Lio/reactivex/internal/fuseable/i;)V

    iput-wide p2, p0, Lio/reactivex/internal/operators/observable/L1$c;->h:J

    iput-wide p4, p0, Lio/reactivex/internal/operators/observable/L1$c;->i:J

    iput-object p6, p0, Lio/reactivex/internal/operators/observable/L1$c;->j:Ljava/util/concurrent/TimeUnit;

    iput-object p7, p0, Lio/reactivex/internal/operators/observable/L1$c;->k:Lio/reactivex/E$c;

    iput p8, p0, Lio/reactivex/internal/operators/observable/L1$c;->l:I

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/L1$c;->m:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/observers/t;->e:Z

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/internal/observers/t;->e:Z

    return v0
.end method

.method public k(Lio/reactivex/subjects/i;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/subjects/i<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/observers/t;->d:Lio/reactivex/internal/fuseable/i;

    new-instance v1, Lio/reactivex/internal/operators/observable/L1$c$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lio/reactivex/internal/operators/observable/L1$c$b;-><init>(Lio/reactivex/subjects/i;Z)V

    invoke-interface {v0, v1}, Lio/reactivex/internal/fuseable/j;->offer(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lio/reactivex/internal/observers/t;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/L1$c;->l()V

    :cond_0
    return-void
.end method

.method public l()V
    .locals 10

    iget-object v0, p0, Lio/reactivex/internal/observers/t;->d:Lio/reactivex/internal/fuseable/i;

    check-cast v0, Lio/reactivex/internal/queue/a;

    iget-object v1, p0, Lio/reactivex/internal/observers/t;->c:Lio/reactivex/D;

    iget-object v2, p0, Lio/reactivex/internal/operators/observable/L1$c;->m:Ljava/util/List;

    const/4 v3, 0x1

    move v4, v3

    :cond_0
    :goto_0
    iget-boolean v5, p0, Lio/reactivex/internal/operators/observable/L1$c;->o:Z

    if-eqz v5, :cond_1

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/L1$c;->n:Lio/reactivex/disposables/c;

    invoke-interface {v1}, Lio/reactivex/disposables/c;->dispose()V

    invoke-virtual {v0}, Lio/reactivex/internal/queue/a;->clear()V

    invoke-interface {v2}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/L1$c;->k:Lio/reactivex/E$c;

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    return-void

    :cond_1
    iget-boolean v5, p0, Lio/reactivex/internal/observers/t;->f:Z

    invoke-virtual {v0}, Lio/reactivex/internal/queue/a;->poll()Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_2

    move v7, v3

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    :goto_1
    instance-of v8, v6, Lio/reactivex/internal/operators/observable/L1$c$b;

    if-eqz v5, :cond_6

    if-nez v7, :cond_3

    if-eqz v8, :cond_6

    :cond_3
    invoke-virtual {v0}, Lio/reactivex/internal/queue/a;->clear()V

    iget-object v0, p0, Lio/reactivex/internal/observers/t;->g:Ljava/lang/Throwable;

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/reactivex/subjects/i;

    invoke-virtual {v3, v0}, Lio/reactivex/subjects/i;->onError(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_4
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/reactivex/subjects/i;

    invoke-virtual {v1}, Lio/reactivex/subjects/i;->onComplete()V

    goto :goto_3

    :cond_5
    invoke-interface {v2}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/L1$c;->k:Lio/reactivex/E$c;

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    return-void

    :cond_6
    if-eqz v7, :cond_7

    neg-int v4, v4

    invoke-virtual {p0, v4}, Lio/reactivex/internal/observers/t;->b(I)I

    move-result v4

    if-nez v4, :cond_0

    return-void

    :cond_7
    if-eqz v8, :cond_a

    check-cast v6, Lio/reactivex/internal/operators/observable/L1$c$b;

    iget-boolean v5, v6, Lio/reactivex/internal/operators/observable/L1$c$b;->b:Z

    if-eqz v5, :cond_9

    iget-boolean v5, p0, Lio/reactivex/internal/observers/t;->e:Z

    if-eqz v5, :cond_8

    goto :goto_0

    :cond_8
    iget v5, p0, Lio/reactivex/internal/operators/observable/L1$c;->l:I

    invoke-static {v5}, Lio/reactivex/subjects/i;->e(I)Lio/reactivex/subjects/i;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v5}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    iget-object v6, p0, Lio/reactivex/internal/operators/observable/L1$c;->k:Lio/reactivex/E$c;

    new-instance v7, Lio/reactivex/internal/operators/observable/L1$c$a;

    invoke-direct {v7, p0, v5}, Lio/reactivex/internal/operators/observable/L1$c$a;-><init>(Lio/reactivex/internal/operators/observable/L1$c;Lio/reactivex/subjects/i;)V

    iget-wide v8, p0, Lio/reactivex/internal/operators/observable/L1$c;->h:J

    iget-object v5, p0, Lio/reactivex/internal/operators/observable/L1$c;->j:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v6, v7, v8, v9, v5}, Lio/reactivex/E$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    goto/16 :goto_0

    :cond_9
    iget-object v5, v6, Lio/reactivex/internal/operators/observable/L1$c$b;->a:Lio/reactivex/subjects/i;

    invoke-interface {v2, v5}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v5, v6, Lio/reactivex/internal/operators/observable/L1$c$b;->a:Lio/reactivex/subjects/i;

    invoke-virtual {v5}, Lio/reactivex/subjects/i;->onComplete()V

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    iget-boolean v5, p0, Lio/reactivex/internal/observers/t;->e:Z

    if-eqz v5, :cond_0

    iput-boolean v3, p0, Lio/reactivex/internal/operators/observable/L1$c;->o:Z

    goto/16 :goto_0

    :cond_a
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/reactivex/subjects/i;

    invoke-virtual {v7, v6}, Lio/reactivex/subjects/i;->onNext(Ljava/lang/Object;)V

    goto :goto_4
.end method

.method public onComplete()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/observers/t;->f:Z

    invoke-virtual {p0}, Lio/reactivex/internal/observers/t;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/L1$c;->l()V

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/observers/t;->c:Lio/reactivex/D;

    invoke-interface {v0}, Lio/reactivex/D;->onComplete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iput-object p1, p0, Lio/reactivex/internal/observers/t;->g:Ljava/lang/Throwable;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/observers/t;->f:Z

    invoke-virtual {p0}, Lio/reactivex/internal/observers/t;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/L1$c;->l()V

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/observers/t;->c:Lio/reactivex/D;

    invoke-interface {v0, p1}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lio/reactivex/internal/observers/t;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/L1$c;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/reactivex/subjects/i;

    invoke-virtual {v1, p1}, Lio/reactivex/subjects/i;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Lio/reactivex/internal/observers/t;->b(I)I

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_1
    iget-object v0, p0, Lio/reactivex/internal/observers/t;->d:Lio/reactivex/internal/fuseable/i;

    invoke-interface {v0, p1}, Lio/reactivex/internal/fuseable/j;->offer(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lio/reactivex/internal/observers/t;->a()Z

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/L1$c;->l()V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 11

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/L1$c;->n:Lio/reactivex/disposables/c;

    invoke-static {v0, p1}, Lio/reactivex/internal/disposables/d;->j(Lio/reactivex/disposables/c;Lio/reactivex/disposables/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/L1$c;->n:Lio/reactivex/disposables/c;

    iget-object p1, p0, Lio/reactivex/internal/observers/t;->c:Lio/reactivex/D;

    invoke-interface {p1, p0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-boolean p1, p0, Lio/reactivex/internal/observers/t;->e:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget p1, p0, Lio/reactivex/internal/operators/observable/L1$c;->l:I

    invoke-static {p1}, Lio/reactivex/subjects/i;->e(I)Lio/reactivex/subjects/i;

    move-result-object p1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/L1$c;->m:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/reactivex/internal/observers/t;->c:Lio/reactivex/D;

    invoke-interface {v0, p1}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/L1$c;->k:Lio/reactivex/E$c;

    new-instance v1, Lio/reactivex/internal/operators/observable/L1$c$a;

    invoke-direct {v1, p0, p1}, Lio/reactivex/internal/operators/observable/L1$c$a;-><init>(Lio/reactivex/internal/operators/observable/L1$c;Lio/reactivex/subjects/i;)V

    iget-wide v2, p0, Lio/reactivex/internal/operators/observable/L1$c;->h:J

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/L1$c;->j:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3, p1}, Lio/reactivex/E$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    iget-object v4, p0, Lio/reactivex/internal/operators/observable/L1$c;->k:Lio/reactivex/E$c;

    iget-wide v8, p0, Lio/reactivex/internal/operators/observable/L1$c;->i:J

    iget-object v10, p0, Lio/reactivex/internal/operators/observable/L1$c;->j:Ljava/util/concurrent/TimeUnit;

    move-object v5, p0

    move-wide v6, v8

    invoke-virtual/range {v4 .. v10}, Lio/reactivex/E$c;->d(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    :cond_1
    return-void
.end method

.method public run()V
    .locals 3

    iget v0, p0, Lio/reactivex/internal/operators/observable/L1$c;->l:I

    invoke-static {v0}, Lio/reactivex/subjects/i;->e(I)Lio/reactivex/subjects/i;

    move-result-object v0

    new-instance v1, Lio/reactivex/internal/operators/observable/L1$c$b;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lio/reactivex/internal/operators/observable/L1$c$b;-><init>(Lio/reactivex/subjects/i;Z)V

    iget-boolean v0, p0, Lio/reactivex/internal/observers/t;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/observers/t;->d:Lio/reactivex/internal/fuseable/i;

    invoke-interface {v0, v1}, Lio/reactivex/internal/fuseable/j;->offer(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0}, Lio/reactivex/internal/observers/t;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/reactivex/internal/operators/observable/L1$c;->l()V

    :cond_1
    return-void
.end method
