.class public LW03;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/menu/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW03$h;,
        LW03$d;,
        LW03$f;,
        LW03$g;,
        LW03$e;,
        LW03$c;,
        LW03$b;,
        LW03$j;,
        LW03$k;,
        LW03$i;,
        LW03$l;
    }
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public final D:Landroid/view/View$OnClickListener;

.field public b:Lcom/google/android/material/internal/NavigationMenuView;

.field public c:Landroid/widget/LinearLayout;

.field public d:Landroidx/appcompat/view/menu/i$a;

.field public e:Landroidx/appcompat/view/menu/e;

.field public f:I

.field public g:LW03$c;

.field public h:Landroid/view/LayoutInflater;

.field public i:I

.field public j:Landroid/content/res/ColorStateList;

.field public k:I

.field public l:Landroid/content/res/ColorStateList;

.field public m:Landroid/content/res/ColorStateList;

.field public n:Landroid/graphics/drawable/Drawable;

.field public o:Landroid/graphics/drawable/RippleDrawable;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:Z

.field public y:Z

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LW03;->i:I

    iput v0, p0, LW03;->k:I

    const/4 v0, 0x1

    iput-boolean v0, p0, LW03;->y:Z

    const/4 v0, -0x1

    iput v0, p0, LW03;->C:I

    new-instance v0, LW03$a;

    invoke-direct {v0, p0}, LW03$a;-><init>(LW03;)V

    iput-object v0, p0, LW03;->D:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public static synthetic a(LW03;)I
    .locals 0

    iget p0, p0, LW03;->z:I

    return p0
.end method


# virtual methods
.method public A(Landroid/content/res/ColorStateList;)V
    .locals 0

    iput-object p1, p0, LW03;->m:Landroid/content/res/ColorStateList;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LW03;->f(Z)V

    return-void
.end method

.method public B(I)V
    .locals 0

    iput p1, p0, LW03;->z:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LW03;->f(Z)V

    return-void
.end method

.method public C(I)V
    .locals 0

    iput p1, p0, LW03;->k:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LW03;->f(Z)V

    return-void
.end method

.method public D(Landroid/content/res/ColorStateList;)V
    .locals 0

    iput-object p1, p0, LW03;->l:Landroid/content/res/ColorStateList;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LW03;->f(Z)V

    return-void
.end method

.method public E(I)V
    .locals 0

    iput p1, p0, LW03;->q:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LW03;->f(Z)V

    return-void
.end method

.method public F(I)V
    .locals 1

    iput p1, p0, LW03;->C:I

    iget-object v0, p0, LW03;->b:Lcom/google/android/material/internal/NavigationMenuView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/View;->setOverScrollMode(I)V

    :cond_0
    return-void
.end method

.method public G(Landroid/content/res/ColorStateList;)V
    .locals 0

    iput-object p1, p0, LW03;->j:Landroid/content/res/ColorStateList;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LW03;->f(Z)V

    return-void
.end method

.method public H(I)V
    .locals 0

    iput p1, p0, LW03;->w:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LW03;->f(Z)V

    return-void
.end method

.method public I(I)V
    .locals 0

    iput p1, p0, LW03;->v:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LW03;->f(Z)V

    return-void
.end method

.method public J(I)V
    .locals 0

    iput p1, p0, LW03;->i:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LW03;->f(Z)V

    return-void
.end method

.method public K(Z)V
    .locals 1

    iget-object v0, p0, LW03;->g:LW03$c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LW03$c;->C(Z)V

    :cond_0
    return-void
.end method

.method public final L()V
    .locals 4

    iget-object v0, p0, LW03;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-boolean v0, p0, LW03;->y:Z

    if-eqz v0, :cond_0

    iget v0, p0, LW03;->A:I

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, LW03;->b:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    invoke-virtual {v2, v1, v0, v1, v3}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public b(Landroidx/appcompat/view/menu/e;Z)V
    .locals 1

    iget-object v0, p0, LW03;->d:Landroidx/appcompat/view/menu/i$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Landroidx/appcompat/view/menu/i$a;->b(Landroidx/appcompat/view/menu/e;Z)V

    :cond_0
    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, LW03;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, LW03;->b:Lcom/google/android/material/internal/NavigationMenuView;

    const/4 v0, 0x0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    invoke-virtual {p1, v0, v0, v0, v1}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public d(Landroidx/appcompat/view/menu/e;Landroidx/appcompat/view/menu/g;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public e()Landroid/os/Parcelable;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, LW03;->b:Lcom/google/android/material/internal/NavigationMenuView;

    if-eqz v1, :cond_0

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iget-object v2, p0, LW03;->b:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v2, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    const-string v2, "android:menu:list"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_0
    iget-object v1, p0, LW03;->g:LW03$c;

    if-eqz v1, :cond_1

    const-string v2, "android:menu:adapter"

    invoke-virtual {v1}, LW03$c;->r()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1
    iget-object v1, p0, LW03;->c:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_2

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iget-object v2, p0, LW03;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    const-string v2, "android:menu:header"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_2
    return-object v0
.end method

.method public f(Z)V
    .locals 0

    iget-object p1, p0, LW03;->g:LW03$c;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LW03$c;->D()V

    :cond_0
    return-void
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getId()I
    .locals 1

    iget v0, p0, LW03;->f:I

    return v0
.end method

.method public h(Landroidx/appcompat/view/menu/e;Landroidx/appcompat/view/menu/g;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public i(Landroid/content/Context;Landroidx/appcompat/view/menu/e;)V
    .locals 1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, LW03;->h:Landroid/view/LayoutInflater;

    iput-object p2, p0, LW03;->e:Landroidx/appcompat/view/menu/e;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, LPf4;->design_navigation_separator_vertical_padding:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    iput p1, p0, LW03;->B:I

    return-void
.end method

.method public k(LDB6;)V
    .locals 4

    invoke-virtual {p1}, LDB6;->m()I

    move-result v0

    iget v1, p0, LW03;->A:I

    if-eq v1, v0, :cond_0

    iput v0, p0, LW03;->A:I

    invoke-virtual {p0}, LW03;->L()V

    :cond_0
    iget-object v0, p0, LW03;->b:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p1}, LDB6;->j()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v3, v2}, Landroid/view/View;->setPadding(IIII)V

    iget-object v0, p0, LW03;->c:Landroid/widget/LinearLayout;

    invoke-static {v0, p1}, Lbq6;->g(Landroid/view/View;LDB6;)LDB6;

    return-void
