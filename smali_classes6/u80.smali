.class public final Lu80;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Rect;

.field public final b:Landroid/content/res/ColorStateList;

.field public final c:Landroid/content/res/ColorStateList;

.field public final d:Landroid/content/res/ColorStateList;

.field public final e:I

.field public final f:Liy5;


# direct methods
.method public constructor <init>(Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;ILiy5;Landroid/graphics/Rect;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p6, Landroid/graphics/Rect;->left:I

    invoke-static {v0}, LHZ3;->d(I)I

    iget v0, p6, Landroid/graphics/Rect;->top:I

    invoke-static {v0}, LHZ3;->d(I)I

    iget v0, p6, Landroid/graphics/Rect;->right:I

    invoke-static {v0}, LHZ3;->d(I)I

    iget v0, p6, Landroid/graphics/Rect;->bottom:I

    invoke-static {v0}, LHZ3;->d(I)I

    iput-object p6, p0, Lu80;->a:Landroid/graphics/Rect;

    iput-object p2, p0, Lu80;->b:Landroid/content/res/ColorStateList;

    iput-object p1, p0, Lu80;->c:Landroid/content/res/ColorStateList;

    iput-object p3, p0, Lu80;->d:Landroid/content/res/ColorStateList;

    iput p4, p0, Lu80;->e:I

    iput-object p5, p0, Lu80;->f:Liy5;

    return-void
.end method

.method public static a(Landroid/content/Context;I)Lu80;
    .locals 12

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    const-string v2, "Cannot create a CalendarItemStyle with a styleResId of 0"

    invoke-static {v1, v2}, LHZ3;->b(ZLjava/lang/Object;)V

    sget-object v1, LXl4;->MaterialCalendarItem:[I

    invoke-virtual {p0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v1, LXl4;->MaterialCalendarItem_android_insetLeft:I

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v1

    sget v2, LXl4;->MaterialCalendarItem_android_insetTop:I

    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    sget v3, LXl4;->MaterialCalendarItem_android_insetRight:I

    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    sget v4, LXl4;->MaterialCalendarItem_android_insetBottom:I

    invoke-virtual {p1, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    new-instance v11, Landroid/graphics/Rect;

    invoke-direct {v11, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    sget v1, LXl4;->MaterialCalendarItem_itemFillColor:I

    invoke-static {p0, p1, v1}, LNM2;->b(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v6

    sget v1, LXl4;->MaterialCalendarItem_itemTextColor:I

    invoke-static {p0, p1, v1}, LNM2;->b(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v7

    sget v1, LXl4;->MaterialCalendarItem_itemStrokeColor:I

    invoke-static {p0, p1, v1}, LNM2;->b(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v8

    sget v1, LXl4;->MaterialCalendarItem_itemStrokeWidth:I

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v9

    sget v1, LXl4;->MaterialCalendarItem_itemShapeAppearance:I

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    sget v2, LXl4;->MaterialCalendarItem_itemShapeAppearanceOverlay:I

    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-static {p0, v1, v0}, Liy5;->b(Landroid/content/Context;II)Liy5$b;

    move-result-object p0

    invoke-virtual {p0}, Liy5$b;->m()Liy5;

    move-result-object v10

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    new-instance p0, Lu80;

    move-object v5, p0

    invoke-direct/range {v5 .. v11}, Lu80;-><init>(Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;ILiy5;Landroid/graphics/Rect;)V

    return-object p0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget-object v0, p0, Lu80;->a:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    return v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lu80;->a:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    return v0
.end method

.method public d(Landroid/widget/TextView;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lu80;->e(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public e(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V
    .locals 8

    new-instance v0, LPM2;

    invoke-direct {v0}, LPM2;-><init>()V

    new-instance v1, LPM2;

    invoke-direct {v1}, LPM2;-><init>()V

    iget-object v2, p0, Lu80;->f:Liy5;

    invoke-virtual {v0, v2}, LPM2;->setShapeAppearanceModel(Liy5;)V

    iget-object v2, p0, Lu80;->f:Liy5;

    invoke-virtual {v1, v2}, LPM2;->setShapeAppearanceModel(Liy5;)V

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lu80;->c:Landroid/content/res/ColorStateList;

    :goto_0
    invoke-virtual {v0, p2}, LPM2;->a0(Landroid/content/res/ColorStateList;)V

    iget p2, p0, Lu80;->e:I

    int-to-float p2, p2

    iget-object v2, p0, Lu80;->d:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, p2, v2}, LPM2;->j0(FLandroid/content/res/ColorStateList;)V

    iget-object p2, p0, Lu80;->b:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    new-instance v3, Landroid/graphics/drawable/RippleDrawable;

    iget-object p2, p0, Lu80;->b:Landroid/content/res/ColorStateList;

    const/16 v2, 0x1e

    invoke-virtual {p2, v2}, Landroid/content/res/ColorStateList;->withAlpha(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-direct {v3, p2, v0, v1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    new-instance p2, Landroid/graphics/drawable/InsetDrawable;

    iget-object v0, p0, Lu80;->a:Landroid/graphics/Rect;

    iget v4, v0, Landroid/graphics/Rect;->left:I

    iget v5, v0, Landroid/graphics/Rect;->top:I

    iget v6, v0, Landroid/graphics/Rect;->right:I

    iget v7, v0, Landroid/graphics/Rect;->bottom:I

    move-object v2, p2

    invoke-direct/range {v2 .. v7}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    invoke-static {p1, p2}, Lbq6;->A0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
