.class public final Lam2;
.super LPQ5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ \u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Lam2;",
        "LPQ5;",
        "Landroid/graphics/Canvas;",
        "c",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "parent",
        "Landroidx/recyclerview/widget/RecyclerView$z;",
        "state",
        "",
        "onDrawOver",
        "o",
        "l",
        "m",
        "Landroid/widget/FrameLayout;",
        "frameLayout",
        "n",
        "LQQ5;",
        "d",
        "LQQ5;",
        "provider",
        "e",
        "Landroid/widget/FrameLayout;",
        "LPQ5$a;",
        "f",
        "LPQ5$a;",
        "footerViewHolder",
        "Landroid/graphics/drawable/Drawable;",
        "g",
        "Landroid/graphics/drawable/Drawable;",
        "divider",
        "<init>",
        "(LQQ5;)V",
        "co.bird.android.feature.transfer-order"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLandingItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingItemDecoration.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingItemDecoration\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,226:1\n1#2:227\n288#3,2:228\n1549#3:230\n1620#3,3:231\n1855#3,2:234\n*S KotlinDebug\n*F\n+ 1 LandingItemDecoration.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingItemDecoration\n*L\n97#1:228,2\n145#1:230\n145#1:231,3\n146#1:234,2\n*E\n"
    }
.end annotation


# instance fields
.field public final d:LQQ5;

.field public e:Landroid/widget/FrameLayout;

.field public f:LPQ5$a;

