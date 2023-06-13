.class public final Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010&\u001a\u00020%\u00a2\u0006\u0004\u0008\'\u0010(B\u0019\u0008\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020)\u00a2\u0006\u0004\u0008\'\u0010+B!\u0008\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010-\u001a\u00020,\u00a2\u0006\u0004\u0008\'\u0010.J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u0004\u001a\u00020\u0002H\u0014J\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008J8\u0010\u0011\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000bJ\u0010\u0010\u0013\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000bR(\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R(\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0017\"\u0004\u0008\u001c\u0010\u0019R\u0016\u0010 \u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006/"
    }
    d2 = {
        "Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;",
        "Landroid/widget/FrameLayout;",
        "",
        "s",
        "onAttachedToWindow",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/constant/BirdAction;",
        "k",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "q",
        "",
        "showChirp",
        "showLockUnlock",
        "showCancelTask",
        "showRemoveFromList",
        "showFlightSheet",
        "r",
        "visible",
        "v",
        "Landroid/animation/ValueAnimator;",
        "value",
        "b",
        "Landroid/animation/ValueAnimator;",
        "t",
        "(Landroid/animation/ValueAnimator;)V",
        "alphaAnimator",
        "c",
        "u",
        "yAnimator",
        "d",
        "Z",
        "lock",
        "LUZ;",
        "e",
        "LUZ;",
        "binding",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public b:Landroid/animation/ValueAnimator;

.field public c:Landroid/animation/ValueAnimator;

.field public d:Z

.field public final e:LUZ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->d:Z

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, LUZ;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)LUZ;

    move-result-object p1

    const-string v0, "inflate(context.layoutInflater, this)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object v0, p1, LUZ;->i:Landroid/view/View;

    new-instance v1, LHu3;

    invoke-direct {v1, p0}, LHu3;-><init>(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p1, LUZ;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p1, LUZ;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p1, LUZ;->b:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    new-instance v0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$a;

    invoke-direct {v0, p0}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$a;-><init>(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attrs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->d:Z

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, LUZ;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)LUZ;

    move-result-object p1

    const-string p2, "inflate(context.layoutInflater, this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object p2, p1, LUZ;->i:Landroid/view/View;

    new-instance v0, LHu3;

    invoke-direct {v0, p0}, LHu3;-><init>(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p1, LUZ;->i:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p2, p1, LUZ;->i:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p1, LUZ;->b:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    new-instance p2, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$a;

    invoke-direct {p2, p0}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$a;-><init>(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)V

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attrs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->d:Z

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, LUZ;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)LUZ;

    move-result-object p1

    const-string p2, "inflate(context.layoutInflater, this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object p2, p1, LUZ;->i:Landroid/view/View;

    new-instance p3, LHu3;

    invoke-direct {p3, p0}, LHu3;-><init>(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p1, LUZ;->i:Landroid/view/View;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Landroid/view/View;->setAlpha(F)V

    iget-object p2, p1, LUZ;->i:Landroid/view/View;

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p1, LUZ;->b:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    new-instance p2, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$a;

    invoke-direct {p2, p0}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$a;-><init>(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)V

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public static synthetic a(ZLco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->w(ZLco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)V

    return-void
.end method

.method public static final synthetic access$getBinding$p(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)LUZ;
    .locals 0

    iget-object p0, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    return-object p0
.end method

.method public static final synthetic access$getLock$p(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)Z
    .locals 0

    iget-boolean p0, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->d:Z

    return p0
.end method

.method public static synthetic b(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->y(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic c(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->j(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic configureOptionsToShow$default(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;ZZZZZILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x1

    if-eqz p7, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    const/4 p5, 0x0

    :cond_4
    invoke-virtual/range {p0 .. p5}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->r(ZZZZZ)V

    return-void
.end method

.method public static synthetic d(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;ZLandroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->x(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;ZLandroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/constant/BirdAction;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/constant/BirdAction;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/constant/BirdAction;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/constant/BirdAction;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/constant/BirdAction;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/constant/BirdAction;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/constant/BirdAction;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/constant/BirdAction;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/constant/BirdAction;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/constant/BirdAction;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->v(Z)V

    return-void
.end method

.method public static final l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/constant/BirdAction;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/BirdAction;

    return-object p0
.end method

.method public static final m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/constant/BirdAction;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/BirdAction;

    return-object p0
.end method

.method public static final n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/constant/BirdAction;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/BirdAction;

    return-object p0
.end method

.method public static final o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/constant/BirdAction;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/BirdAction;

    return-object p0
.end method

.method public static final p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/constant/BirdAction;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/BirdAction;

    return-object p0
.end method

.method public static synthetic showOptions$default(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;ZILjava/lang/Object;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->v(Z)V

    return-void
.end method

.method public static final w(ZLco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)V
    .locals 8

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    const/4 v2, 0x0

    if-eqz p0, :cond_1

    iget-object v3, p1, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object v3, v3, LUZ;->i:Landroid/view/View;

    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    const/4 v3, 0x2

    new-array v4, v3, [F

    iget-object v5, p1, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object v5, v5, LUZ;->i:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getAlpha()F

    move-result v5

    aput v5, v4, v2

    const/4 v5, 0x1

    aput v1, v4, v5

    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    invoke-virtual {p1, v1}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->t(Landroid/animation/ValueAnimator;)V

    iget-object v1, p1, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->b:Landroid/animation/ValueAnimator;

    const-wide/16 v6, 0x12c

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    :goto_1
    iget-object v1, p1, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->b:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_3

    new-instance v4, LOu3;

    invoke-direct {v4, p1, p0}, LOu3;-><init>(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;Z)V

    invoke-virtual {v1, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    :cond_3
    iget-object v1, p1, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->b:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    :cond_4
    if-eqz p0, :cond_5

    goto :goto_2

    :cond_5
    iget-object p0, p1, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object p0, p0, LUZ;->b:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p0

    int-to-float v0, p0

    :goto_2
    new-array p0, v3, [F

    iget-object v1, p1, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object v1, v1, LUZ;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/view/View;->getTranslationY()F

    move-result v1

    aput v1, p0, v2

    aput v0, p0, v5

    invoke-static {p0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p0

    invoke-virtual {p1, p0}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->u(Landroid/animation/ValueAnimator;)V

    iget-object p0, p1, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->c:Landroid/animation/ValueAnimator;

    if-nez p0, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    :goto_3
    iget-object p0, p1, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->c:Landroid/animation/ValueAnimator;

    if-nez p0, :cond_7

    goto :goto_4

    :cond_7
    sget-object v0, LD62;->e:LD62;

    invoke-virtual {v0}, LD62;->b()Landroid/view/animation/Interpolator;

    move-result-object v0

    check-cast v0, Landroid/animation/TimeInterpolator;

    invoke-virtual {p0, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    :goto_4
    iget-object p0, p1, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->c:Landroid/animation/ValueAnimator;

    if-eqz p0, :cond_8

    new-instance v0, LPu3;

    invoke-direct {v0, p1}, LPu3;-><init>(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)V

    invoke-virtual {p0, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    :cond_8
    iget-object p0, p1, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->c:Landroid/animation/ValueAnimator;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    :cond_9
    return-void
.end method

.method public static final x(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;ZLandroid/animation/ValueAnimator;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "anim"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object v0, v0, LUZ;->i:Landroid/view/View;

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p2

    const-string v1, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-virtual {v0, p2}, Landroid/view/View;->setAlpha(F)V

    iget-object p2, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object p2, p2, LUZ;->i:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getAlpha()F

    move-result p2

    const/4 v0, 0x0

    cmpg-float p2, p2, v0

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    if-nez p1, :cond_1

    iget-object p0, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object p0, p0, LUZ;->i:Landroid/view/View;

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public static final y(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "anim"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object p0, p0, LUZ;->b:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method


# virtual methods
.method public final k()Lio/reactivex/Observable;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/constant/BirdAction;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x5

    new-array v0, v0, [Lio/reactivex/Observable;

    iget-object v1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object v1, v1, LUZ;->d:Landroid/widget/TextView;

    const-string v2, "binding.chirpAlarm"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v6, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$b;->g:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$b;

    new-instance v7, LJu3;

    invoke-direct {v7, v6}, LJu3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v7}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    const/4 v6, 0x0

    aput-object v1, v0, v6

    iget-object v1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object v1, v1, LUZ;->g:Landroid/widget/TextView;

    const-string v6, "binding.lockUnlock"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2, v3, v4, v5}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    new-instance v6, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$c;

    invoke-direct {v6, p0}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$c;-><init>(Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)V

    new-instance v7, LKu3;

    invoke-direct {v7, v6}, LKu3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v7}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    aput-object v1, v0, v4

    iget-object v1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object v1, v1, LUZ;->c:Landroid/widget/TextView;

    const-string v6, "binding.cancelTask"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2, v3, v4, v5}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v6, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$d;->g:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$d;

    new-instance v7, LLu3;

    invoke-direct {v7, v6}, LLu3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v7}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    const/4 v6, 0x2

    aput-object v1, v0, v6

    iget-object v1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object v1, v1, LUZ;->h:Landroid/widget/TextView;

    const-string v6, "binding.removeFromList"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2, v3, v4, v5}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v6, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$e;->g:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$e;

    new-instance v7, LMu3;

    invoke-direct {v7, v6}, LMu3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v7}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    const/4 v6, 0x3

    aput-object v1, v0, v6

    iget-object v1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object v1, v1, LUZ;->e:Landroid/widget/TextView;

    const-string v6, "binding.flightSheet"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2, v3, v4, v5}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$f;->g:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet$f;

    new-instance v3, LNu3;

    invoke-direct {v3, v2}, LNu3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lio/reactivex/Observable;->merge(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "fun actionsClick(): Obse\u2026SHEET }\n      )\n    )\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 0

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-virtual {p0}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->s()V

    return-void
.end method

.method public final q(Lco/bird/android/model/wire/WireBird;)V
    .locals 2

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getLocked()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->d:Z

    iget-object v0, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object v0, v0, LUZ;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getLocked()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v1, Lnl4;->operator_task_action_unlock:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v1, Lnl4;->operator_task_action_lock:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final r(ZZZZZ)V
    .locals 4

    iget-object v0, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object v0, v0, LUZ;->d:Landroid/widget/TextView;

    const-string v1, "binding.chirpAlarm"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object p1, p1, LUZ;->g:Landroid/widget/TextView;

    const-string v0, "binding.lockUnlock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2, v1, v2, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object p1, p1, LUZ;->c:Landroid/widget/TextView;

    const-string p2, "binding.cancelTask"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3, v1, v2, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object p1, p1, LUZ;->h:Landroid/widget/TextView;

    const-string p2, "binding.removeFromList"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p4, v1, v2, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->e:LUZ;

    iget-object p1, p1, LUZ;->e:Landroid/widget/TextView;

    const-string p2, "binding.flightSheet"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p5, v1, v2, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public final s()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const/4 v1, -0x1

    if-nez v0, :cond_0

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    :cond_0
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final t(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->b:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    iput-object p1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->b:Landroid/animation/ValueAnimator;

    return-void
.end method

.method public final u(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->c:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    iput-object p1, p0, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->c:Landroid/animation/ValueAnimator;

    return-void
.end method

.method public final v(Z)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, LIu3;

    invoke-direct {v1, p1, p0}, LIu3;-><init>(ZLco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
