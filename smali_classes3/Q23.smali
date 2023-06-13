.class public final LQ23;
.super LxE;
.source "SourceFile"

# interfaces
.implements LP23;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0008\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010\u0007\u001a\u00020\u00062\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0012\u0010\n\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016J\u0012\u0010\u000c\u001a\u00020\u00062\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0008H\u0016J\u0019\u0010\u000f\u001a\u00020\u00062\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u00020\u00062\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0008H\u0016R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001f"
    }
    d2 = {
        "LQ23;",
        "LxE;",
        "LP23;",
        "",
        "Lco/bird/android/model/wire/WireNestPhoto;",
        "photos",
        "",
        "Xc",
        "",
        "name",
        "setName",
        "address",
        "setAddress",
        "",
        "availableParking",
        "yh",
        "(Ljava/lang/Integer;)V",
        "notes",
        "f5",
        "Lp4;",
        "b",
        "Lp4;",
        "binding",
        "LH23;",
        "c",
        "LH23;",
        "adapter",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Lp4;)V",
        "nest-details_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lp4;

.field public c:LH23;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Lp4;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, LQ23;->b:Lp4;

    return-void
.end method


# virtual methods
.method public Xc(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireNestPhoto;",
            ">;)V"
        }
    .end annotation

    const-string v0, "photos"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LH23;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    invoke-direct {v0, v1, p1}, LH23;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, LQ23;->c:LH23;

    iget-object p1, p0, LQ23;->b:Lp4;

    iget-object p1, p1, Lp4;->b:LT33;

    iget-object p1, p1, LT33;->j:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(LcE3;)V

    iget-object p1, p0, LQ23;->b:Lp4;

    iget-object p1, p1, Lp4;->b:LT33;

    iget-object p1, p1, LT33;->j:Landroidx/viewpager/widget/ViewPager;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    iget-object p1, p0, LQ23;->b:Lp4;

    iget-object p1, p1, Lp4;->b:LT33;

    iget-object v0, p1, LT33;->i:Lcom/viewpagerindicator/CirclePageIndicator;

    iget-object p1, p1, LT33;->j:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, p1}, Lcom/viewpagerindicator/CirclePageIndicator;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    iget-object p1, p0, LQ23;->b:Lp4;

    iget-object p1, p1, Lp4;->b:LT33;

    iget-object p1, p1, LT33;->i:Lcom/viewpagerindicator/CirclePageIndicator;

    sget v0, LDf4;->birdNewRoad:I

    invoke-virtual {p0, v0}, LXC;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/viewpagerindicator/CirclePageIndicator;->setPageColor(I)V

    iget-object p1, p0, LQ23;->b:Lp4;

    iget-object p1, p1, Lp4;->b:LT33;

    iget-object p1, p1, LT33;->i:Lcom/viewpagerindicator/CirclePageIndicator;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, LfB0;->b(Landroid/content/Context;F)F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/viewpagerindicator/CirclePageIndicator;->setRadius(F)V

    iget-object p1, p0, LQ23;->b:Lp4;

    iget-object p1, p1, Lp4;->b:LT33;

    iget-object p1, p1, LT33;->i:Lcom/viewpagerindicator/CirclePageIndicator;

    sget v0, LDf4;->white:I

    invoke-virtual {p0, v0}, LXC;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/viewpagerindicator/CirclePageIndicator;->setFillColor(I)V

    return-void
.end method

.method public f5(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LQ23;->b:Lp4;

    iget-object v0, v0, Lp4;->b:LT33;

    iget-object v0, v0, LT33;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setAddress(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LQ23;->b:Lp4;

    iget-object v0, v0, Lp4;->b:LT33;

    iget-object v0, v0, LT33;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LQ23;->b:Lp4;

    iget-object v0, v0, Lp4;->b:LT33;

    iget-object v0, v0, LT33;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public yh(Ljava/lang/Integer;)V
    .locals 5

    iget-object v0, p0, LQ23;->b:Lp4;

    iget-object v0, v0, Lp4;->b:LT33;

    iget-object v0, v0, LT33;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lnl4;->nest_details_capacity:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
