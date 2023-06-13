.class public Lcom/braze/ui/inappmessage/views/InAppMessageBoundedLayout;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private mMaxDefinedHeightPixels:I

.field private mMaxDefinedWidthPixels:I

.field private mMinDefinedHeightPixels:I

.field private mMinDefinedWidthPixels:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object v0, Lcom/appboy/ui/R$styleable;->InAppMessageBoundedLayout:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lcom/appboy/ui/R$styleable;->InAppMessageBoundedLayout_inAppMessageBoundedLayoutMaxWidth:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/braze/ui/inappmessage/views/InAppMessageBoundedLayout;->mMaxDefinedWidthPixels:I

    sget p2, Lcom/appboy/ui/R$styleable;->InAppMessageBoundedLayout_inAppMessageBoundedLayoutMinWidth:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/braze/ui/inappmessage/views/InAppMessageBoundedLayout;->mMinDefinedWidthPixels:I

    sget p2, Lcom/appboy/ui/R$styleable;->InAppMessageBoundedLayout_inAppMessageBoundedLayoutMaxHeight:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/braze/ui/inappmessage/views/InAppMessageBoundedLayout;->mMaxDefinedHeightPixels:I

    sget p2, Lcom/appboy/ui/R$styleable;->InAppMessageBoundedLayout_inAppMessageBoundedLayoutMinHeight:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/braze/ui/inappmessage/views/InAppMessageBoundedLayout;->mMinDefinedHeightPixels:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public onMeasure(II)V
    .locals 2

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iget v1, p0, Lcom/braze/ui/inappmessage/views/InAppMessageBoundedLayout;->mMinDefinedWidthPixels:I

    if-lez v1, :cond_0

    if-ge v0, v1, :cond_0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    iget v0, p0, Lcom/braze/ui/inappmessage/views/InAppMessageBoundedLayout;->mMinDefinedWidthPixels:I

    invoke-static {v0, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/braze/ui/inappmessage/views/InAppMessageBoundedLayout;->mMaxDefinedWidthPixels:I

    if-lez v1, :cond_1

    if-le v0, v1, :cond_1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    iget v0, p0, Lcom/braze/ui/inappmessage/views/InAppMessageBoundedLayout;->mMaxDefinedWidthPixels:I

    invoke-static {v0, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    :cond_1
    :goto_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iget v1, p0, Lcom/braze/ui/inappmessage/views/InAppMessageBoundedLayout;->mMinDefinedHeightPixels:I

    if-lez v1, :cond_2

    if-ge v0, v1, :cond_2

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    iget v0, p0, Lcom/braze/ui/inappmessage/views/InAppMessageBoundedLayout;->mMinDefinedHeightPixels:I

    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    goto :goto_1

    :cond_2
    iget v1, p0, Lcom/braze/ui/inappmessage/views/InAppMessageBoundedLayout;->mMaxDefinedHeightPixels:I

    if-lez v1, :cond_3

    if-le v0, v1, :cond_3

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    iget v0, p0, Lcom/braze/ui/inappmessage/views/InAppMessageBoundedLayout;->mMaxDefinedHeightPixels:I

    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    :cond_3
    :goto_1
    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onMeasure(II)V

    return-void
.end method
