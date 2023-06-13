.class public Lzendesk/belvedere/SelectableView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/belvedere/SelectableView$c;
    }
.end annotation


# instance fields
.field public b:Lzendesk/belvedere/SelectableView$c;

.field public c:Landroid/view/View;

.field public d:Landroid/view/View;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Lzendesk/belvedere/SelectableView;->g()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p0}, Lzendesk/belvedere/SelectableView;->g()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Lzendesk/belvedere/SelectableView;->g()V

    return-void
.end method

.method public static synthetic a(Lzendesk/belvedere/SelectableView;F)V
    .locals 0

    invoke-virtual {p0, p1}, Lzendesk/belvedere/SelectableView;->h(F)V

    return-void
.end method

.method public static synthetic b(Lzendesk/belvedere/SelectableView;F)V
    .locals 0

    invoke-virtual {p0, p1}, Lzendesk/belvedere/SelectableView;->c(F)V

    return-void
.end method


# virtual methods
.method public final c(F)V
    .locals 1

    invoke-virtual {p0}, Lzendesk/belvedere/SelectableView;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public final d(Z)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object p1, p0, Lzendesk/belvedere/SelectableView;->d:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lzendesk/belvedere/SelectableView;->d:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->bringToFront()V

    iget-object p1, p0, Lzendesk/belvedere/SelectableView;->d:Landroid/view/View;

    iget-object v0, p0, Lzendesk/belvedere/SelectableView;->c:Landroid/view/View;

    invoke-static {v0}, Lbq6;->y(Landroid/view/View;)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    invoke-static {p1, v0}, Lbq6;->E0(Landroid/view/View;F)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzendesk/belvedere/SelectableView;->d:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public final e(I)Landroid/widget/ImageView;
    .locals 4

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x11

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    new-instance v1, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget v2, LSg4;->belvedere_selectable_view_checkbox:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, LGg4;->belvedere_ic_check_circle:I

    invoke-static {v2, v3}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, LGg4;->belvedere_ic_check_bg:I

    invoke-static {v2, v3}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v1, v2}, Lbq6;->A0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-static {v1, p1}, LEi6;->b(Landroid/widget/ImageView;I)V

    return-object v1
.end method

.method public final f()Landroid/view/View;
    .locals 4

    iget-object v0, p0, Lzendesk/belvedere/SelectableView;->c:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v2

    sget v3, LSg4;->belvedere_selectable_view_checkbox:I

    if-eq v2, v3, :cond_1

    iput-object v1, p0, Lzendesk/belvedere/SelectableView;->c:Landroid/view/View;

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v0, p0, Lzendesk/belvedere/SelectableView;->c:Landroid/view/View;

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "More then one child added to SelectableView"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g()V
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual {p0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Llf4;->colorPrimary:I

    invoke-static {v0, v1}, LEi6;->a(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lzendesk/belvedere/SelectableView;->e(I)Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lzendesk/belvedere/SelectableView;->d:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final h(F)V
    .locals 1

    invoke-virtual {p0}, Lzendesk/belvedere/SelectableView;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {p0}, Lzendesk/belvedere/SelectableView;->f()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method

.method public final i(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lzendesk/belvedere/SelectableView;->e:Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzendesk/belvedere/SelectableView;->f:Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    move-result p1

    const/4 v0, 0x1

    xor-int/2addr p1, v0

    iget-object v1, p0, Lzendesk/belvedere/SelectableView;->b:Lzendesk/belvedere/SelectableView$c;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lzendesk/belvedere/SelectableView$c;->a(Z)Z

    move-result v0

    :cond_0
    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lzendesk/belvedere/SelectableView;->setSelected(Z)V

    const/4 v0, 0x2

    if-eqz p1, :cond_1

    new-array p1, v0, [F

    fill-array-data p1, :array_0

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-array p1, v0, [F

    fill-array-data p1, :array_2

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    new-array v0, v0, [F

    fill-array-data v0, :array_3

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    :goto_0
    new-instance v1, Lzendesk/belvedere/SelectableView$a;

    invoke-direct {v1, p0}, Lzendesk/belvedere/SelectableView$a;-><init>(Lzendesk/belvedere/SelectableView;)V

    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v1, Lzendesk/belvedere/SelectableView$b;

    invoke-direct {v1, p0}, Lzendesk/belvedere/SelectableView$b;-><init>(Lzendesk/belvedere/SelectableView;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v1, 0x4b

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {p1, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    :cond_2
    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f666666    # 0.9f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f4ccccd    # 0.8f
    .end array-data

    :array_2
    .array-data 4
        0x3f666666    # 0.9f
        0x3f800000    # 1.0f
    .end array-data

    :array_3
    .array-data 4
        0x3f4ccccd    # 0.8f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public setContentDescriptionStrings(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/SelectableView;->e:Ljava/lang/String;

    iput-object p2, p0, Lzendesk/belvedere/SelectableView;->f:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    move-result p1

    invoke-virtual {p0, p1}, Lzendesk/belvedere/SelectableView;->i(Z)V

    return-void
.end method

.method public setSelected(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setSelected(Z)V

    if-eqz p1, :cond_0

    const p1, 0x3f666666    # 0.9f

    invoke-virtual {p0, p1}, Lzendesk/belvedere/SelectableView;->h(F)V

    const p1, 0x3f4ccccd    # 0.8f

    invoke-virtual {p0, p1}, Lzendesk/belvedere/SelectableView;->c(F)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lzendesk/belvedere/SelectableView;->d(Z)V

    invoke-virtual {p0, p1}, Lzendesk/belvedere/SelectableView;->i(Z)V

    goto :goto_0

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1}, Lzendesk/belvedere/SelectableView;->h(F)V

    invoke-virtual {p0, p1}, Lzendesk/belvedere/SelectableView;->c(F)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lzendesk/belvedere/SelectableView;->d(Z)V

    invoke-virtual {p0, p1}, Lzendesk/belvedere/SelectableView;->i(Z)V

    :goto_0
    return-void
.end method

.method public setSelectionListener(Lzendesk/belvedere/SelectableView$c;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/SelectableView;->b:Lzendesk/belvedere/SelectableView$c;

    return-void
.end method
