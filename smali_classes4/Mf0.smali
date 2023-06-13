.class public LMf0;
.super Ly0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/view/animation/Interpolator;)V
    .locals 0

    invoke-direct {p0, p1}, Ly0;-><init>(Landroid/view/animation/Interpolator;)V

    return-void
.end method


# virtual methods
.method public g(Landroidx/recyclerview/widget/RecyclerView$D;)V
    .locals 3

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-static {v0}, Lbq6;->e(Landroid/view/View;)LNs6;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LNs6;->n(F)LNs6;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, LNs6;->b(F)LNs6;

    move-result-object v0

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, LNs6;->f(J)LNs6;

    move-result-object v0

    iget-object v1, p0, Ly0;->l:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, LNs6;->g(Landroid/view/animation/Interpolator;)LNs6;

    move-result-object v0

    new-instance v1, Ly0$j;

    invoke-direct {v1, p0, p1}, Ly0$j;-><init>(Ly0;Landroidx/recyclerview/widget/RecyclerView$D;)V

    invoke-virtual {v0, v1}, LNs6;->h(LPs6;)LNs6;

    move-result-object v0

    invoke-virtual {p0, p1}, Ly0;->e(Landroidx/recyclerview/widget/RecyclerView$D;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LNs6;->j(J)LNs6;

    move-result-object p1

    invoke-virtual {p1}, LNs6;->l()V

    return-void
.end method

.method public j(Landroidx/recyclerview/widget/RecyclerView$D;)V
    .locals 4

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-static {v0}, Lbq6;->e(Landroid/view/View;)LNs6;

    move-result-object v0

    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, LNs6;->m(F)LNs6;

    move-result-object v0

    iget-object v1, p0, Ly0;->l:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, LNs6;->g(Landroid/view/animation/Interpolator;)LNs6;

    move-result-object v0

    iget-object v1, p0, Ly0;->j:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, LNs6;->f(J)LNs6;

    move-result-object v1

    invoke-virtual {p0, p1}, Ly0;->f(Landroidx/recyclerview/widget/RecyclerView$D;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LNs6;->j(J)LNs6;

    move-result-object v1

    new-instance v2, LMf0$a;

    invoke-direct {v2, p0, p1, v0}, LMf0$a;-><init>(LMf0;Landroidx/recyclerview/widget/RecyclerView$D;LNs6;)V

    invoke-virtual {v1, v2}, LNs6;->h(LPs6;)LNs6;

    move-result-object p1

    invoke-virtual {p1}, LNs6;->l()V

    return-void
.end method

.method public k(Landroidx/recyclerview/widget/RecyclerView$D;)V
    .locals 2

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lbq6;->a1(Landroid/view/View;F)V

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lbq6;->z0(Landroid/view/View;F)V

    return-void
.end method
