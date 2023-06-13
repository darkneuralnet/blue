.class public final Lco/bird/android/widget/actions/SlideToLockThumbView;
.super Lcom/google/android/material/card/MaterialCardView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/actions/SlideToLockThumbView$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004J\u000c\u0010\u0008\u001a\u00020\u0004*\u00020\u0002H\u0002R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001c"
    }
    d2 = {
        "Lco/bird/android/widget/actions/SlideToLockThumbView;",
        "Lcom/google/android/material/card/MaterialCardView;",
        "LkE5;",
        "state",
        "",
        "animate",
        "",
        "setState",
        "z",
        "Landroid/widget/ImageView;",
        "s",
        "Landroid/widget/ImageView;",
        "thumbImage",
        "Landroid/widget/ProgressBar;",
        "t",
        "Landroid/widget/ProgressBar;",
        "thumbLoading",
        "u",
        "LkE5;",
        "_state",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
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
        "SMAP\nSlideToLockView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlideToLockView.kt\nco/bird/android/widget/actions/SlideToLockThumbView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,340:1\n262#2,2:341\n262#2,2:343\n262#2,2:345\n262#2,2:347\n*S KotlinDebug\n*F\n+ 1 SlideToLockView.kt\nco/bird/android/widget/actions/SlideToLockThumbView\n*L\n264#1:341,2\n265#1:343,2\n271#1:345,2\n272#1:347,2\n*E\n"
    }
.end annotation


# instance fields
.field public final s:Landroid/widget/ImageView;

.field public final t:Landroid/widget/ProgressBar;

.field public u:LkE5;


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

    invoke-direct/range {v1 .. v6}, Lco/bird/android/widget/actions/SlideToLockThumbView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lco/bird/android/widget/actions/SlideToLockThumbView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/material/card/MaterialCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget-object p2, LkE5;->b:LkE5;

    iput-object p2, p0, Lco/bird/android/widget/actions/SlideToLockThumbView;->u:LkE5;

    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p3, -0x2

    invoke-direct {p2, p3, p3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Lcom/google/android/material/card/MaterialCardView;->setCardElevation(F)V

    sget p2, LYf4;->slide_to_unlock_thumb_size:I

    invoke-static {p0, p2}, Ltu6;->k(Landroid/view/View;I)I

    move-result p2

    int-to-float p2, p2

    const/high16 p3, 0x40000000    # 2.0f

    div-float/2addr p2, p3

    invoke-virtual {p0, p2}, Lcom/google/android/material/card/MaterialCardView;->setRadius(F)V

    const/4 p2, -0x1

    invoke-virtual {p0, p2}, Lcom/google/android/material/card/MaterialCardView;->setCardBackgroundColor(I)V

    sget p2, Lmk4;->view_slide_to_lock_thumb:I

    invoke-static {p1, p2, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    sget p1, Lzi4;->thumbImage:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string p2, "findViewById(R.id.thumbImage)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lco/bird/android/widget/actions/SlideToLockThumbView;->s:Landroid/widget/ImageView;

    sget p1, Lzi4;->thumbLoading:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string p2, "findViewById(R.id.thumbLoading)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lco/bird/android/widget/actions/SlideToLockThumbView;->t:Landroid/widget/ProgressBar;

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
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/widget/actions/SlideToLockThumbView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic setState$default(Lco/bird/android/widget/actions/SlideToLockThumbView;LkE5;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lco/bird/android/widget/actions/SlideToLockThumbView;->setState(LkE5;Z)V

    return-void
.end method


# virtual methods
.method public final setState(LkE5;Z)V
    .locals 5

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToLockThumbView;->u:LkE5;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lco/bird/android/widget/actions/SlideToLockThumbView;->u:LkE5;

    sget-object v1, Lco/bird/android/widget/actions/SlideToLockThumbView$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const/high16 v1, -0x3ccc0000    # -180.0f

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lco/bird/android/widget/actions/SlideToLockThumbView;->z(LkE5;)Z

    move-result v2

    const/4 v3, 0x0

    const/16 v4, 0x8

    if-eqz v2, :cond_2

    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToLockThumbView;->z(LkE5;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {p0}, Landroidx/transition/c;->a(Landroid/view/ViewGroup;)V

    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToLockThumbView;->t:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToLockThumbView;->s:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToLockThumbView;->s:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/view/View;->setRotation(F)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v0}, Lco/bird/android/widget/actions/SlideToLockThumbView;->z(LkE5;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToLockThumbView;->z(LkE5;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p0}, Landroidx/transition/c;->a(Landroid/view/ViewGroup;)V

    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToLockThumbView;->t:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToLockThumbView;->s:Landroid/widget/ImageView;

    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v0}, Lco/bird/android/widget/actions/SlideToLockThumbView;->z(LkE5;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToLockThumbView;->z(LkE5;)Z

    move-result p1

    if-nez p1, :cond_5

    if-nez p2, :cond_4

    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToLockThumbView;->s:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/view/View;->setRotation(F)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToLockThumbView;->s:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    new-instance p2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {p2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    :cond_5
    :goto_1
    return-void
.end method

.method public final z(LkE5;)Z
    .locals 1

    sget-object v0, LkE5;->e:LkE5;

    if-eq p1, v0, :cond_1

    sget-object v0, LkE5;->c:LkE5;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
