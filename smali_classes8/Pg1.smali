.class public LPg1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzx2;


# instance fields
.field public b:Ljava/lang/String;

.field public c:LsT5;

.field public d:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "LuT5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LsT5;Ljava/util/Queue;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsT5;",
            "Ljava/util/Queue<",
            "LuT5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPg1;->c:LsT5;

    invoke-virtual {p1}, LsT5;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LPg1;->b:Ljava/lang/String;

    iput-object p2, p0, LPg1;->d:Ljava/util/Queue;

    return-void
.end method


# virtual methods
.method public final a(Lpq2;LgM2;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 3

    new-instance v0, LuT5;

    invoke-direct {v0}, LuT5;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LuT5;->j(J)V

    invoke-virtual {v0, p1}, LuT5;->c(Lpq2;)V

    iget-object p1, p0, LPg1;->c:LsT5;

    invoke-virtual {v0, p1}, LuT5;->d(LsT5;)V

    iget-object p1, p0, LPg1;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, LuT5;->e(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, LuT5;->f(LgM2;)V

    invoke-virtual {v0, p3}, LuT5;->g(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LuT5;->h(Ljava/lang/String;)V

    invoke-virtual {v0, p4}, LuT5;->b([Ljava/lang/Object;)V

    invoke-virtual {v0, p5}, LuT5;->i(Ljava/lang/Throwable;)V

    iget-object p1, p0, LPg1;->d:Ljava/util/Queue;

    invoke-interface {p1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lpq2;LgM2;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, LPg1;->a(Lpq2;LgM2;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final c(Lpq2;LgM2;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p4, v5, v0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v1 .. v6}, LPg1;->a(Lpq2;LgM2;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public debug(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lpq2;->g:Lpq2;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1, v1}, LPg1;->b(Lpq2;LgM2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public debug(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, Lpq2;->g:Lpq2;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1, p2}, LPg1;->c(Lpq2;LgM2;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public error(LgM2;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lpq2;->d:Lpq2;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, LPg1;->b(Lpq2;LgM2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public error(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lpq2;->d:Lpq2;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1, v1}, LPg1;->b(Lpq2;LgM2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public error(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    sget-object v0, Lpq2;->d:Lpq2;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1, p2}, LPg1;->b(Lpq2;LgM2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LPg1;->b:Ljava/lang/String;

    return-object v0
.end method

.method public info(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lpq2;->f:Lpq2;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1, v1}, LPg1;->b(Lpq2;LgM2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public trace(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lpq2;->h:Lpq2;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1, v1}, LPg1;->b(Lpq2;LgM2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public warn(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lpq2;->e:Lpq2;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1, v1}, LPg1;->b(Lpq2;LgM2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
