.class public Lcom/facebook/share/internal/a$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVD1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/internal/a;->b0(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/facebook/share/internal/a$v;

.field public final synthetic b:Landroid/os/Bundle;

.field public final synthetic c:Lcom/facebook/share/internal/a;


# direct methods
.method public constructor <init>(Lcom/facebook/share/internal/a;Lcom/facebook/share/internal/a$v;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/internal/a$i;->c:Lcom/facebook/share/internal/a;

    iput-object p2, p0, Lcom/facebook/share/internal/a$i;->a:Lcom/facebook/share/internal/a$v;

    iput-object p3, p0, Lcom/facebook/share/internal/a$i;->b:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LVD1;)V
    .locals 3

    iget-object p1, p0, Lcom/facebook/share/internal/a$i;->c:Lcom/facebook/share/internal/a;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/facebook/share/internal/a;->k(Lcom/facebook/share/internal/a;Z)Z

    iget-object p1, p0, Lcom/facebook/share/internal/a$i;->a:Lcom/facebook/share/internal/a$v;

    invoke-virtual {p1}, Lcom/facebook/share/internal/a$k;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/facebook/share/internal/a$i;->c:Lcom/facebook/share/internal/a;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/facebook/share/internal/a;->l(Lcom/facebook/share/internal/a;Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/facebook/share/internal/a$i;->c:Lcom/facebook/share/internal/a;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/facebook/share/internal/a;->d(Lcom/facebook/share/internal/a;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Lcom/facebook/share/internal/a$i;->c:Lcom/facebook/share/internal/a;

    invoke-static {p1, v0}, Lcom/facebook/share/internal/a;->n(Lcom/facebook/share/internal/a;Z)Z

    iget-object p1, p0, Lcom/facebook/share/internal/a$i;->c:Lcom/facebook/share/internal/a;

    invoke-static {p1}, Lcom/facebook/share/internal/a;->e(Lcom/facebook/share/internal/a;)Ln62;

    move-result-object p1

    const-string v0, "fb_like_control_did_unlike"

    iget-object v2, p0, Lcom/facebook/share/internal/a$i;->b:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v1, v2}, Ln62;->i(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/facebook/share/internal/a$i;->c:Lcom/facebook/share/internal/a;

    iget-object v0, p0, Lcom/facebook/share/internal/a$i;->b:Landroid/os/Bundle;

    invoke-static {p1, v0}, Lcom/facebook/share/internal/a;->o(Lcom/facebook/share/internal/a;Landroid/os/Bundle;)V

    :goto_0
    return-void
.end method
