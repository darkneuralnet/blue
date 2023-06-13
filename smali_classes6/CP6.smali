.class public final LCP6;
.super LjK6;
.source "SourceFile"


# instance fields
.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:LaO6;

.field public final synthetic e:LuK6;


# direct methods
.method public constructor <init>(LuK6;LaO6;Ljava/util/Map;LaO6;)V
    .locals 0

    iput-object p1, p0, LCP6;->e:LuK6;

    iput-object p3, p0, LCP6;->c:Ljava/util/Map;

    iput-object p4, p0, LCP6;->d:LaO6;

    invoke-direct {p0, p2}, LjK6;-><init>(LaO6;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    :try_start_0
    iget-object v0, p0, LCP6;->e:LuK6;

    invoke-static {v0}, LuK6;->n(LuK6;)LzK6;

    move-result-object v0

    invoke-virtual {v0}, LzK6;->c()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, LeP6;

    iget-object v1, p0, LCP6;->e:LuK6;

    invoke-static {v1}, LuK6;->l(LuK6;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LCP6;->c:Ljava/util/Map;

    invoke-static {v2}, LuK6;->m(Ljava/util/Map;)Landroid/os/Bundle;

    move-result-object v2

    new-instance v3, LmK6;

    iget-object v4, p0, LCP6;->e:LuK6;

    iget-object v5, p0, LCP6;->d:LaO6;

    invoke-direct {v3, v4, v5}, LmK6;-><init>(LuK6;LaO6;)V

    invoke-interface {v0, v1, v2, v3}, LeP6;->l1(Ljava/lang/String;Landroid/os/Bundle;LiP6;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncPacks"

    invoke-virtual {v1, v0, v3, v2}, LhK6;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, LCP6;->d:LaO6;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, LaO6;->d(Ljava/lang/Exception;)V

    return-void
.end method
