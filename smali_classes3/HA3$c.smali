.class public final LHA3$c;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHA3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\r\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J?\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000c\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002J\u000c\u0010\u0012\u001a\u00020\u0010*\u00020\u0010H\u0002R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001f"
    }
    d2 = {
        "LHA3$c;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "batteryLevel",
        "distance",
        "tripDistance",
        "Lkotlin/Function1;",
        "",
        "",
        "distanceFormatter",
        "j",
        "(IILjava/lang/Integer;Lkotlin/jvm/functions/Function1;)V",
        "",
        "",
        "o",
        "p",
        "LRa2;",
        "b",
        "LRa2;",
        "binding",
        "Landroid/animation/AnimatorSet;",
        "c",
        "Landroid/animation/AnimatorSet;",
        "animator",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LHA3;Landroid/view/View;)V",
        "ownedbirds_release"
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
        "SMAP\nOwnedBirdDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$DetailsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n18#2:349\n9#3,4:350\n1#4:354\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$DetailsViewHolder\n*L\n124#1:349\n124#1:350,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LRa2;

.field public c:Landroid/animation/AnimatorSet;

.field public final synthetic d:LHA3;


# direct methods
.method public constructor <init>(LHA3;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LHA3$c;->d:LHA3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LRa2;->a(Landroid/view/View;)LRa2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LHA3$c;->b:LRa2;

    return-void
.end method

.method public static synthetic a(LHA3$c;Lkotlin/jvm/functions/Function1;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1, p2}, LHA3$c;->n(LHA3$c;Lkotlin/jvm/functions/Function1;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic b(LHA3$c;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, LHA3$c;->l(LHA3$c;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic e(LHA3$c;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, LHA3$c;->k(LHA3$c;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic i(LHA3$c;Lkotlin/jvm/functions/Function1;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1, p2}, LHA3$c;->m(LHA3$c;Lkotlin/jvm/functions/Function1;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static final k(LHA3$c;Landroid/animation/ValueAnimator;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "anim"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LHA3$c;->b:LRa2;

    iget-object v0, v0, LRa2;->b:Landroid/widget/TextView;

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    sget v1, Lnl4;->battery_percent:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v3, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static final l(LHA3$c;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "anim"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LHA3$c;->b:LRa2;

    iget-object p0, p0, LRa2;->e:Lco/bird/android/widget/BatteryViewV2;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lco/bird/android/widget/BatteryViewV2;->setBatteryLevel(F)V

    return-void
.end method

.method public static final m(LHA3$c;Lkotlin/jvm/functions/Function1;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$distanceFormatter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "anim"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LHA3$c;->b:LRa2;

    iget-object p0, p0, LRa2;->m:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Float;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static final n(LHA3$c;Lkotlin/jvm/functions/Function1;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$distanceFormatter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "anim"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LHA3$c;->b:LRa2;

    iget-object p0, p0, LRa2;->o:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Float;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 7

    iget-object v0, p0, LHA3$c;->d:LHA3;

    invoke-static {v0}, LHA3;->access$getAdapterData(LHA3;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LeL;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LeL;

    if-eqz p1, :cond_9

    iget-object v0, p0, LHA3$c;->b:LRa2;

    iget-object v0, v0, LRa2;->i:Landroid/widget/ImageView;

    invoke-virtual {p1}, LeL;->f()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, LHA3$c;->b:LRa2;

    iget-object v0, v0, LRa2;->i:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    if-eqz v2, :cond_1

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    const/4 v2, 0x0

    if-nez v0, :cond_2

    goto :goto_4

    :cond_2
    invoke-virtual {p1}, LeL;->c()Lco/bird/android/model/constant/BirdModel;

    move-result-object v3

    sget-object v4, Lco/bird/android/model/constant/BirdModel;->BIRDBIKE_UNPAIRED:Lco/bird/android/model/constant/BirdModel;

    if-eq v3, v4, :cond_4

    invoke-virtual {p1}, LeL;->c()Lco/bird/android/model/constant/BirdModel;

    move-result-object v3

    sget-object v4, Lco/bird/android/model/constant/BirdModel;->BIRDBIKE_PAIRABLE:Lco/bird/android/model/constant/BirdModel;

    if-ne v3, v4, :cond_3

    goto :goto_2

    :cond_3
    iget-object v3, p0, LHA3$c;->b:LRa2;

    iget-object v3, v3, LRa2;->i:Landroid/widget/ImageView;

    const-string v4, "binding.image"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v4, 0x12

    invoke-static {v3, v4}, Ltu6;->d(Landroid/view/View;I)I

    move-result v3

    goto :goto_3

    :cond_4
    :goto_2
    move v3, v2

    :goto_3
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    :goto_4
    iget-object v0, p0, LHA3$c;->b:LRa2;

    iget-object v0, v0, LRa2;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, LeL;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, LeL;->h()Ljava/lang/Integer;

    move-result-object v0

    const/4 v3, 0x1

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {p1}, LeL;->c()Lco/bird/android/model/constant/BirdModel;

    move-result-object v5

    sget-object v6, Lco/bird/android/model/constant/BirdModel;->ES500:Lco/bird/android/model/constant/BirdModel;

    if-ne v5, v6, :cond_6

    if-lez v4, :cond_5

    goto :goto_5

    :cond_5
    move v4, v2

    goto :goto_6

    :cond_6
    :goto_5
    move v4, v3

    :goto_6
    if-eqz v4, :cond_7

    goto :goto_7

    :cond_7
    move-object v0, v1

    :goto_7
    if-eqz v0, :cond_8

    goto :goto_8

    :cond_8
    move v3, v2

    :goto_8
    iget-object v0, p0, LHA3$c;->b:LRa2;

    iget-object v0, v0, LRa2;->o:Landroid/widget/TextView;

    const-string v4, "binding.trip"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x2

    invoke-static {v0, v3, v2, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LHA3$c;->b:LRa2;

    iget-object v0, v0, LRa2;->p:Landroid/widget/TextView;

    const-string v5, "binding.tripLabel"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v3, v2, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, LeL;->b()I

    move-result v0

    invoke-virtual {p1}, LeL;->e()I

    move-result v1

    invoke-virtual {p1}, LeL;->h()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1}, LeL;->g()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-virtual {p0, v0, v1, v2, p1}, LHA3$c;->j(IILjava/lang/Integer;Lkotlin/jvm/functions/Function1;)V

    :cond_9
    return-void
.end method

.method public final j(IILjava/lang/Integer;Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/Integer;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Number;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LHA3$c;->c:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    :cond_0
    const/4 v0, 0x2

    new-array v1, v0, [I

    iget-object v2, p0, LHA3$c;->b:LRa2;

    iget-object v2, v2, LRa2;->b:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    const-string v3, "binding.battery.text"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v2}, LHA3$c;->o(Ljava/lang/CharSequence;)F

    move-result v2

    float-to-int v2, v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x1

    aput p1, v1, v2

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v1

    new-instance v4, LIA3;

    invoke-direct {v4, p0}, LIA3;-><init>(LHA3$c;)V

    invoke-virtual {v1, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v4, v0, [F

    iget-object v5, p0, LHA3$c;->b:LRa2;

    iget-object v5, v5, LRa2;->e:Lco/bird/android/widget/BatteryViewV2;

    invoke-virtual {v5}, Lco/bird/android/widget/BatteryViewV2;->f()F

    move-result v5

    aput v5, v4, v3

    int-to-float p1, p1

    const/high16 v5, 0x42c80000    # 100.0f

    div-float/2addr p1, v5

    aput p1, v4, v2

    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    new-instance v4, LJA3;

    invoke-direct {v4, p0}, LJA3;-><init>(LHA3$c;)V

    invoke-virtual {p1, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v4, v0, [F

    iget-object v5, p0, LHA3$c;->b:LRa2;

    iget-object v5, v5, LRa2;->m:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    const-string v6, "binding.ridden.text"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v5}, LHA3$c;->o(Ljava/lang/CharSequence;)F

    move-result v5

    invoke-virtual {p0, v5}, LHA3$c;->p(F)F

    move-result v5

    aput v5, v4, v3

    int-to-float p2, p2

    aput p2, v4, v2

    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p2

    new-instance v4, LKA3;

    invoke-direct {v4, p0, p4}, LKA3;-><init>(LHA3$c;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v4, v0, [F

    iget-object v5, p0, LHA3$c;->b:LRa2;

    iget-object v5, v5, LRa2;->o:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    const-string v6, "binding.trip.text"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v5}, LHA3$c;->o(Ljava/lang/CharSequence;)F

    move-result v5

    invoke-virtual {p0, v5}, LHA3$c;->p(F)F

    move-result v5

    aput v5, v4, v3

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    int-to-float p3, p3

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    :goto_0
    aput p3, v4, v2

    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p3

    new-instance v4, LLA3;

    invoke-direct {v4, p0, p4}, LLA3;-><init>(LHA3$c;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p3, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance p4, Landroid/animation/AnimatorSet;

    invoke-direct {p4}, Landroid/animation/AnimatorSet;-><init>()V

    const-wide/16 v4, 0x3e8

    invoke-virtual {p4, v4, v5}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    invoke-static {}, LHA3;->access$getINTERPOLATOR$cp()Landroid/view/animation/AccelerateDecelerateInterpolator;

    move-result-object v4

    invoke-virtual {p4, v4}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const/4 v4, 0x4

    new-array v4, v4, [Landroid/animation/Animator;

    aput-object v1, v4, v3

    aput-object p1, v4, v2

    aput-object p2, v4, v0

    const/4 p1, 0x3

    aput-object p3, v4, p1

    invoke-virtual {p4, v4}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    invoke-virtual {p4}, Landroid/animation/AnimatorSet;->start()V

    iput-object p4, p0, LHA3$c;->c:Landroid/animation/AnimatorSet;

    return-void
.end method

.method public final o(Ljava/lang/CharSequence;)F
    .locals 4

    invoke-static {}, LHA3;->access$getNUMBER_REGEX$cp()Lkotlin/text/Regex;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lkotlin/text/MatchResult;->getGroups()Lkotlin/text/MatchGroupCollection;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lkotlin/text/MatchGroupCollection;->get(I)Lkotlin/text/MatchGroup;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lkotlin/text/MatchGroup;->getValue()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/text/StringsKt;->toFloatOrNull(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final p(F)F
    .locals 3

    sget-object v0, Lxx1;->a:Lxx1;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v2, "getDefault()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lxx1;->w(Ljava/util/Locale;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x44c92ae1

    goto :goto_0

    :cond_0
    const/high16 v0, 0x447a0000    # 1000.0f

    :goto_0
    mul-float/2addr p1, v0

    return p1
.end method
