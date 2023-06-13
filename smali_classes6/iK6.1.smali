.class public LiK6;
.super LgP6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LgP6;"
    }
.end annotation


# instance fields
.field public final a:LaO6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LaO6<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic b:LuK6;


# direct methods
.method public constructor <init>(LuK6;LaO6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LaO6<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LiK6;->b:LuK6;

    invoke-direct {p0}, LgP6;-><init>()V

    iput-object p2, p0, LiK6;->a:LaO6;

    return-void
.end method

.method public constructor <init>(LuK6;LaO6;[B)V
    .locals 0

    invoke-direct {p0, p1, p2}, LiK6;-><init>(LuK6;LaO6;)V

    return-void
.end method

.method public constructor <init>(LuK6;LaO6;[C)V
    .locals 0

    invoke-direct {p0, p1, p2}, LiK6;-><init>(LuK6;LaO6;)V

    return-void
.end method

.method public constructor <init>(LuK6;LaO6;[I)V
    .locals 0

    invoke-direct {p0, p1, p2}, LiK6;-><init>(LuK6;LaO6;)V

    return-void
.end method


# virtual methods
.method public final M(I)V
    .locals 3

    iget-object v0, p0, LiK6;->b:LuK6;

    invoke-static {v0}, LuK6;->n(LuK6;)LzK6;

    move-result-object v0

    invoke-virtual {v0}, LzK6;->b()V

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "onCancelDownload(%d)"

    invoke-virtual {v0, p1, v1}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public N2(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, LiK6;->b:LuK6;

    invoke-static {v0}, LuK6;->n(LuK6;)LzK6;

    move-result-object v0

    invoke-virtual {v0}, LzK6;->b()V

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "session_id"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "onNotifySessionFailed(%d)"

    invoke-virtual {v0, p1, v1}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public O1(Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, LiK6;->b:LuK6;

    invoke-static {v0}, LuK6;->n(LuK6;)LzK6;

    move-result-object v0

    invoke-virtual {v0}, LzK6;->b()V

    const-string v0, "error_code"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "onError(%d)"

    invoke-virtual {v0, v2, v1}, LhK6;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LiK6;->a:LaO6;

    new-instance v1, Lcom/google/android/play/core/assetpacks/AssetPackException;

    invoke-direct {v1, p1}, Lcom/google/android/play/core/assetpacks/AssetPackException;-><init>(I)V

    invoke-virtual {v0, v1}, LaO6;->d(Ljava/lang/Exception;)V

    return-void
.end method

.method public P1(Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object p1, p0, LiK6;->b:LuK6;

    invoke-static {p1}, LuK6;->n(LuK6;)LzK6;

    move-result-object p1

    invoke-virtual {p1}, LzK6;->b()V

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "onGetChunkFileDescriptor"

    invoke-virtual {p1, v0, p2}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public R0(Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, LiK6;->b:LuK6;

    invoke-static {v0}, LuK6;->n(LuK6;)LzK6;

    move-result-object v0

    invoke-virtual {v0}, LzK6;->b()V

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "module_name"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "slice_id"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "chunk_number"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "session_id"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x3

    aput-object p1, v1, v2

    const-string p1, "onNotifyChunkTransferred(%s, %s, %d, session=%d)"

    invoke-virtual {v0, p1, v1}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public T4(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, LiK6;->b:LuK6;

    invoke-static {p1}, LuK6;->n(LuK6;)LzK6;

    move-result-object p1

    invoke-virtual {p1}, LzK6;->b()V

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onGetSessionStates"

    invoke-virtual {p1, v1, v0}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public X1(Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 1

    iget-object p1, p0, LiK6;->b:LuK6;

    invoke-static {p1}, LuK6;->n(LuK6;)LzK6;

    move-result-object p1

    invoke-virtual {p1}, LzK6;->b()V

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "onRequestDownloadInfo()"

    invoke-virtual {p1, v0, p2}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public c3(Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, LiK6;->b:LuK6;

    invoke-static {v0}, LuK6;->n(LuK6;)LzK6;

    move-result-object v0

    invoke-virtual {v0}, LzK6;->b()V

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "module_name"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "session_id"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string p1, "onNotifyModuleCompleted(%s, sessionId=%d)"

    invoke-virtual {v0, p1, v1}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final d0(I)V
    .locals 3

    iget-object v0, p0, LiK6;->b:LuK6;

    invoke-static {v0}, LuK6;->n(LuK6;)LzK6;

    move-result-object v0

    invoke-virtual {v0}, LzK6;->b()V

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "onGetSession(%d)"

    invoke-virtual {v0, p1, v1}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public i()V
    .locals 3

    iget-object v0, p0, LiK6;->b:LuK6;

    invoke-static {v0}, LuK6;->n(LuK6;)LzK6;

    move-result-object v0

    invoke-virtual {v0}, LzK6;->b()V

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCancelDownloads()"

    invoke-virtual {v0, v2, v1}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public i1(ILandroid/os/Bundle;)V
    .locals 2

    iget-object p2, p0, LiK6;->b:LuK6;

    invoke-static {p2}, LuK6;->n(LuK6;)LzK6;

    move-result-object p2

    invoke-virtual {p2}, LzK6;->b()V

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object p2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "onStartDownload(%d)"

    invoke-virtual {p2, p1, v0}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public n()V
    .locals 3

    iget-object v0, p0, LiK6;->b:LuK6;

    invoke-static {v0}, LuK6;->n(LuK6;)LzK6;

    move-result-object v0

    invoke-virtual {v0}, LzK6;->b()V

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRemoveModule()"

    invoke-virtual {v0, v2, v1}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public x1(Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 2

    iget-object p2, p0, LiK6;->b:LuK6;

    invoke-static {p2}, LuK6;->t(LuK6;)LzK6;

    move-result-object p2

    invoke-virtual {p2}, LzK6;->b()V

    invoke-static {}, LuK6;->o()LhK6;

    move-result-object p2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "keep_alive"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "onKeepAlive(%b)"

    invoke-virtual {p2, p1, v0}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
