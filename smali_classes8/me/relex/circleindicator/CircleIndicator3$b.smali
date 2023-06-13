.class public Lme/relex/circleindicator/CircleIndicator3$b;
.super Landroidx/recyclerview/widget/RecyclerView$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/relex/circleindicator/CircleIndicator3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lme/relex/circleindicator/CircleIndicator3;


# direct methods
.method public constructor <init>(Lme/relex/circleindicator/CircleIndicator3;)V
    .locals 0

    iput-object p1, p0, Lme/relex/circleindicator/CircleIndicator3$b;->a:Lme/relex/circleindicator/CircleIndicator3;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$j;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 3

    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView$j;->onChanged()V

    iget-object v0, p0, Lme/relex/circleindicator/CircleIndicator3$b;->a:Lme/relex/circleindicator/CircleIndicator3;

    invoke-static {v0}, Lme/relex/circleindicator/CircleIndicator3;->j(Lme/relex/circleindicator/CircleIndicator3;)Landroidx/viewpager2/widget/ViewPager2;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lme/relex/circleindicator/CircleIndicator3$b;->a:Lme/relex/circleindicator/CircleIndicator3;

    invoke-static {v0}, Lme/relex/circleindicator/CircleIndicator3;->j(Lme/relex/circleindicator/CircleIndicator3;)Landroidx/viewpager2/widget/ViewPager2;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->c()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$h;->getItemCount()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lme/relex/circleindicator/CircleIndicator3$b;->a:Lme/relex/circleindicator/CircleIndicator3;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ne v0, v1, :cond_2

    return-void

    :cond_2
    iget-object v1, p0, Lme/relex/circleindicator/CircleIndicator3$b;->a:Lme/relex/circleindicator/CircleIndicator3;

    iget v2, v1, Lme/relex/circleindicator/BaseCircleIndicator;->m:I

    if-ge v2, v0, :cond_3

    invoke-static {v1}, Lme/relex/circleindicator/CircleIndicator3;->j(Lme/relex/circleindicator/CircleIndicator3;)Landroidx/viewpager2/widget/ViewPager2;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->d()I

    move-result v0

    iput v0, v1, Lme/relex/circleindicator/BaseCircleIndicator;->m:I

    goto :goto_1

    :cond_3
    const/4 v0, -0x1

    iput v0, v1, Lme/relex/circleindicator/BaseCircleIndicator;->m:I

    :goto_1
    iget-object v0, p0, Lme/relex/circleindicator/CircleIndicator3$b;->a:Lme/relex/circleindicator/CircleIndicator3;

    invoke-static {v0}, Lme/relex/circleindicator/CircleIndicator3;->k(Lme/relex/circleindicator/CircleIndicator3;)V

    return-void
.end method

.method public onItemRangeChanged(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$j;->onItemRangeChanged(II)V

    invoke-virtual {p0}, Lme/relex/circleindicator/CircleIndicator3$b;->onChanged()V

    return-void
.end method

.method public onItemRangeChanged(IILjava/lang/Object;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$j;->onItemRangeChanged(IILjava/lang/Object;)V

    invoke-virtual {p0}, Lme/relex/circleindicator/CircleIndicator3$b;->onChanged()V

    return-void
.end method

.method public onItemRangeInserted(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$j;->onItemRangeInserted(II)V

    invoke-virtual {p0}, Lme/relex/circleindicator/CircleIndicator3$b;->onChanged()V

    return-void
.end method

.method public onItemRangeMoved(III)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$j;->onItemRangeMoved(III)V

    invoke-virtual {p0}, Lme/relex/circleindicator/CircleIndicator3$b;->onChanged()V

    return-void
.end method

.method public onItemRangeRemoved(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$j;->onItemRangeRemoved(II)V

    invoke-virtual {p0}, Lme/relex/circleindicator/CircleIndicator3$b;->onChanged()V

    return-void
.end method
