.class public LFN5;
.super Landroidx/recyclerview/widget/RecyclerView$o;
.source "SourceFile"


# instance fields
.field public b:I

.field public c:I

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$o;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LFN5;->b:I

    iput v0, p0, LFN5;->c:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, p0, LFN5;->d:I

    div-int/lit8 p1, p1, 0x2

    iput p1, p0, LFN5;->e:I

    return-void
.end method


# virtual methods
.method public f(Landroidx/recyclerview/widget/RecyclerView;I)I
    .locals 1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$p;

    move-result-object p1

    instance-of v0, p1, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->s3()Landroidx/recyclerview/widget/GridLayoutManager$b;

    move-result-object p1

    iget v0, p0, LFN5;->c:I

    invoke-virtual {p1, p2, v0}, Landroidx/recyclerview/widget/GridLayoutManager$b;->e(II)I

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v0, :cond_1

    iget p1, p0, LFN5;->c:I

    rem-int/2addr p2, p1

    return p2

    :cond_1
    instance-of p1, p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public g(Landroidx/recyclerview/widget/RecyclerView;I)I
    .locals 1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$p;

    move-result-object p1

    instance-of v0, p1, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->s3()Landroidx/recyclerview/widget/GridLayoutManager$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager$b;->f(I)I

    move-result p1

    return p1

    :cond_0
    instance-of p2, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    return v0

    :cond_1
    instance-of p1, p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz p1, :cond_2

    return v0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V
    .locals 7

    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$o;->getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V

    iget p4, p0, LFN5;->b:I

    const/4 v0, -0x1

    if-ne p4, v0, :cond_0

    invoke-virtual {p0, p3}, LFN5;->h(Landroidx/recyclerview/widget/RecyclerView;)I

    move-result p4

    iput p4, p0, LFN5;->b:I

    :cond_0
    iget p4, p0, LFN5;->c:I

    if-ne p4, v0, :cond_1

    invoke-virtual {p0, p3}, LFN5;->i(Landroidx/recyclerview/widget/RecyclerView;)I

    move-result p4

    iput p4, p0, LFN5;->c:I

    :cond_1
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$p;

    move-result-object p4

    invoke-virtual {p4}, Landroidx/recyclerview/widget/RecyclerView$p;->s0()I

    move-result v3

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v4

    invoke-virtual {p0, p3, v4}, LFN5;->g(Landroidx/recyclerview/widget/RecyclerView;I)I

    move-result v5

    invoke-virtual {p0, p3, v4}, LFN5;->f(Landroidx/recyclerview/widget/RecyclerView;I)I

    move-result v6

    iget p2, p0, LFN5;->c:I

    const/4 p4, 0x1

    if-ge p2, p4, :cond_2

    return-void

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    invoke-virtual/range {v0 .. v6}, LFN5;->p(Landroid/graphics/Rect;Landroidx/recyclerview/widget/RecyclerView;IIII)V

    return-void
.end method

.method public h(Landroidx/recyclerview/widget/RecyclerView;)I
    .locals 1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$p;

    move-result-object p1

    instance-of v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->F2()I

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz v0, :cond_1

    check-cast p1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->F2()I

    move-result p1

    return p1

    :cond_1
    instance-of v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v0, :cond_2

    check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->I2()I

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public i(Landroidx/recyclerview/widget/RecyclerView;)I
    .locals 1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$p;

    move-result-object p1

    instance-of v0, p1, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->o3()I

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v0, :cond_1

    check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->J2()I

    move-result p1

    return p1

    :cond_1
    instance-of p1, p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public j(Landroidx/recyclerview/widget/RecyclerView;IIII)Z
    .locals 9

    iget v0, p0, LFN5;->b:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    iget p4, p0, LFN5;->c:I

    sub-int p4, p2, p4

    if-lt p3, p4, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    move-object v3, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    move v8, p5

    invoke-virtual/range {v3 .. v8}, LFN5;->l(ZLandroidx/recyclerview/widget/RecyclerView;III)Z

    move-result p1

    return p1

    :cond_1
    add-int/2addr p5, p4

    iget p1, p0, LFN5;->c:I

    if-ne p5, p1, :cond_2

    move v1, v2

    :cond_2
    return v1
.end method

