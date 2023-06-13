.class public final Ltd9;
.super LcH8;
.source "SourceFile"


# instance fields
.field public final synthetic c:Landroid/os/IBinder;

.field public final synthetic d:LOo9;


# direct methods
.method public constructor <init>(LOo9;Landroid/os/IBinder;)V
    .locals 0

    iput-object p1, p0, Ltd9;->d:LOo9;

    iput-object p2, p0, Ltd9;->c:Landroid/os/IBinder;

    invoke-direct {p0}, LcH8;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Ltd9;->d:LOo9;

    iget-object v0, v0, LOo9;->b:LOq9;

    iget-object v1, p0, Ltd9;->c:Landroid/os/IBinder;

    invoke-static {v1}, LA68;->d5(Landroid/os/IBinder;)LGe8;

    move-result-object v1

    invoke-static {v0, v1}, LOq9;->k(LOq9;Landroid/os/IInterface;)V

    iget-object v0, p0, Ltd9;->d:LOo9;

    iget-object v0, v0, LOo9;->b:LOq9;

    invoke-static {v0}, LOq9;->n(LOq9;)V

    iget-object v0, p0, Ltd9;->d:LOo9;

    iget-object v0, v0, LOo9;->b:LOq9;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LOq9;->j(LOq9;Z)V

    iget-object v0, p0, Ltd9;->d:LOo9;

    iget-object v0, v0, LOo9;->b:LOq9;

    invoke-static {v0}, LOq9;->g(LOq9;)Ljava/util/List;

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
    iget-object v0, p0, Ltd9;->d:LOo9;

    iget-object v0, v0, LOo9;->b:LOq9;

    invoke-static {v0}, LOq9;->g(LOq9;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
