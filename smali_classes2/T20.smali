.class public abstract LT20;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"

# interfaces
.implements LV20;


# instance fields
.field public b:LR20;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LT20;->b:LR20;

    return-void
.end method


# virtual methods
.method public N6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LT20;->c:Ljava/lang/String;

    return-object v0
.end method

.method public a5(ILandroid/content/Intent;)V
    .locals 1

    new-instance v0, LW20;

    invoke-direct {v0}, LW20;-><init>()V

    invoke-virtual {v0, p2}, LW20;->e(Landroid/content/Intent;)LW20;

    move-result-object p2

    invoke-virtual {p2, p1}, LW20;->f(I)LW20;

    move-result-object p1

    iget-object p2, p0, LT20;->b:LR20;

    invoke-virtual {p2, p1, p0}, LR20;->j(LW20;Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/content/Context;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v1, "_"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".browserswitch"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LT20;->c:Ljava/lang/String;

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, LT20;->N6()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LR20;->i(Ljava/lang/String;)LR20;

    move-result-object p1

    iput-object p1, p0, LT20;->b:LR20;

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    iget-object v0, p0, LT20;->b:LR20;

    invoke-virtual {v0, p0}, LR20;->d(Landroidx/fragment/app/Fragment;)V

    return-void
.end method
