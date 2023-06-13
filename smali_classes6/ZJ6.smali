.class public final LZJ6;
.super LjK6;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:I

.field public final synthetic g:LaO6;

.field public final synthetic h:LuK6;


# direct methods
.method public constructor <init>(LuK6;LaO6;ILjava/lang/String;Ljava/lang/String;ILaO6;)V
    .locals 0

    iput-object p1, p0, LZJ6;->h:LuK6;

    iput p3, p0, LZJ6;->c:I

    iput-object p4, p0, LZJ6;->d:Ljava/lang/String;

    iput-object p5, p0, LZJ6;->e:Ljava/lang/String;

    iput p6, p0, LZJ6;->f:I

    iput-object p7, p0, LZJ6;->g:LaO6;

    invoke-direct {p0, p2}, LjK6;-><init>(LaO6;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    :try_start_0
    iget-object v0, p0, LZJ6;->h:LuK6;

    invoke-static {v0}, LuK6;->n(LuK6;)LzK6;

    move-result-object v0

    invoke-virtual {v0}, LzK6;->c()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, LeP6;

    iget-object v1, p0, LZJ6;->h:LuK6;

    invoke-static {v1}, LuK6;->l(LuK6;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, LZJ6;->c:I

    iget-object v3, p0, LZJ6;->d:Ljava/lang/String;

    iget-object v4, p0, LZJ6;->e:Ljava/lang/String;

    iget v5, p0, LZJ6;->f:I

    invoke-static {v2, v3, v4, v5}, LuK6;->q(ILjava/lang/String;Ljava/lang/String;I)Landroid/os/Bundle;

    move-result-object v2

    invoke-static {}, LuK6;->p()Landroid/os/Bundle;

    move-result-object v3

    new-instance v4, LiK6;

    iget-object v5, p0, LZJ6;->h:LuK6;

    iget-object v6, p0, LZJ6;->g:LaO6;

    const/4 v7, 0x0

    invoke-direct {v4, v5, v6, v7}, LiK6;-><init>(LuK6;LaO6;[C)V

    invoke-interface {v0, v1, v2, v3, v4}, LeP6;->z2(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;LiP6;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "notifyChunkTransferred"

    invoke-virtual {v1, v0, v3, v2}, LhK6;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
