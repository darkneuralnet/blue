.class public final LEX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFO1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEX0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0003\u00a8\u0006\u000e"
    }
    d2 = {
        "LEX0;",
        "LFO1;",
        "Landroid/app/Activity;",
        "activity",
        "LwO1;",
        "inAppMessage",
        "Lcom/braze/ui/inappmessage/views/InAppMessageModalView;",
        "c",
        "",
        "isGraphic",
        "e",
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
.field public static final a:LEX0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LEX0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LEX0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LEX0;->a:LEX0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(LEX0;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, LEX0;->d(LEX0;Landroid/view/View;)V

    return-void
.end method

.method public static final d(LEX0;Landroid/view/View;)V
    .locals 8

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Li20;->s()Li20;

    move-result-object p1

    invoke-virtual {p1}, LwZ1;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object v0, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->d:Lk20$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, LEX0$b;->g:LEX0$b;

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-static {}, Li20;->s()Li20;

    move-result-object p0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Li20;->t(Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/app/Activity;LwO1;)Landroid/view/View;
    .locals 0

    invoke-virtual {p0, p1, p2}, LEX0;->c(Landroid/app/Activity;LwO1;)Lcom/braze/ui/inappmessage/views/InAppMessageModalView;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/app/Activity;LwO1;)Lcom/braze/ui/inappmessage/views/InAppMessageModalView;
    .locals 9

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inAppMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    move-object v0, p2

    check-cast v0, LxZ1;

    invoke-virtual {v0}, LsZ1;->Y()LZX1;

    move-result-object v1

    sget-object v3, LZX1;->b:LZX1;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v1, v3, :cond_0

    move v7, v4

    goto :goto_0

    :cond_0
    move v7, v5

    :goto_0
    invoke-virtual {p0, p1, v7}, LEX0;->e(Landroid/app/Activity;Z)Lcom/braze/ui/inappmessage/views/InAppMessageModalView;

    move-result-object p1

    invoke-virtual {p1, v2, v0}, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->applyInAppMessageParameters(Landroid/content/Context;LxZ1;)V

    invoke-static {v0}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->getAppropriateImageUrl(LKO1;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    move v4, v5

    :cond_2
    :goto_1
    if-nez v4, :cond_3

    invoke-static {v2}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appboy/Appboy;->getImageLoader()LeO1;

    move-result-object v1

    const-string v3, "applicationContext"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "imageUrl"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->getMessageImageView()Landroid/widget/ImageView;

    move-result-object v5

    const-string v3, "view.messageImageView"

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lw20;->i:Lw20;

    move-object v3, p2

    move-object v4, v6

    move-object v6, v8

    invoke-interface/range {v1 .. v6}, LeO1;->a(Landroid/content/Context;LwO1;Ljava/lang/String;Landroid/widget/ImageView;Lw20;)V

    :cond_3
    invoke-virtual {p1}, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->getFrameView()Landroid/view/View;

    move-result-object v1

    new-instance v2, LDX0;

    invoke-direct {v2, p0}, LDX0;-><init>(LEX0;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-interface {p2}, LwO1;->getBackgroundColor()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->setMessageBackgroundColor(I)V

    invoke-virtual {v0}, LsZ1;->x0()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->setFrameColor(Ljava/lang/Integer;)V

    invoke-virtual {v0}, LsZ1;->M()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->setMessageButtons(Ljava/util/List;)V

    invoke-virtual {v0}, LsZ1;->w0()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->setMessageCloseButtonColor(I)V

    if-nez v7, :cond_5

    invoke-interface {p2}, LwO1;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->setMessage(Ljava/lang/String;)V

    invoke-interface {p2}, LwO1;->J()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->setMessageTextColor(I)V

    invoke-virtual {v0}, LsZ1;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->setMessageHeaderText(Ljava/lang/String;)V

    invoke-virtual {v0}, LsZ1;->z0()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->setMessageHeaderTextColor(I)V

    invoke-interface {p2}, LwO1;->getIcon()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2}, LwO1;->g0()I

    move-result v2

    invoke-interface {p2}, LwO1;->p0()I

    move-result p2

    invoke-virtual {p1, v1, v2, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->setMessageIcon(Ljava/lang/String;II)V

    invoke-virtual {v0}, LsZ1;->y0()Ls06;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->setMessageHeaderTextAlignment(Ls06;)V

    invoke-virtual {v0}, LhZ1;->D()Ls06;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->setMessageTextAlign(Ls06;)V

    invoke-virtual {v0}, LFZ1;->u0()Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->resetMessageMargins(Z)V

    invoke-virtual {p1}, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->getMessageImageView()Landroid/widget/ImageView;

    move-result-object p2

    if-eqz p2, :cond_4

    check-cast p2, Lcom/braze/ui/inappmessage/views/InAppMessageImageView;

    const v1, 0x4039999a    # 2.9f

    invoke-virtual {p2, v1}, Lcom/braze/ui/inappmessage/views/InAppMessageImageView;->setAspectRatio(F)V

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageImageView"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    invoke-virtual {p1}, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;->getMessageCloseButtonView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->setLargerCloseButtonClickArea(Landroid/view/View;)V

    invoke-virtual {v0}, LsZ1;->M()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->setupDirectionalNavigation(I)V

    return-object p1
.end method

.method public final e(Landroid/app/Activity;Z)Lcom/braze/ui/inappmessage/views/InAppMessageModalView;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    const-string v0, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageModalView"

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/appboy/ui/R$layout;->com_braze_inappmessage_modal_graphic:I

    invoke-virtual {p1, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/appboy/ui/R$layout;->com_braze_inappmessage_modal:I

    invoke-virtual {p1, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast p1, Lcom/braze/ui/inappmessage/views/InAppMessageModalView;

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
