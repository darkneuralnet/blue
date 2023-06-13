.class public final LGn7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LlT8;

.field public final b:LlT8;

.field public final c:LlT8;

.field public final d:Ljava/lang/String;

.field public final e:Laz9;

.field public f:J

.field public g:J

.field public final h:LFn7;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    new-instance p1, LFn7;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, LFn7;-><init>(LEn7;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, LlT8;

    invoke-direct {p2}, LlT8;-><init>()V

    iput-object p2, p0, LGn7;->a:LlT8;

    new-instance p2, LlT8;

    invoke-direct {p2}, LlT8;-><init>()V

    iput-object p2, p0, LGn7;->b:LlT8;

    new-instance p2, LlT8;

    invoke-direct {p2}, LlT8;-><init>()V

    iput-object p2, p0, LGn7;->c:LlT8;

    const-string p2, "com.google.perception"

    iput-object p2, p0, LGn7;->d:Ljava/lang/String;

    sget-object p2, Laz9;->d:Laz9;

    iput-object p2, p0, LGn7;->e:Laz9;

    iput-object p1, p0, LGn7;->h:LFn7;

    return-void
.end method


# virtual methods
.method public final a()LZy9;
    .locals 7

    iget-wide v0, p0, LGn7;->f:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v4

    :goto_0
    invoke-static {v0}, LDQ8;->f(Z)V

    iget-wide v5, p0, LGn7;->g:J

    cmp-long v0, v5, v2

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    invoke-static {v1}, LDQ8;->f(Z)V

    iget-wide v0, p0, LGn7;->g:J

    iget-wide v2, p0, LGn7;->f:J

    new-instance v4, LZy9;

    invoke-direct {v4}, LZy9;-><init>()V

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, LZy9;->e(Ljava/lang/Long;)LZy9;

    iget-object v0, p0, LGn7;->d:Ljava/lang/String;

    invoke-virtual {v4, v0}, LZy9;->g(Ljava/lang/String;)LZy9;

    iget-object v0, p0, LGn7;->e:Laz9;

    invoke-virtual {v4, v0}, LZy9;->d(Laz9;)LZy9;

    iget-object v0, p0, LGn7;->a:LlT8;

    invoke-virtual {v0}, LlT8;->d()LvU8;

    move-result-object v0

    invoke-virtual {v4, v0}, LZy9;->i(LvU8;)LZy9;

    iget-object v0, p0, LGn7;->b:LlT8;

    invoke-virtual {v0}, LlT8;->d()LvU8;

    move-result-object v0

    invoke-virtual {v4, v0}, LZy9;->h(LvU8;)LZy9;

    iget-object v0, p0, LGn7;->c:LlT8;

    invoke-virtual {v0}, LlT8;->d()LvU8;

    move-result-object v0

    invoke-virtual {v4, v0}, LZy9;->f(LvU8;)LZy9;

    return-object v4
.end method

.method public final b(Lbz9;)V
    .locals 1

    iget-object v0, p0, LGn7;->c:LlT8;

    invoke-virtual {v0, p1}, LlT8;->c(Ljava/lang/Object;)LlT8;

    return-void
.end method

.method public final c(Lbz9;)V
    .locals 1

    iget-object v0, p0, LGn7;->b:LlT8;

    invoke-virtual {v0, p1}, LlT8;->c(Ljava/lang/Object;)LlT8;

    return-void
.end method

.method public final d(Lbz9;)V
    .locals 1

    iget-object v0, p0, LGn7;->a:LlT8;

    invoke-virtual {v0, p1}, LlT8;->c(Ljava/lang/Object;)LlT8;

    return-void
.end method

.method public final e()V
    .locals 4

    iget-wide v0, p0, LGn7;->g:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Method endTiming is not supposed to be called more than once."

    invoke-static {v0, v1}, LDQ8;->g(ZLjava/lang/Object;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, LGn7;->g:J

    return-void
.end method

.method public final f()V
    .locals 4

    iget-wide v0, p0, LGn7;->f:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Method startTiming is not supposed to be called more than once."

    invoke-static {v0, v1}, LDQ8;->g(ZLjava/lang/Object;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, LGn7;->f:J

    return-void
.end method
