.class public final LBK6;
.super LVK6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LVK6<",
        "LSo;",
        ">;"
    }
.end annotation


# instance fields
.field public final g:LpM6;

.field public final h:LuL6;

.field public final i:LoM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoM6<",
            "LfP6;",
            ">;"
        }
    .end annotation
.end field

.field public final j:LlL6;

.field public final k:LxL6;

.field public final l:LoM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoM6<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final m:LoM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoM6<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;LpM6;LuL6;LoM6;LxL6;LlL6;LoM6;LoM6;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LpM6;",
            "LuL6;",
            "LoM6<",
            "LfP6;",
            ">;",
            "LxL6;",
            "LlL6;",
            "LoM6<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "LoM6<",
            "Ljava/util/concurrent/Executor;",
            ">;)V"
        }
    .end annotation

    new-instance v0, LhK6;

    const-string v1, "AssetPackServiceListenerRegistry"

    invoke-direct {v0, v1}, LhK6;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, v1, p1}, LVK6;-><init>(LhK6;Landroid/content/IntentFilter;Landroid/content/Context;)V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, LBK6;->n:Landroid/os/Handler;

    iput-object p2, p0, LBK6;->g:LpM6;

    iput-object p3, p0, LBK6;->h:LuL6;

    iput-object p4, p0, LBK6;->i:LoM6;

    iput-object p5, p0, LBK6;->k:LxL6;

    iput-object p6, p0, LBK6;->j:LlL6;

    iput-object p7, p0, LBK6;->l:LoM6;

    iput-object p8, p0, LBK6;->m:LoM6;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    const-string p1, "com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_3

    const-string v0, "pack_names"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, LBK6;->k:LxL6;

    sget-object v3, LFK6;->c:LDK6;

    invoke-static {p1, v0, v1, v3}, LSo;->e(Landroid/os/Bundle;Ljava/lang/String;LxL6;LDK6;)LSo;

    move-result-object v0

    iget-object v1, p0, LVK6;->a:LhK6;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, p2

    const-string p2, "ListenerRegistryBroadcastReceiver.onReceive: %s"

    invoke-virtual {v1, p2, v2}, LhK6;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p2, "confirmation_intent"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/app/PendingIntent;

    if-eqz p2, :cond_1

    iget-object v1, p0, LBK6;->j:LlL6;

    invoke-virtual {v1, p2}, LlL6;->a(Landroid/app/PendingIntent;)V

    :cond_1
    iget-object p2, p0, LBK6;->m:LoM6;

    invoke-interface {p2}, LoM6;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/Executor;

    new-instance v1, LyK6;

    invoke-direct {v1, p0, p1, v0}, LyK6;-><init>(LBK6;Landroid/os/Bundle;LSo;)V

    invoke-interface {p2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object p2, p0, LBK6;->l:LoM6;

    invoke-interface {p2}, LoM6;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/Executor;

    new-instance v0, LAK6;

    invoke-direct {v0, p0, p1}, LAK6;-><init>(LBK6;Landroid/os/Bundle;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_2
    :goto_0
    iget-object p1, p0, LVK6;->a:LhK6;

    const-string v0, "Corrupt bundle received from broadcast."

    new-array p2, p2, [Ljava/lang/Object;

    invoke-virtual {p1, v0, p2}, LhK6;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_3
    iget-object p1, p0, LVK6;->a:LhK6;

    const-string v0, "Empty bundle received from broadcast."

    new-array p2, p2, [Ljava/lang/Object;

    invoke-virtual {p1, v0, p2}, LhK6;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final f(LSo;)V
    .locals 2

    iget-object v0, p0, LBK6;->n:Landroid/os/Handler;

    new-instance v1, LwK6;

    invoke-direct {v1, p0, p1}, LwK6;-><init>(LBK6;LSo;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final synthetic g(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LBK6;->g:LpM6;

    invoke-virtual {v0, p1}, LpM6;->d(Landroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LBK6;->h:LuL6;

    invoke-virtual {p1}, LuL6;->a()V

    :cond_0
    return-void
.end method

.method public final synthetic h(Landroid/os/Bundle;LSo;)V
    .locals 1

    iget-object v0, p0, LBK6;->g:LpM6;

    invoke-virtual {v0, p1}, LpM6;->e(Landroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, LBK6;->f(LSo;)V

    iget-object p1, p0, LBK6;->i:LoM6;

    invoke-interface {p1}, LoM6;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LfP6;

    invoke-interface {p1}, LfP6;->j()V

    :cond_0
    return-void
.end method
