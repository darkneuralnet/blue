.class public Lcom/braze/ui/inappmessage/views/InAppMessageModalView;
.super Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private mInAppMessage:LxZ1;

.field private mInAppMessageImageView:Lcom/braze/ui/inappmessage/views/InAppMessageImageView;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;

    invoke-static {v0}, Lk20;->n(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic c(Lcom/braze/ui/inappmessage/views/InAppMessageModalView;IIID)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->lambda$resizeGraphicFrameIfAppropriate$1(IIID)V

    return-void
.end method

.method public static synthetic d(Lcom/braze/ui/inappmessage/views/InAppMessageModalView;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->lambda$resetMessageMargins$0(Landroid/view/View;)V

    return-void
.end method

.method private synthetic lambda$resetMessageMargins$0(Landroid/view/View;)V
    .locals 1

    sget-object p1, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->TAG:Ljava/lang/String;

    const-string v0, "Passing scrollView click event to message clickable view."

    invoke-static {p1, v0}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->getMessageClickableView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    return-void
.end method

.method private synthetic lambda$resizeGraphicFrameIfAppropriate$1(IIID)V
    .locals 5

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    sub-int/2addr v0, p1

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    int-to-double v0, p2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    sub-int/2addr p2, p1

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-double p1, p1

    div-double v2, v0, p1

    sget p3, Lcom/appboy/ui/R$id;->com_braze_inappmessage_modal_graphic_bound:I

    invoke-virtual {p0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroid/widget/RelativeLayout$LayoutParams;

    cmpl-double v2, p4, v2

    if-ltz v2, :cond_0

    double-to-int p1, v0

    iput p1, v4, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    div-double/2addr v0, p4

    double-to-int p1, v0

    iput p1, v4, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    goto :goto_0

    :cond_0
    mul-double/2addr p4, p1

    double-to-int p4, p4

    iput p4, v4, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    double-to-int p1, p1

    iput p1, v4, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    :goto_0
    invoke-virtual {p3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private resizeGraphicFrameIfAppropriate(Landroid/content/Context;LxZ1;)V
    .locals 11

    if-eqz p2, :cond_2

    invoke-virtual {p2}, LFZ1;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LsZ1;->Y()LZX1;

    move-result-object v0

    sget-object v1, LZX1;->b:LZX1;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p2}, LFZ1;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p2}, LFZ1;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p2

    int-to-double v2, p2

    div-double v9, v0, v2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lcom/appboy/ui/R$dimen;->com_braze_inappmessage_modal_margin:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    sget p2, Lcom/appboy/ui/R$dimen;->com_braze_inappmessage_modal_max_width:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    sget p2, Lcom/appboy/ui/R$dimen;->com_braze_inappmessage_modal_max_height:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v8

    new-instance p1, LyZ1;

    move-object v4, p1

    move-object v5, p0

    invoke-direct/range {v4 .. v10}, LyZ1;-><init>(Lcom/braze/ui/inappmessage/views/InAppMessageModalView;IIID)V

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method private setInAppMessageImageViewAttributes(Landroid/content/Context;LAO1;LzO1;)V
    .locals 2

    invoke-static {}, Lj20;->a()D

    move-result-wide v0

    invoke-static {p1, v0, v1}, LWt6;->a(Landroid/content/Context;D)D

    move-result-wide v0

    double-to-float p1, v0

    invoke-interface {p2}, LAO1;->Y()LZX1;

    move-result-object v0

    sget-object v1, LZX1;->b:LZX1;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3, p1}, LzO1;->setCornersRadiusPx(F)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p3, p1, p1, v0, v0}, LzO1;->setCornersRadiiPx(FFFF)V

    :goto_0
    invoke-interface {p2}, LwO1;->N()LPE0;

    move-result-object p1

    invoke-interface {p3, p1}, LzO1;->setInAppMessageImageCropType(LPE0;)V

    return-void
.end method


