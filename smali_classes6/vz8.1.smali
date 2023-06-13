.class public final Lvz8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LhS7;

.field public final synthetic c:LRC8;


# direct methods
.method public constructor <init>(LRC8;LhS7;)V
    .locals 0

    iput-object p1, p0, Lvz8;->c:LRC8;

    iput-object p2, p0, Lvz8;->b:LhS7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lvz8;->c:LRC8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->M()LcR8;

    move-result-object v0

    invoke-static {}, Lak9;->b()Z

    iget-object v1, v0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->w()Lgl7;

    move-result-object v1

    sget-object v2, La98;->w0:LL88;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->F()LIh8;

    move-result-object v1

    invoke-virtual {v1}, LIh8;->n()LXm7;

    move-result-object v1

    sget-object v2, Lcm7;->d:Lcm7;

    invoke-virtual {v1, v2}, LXm7;->i(Lcm7;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->u()Lec8;

    move-result-object v0

    const-string v1, "Analytics storage consent denied; will not get session id"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->F()LIh8;

    move-result-object v1

    iget-object v2, v0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, LIh8;->s(J)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, v0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->F()LIh8;

    move-result-object v1

    iget-object v1, v1, LIh8;->p:Lzg8;

    invoke-virtual {v1}, Lzg8;->a()J

    move-result-wide v1

    const-wide/16 v4, 0x0

    cmp-long v1, v1, v4

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    iget-object v0, v0, LIh8;->p:Lzg8;

    invoke-virtual {v0}, Lzg8;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_1

    :cond_2
    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->u()Lec8;

    move-result-object v0

    const-string v1, "getSessionId has been disabled."

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    :cond_3
    :goto_0
    move-object v0, v3

    :goto_1
    if-eqz v0, :cond_4

    iget-object v1, p0, Lvz8;->c:LRC8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->N()LOW8;

    move-result-object v1

    iget-object v2, p0, Lvz8;->b:LhS7;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, LOW8;->J(LhS7;J)V

    return-void

    :cond_4
    :try_start_0
    iget-object v0, p0, Lvz8;->b:LhS7;

    invoke-interface {v0, v3}, LhS7;->W0(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lvz8;->c:LRC8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->o()Lec8;

    move-result-object v1

    const-string v2, "getSessionId failed with exception"

    invoke-virtual {v1, v2, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
