.class public abstract Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;
.super Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;
.source "SourceFile"

# interfaces
.implements LBO1;


# static fields
.field private static final TAG:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;

    invoke-static {v0}, Lk20;->n(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic a(Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->lambda$setLargerCloseButtonClickArea$1(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->lambda$setupDirectionalNavigation$0(Landroid/view/View;)V

    return-void
.end method

.method private synthetic lambda$setLargerCloseButtonClickArea$1(Landroid/view/View;)V
    .locals 4

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p1, v0}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/appboy/ui/R$dimen;->com_braze_inappmessage_close_button_click_area_width:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/appboy/ui/R$dimen;->com_braze_inappmessage_close_button_click_area_height:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v3

    sub-int/2addr v1, v3

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v3

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    iget v3, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr v3, v2

    iput v3, v0, Landroid/graphics/Rect;->top:I

    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v2

    iput v3, v0, Landroid/graphics/Rect;->bottom:I

    iget v2, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v1

    iput v2, v0, Landroid/graphics/Rect;->left:I

    iget v2, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v1

    iput v2, v0, Landroid/graphics/Rect;->right:I

    new-instance v1, Landroid/view/TouchDelegate;

    invoke-direct {v1, v0, p1}, Landroid/view/TouchDelegate;-><init>(Landroid/graphics/Rect;Landroid/view/View;)V

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    return-void
.end method

.method private static synthetic lambda$setupDirectionalNavigation$0(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    return-void
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    invoke-static {}, Li20;->s()Li20;

    move-result-object v0

    invoke-virtual {v0}, LwZ1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LDZ1;->a()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public abstract getFrameView()Landroid/view/View;
.end method

.method public abstract getMessageButtonViews(I)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getMessageHeaderTextView()Landroid/widget/TextView;
.end method

.method public abstract getMessageTextView()Landroid/widget/TextView;
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-static {}, Li20;->s()Li20;

    move-result-object v0

    invoke-virtual {v0}, LwZ1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LDZ1;->a()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public resetMessageMargins(Z)V
    .locals 1

    invoke-super {p0, p1}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->resetMessageMargins(Z)V

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->getMessageTextView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LjS5;->g(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->getMessageTextView()Landroid/widget/TextView;

    move-result-object p1

    invoke-static {p1}, LWt6;->j(Landroid/view/View;)V

    :cond_0
    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->getMessageHeaderTextView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LjS5;->g(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->getMessageHeaderTextView()Landroid/widget/TextView;

    move-result-object p1

    invoke-static {p1}, LWt6;->j(Landroid/view/View;)V

    :cond_1
    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->getMessageTextView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->getMessageHeaderTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1, v0}, LDZ1;->b(Landroid/widget/TextView;Landroid/widget/TextView;)V

    return-void
.end method

.method public setFrameColor(Ljava/lang/Integer;)V
    .locals 1

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->getFrameView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p1}, LDZ1;->e(Landroid/view/View;Ljava/lang/Integer;)V

    return-void
.end method

.method public setLargerCloseButtonClickArea(Landroid/view/View;)V
    .locals 2

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    new-instance v1, LuZ1;

    invoke-direct {v1, p0, p1}, LuZ1;-><init>(Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void

    :cond_2
    :goto_0
    sget-object p1, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->TAG:Ljava/lang/String;

    const-string v0, "Cannot increase click area for view if view and/or parent are null."

    invoke-static {p1, v0}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setMessageButtons(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LmT2;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->getMessageButtonViews(I)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, LiZ1;->d(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public setMessageCloseButtonColor(I)V
    .locals 1

    invoke-interface {p0}, LBO1;->getMessageCloseButtonView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p1}, LDZ1;->k(Landroid/view/View;I)V

    return-void
.end method

.method public setMessageHeaderText(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->getMessageHeaderTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setMessageHeaderTextAlignment(Ls06;)V
    .locals 1

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->getMessageHeaderTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0, p1}, LDZ1;->h(Landroid/widget/TextView;Ls06;)V

    return-void
.end method

.method public setMessageHeaderTextColor(I)V
    .locals 1

    invoke-virtual {p0}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->getMessageHeaderTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0, p1}, LDZ1;->i(Landroid/widget/TextView;I)V

    return-void
.end method

.method public setupDirectionalNavigation(I)V
    .locals 6

    invoke-virtual {p0, p1}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->getMessageButtonViews(I)Ljava/util/List;

    move-result-object v0

    invoke-interface {p0}, LBO1;->getMessageCloseButtonView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v2

    const/4 v3, 0x1

    if-eqz p1, :cond_2

    const/4 v4, 0x0

    if-eq p1, v3, :cond_1

    const/4 v5, 0x2

    if-eq p1, v5, :cond_0

    sget-object v0, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Cannot setup directional navigation. Got unsupported number of buttons: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {p1, v5}, Landroid/view/View;->setNextFocusLeftId(I)V

    invoke-virtual {p1, v5}, Landroid/view/View;->setNextFocusRightId(I)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setNextFocusUpId(I)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setNextFocusDownId(I)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setNextFocusLeftId(I)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setNextFocusRightId(I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setNextFocusUpId(I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setNextFocusDownId(I)V

    invoke-virtual {v1, v4}, Landroid/view/View;->setNextFocusUpId(I)V

    invoke-virtual {v1, v4}, Landroid/view/View;->setNextFocusDownId(I)V

    invoke-virtual {v1, v4}, Landroid/view/View;->setNextFocusRightId(I)V

    invoke-virtual {v1, v5}, Landroid/view/View;->setNextFocusLeftId(I)V

    move-object v1, p1

    move v2, v4

    goto :goto_0

    :cond_1
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {p1, v2}, Landroid/view/View;->setNextFocusLeftId(I)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setNextFocusRightId(I)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setNextFocusUpId(I)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setNextFocusDownId(I)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setNextFocusUpId(I)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setNextFocusDownId(I)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setNextFocusRightId(I)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setNextFocusLeftId(I)V

    move-object v1, p1

    move v2, v0

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v2}, Landroid/view/View;->setNextFocusUpId(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setNextFocusDownId(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setNextFocusRightId(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setNextFocusLeftId(I)V

    :goto_0
    invoke-virtual {p0, v2}, Landroid/view/View;->setNextFocusUpId(I)V

    invoke-virtual {p0, v2}, Landroid/view/View;->setNextFocusDownId(I)V

    invoke-virtual {p0, v2}, Landroid/view/View;->setNextFocusRightId(I)V

    invoke-virtual {p0, v2}, Landroid/view/View;->setNextFocusLeftId(I)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_3

    invoke-static {v1, v3}, Lhq6;->a(Landroid/view/View;Z)V

    :cond_3
    new-instance p1, LtZ1;

    invoke-direct {p1, v1}, LtZ1;-><init>(Landroid/view/View;)V

    invoke-virtual {v1, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
