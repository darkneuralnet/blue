.class public abstract LcW3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LcW3$b;
    }
.end annotation


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Landroid/os/Handler;

.field public d:LcW3$b;

.field public e:Z

.field public f:Landroid/os/Messenger;

.field public g:I

.field public h:I

.field public final i:Ljava/lang/String;

.field public final j:I


# direct methods
.method public constructor <init>(Landroid/content/Context;IIILjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    iput-object p1, p0, LcW3;->b:Landroid/content/Context;

    iput p2, p0, LcW3;->g:I

    iput p3, p0, LcW3;->h:I

    iput-object p5, p0, LcW3;->i:Ljava/lang/String;

    iput p4, p0, LcW3;->j:I

    new-instance p1, LcW3$a;

    invoke-direct {p1, p0}, LcW3$a;-><init>(LcW3;)V

    iput-object p1, p0, LcW3;->c:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 1

    iget-boolean v0, p0, LcW3;->e:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, LcW3;->e:Z

    iget-object v0, p0, LcW3;->d:LcW3$b;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, LcW3$b;->a(Landroid/os/Bundle;)V

    :cond_1
    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LcW3;->e:Z

    return-void
.end method

.method public c(Landroid/os/Message;)V
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    iget v1, p0, LcW3;->h:I

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "com.facebook.platform.status.ERROR_TYPE"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LcW3;->a(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LcW3;->a(Landroid/os/Bundle;)V

    :goto_0
    :try_start_0
    iget-object p1, p0, LcW3;->b:Landroid/content/Context;

    invoke-virtual {p1, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public abstract d(Landroid/os/Bundle;)V
.end method

.method public final e()V
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "com.facebook.platform.extra.APPLICATION_ID"

    iget-object v2, p0, LcW3;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LcW3;->d(Landroid/os/Bundle;)V

    iget v1, p0, LcW3;->g:I

    const/4 v2, 0x0

    invoke-static {v2, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    iget v3, p0, LcW3;->j:I

    iput v3, v1, Landroid/os/Message;->arg1:I

    invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    new-instance v0, Landroid/os/Messenger;

    iget-object v3, p0, LcW3;->c:Landroid/os/Handler;

    invoke-direct {v0, v3}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    :try_start_0
    iget-object v0, p0, LcW3;->f:Landroid/os/Messenger;

    invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p0, v2}, LcW3;->a(Landroid/os/Bundle;)V

    :goto_0
    return-void
.end method

.method public f(LcW3$b;)V
    .locals 0

    iput-object p1, p0, LcW3;->d:LcW3$b;

    return-void
.end method

.method public g()Z
    .locals 3

    iget-boolean v0, p0, LcW3;->e:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, LcW3;->j:I

    invoke-static {v0}, LvY2;->v(I)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, LcW3;->b:Landroid/content/Context;

    invoke-static {v0}, LvY2;->m(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    const/4 v1, 0x1

    iput-boolean v1, p0, LcW3;->e:Z

    iget-object v2, p0, LcW3;->b:Landroid/content/Context;

    invoke-virtual {v2, v0, p0, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return v1
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    new-instance p1, Landroid/os/Messenger;

    invoke-direct {p1, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    iput-object p1, p0, LcW3;->f:Landroid/os/Messenger;

    invoke-virtual {p0}, LcW3;->e()V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const/4 p1, 0x0

    iput-object p1, p0, LcW3;->f:Landroid/os/Messenger;

    :try_start_0
    iget-object v0, p0, LcW3;->b:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {p0, p1}, LcW3;->a(Landroid/os/Bundle;)V

    return-void
.end method
