.class public Lcom/facebook/share/widget/LikeView$f;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/widget/LikeView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final synthetic a:Lcom/facebook/share/widget/LikeView;


# direct methods
.method public constructor <init>(Lcom/facebook/share/widget/LikeView;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/widget/LikeView$f;->a:Lcom/facebook/share/widget/LikeView;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/share/widget/LikeView;Lcom/facebook/share/widget/LikeView$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/share/widget/LikeView$f;-><init>(Lcom/facebook/share/widget/LikeView;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    const-string v1, "com.facebook.sdk.LikeActionController.OBJECT_ID"

    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lyi6;->R(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView$f;->a:Lcom/facebook/share/widget/LikeView;

    invoke-static {v1}, Lcom/facebook/share/widget/LikeView;->e(Lcom/facebook/share/widget/LikeView;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p2}, Lyi6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    move v0, p2

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    return-void

    :cond_2
    const-string p2, "com.facebook.sdk.LikeActionController.UPDATED"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p1, p0, Lcom/facebook/share/widget/LikeView$f;->a:Lcom/facebook/share/widget/LikeView;

    invoke-static {p1}, Lcom/facebook/share/widget/LikeView;->f(Lcom/facebook/share/widget/LikeView;)V

    goto :goto_1

    :cond_3
    const-string p2, "com.facebook.sdk.LikeActionController.DID_ERROR"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p1, p0, Lcom/facebook/share/widget/LikeView$f;->a:Lcom/facebook/share/widget/LikeView;

    invoke-static {p1}, Lcom/facebook/share/widget/LikeView;->g(Lcom/facebook/share/widget/LikeView;)Lcom/facebook/share/widget/LikeView$h;

    goto :goto_1

    :cond_4
    const-string p2, "com.facebook.sdk.LikeActionController.DID_RESET"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/facebook/share/widget/LikeView$f;->a:Lcom/facebook/share/widget/LikeView;

    invoke-static {p1}, Lcom/facebook/share/widget/LikeView;->e(Lcom/facebook/share/widget/LikeView;)Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView$f;->a:Lcom/facebook/share/widget/LikeView;

    invoke-static {v0}, Lcom/facebook/share/widget/LikeView;->h(Lcom/facebook/share/widget/LikeView;)Lcom/facebook/share/widget/LikeView$g;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lcom/facebook/share/widget/LikeView;->a(Lcom/facebook/share/widget/LikeView;Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V

    iget-object p1, p0, Lcom/facebook/share/widget/LikeView$f;->a:Lcom/facebook/share/widget/LikeView;

    invoke-static {p1}, Lcom/facebook/share/widget/LikeView;->f(Lcom/facebook/share/widget/LikeView;)V

    :cond_5
    :goto_1
    return-void
.end method
