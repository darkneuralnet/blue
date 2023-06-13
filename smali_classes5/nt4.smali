.class public Lnt4;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# instance fields
.field public b:Lmt4;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    iget-object v0, p0, Lnt4;->b:Lmt4;

    invoke-virtual {v0, p1, p2, p3}, Lmt4;->f(IILandroid/content/Intent;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    new-instance p1, Lmt4;

    invoke-direct {p1, p0}, Lmt4;-><init>(Landroidx/fragment/app/Fragment;)V

    iput-object p1, p0, Lnt4;->b:Lmt4;

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    iget-object v0, p0, Lnt4;->b:Lmt4;

    invoke-virtual {v0}, Lmt4;->g()V

    return-void
.end method
