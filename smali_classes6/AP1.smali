.class public LAP1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Landroid/view/ViewGroup;

.field public c:Lcom/google/maps/android/ui/RotationLayout;

.field public d:Landroid/widget/TextView;

.field public e:Landroid/view/View;

.field public f:I

.field public g:F

.field public h:F

.field public i:Lg30;

.field public j:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, LAP1;->g:F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, LAP1;->h:F

    iput-object p1, p0, LAP1;->a:Landroid/content/Context;

    new-instance v0, Lg30;

    invoke-direct {v0, p1}, Lg30;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, LAP1;->i:Lg30;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget v0, Lwk4;->amu_text_bubble:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, LAP1;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/maps/android/ui/RotationLayout;

    iput-object p1, p0, LAP1;->c:Lcom/google/maps/android/ui/RotationLayout;

    sget v0, LKi4;->amu_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, LAP1;->d:Landroid/widget/TextView;

    iput-object p1, p0, LAP1;->e:Landroid/view/View;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, LAP1;->h(I)V

    return-void
.end method

.method public static a(I)I
    .locals 1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_4

    const/4 v0, 0x4

    if-eq p0, v0, :cond_3

    const/4 v0, 0x5

    if-eq p0, v0, :cond_2

    const/4 v0, 0x6

    if-eq p0, v0, :cond_1

    const/4 v0, 0x7

    if-eq p0, v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    const/16 p0, -0x7800

    return p0

    :cond_1
    const p0, -0x66cc34

    return p0

    :cond_2
    const p0, -0x996700

    return p0

    :cond_3
    const p0, -0xff6634

    return p0

    :cond_4
    const/high16 p0, -0x340000

    return p0
.end method

.method public static b(I)I
    .locals 1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 v0, 0x6

    if-eq p0, v0, :cond_0

    const/4 v0, 0x7

    if-eq p0, v0, :cond_0

    sget p0, Lvl4;->amu_Bubble_TextAppearance_Dark:I

    return p0

    :cond_0
    sget p0, Lvl4;->amu_Bubble_TextAppearance_Light:I

    return p0
.end method


# virtual methods
.method public c()Landroid/graphics/Bitmap;
    .locals 7

    const/4 v0, 0x0

    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    iget-object v2, p0, LAP1;->b:Landroid/view/ViewGroup;

    invoke-virtual {v2, v1, v1}, Landroid/view/View;->measure(II)V

    iget-object v1, p0, LAP1;->b:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iget-object v2, p0, LAP1;->b:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iget-object v3, p0, LAP1;->b:Landroid/view/ViewGroup;

    invoke-virtual {v3, v0, v0, v1, v2}, Landroid/view/ViewGroup;->layout(IIII)V

    iget v3, p0, LAP1;->f:I

    const/4 v4, 0x3

    const/4 v5, 0x1

    if-eq v3, v5, :cond_0

    if-ne v3, v4, :cond_1

    :cond_0
    iget-object v1, p0, LAP1;->b:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    iget-object v1, p0, LAP1;->b:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    :cond_1
    iget-object v3, p0, LAP1;->j:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    if-ne v3, v2, :cond_2

    iget-object v3, p0, LAP1;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    if-ne v3, v1, :cond_2

    iget-object v3, p0, LAP1;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v3, v0}, Landroid/graphics/Bitmap;->eraseColor(I)V

    goto :goto_0

    :cond_2
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, LAP1;->j:Landroid/graphics/Bitmap;

    :goto_0
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v3, p0, LAP1;->j:Landroid/graphics/Bitmap;

    invoke-direct {v0, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iget v3, p0, LAP1;->f:I

    const/4 v6, 0x0

    if-eq v3, v5, :cond_5

    const/4 v5, 0x2

    if-eq v3, v5, :cond_4

    if-eq v3, v4, :cond_3

    goto :goto_1

    :cond_3
    int-to-float v1, v2

    invoke-virtual {v0, v6, v1}, Landroid/graphics/Canvas;->translate(FF)V

    const/high16 v1, 0x43870000    # 270.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->rotate(F)V

    goto :goto_1

    :cond_4
    div-int/2addr v1, v5

    int-to-float v1, v1

    div-int/2addr v2, v5

    int-to-float v2, v2

    const/high16 v3, 0x43340000    # 180.0f

    invoke-virtual {v0, v3, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    goto :goto_1

    :cond_5
    int-to-float v1, v1

    invoke-virtual {v0, v1, v6}, Landroid/graphics/Canvas;->translate(FF)V

    const/high16 v1, 0x42b40000    # 90.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->rotate(F)V

    :goto_1
    iget-object v1, p0, LAP1;->b:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, LAP1;->j:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public d(Ljava/lang/CharSequence;)Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, LAP1;->d:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-virtual {p0}, LAP1;->c()Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public e(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    iget-object v0, p0, LAP1;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget-object p1, p0, LAP1;->b:Landroid/view/ViewGroup;

    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, v0, Landroid/graphics/Rect;->top:I

    iget v3, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, v1, v2, v3, v0}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LAP1;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    :goto_0
    return-void
.end method

.method public f(I)V
    .locals 1

    iget-object v0, p0, LAP1;->i:Lg30;

    invoke-virtual {v0, p1}, Lg30;->a(I)V

    iget-object p1, p0, LAP1;->i:Lg30;

    invoke-virtual {p0, p1}, LAP1;->e(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public g(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LAP1;->c:Lcom/google/maps/android/ui/RotationLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v0, p0, LAP1;->c:Lcom/google/maps/android/ui/RotationLayout;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object p1, p0, LAP1;->e:Landroid/view/View;

    iget-object p1, p0, LAP1;->c:Lcom/google/maps/android/ui/RotationLayout;

    sget v0, LKi4;->amu_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/widget/TextView;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LAP1;->d:Landroid/widget/TextView;

    return-void
.end method

.method public h(I)V
    .locals 1

    invoke-static {p1}, LAP1;->a(I)I

    move-result v0

    invoke-virtual {p0, v0}, LAP1;->f(I)V

    iget-object v0, p0, LAP1;->a:Landroid/content/Context;

    invoke-static {p1}, LAP1;->b(I)I

    move-result p1

    invoke-virtual {p0, v0, p1}, LAP1;->j(Landroid/content/Context;I)V

    return-void
.end method

.method public i(I)V
    .locals 1

    iget-object v0, p0, LAP1;->a:Landroid/content/Context;

    invoke-virtual {p0, v0, p1}, LAP1;->j(Landroid/content/Context;I)V

    return-void
.end method

.method public j(Landroid/content/Context;I)V
    .locals 1

    iget-object v0, p0, LAP1;->d:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method
