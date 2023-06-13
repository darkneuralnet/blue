.class public Lme/relex/circleindicator/CircleIndicator2;
.super Lme/relex/circleindicator/BaseCircleIndicator;
.source "SourceFile"


# instance fields
.field public n:Landroidx/recyclerview/widget/RecyclerView;

.field public o:Landroidx/recyclerview/widget/v;

.field public final p:Landroidx/recyclerview/widget/RecyclerView$t;

.field public final q:Landroidx/recyclerview/widget/RecyclerView$j;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lme/relex/circleindicator/BaseCircleIndicator;-><init>(Landroid/content/Context;)V

    new-instance p1, Lme/relex/circleindicator/CircleIndicator2$a;

    invoke-direct {p1, p0}, Lme/relex/circleindicator/CircleIndicator2$a;-><init>(Lme/relex/circleindicator/CircleIndicator2;)V

    iput-object p1, p0, Lme/relex/circleindicator/CircleIndicator2;->p:Landroidx/recyclerview/widget/RecyclerView$t;

    new-instance p1, Lme/relex/circleindicator/CircleIndicator2$b;

    invoke-direct {p1, p0}, Lme/relex/circleindicator/CircleIndicator2$b;-><init>(Lme/relex/circleindicator/CircleIndicator2;)V

    iput-object p1, p0, Lme/relex/circleindicator/CircleIndicator2;->q:Landroidx/recyclerview/widget/RecyclerView$j;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lme/relex/circleindicator/BaseCircleIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Lme/relex/circleindicator/CircleIndicator2$a;

    invoke-direct {p1, p0}, Lme/relex/circleindicator/CircleIndicator2$a;-><init>(Lme/relex/circleindicator/CircleIndicator2;)V

    iput-object p1, p0, Lme/relex/circleindicator/CircleIndicator2;->p:Landroidx/recyclerview/widget/RecyclerView$t;

    new-instance p1, Lme/relex/circleindicator/CircleIndicator2$b;

    invoke-direct {p1, p0}, Lme/relex/circleindicator/CircleIndicator2$b;-><init>(Lme/relex/circleindicator/CircleIndicator2;)V

    iput-object p1, p0, Lme/relex/circleindicator/CircleIndicator2;->q:Landroidx/recyclerview/widget/RecyclerView$j;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lme/relex/circleindicator/BaseCircleIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Lme/relex/circleindicator/CircleIndicator2$a;

    invoke-direct {p1, p0}, Lme/relex/circleindicator/CircleIndicator2$a;-><init>(Lme/relex/circleindicator/CircleIndicator2;)V

    iput-object p1, p0, Lme/relex/circleindicator/CircleIndicator2;->p:Landroidx/recyclerview/widget/RecyclerView$t;

    new-instance p1, Lme/relex/circleindicator/CircleIndicator2$b;

    invoke-direct {p1, p0}, Lme/relex/circleindicator/CircleIndicator2$b;-><init>(Lme/relex/circleindicator/CircleIndicator2;)V

    iput-object p1, p0, Lme/relex/circleindicator/CircleIndicator2;->q:Landroidx/recyclerview/widget/RecyclerView$j;

    return-void
.end method

.method public static synthetic j(Lme/relex/circleindicator/CircleIndicator2;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    iget-object p0, p0, Lme/relex/circleindicator/CircleIndicator2;->n:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method public static synthetic k(Lme/relex/circleindicator/CircleIndicator2;)V
    .locals 0

    invoke-virtual {p0}, Lme/relex/circleindicator/CircleIndicator2;->l()V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(I)V
    .locals 0

    invoke-super {p0, p1}, Lme/relex/circleindicator/BaseCircleIndicator;->b(I)V

    return-void
.end method

.method public bridge synthetic f(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Lme/relex/circleindicator/BaseCircleIndicator;->f(II)V

    return-void
.end method

.method public bridge synthetic i(LHu0;)V
    .locals 0

    invoke-super {p0, p1}, Lme/relex/circleindicator/BaseCircleIndicator;->i(LHu0;)V

    return-void
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, Lme/relex/circleindicator/CircleIndicator2;->n:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$h;->getItemCount()I

    move-result v0

    :goto_0
    iget-object v1, p0, Lme/relex/circleindicator/CircleIndicator2;->n:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$p;

    move-result-object v1

    invoke-virtual {p0, v1}, Lme/relex/circleindicator/CircleIndicator2;->m(Landroidx/recyclerview/widget/RecyclerView$p;)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lme/relex/circleindicator/CircleIndicator2;->f(II)V

    return-void
.end method

.method public m(Landroidx/recyclerview/widget/RecyclerView$p;)I
    .locals 2

    const/4 v0, -0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lme/relex/circleindicator/CircleIndicator2;->o:Landroidx/recyclerview/widget/v;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/v;->g(Landroidx/recyclerview/widget/RecyclerView$p;)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$p;->x0(Landroid/view/View;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic setIndicatorCreatedListener(Lme/relex/circleindicator/BaseCircleIndicator$a;)V
    .locals 0

    invoke-super {p0, p1}, Lme/relex/circleindicator/BaseCircleIndicator;->setIndicatorCreatedListener(Lme/relex/circleindicator/BaseCircleIndicator$a;)V

    return-void
.end method
