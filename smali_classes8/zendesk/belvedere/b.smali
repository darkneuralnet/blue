.class public Lzendesk/belvedere/b;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/belvedere/b$d;,
        Lzendesk/belvedere/b$c;,
        Lzendesk/belvedere/b$b;
    }
.end annotation


# instance fields
.field public b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lzendesk/belvedere/KeyboardHelper;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/WeakReference<",
            "Lzendesk/belvedere/b$b;",
            ">;>;"
        }
    .end annotation
.end field

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/WeakReference<",
            "Lzendesk/belvedere/b$d;",
            ">;>;"
        }
    .end annotation
.end field

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/WeakReference<",
            "Lzendesk/belvedere/b$c;",
            ">;>;"
        }
    .end annotation
.end field

.field public f:Lzendesk/belvedere/h;

.field public g:Lzendesk/belvedere/BelvedereUi$UiConfig;

.field public h:Z

.field public i:Lzendesk/belvedere/j;

.field public j:LG80;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LG80<",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lzendesk/belvedere/b;->b:Ljava/lang/ref/WeakReference;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzendesk/belvedere/b;->c:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzendesk/belvedere/b;->d:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzendesk/belvedere/b;->e:Ljava/util/List;

    iput-object v1, p0, Lzendesk/belvedere/b;->f:Lzendesk/belvedere/h;

    iput-object v1, p0, Lzendesk/belvedere/b;->g:Lzendesk/belvedere/BelvedereUi$UiConfig;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzendesk/belvedere/b;->h:Z

    return-void
.end method

.method public static synthetic a5(Lzendesk/belvedere/b;)Lzendesk/belvedere/BelvedereUi$UiConfig;
    .locals 0

    iget-object p0, p0, Lzendesk/belvedere/b;->g:Lzendesk/belvedere/BelvedereUi$UiConfig;

    return-object p0
.end method


# virtual methods
.method public A9()Lzendesk/belvedere/KeyboardHelper;
    .locals 1

    iget-object v0, p0, Lzendesk/belvedere/b;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/belvedere/KeyboardHelper;

    return-object v0
.end method

.method public B9(Ljava/util/List;Lzendesk/belvedere/j$d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaIntent;",
            ">;",
            "Lzendesk/belvedere/j$d;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/belvedere/b;->i:Lzendesk/belvedere/j;

    invoke-virtual {v0, p0, p1, p2}, Lzendesk/belvedere/j;->i(Landroidx/fragment/app/Fragment;Ljava/util/List;Lzendesk/belvedere/j$d;)V

    return-void
.end method

.method public D9()Z
    .locals 1

    iget-object v0, p0, Lzendesk/belvedere/b;->f:Lzendesk/belvedere/h;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public E9()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lzendesk/belvedere/b;->j:LG80;

    iget-object v0, p0, Lzendesk/belvedere/b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/belvedere/b$b;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lzendesk/belvedere/b$b;->onDismissed()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public G9(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/belvedere/b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/belvedere/b$b;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lzendesk/belvedere/b$b;->onMediaDeselected(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public I9(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/belvedere/b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/belvedere/b$b;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lzendesk/belvedere/b$b;->onMediaSelected(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public J9(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/belvedere/b;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/belvedere/b$d;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lzendesk/belvedere/b$d;->a(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public N6(Lzendesk/belvedere/b$b;)V
    .locals 2

    iget-object v0, p0, Lzendesk/belvedere/b;->c:Ljava/util/List;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public P9(IIF)V
    .locals 2

    iget-object v0, p0, Lzendesk/belvedere/b;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/belvedere/b$c;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1, p2, p3}, Lzendesk/belvedere/b$c;->onScroll(IIF)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public S9()V
    .locals 2

    iget-object v0, p0, Lzendesk/belvedere/b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/belvedere/b$b;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lzendesk/belvedere/b$b;->onVisible()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public T9(Lzendesk/belvedere/h;Lzendesk/belvedere/BelvedereUi$UiConfig;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/b;->f:Lzendesk/belvedere/h;

    if-eqz p2, :cond_0

    iput-object p2, p0, Lzendesk/belvedere/b;->g:Lzendesk/belvedere/BelvedereUi$UiConfig;

    :cond_0
    return-void
.end method

.method public da(Lzendesk/belvedere/KeyboardHelper;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lzendesk/belvedere/b;->b:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public dismiss()V
    .locals 1

    invoke-virtual {p0}, Lzendesk/belvedere/b;->D9()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzendesk/belvedere/b;->f:Lzendesk/belvedere/h;

    invoke-virtual {v0}, Lzendesk/belvedere/h;->dismiss()V

    :cond_0
    return-void
.end method

.method public ea()Z
    .locals 1

    iget-boolean v0, p0, Lzendesk/belvedere/b;->h:Z

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 7

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    new-instance v0, Lzendesk/belvedere/b$a;

    invoke-direct {v0, p0}, Lzendesk/belvedere/b$a;-><init>(Lzendesk/belvedere/b;)V

    iput-object v0, p0, Lzendesk/belvedere/b;->j:LG80;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lzendesk/belvedere/a;->c(Landroid/content/Context;)Lzendesk/belvedere/a;

    move-result-object v1

    iget-object v5, p0, Lzendesk/belvedere/b;->j:LG80;

    const/4 v6, 0x0

    move v2, p1

    move v3, p2

    move-object v4, p3

    invoke-virtual/range {v1 .. v6}, Lzendesk/belvedere/a;->e(IILandroid/content/Intent;LG80;Z)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->setRetainInstance(Z)V

    new-instance p1, Lzendesk/belvedere/j;

    invoke-direct {p1}, Lzendesk/belvedere/j;-><init>()V

    iput-object p1, p0, Lzendesk/belvedere/b;->i:Lzendesk/belvedere/j;

    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    iget-object v0, p0, Lzendesk/belvedere/b;->f:Lzendesk/belvedere/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lzendesk/belvedere/h;->dismiss()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzendesk/belvedere/b;->h:Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lzendesk/belvedere/b;->h:Z

    :goto_0
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    iget-object v0, p0, Lzendesk/belvedere/b;->i:Lzendesk/belvedere/j;

    invoke-virtual {v0, p1, p2, p3}, Lzendesk/belvedere/j;->k(I[Ljava/lang/String;[I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    :cond_0
    return-void
.end method

.method public t8(Lzendesk/belvedere/b$c;)V
    .locals 2

    iget-object v0, p0, Lzendesk/belvedere/b;->e:Ljava/util/List;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
