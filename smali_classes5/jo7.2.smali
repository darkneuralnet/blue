.class public final Ljo7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:J

.field public final c:LlT8;

.field public final d:LlT8;

.field public final e:LlT8;

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LlT8;

    invoke-direct {v0}, LlT8;-><init>()V

    iput-object v0, p0, Ljo7;->c:LlT8;

    new-instance v0, LlT8;

    invoke-direct {v0}, LlT8;-><init>()V

    iput-object v0, p0, Ljo7;->d:LlT8;

    new-instance v0, LlT8;

    invoke-direct {v0}, LlT8;-><init>()V

    iput-object v0, p0, Ljo7;->e:LlT8;

    return-void
.end method


# virtual methods
.method public final a()Lym7;
    .locals 7

    iget-wide v0, p0, Ljo7;->a:J

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

    iget-wide v5, p0, Ljo7;->b:J

    cmp-long v0, v5, v2

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    invoke-static {v1}, LDQ8;->f(Z)V

    iget-wide v0, p0, Ljo7;->b:J

    iget-wide v2, p0, Ljo7;->a:J

    new-instance v4, Lym7;

    invoke-direct {v4}, Lym7;-><init>()V

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Lym7;->d(Ljava/lang/Long;)Lym7;

    iget-object v0, p0, Ljo7;->c:LlT8;

    invoke-virtual {v0}, LlT8;->d()LvU8;

    move-result-object v0

    invoke-virtual {v4, v0}, Lym7;->h(LvU8;)Lym7;

    iget-object v0, p0, Ljo7;->d:LlT8;

    invoke-virtual {v0}, LlT8;->d()LvU8;

    move-result-object v0

    invoke-virtual {v4, v0}, Lym7;->g(LvU8;)Lym7;

    iget-object v0, p0, Ljo7;->e:LlT8;

    invoke-virtual {v0}, LlT8;->d()LvU8;

    move-result-object v0

    invoke-virtual {v4, v0}, Lym7;->e(LvU8;)Lym7;

    iget v0, p0, Ljo7;->f:I

    if-eqz v0, :cond_2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lym7;->f(Ljava/lang/Integer;)Lym7;

    :cond_2
    return-object v4
.end method

.method public final b(Lzm7;)V
    .locals 1

    iget-object v0, p0, Ljo7;->e:LlT8;

    invoke-virtual {v0, p1}, LlT8;->c(Ljava/lang/Object;)LlT8;

    return-void
.end method

.method public final c(Lzm7;)V
    .locals 1

    iget-object v0, p0, Ljo7;->d:LlT8;

    invoke-virtual {v0, p1}, LlT8;->c(Ljava/lang/Object;)LlT8;

    return-void
.end method

.method public final d(Lzm7;)V
    .locals 1

    iget-object v0, p0, Ljo7;->c:LlT8;

    invoke-virtual {v0, p1}, LlT8;->c(Ljava/lang/Object;)LlT8;

    return-void
.end method

.method public final e()V
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Ljo7;->b:J

    return-void
.end method

.method public final f(I)V
    .locals 0

    iput p1, p0, Ljo7;->f:I

    return-void
.end method

.method public final g()V
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Ljo7;->a:J

    return-void
.end method
