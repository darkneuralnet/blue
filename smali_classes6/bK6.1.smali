.class public final LbK6;
.super LjK6;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:LaO6;

.field public final synthetic f:I

.field public final synthetic g:LuK6;


# direct methods
.method public constructor <init>(LuK6;LaO6;ILjava/lang/String;LaO6;I)V
    .locals 0

    iput-object p1, p0, LbK6;->g:LuK6;

    iput p3, p0, LbK6;->c:I

    iput-object p4, p0, LbK6;->d:Ljava/lang/String;

    iput-object p5, p0, LbK6;->e:LaO6;

    iput p6, p0, LbK6;->f:I

    invoke-direct {p0, p2}, LjK6;-><init>(LaO6;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 11

    :try_start_0
    iget-object v0, p0, LbK6;->g:LuK6;

    invoke-static {v0}, LuK6;->n(LuK6;)LzK6;

    move-result-object v0

    invoke-virtual {v0}, LzK6;->c()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, LeP6;

    iget-object v1, p0, LbK6;->g:LuK6;

    invoke-static {v1}, LuK6;->l(LuK6;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, LbK6;->c:I

    iget-object v3, p0, LbK6;->d:Ljava/lang/String;

    invoke-static {v2, v3}, LuK6;->r(ILjava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    invoke-static {}, LuK6;->p()Landroid/os/Bundle;

    move-result-object v3

    new-instance v10, LqK6;

    iget-object v5, p0, LbK6;->g:LuK6;

    iget-object v6, p0, LbK6;->e:LaO6;

    iget v7, p0, LbK6;->c:I

    iget-object v8, p0, LbK6;->d:Ljava/lang/String;

    iget v9, p0, LbK6;->f:I

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, LqK6;-><init>(LuK6;LaO6;ILjava/lang/String;I)V

    invoke-interface {v0, v1, v2, v3, v10}, LeP6;->I2(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;LiP6;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "notifyModuleCompleted"

    invoke-virtual {v1, v0, v3, v2}, LhK6;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
