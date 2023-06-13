.class public final LAX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFO1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "LAX0;",
        "LFO1;",
        "Landroid/app/Activity;",
        "activity",
        "LwO1;",
        "inAppMessage",
        "Lcom/braze/ui/inappmessage/views/InAppMessageHtmlFullView;",
        "b",
        "LJO1;",
        "a",
        "LJO1;",
        "inAppMessageWebViewClientListener",
        "<init>",
        "(LJO1;)V",
        "android-sdk-ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final a:LJO1;


# direct methods
.method public constructor <init>(LJO1;)V
    .locals 1

    const-string v0, "inAppMessageWebViewClientListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAX0;->a:LJO1;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/app/Activity;LwO1;)Landroid/view/View;
    .locals 0

    invoke-virtual {p0, p1, p2}, LAX0;->b(Landroid/app/Activity;LwO1;)Lcom/braze/ui/inappmessage/views/InAppMessageHtmlFullView;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/app/Activity;LwO1;)Lcom/braze/ui/inappmessage/views/InAppMessageHtmlFullView;
    .locals 11
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "AddJavascriptInterface"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inAppMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/appboy/ui/R$layout;->com_braze_inappmessage_html_full:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlFullView;

    new-instance v1, LX10;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "activity.applicationContext"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v3}, LX10;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, LX10;->isTouchModeRequiredForHtmlInAppMessages()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LWt6;->h(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v3, Lk20;->a:Lk20;

    sget-object v5, Lk20$a;->g:Lk20$a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget-object v8, LAX0$a;->g:LAX0$a;

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object v4, p0

    invoke-static/range {v3 .. v10}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-object v2

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    move-object v1, p2

    check-cast v1, LrZ1;

    new-instance v2, LvZ1;

    const-string v3, "context"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p1, v1}, LvZ1;-><init>(Landroid/content/Context;LyO1;)V

    invoke-interface {p2}, LwO1;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, LqZ1;->U()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->setWebViewContent(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LEZ1;

    iget-object v3, p0, LAX0;->a:LJO1;

    invoke-direct {v1, p1, p2, v3}, LEZ1;-><init>(Landroid/content/Context;LwO1;LJO1;)V

    invoke-virtual {v0, v1}, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->setInAppMessageWebViewClient(LEZ1;)V

    invoke-virtual {v0}, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->getMessageWebView()Landroid/webkit/WebView;

    move-result-object p1

    const-string p2, "brazeInternalBridge"

    invoke-virtual {p1, v2, p2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageHtmlFullView"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
