.class public final Lco/bird/android/bottomsheet/BaseBottomSheet$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/bottomsheet/BaseBottomSheet;->onAttachedToWindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lj00;",
        "+",
        "Ldt4;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\n\u001a\u00020\u0007\"\u0008\u0008\u0000\u0010\u0001*\u00020\u000026\u0010\u0006\u001a2\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0005 \u0004*\u0018\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lco/bird/android/model/BottomSheetButton;",
        "T",
        "Lkotlin/Pair;",
        "Lj00;",
        "kotlin.jvm.PlatformType",
        "Ldt4;",
        "<name for destructuring parameter 0>",
        "",
        "invoke",
        "(Lkotlin/Pair;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/bottomsheet/BaseBottomSheet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/bottomsheet/BaseBottomSheet<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/bottomsheet/BaseBottomSheet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/bottomsheet/BaseBottomSheet<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$f;->g:Lco/bird/android/bottomsheet/BaseBottomSheet;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/bottomsheet/BaseBottomSheet$f;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lj00;",
            "Ldt4;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj00;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldt4;

    iget-object v1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$f;->g:Lco/bird/android/bottomsheet/BaseBottomSheet;

    const-string v2, "bottomSheetEvent"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->access$shouldLockBottomSheet(Lco/bird/android/bottomsheet/BaseBottomSheet;Lj00;)Z

    move-result v1

    const-string v2, "binding.arrowContainer"

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    iget-object p1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$f;->g:Lco/bird/android/bottomsheet/BaseBottomSheet;

    invoke-virtual {p1}, Lco/bird/android/bottomsheet/BaseBottomSheet;->u()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object p1

    instance-of v1, p1, Lco/bird/android/widget/behavior/LockableBottomSheetBehavior;

    if-eqz v1, :cond_0

    check-cast p1, Lco/bird/android/widget/behavior/LockableBottomSheetBehavior;

    goto :goto_0

    :cond_0
    move-object p1, v5

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v4}, Lco/bird/android/widget/behavior/LockableBottomSheetBehavior;->D0(Z)V

    :goto_1
    iget-object p1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$f;->g:Lco/bird/android/bottomsheet/BaseBottomSheet;

    invoke-static {p1}, Lco/bird/android/bottomsheet/BaseBottomSheet;->access$getBinding$p(Lco/bird/android/bottomsheet/BaseBottomSheet;)LHp6;

    move-result-object p1

    iget-object p1, p1, LHp6;->c:Landroid/widget/FrameLayout;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v4, v4, v3, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto/16 :goto_6

    :cond_2
    iget-object v1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$f;->g:Lco/bird/android/bottomsheet/BaseBottomSheet;

    invoke-virtual {v1}, Lco/bird/android/bottomsheet/BaseBottomSheet;->u()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v1

    instance-of v6, v1, Lco/bird/android/widget/behavior/LockableBottomSheetBehavior;

    if-eqz v6, :cond_3

    check-cast v1, Lco/bird/android/widget/behavior/LockableBottomSheetBehavior;

    goto :goto_2

    :cond_3
    move-object v1, v5

    :goto_2
    const/4 v6, 0x1

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v1, v6}, Lco/bird/android/widget/behavior/LockableBottomSheetBehavior;->D0(Z)V

    :goto_3
    iget-object v1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$f;->g:Lco/bird/android/bottomsheet/BaseBottomSheet;

    invoke-static {v1}, Lco/bird/android/bottomsheet/BaseBottomSheet;->access$getBinding$p(Lco/bird/android/bottomsheet/BaseBottomSheet;)LHp6;

    move-result-object v1

    iget-object v1, v1, LHp6;->c:Landroid/widget/FrameLayout;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v6, v4, v3, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, Ldt4;->a()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    const/4 v1, -0x1

    invoke-virtual {p1, v1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p1

    xor-int/2addr p1, v6

    invoke-virtual {v0}, Lj00;->c()I

    move-result v1

    const/4 v2, 0x3

    const/4 v4, 0x0

    if-ne v1, v2, :cond_6

    if-eqz p1, :cond_5

    goto :goto_4

    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$f;->g:Lco/bird/android/bottomsheet/BaseBottomSheet;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v4

    :goto_4
    iget-object p1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$f;->g:Lco/bird/android/bottomsheet/BaseBottomSheet;

    const/high16 v1, 0x43340000    # 180.0f

    invoke-static {p1, v1}, Lco/bird/android/bottomsheet/BaseBottomSheet;->access$animateArrowRotation(Lco/bird/android/bottomsheet/BaseBottomSheet;F)V

    iget-object p1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$f;->g:Lco/bird/android/bottomsheet/BaseBottomSheet;

    invoke-static {p1, v4}, Lco/bird/android/bottomsheet/BaseBottomSheet;->access$animateArrowElevation(Lco/bird/android/bottomsheet/BaseBottomSheet;F)V

    goto :goto_5

    :cond_6
    invoke-virtual {v0}, Lj00;->c()I

    move-result p1

    if-eq p1, v2, :cond_7

    iget-object p1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$f;->g:Lco/bird/android/bottomsheet/BaseBottomSheet;

    invoke-static {p1, v4}, Lco/bird/android/bottomsheet/BaseBottomSheet;->access$animateArrowRotation(Lco/bird/android/bottomsheet/BaseBottomSheet;F)V

    iget-object p1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$f;->g:Lco/bird/android/bottomsheet/BaseBottomSheet;

    invoke-static {p1, v4}, Lco/bird/android/bottomsheet/BaseBottomSheet;->access$animateArrowElevation(Lco/bird/android/bottomsheet/BaseBottomSheet;F)V

    :cond_7
    :goto_5
    iget-object p1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$f;->g:Lco/bird/android/bottomsheet/BaseBottomSheet;

    invoke-static {p1}, Lco/bird/android/bottomsheet/BaseBottomSheet;->access$getBinding$p(Lco/bird/android/bottomsheet/BaseBottomSheet;)LHp6;

    move-result-object p1

    iget-object p1, p1, LHp6;->b:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :goto_6
    invoke-virtual {v0}, Lj00;->c()I

    move-result p1

    invoke-static {p1}, LHZ;->a(I)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$f;->g:Lco/bird/android/bottomsheet/BaseBottomSheet;

    invoke-virtual {p1}, Lco/bird/android/bottomsheet/BaseBottomSheet;->K()V

    goto :goto_7

    :cond_8
    iget-object p1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$f;->g:Lco/bird/android/bottomsheet/BaseBottomSheet;

    invoke-static {p1}, Lco/bird/android/bottomsheet/BaseBottomSheet;->access$getPeekHeightUpdateRunnable$p(Lco/bird/android/bottomsheet/BaseBottomSheet;)Lco/bird/android/bottomsheet/BaseBottomSheet$i;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :goto_7
    return-void
.end method
