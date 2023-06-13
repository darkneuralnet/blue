.class public final Lio/reactivex/internal/schedulers/f$b;
.super Lio/reactivex/E$c;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/schedulers/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final b:Lio/reactivex/disposables/b;

.field public final c:Lio/reactivex/internal/schedulers/f$a;

.field public final d:Lio/reactivex/internal/schedulers/f$c;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/schedulers/f$a;)V
    .locals 1

    invoke-direct {p0}, Lio/reactivex/E$c;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lio/reactivex/internal/schedulers/f$b;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lio/reactivex/internal/schedulers/f$b;->c:Lio/reactivex/internal/schedulers/f$a;

    new-instance v0, Lio/reactivex/disposables/b;

    invoke-direct {v0}, Lio/reactivex/disposables/b;-><init>()V

    iput-object v0, p0, Lio/reactivex/internal/schedulers/f$b;->b:Lio/reactivex/disposables/b;

    invoke-virtual {p1}, Lio/reactivex/internal/schedulers/f$a;->b()Lio/reactivex/internal/schedulers/f$c;

    move-result-object p1

    iput-object p1, p0, Lio/reactivex/internal/schedulers/f$b;->d:Lio/reactivex/internal/schedulers/f$c;

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;
    .locals 6

    iget-object v0, p0, Lio/reactivex/internal/schedulers/f$b;->b:Lio/reactivex/disposables/b;

    invoke-virtual {v0}, Lio/reactivex/disposables/b;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lio/reactivex/internal/disposables/e;->b:Lio/reactivex/internal/disposables/e;

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/schedulers/f$b;->d:Lio/reactivex/internal/schedulers/f$c;

    iget-object v5, p0, Lio/reactivex/internal/schedulers/f$b;->b:Lio/reactivex/disposables/b;

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lio/reactivex/internal/schedulers/h;->g(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lio/reactivex/internal/disposables/c;)Lio/reactivex/internal/schedulers/m;

    move-result-object p1

    return-object p1
.end method

.method public dispose()V
    .locals 7

    iget-object v0, p0, Lio/reactivex/internal/schedulers/f$b;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/reactivex/internal/schedulers/f$b;->b:Lio/reactivex/disposables/b;

    invoke-virtual {v0}, Lio/reactivex/disposables/b;->dispose()V

    sget-boolean v0, Lio/reactivex/internal/schedulers/f;->k:Z

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/reactivex/internal/schedulers/f$b;->d:Lio/reactivex/internal/schedulers/f$c;

    const-wide/16 v3, 0x0

    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v6, 0x0

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Lio/reactivex/internal/schedulers/h;->g(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lio/reactivex/internal/disposables/c;)Lio/reactivex/internal/schedulers/m;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/schedulers/f$b;->c:Lio/reactivex/internal/schedulers/f$a;

    iget-object v1, p0, Lio/reactivex/internal/schedulers/f$b;->d:Lio/reactivex/internal/schedulers/f$c;

    invoke-virtual {v0, v1}, Lio/reactivex/internal/schedulers/f$a;->d(Lio/reactivex/internal/schedulers/f$c;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/schedulers/f$b;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/schedulers/f$b;->c:Lio/reactivex/internal/schedulers/f$a;

    iget-object v1, p0, Lio/reactivex/internal/schedulers/f$b;->d:Lio/reactivex/internal/schedulers/f$c;

    invoke-virtual {v0, v1}, Lio/reactivex/internal/schedulers/f$a;->d(Lio/reactivex/internal/schedulers/f$c;)V

    return-void
.end method
