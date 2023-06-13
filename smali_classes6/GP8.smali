.class public final synthetic LGP8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LRP8;


# direct methods
.method public synthetic constructor <init>(LRP8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGP8;->b:LRP8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, LGP8;->b:LRP8;

    iget-object v1, v0, LRP8;->d:LcQ8;

    iget-wide v5, v0, LRP8;->b:J

    iget-wide v2, v0, LRP8;->c:J

    iget-object v0, v1, LcQ8;->b:LcR8;

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, v1, LcQ8;->b:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->n()Lec8;

    move-result-object v0

    const-string v4, "Application going to the background"

    invoke-virtual {v0, v4}, Lec8;->a(Ljava/lang/String;)V

    iget-object v0, v1, LcQ8;->b:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    iget-object v0, v0, LIh8;->r:LVf8;

    const/4 v4, 0x1

    invoke-virtual {v0, v4}, LVf8;->a(Z)V

    iget-object v0, v1, LcQ8;->b:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    invoke-virtual {v0}, Lgl7;->D()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, v1, LcQ8;->b:LcR8;

    iget-object v0, v0, LcR8;->e:LyQ8;

    invoke-virtual {v0, v2, v3}, LyQ8;->b(J)V

    iget-object v0, v1, LcQ8;->b:LcR8;

    iget-object v0, v0, LcR8;->e:LyQ8;

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v4, v2, v3}, LyQ8;->d(ZZJ)Z

    :cond_0
    invoke-static {}, LGj9;->b()Z

    iget-object v0, v1, LcQ8;->b:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    const/4 v2, 0x0

    sget-object v3, La98;->D0:LL88;

    invoke-virtual {v0, v2, v3}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v1, LcQ8;->b:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->r()Lec8;

    move-result-object v0

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Application backgrounded at: timestamp_millis"

    invoke-virtual {v0, v2, v1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v0, v1, LcQ8;->b:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v2

    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    const-string v3, "auto"

    const-string v4, "_ab"

    invoke-virtual/range {v2 .. v7}, LRC8;->s(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    return-void
.end method
