.class public Landroidx/media/MediaBrowserServiceCompat$n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media/MediaBrowserServiceCompat$n;->b(Ljava/lang/String;IILandroid/os/Bundle;Landroidx/media/MediaBrowserServiceCompat$o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroidx/media/MediaBrowserServiceCompat$o;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Landroid/os/Bundle;

.field public final synthetic g:Landroidx/media/MediaBrowserServiceCompat$n;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat$n;Landroidx/media/MediaBrowserServiceCompat$o;Ljava/lang/String;IILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->g:Landroidx/media/MediaBrowserServiceCompat$n;

    iput-object p2, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->b:Landroidx/media/MediaBrowserServiceCompat$o;

    iput-object p3, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->c:Ljava/lang/String;

    iput p4, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->d:I

    iput p5, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->e:I

    iput-object p6, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->f:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    iget-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->b:Landroidx/media/MediaBrowserServiceCompat$o;

    invoke-interface {v0}, Landroidx/media/MediaBrowserServiceCompat$o;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->g:Landroidx/media/MediaBrowserServiceCompat$n;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat$n;->a:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->e:Lso;

    invoke-virtual {v1, v0}, LNA5;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Landroidx/media/MediaBrowserServiceCompat$f;

    iget-object v2, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->g:Landroidx/media/MediaBrowserServiceCompat$n;

    iget-object v3, v2, Landroidx/media/MediaBrowserServiceCompat$n;->a:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v4, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->c:Ljava/lang/String;

    iget v5, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->d:I

    iget v6, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->e:I

    iget-object v7, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->f:Landroid/os/Bundle;

    iget-object v8, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->b:Landroidx/media/MediaBrowserServiceCompat$o;

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Landroidx/media/MediaBrowserServiceCompat$f;-><init>(Landroidx/media/MediaBrowserServiceCompat;Ljava/lang/String;IILandroid/os/Bundle;Landroidx/media/MediaBrowserServiceCompat$o;)V

    iget-object v2, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->g:Landroidx/media/MediaBrowserServiceCompat$n;

    iget-object v2, v2, Landroidx/media/MediaBrowserServiceCompat$n;->a:Landroidx/media/MediaBrowserServiceCompat;

    iput-object v1, v2, Landroidx/media/MediaBrowserServiceCompat;->f:Landroidx/media/MediaBrowserServiceCompat$f;

    iget-object v3, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->c:Ljava/lang/String;

    iget v4, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->e:I

    iget-object v5, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->f:Landroid/os/Bundle;

    invoke-virtual {v2, v3, v4, v5}, Landroidx/media/MediaBrowserServiceCompat;->e(Ljava/lang/String;ILandroid/os/Bundle;)Landroidx/media/MediaBrowserServiceCompat$e;

    move-result-object v2

    iput-object v2, v1, Landroidx/media/MediaBrowserServiceCompat$f;->h:Landroidx/media/MediaBrowserServiceCompat$e;

    iget-object v3, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->g:Landroidx/media/MediaBrowserServiceCompat$n;

    iget-object v3, v3, Landroidx/media/MediaBrowserServiceCompat$n;->a:Landroidx/media/MediaBrowserServiceCompat;

    const/4 v4, 0x0

    iput-object v4, v3, Landroidx/media/MediaBrowserServiceCompat;->f:Landroidx/media/MediaBrowserServiceCompat$f;

    const-string v4, "MBServiceCompat"

    if-nez v2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No root for client "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " from service "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    iget-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->b:Landroidx/media/MediaBrowserServiceCompat$o;

    invoke-interface {v0}, Landroidx/media/MediaBrowserServiceCompat$o;->b()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Calling onConnectFailed() failed. Ignoring. pkg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v2, v3, Landroidx/media/MediaBrowserServiceCompat;->e:Lso;

    invoke-virtual {v2, v0, v1}, LNA5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    iget-object v2, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->g:Landroidx/media/MediaBrowserServiceCompat$n;

    iget-object v2, v2, Landroidx/media/MediaBrowserServiceCompat$n;->a:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v2, v2, Landroidx/media/MediaBrowserServiceCompat;->h:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->b:Landroidx/media/MediaBrowserServiceCompat$o;

    iget-object v3, v1, Landroidx/media/MediaBrowserServiceCompat$f;->h:Landroidx/media/MediaBrowserServiceCompat$e;

    invoke-virtual {v3}, Landroidx/media/MediaBrowserServiceCompat$e;->d()Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->g:Landroidx/media/MediaBrowserServiceCompat$n;

    iget-object v5, v5, Landroidx/media/MediaBrowserServiceCompat$n;->a:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v5, v5, Landroidx/media/MediaBrowserServiceCompat;->h:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat$f;->h:Landroidx/media/MediaBrowserServiceCompat$e;

    invoke-virtual {v1}, Landroidx/media/MediaBrowserServiceCompat$e;->c()Landroid/os/Bundle;

    move-result-object v1

    invoke-interface {v2, v3, v5, v1}, Landroidx/media/MediaBrowserServiceCompat$o;->c(Ljava/lang/String;Landroid/support/v4/media/session/MediaSessionCompat$Token;Landroid/os/Bundle;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Calling onConnect() failed. Dropping client. pkg="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$n$a;->g:Landroidx/media/MediaBrowserServiceCompat$n;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat$n;->a:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->e:Lso;

    invoke-virtual {v1, v0}, LNA5;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method
