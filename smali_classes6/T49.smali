.class public final LT49;
.super LcH8;
.source "SourceFile"


# instance fields
.field public final synthetic c:LOq9;


# direct methods
.method public constructor <init>(LOq9;)V
    .locals 0

    iput-object p1, p0, LT49;->c:LOq9;

    invoke-direct {p0}, LcH8;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 4

    iget-object v0, p0, LT49;->c:LOq9;

    invoke-static {v0}, LOq9;->d(LOq9;)Landroid/os/IInterface;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LOq9;->f(LOq9;)LxA8;

    move-result-object v0

    const-string v1, "Unbind from service."

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, LxA8;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, LT49;->c:LOq9;

    invoke-static {v0}, LOq9;->a(LOq9;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0}, LOq9;->b(LOq9;)Landroid/content/ServiceConnection;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v0, p0, LT49;->c:LOq9;

    invoke-static {v0, v2}, LOq9;->j(LOq9;Z)V

    iget-object v0, p0, LT49;->c:LOq9;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LOq9;->k(LOq9;Landroid/os/IInterface;)V

    iget-object v0, p0, LT49;->c:LOq9;

    invoke-static {v0, v1}, LOq9;->i(LOq9;Landroid/content/ServiceConnection;)V

    :cond_0
    iget-object v0, p0, LT49;->c:LOq9;

    invoke-static {v0}, LOq9;->l(LOq9;)V

    return-void
.end method
