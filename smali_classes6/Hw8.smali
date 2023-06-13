.class public final synthetic LHw8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LRC8;


# direct methods
.method public synthetic constructor <init>(LRC8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHw8;->b:LRC8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, LHw8;->b:LRC8;

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v1, v0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->F()LIh8;

    move-result-object v1

    iget-object v1, v1, LIh8;->s:LVf8;

    invoke-virtual {v1}, LVf8;->b()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, v0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->F()LIh8;

    move-result-object v1

    iget-object v1, v1, LIh8;->t:Lzg8;

    invoke-virtual {v1}, Lzg8;->a()J

    move-result-wide v1

    iget-object v3, v0, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->F()LIh8;

    move-result-object v3

    iget-object v3, v3, LIh8;->t:Lzg8;

    const-wide/16 v4, 0x1

    add-long/2addr v4, v1

    invoke-virtual {v3, v4, v5}, Lzg8;->b(J)V

    iget-object v3, v0, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->w()Lgl7;

    const-wide/16 v3, 0x5

    cmp-long v1, v1, v3

    if-ltz v1, :cond_0

    iget-object v1, v0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->t()Lec8;

    move-result-object v1

    const-string v2, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."

    invoke-virtual {v1, v2}, Lec8;->a(Ljava/lang/String;)V

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    iget-object v0, v0, LIh8;->s:LVf8;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LVf8;->a(Z)V

    return-void

    :cond_0
    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->g()V

    return-void

    :cond_1
    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->n()Lec8;

    move-result-object v0

    const-string v1, "Deferred Deep Link already retrieved. Not fetching again."

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    return-void
.end method
