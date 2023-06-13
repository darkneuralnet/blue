.class public final LvN1;
.super LxE;
.source "SourceFile"

# interfaces
.implements LuN1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J \u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\u00a8\u0006\'"
    }
    d2 = {
        "LvN1;",
        "LxE;",
        "LuN1;",
        "",
        "rules",
        "",
        "m3",
        "",
        "basePrice",
        "pricePerMinute",
        "Ljava/util/Currency;",
        "currency",
        "A6",
        "Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;",
        "b",
        "Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;",
        "viewPager",
        "Lcom/viewpagerindicator/CirclePageIndicator;",
        "c",
        "Lcom/viewpagerindicator/CirclePageIndicator;",
        "pageIndicator",
        "Landroid/widget/Button;",
        "d",
        "Landroid/widget/Button;",
        "nextButton",
        "Landroid/widget/TextView;",
        "e",
        "Landroid/widget/TextView;",
        "pricingMessage",
        "LKa6;",
        "f",
        "LKa6;",
        "Pl",
        "()LKa6;",
        "adapter",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;

.field public final c:Lcom/viewpagerindicator/CirclePageIndicator;

.field public final d:Landroid/widget/Button;

.field public final e:Landroid/widget/TextView;

.field public final f:LKa6;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 10

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    sget v0, LVg4;->viewPager:I

    invoke-static {p1, v0}, LfB0;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;

    iput-object v0, p0, LvN1;->b:Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;

    sget v1, LVg4;->pageIndicator:I

    invoke-static {p1, v1}, LfB0;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/viewpagerindicator/CirclePageIndicator;

    iput-object v1, p0, LvN1;->c:Lcom/viewpagerindicator/CirclePageIndicator;

    sget v2, LVg4;->nextButton:I

    invoke-static {p1, v2}, LfB0;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    iput-object v2, p0, LvN1;->d:Landroid/widget/Button;

    sget v3, LVg4;->pricingMessage:I

    invoke-static {p1, v3}, LfB0;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, LvN1;->e:Landroid/widget/TextView;

    new-instance v3, LKa6;

    const/16 v4, 0x9

    new-array v4, v4, [Ljava/lang/Integer;

    sget v5, Lyg4;->tutorial_unlock:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    sget v5, Lyg4;->tutorial_helmet:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v7, 0x1

    aput-object v5, v4, v7

    sget v5, Lyg4;->tutorial_start_bird:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v7, 0x2

    aput-object v5, v4, v7

    sget v5, Lyg4;->tutorial_foot_replacement:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v7, 0x3

    aput-object v5, v4, v7

    sget v5, Lyg4;->tutorial_where:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v8, 0x4

    aput-object v5, v4, v8

    sget v5, Lyg4;->tutorial_brake:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v9, 0x5

    aput-object v5, v4, v9

    sget v5, Lyg4;->tutorial_parking:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v9, 0x6

    aput-object v5, v4, v9

    sget v5, Lyg4;->tutorial_end_ride:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v9, 0x7

    aput-object v5, v4, v9

    const/16 v5, 0x8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v4, v5

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, p1, v4}, LKa6;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v3, p0, LvN1;->f:LKa6;

    invoke-virtual {v0, v3}, Landroidx/viewpager/widget/ViewPager;->setAdapter(LcE3;)V

    invoke-virtual {v0, v7}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    new-instance v3, LpJ6;

    invoke-direct {v3}, LpJ6;-><init>()V

    invoke-virtual {v0, v6, v3}, Landroidx/viewpager/widget/ViewPager;->setPageTransformer(ZLandroidx/viewpager/widget/ViewPager$j;)V

    invoke-virtual {v0}, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->g()Landroidx/viewpager/widget/ViewPager$i;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/viewpagerindicator/CirclePageIndicator;->setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V

    new-instance v3, LvN1$a;

    invoke-direct {v3, p0, p1}, LvN1$a;-><init>(LvN1;Lco/bird/android/core/mvp/BaseActivity;)V

    invoke-virtual {v0, v3}, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V

    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v1, v4}, Lcom/viewpagerindicator/CirclePageIndicator;->setStrokeWidth(F)V

    int-to-float v4, v8

    mul-float/2addr v4, v3

    invoke-virtual {v1, v4}, Lcom/viewpagerindicator/CirclePageIndicator;->setRadius(F)V

    invoke-virtual {v1, v0}, Lcom/viewpagerindicator/CirclePageIndicator;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    new-instance v0, LvN1$b;

    invoke-direct {v0, p0, p1}, LvN1$b;-><init>(LvN1;Lco/bird/android/core/mvp/BaseActivity;)V

    invoke-static {v2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$getNextButton$p(LvN1;)Landroid/widget/Button;
    .locals 0

    iget-object p0, p0, LvN1;->d:Landroid/widget/Button;

    return-object p0
.end method

.method public static final synthetic access$getViewPager$p(LvN1;)Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;
    .locals 0

    iget-object p0, p0, LvN1;->b:Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;

    return-object p0
.end method


# virtual methods
.method public A6(JJLjava/util/Currency;)V
    .locals 2

    const-string v0, "currency"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lxx1;->a:Lxx1;

    sget-object v1, LUx1;->d:LUx1;

    invoke-virtual {v0, p1, p2, p5, v1}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p3, p4, p5, v1}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, LvN1;->e:Landroid/widget/TextView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object p4

    invoke-virtual {p4}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    sget p5, Lnl4;->how_to_ride_pricing:I

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    invoke-virtual {p4, p5, v0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final Pl()LKa6;
    .locals 1

    iget-object v0, p0, LvN1;->f:LKa6;

    return-object v0
.end method

.method public m3(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rules"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LvN1;->f:LKa6;

    invoke-virtual {v0, p1}, LKa6;->a(Ljava/lang/String;)V

    return-void
.end method
