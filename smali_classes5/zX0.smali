.class public final LzX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFO1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LzX0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0007J \u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0002\u00a8\u0006\u0010"
    }
    d2 = {
        "LzX0;",
        "LFO1;",
        "Landroid/app/Activity;",
        "activity",
        "LwO1;",
        "inAppMessage",
        "Lcom/braze/ui/inappmessage/views/InAppMessageFullView;",
        "c",
        "",
        "isGraphic",
        "e",
        "view",
        "f",
        "<init>",
        "()V",
        "a",
        "android-sdk-ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final a:LzX0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LzX0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LzX0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LzX0;->a:LzX0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Landroid/view/View;Lcom/braze/ui/inappmessage/views/InAppMessageFullView;LnZ1;Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LzX0;->d(Landroid/view/View;Lcom/braze/ui/inappmessage/views/InAppMessageFullView;LnZ1;Landroid/content/Context;Landroid/view/View;)V

    return-void
.end method

.method public static final d(Landroid/view/View;Lcom/braze/ui/inappmessage/views/InAppMessageFullView;LnZ1;Landroid/content/Context;Landroid/view/View;)V
    .locals 4

    const-string v0, "$view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$inAppMessageFull"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    div-int/lit8 p0, p0, 0x2

    sget v0, Lcom/appboy/ui/R$id;->com_braze_inappmessage_full_text_and_button_content_parent:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v1, v0

    invoke-virtual {p2}, LsZ1;->M()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p2, "applicationContext"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/high16 v2, 0x4050000000000000L    # 64.0

    invoke-static {p3, v2, v3}, LWt6;->a(Landroid/content/Context;D)D

    move-result-wide p2

    double-to-int p2, p2

    add-int/2addr v1, p2

    :cond_0
    invoke-virtual {p4}, Landroid/view/View;->getHeight()I

    move-result p2

    sub-int/2addr p0, v1

    invoke-static {p2, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    const-string p2, "scrollView"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p0}, LWt6;->m(Landroid/view/View;I)V

    invoke-virtual {p4}, Landroid/view/View;->requestLayout()V

    invoke-virtual {p1}, Lcom/braze/ui/inappmessage/views/InAppMessageFullView;->getMessageImageView()Landroid/widget/ImageView;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public bridge synthetic a(Landroid/app/Activity;LwO1;)Landroid/view/View;
    .locals 0

    invoke-virtual {p0, p1, p2}, LzX0;->c(Landroid/app/Activity;LwO1;)Lcom/braze/ui/inappmessage/views/InAppMessageFullView;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/app/Activity;LwO1;)Lcom/braze/ui/inappmessage/views/InAppMessageFullView;
    .locals 11

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inAppMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    move-object v7, p2

    check-cast v7, LnZ1;

    invoke-virtual {v7}, LsZ1;->Y()LZX1;

    move-result-object v1

    sget-object v2, LZX1;->b:LZX1;

    const/4 v3, 0x0

    const/4 v8, 0x1

    if-ne v1, v2, :cond_0

    move v9, v8

    goto :goto_0

    :cond_0
    move v9, v3

    :goto_0
    invoke-virtual {p0, p1, v9}, LzX0;->e(Landroid/app/Activity;Z)Lcom/braze/ui/inappmessage/views/InAppMessageFullView;

    move-result-object v10

    invoke-virtual {v10, p1, v7, v9}, Lcom/braze/ui/inappmessage/views/InAppMessageFullView;->createAppropriateViews(Landroid/app/Activity;LAO1;Z)V

    invoke-static {v7}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->getAppropriateImageUrl(LKO1;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    move v3, v8

    :cond_2
    if-nez v3, :cond_3

    invoke-static {v0}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appboy/Appboy;->getImageLoader()LeO1;

    move-result-object v1

    const-string v2, "applicationContext"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "imageUrl"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10}, Lcom/braze/ui/inappmessage/views/InAppMessageFullView;->getMessageImageView()Landroid/widget/ImageView;

    move-result-object v5

    const-string v2, "view.messageImageView"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lw20;->k:Lw20;

    move-object v2, v0

    move-object v3, p2

    invoke-interface/range {v1 .. v6}, LeO1;->a(Landroid/content/Context;LwO1;Ljava/lang/String;Landroid/widget/ImageView;Lw20;)V

    :cond_3
    invoke-virtual {v10}, Lcom/braze/ui/inappmessage/views/InAppMessageFullView;->getFrameView()Landroid/view/View;

    move-result-object p2

    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v7}, LhZ1;->getBackgroundColor()I

    move-result p2

    invoke-virtual {v10, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageFullView;->setMessageBackgroundColor(I)V

    invoke-virtual {v7}, LsZ1;->x0()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v10, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->setFrameColor(Ljava/lang/Integer;)V

    invoke-virtual {v7}, LsZ1;->M()Ljava/util/List;

    move-result-object p2

    invoke-virtual {v10, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->setMessageButtons(Ljava/util/List;)V

    invoke-virtual {v7}, LsZ1;->w0()I

    move-result p2

    invoke-virtual {v10, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->setMessageCloseButtonColor(I)V

    if-nez v9, :cond_5

    invoke-virtual {v7}, LhZ1;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v10, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->setMessage(Ljava/lang/String;)V

    invoke-virtual {v7}, LhZ1;->J()I

    move-result p2

    invoke-virtual {v10, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->setMessageTextColor(I)V

    invoke-virtual {v7}, LsZ1;->E()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v10, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->setMessageHeaderText(Ljava/lang/String;)V

    invoke-virtual {v7}, LsZ1;->z0()I

    move-result p2

    invoke-virtual {v10, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->setMessageHeaderTextColor(I)V

    invoke-virtual {v7}, LsZ1;->y0()Ls06;

    move-result-object p2

    invoke-virtual {v10, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->setMessageHeaderTextAlignment(Ls06;)V

    invoke-virtual {v7}, LhZ1;->D()Ls06;

    move-result-object p2

    invoke-virtual {v10, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->setMessageTextAlign(Ls06;)V

    invoke-virtual {v7}, LFZ1;->u0()Z

    move-result p2

    invoke-virtual {v10, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageFullView;->resetMessageMargins(Z)V

    invoke-virtual {v10}, Lcom/braze/ui/inappmessage/views/InAppMessageFullView;->getMessageImageView()Landroid/widget/ImageView;

    move-result-object p2

    if-eqz p2, :cond_4

    check-cast p2, Lcom/braze/ui/inappmessage/views/InAppMessageImageView;

    invoke-virtual {p2, v8}, Lcom/braze/ui/inappmessage/views/InAppMessageImageView;->setToHalfParentHeight(Z)V

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageImageView"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    invoke-virtual {v10}, Lcom/braze/ui/inappmessage/views/InAppMessageFullView;->getMessageCloseButtonView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {v10, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->setLargerCloseButtonClickArea(Landroid/view/View;)V

    invoke-virtual {p0, p1, v7, v10}, LzX0;->f(Landroid/app/Activity;LwO1;Lcom/braze/ui/inappmessage/views/InAppMessageFullView;)Z

    invoke-virtual {v7}, LsZ1;->M()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {v10, p1}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->setupDirectionalNavigation(I)V

    sget p1, Lcom/appboy/ui/R$id;->com_braze_inappmessage_full_scrollview:I

    invoke-virtual {v10, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_6

    sget p2, Lcom/appboy/ui/R$id;->com_braze_inappmessage_full_all_content_parent:I

    invoke-virtual {v10, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    new-instance p2, LyX0;

    move-object v1, p2

    move-object v3, v10

    move-object v4, v7

    move-object v5, v0

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, LyX0;-><init>(Landroid/view/View;Lcom/braze/ui/inappmessage/views/InAppMessageFullView;LnZ1;Landroid/content/Context;Landroid/view/View;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_6
    return-object v10
.end method

.method public final e(Landroid/app/Activity;Z)Lcom/braze/ui/inappmessage/views/InAppMessageFullView;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageFullView"

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/appboy/ui/R$layout;->com_braze_inappmessage_full_graphic:I

    invoke-virtual {p1, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Lcom/braze/ui/inappmessage/views/InAppMessageFullView;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/appboy/ui/R$layout;->com_braze_inappmessage_full:I

    invoke-virtual {p1, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast p1, Lcom/braze/ui/inappmessage/views/InAppMessageFullView;

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Landroid/app/Activity;LwO1;Lcom/braze/ui/inappmessage/views/InAppMessageFullView;)Z
    .locals 2

    invoke-static {p1}, LWt6;->i(Landroid/app/Activity;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p2}, LwO1;->F()LCy3;

    move-result-object p1

    sget-object v1, LCy3;->d:LCy3;

    if-ne p1, v1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p3}, Lcom/braze/ui/inappmessage/views/InAppMessageFullView;->getLongEdge()I

    move-result p1

    invoke-virtual {p3}, Lcom/braze/ui/inappmessage/views/InAppMessageFullView;->getShortEdge()I

    move-result v1

    if-lez p1, :cond_3

    if-lez v1, :cond_3

    invoke-interface {p2}, LwO1;->F()LCy3;

    move-result-object p2

    sget-object v0, LCy3;->c:LCy3;

    if-ne p2, v0, :cond_2

    new-instance p2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {p2, p1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    goto :goto_0

    :cond_2
    new-instance p2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {p2, v1, p1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    :goto_0
    const/16 p1, 0xd

    const/4 v0, -0x1

    invoke-virtual {p2, p1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {p3}, Lcom/braze/ui/inappmessage/views/InAppMessageFullView;->getMessageBackgroundObject()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x1

    return p1

    :cond_3
    return v0
.end method
