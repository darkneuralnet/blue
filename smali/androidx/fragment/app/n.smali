.class public Landroidx/fragment/app/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e;
.implements LPi5;
.implements LXr6;


# instance fields
.field public final b:Landroidx/fragment/app/Fragment;

.field public final c:LWr6;

.field public d:Landroidx/lifecycle/u$b;

.field public e:Landroidx/lifecycle/j;

.field public f:LOi5;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;LWr6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/n;->e:Landroidx/lifecycle/j;

    iput-object v0, p0, Landroidx/fragment/app/n;->f:LOi5;

    iput-object p1, p0, Landroidx/fragment/app/n;->b:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Landroidx/fragment/app/n;->c:LWr6;

    return-void
.end method


# virtual methods
.method public a(Landroidx/lifecycle/f$a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->e:Landroidx/lifecycle/j;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/j;->i(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->e:Landroidx/lifecycle/j;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/j;

    invoke-direct {v0, p0}, Landroidx/lifecycle/j;-><init>(LLifecycleOwner;)V

    iput-object v0, p0, Landroidx/fragment/app/n;->e:Landroidx/lifecycle/j;

    invoke-static {p0}, LOi5;->a(LPi5;)LOi5;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/n;->f:LOi5;

    invoke-virtual {v0}, LOi5;->c()V

    :cond_0
    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->e:Landroidx/lifecycle/j;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->f:LOi5;

    invoke-virtual {v0, p1}, LOi5;->d(Landroid/os/Bundle;)V

    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->f:LOi5;

    invoke-virtual {v0, p1}, LOi5;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public f(Landroidx/lifecycle/f$b;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->e:Landroidx/lifecycle/j;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/j;->o(Landroidx/lifecycle/f$b;)V

    return-void
.end method

.method public getDefaultViewModelCreationExtras()LFE0;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/n;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Application;

    goto :goto_1

    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    new-instance v1, LqX2;

    invoke-direct {v1}, LqX2;-><init>()V

    if-eqz v0, :cond_2

    sget-object v2, Landroidx/lifecycle/u$a;->h:LFE0$b;

    invoke-virtual {v1, v2, v0}, LqX2;->c(LFE0$b;Ljava/lang/Object;)V

    :cond_2
    sget-object v0, Landroidx/lifecycle/q;->a:LFE0$b;

    iget-object v2, p0, Landroidx/fragment/app/n;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, v0, v2}, LqX2;->c(LFE0$b;Ljava/lang/Object;)V

    sget-object v0, Landroidx/lifecycle/q;->b:LFE0$b;

    invoke-virtual {v1, v0, p0}, LqX2;->c(LFE0$b;Ljava/lang/Object;)V

    iget-object v0, p0, Landroidx/fragment/app/n;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v0, Landroidx/lifecycle/q;->c:LFE0$b;

    iget-object v2, p0, Landroidx/fragment/app/n;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, LqX2;->c(LFE0$b;Ljava/lang/Object;)V

    :cond_3
    return-object v1
.end method

.method public getDefaultViewModelProviderFactory()Landroidx/lifecycle/u$b;
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/n;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getDefaultViewModelProviderFactory()Landroidx/lifecycle/u$b;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/n;->b:Landroidx/fragment/app/Fragment;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->mDefaultFactory:Landroidx/lifecycle/u$b;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iput-object v0, p0, Landroidx/fragment/app/n;->d:Landroidx/lifecycle/u$b;

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/n;->d:Landroidx/lifecycle/u$b;

    if-nez v0, :cond_3

    iget-object v0, p0, Landroidx/fragment/app/n;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_2

    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/app/Application;

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_1
    new-instance v1, Landroidx/lifecycle/r;

    iget-object v2, p0, Landroidx/fragment/app/n;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3}, Landroidx/lifecycle/r;-><init>(Landroid/app/Application;LPi5;Landroid/os/Bundle;)V

    iput-object v1, p0, Landroidx/fragment/app/n;->d:Landroidx/lifecycle/u$b;

    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/n;->d:Landroidx/lifecycle/u$b;

    return-object v0
.end method

.method public getLifecycle()Landroidx/lifecycle/f;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/n;->b()V

    iget-object v0, p0, Landroidx/fragment/app/n;->e:Landroidx/lifecycle/j;

    return-object v0
.end method

.method public getSavedStateRegistry()Landroidx/savedstate/a;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/n;->b()V

    iget-object v0, p0, Landroidx/fragment/app/n;->f:LOi5;

    invoke-virtual {v0}, LOi5;->b()Landroidx/savedstate/a;

    move-result-object v0

    return-object v0
.end method

.method public getViewModelStore()LWr6;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/n;->b()V

    iget-object v0, p0, Landroidx/fragment/app/n;->c:LWr6;

    return-object v0
.end method
