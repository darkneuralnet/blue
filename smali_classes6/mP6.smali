.class public final LmP6;
.super LjK6;
.source "SourceFile"


# instance fields
.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:LaO6;

.field public final synthetic e:LuK6;


# direct methods
.method public constructor <init>(LuK6;LaO6;Ljava/util/List;LaO6;)V
    .locals 0

    iput-object p1, p0, LmP6;->e:LuK6;

    iput-object p3, p0, LmP6;->c:Ljava/util/List;

    iput-object p4, p0, LmP6;->d:LaO6;

    invoke-direct {p0, p2}, LjK6;-><init>(LaO6;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    iget-object v0, p0, LmP6;->c:Ljava/util/List;

    invoke-static {v0}, LuK6;->k(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, LmP6;->e:LuK6;

    invoke-static {v1}, LuK6;->n(LuK6;)LzK6;

    move-result-object v1

    invoke-virtual {v1}, LzK6;->c()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, LeP6;

    iget-object v2, p0, LmP6;->e:LuK6;

    invoke-static {v2}, LuK6;->l(LuK6;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, LuK6;->p()Landroid/os/Bundle;

    move-result-object v3

    new-instance v4, LiK6;

    iget-object v5, p0, LmP6;->e:LuK6;

    iget-object v6, p0, LmP6;->d:LaO6;

    const/4 v7, 0x0

    invoke-direct {v4, v5, v6, v7}, LiK6;-><init>(LuK6;LaO6;[B)V

    invoke-interface {v1, v2, v0, v3, v4}, LeP6;->F0(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;LiP6;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, LmP6;->c:Ljava/util/List;

    aput-object v4, v2, v3

    const-string v3, "cancelDownloads(%s)"

    invoke-virtual {v1, v0, v3, v2}, LhK6;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
