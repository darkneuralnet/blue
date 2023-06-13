.class public final LxK6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic b:LzK6;


# direct methods
.method public synthetic constructor <init>(LzK6;)V
    .locals 0

    iput-object p1, p0, LxK6;->b:LzK6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    iget-object v0, p0, LxK6;->b:LzK6;

    invoke-static {v0}, LzK6;->f(LzK6;)LhK6;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "ServiceConnectionImpl.onServiceConnected(%s)"

    invoke-virtual {v0, p1, v1}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, LxK6;->b:LzK6;

    new-instance v0, LtK6;

    invoke-direct {v0, p0, p2}, LtK6;-><init>(LxK6;Landroid/os/IBinder;)V

    invoke-static {p1, v0}, LzK6;->l(LzK6;LjK6;)V

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    iget-object v0, p0, LxK6;->b:LzK6;

    invoke-static {v0}, LzK6;->f(LzK6;)LhK6;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    invoke-virtual {v0, p1, v1}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, LxK6;->b:LzK6;

    new-instance v0, LvK6;

    invoke-direct {v0, p0}, LvK6;-><init>(LxK6;)V

    invoke-static {p1, v0}, LzK6;->l(LzK6;LjK6;)V

    return-void
.end method
