.class public final LgK6;
.super LjK6;
.source "SourceFile"


# instance fields
.field public final synthetic c:LaO6;

.field public final synthetic d:LuK6;


# direct methods
.method public constructor <init>(LuK6;LaO6;LaO6;)V
    .locals 0

    iput-object p1, p0, LgK6;->d:LuK6;

    iput-object p3, p0, LgK6;->c:LaO6;

    invoke-direct {p0, p2}, LjK6;-><init>(LaO6;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    :try_start_0
    iget-object v0, p0, LgK6;->d:LuK6;

    invoke-static {v0}, LuK6;->t(LuK6;)LzK6;

    move-result-object v0

    invoke-virtual {v0}, LzK6;->c()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, LeP6;

    iget-object v1, p0, LgK6;->d:LuK6;

    invoke-static {v1}, LuK6;->l(LuK6;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, LuK6;->p()Landroid/os/Bundle;

    move-result-object v2

    new-instance v3, LoK6;

    iget-object v4, p0, LgK6;->d:LuK6;

    iget-object v5, p0, LgK6;->c:LaO6;

    invoke-direct {v3, v4, v5}, LoK6;-><init>(LuK6;LaO6;)V

    invoke-interface {v0, v1, v2, v3}, LeP6;->t(Ljava/lang/String;Landroid/os/Bundle;LiP6;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "keepAlive"

    invoke-virtual {v1, v0, v3, v2}, LhK6;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
