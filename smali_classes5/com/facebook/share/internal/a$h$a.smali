.class public Lcom/facebook/share/internal/a$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVD1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/internal/a$h;->onComplete()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/facebook/share/internal/a$u;

.field public final synthetic b:Lcom/facebook/share/internal/a$h;


# direct methods
.method public constructor <init>(Lcom/facebook/share/internal/a$h;Lcom/facebook/share/internal/a$u;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/internal/a$h$a;->b:Lcom/facebook/share/internal/a$h;

    iput-object p2, p0, Lcom/facebook/share/internal/a$h$a;->a:Lcom/facebook/share/internal/a$u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LVD1;)V
    .locals 3

    iget-object p1, p0, Lcom/facebook/share/internal/a$h$a;->b:Lcom/facebook/share/internal/a$h;

    iget-object p1, p1, Lcom/facebook/share/internal/a$h;->b:Lcom/facebook/share/internal/a;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/facebook/share/internal/a;->k(Lcom/facebook/share/internal/a;Z)Z

    iget-object p1, p0, Lcom/facebook/share/internal/a$h$a;->a:Lcom/facebook/share/internal/a$u;

    invoke-virtual {p1}, Lcom/facebook/share/internal/a$k;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/facebook/share/internal/a$h$a;->b:Lcom/facebook/share/internal/a$h;

    iget-object p1, p1, Lcom/facebook/share/internal/a$h;->b:Lcom/facebook/share/internal/a;

    invoke-static {p1, v0}, Lcom/facebook/share/internal/a;->l(Lcom/facebook/share/internal/a;Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/facebook/share/internal/a$h$a;->b:Lcom/facebook/share/internal/a$h;

    iget-object p1, p1, Lcom/facebook/share/internal/a$h;->b:Lcom/facebook/share/internal/a;

    iget-object v0, p0, Lcom/facebook/share/internal/a$h$a;->a:Lcom/facebook/share/internal/a$u;

    iget-object v0, v0, Lcom/facebook/share/internal/a$u;->f:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lyi6;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/facebook/share/internal/a;->d(Lcom/facebook/share/internal/a;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Lcom/facebook/share/internal/a$h$a;->b:Lcom/facebook/share/internal/a$h;

    iget-object p1, p1, Lcom/facebook/share/internal/a$h;->b:Lcom/facebook/share/internal/a;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/facebook/share/internal/a;->n(Lcom/facebook/share/internal/a;Z)Z

    iget-object p1, p0, Lcom/facebook/share/internal/a$h$a;->b:Lcom/facebook/share/internal/a$h;

    iget-object p1, p1, Lcom/facebook/share/internal/a$h;->b:Lcom/facebook/share/internal/a;

    invoke-static {p1}, Lcom/facebook/share/internal/a;->e(Lcom/facebook/share/internal/a;)Ln62;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/share/internal/a$h$a;->b:Lcom/facebook/share/internal/a$h;

    iget-object v0, v0, Lcom/facebook/share/internal/a$h;->a:Landroid/os/Bundle;

    const-string v2, "fb_like_control_did_like"

    invoke-virtual {p1, v2, v1, v0}, Ln62;->i(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/facebook/share/internal/a$h$a;->b:Lcom/facebook/share/internal/a$h;

    iget-object v0, p1, Lcom/facebook/share/internal/a$h;->b:Lcom/facebook/share/internal/a;

    iget-object p1, p1, Lcom/facebook/share/internal/a$h;->a:Landroid/os/Bundle;

    invoke-static {v0, p1}, Lcom/facebook/share/internal/a;->o(Lcom/facebook/share/internal/a;Landroid/os/Bundle;)V

    :goto_0
    return-void
.end method
