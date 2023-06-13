.class public final LuN6;
.super LjK6;
.source "SourceFile"


# instance fields
.field public final synthetic c:LaO6;

.field public final synthetic d:LYN6;


# direct methods
.method public constructor <init>(LYN6;LaO6;LaO6;)V
    .locals 0

    iput-object p1, p0, LuN6;->d:LYN6;

    iput-object p3, p0, LuN6;->c:LaO6;

    invoke-direct {p0, p2}, LjK6;-><init>(LaO6;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    :try_start_0
    iget-object v0, p0, LuN6;->d:LYN6;

    iget-object v0, v0, LYN6;->a:LzK6;

    invoke-virtual {v0}, LzK6;->c()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, LaK6;

    iget-object v1, p0, LuN6;->d:LYN6;

    invoke-static {v1}, LYN6;->b(LYN6;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "review"

    invoke-static {v2}, LrW3;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    new-instance v3, LPN6;

    iget-object v4, p0, LuN6;->d:LYN6;

    iget-object v5, p0, LuN6;->c:LaO6;

    invoke-direct {v3, v4, v5}, LPN6;-><init>(LYN6;LaO6;)V

    invoke-interface {v0, v1, v2, v3}, LaK6;->M0(Ljava/lang/String;Landroid/os/Bundle;LeK6;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, LYN6;->c()LhK6;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, LuN6;->d:LYN6;

    invoke-static {v3}, LYN6;->b(LYN6;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "error requesting in-app review for %s"

    invoke-virtual {v1, v0, v3, v2}, LhK6;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, LuN6;->c:LaO6;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, LaO6;->d(Ljava/lang/Exception;)V

    return-void
.end method
