.class public final LtK6;
.super LjK6;
.source "SourceFile"


# instance fields
.field public final synthetic c:Landroid/os/IBinder;

.field public final synthetic d:LxK6;


# direct methods
.method public constructor <init>(LxK6;Landroid/os/IBinder;)V
    .locals 0

    iput-object p1, p0, LtK6;->d:LxK6;

    iput-object p2, p0, LtK6;->c:Landroid/os/IBinder;

    invoke-direct {p0}, LjK6;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, LtK6;->d:LxK6;

    iget-object v0, v0, LxK6;->b:LzK6;

    invoke-static {v0}, LzK6;->i(LzK6;)LsK6;

    move-result-object v1

    iget-object v2, p0, LtK6;->c:Landroid/os/IBinder;

    invoke-interface {v1, v2}, LsK6;->a(Landroid/os/IBinder;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/IInterface;

    invoke-static {v0, v1}, LzK6;->o(LzK6;Landroid/os/IInterface;)V

    iget-object v0, p0, LtK6;->d:LxK6;

    iget-object v0, v0, LxK6;->b:LzK6;

    invoke-static {v0}, LzK6;->j(LzK6;)V

    iget-object v0, p0, LtK6;->d:LxK6;

    iget-object v0, v0, LxK6;->b:LzK6;

    invoke-static {v0}, LzK6;->q(LzK6;)V

    iget-object v0, p0, LtK6;->d:LxK6;

    iget-object v0, v0, LxK6;->b:LzK6;

    invoke-static {v0}, LzK6;->k(LzK6;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LtK6;->d:LxK6;

    iget-object v0, v0, LxK6;->b:LzK6;

    invoke-static {v0}, LzK6;->k(LzK6;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
