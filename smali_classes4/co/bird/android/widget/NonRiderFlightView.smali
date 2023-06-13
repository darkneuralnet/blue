.class public final Lco/bird/android/widget/NonRiderFlightView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/NonRiderFlightView$a;,
        Lco/bird/android/widget/NonRiderFlightView$b;,
        Lco/bird/android/widget/NonRiderFlightView$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0018\u0000 \"2\u00020\u0001:\u0002#\u000eB\u0011\u0008\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bB\u001b\u0008\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u001a\u0010\u001eB#\u0008\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u00a2\u0006\u0004\u0008\u001a\u0010!J>\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tJ\u0008\u0010\r\u001a\u00020\u000bH\u0002J\u0008\u0010\u000e\u001a\u00020\u000bH\u0002R\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0016\u00a8\u0006$"
    }
    d2 = {
        "Lco/bird/android/widget/NonRiderFlightView;",
        "Landroid/widget/LinearLayout;",
        "Lco/bird/android/widget/NonRiderFlightView$a;",
        "bannerType",
        "",
        "title",
        "subTitle",
        "Landroid/graphics/drawable/Drawable;",
        "icon",
        "",
        "show",
        "",
        "c",
        "d",
        "b",
        "Ljava/util/Queue;",
        "Le56;",
        "Ljava/util/Queue;",
        "toasts",
        "Z",
        "showingToasts",
        "Lcr6;",
        "Lcr6;",
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
        "e",
        "a",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final e:Lco/bird/android/widget/NonRiderFlightView$b;


# instance fields
.field public final b:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Le56;",
            ">;"
        }
    .end annotation
.end field

.field public c:Z

.field public final d:Lcr6;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/widget/NonRiderFlightView$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/widget/NonRiderFlightView$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/widget/NonRiderFlightView;->e:Lco/bird/android/widget/NonRiderFlightView$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/NonRiderFlightView;->b:Ljava/util/Queue;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lcr6;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcr6;

    move-result-object p1

    const-string v1, "inflate(context.layoutInflater, this)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/NonRiderFlightView;->d:Lcr6;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 p1, 0xa

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    float-to-int p1, p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0, v0, p1}, Landroid/view/View;->setPaddingRelative(IIII)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/NonRiderFlightView;->b:Ljava/util/Queue;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lcr6;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcr6;

    move-result-object p1

    const-string p2, "inflate(context.layoutInflater, this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/NonRiderFlightView;->d:Lcr6;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 p1, 0xa

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    float-to-int p1, p1

    const/4 p2, 0x0

    invoke-virtual {p0, p2, p2, p2, p1}, Landroid/view/View;->setPaddingRelative(IIII)V

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/NonRiderFlightView;->b:Ljava/util/Queue;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lcr6;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcr6;

    move-result-object p1

    const-string p2, "inflate(context.layoutInflater, this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/NonRiderFlightView;->d:Lcr6;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 p1, 0xa

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    float-to-int p1, p1

    const/4 p2, 0x0

    invoke-virtual {p0, p2, p2, p2, p1}, Landroid/view/View;->setPaddingRelative(IIII)V

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/widget/NonRiderFlightView;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/widget/NonRiderFlightView;->e(Lco/bird/android/widget/NonRiderFlightView;)V

    return-void
.end method

.method public static final synthetic access$getBinding$p(Lco/bird/android/widget/NonRiderFlightView;)Lcr6;
    .locals 0

    iget-object p0, p0, Lco/bird/android/widget/NonRiderFlightView;->d:Lcr6;

    return-object p0
.end method

