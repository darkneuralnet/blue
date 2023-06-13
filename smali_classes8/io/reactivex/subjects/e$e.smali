.class public final Lio/reactivex/subjects/e$e;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/subjects/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/subjects/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Ljava/lang/Object;",
        ">;",
        "Lio/reactivex/subjects/e$a<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0xa2f4068c73be4b3L


# instance fields
.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public volatile c:Z

.field public volatile d:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const-string v1, "capacityHint"

    invoke-static {p1, v1}, Lio/reactivex/internal/functions/b;->f(ILjava/lang/String;)I

    move-result p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lio/reactivex/subjects/e$e;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/subjects/e$e;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lio/reactivex/subjects/e$e;->c()V

    iget p1, p0, Lio/reactivex/subjects/e$e;->d:I

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iput p1, p0, Lio/reactivex/subjects/e$e;->d:I

    iput-boolean v0, p0, Lio/reactivex/subjects/e$e;->c:Z

    return-void
.end method

.method public add(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/subjects/e$e;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget p1, p0, Lio/reactivex/subjects/e$e;->d:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lio/reactivex/subjects/e$e;->d:I

    return-void
.end method

.method public b(Lio/reactivex/subjects/e$b;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/subjects/e$b<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/reactivex/subjects/e$e;->b:Ljava/util/List;

    iget-object v1, p1, Lio/reactivex/subjects/e$b;->b:Lio/reactivex/D;

    iget-object v2, p1, Lio/reactivex/subjects/e$b;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, p1, Lio/reactivex/subjects/e$b;->d:Ljava/lang/Object;

    :goto_0
    move v4, v3

    :cond_2
    :goto_1
    iget-boolean v5, p1, Lio/reactivex/subjects/e$b;->e:Z

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    iput-object v6, p1, Lio/reactivex/subjects/e$b;->d:Ljava/lang/Object;

    return-void

    :cond_3
    iget v5, p0, Lio/reactivex/subjects/e$e;->d:I

    :goto_2
    if-eq v5, v2, :cond_7

    iget-boolean v7, p1, Lio/reactivex/subjects/e$b;->e:Z

    if-eqz v7, :cond_4

    iput-object v6, p1, Lio/reactivex/subjects/e$b;->d:Ljava/lang/Object;

    return-void

    :cond_4
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    iget-boolean v8, p0, Lio/reactivex/subjects/e$e;->c:Z

    if-eqz v8, :cond_6

    add-int/lit8 v8, v2, 0x1

    if-ne v8, v5, :cond_6

    iget v5, p0, Lio/reactivex/subjects/e$e;->d:I

    if-ne v8, v5, :cond_6

    invoke-static {v7}, Lio/reactivex/internal/util/n;->j(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Lio/reactivex/D;->onComplete()V

    goto :goto_3

    :cond_5
    invoke-static {v7}, Lio/reactivex/internal/util/n;->h(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v1, v0}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    :goto_3
    iput-object v6, p1, Lio/reactivex/subjects/e$b;->d:Ljava/lang/Object;

    iput-boolean v3, p1, Lio/reactivex/subjects/e$b;->e:Z

    return-void

    :cond_6
    invoke-interface {v1, v7}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    iget v5, p0, Lio/reactivex/subjects/e$e;->d:I

    if-eq v2, v5, :cond_8

    goto :goto_1

    :cond_8
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, p1, Lio/reactivex/subjects/e$b;->d:Ljava/lang/Object;

    neg-int v4, v4

    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v4

    if-nez v4, :cond_2

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method
