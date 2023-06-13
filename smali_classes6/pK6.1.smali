.class public final LpK6;
.super LjK6;
.source "SourceFile"


# instance fields
.field public final synthetic c:LzK6;


# direct methods
.method public constructor <init>(LzK6;)V
    .locals 0

    iput-object p1, p0, LpK6;->c:LzK6;

    invoke-direct {p0}, LjK6;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, LpK6;->c:LzK6;

    invoke-static {v0}, LzK6;->e(LzK6;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LpK6;->c:LzK6;

    invoke-static {v0}, LzK6;->f(LzK6;)LhK6;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Unbind from service."

    invoke-virtual {v0, v2, v1}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LpK6;->c:LzK6;

    invoke-static {v0}, LzK6;->h(LzK6;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, LpK6;->c:LzK6;

    invoke-static {v1}, LzK6;->g(LzK6;)Landroid/content/ServiceConnection;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v0, p0, LpK6;->c:LzK6;

    invoke-static {v0}, LzK6;->q(LzK6;)V

    iget-object v0, p0, LpK6;->c:LzK6;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LzK6;->o(LzK6;Landroid/os/IInterface;)V

    iget-object v0, p0, LpK6;->c:LzK6;

    invoke-static {v0}, LzK6;->p(LzK6;)V

    :cond_0
    return-void
.end method
