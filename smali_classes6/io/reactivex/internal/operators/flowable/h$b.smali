.class public final Lio/reactivex/internal/operators/flowable/h$b;
.super Lio/reactivex/internal/subscribers/b;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/internal/fuseable/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "K:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/internal/subscribers/b<",
        "TT;TT;>;",
        "Lio/reactivex/internal/fuseable/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final g:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-TT;TK;>;"
        }
    .end annotation
.end field

.field public final h:Lio/reactivex/functions/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/d<",
            "-TK;-TK;>;"
        }
    .end annotation
.end field

.field public i:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field public j:Z


# direct methods
.method public constructor <init>(LhT5;Lio/reactivex/functions/o;Lio/reactivex/functions/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;",
            "Lio/reactivex/functions/o<",
            "-TT;TK;>;",
            "Lio/reactivex/functions/d<",
            "-TK;-TK;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/reactivex/internal/subscribers/b;-><init>(LhT5;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/h$b;->g:Lio/reactivex/functions/o;

    iput-object p3, p0, Lio/reactivex/internal/operators/flowable/h$b;->h:Lio/reactivex/functions/d;

    return-void
.end method


# virtual methods
.method public b(I)I
    .locals 0

    invoke-virtual {p0, p1}, Lio/reactivex/internal/subscribers/b;->f(I)I

    move-result p1

    return p1
.end method

.method public h(Ljava/lang/Object;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-boolean v0, p0, Lio/reactivex/internal/subscribers/b;->e:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lio/reactivex/internal/subscribers/b;->f:I

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/reactivex/internal/subscribers/b;->b:LhT5;

    invoke-interface {v0, p1}, LhT5;->onNext(Ljava/lang/Object;)V

    return v2

    :cond_1
    :try_start_0
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/h$b;->g:Lio/reactivex/functions/o;

    invoke-interface {v0, p1}, Lio/reactivex/functions/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-boolean v3, p0, Lio/reactivex/internal/operators/flowable/h$b;->j:Z

    if-eqz v3, :cond_2

    iget-object v3, p0, Lio/reactivex/internal/operators/flowable/h$b;->h:Lio/reactivex/functions/d;

    iget-object v4, p0, Lio/reactivex/internal/operators/flowable/h$b;->i:Ljava/lang/Object;

    invoke-interface {v3, v4, v0}, Lio/reactivex/functions/d;->test(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    iput-object v0, p0, Lio/reactivex/internal/operators/flowable/h$b;->i:Ljava/lang/Object;

    if-eqz v3, :cond_3

    return v1

    :cond_2
    iput-boolean v2, p0, Lio/reactivex/internal/operators/flowable/h$b;->j:Z

    iput-object v0, p0, Lio/reactivex/internal/operators/flowable/h$b;->i:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    iget-object v0, p0, Lio/reactivex/internal/subscribers/b;->b:LhT5;

    invoke-interface {v0, p1}, LhT5;->onNext(Ljava/lang/Object;)V

    return v2

    :catchall_0
    move-exception p1

    invoke-virtual {p0, p1}, Lio/reactivex/internal/subscribers/b;->e(Ljava/lang/Throwable;)V

    return v2
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lio/reactivex/internal/operators/flowable/h$b;->h(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/reactivex/internal/subscribers/b;->c:LoT5;

    const-wide/16 v0, 0x1

    invoke-interface {p1, v0, v1}, LoT5;->o(J)V

    :cond_0
    return-void
.end method

.method public poll()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    :cond_0
    :goto_0
    iget-object v0, p0, Lio/reactivex/internal/subscribers/b;->d:Lio/reactivex/internal/fuseable/g;

    invoke-interface {v0}, Lio/reactivex/internal/fuseable/j;->poll()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/h$b;->g:Lio/reactivex/functions/o;

    invoke-interface {v1, v0}, Lio/reactivex/functions/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-boolean v2, p0, Lio/reactivex/internal/operators/flowable/h$b;->j:Z

    const/4 v3, 0x1

    if-nez v2, :cond_2

    iput-boolean v3, p0, Lio/reactivex/internal/operators/flowable/h$b;->j:Z

    iput-object v1, p0, Lio/reactivex/internal/operators/flowable/h$b;->i:Ljava/lang/Object;

    return-object v0

    :cond_2
    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/h$b;->h:Lio/reactivex/functions/d;

    iget-object v4, p0, Lio/reactivex/internal/operators/flowable/h$b;->i:Ljava/lang/Object;

    invoke-interface {v2, v4, v1}, Lio/reactivex/functions/d;->test(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    iput-object v1, p0, Lio/reactivex/internal/operators/flowable/h$b;->i:Ljava/lang/Object;

    return-object v0

    :cond_3
    iput-object v1, p0, Lio/reactivex/internal/operators/flowable/h$b;->i:Ljava/lang/Object;

    iget v0, p0, Lio/reactivex/internal/subscribers/b;->f:I

    if-eq v0, v3, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/subscribers/b;->c:LoT5;

    const-wide/16 v1, 0x1

    invoke-interface {v0, v1, v2}, LoT5;->o(J)V

    goto :goto_0
.end method
