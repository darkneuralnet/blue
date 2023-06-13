.class public Lcom/facebook/share/internal/a$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/share/internal/a$w;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/internal/a;->Z(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/os/Bundle;

.field public final synthetic b:Lcom/facebook/share/internal/a;


# direct methods
.method public constructor <init>(Lcom/facebook/share/internal/a;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/internal/a$h;->b:Lcom/facebook/share/internal/a;

    iput-object p2, p0, Lcom/facebook/share/internal/a$h;->a:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 5

    iget-object v0, p0, Lcom/facebook/share/internal/a$h;->b:Lcom/facebook/share/internal/a;

    invoke-static {v0}, Lcom/facebook/share/internal/a;->h(Lcom/facebook/share/internal/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyi6;->R(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "com.facebook.platform.status.ERROR_DESCRIPTION"

    const-string v2, "Invalid Object Id"

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/facebook/share/internal/a$h;->b:Lcom/facebook/share/internal/a;

    const-string v2, "com.facebook.sdk.LikeActionController.DID_ERROR"

    invoke-static {v1, v2, v0}, Lcom/facebook/share/internal/a;->g(Lcom/facebook/share/internal/a;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void

    :cond_0
    new-instance v0, LVD1;

    invoke-direct {v0}, LVD1;-><init>()V

    new-instance v1, Lcom/facebook/share/internal/a$u;

    iget-object v2, p0, Lcom/facebook/share/internal/a$h;->b:Lcom/facebook/share/internal/a;

    invoke-static {v2}, Lcom/facebook/share/internal/a;->h(Lcom/facebook/share/internal/a;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/share/internal/a$h;->b:Lcom/facebook/share/internal/a;

    invoke-static {v4}, Lcom/facebook/share/internal/a;->j(Lcom/facebook/share/internal/a;)Lcom/facebook/share/widget/LikeView$g;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/share/internal/a$u;-><init>(Lcom/facebook/share/internal/a;Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V

    invoke-virtual {v1, v0}, Lcom/facebook/share/internal/a$k;->c(LVD1;)V

    new-instance v2, Lcom/facebook/share/internal/a$h$a;

    invoke-direct {v2, p0, v1}, Lcom/facebook/share/internal/a$h$a;-><init>(Lcom/facebook/share/internal/a$h;Lcom/facebook/share/internal/a$u;)V

    invoke-virtual {v0, v2}, LVD1;->c(LVD1$a;)V

    invoke-virtual {v0}, LVD1;->j()LUD1;

    return-void
.end method
