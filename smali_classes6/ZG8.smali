.class public final LZG8;
.super Landroid/app/Fragment;
.source "SourceFile"


# static fields
.field public static final synthetic c:I


# instance fields
.field public b:LeQ7;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Activity;Landroidx/lifecycle/f$a;)V
    .locals 1

    instance-of v0, p0, LHq2;

    if-eqz v0, :cond_0

    check-cast p0, LHq2;

    invoke-interface {p0}, LHq2;->getLifecycle()Landroidx/lifecycle/j;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/lifecycle/j;->i(Landroidx/lifecycle/f$a;)V

    return-void

    :cond_0
    instance-of v0, p0, LLifecycleOwner;

    if-eqz v0, :cond_1

    check-cast p0, LLifecycleOwner;

    invoke-interface {p0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p0

    instance-of v0, p0, Landroidx/lifecycle/j;

    if-eqz v0, :cond_1

    check-cast p0, Landroidx/lifecycle/j;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/j;->i(Landroidx/lifecycle/f$a;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final b(LeQ7;)V
    .locals 0

    iput-object p1, p0, LZG8;->b:LeQ7;

    return-void
.end method

.method public final c(Landroidx/lifecycle/f$a;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, p1}, LZG8;->a(Landroid/app/Activity;Landroidx/lifecycle/f$a;)V

    :cond_0
    return-void
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    sget-object p1, Landroidx/lifecycle/f$a;->ON_CREATE:Landroidx/lifecycle/f$a;

    invoke-virtual {p0, p1}, LZG8;->c(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    sget-object v0, Landroidx/lifecycle/f$a;->ON_DESTROY:Landroidx/lifecycle/f$a;

    invoke-virtual {p0, v0}, LZG8;->c(Landroidx/lifecycle/f$a;)V

    const/4 v0, 0x0

    iput-object v0, p0, LZG8;->b:LeQ7;

    return-void
.end method

.method public final onPause()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    sget-object v0, Landroidx/lifecycle/f$a;->ON_PAUSE:Landroidx/lifecycle/f$a;

    invoke-virtual {p0, v0}, LZG8;->c(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public final onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    iget-object v0, p0, LZG8;->b:LeQ7;

    if-eqz v0, :cond_0

    iget-object v0, v0, LeQ7;->a:LDe8;

    invoke-virtual {v0}, LDe8;->c()V

    :cond_0
    sget-object v0, Landroidx/lifecycle/f$a;->ON_RESUME:Landroidx/lifecycle/f$a;

    invoke-virtual {p0, v0}, LZG8;->c(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public final onStart()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    iget-object v0, p0, LZG8;->b:LeQ7;

    if-eqz v0, :cond_0

    iget-object v0, v0, LeQ7;->a:LDe8;

    invoke-virtual {v0}, LDe8;->d()V

    :cond_0
    sget-object v0, Landroidx/lifecycle/f$a;->ON_START:Landroidx/lifecycle/f$a;

    invoke-virtual {p0, v0}, LZG8;->c(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public final onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    sget-object v0, Landroidx/lifecycle/f$a;->ON_STOP:Landroidx/lifecycle/f$a;

    invoke-virtual {p0, v0}, LZG8;->c(Landroidx/lifecycle/f$a;)V

    return-void
.end method
