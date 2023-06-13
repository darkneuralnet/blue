.class public final Lio/reactivex/internal/operators/flowable/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/o;
.implements LoT5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/f$a$a;,
        Lio/reactivex/internal/operators/flowable/f$a$b;,
        Lio/reactivex/internal/operators/flowable/f$a$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/o<",
        "TT;>;",
        "LoT5;"
    }
.end annotation


# instance fields
.field public final b:LhT5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhT5<",
            "-TT;>;"
        }
    .end annotation
.end field

.field public final c:J

.field public final d:Ljava/util/concurrent/TimeUnit;

.field public final e:Lio/reactivex/E$c;

.field public final f:Z

.field public g:LoT5;


# direct methods
.method public constructor <init>(LhT5;JLjava/util/concurrent/TimeUnit;Lio/reactivex/E$c;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/E$c;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/f$a;->b:LhT5;

    iput-wide p2, p0, Lio/reactivex/internal/operators/flowable/f$a;->c:J

    iput-object p4, p0, Lio/reactivex/internal/operators/flowable/f$a;->d:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lio/reactivex/internal/operators/flowable/f$a;->e:Lio/reactivex/E$c;

    iput-boolean p6, p0, Lio/reactivex/internal/operators/flowable/f$a;->f:Z

    return-void
.end method


# virtual methods
.method public a(LoT5;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/f$a;->g:LoT5;

    invoke-static {v0, p1}, Lio/reactivex/internal/subscriptions/g;->i(LoT5;LoT5;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/f$a;->g:LoT5;

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/f$a;->b:LhT5;

    invoke-interface {p1, p0}, LhT5;->a(LoT5;)V

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/f$a;->g:LoT5;

    invoke-interface {v0}, LoT5;->cancel()V

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/f$a;->e:Lio/reactivex/E$c;

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    return-void
.end method

.method public o(J)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/f$a;->g:LoT5;

    invoke-interface {v0, p1, p2}, LoT5;->o(J)V

    return-void
.end method

.method public onComplete()V
    .locals 5

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/f$a;->e:Lio/reactivex/E$c;

    new-instance v1, Lio/reactivex/internal/operators/flowable/f$a$a;

    invoke-direct {v1, p0}, Lio/reactivex/internal/operators/flowable/f$a$a;-><init>(Lio/reactivex/internal/operators/flowable/f$a;)V

    iget-wide v2, p0, Lio/reactivex/internal/operators/flowable/f$a;->c:J

    iget-object v4, p0, Lio/reactivex/internal/operators/flowable/f$a;->d:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3, v4}, Lio/reactivex/E$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 4

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/f$a;->e:Lio/reactivex/E$c;

    new-instance v1, Lio/reactivex/internal/operators/flowable/f$a$b;

    invoke-direct {v1, p0, p1}, Lio/reactivex/internal/operators/flowable/f$a$b;-><init>(Lio/reactivex/internal/operators/flowable/f$a;Ljava/lang/Throwable;)V

    iget-boolean p1, p0, Lio/reactivex/internal/operators/flowable/f$a;->f:Z

    if-eqz p1, :cond_0

    iget-wide v2, p0, Lio/reactivex/internal/operators/flowable/f$a;->c:J

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x0

    :goto_0
    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/f$a;->d:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3, p1}, Lio/reactivex/E$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/f$a;->e:Lio/reactivex/E$c;

    new-instance v1, Lio/reactivex/internal/operators/flowable/f$a$c;

    invoke-direct {v1, p0, p1}, Lio/reactivex/internal/operators/flowable/f$a$c;-><init>(Lio/reactivex/internal/operators/flowable/f$a;Ljava/lang/Object;)V

    iget-wide v2, p0, Lio/reactivex/internal/operators/flowable/f$a;->c:J

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/f$a;->d:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3, p1}, Lio/reactivex/E$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;

    return-void
.end method