# virtual methods
.method public applyInAppMessageParameters(Landroid/content/Context;LxZ1;)V
    .locals 1

    iput-object p2, p0, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->mInAppMessage:LxZ1;

    sget v0, Lcom/appboy/ui/R$id;->com_braze_inappmessage_modal_imageview:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/braze/ui/inappmessage/views/InAppMessageImageView;

    iput-object v0, p0, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->mInAppMessageImageView:Lcom/braze/ui/inappmessage/views/InAppMessageImageView;

    invoke-direct {p0, p1, p2, v0}, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->setInAppMessageImageViewAttributes(Landroid/content/Context;LAO1;LzO1;)V

    invoke-direct {p0, p1, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->resizeGraphicFrameIfAppropriate(Landroid/content/Context;LxZ1;)V

    return-void
.end method

.method public getFrameView()Landroid/view/View;
    .locals 1

    sget v0, Lcom/appboy/ui/R$id;->com_braze_inappmessage_modal_frame:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getMessageBackgroundObject()Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->getMessageClickableView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getMessageBackgroundObject()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->getMessageBackgroundObject()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getMessageButtonViews(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p1, v1, :cond_1

    sget p1, Lcom/appboy/ui/R$id;->com_braze_inappmessage_modal_button_layout_single:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    sget p1, Lcom/appboy/ui/R$id;->com_braze_inappmessage_modal_button_single_one:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    if-ne p1, v1, :cond_4

    sget p1, Lcom/appboy/ui/R$id;->com_braze_inappmessage_modal_button_layout_dual:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    sget p1, Lcom/appboy/ui/R$id;->com_braze_inappmessage_modal_button_dual_one:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    sget v1, Lcom/appboy/ui/R$id;->com_braze_inappmessage_modal_button_dual_two:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz p1, :cond_3

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    if-eqz v1, :cond_4

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_0
    return-object v0
.end method

.method public getMessageClickableView()Landroid/view/View;
    .locals 1

    sget v0, Lcom/appboy/ui/R$id;->com_braze_inappmessage_modal:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getMessageCloseButtonView()Landroid/view/View;
    .locals 1

    sget v0, Lcom/appboy/ui/R$id;->com_braze_inappmessage_modal_close_button:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getMessageHeaderTextView()Landroid/widget/TextView;
    .locals 1

    sget v0, Lcom/appboy/ui/R$id;->com_braze_inappmessage_modal_header_text:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public getMessageIconView()Landroid/widget/TextView;
    .locals 1

    sget v0, Lcom/appboy/ui/R$id;->com_braze_inappmessage_modal_icon:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public getMessageImageView()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->mInAppMessageImageView:Lcom/braze/ui/inappmessage/views/InAppMessageImageView;

    return-object v0
.end method

.method public getMessageTextView()Landroid/widget/TextView;
    .locals 1

    sget v0, Lcom/appboy/ui/R$id;->com_braze_inappmessage_modal_message:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object p2, p0, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->mInAppMessage:LxZ1;

    invoke-direct {p0, p1, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->resizeGraphicFrameIfAppropriate(Landroid/content/Context;LxZ1;)V

    return-void
.end method

.method public resetMessageMargins(Z)V
    .locals 3

    invoke-super {p0, p1}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->resetMessageMargins(Z)V

    sget v0, Lcom/appboy/ui/R$id;->com_braze_inappmessage_modal_image_layout:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->getMessageIconView()Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_1

    :cond_0
    if-eqz v0, :cond_1

    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {p1, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v1, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    sget p1, Lcom/appboy/ui/R$id;->com_braze_inappmessage_modal_text_layout:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, LzZ1;

    invoke-direct {v0, p0}, LzZ1;-><init>(Lcom/braze/ui/inappmessage/views/InAppMessageModalView;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setMessageBackgroundColor(I)V
    .locals 1

    sget v0, Lcom/appboy/ui/R$id;->com_braze_inappmessage_modal:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p1}, LDZ1;->k(Landroid/view/View;I)V

    return-void
.end method
