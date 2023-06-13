.class public abstract LjZ0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "LAq2;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:LAq2;

.field public b:Landroid/os/Bundle;

.field public c:Ljava/util/LinkedList;

.field public final d:Lof3;


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LFP6;

    invoke-direct {v0, p0}, LFP6;-><init>(LjZ0;)V

    iput-object v0, p0, LjZ0;->d:Lof3;

    return-void
.end method

.method public static k(Landroid/widget/FrameLayout;)V
    .locals 8
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v2

    invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/zac;->zad(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/zac;->zac(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v7, -0x2

    invoke-direct {v6, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v6, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v6, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance p0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p0, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 p0, 0x0

    invoke-virtual {v0, v1, v2, p0}, Lcom/google/android/gms/common/GoogleApiAvailability;->getErrorResolutionIntent(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Landroid/widget/Button;

    invoke-direct {v0, v1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    const v2, 0x1020019

    invoke-virtual {v0, v2}, Landroid/view/View;->setId(I)V

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, LTP6;

    invoke-direct {v2, v1, p0}, LTP6;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic l(LjZ0;)LAq2;
    .locals 0

    iget-object p0, p0, LjZ0;->a:LAq2;

    return-object p0
.end method

.method public static bridge synthetic m(LjZ0;)Ljava/util/LinkedList;
    .locals 0

    iget-object p0, p0, LjZ0;->c:Ljava/util/LinkedList;

    return-object p0
.end method

.method public static bridge synthetic n(LjZ0;LAq2;)V
    .locals 0

    iput-object p1, p0, LjZ0;->a:LAq2;

    return-void
.end method

.method public static bridge synthetic o(LjZ0;Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, LjZ0;->b:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public abstract a(Lof3;)V
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lof3<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public b()LAq2;
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LjZ0;->a:LAq2;

    return-object v0
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    new-instance v0, LMP6;

    invoke-direct {v0, p0, p1}, LMP6;-><init>(LjZ0;Landroid/os/Bundle;)V

    invoke-virtual {p0, p1, v0}, LjZ0;->q(Landroid/os/Bundle;LcQ6;)V

    return-void
.end method

.method public d()V
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    iget-object v0, p0, LjZ0;->a:LAq2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LAq2;->onDestroy()V

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LjZ0;->p(I)V

    return-void
.end method

.method public e()V
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    iget-object v0, p0, LjZ0;->a:LAq2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LAq2;->onLowMemory()V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    iget-object v0, p0, LjZ0;->a:LAq2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LAq2;->onPause()V

    return-void

    :cond_0
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, LjZ0;->p(I)V

    return-void
.end method

.method public g()V
    .locals 2
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    new-instance v0, LZP6;

    invoke-direct {v0, p0}, LZP6;-><init>(LjZ0;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, LjZ0;->q(Landroid/os/Bundle;LcQ6;)V

    return-void
.end method

.method public h(Landroid/os/Bundle;)V
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    iget-object v0, p0, LjZ0;->a:LAq2;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LAq2;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void

    :cond_0
    iget-object v0, p0, LjZ0;->b:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_1
    return-void
.end method

.method public i()V
    .locals 2
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    new-instance v0, LXP6;

    invoke-direct {v0, p0}, LXP6;-><init>(LjZ0;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, LjZ0;->q(Landroid/os/Bundle;LcQ6;)V

    return-void
.end method

.method public j()V
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    iget-object v0, p0, LjZ0;->a:LAq2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LAq2;->onStop()V

    return-void

    :cond_0
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, LjZ0;->p(I)V

    return-void
.end method

.method public final p(I)V
    .locals 1

    :goto_0
    iget-object v0, p0, LjZ0;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LjZ0;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LcQ6;

    invoke-interface {v0}, LcQ6;->zaa()I

    move-result v0

    if-lt v0, p1, :cond_0

    iget-object v0, p0, LjZ0;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final q(Landroid/os/Bundle;LcQ6;)V
    .locals 1

    iget-object v0, p0, LjZ0;->a:LAq2;

    if-eqz v0, :cond_0

    invoke-interface {p2, v0}, LcQ6;->a(LAq2;)V

    return-void

    :cond_0
    iget-object v0, p0, LjZ0;->c:Ljava/util/LinkedList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, LjZ0;->c:Ljava/util/LinkedList;

    :cond_1
    iget-object v0, p0, LjZ0;->c:Ljava/util/LinkedList;

    invoke-virtual {v0, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    if-eqz p1, :cond_3

    iget-object p2, p0, LjZ0;->b:Landroid/os/Bundle;

    if-nez p2, :cond_2

    invoke-virtual {p1}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    iput-object p1, p0, LjZ0;->b:Landroid/os/Bundle;

    goto :goto_0

    :cond_2
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_3
    :goto_0
    iget-object p1, p0, LjZ0;->d:Lof3;

    invoke-virtual {p0, p1}, LjZ0;->a(Lof3;)V

    return-void
.end method
