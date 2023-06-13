.class public LXz6$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXz6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:LXz6$g;

.field public f:Landroid/os/Bundle;

.field public g:Lcom/facebook/AccessToken;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/facebook/AccessToken;->c()Lcom/facebook/AccessToken;

    move-result-object v0

    iput-object v0, p0, LXz6$e;->g:Lcom/facebook/AccessToken;

    invoke-static {}, Lcom/facebook/AccessToken;->o()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Lyi6;->z(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iput-object v0, p0, LXz6$e;->b:Ljava/lang/String;

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/facebook/FacebookException;

    const-string p2, "Attempted to create a builder without a valid access token or a valid default Application ID."

    invoke-direct {p1, p2}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, LXz6$e;->b(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p2, :cond_0

    invoke-static {p1}, Lyi6;->z(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    const-string v0, "applicationId"

    invoke-static {p2, v0}, Lsj6;->n(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p2, p0, LXz6$e;->b:Ljava/lang/String;

    invoke-virtual {p0, p1, p3, p4}, LXz6$e;->b(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public a()LXz6;
    .locals 5

    iget-object v0, p0, LXz6$e;->g:Lcom/facebook/AccessToken;

    const-string v1, "app_id"

    if-eqz v0, :cond_0

    iget-object v2, p0, LXz6$e;->f:Landroid/os/Bundle;

    invoke-virtual {v0}, Lcom/facebook/AccessToken;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LXz6$e;->f:Landroid/os/Bundle;

    iget-object v1, p0, LXz6$e;->g:Lcom/facebook/AccessToken;

    invoke-virtual {v1}, Lcom/facebook/AccessToken;->m()Ljava/lang/String;

    move-result-object v1

    const-string v2, "access_token"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LXz6$e;->f:Landroid/os/Bundle;

    iget-object v2, p0, LXz6$e;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, LXz6$e;->a:Landroid/content/Context;

    iget-object v1, p0, LXz6$e;->c:Ljava/lang/String;

    iget-object v2, p0, LXz6$e;->f:Landroid/os/Bundle;

    iget v3, p0, LXz6$e;->d:I

    iget-object v4, p0, LXz6$e;->e:LXz6$g;

    invoke-static {v0, v1, v2, v3, v4}, LXz6;->q(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ILXz6$g;)LXz6;

    move-result-object v0

    return-object v0
.end method

.method public final b(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, LXz6$e;->a:Landroid/content/Context;

    iput-object p2, p0, LXz6$e;->c:Ljava/lang/String;

    if-eqz p3, :cond_0

    iput-object p3, p0, LXz6$e;->f:Landroid/os/Bundle;

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p0, LXz6$e;->f:Landroid/os/Bundle;

    :goto_0
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LXz6$e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, LXz6$e;->a:Landroid/content/Context;

    return-object v0
.end method

.method public e()LXz6$g;
    .locals 1

    iget-object v0, p0, LXz6$e;->e:LXz6$g;

    return-object v0
.end method

.method public f()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, LXz6$e;->f:Landroid/os/Bundle;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, LXz6$e;->d:I

    return v0
.end method

.method public h(LXz6$g;)LXz6$e;
    .locals 0

    iput-object p1, p0, LXz6$e;->e:LXz6$g;

    return-object p0
.end method
