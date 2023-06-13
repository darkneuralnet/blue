.class public final LOo9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic b:LOq9;


# direct methods
.method public synthetic constructor <init>(LOq9;LEl9;)V
    .locals 0

    iput-object p1, p0, LOo9;->b:LOq9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    iget-object v0, p0, LOo9;->b:LOq9;

    invoke-static {v0}, LOq9;->f(LOq9;)LxA8;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "ServiceConnectionImpl.onServiceConnected(%s)"

    invoke-virtual {v0, p1, v1}, LxA8;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p1, p0, LOo9;->b:LOq9;

    new-instance v0, Ltd9;

    invoke-direct {v0, p0, p2}, Ltd9;-><init>(LOo9;Landroid/os/IBinder;)V

    invoke-virtual {p1}, LOq9;->c()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    iget-object v0, p0, LOo9;->b:LOq9;

    invoke-static {v0}, LOq9;->f(LOq9;)LxA8;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    invoke-virtual {v0, p1, v1}, LxA8;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p1, p0, LOo9;->b:LOq9;

    new-instance v0, LKh9;

    invoke-direct {v0, p0}, LKh9;-><init>(LOo9;)V

    invoke-virtual {p1}, LOq9;->c()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
