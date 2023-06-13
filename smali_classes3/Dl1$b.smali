.class public final LDl1$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDl1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0014"
    }
    d2 = {
        "LDl1$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "",
        "visible",
        "b",
        "LFf2;",
        "LFf2;",
        "binding",
        "Landroid/animation/ValueAnimator;",
        "c",
        "Landroid/animation/ValueAnimator;",
        "overlayAnimator",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LDl1;Landroid/view/View;)V",
        "notification-center_release"
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
        "SMAP\nFilterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/FilterAdapter$SelectedFilterViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,133:1\n18#2:134\n9#3,4:135\n*S KotlinDebug\n*F\n+ 1 FilterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/FilterAdapter$SelectedFilterViewHolder\n*L\n81#1:134\n81#1:135,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LFf2;

.field public c:Landroid/animation/ValueAnimator;

.field public final synthetic d:LDl1;


# direct methods
.method public constructor <init>(LDl1;Landroid/view/View;)V
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

    iput-object p1, p0, LDl1$b;->d:LDl1;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LFf2;->a(Landroid/view/View;)LFf2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LDl1$b;->b:LFf2;

    invoke-virtual {p2}, LFf2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LDl1$b$a;

    invoke-direct {v0, p1, p0}, LDl1$b$a;-><init>(LDl1;LDl1$b;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic a(LDl1;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, LDl1$b;->e(LDl1;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static final e(LDl1;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LDl1;->access$getOverlay$p(LDl1;)Landroid/view/View;

    move-result-object p0

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 5

    iget-object v0, p0, LDl1$b;->c:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v4, Lrg4;->ic_filled_carrot_up:I

    invoke-static {p1, v4}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-object v4, p0, LDl1$b;->b:LFf2;

    iget-object v4, v4, LFf2;->c:Landroid/widget/TextView;

    invoke-virtual {v4, v3, v3, p1, v3}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, LDl1$b;->d:LDl1;

    invoke-static {p1}, LDl1;->access$getRecyclerView$p(LDl1;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, LNg4;->category_background:I

    invoke-static {v3, v4}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    new-array p1, v2, [F

    iget-object v2, p0, LDl1$b;->d:LDl1;

    invoke-static {v2}, LDl1;->access$getOverlay$p(LDl1;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    move-result v2

    aput v2, p1, v1

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, p1, v0

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    iput-object p1, p0, LDl1$b;->c:Landroid/animation/ValueAnimator;

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v4, Lrg4;->ic_filled_carrot_down:I

    invoke-static {p1, v4}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-object v4, p0, LDl1$b;->b:LFf2;

    iget-object v4, v4, LFf2;->c:Landroid/widget/TextView;

    invoke-virtual {v4, v3, v3, p1, v3}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, LDl1$b;->d:LDl1;

    invoke-static {p1}, LDl1;->access$getRecyclerView$p(LDl1;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, LDf4;->baseBG:I

    invoke-static {v3, v4}, LNA0;->c(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_3
    new-array p1, v2, [F

    iget-object v2, p0, LDl1$b;->d:LDl1;

    invoke-static {v2}, LDl1;->access$getOverlay$p(LDl1;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    move-result v2

    aput v2, p1, v1

    const/4 v1, 0x0

    aput v1, p1, v0

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    iput-object p1, p0, LDl1$b;->c:Landroid/animation/ValueAnimator;

    :goto_1
    iget-object p1, p0, LDl1$b;->c:Landroid/animation/ValueAnimator;

    if-eqz p1, :cond_4

    const-wide/16 v0, 0x64

    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v0, p0, LDl1$b;->d:LDl1;

    new-instance v1, LEl1;

    invoke-direct {v1, v0}, LEl1;-><init>(LDl1;)V

    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    :cond_4
    return-void
.end method

.method public bind(I)V
    .locals 3

    iget-object v0, p0, LDl1$b;->d:LDl1;

    invoke-static {v0}, LDl1;->access$getSelectedFilterViewHolder$p(LDl1;)LDl1$b;

    move-result-object v0

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LDl1$b;->d:LDl1;

    invoke-static {v0, p0}, LDl1;->access$setSelectedFilterViewHolder$p(LDl1;LDl1$b;)V

    :cond_0
    iget-object v0, p0, LDl1$b;->b:LFf2;

    iget-object v0, v0, LFf2;->c:Landroid/widget/TextView;

    iget-object v1, p0, LDl1$b;->d:LDl1;

    invoke-static {v1}, LDl1;->access$getAdapterData(LDl1;)LE6;

    move-result-object v1

    invoke-virtual {v1, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Lco/bird/android/model/persistence/OperatorNotificationCategory;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v2

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/OperatorNotificationCategory;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorNotificationCategory;->getTitle()Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