.field public g:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(LQQ5;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LPQ5;-><init>(LQQ5;)V

    iput-object p1, p0, Lam2;->d:LQQ5;

    return-void
.end method


# virtual methods
.method public final l(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 6

    iget-object v0, p0, Lam2;->g:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LHg4;->divider_light_gray:I

    invoke-static {v0, v1}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lam2;->g:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2, v1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v1

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v4, v1

    check-cast v4, Lkotlin/collections/IntIterator;

    invoke-virtual {v4}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v4

    invoke-virtual {p2, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {p2, v3}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$D;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$D;->getItemViewType()I

    move-result v4

    sget v5, LQj4;->item_order_item_header:I

    if-ne v4, v5, :cond_3

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v4

    invoke-virtual {v3}, Landroid/view/View;->getTranslationY()F

    move-result v3

    float-to-int v3, v3

    add-int/2addr v4, v3

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    sub-int v3, v4, v3

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-virtual {v0, v2, v3, v5, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_1

    :cond_3
    sget v5, LQj4;->item_order_item_date_subheader:I

    if-ne v4, v5, :cond_2

    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    move-result v4

    invoke-virtual {v3}, Landroid/view/View;->getTranslationY()F

    move-result v3

    float-to-int v3, v3

    add-int/2addr v4, v3

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    add-int/2addr v3, v4

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-virtual {v0, v2, v4, v5, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public final m(Landroid/graphics/Canvas;)V
    .locals 5

    iget-object v0, p0, Lam2;->f:LPQ5$a;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LPQ5$a;->a()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lam2;->g:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    goto :goto_0

    :cond_1
    move v2, v4

    :goto_0
    int-to-float v2, v2

    add-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    move-result v2

    float-to-int v2, v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lam2;->g:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    goto :goto_1

    :cond_2
    move v2, v4

    :goto_1
    sub-int v2, v1, v2

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v3, p0, Lam2;->g:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_3

    invoke-virtual {v3, v4, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_3
    iget-object v0, p0, Lam2;->g:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public final n(Landroid/widget/FrameLayout;Landroid/graphics/Canvas;)V
    .locals 5

    iget-object v0, p0, Lam2;->f:LPQ5$a;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LPQ5$a;->a()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    move-result v1

    float-to-int v1, v1

    add-int/2addr p1, v1

    iget-object v1, p0, Lam2;->g:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    goto :goto_0

    :cond_1
    move v1, v4

    :goto_0
    sub-int v1, p1, v1

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v2, p0, Lam2;->g:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_2

    invoke-virtual {v2, v4, v1, v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_2
    iget-object p1, p0, Lam2;->g:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_3

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final o(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 11

    iget-object v0, p0, Lam2;->e:Landroid/widget/FrameLayout;

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-nez v0, :cond_2

    new-instance v0, Landroid/widget/FrameLayout;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v0, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v4, v3, Landroid/view/ViewGroup;

    if-eqz v4, :cond_0

    check-cast v3, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v4, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_1
    iput-object v0, p0, Lam2;->e:Landroid/widget/FrameLayout;

    :cond_2
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$h;->getItemCount()I

    move-result v3

    goto :goto_1

    :cond_3
    move v3, v4

    :goto_1
    if-nez v3, :cond_4

    return-void

    :cond_4
    iget-object v3, p0, Lam2;->d:LQQ5;

    const/4 v5, 0x1

    invoke-interface {v3, v5}, LQQ5;->n(I)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_1d

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {p0}, LPQ5;->h()LPQ5$a;

    move-result-object v6

    iget-object v7, p0, Lam2;->d:LQQ5;

    invoke-interface {v7, v3}, LQQ5;->j(I)I

    move-result v7

    if-eqz v6, :cond_5

    invoke-virtual {v6}, LPQ5$a;->b()I

    move-result v8

    if-ne v8, v7, :cond_5

    move v8, v5

    goto :goto_2

    :cond_5
    move v8, v4

    :goto_2
    if-eqz v8, :cond_6

    iget-object v8, p0, Lam2;->d:LQQ5;

    invoke-virtual {v6}, LPQ5$a;->a()Landroid/view/View;

    move-result-object v6

    invoke-interface {v8, v6, v3}, LQQ5;->i(Landroid/view/View;I)V

    :cond_6
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$p;

    move-result-object v6

    instance-of v8, v6, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v8, :cond_7

    check-cast v6, Landroidx/recyclerview/widget/LinearLayoutManager;

    goto :goto_3

    :cond_7
    move-object v6, v2

    :goto_3
    if-nez v6, :cond_8

    return-void

    :cond_8
    invoke-virtual {v6}, Landroidx/recyclerview/widget/LinearLayoutManager;->n2()I

    move-result v8

    const/4 v9, 0x2

    if-gt v8, v3, :cond_9

    invoke-virtual {p0}, LPQ5;->h()LPQ5$a;

    move-result-object v7

    if-eqz v7, :cond_d

    invoke-virtual {v7}, LPQ5$a;->a()Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_d

    invoke-static {v7, v4, v4, v9, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto :goto_5

    :cond_9
    invoke-virtual {p0}, LPQ5;->h()LPQ5$a;

    move-result-object v8

    if-eqz v8, :cond_a

    invoke-virtual {v8}, LPQ5$a;->b()I

    move-result v8

    if-ne v8, v7, :cond_a

    move v8, v5

    goto :goto_4

    :cond_a
    move v8, v4

    :goto_4
    if-nez v8, :cond_c

    invoke-virtual {p0}, LPQ5;->h()LPQ5$a;

    move-result-object v8

    if-eqz v8, :cond_b

    invoke-virtual {v8}, LPQ5$a;->a()Landroid/view/View;

    move-result-object v8

    if-eqz v8, :cond_b

    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_b
    new-instance v8, LPQ5$a;

    invoke-virtual {p0, v3, v0}, LPQ5;->i(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v10

    invoke-direct {v8, v10, v7}, LPQ5$a;-><init>(Landroid/view/View;I)V

    invoke-virtual {p0, v8}, LPQ5;->k(LPQ5$a;)V

    invoke-virtual {p0}, LPQ5;->h()LPQ5$a;

    move-result-object v7

    if-eqz v7, :cond_c

    invoke-virtual {v7}, LPQ5$a;->a()Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_c

    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_c
    invoke-virtual {p0}, LPQ5;->h()LPQ5$a;

    move-result-object v7

    if-eqz v7, :cond_d

    invoke-virtual {v7}, LPQ5$a;->a()Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_d

    invoke-static {v7, v5, v4, v9, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_d
    :goto_5
    invoke-virtual {p0}, LPQ5;->h()LPQ5$a;

    move-result-object v7

    if-eqz v7, :cond_f

    invoke-virtual {v7}, LPQ5$a;->a()Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_f

    invoke-virtual {v7}, Landroid/view/View;->getBottom()I

    move-result v7

    iget-object v8, p0, Lam2;->g:Landroid/graphics/drawable/Drawable;

    if-eqz v8, :cond_e

    invoke-virtual {v8}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v8

    goto :goto_6

    :cond_e
    move v8, v4

    :goto_6
    add-int/2addr v7, v8

    invoke-virtual {p0, p2, v7}, LPQ5;->g(Landroidx/recyclerview/widget/RecyclerView;I)Landroid/view/View;

    move-result-object v7

    goto :goto_7

    :cond_f
    move-object v7, v2

    :goto_7
    if-eqz v7, :cond_10

    invoke-static {p2, v7}, Lft4;->a(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_10

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :cond_10
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object p2

    if-eqz p2, :cond_11

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$h;->getItemCount()I

    move-result p2

    goto :goto_8

    :cond_11
    move p2, v4

    :goto_8
    invoke-static {v3, p2}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_12
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_15

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    iget-object v10, p0, Lam2;->d:LQQ5;

    invoke-interface {v10, v8}, LQQ5;->n(I)Ljava/lang/Integer;

    move-result-object v8

    if-nez v8, :cond_13

    goto :goto_9

    :cond_13
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-eq v8, v3, :cond_14

    :goto_9
    move v8, v5

    goto :goto_a

    :cond_14
    move v8, v4

    :goto_a
    if-eqz v8, :cond_12

    goto :goto_b

    :cond_15
    move-object v7, v2

    :goto_b
    check-cast v7, Ljava/lang/Integer;

    if-eqz v7, :cond_1d

    iget-object p2, p0, Lam2;->d:LQQ5;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-interface {p2, v3}, LQQ5;->n(I)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_1d

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v3, p0, Lam2;->f:LPQ5$a;

    iget-object v7, p0, Lam2;->d:LQQ5;

    invoke-interface {v7, p2}, LQQ5;->j(I)I

    move-result v7

    if-eqz v3, :cond_16

    invoke-virtual {v3}, LPQ5$a;->b()I

    move-result v8

    if-ne v8, v7, :cond_16

    goto :goto_c

    :cond_16
    move v5, v4

    :goto_c
    if-nez v5, :cond_18

    iget-object v5, p0, Lam2;->f:LPQ5$a;

    if-eqz v5, :cond_17

    invoke-virtual {v5}, LPQ5$a;->a()Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_17

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_17
    new-instance v5, LPQ5$a;

    invoke-virtual {p0, p2, v0}, LPQ5;->i(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    invoke-direct {v5, v8, v7}, LPQ5$a;-><init>(Landroid/view/View;I)V

    iput-object v5, p0, Lam2;->f:LPQ5$a;

    invoke-virtual {v5}, LPQ5$a;->a()Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_19

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_d

    :cond_18
    iget-object v5, p0, Lam2;->d:LQQ5;

    invoke-virtual {v3}, LPQ5$a;->a()Landroid/view/View;

    move-result-object v7

    invoke-interface {v5, v7, p2}, LQQ5;->i(Landroid/view/View;I)V

    :cond_19
    :goto_d
    if-lt v1, p2, :cond_1a

    invoke-virtual {p0, p1}, Lam2;->m(Landroid/graphics/Canvas;)V

    return-void

    :cond_1a
    invoke-virtual {v6}, Landroidx/recyclerview/widget/LinearLayoutManager;->s2()I

    move-result v1

    if-lt v1, p2, :cond_1c

    if-eqz v3, :cond_1b

    invoke-virtual {v3}, LPQ5$a;->a()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_1b

    invoke-static {p1, v4, v4, v9, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_1b
    return-void

    :cond_1c
    invoke-virtual {p0, v0, p1}, Lam2;->n(Landroid/widget/FrameLayout;Landroid/graphics/Canvas;)V

    :cond_1d
    return-void
.end method

.method public onDrawOver(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lam2;->o(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p0, p1, p2}, Lam2;->l(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method