.method public static final synthetic access$setShowingToasts$p(Lco/bird/android/widget/NonRiderFlightView;Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/widget/NonRiderFlightView;->c:Z

    return-void
.end method

.method public static final synthetic access$showToasts(Lco/bird/android/widget/NonRiderFlightView;)V
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/widget/NonRiderFlightView;->d()V

    return-void
.end method

.method public static final e(Lco/bird/android/widget/NonRiderFlightView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/widget/NonRiderFlightView;->b()V

    return-void
.end method

.method public static synthetic showBanner$default(Lco/bird/android/widget/NonRiderFlightView;Lco/bird/android/widget/NonRiderFlightView$a;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;ZILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    move-object v3, v0

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    move-object v4, v0

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    move-object v5, v0

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    move-object v1, p0

    move v6, p5

    invoke-virtual/range {v1 .. v6}, Lco/bird/android/widget/NonRiderFlightView;->c(Lco/bird/android/widget/NonRiderFlightView$a;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Z)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-boolean v0, p0, Lco/bird/android/widget/NonRiderFlightView;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lco/bird/android/widget/NonRiderFlightView;->d:Lcr6;

    iget-object v0, v0, Lcr6;->f:Lg56;

    invoke-virtual {v0}, Lg56;->b()Landroid/widget/TextView;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Lco/bird/android/widget/NonRiderFlightView;->d:Lcr6;

    iget-object v0, v0, Lcr6;->f:Lg56;

    invoke-virtual {v0}, Lg56;->b()Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "binding.toastMessage.root"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, Lco/bird/android/widget/NonRiderFlightView;->d:Lcr6;

    iget-object v0, v0, Lcr6;->f:Lg56;

    invoke-virtual {v0}, Lg56;->b()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lco/bird/android/widget/NonRiderFlightView$d;

    invoke-direct {v1, p0}, Lco/bird/android/widget/NonRiderFlightView$d;-><init>(Lco/bird/android/widget/NonRiderFlightView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    return-void
.end method

.method public final c(Lco/bird/android/widget/NonRiderFlightView$a;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Z)V
    .locals 4

    iget-object v0, p0, Lco/bird/android/widget/NonRiderFlightView;->d:Lcr6;

    iget-object v0, v0, Lcr6;->c:Lco/bird/android/widget/CallToActionBanner;

    const-string v1, "binding.callToActionBanner"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, p5, v1, v2, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object p5, Lco/bird/android/widget/NonRiderFlightView$c;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p5, p1

    :goto_0
    const/4 p5, 0x1

    if-ne p1, p5, :cond_1

    iget-object p1, p0, Lco/bird/android/widget/NonRiderFlightView;->d:Lcr6;

    iget-object p1, p1, Lcr6;->c:Lco/bird/android/widget/CallToActionBanner;

    sget-object p2, Lco/bird/android/widget/CallToActionBanner$a;->l:Lco/bird/android/widget/CallToActionBanner$a;

    invoke-virtual {p1, p2}, Lco/bird/android/widget/CallToActionBanner;->setCallToActionState(Lco/bird/android/widget/CallToActionBanner$a;)V

    goto :goto_1

    :cond_1
    if-eqz p2, :cond_2

    iget-object p1, p0, Lco/bird/android/widget/NonRiderFlightView;->d:Lcr6;

    iget-object p1, p1, Lcr6;->c:Lco/bird/android/widget/CallToActionBanner;

    invoke-virtual {p1, p2}, Lco/bird/android/widget/CallToActionBanner;->setTitle(Ljava/lang/String;)V

    :cond_2
    if-eqz p3, :cond_3

    iget-object p1, p0, Lco/bird/android/widget/NonRiderFlightView;->d:Lcr6;

    iget-object p1, p1, Lcr6;->c:Lco/bird/android/widget/CallToActionBanner;

    invoke-virtual {p1, p3}, Lco/bird/android/widget/CallToActionBanner;->setSubtitle(Ljava/lang/String;)V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_3
    if-nez v3, :cond_4

    iget-object p1, p0, Lco/bird/android/widget/NonRiderFlightView;->d:Lcr6;

    iget-object p1, p1, Lcr6;->c:Lco/bird/android/widget/CallToActionBanner;

    invoke-virtual {p1}, Lco/bird/android/widget/CallToActionBanner;->r()V

    :cond_4
    iget-object p1, p0, Lco/bird/android/widget/NonRiderFlightView;->d:Lcr6;

    iget-object p1, p1, Lcr6;->c:Lco/bird/android/widget/CallToActionBanner;

    invoke-virtual {p1, p4}, Lco/bird/android/widget/CallToActionBanner;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_1
    return-void
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Lco/bird/android/widget/NonRiderFlightView;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lco/bird/android/widget/NonRiderFlightView;->c:Z

    return-void

    :cond_0
    iget-boolean v0, p0, Lco/bird/android/widget/NonRiderFlightView;->c:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lco/bird/android/widget/NonRiderFlightView;->c:Z

    iget-object v0, p0, Lco/bird/android/widget/NonRiderFlightView;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le56;

    iget-object v1, p0, Lco/bird/android/widget/NonRiderFlightView;->d:Lcr6;

    iget-object v1, v1, Lcr6;->f:Lg56;

    invoke-virtual {v1}, Lg56;->b()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0}, Le56;->b()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lco/bird/android/widget/NonRiderFlightView;->d:Lcr6;

    iget-object v1, v1, Lcr6;->f:Lg56;

    invoke-virtual {v1}, Lg56;->b()Landroid/widget/TextView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    iget-object v1, p0, Lco/bird/android/widget/NonRiderFlightView;->d:Lcr6;

    iget-object v1, v1, Lcr6;->f:Lg56;

    invoke-virtual {v1}, Lg56;->b()Landroid/widget/TextView;

    move-result-object v1

    const-string v2, "binding.toastMessage.root"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ltu6;->r(Landroid/view/View;)V

    iget-object v1, p0, Lco/bird/android/widget/NonRiderFlightView;->d:Lcr6;

    iget-object v1, v1, Lcr6;->f:Lg56;

    invoke-virtual {v1}, Lg56;->b()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    new-instance v1, LI93;

    invoke-direct {v1, p0}, LI93;-><init>(Lco/bird/android/widget/NonRiderFlightView;)V

    invoke-virtual {v0}, Le56;->a()Lf56;

    move-result-object v0

    invoke-virtual {v0}, Lf56;->b()J

    move-result-wide v2

    invoke-virtual {p0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
