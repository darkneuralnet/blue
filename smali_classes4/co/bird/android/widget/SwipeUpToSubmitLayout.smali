.class public final Lco/bird/android/widget/SwipeUpToSubmitLayout;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010C\u001a\u00020B\u0012\n\u0008\u0002\u0010E\u001a\u0004\u0018\u00010D\u0012\u0008\u0008\u0002\u0010F\u001a\u00020*\u00a2\u0006\u0004\u0008G\u0010HJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u000f\u001a\u00020\nH\u0002J\u0008\u0010\u0010\u001a\u00020\nH\u0002J\u0008\u0010\u0011\u001a\u00020\nH\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u001b\u0010&\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%R\u001b\u0010)\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\'\u0010#\u001a\u0004\u0008(\u0010%R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010+R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010.R*\u00106\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u0001008\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008(\u00101\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R$\u0010<\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00068\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u00088\u00109\"\u0004\u0008:\u0010;R*\u0010@\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00068\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00109\u001a\u0004\u0008=\u0010>\"\u0004\u0008?\u0010;R\u0014\u0010A\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00088\u0010%\u00a8\u0006I"
    }
    d2 = {
        "Lco/bird/android/widget/SwipeUpToSubmitLayout;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "j",
        "",
        "r",
        "m",
        "n",
        "",
        "s",
        "dragDistance",
        "w",
        "o",
        "t",
        "p",
        "h",
        "Lcom/google/android/material/card/MaterialCardView;",
        "b",
        "Lcom/google/android/material/card/MaterialCardView;",
        "cardContainer",
        "Landroid/widget/FrameLayout;",
        "c",
        "Landroid/widget/FrameLayout;",
        "contentContainer",
        "Landroid/view/View;",
        "d",
        "Landroid/view/View;",
        "swipeableAreaContainer",
        "Landroid/widget/TextView;",
        "e",
        "Landroid/widget/TextView;",
        "swipeIndicatorText",
        "f",
        "Lkotlin/Lazy;",
        "i",
        "()F",
        "defaultCardElevation",
        "g",
        "k",
        "draggingCardElevation",
        "",
        "I",
        "maxOverscroll",
        "submitDragDistance",
        "Ljava/lang/Float;",
        "swipeStartY",
        "Lkotlin/Function0;",
        "Lkotlin/jvm/functions/Function0;",
        "getOnSubmitCallback",
        "()Lkotlin/jvm/functions/Function0;",
        "setOnSubmitCallback",
        "(Lkotlin/jvm/functions/Function0;)V",
        "onSubmitCallback",
        "value",
        "l",
        "Z",
        "v",
        "(Z)V",
        "isDragging",
        "getSubmitEnabled",
        "()Z",
        "setSubmitEnabled",
        "submitEnabled",
        "textDefaultAlpha",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "defStyleAttr",
        "<init>",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSwipeUpToSubmitLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeUpToSubmitLayout.kt\nco/bird/android/widget/SwipeUpToSubmitLayout\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,221:1\n52#2,9:222\n262#3,2:231\n*S KotlinDebug\n*F\n+ 1 SwipeUpToSubmitLayout.kt\nco/bird/android/widget/SwipeUpToSubmitLayout\n*L\n63#1:222,9\n186#1:231,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lcom/google/android/material/card/MaterialCardView;

.field public final c:Landroid/widget/FrameLayout;

.field public final d:Landroid/view/View;

.field public final e:Landroid/widget/TextView;

.field public final f:Lkotlin/Lazy;

.field public final g:Lkotlin/Lazy;

.field public final h:I

.field public i:I

.field public j:Ljava/lang/Float;

.field public k:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lco/bird/android/widget/SwipeUpToSubmitLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lco/bird/android/widget/SwipeUpToSubmitLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p3, Lco/bird/android/widget/SwipeUpToSubmitLayout$a;

    invoke-direct {p3, p0}, Lco/bird/android/widget/SwipeUpToSubmitLayout$a;-><init>(Lco/bird/android/widget/SwipeUpToSubmitLayout;)V

    invoke-static {p3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p3

    iput-object p3, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->f:Lkotlin/Lazy;

    new-instance p3, Lco/bird/android/widget/SwipeUpToSubmitLayout$b;

    invoke-direct {p3, p0}, Lco/bird/android/widget/SwipeUpToSubmitLayout$b;-><init>(Lco/bird/android/widget/SwipeUpToSubmitLayout;)V

    invoke-static {p3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p3

    iput-object p3, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->g:Lkotlin/Lazy;

    const/16 p3, 0x18

    invoke-static {p0, p3}, Ltu6;->d(Landroid/view/View;I)I

    move-result p3

    iput p3, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->h:I

    const p3, 0x7fffffff

    iput p3, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->i:I

    sget p3, Lmk4;->view_swipe_up_to_submit:I

    invoke-static {p1, p3, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    sget p3, Lzi4;->content_card_container:I

    invoke-virtual {p0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    const-string v0, "findViewById(R.id.content_card_container)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/google/android/material/card/MaterialCardView;

    iput-object p3, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->b:Lcom/google/android/material/card/MaterialCardView;

    sget v0, Lzi4;->content_container:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(R.id.content_container)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->c:Landroid/widget/FrameLayout;

    sget v1, Lzi4;->swipeable_area_container:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v2, "findViewById(R.id.swipeable_area_container)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->d:Landroid/view/View;

    sget v2, Lzi4;->swipe_indicator_tv:I

    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "findViewById(R.id.swipe_indicator_tv)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->e:Landroid/widget/TextView;

    sget-object v3, LLl4;->SwipeUpToSubmitLayout:[I

    const-string v4, "SwipeUpToSubmitLayout"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-virtual {p1, p2, v3, v4, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const-string v3, "obtainStyledAttributes(s\u2026efStyleAttr, defStyleRes)"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v3, LLl4;->SwipeUpToSubmitLayout_submitDragDistance:I

    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {p2, v3}, LGb6;->b(Landroid/content/res/TypedArray;I)I

    move-result v3

    iput v3, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->i:I

    :cond_0
    sget v3, LLl4;->SwipeUpToSubmitLayout_swipeIndicatorText:I

    invoke-static {p2, v3}, LGb6;->e(Landroid/content/res/TypedArray;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget v2, LLl4;->SwipeUpToSubmitLayout_contentLayout:I

    invoke-static {p2, v2}, LGb6;->d(Landroid/content/res/TypedArray;I)I

    move-result v2

    invoke-virtual {p1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    sget p1, LYf4;->swipe_up_to_submit_content_corner_radius:I

    invoke-static {p0, p1}, Ltu6;->k(Landroid/view/View;I)I

    move-result p1

    int-to-float p1, p1

    invoke-static {}, Liy5;->a()Liy5$b;

    move-result-object p2

    invoke-virtual {p2, v4, p1}, Liy5$b;->t(IF)Liy5$b;

    invoke-virtual {p2, v4, p1}, Liy5$b;->y(IF)Liy5$b;

    invoke-virtual {p2}, Liy5$b;->m()Liy5;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/android/material/card/MaterialCardView;->setShapeAppearanceModel(Liy5;)V

    new-instance p1, LoX5;

    invoke-direct {p1, p0}, LoX5;-><init>(Lco/bird/android/widget/SwipeUpToSubmitLayout;)V

    invoke-virtual {v1, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->m:Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/widget/SwipeUpToSubmitLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic e(Lco/bird/android/widget/SwipeUpToSubmitLayout;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->u(Lco/bird/android/widget/SwipeUpToSubmitLayout;)V

    return-void
.end method

.method public static synthetic f(Lco/bird/android/widget/SwipeUpToSubmitLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->g(Lco/bird/android/widget/SwipeUpToSubmitLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static final g(Lco/bird/android/widget/SwipeUpToSubmitLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->r(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static final u(Lco/bird/android/widget/SwipeUpToSubmitLayout;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->p()V

    iget-object p0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->k:Lkotlin/jvm/functions/Function0;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public final h()V
    .locals 4

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-direct {v0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    iget-object v1, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->b:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    iget-object v1, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->d:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->l()F

    move-result v3

    invoke-virtual {v1, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method public final i()F
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->f:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final j(Landroid/view/MotionEvent;)F
    .locals 1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget-object v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->j:Ljava/lang/Float;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    sub-float/2addr p1, v0

    return p1
.end method

.method public final k()F
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->g:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final l()F
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->m:Z

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f400000    # 0.75f

    :goto_0
    return v0
.end method

.method public final m(Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->j:Ljava/lang/Float;

    iget-boolean p1, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->m:Z

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->v(Z)V

    :cond_0
    return v0
.end method

.method public final n(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->l:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->m:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->s(Landroid/view/MotionEvent;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final o(Landroid/view/MotionEvent;)Z
    .locals 3

    iget-boolean v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->l:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->j(Landroid/view/MotionEvent;)F

    move-result p1

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    const/4 v2, 0x1

    if-gez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    if-eqz v0, :cond_2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->i:I

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_2

    invoke-virtual {p0}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->t()V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->h()V

    :goto_1
    invoke-virtual {p0, v1}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->v(Z)V

    const/4 p1, 0x0

    iput-object p1, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->j:Ljava/lang/Float;

    return v2
.end method

.method public final p()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->b:Lcom/google/android/material/card/MaterialCardView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->d:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {p0}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->l()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public final r(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->n(Landroid/view/MotionEvent;)Z

    move-result p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->o(Landroid/view/MotionEvent;)Z

    move-result p1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->m(Landroid/view/MotionEvent;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public final s(Landroid/view/MotionEvent;)V
    .locals 2

    invoke-virtual {p0, p1}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->j(Landroid/view/MotionEvent;)F

    move-result p1

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->b:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->d:Landroid/view/View;

    const/high16 v1, 0x3f400000    # 0.75f

    mul-float/2addr v1, p1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {p0, p1}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->w(F)V

    :cond_0
    return-void
.end method

.method public final setOnSubmitCallback(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->k:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final setSubmitEnabled(Z)V
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->m:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->m:Z

    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->v(Z)V

    invoke-virtual {p0}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->h()V

    :cond_1
    return-void
.end method

.method public final t()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->b:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {v1, v2}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->b:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    neg-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, LpX5;

    invoke-direct {v1, p0}, LpX5;-><init>(Lco/bird/android/widget/SwipeUpToSubmitLayout;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method public final v(Z)V
    .locals 2

    iget-boolean v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->l:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->l:Z

    iget-object v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->b:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->k()F

    move-result p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/widget/SwipeUpToSubmitLayout;->i()F

    move-result p1

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/ViewPropertyAnimator;->z(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-direct {v0, v1}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method public final w(F)V
    .locals 2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->i:I

    int-to-float v0, v0

    div-float/2addr p1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float p1, v0, p1

    const/4 v1, 0x0

    cmpl-float v1, p1, v1

    if-gez v1, :cond_0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout;->d:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    :cond_1
    return-void
.end method
