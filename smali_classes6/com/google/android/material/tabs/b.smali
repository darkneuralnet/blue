.class public final Lcom/google/android/material/tabs/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/tabs/b$a;,
        Lcom/google/android/material/tabs/b$d;,
        Lcom/google/android/material/tabs/b$c;,
        Lcom/google/android/material/tabs/b$b;
    }
.end annotation


# instance fields
.field public final a:Lcom/google/android/material/tabs/TabLayout;

.field public final b:Landroidx/viewpager2/widget/ViewPager2;

.field public final c:Z

.field public final d:Z

.field public final e:Lcom/google/android/material/tabs/b$b;

.field public f:Landroidx/recyclerview/widget/RecyclerView$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/recyclerview/widget/RecyclerView$h<",
            "*>;"
        }
    .end annotation
.end field

.field public g:Z

.field public h:Lcom/google/android/material/tabs/b$c;

.field public i:Lcom/google/android/material/tabs/TabLayout$d;

.field public j:Landroidx/recyclerview/widget/RecyclerView$j;


# direct methods
.method public constructor <init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Lcom/google/android/material/tabs/b$b;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/google/android/material/tabs/b;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;ZLcom/google/android/material/tabs/b$b;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;ZLcom/google/android/material/tabs/b$b;)V
    .locals 6

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/material/tabs/b;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;ZZLcom/google/android/material/tabs/b$b;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;ZZLcom/google/android/material/tabs/b$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/tabs/b;->a:Lcom/google/android/material/tabs/TabLayout;

    iput-object p2, p0, Lcom/google/android/material/tabs/b;->b:Landroidx/viewpager2/widget/ViewPager2;

    iput-boolean p3, p0, Lcom/google/android/material/tabs/b;->c:Z

    iput-boolean p4, p0, Lcom/google/android/material/tabs/b;->d:Z

    iput-object p5, p0, Lcom/google/android/material/tabs/b;->e:Lcom/google/android/material/tabs/b$b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-boolean v0, p0, Lcom/google/android/material/tabs/b;->g:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/material/tabs/b;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->c()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/tabs/b;->f:Landroidx/recyclerview/widget/RecyclerView$h;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/material/tabs/b;->g:Z

    new-instance v1, Lcom/google/android/material/tabs/b$c;

    iget-object v2, p0, Lcom/google/android/material/tabs/b;->a:Lcom/google/android/material/tabs/TabLayout;

    invoke-direct {v1, v2}, Lcom/google/android/material/tabs/b$c;-><init>(Lcom/google/android/material/tabs/TabLayout;)V

    iput-object v1, p0, Lcom/google/android/material/tabs/b;->h:Lcom/google/android/material/tabs/b$c;

    iget-object v2, p0, Lcom/google/android/material/tabs/b;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v2, v1}, Landroidx/viewpager2/widget/ViewPager2;->n(Landroidx/viewpager2/widget/ViewPager2$i;)V

    new-instance v1, Lcom/google/android/material/tabs/b$d;

    iget-object v2, p0, Lcom/google/android/material/tabs/b;->b:Landroidx/viewpager2/widget/ViewPager2;

    iget-boolean v3, p0, Lcom/google/android/material/tabs/b;->d:Z

    invoke-direct {v1, v2, v3}, Lcom/google/android/material/tabs/b$d;-><init>(Landroidx/viewpager2/widget/ViewPager2;Z)V

    iput-object v1, p0, Lcom/google/android/material/tabs/b;->i:Lcom/google/android/material/tabs/TabLayout$d;

    iget-object v2, p0, Lcom/google/android/material/tabs/b;->a:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v2, v1}, Lcom/google/android/material/tabs/TabLayout;->h(Lcom/google/android/material/tabs/TabLayout$d;)V

    iget-boolean v1, p0, Lcom/google/android/material/tabs/b;->c:Z

    if-eqz v1, :cond_0

    new-instance v1, Lcom/google/android/material/tabs/b$a;

    invoke-direct {v1, p0}, Lcom/google/android/material/tabs/b$a;-><init>(Lcom/google/android/material/tabs/b;)V

    iput-object v1, p0, Lcom/google/android/material/tabs/b;->j:Landroidx/recyclerview/widget/RecyclerView$j;

    iget-object v2, p0, Lcom/google/android/material/tabs/b;->f:Landroidx/recyclerview/widget/RecyclerView$h;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView$h;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$j;)V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/tabs/b;->c()V

    iget-object v1, p0, Lcom/google/android/material/tabs/b;->a:Lcom/google/android/material/tabs/TabLayout;

    iget-object v2, p0, Lcom/google/android/material/tabs/b;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v2}, Landroidx/viewpager2/widget/ViewPager2;->d()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/material/tabs/TabLayout;->setScrollPosition(IFZ)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "TabLayoutMediator attached before ViewPager2 has an adapter"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "TabLayoutMediator is already attached"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()V
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/material/tabs/b;->c:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/tabs/b;->f:Landroidx/recyclerview/widget/RecyclerView$h;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/google/android/material/tabs/b;->j:Landroidx/recyclerview/widget/RecyclerView$j;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView$h;->unregisterAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$j;)V

    iput-object v1, p0, Lcom/google/android/material/tabs/b;->j:Landroidx/recyclerview/widget/RecyclerView$j;

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/tabs/b;->a:Lcom/google/android/material/tabs/TabLayout;

    iget-object v2, p0, Lcom/google/android/material/tabs/b;->i:Lcom/google/android/material/tabs/TabLayout$d;

    invoke-virtual {v0, v2}, Lcom/google/android/material/tabs/TabLayout;->Q(Lcom/google/android/material/tabs/TabLayout$d;)V

    iget-object v0, p0, Lcom/google/android/material/tabs/b;->b:Landroidx/viewpager2/widget/ViewPager2;

    iget-object v2, p0, Lcom/google/android/material/tabs/b;->h:Lcom/google/android/material/tabs/b$c;

    invoke-virtual {v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->t(Landroidx/viewpager2/widget/ViewPager2$i;)V

    iput-object v1, p0, Lcom/google/android/material/tabs/b;->i:Lcom/google/android/material/tabs/TabLayout$d;

    iput-object v1, p0, Lcom/google/android/material/tabs/b;->h:Lcom/google/android/material/tabs/b$c;

    iput-object v1, p0, Lcom/google/android/material/tabs/b;->f:Landroidx/recyclerview/widget/RecyclerView$h;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/material/tabs/b;->g:Z

    return-void
.end method

.method public c()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/material/tabs/b;->a:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->O()V

    iget-object v0, p0, Lcom/google/android/material/tabs/b;->f:Landroidx/recyclerview/widget/RecyclerView$h;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$h;->getItemCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, Lcom/google/android/material/tabs/b;->a:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v3}, Lcom/google/android/material/tabs/TabLayout;->L()Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/material/tabs/b;->e:Lcom/google/android/material/tabs/b$b;

    invoke-interface {v4, v3, v2}, Lcom/google/android/material/tabs/b$b;->a(Lcom/google/android/material/tabs/TabLayout$g;I)V

    iget-object v4, p0, Lcom/google/android/material/tabs/b;->a:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v4, v3, v1}, Lcom/google/android/material/tabs/TabLayout;->k(Lcom/google/android/material/tabs/TabLayout$g;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/tabs/b;->a:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->E()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lcom/google/android/material/tabs/b;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->d()I

    move-result v1

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/tabs/b;->a:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->C()I

    move-result v1

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Lcom/google/android/material/tabs/b;->a:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v1, v0}, Lcom/google/android/material/tabs/TabLayout;->D(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/material/tabs/TabLayout;->T(Lcom/google/android/material/tabs/TabLayout$g;)V

    :cond_1
    return-void
.end method
