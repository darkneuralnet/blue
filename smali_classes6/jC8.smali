.class public final LjC8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:LRC8;


# direct methods
.method public constructor <init>(LRC8;Z)V
    .locals 0

    iput-object p1, p0, LjC8;->c:LRC8;

    iput-boolean p2, p0, LjC8;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LjC8;->c:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->l()Z

    move-result v0

    iget-object v1, p0, LjC8;->c:LRC8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->k()Z

    move-result v1

    iget-object v2, p0, LjC8;->c:LRC8;

    iget-object v2, v2, Lns8;->a:LPn8;

    iget-boolean v3, p0, LjC8;->b:Z

    invoke-virtual {v2, v3}, LPn8;->h(Z)V

    iget-boolean v2, p0, LjC8;->b:Z

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LjC8;->c:LRC8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->s()Lec8;

    move-result-object v1

    iget-boolean v2, p0, LjC8;->b:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "Default data collection state already set to"

    invoke-virtual {v1, v3, v2}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    iget-object v1, p0, LjC8;->c:LRC8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->l()Z

    move-result v1

    if-eq v1, v0, :cond_1

    iget-object v1, p0, LjC8;->c:LRC8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->l()Z

    move-result v1

    iget-object v2, p0, LjC8;->c:LRC8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->k()Z

    move-result v2

    if-eq v1, v2, :cond_2

    :cond_1
    iget-object v1, p0, LjC8;->c:LRC8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->u()Lec8;

    move-result-object v1

    iget-boolean v2, p0, LjC8;->b:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v3, "Default data collection is different than actual status"

    invoke-virtual {v1, v3, v2, v0}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    iget-object v0, p0, LjC8;->c:LRC8;

    invoke-static {v0}, LRC8;->e0(LRC8;)V

    return-void
.end method