.end method

.method public l(Landroid/os/Parcelable;)V
    .locals 2

    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/os/Bundle;

    const-string v0, "android:menu:list"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LW03;->b:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v1, v0}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    :cond_0
    const-string v0, "android:menu:adapter"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, LW03;->g:LW03$c;

    invoke-virtual {v1, v0}, LW03$c;->y(Landroid/os/Bundle;)V

    :cond_1
    const-string v0, "android:menu:header"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, LW03;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    :cond_2
    return-void
.end method

.method public m(Landroidx/appcompat/view/menu/l;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public n(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, LW03;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public o(Landroid/view/ViewGroup;)Landroidx/appcompat/view/menu/j;
    .locals 3

    iget-object v0, p0, LW03;->b:Lcom/google/android/material/internal/NavigationMenuView;

    if-nez v0, :cond_2

    iget-object v0, p0, LW03;->h:Landroid/view/LayoutInflater;

    sget v1, Lvk4;->design_navigation_menu:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/internal/NavigationMenuView;

    iput-object p1, p0, LW03;->b:Lcom/google/android/material/internal/NavigationMenuView;

    new-instance v0, LW03$h;

    iget-object v1, p0, LW03;->b:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-direct {v0, p0, v1}, LW03$h;-><init>(LW03;Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAccessibilityDelegateCompat(Landroidx/recyclerview/widget/s;)V

    iget-object p1, p0, LW03;->g:LW03$c;

    if-nez p1, :cond_0

    new-instance p1, LW03$c;

    invoke-direct {p1, p0}, LW03$c;-><init>(LW03;)V

    iput-object p1, p0, LW03;->g:LW03$c;

    :cond_0
    iget p1, p0, LW03;->C:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    iget-object v0, p0, LW03;->b:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOverScrollMode(I)V

    :cond_1
    iget-object p1, p0, LW03;->h:Landroid/view/LayoutInflater;

    sget v0, Lvk4;->design_navigation_item_header:I

    iget-object v1, p0, LW03;->b:Lcom/google/android/material/internal/NavigationMenuView;

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, LW03;->c:Landroid/widget/LinearLayout;

    iget-object p1, p0, LW03;->b:Lcom/google/android/material/internal/NavigationMenuView;

    iget-object v0, p0, LW03;->g:LW03$c;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    :cond_2
    iget-object p1, p0, LW03;->b:Lcom/google/android/material/internal/NavigationMenuView;

    return-object p1
.end method

.method public p(I)Landroid/view/View;
    .locals 3

    iget-object v0, p0, LW03;->h:Landroid/view/LayoutInflater;

    iget-object v1, p0, LW03;->c:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, LW03;->c(Landroid/view/View;)V

    return-object p1
.end method

.method public q(Z)V
    .locals 1

    iget-boolean v0, p0, LW03;->y:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, LW03;->y:Z

    invoke-virtual {p0}, LW03;->L()V

    :cond_0
    return-void
.end method

.method public r(Landroidx/appcompat/view/menu/g;)V
    .locals 1

    iget-object v0, p0, LW03;->g:LW03$c;

    invoke-virtual {v0, p1}, LW03$c;->B(Landroidx/appcompat/view/menu/g;)V

    return-void
.end method

.method public s(I)V
    .locals 0

    iput p1, p0, LW03;->u:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LW03;->f(Z)V

    return-void
.end method

.method public t(I)V
    .locals 0

    iput p1, p0, LW03;->t:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LW03;->f(Z)V

    return-void
.end method

.method public u(I)V
    .locals 0

    iput p1, p0, LW03;->f:I

    return-void
.end method

.method public v(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, LW03;->n:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LW03;->f(Z)V

    return-void
.end method

.method public w(Landroid/graphics/drawable/RippleDrawable;)V
    .locals 0

    iput-object p1, p0, LW03;->o:Landroid/graphics/drawable/RippleDrawable;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LW03;->f(Z)V

    return-void
.end method

.method public x(I)V
    .locals 0

    iput p1, p0, LW03;->p:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LW03;->f(Z)V

    return-void
.end method

.method public y(I)V
    .locals 0

    iput p1, p0, LW03;->r:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LW03;->f(Z)V

    return-void
.end method

.method public z(I)V
    .locals 1

    iget v0, p0, LW03;->s:I

    if-eq v0, p1, :cond_0

    iput p1, p0, LW03;->s:I

    const/4 p1, 0x1

    iput-boolean p1, p0, LW03;->x:Z

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LW03;->f(Z)V

    :cond_0
    return-void
.end method
