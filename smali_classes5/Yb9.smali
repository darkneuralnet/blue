.class public final LYb9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:J

.field public final c:LSt7;

.field public final d:LSt7;

.field public final e:LSt7;

.field public f:I

.field public g:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LSt7;

    invoke-direct {v0}, LSt7;-><init>()V

    iput-object v0, p0, LYb9;->c:LSt7;

    new-instance v0, LSt7;

    invoke-direct {v0}, LSt7;-><init>()V

    iput-object v0, p0, LYb9;->d:LSt7;

    new-instance v0, LSt7;

    invoke-direct {v0}, LSt7;-><init>()V

    iput-object v0, p0, LYb9;->e:LSt7;

    return-void
.end method


# virtual methods
.method public final a()LV69;
    .locals 7

    iget-wide v0, p0, LYb9;->a:J

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
    invoke-static {v0}, Lft8;->d(Z)V

    iget-wide v5, p0, LYb9;->b:J

    cmp-long v0, v5, v2

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    invoke-static {v1}, Lft8;->d(Z)V

    iget-wide v0, p0, LYb9;->b:J

    iget-wide v2, p0, LYb9;->a:J

    new-instance v4, LV69;

    invoke-direct {v4}, LV69;-><init>()V

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, LV69;->d(Ljava/lang/Long;)LV69;

    iget-object v0, p0, LYb9;->c:LSt7;

    invoke-virtual {v0}, LSt7;->e()Lbw7;

    move-result-object v0

    invoke-virtual {v4, v0}, LV69;->h(Lbw7;)LV69;

    iget-object v0, p0, LYb9;->d:LSt7;

    invoke-virtual {v0}, LSt7;->e()Lbw7;

    move-result-object v0

    invoke-virtual {v4, v0}, LV69;->g(Lbw7;)LV69;

    iget-object v0, p0, LYb9;->e:LSt7;

    invoke-virtual {v0}, LSt7;->e()Lbw7;

    move-result-object v0

    invoke-virtual {v4, v0}, LV69;->e(Lbw7;)LV69;

    iget v0, p0, LYb9;->f:I

    if-eqz v0, :cond_2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, LV69;->f(Ljava/lang/Integer;)LV69;

    :cond_2
    return-object v4
.end method

.method public final b(Lc79;)V
    .locals 1

    iget-object v0, p0, LYb9;->e:LSt7;

    invoke-virtual {v0, p1}, LSt7;->d(Ljava/lang/Object;)LSt7;

    return-void
.end method

.method public final c(Lc79;)V
    .locals 1

    iget-object v0, p0, LYb9;->d:LSt7;

    invoke-virtual {v0, p1}, LSt7;->d(Ljava/lang/Object;)LSt7;

    return-void
.end method

.method public final d(Lc79;)V
    .locals 1

    iget-boolean v0, p0, LYb9;->g:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LYb9;->d:LSt7;

    invoke-virtual {v0, p1}, LSt7;->d(Ljava/lang/Object;)LSt7;

    return-void

    :cond_0
    iget-object v0, p0, LYb9;->c:LSt7;

    invoke-virtual {v0, p1}, LSt7;->d(Ljava/lang/Object;)LSt7;

    return-void
.end method

.method public final e()V
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, LYb9;->b:J

    return-void
.end method

.method public final f(I)V
    .locals 0

    iput p1, p0, LYb9;->f:I

    return-void
.end method

.method public final g()V
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, LYb9;->a:J

    return-void
.end method

.method public final h()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LYb9;->g:Z

    return-void
.end method
