.class public final Lio/reactivex/internal/schedulers/b$a;
.super Lio/reactivex/E$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/schedulers/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final b:Lio/reactivex/internal/disposables/f;

.field public final c:Lio/reactivex/disposables/b;

.field public final d:Lio/reactivex/internal/disposables/f;

.field public final e:Lio/reactivex/internal/schedulers/b$c;

.field public volatile f:Z


# direct methods
.method public constructor <init>(Lio/reactivex/internal/schedulers/b$c;)V
    .locals 2

    invoke-direct {p0}, Lio/reactivex/E$c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/schedulers/b$a;->e:Lio/reactivex/internal/schedulers/b$c;

    new-instance p1, Lio/reactivex/internal/disposables/f;

    invoke-direct {p1}, Lio/reactivex/internal/disposables/f;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/schedulers/b$a;->b:Lio/reactivex/internal/disposables/f;

    new-instance v0, Lio/reactivex/disposables/b;

    invoke-direct {v0}, Lio/reactivex/disposables/b;-><init>()V

    iput-object v0, p0, Lio/reactivex/internal/schedulers/b$a;->c:Lio/reactivex/disposables/b;

    new-instance v1, Lio/reactivex/internal/disposables/f;

    invoke-direct {v1}, Lio/reactivex/internal/disposables/f;-><init>()V

    iput-object v1, p0, Lio/reactivex/internal/schedulers/b$a;->d:Lio/reactivex/internal/disposables/f;

    invoke-virtual {v1, p1}, Lio/reactivex/internal/disposables/f;->c(Lio/reactivex/disposables/c;)Z

    invoke-virtual {v1, v0}, Lio/reactivex/internal/disposables/f;->c(Lio/reactivex/disposables/c;)Z

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Runnable;)Lio/reactivex/disposables/c;
    .locals 6

    iget-boolean v0, p0, Lio/reactivex/internal/schedulers/b$a;->f:Z

    if-eqz v0, :cond_0

    sget-object p1, Lio/reactivex/internal/disposables/e;->b:Lio/reactivex/internal/disposables/e;

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/schedulers/b$a;->e:Lio/reactivex/internal/schedulers/b$c;

    const-wide/16 v2, 0x0

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v5, p0, Lio/reactivex/internal/schedulers/b$a;->b:Lio/reactivex/internal/disposables/f;

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lio/reactivex/internal/schedulers/h;->g(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lio/reactivex/internal/disposables/c;)Lio/reactivex/internal/schedulers/m;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lio/reactivex/disposables/c;
    .locals 6

    iget-boolean v0, p0, Lio/reactivex/internal/schedulers/b$a;->f:Z

    if-eqz v0, :cond_0

    sget-object p1, Lio/reactivex/internal/disposables/e;->b:Lio/reactivex/internal/disposables/e;

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/schedulers/b$a;->e:Lio/reactivex/internal/schedulers/b$c;

    iget-object v5, p0, Lio/reactivex/internal/schedulers/b$a;->c:Lio/reactivex/disposables/b;

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lio/reactivex/internal/schedulers/h;->g(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lio/reactivex/internal/disposables/c;)Lio/reactivex/internal/schedulers/m;

    move-result-object p1

    return-object p1
.end method

.method public dispose()V
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/internal/schedulers/b$a;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/schedulers/b$a;->f:Z

    iget-object v0, p0, Lio/reactivex/internal/schedulers/b$a;->d:Lio/reactivex/internal/disposables/f;

    invoke-virtual {v0}, Lio/reactivex/internal/disposables/f;->dispose()V

    :cond_0
    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/internal/schedulers/b$a;->f:Z

    return v0
.end method