.method public k(ZLandroidx/recyclerview/widget/RecyclerView;I)Z
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    if-eqz p1, :cond_0

    :goto_0
    if-ltz p3, :cond_0

    invoke-virtual {p0, p2, p3}, LFN5;->g(Landroidx/recyclerview/widget/RecyclerView;I)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    iget p1, p0, LFN5;->c:I

    if-gt v1, p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public l(ZLandroidx/recyclerview/widget/RecyclerView;III)Z
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    if-eqz p1, :cond_0

    :goto_0
    if-ge p4, p3, :cond_0

    invoke-virtual {p0, p2, p4}, LFN5;->g(Landroidx/recyclerview/widget/RecyclerView;I)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    iget p1, p0, LFN5;->c:I

    sub-int/2addr p1, p5

    if-gt v1, p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public m(Landroidx/recyclerview/widget/RecyclerView;IIII)Z
    .locals 1

    iget p2, p0, LFN5;->b:I

    const/4 p4, 0x0

    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    if-nez p5, :cond_0

    move p4, v0

    :cond_0
    return p4

    :cond_1
    if-eqz p3, :cond_3

    iget p2, p0, LFN5;->c:I

    if-ge p3, p2, :cond_2

    move p2, v0

    goto :goto_0

    :cond_2
    move p2, p4

    :goto_0
    invoke-virtual {p0, p2, p1, p3}, LFN5;->k(ZLandroidx/recyclerview/widget/RecyclerView;I)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    move p4, v0

    :cond_4
    return p4
.end method

.method public n(Landroidx/recyclerview/widget/RecyclerView;IIII)Z
    .locals 9

    iget v0, p0, LFN5;->b:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    add-int/2addr p5, p4

    iget p1, p0, LFN5;->c:I

    if-ne p5, p1, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    iget p4, p0, LFN5;->c:I

    sub-int p4, p2, p4

    if-lt p3, p4, :cond_2

    move v4, v2

    goto :goto_0

    :cond_2
    move v4, v1

    :goto_0
    move-object v3, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    move v8, p5

    invoke-virtual/range {v3 .. v8}, LFN5;->l(ZLandroidx/recyclerview/widget/RecyclerView;III)Z

    move-result p1

    return p1
.end method

.method public o(Landroidx/recyclerview/widget/RecyclerView;IIII)Z
    .locals 1

    iget p2, p0, LFN5;->b:I

    const/4 p4, 0x0

    const/4 v0, 0x1

    if-ne p2, v0, :cond_3

    if-eqz p3, :cond_1

    iget p2, p0, LFN5;->c:I

    if-ge p3, p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    move p2, p4

    :goto_0
    invoke-virtual {p0, p2, p1, p3}, LFN5;->k(ZLandroidx/recyclerview/widget/RecyclerView;I)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    move p4, v0

    :cond_2
    return p4

    :cond_3
    if-nez p5, :cond_4

    move p4, v0

    :cond_4
    return p4
.end method

.method public p(Landroid/graphics/Rect;Landroidx/recyclerview/widget/RecyclerView;IIII)V
    .locals 6

    iget v0, p0, LFN5;->e:I

    iput v0, p1, Landroid/graphics/Rect;->top:I

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    iput v0, p1, Landroid/graphics/Rect;->left:I

    iput v0, p1, Landroid/graphics/Rect;->right:I

    move-object v0, p0

    move-object v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    invoke-virtual/range {v0 .. v5}, LFN5;->o(Landroidx/recyclerview/widget/RecyclerView;IIII)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LFN5;->d:I

    iput v0, p1, Landroid/graphics/Rect;->top:I

    :cond_0
    move-object v0, p0

    move-object v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    invoke-virtual/range {v0 .. v5}, LFN5;->m(Landroidx/recyclerview/widget/RecyclerView;IIII)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, LFN5;->d:I

    iput v0, p1, Landroid/graphics/Rect;->left:I

    :cond_1
    move-object v0, p0

    move-object v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    invoke-virtual/range {v0 .. v5}, LFN5;->n(Landroidx/recyclerview/widget/RecyclerView;IIII)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, LFN5;->d:I

    iput v0, p1, Landroid/graphics/Rect;->right:I

    :cond_2
    move-object v0, p0

    move-object v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    invoke-virtual/range {v0 .. v5}, LFN5;->j(Landroidx/recyclerview/widget/RecyclerView;IIII)Z

    move-result p2

    if-eqz p2, :cond_3

    iget p2, p0, LFN5;->d:I

    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    :cond_3
    return-void
.end method
