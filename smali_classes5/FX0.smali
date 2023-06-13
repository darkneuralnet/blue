.class public final LFX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFO1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "LFX0;",
        "LFO1;",
        "Landroid/app/Activity;",
        "activity",
        "LwO1;",
        "inAppMessage",
        "Lcom/braze/ui/inappmessage/views/InAppMessageSlideupView;",
        "b",
        "<init>",
        "()V",
        "android-sdk-ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/app/Activity;LwO1;)Landroid/view/View;
    .locals 0

    invoke-virtual {p0, p1, p2}, LFX0;->b(Landroid/app/Activity;LwO1;)Lcom/braze/ui/inappmessage/views/InAppMessageSlideupView;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/app/Activity;LwO1;)Lcom/braze/ui/inappmessage/views/InAppMessageSlideupView;
    .locals 11

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inAppMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/appboy/ui/R$layout;->com_braze_inappmessage_slideup:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, Lcom/braze/ui/inappmessage/views/InAppMessageSlideupView;

    invoke-static {v0}, LWt6;->h(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v3, Lk20;->a:Lk20;

    sget-object v5, Lk20$a;->g:Lk20$a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget-object v8, LFX0$a;->g:LFX0$a;

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object v4, p0

    invoke-static/range {v3 .. v10}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-object v2

    :cond_0
    move-object v1, p2

    check-cast v1, LBZ1;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageSlideupView;->applyInAppMessageParameters(LwO1;)V

    invoke-static {v1}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->getAppropriateImageUrl(LKO1;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-nez p1, :cond_3

    invoke-static {v3}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object p1

    invoke-virtual {p1}, Lcom/appboy/Appboy;->getImageLoader()LeO1;

    move-result-object v2

    const-string p1, "applicationContext"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "imageUrl"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/braze/ui/inappmessage/views/InAppMessageSlideupView;->getMessageImageView()Landroid/widget/ImageView;

    move-result-object v6

    const-string p1, "view.messageImageView"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lw20;->j:Lw20;

    move-object v4, p2

    invoke-interface/range {v2 .. v7}, LeO1;->a(Landroid/content/Context;LwO1;Ljava/lang/String;Landroid/widget/ImageView;Lw20;)V

    :cond_3
    invoke-virtual {v1}, LhZ1;->getBackgroundColor()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/braze/ui/inappmessage/views/InAppMessageSlideupView;->setMessageBackgroundColor(I)V

    invoke-virtual {v1}, LhZ1;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->setMessage(Ljava/lang/String;)V

    invoke-virtual {v1}, LhZ1;->J()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->setMessageTextColor(I)V

    invoke-virtual {v1}, LhZ1;->D()Ls06;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->setMessageTextAlign(Ls06;)V

    invoke-virtual {v1}, LhZ1;->getIcon()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, LhZ1;->g0()I

    move-result p2

    invoke-virtual {v1}, LhZ1;->p0()I

    move-result v2

    invoke-virtual {v0, p1, p2, v2}, Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;->setMessageIcon(Ljava/lang/String;II)V

    invoke-virtual {v1}, LBZ1;->w0()I

    move-result p1

    invoke-virtual {v1}, LhZ1;->P()LYj0;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/braze/ui/inappmessage/views/InAppMessageSlideupView;->setMessageChevron(ILYj0;)V

    invoke-virtual {v1}, LFZ1;->u0()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/braze/ui/inappmessage/views/InAppMessageSlideupView;->resetMessageMargins(Z)V

    return-object v0

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageSlideupView"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
