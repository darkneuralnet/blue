.class public final Ldev/b3nedikt/reword/views/RewordTabLayout;
.super Lcom/google/android/material/tabs/TabLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016J$\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016J\u001c\u0010\n\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\u000b\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\u000c\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a8\u0006\u0013"
    }
    d2 = {
        "Ldev/b3nedikt/reword/views/RewordTabLayout;",
        "Lcom/google/android/material/tabs/TabLayout;",
        "Landroid/view/View;",
        "child",
        "",
        "addView",
        "",
        "index",
        "Landroid/view/ViewGroup$LayoutParams;",
        "params",
        "d0",
        "c0",
        "f0",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "reword_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/google/android/material/tabs/TabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic e0(Ldev/b3nedikt/reword/views/RewordTabLayout;Landroid/view/View;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->E()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, Ldev/b3nedikt/reword/views/RewordTabLayout;->d0(Landroid/view/View;I)V

    return-void
.end method


# virtual methods
.method public addView(Landroid/view/View;)V
    .locals 3

    invoke-super {p0, p1}, Lcom/google/android/material/tabs/TabLayout;->addView(Landroid/view/View;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Ldev/b3nedikt/reword/views/RewordTabLayout;->e0(Ldev/b3nedikt/reword/views/RewordTabLayout;Landroid/view/View;IILjava/lang/Object;)V

    return-void
.end method

.method public addView(Landroid/view/View;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/google/android/material/tabs/TabLayout;->addView(Landroid/view/View;I)V

    invoke-virtual {p0, p1, p2}, Ldev/b3nedikt/reword/views/RewordTabLayout;->d0(Landroid/view/View;I)V

    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/google/android/material/tabs/TabLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0, p1, p2}, Ldev/b3nedikt/reword/views/RewordTabLayout;->d0(Landroid/view/View;I)V

    return-void
.end method

.method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-super {p0, p1, p2}, Lcom/google/android/material/tabs/TabLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p2, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, p2, v0}, Ldev/b3nedikt/reword/views/RewordTabLayout;->e0(Ldev/b3nedikt/reword/views/RewordTabLayout;Landroid/view/View;IILjava/lang/Object;)V

    return-void
.end method

.method public final c0(Landroid/view/View;I)V
    .locals 1

    invoke-virtual {p0, p2}, Lcom/google/android/material/tabs/TabLayout;->D(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p2, Lcom/google/android/material/tabs/TabLayout$g;->i:Lcom/google/android/material/tabs/TabLayout$TabView;

    if-eqz p2, :cond_1

    sget v0, LQg4;->view_tag:I

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p2, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final d0(Landroid/view/View;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Ldev/b3nedikt/reword/views/RewordTabLayout;->c0(Landroid/view/View;I)V

    invoke-virtual {p0, p1, p2}, Ldev/b3nedikt/reword/views/RewordTabLayout;->f0(Landroid/view/View;I)V

    return-void
.end method

.method public final f0(Landroid/view/View;I)V
    .locals 2

    instance-of v0, p1, Ldev/b3nedikt/reword/views/RewordTabItem;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ldev/b3nedikt/reword/views/RewordTabItem;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ldev/b3nedikt/reword/views/RewordTabItem;->a()Ljava/lang/Integer;

    move-result-object v1

    :cond_1
    if-eqz v1, :cond_3

    invoke-virtual {p0, p2}, Lcom/google/android/material/tabs/TabLayout;->D(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/material/tabs/TabLayout$g;->r(Ljava/lang/CharSequence;)Lcom/google/android/material/tabs/TabLayout$g;

    :cond_3
    :goto_1
    return-void
.end method
